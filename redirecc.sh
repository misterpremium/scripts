#/bin/sh
##############################################
#	 SCRIPT PARA GENERAR REDIRECCIONES		##
#		Realizado por Victor Stevez			##
##############################################



ahora=`date+"%Y%m%d.%H%M%S"`
hoy=`date+"%Y%m%d"`
dir_script=$(dirname "`readlink -f "$50"`")
filelog="/var/log/redir.log"
fileredirecc=$1
DIREJE=`pwd`
spin=`-\|/`
red=`\e[91m`;
blue=`\e[1;34m`;
green=`\e[92m`;
reset=`\033[0m`;
BOLD=`\033[1m`;


crearficherostemp ()
{
touch $DIREJE/especiales.csv
touch $DIREJE/puntoapunto.csv
touch $DIREJE/transformado.csv
touch $DIREJE/erroneas.csv



}
CargaExcell ()
{

	if [ -z $DIREJE/$fileredirecc ]
	then
		echo "ERROR: Este script necesita un parametro: Un fichero con el nombre de las plantillas"
		exit 20
	fi
	if [ ! -f $DIREJE/$fileredirecc ]
	then
		echo "ERROR: No exite el fichero $fileredirecc . No podemos continuar. "
		exit 30
	fi
}

Transformaexcell ()
{

cat /dev/null > $DIREJE/transformado.csv
  if [ $? -eq 0 ]
  then
  	  xls2csv -x $DIREJE/$fileredirecc -b WINDOWS-1252 -c "${fileredirecc}.csv" -a UTF-8 -q
  	  if [ $? -ne 0 ]
  	  then
  	  	  echo "Error: EL fichero excell $fileredirecc no pudo ser convertido a csv"
  	  	  continue;
  	  else
  	  	  fileredirecc="${fileredirecc}.csv"
  	  fi
  else
  	  echo "Encontrada plantilla en csv. No es necesario conversion..."
  fi
  dos2unix -q $DIREJE/$fileredirecc
  sed -i "$/;\"/;\n/" $DIREJE/$fileredirecc
  sed -ie 's/;301;/;/g' $DIREJE/$fileredirecc ##En caso de que haya ina columna 301, se elimina
  sed '/^$/d;URL/d' $DIREJE/$fileredirecc >> $DIREJE/$fileredirecc.csv
  totalineas=`wc -l $DIREJE/transformado.csv | awk "{printf $1}"`
}

DivideCSV () ### RASTREA TODO EL EXCELL Y ORDENA LOS TIPOS DE REDIRECCIONES , PUNTO A PUNTO, CON QUERYSTRING Y LAS QUE CONTENGAN CARACTERES ESPECIALES
{

cat /dev/null > $DIREJE/puntoapunto.csv
cat /dev/null > $DIREJE/erroneas.csv
cat /dev/null > $DIREJE/especiales.csv
VARQ=""
VARERR=""
progreso=1
while read line
do

if [ -z $line ] 2> /dev/null
then
continue;
else

if [[ ${line:0:3} == "www" ]] ##esto normaliza las redirecciones por si no vienen con http
	then

	line="http://"${line}	
	fi


COLUMNA1=`echo $lien | grep -v "URL" | awk -F ";" '{print $1}'`
VARQ=`echo $COLUMNA1 | grep "?"`
VAERR=`echo	$line | grep -e "*" -e "%"`
fi
				i=$(( (i+1) %4))
				sleep .1
				printf "\rRastreando y normalizando plantilla \e[1m ${spin:$i:1} 		${progreso}/${totalineas}\e[0m"
	if [ -z $VARQ ] 2>/dev/null
		then 
			if [ -z $VARERR	]
			then 
				echo $line >> puntoapunto.csv
			else
			echo $VARERR >> erroneas.csv
		fi
	else 
		if [ -z $VARERR	]
			then 
			echo $line >> especiales.csv
			else
				echo $VARERR >> erroneas.csv
			fi
	fi
progreso=$((progreso +1 ))
done < $DIREJE/transformado.csv

printf "\rRastreando y normalizando plantilla:\e[1m  OK\e[0m"

}





Redirecciones ()
{
##Primero redirecciones punto a punto
ESPACIO=0
cat /dev/null > $DIREJE/IM.conf
			echo "####REDIRECCIONES PUNTO A PUNTO" > $DIREJE/IM.conf
			echo "" >> $DIREJE/IM.conf
			spin='-\|/'
	echo ""

			i=0
			progrso=1
			totalineas=`wc -l $DIREJE/puntoapunto.csv | awk '{printf $1}'`
			while read line
					do
					COLUMNA1R=""
					COLUMNA1=`echo $line | grep -v "URL" | awk -F ";" '{printf $1}'`
					COLUMNA2=`echo $line| awk -F ";" '{printf $2}'`
					DOMINIO=`echo COLUMNA1 | awk -F "/" '{printf $3}'`
					ESPACIO=`echo $COLUMNA1 | grep \  |wc -l`
					REDIRE=`echo $COLUMNA1 | awk -F $DOMINIO '{print $2}' 2> /dev/null`
						if [ -z $REDIRE ] 2> /dev/null
							then
							continue;
						else
							if [ $ESPACIO -eq 0] ##COMPRUEBA SI EXISTEN ESPACIOS EN BLANCO EN LA REDIRECCION, LA CREARA ENTRE ""
								then
							COLUMNA1R=`echo "^"$REDIRE`"$"
							 	else
							COLUMNA1R= `echo '"^'$REDIRE'"'`
							fi
						fi
						if [ "$opciona" = "S" ] || [ "$opciona" = "s" ] ; then
						echo "RewriteCond %{HTTP_HOST} =" $DOMINIO >> $DIREJE/IM.conf
					fi

				echo "RewriteRule "$COLUMNA1R $COLUMNA2 "[R=301,L]" >> $DIREJE/IM.conf
				echo "" >> $DIREJE/IM.conf
			i=$(( (i+1) %4))
			sleep .1
			printf "\r\e[0mGenerando rdirecciones punto a punto \e[1m ${spin:$i:1}  ${progreso}/${totallineas}\e[0m"
		progreso=$((progreso +1 ))


		done < $DIREJE/puntoapunto.csv

		printf "\rGenerando redireciones punto a punto:\e[1m OK\e[0m"


		##REDIRECCIONES QUERYSTRING
		echo "" >>$DIREJE/IM.conf
		echo "" >>$DIREJE/IM:conf
		echo "###REDIRECCIOENS CON QUERY STRING" >> $DIREJE/IM.conf
		echo "" >>$DIREJE/IM.conf
i=0
echo""
progreso=1
ESPACIO=0
totalineas=`wc -l $DIREJE/especiales.csv | awk '{print $1}'`
	while read line
			do
			if [ -z $line ] 2> /dev/null
			then
			continue;
		else
		COLUMNA1=`echo $line | grep -v "URL" | awk -F ";" '{printf $1}'`
		COLUMNA2=`echo $line | awk -F ";" '{print $2}'`
		DOMINIO=`echo $COLUMNA1 | awk -F "/" '{print $3}'`
		REDIRE= `echo $COLUMNA1 | awk -F $DOMINIO '{print $2}' 2>/dev/null`
		REDIRE= `echo $REDIRE | awk -F "?" '{print $1}' 2>/dev/null`
		QUERY=`echo $COLUMNA1 | awk -F "?" '{print $2}' 2>/dev/null`



						if [ "$opcionb" = "S" ] || [ "$opcionb" = "s" ] ; then
						echo "RewriteCond %{HTTP_HOST} ="$DOMINIO >> $DIREJE/IM.conf
					fi
		i=$(( (i+1) %4 ))
			sleep .1
			printf "\r\e[0mGenerando redirecciones querystring ${spin:$i:1}  \e[1m${progreso}/${totalineas}\e[0m"

		echo "RewriteCond %{QUERY_STRING} ^"$QUERY >> /$DIREJE/IM.conf

		echo "RewriteRule ^"$REDIRE"$" $COLUMNA2"?" "[R=301,L]" >> $DIREJE/IM.conf
		progreso=$((progreso + 1))
		echo "">> $DIREJE/IM.conf
	fi

	done < $DIREJE/especiales.csv

	printf "\eGenerando redirecciones QUERY STRING: \e[1m OK \e[0m"
	echo ""
}






compruebaerroneas ()
{
if [ -z $opcionar ]
	then
		opcionar=`date + "%Y%m%d.%H%M%S"`
	fi


if [[ -s $DIREJE/erroneas.csv ]]
then
erroneas=`wc -l $DIREJE/erroneas.csv | awk '{print $1}' `
echo ""
echo "###################################################"
echo "###################################################"
echo ""
echo ""
echo -e "Existen ${BOLD}"$erroneas " ${reset}redirecciones que requieren revision manual ${red}" $DIREJE/$opcionar/opconar.revisar.txt "${reset}"


fi
echo -e "Archivo de redirecciones creado con exito!!!! ${green} 		" $DIREJE/$opcionar/opcionar.conf"${reset}"
}

generaarchivo ()

{

if [ -z $opcionar]
	then 
		opcionar=`date + "%Y%m%d.%H%M%S"`
	fi
mkdir $DIREJE/$opcionar 2> /dev/null
mkdir $DIREJE/$opcionar/data 2> /dev/null
cp $DIREJE/IM.conf $DIREJE/$OPCIONAR/$opcionar.conf
cp $DIREJE/erroneas.csv $DIREJE/$opcionar/$opcionar.revisar.txt
mv $DIREJE/especiales.csv $DIREJE/$opcioanr/data
mv $DIREJE/puntoapunto.csv $DIREJE/$opcioanr/data
mv $DIREJE/transformado.csv $DIREJE/$opcioanr/data
mv $DIREJE/erroneas.csv $DIREJE/$opcioanr/data
mv $DIREJE/$fileredirecc* $DIREJE/$opcionar/data
rm $DIREJE/IM.conf
echo ""


}

verificasintaxis ()
{

if [ -z $fileredirecc ]
then
			echo -e "Este script requiere como parametro meter el nombre del excel Ej, ${BOLD}/redirecc.sh IM162008.xls${reset}"
			exit 12
else
continue;

fi

}


limpiahistorico ()
{
	find $direje -maxdepth 1 -type d -mtime +7 ! -path "./prueba" !  -path "./historico" -exec mv {} $DIREJE/historico \; 2>/dev/null

}




##LLAMADAS A FUNCIONES

opcionar=""
echo ""
verificasintaxis
read -p "introduce el numero de la peticion:" opcionar
CargaExcell
read -p "Las redirecciones punto a punto necesitan RewriteCond %{HTTP_HOST}??? (S/N)" opciona
read -p "Las redirecciones con Query string  necesitan RewriteCond %{HTTP_HOST}??? (S/N)" opcionb
echo ""
crearficherostemp
Transformaexcell
DivideCSV
Redirecciones
compruebaerroneas
generaarchivo
limpiahistorico
echo ""

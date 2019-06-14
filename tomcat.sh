if [ $1 == "desp" ]
	then 

	echo "Desplegar el archivo" $2
	if [[ $2 == *.war ]]
	then	
		echo "El nombre del archivo es correcto"
		mv /home/dani/$2 /opt/apache-tomcat-7.0.77/webapps
	else 
		echo "Nombre d efichero no váĺido"
	fi

	
elif [ $1 == "undep" ]
	then

	echo "El archivo a undeploy es" $1
	echo "¿Es correcto?(s/n)"
	var=` ls /opt/apache-tomcat-7.0.77/webapps | grep "$1"`
	read var2
	if [[ $var2 == "s" ]]
	then 
		echo "Comprobando la existencia de $1"
		if [[ $var == $1 ]]
		then 
			rm /opt/apache-tomcat-7.0.77/webapps/$1
		else 
			echo "No existe el .war indicado"
		fi
	elif [[ $var2 == "n" ]]
	then 
		echo "Saliste"
	else 
		echo "Valor no válido"
	fi 
else 
	echo "./tomcat.sh <desp|undep> nombrearcgivo.war"
fi

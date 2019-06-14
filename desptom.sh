
echo "Desplegar el archivo" $1
if [[ $1 == *.war ]]
then	
	echo "El nombre del archivo es correcto"
	mv /home/dani/$1 /opt/apache-tomcat-7.0.77/webapps
else 
	echo "Nombre d efichero no váĺido"
fi

	



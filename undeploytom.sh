echo "El archivo a undeploy es" $1
#echo "¿Es correcto?(s/n)"
var1 = $(ls /opt/apache-tomcat-7.0.77/webapps | grep "$1")
#read var2
#if [[ $var2 == s ]]
#then 
	if [[ $var3 == $1 ]]
	then 
		rm /opt/apache-tomcat-7.0.77/webapps/$1
	else 
		echo "No existe el .war indicado"
	fi
#elif
#then 
#else 
#echo "Valor no válido"
#fi
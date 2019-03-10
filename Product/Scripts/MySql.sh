container_name="mysql"
root_password="AdminAdmin"
user=$1
password=$2
database="coins_for_fun"

docker run -d \
	--name=$container_name \
	-e MYSQL_ROOT_PASSWORD=$root_password \
	-e MYSQL_USER=$user \
	-e MYSQL_PASSWORD=$password \
	-e MYSQL_DATABASE=$database \
	-v /home/Sql:/docker-entrypoint-initdb.d \
	-p 3306:3306 \
	mysql
	
	
#container_name="mysql"
#root_password="AdminAdmin"
#user="AAA"
#password="BBB"
#database="coins_for_fun"
	
#docker run -d -v /home/Sql:/docker-entrypoint-initdb.d --name=$container_name -e MYSQL_ROOT_PASSWORD=$root_password -e MYSQL_USER=$user -e MYSQL_PASSWORD=$password -e MYSQL_DATABASE=$database mysql
#docker run -v /home/Sql:/docker-entrypoint-initdb.d --name=$container_name -e MYSQL_ROOT_PASSWORD=$root_password -e MYSQL_USER=$user -e MYSQL_PASSWORD=$password -e MYSQL_DATABASE=$database mysql
#docker run -it --link mysql:mysql --rm mysql sh -c 'exec mysql -h"$MYSQL_PORT_3306_TCP_ADDR" -P"$MYSQL_PORT_3306_TCP_PORT" -uroot -p"$MYSQL_ENV_MYSQL_ROOT_PASSWORD"'
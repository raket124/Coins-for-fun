#!/usr/bin/env bash

#sudo docker run --name mysql-database -e MYSQL_ROOT_PASSWORD=dummie -d mysql

#docker run -d mongo
#mongoimport --db dbName --collection collectionName --file data.json --jsonArray


#sudo docker run --name some-mysql -e MYSQL_ROOT_PASSWORD=pass -d mysql
#sudo docker run -it --link mysql-database:mysql --rm mysql sh -c 'exec mysql -h"$MYSQL_PORT_3306_TCP_ADDR" -P"$MYSQL_PORT_3306_TCP_PORT" -uroot -p"$MYSQL_ENV_MYSQL_ROOT_PASSWORD"'
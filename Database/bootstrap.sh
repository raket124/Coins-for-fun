#!/usr/bin/env bash

docker run -d mongo
#mongoimport --db dbName --collection collectionName --file data.json --jsonArray
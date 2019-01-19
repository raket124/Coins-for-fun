#!/usr/bin/env bash

server_ip=$1
client_name=$2
public_ip="$(ifconfig eth1 | awk -F ' *|:' '/inet addr/{print $4}')"

docker run -d --name=consul-client --net=host -e CONSUL_CLIENT_INTERFACE=eth1 -e CONSUL_BIND_INTERFACE=eth1 consul agent -node=$client_name -retry-join=$server_ip

consul_connector="consul://${public_ip}:8500"
docker run -d --name=registrator --net=host --volume=/var/run/docker.sock:/tmp/docker.sock gliderlabs/registrator $consul_connector
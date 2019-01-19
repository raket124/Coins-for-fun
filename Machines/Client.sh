#!/usr/bin/env bash

server_ip=$1
client_name=$2

docker run -d --name=consul-client --net=host -e CONSUL_CLIENT_INTERFACE=eth1 -e CONSUL_BIND_INTERFACE=eth1 consul agent -node=$client_name -retry-join=$server_ip
#!/usr/bin/env bash

container_name="consul-server"
network_interface="enp0s8"
node_name=$1
server_ip=$2

docker run -d \
	--name=$container_name \
	--net=host \
	-e CONSUL_CLIENT_INTERFACE=$network_interface \
	-e CONSUL_BIND_INTERFACE=$network_interface \
	consul \
	agent \
	-node=$node_name \
	-retry-join=$server_ip
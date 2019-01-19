#!/usr/bin/env bash

docker run -d --name=consul-server --net=host -e CONSUL_CLIENT_INTERFACE=eth1 -e CONSUL_BIND_INTERFACE=eth1 consul agent -server -node=Server -ui -bootstrap
#!/usr/bin/env bash

#Update machine
apt-get update

#Install docker
wget -qO- https://get.docker.com/ | sh

#Pull images
docker pull consul
#docker pull gliderlabs/registrator

#!/usr/bin/env bash

apt-get update
wget -qO- https://get.docker.com/ | sh

docker pull consul
docker pull gliderlabs/registrator
docker pull jetty:9.4-jre11
docker pull openjdk:11-jdk
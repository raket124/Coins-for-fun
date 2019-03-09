#!/usr/bin/env bash

default_ip="127.0.0.1"
network_interface="enp0s8"
network_ip="$(ifconfig ${network_interface} | awk -F ' *|:' '/inet addr/{print $4}')"

sed -i -- "s/$default_ip/$network_ip/g" /etc/hosts
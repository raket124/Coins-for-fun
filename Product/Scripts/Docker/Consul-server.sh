container_name="consul-server"
network_interface="enp0s8"
node_name="Server"

docker run -d \
	--name=$container_name \
	--net=host \
	-e CONSUL_CLIENT_INTERFACE=$network_interface \
	-e CONSUL_BIND_INTERFACE=$network_interface \
	consul \
	agent \
	-server \
	-node=$node_name \
	-ui \
	-bootstrap
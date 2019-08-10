container_name="registrator"

docker run -d \
	--name=$container_name \
	--net=host \
	--volume=/var/run/docker.sock:/tmp/docker.sock \
	gliderlabs/registrator \
	consul://localhost:8500
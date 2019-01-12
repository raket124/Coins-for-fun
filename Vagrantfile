# -*- mode: ruby -*-
# vi: set ft=ruby :
Vagrant.configure(2) do |config|
	config.vm.box = "ubuntu/trusty64"
	config.vm.network "private_network", type: "dhcp"
  	config.vm.provider "virtualbox" do |vb|
		vb.memory = 2048
		vb.cpus = 1
	end
	
	config.vm.provision :shell, path: "Machines/Bootstrap.sh"

	config.vm.define :Database do |database|
		database.vm.provision :shell, path: "Machines/Database/bootstrap.sh"
		#database.vm.provision :file, source: "Machines/Database/Sql", destination: "Sql"
		#database.vm.provision :file, source: "Machines/Database/Data", destination: "Data"
	end

	#config.vm.define :Middleware do |middleware|
		#middleware.vm.provision :shell, inline: "echo Middleware"
	#end

	#config.vm.define :Webserver do |webserver|
		#webserver.vm.provision :shell, inline: "echo WebServer"
	#end
end
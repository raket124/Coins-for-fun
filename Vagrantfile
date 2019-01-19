# -*- mode: ruby -*-
# vi: set ft=ruby :

server_ip = "192.168.50.4"

Vagrant.configure(2) do |config|
	config.vm.box = "ubuntu/trusty64"
  	config.vm.provider "virtualbox" do |vb|
		vb.memory = 2048
		vb.cpus = 1
	end

	config.vm.provision :shell, :path => "Machines/Bootstrap.sh"

	config.vm.define :Watchdog do |wd|
		wd.vm.provision :shell, :path => "Machines/Server.sh"
		
		wd.vm.network :private_network, :ip => server_ip
		wd.vm.network :forwarded_port, :guest => 8500, :host => 8500 
	end
	
	config.vm.define :Database do |db|
		db.vm.provision :shell, :path => "Machines/Client.sh", :args => [server_ip, "Database"]

		db.vm.network :private_network, :type => "dhcp"
	end

	config.vm.define :Middleware do |mw|
		mw.vm.provision :shell, :path => "Machines/Client.sh", :args => [server_ip, "Middleware"]
		
		mw.vm.network :private_network, :type => "dhcp"
	end

	config.vm.define :Webserver do |ws|
		ws.vm.provision :shell, :path => "Machines/Client.sh", :args => [server_ip, "Webserver"]

		ws.vm.network :private_network, :type => "dhcp"
	end
end
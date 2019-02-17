echo oracle-java11-installer shared/accepted-oracle-license-v1-2 select true | sudo /usr/bin/debconf-set-selections
add-apt-repository ppa:linuxuprising/java -y
apt-get update
apt-get install oracle-java11-installer -y

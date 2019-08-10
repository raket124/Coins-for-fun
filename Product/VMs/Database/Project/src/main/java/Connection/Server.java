public class Server {
    private String ip;
    private String port;
    private String username;
    private String password;

    public Server(String ip, String port, String username, String password) {
        this.ip = ip;
        this.port = port;
        this.username = username;
        this.password = password;
    }

    public String GetIp() {
        return this.ip;
    }

    public String GetPort() {
        return this.port;
    }

    public String GetUsername() {
        return this.username;
    }

    public String GetPassword(){
        return this.password;
    }
}

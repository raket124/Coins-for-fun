public class MySql extends Server {
    private String database;

    public MySql(String ip, String database, String username, String password) {
        super(ip, "3306", username, password);
        this.database = database;
    }

    public String GetDatabase() {
        return this.database;
    }
}

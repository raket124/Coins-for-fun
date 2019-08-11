package Data;

public class Singleton {
    private static DataSource dataSource;
    private static Type type;

    private Singleton() { }

    public static DataSource DataSource() {
        if(Singleton.dataSource == null) {
            Singleton.InitDataSource();
        }
        return Singleton.dataSource;
    }

    private static void InitDataSource() {
        switch(Singleton.type) {
            case Static:
                Singleton.dataSource = new Data.Sources.Static();
                break;
            case MySql:
                Singleton.dataSource = new Data.Sources.MySql();
                break;
        }
    }

    public static void Clear() {
        Singleton.dataSource = null;
    }

    public static void SetType(Type type) {
        if(Singleton.type != type) {
            Singleton.type = type;
            Singleton.Clear();
        }
    }
}

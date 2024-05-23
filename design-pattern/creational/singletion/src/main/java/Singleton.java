import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Singleton {
    private static Singleton singleton;
    private Connection con;

    private Singleton() throws SQLException {
        con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Rio",
                "root",
                "1234"
        );
    }

    public static Singleton getInstance() throws SQLException {
        return (null == singleton) ? singleton = new Singleton()
                : singleton;
    }
    public Connection getConnection() {
        return con;
    }
}

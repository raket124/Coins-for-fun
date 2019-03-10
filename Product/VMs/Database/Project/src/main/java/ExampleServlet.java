import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.http.HttpStatus;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;

import java.io.*;
import java.net.*;
import java.util.*;

import java.sql.*;

public class ExampleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            String connectionInfo = GetConnectionInfo("172.28.128.3", "coins_for_fun", "Player_1", "Player_2");
            resp.getWriter().println(connectionInfo);

            String connectionString = GetConnectionString("172.28.128.3", "coins_for_fun");

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(connectionString, "Player_1", "Player_2");
            //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coins_for_fun","Player_1","Player_2");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Users");
            while(rs.next()) {
                String output = rs.getInt(1) + " | " +
                                rs.getString(2) + " | " +
                                rs.getString(5) + " | " +
                                rs.getString(6) + " | " +
                                rs.getString(8);
                resp.getWriter().println(output);
            }
            con.close();
        }
        catch (Exception e) {
            resp.getWriter().println(e.toString());
        }

        resp.setStatus(HttpStatus.OK_200);
    }

    private String GetDatabaseInfo() {
        return "";
    }

    private String GetTableInfo() {
        return "";
    }

    private String GetConnectionInfo(String ip, String database, String username, String password) {
        return String.format(
            "Ip:         %s\n" +
            "Database:   %s\n" +
            "Username:   %s\n" +
            "Password:   %s\n" +
            "Connection: %s\n",
            ip, database, username, password, GetConnectionString(ip, database)
        );
    }

    private String GetConnectionString(String ip, String database) {
        return String.format("jdbc:mysql://%s:3306/%s?sslMode=DISABLED", ip, database);
    }
}

package com.wecp.progressive.config;
import java.sql.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DatabaseConnectionManager {
    public static final Properties properties = new Properties();
    static{
        loadProperties();
         }
            private static void loadProperties() {
                try(InputStream input = DatabaseConnectionManager.class.getClassLoader().getResourceAsStream("application.properties"))
                {
                    if(input == null)
                    {
                        throw new IllegalStateException("resourse.properties not found in classpath");
                    }
                    properties.load(input);
                }catch(IOException e)
                {
                    throw new RuntimeException("Error loading properties file", e);
                }
            }
            public static Connection getConnection() throws SQLException
            {
                String url = properties.getProperty("spring.datasource.url");
                String user = properties.getProperty("spring.datasource.user");
                String password = properties.getProperty("spring.datasource.password");
                return DriverManager.getConnection(url,user,password);
            }
}

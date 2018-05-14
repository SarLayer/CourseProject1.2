package by.bntu.fitr.povt.sunRevival.login;

import by.bntu.fitr.povt.sunRevival.Logic.God;
import by.bntu.fitr.povt.sunRevival.Logic.Logic;
import by.bntu.fitr.povt.sunRevival.Logic.entity.Decoration;

import java.sql.*;

public class ConnectionProvider {
    static Connection connection;
    static PreparedStatement ps;
    static String url = "jdbc:mysql://localhost:3306/logindb?autoReconnect=true&useSSL=false";
    static String username = "root";
    static String password = "rootmyroot";
    
    public static boolean login(Customer c) throws ClassNotFoundException, SQLException {
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            
        } catch (ClassNotFoundException e) {
        
        
        }
        try {
            connection = DriverManager.getConnection(url, username, password);
            
            
        } catch (SQLException e) {
            
        
        }
        
        
        try {
            
            
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM customer");
            
            
            while (resultSet.next()) {
                
                
                if (resultSet.getString(1).equals(c.getLogin())) {
                    for (int i = 3; i <= Logic.getMaxCount() + 2; i++) {
                        if (resultSet.getString(i) != null) {
                            
                            Logic.addRE(i - 2, God.greate(resultSet.getString(i)));
                            
                        }
                    }
                    for (Decoration d : Logic.getDictionary().values()
                            ) {
                        System.out.println(d);
                        
                    }
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println("exception");
            e.printStackTrace();
            
        }
        return false;
    }
    
    public int insertCustomer(Customer c) throws ClassNotFoundException, SQLException {
        
        
        Class.forName("com.mysql.jdbc.Driver");
        
        
        try {
            connection = DriverManager.getConnection(url, username, password);
            
            
        } catch (SQLException e) {
        
        }
        try {
            
            Statement statement = connection.createStatement();
            
            
            ps = connection.prepareStatement("INSERT  INTO customer(login, password) VALUES (?,?)");
            
            ps.setString(1, c.getLogin());
            ps.setString(2, c.getPassword());
            ps.executeUpdate();
            
            
        } catch (Exception e) {
        
        }
        return 0;
    }
    
    public boolean Search(String username) {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            
        } catch (ClassNotFoundException e) {
        
        
        }
        try {
            connection = DriverManager.getConnection(url, username, password);
            
            
        } catch (SQLException e) {
        
        
        }
        
        
        try {
            
            
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM customer");
            
            
            while (resultSet.next()) {
                
                if (resultSet.getString(1).equals(username)) {
                    for (int i = 3; i <= Logic.getMaxCount() + 2; i++) {
                        if (resultSet.getString(i) != null) {
                            System.out.println(i - 2 + " " + God.greate(resultSet.getString(i)));
                            Logic.addSearch(i - 2, God.greate(resultSet.getString(i)));
                            
                        }
                    }
                    
                    return true;
                }
            }
        } catch (Exception e) {
        
        
        }
        return false;
    }
    
    public int insertDecoration(int count, String decoration, Customer c) throws ClassNotFoundException, SQLException {
        
        
        Class.forName("com.mysql.jdbc.Driver");
        
        
        try {
            connection = DriverManager.getConnection(url, username, password);
            
            
        } catch (SQLException e) {
        
        }
        try {
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM customer");
            
            
            while (resultSet.next()) {
                
                if (c.equals(resultSet.getString(1))) {
                }
            }
            if (count == 1) {
                ps = connection.prepareStatement("update customer SET 1col = (?) where login =(?) ");
                ps.setString(1, decoration);
                ps.setString(2, c.getLogin());
                ps.executeUpdate();
            }
            if (count == 2) {
                ps = connection.prepareStatement("update customer SET 2col = (?) where login =(?) ");
                ps.setString(1, decoration);
                ps.setString(2, c.getLogin());
                ps.executeUpdate();
            }
            if (count == 3) {
                ps = connection.prepareStatement("update customer SET 3col = (?) where login =(?) ");
                ps.setString(1, decoration);
                ps.setString(2, c.getLogin());
                ps.executeUpdate();
            }
            if (count == 4) {
                ps = connection.prepareStatement("update customer SET 4col = (?) where login =(?) ");
                ps.setString(1, decoration);
                ps.setString(2, c.getLogin());
                ps.executeUpdate();
            }
            if (count == 5) {
                ps = connection.prepareStatement("update customer SET 5col = (?) where login =(?) ");
                ps.setString(1, decoration);
                ps.setString(2, c.getLogin());
                ps.executeUpdate();
            }
            if (count == 6) {
                ps = connection.prepareStatement("update customer SET 6col = (?) where login =(?) ");
                ps.setString(1, decoration);
                ps.setString(2, c.getLogin());
                ps.executeUpdate();
            }
            if (count == 7) {
                ps = connection.prepareStatement("update customer SET 7col = (?) where login =(?) ");
                ps.setString(1, decoration);
                ps.setString(2, c.getLogin());
                ps.executeUpdate();
            }
            if (count == 8) {
                ps = connection.prepareStatement("update customer SET 8col = (?) where login =(?) ");
                ps.setString(1, decoration);
                ps.setString(2, c.getLogin());
                ps.executeUpdate();
            }
            if (count == 9) {
                ps = connection.prepareStatement("update customer SET 9col = (?) where login =(?) ");
                ps.setString(1, decoration);
                ps.setString(2, c.getLogin());
                ps.executeUpdate();
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("wertre");
        }
        return 0;
    }
    
    
    public int deleteDecoration(int count, Customer c) throws ClassNotFoundException, SQLException {
        
        
        Class.forName("com.mysql.jdbc.Driver");
        
        
        try {
            connection = DriverManager.getConnection(url, username, password);
            
            
        } catch (SQLException e) {
        
        }
        try {
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM customer");
            
            
            while (resultSet.next()) {
                
                if (c.equals(resultSet.getString(1))) {
                }
            }
            if (count == 1) {
                ps = connection.prepareStatement("update customer SET 1col = (?) where login =(?) ");
                ps.setString(1, null);
                ps.setString(2, c.getLogin());
                ps.executeUpdate();
            }
            if (count == 2) {
                ps = connection.prepareStatement("update customer SET 2col = (?) where login =(?) ");
                ps.setString(1, null);
                ps.setString(2, c.getLogin());
                ps.executeUpdate();
            }
            if (count == 3) {
                ps = connection.prepareStatement("update customer SET 3col = (?) where login =(?) ");
                ps.setString(1, null);
                ps.setString(2, c.getLogin());
                ps.executeUpdate();
            }
            if (count == 4) {
                ps = connection.prepareStatement("update customer SET 4col = (?) where login =(?) ");
                ps.setString(1, null);
                ps.setString(2, c.getLogin());
                ps.executeUpdate();
            }
            if (count == 5) {
                ps = connection.prepareStatement("update customer SET 5col = (?) where login =(?) ");
                ps.setString(1, null);
                ps.setString(2, c.getLogin());
                ps.executeUpdate();
            }
            if (count == 6) {
                ps = connection.prepareStatement("update customer SET 6col = (?) where login =(?) ");
                ps.setString(1, null);
                ps.setString(2, c.getLogin());
                ps.executeUpdate();
            }
            if (count == 7) {
                ps = connection.prepareStatement("update customer SET 7col = (?) where login =(?) ");
                ps.setString(1, null);
                ps.setString(2, c.getLogin());
                ps.executeUpdate();
            }
            if (count == 8) {
                ps = connection.prepareStatement("update customer SET 8col = (?) where login =(?) ");
                ps.setString(1, null);
                ps.setString(2, c.getLogin());
                ps.executeUpdate();
            }
            if (count == 9) {
                ps = connection.prepareStatement("update customer SET 9col = (?) where login =(?) ");
                ps.setString(1, null);
                ps.setString(2, c.getLogin());
                ps.executeUpdate();
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("wertre");
        }
        return 0;
    }
}
    
    

        
        

package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateConnection {
    public Connection connectionCreate() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Mysql Driver loaded");


            String url = "jdbc:mysql://localhost:3306/mydb";
            String username = "root";
            String password = "Akshay@123";

            con = DriverManager.getConnection(url, username, password);

            if (con.isClosed()) {
                System.out.println("Connection is Closed");
            } else {
                System.out.println("Connection is Opened");

            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return con;
    }

    public void closeConnection(Connection con) {
        try {
            con.close();
            System.out.println("Connection closed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void createTable(Connection con) {

        try {
            String query = "create table myTable4 (tId int(20) primary key auto_increment, tName varchar(200) not null , tCity varchar(400))";
            Statement st = con.createStatement();
            st.execute(query);
            System.out.println("Table created successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void insertData(Connection con) {
        String Tablename="mytable4";
        String values = "('Akshay', 'Aurangabad')";
        String query ="insert into " + Tablename + " (tName, tCity) values " + values + ";";
        try {
            Statement st = con.createStatement();
            st.execute(query);
            System.out.println("Data Inserted Successfully");
        }catch (Exception e)
        {
            System.out.println(e);
        }

    }

    public void updateData(Connection con) {
        String query = "update mytable4 set tname='Akshay' where tId=3";

        try {
            Statement st = con.createStatement();
            st.execute(query);
            System.out.println("Table Updated Successfully");
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }

public void deleteData(Connection con) {

        String query = "delete from mytable4 where tId=2";
        try {
            Statement st = con.createStatement();
            st.execute(query);
            System.out.println("Row deleted Successfully");
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

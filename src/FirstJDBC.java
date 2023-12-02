import java.sql.Connection;
import java.sql.DriverManager;

public class FirstJDBC {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        try {
            //load drivers
            Class.forName("com.mysql.cj.jdbc.Driver");
            //create connection

            String url="jdbc:mysql://localhost:3306/mydb";
            String username="root";
            String password="Akshay@123";

            Connection con = DriverManager.getConnection(url,username,password);

            if(con.isClosed()){
                System.out.println("Connection is Closed");
            }else {
                System.out.println("Connection is Opened");
            }

            //create statement
            //fire query
            //process data
            //close connection
        }catch (Exception e)
        {

            System.out.println(e);
        }
    }
}
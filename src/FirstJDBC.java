import DatabaseConnection.CreateConnection;

import java.sql.Connection;

public class FirstJDBC {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        try {
            CreateConnection cc = new CreateConnection();

            Connection con = cc.connectionCreate();
//            cc.createTable(con);
            cc.insertData(con);
            cc.closeConnection(con);

        }catch (Exception e)
        {
            System.out.println(e);
        }
    }


}
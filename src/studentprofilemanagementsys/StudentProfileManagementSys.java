
package studentprofilemanagementsys;


import java.sql.*;

public class StudentProfileManagementSys {

    public static void main(String[] args) throws SQLException, ClassNotFoundException 
    {
        Login frame = new Login();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); 
    }
}

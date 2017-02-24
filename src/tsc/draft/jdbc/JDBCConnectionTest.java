package tsc.draft.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author JDBC test with Oracle database
 */
public class JDBCConnectionTest {

   public static void main(String args[]) {
      Driver d = null;
      Connection con = null;
      Statement stmt = null;
      ResultSet rs = null;

      try {
         d = (Driver) Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
         System.out.println("Got driver");
         con = DriverManager.getConnection("jdbc:oracle:thin:@atpds1.fr.net.intra:1521:ATPDEV01", "D536355", "D536355");

         System.out.println("Got Connection");

         stmt = con.createStatement();
         System.out.println("Statement object created");
         rs = stmt.executeQuery("select * from GRP_USER");
         while (rs.next()) {

            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
            System.out.println(rs.getString(2) + "  " + rs.getString(3));
         }

         con.close();

      } catch (IllegalAccessException e) {
         System.out.println("in IllegalAccess exception");
         e.printStackTrace(System.out);

      } catch (ClassNotFoundException e) {
         System.out.println("in class not Found exception");
         e.printStackTrace(System.out);

      } catch (SQLException e) {
         System.out.println("in SQLException exception");
         e.printStackTrace(System.out);

      } catch (Exception e) {
         System.out.println("in exception");
         e.printStackTrace(System.out);
      }
   }

}

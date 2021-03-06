package connection;
import java.sql.*;
 
/**
 * Clase que permite conectar con la base de datos
 * @author chenao
 *
 */
public class DbConnection {
   /**Parametros de conexion*/
   static String bd = "alumnes";
   static String login = "root";
   static String password = "root";
   static String url = "jdbc:mysql://localhost:3306/"+bd;
 
   Connection connection = null;
 
   /** Constructor de DbConnection */
   public DbConnection() {
      try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver").newInstance();
         //obtenemos la conexi�n
         connection = DriverManager.getConnection(url,login,password);
 
         if (connection!=null){
            
         }
      }
      catch(SQLException e){
         System.out.println(e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }catch(Exception e){
         System.out.println(e);
      }
   }
   /**Permite retornar la conexi�n*/
   public Connection getConnection(){
      return connection;
   }
 
   public void desconectar(){
      connection = null;
   }
}
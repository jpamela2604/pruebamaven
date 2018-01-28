/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosWeb;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Pamela Palacios
 */
@WebService(serviceName = "Servicio1")
public class Servicio1 {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        /*ejemplo de conexion a mysql*/
        String palabra="";
        try{
            
            Connection con = null;            
            //String sURL = "jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10199094";
            /*ejemplo=nombre de la base de datos*/
            String sURL = "jdbc:mysql://localhost:3306/ejemplo";
            /* usuario, contrase;a*/
            con = (Connection) DriverManager.getConnection(sURL, "root", "");
            
            Statement s=(Statement) con.createStatement();
            ResultSet respuesta = s.executeQuery ("select * from nueva where numero=1;");
            respuesta.next();
            palabra="devolvio "+respuesta.getString("valor");
            
        }
        catch(SQLException e)
        {            
            palabra="No se pudo conectar a la base de datos "+e;
        }
        
        
        /*fin de ejemplo de conexion a mysql*/
        
        
        return "Hello " +palabra;
    }
}

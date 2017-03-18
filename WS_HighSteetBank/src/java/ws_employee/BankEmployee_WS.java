/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws_employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Kalana
 */
@WebService(serviceName = "BankEmployee_WS")
public class BankEmployee_WS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    @WebMethod(operationName = "AddEmployee")
    public String AddEmployee(@WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "name") String name, @WebParam(name = "position") String position)  {
        

                    String sql = "INSERT INTO EMPLOYEE VALUES('"+username+"','"+password+"','"+name+"','"+position+"')";
                    connectionDB(sql);

                    return "a";
                    
               
        
    }
    
    
    
    
   
    
  
}

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
    
    
       @WebMethod(operationName = "EditEmployee")
    public String EditEmployee(@WebParam(name = "oldUsername") String oldUsername, @WebParam(name = "username") String username, @WebParam(name = "password")
            String password,
            @WebParam(name = "fullName") String fullName, @WebParam(name = "Position") String Position){

            String sql = "UPDATE EMPLOYEE SET USERNAME ='"+username+"',PASSWORD='"+password+"',NAME='"+fullName+"',POSITION='"+Position+"' WHERE USERNAME ='"+oldUsername+"'";
            connectionDB(sql);
            return "a";
   
        
        
    }
    
        @WebMethod(operationName = "deleteEmployee")
     public String DeleteEmployee(@WebParam(name = "username") String username) {
       
                    String sql = "DELETE FROM EMPLOYEE WHERE USERNAME = '"+username+"'";
                    connectionDB(sql);
                    return "a";
               
        
    }
    
    
    // db connection 
    public void connectionDB(String sql) {
        try{
    }
    
  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws_customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Nanayakkara
 */
@WebService(serviceName = "BanKCustomer")
public class BanKCustomer {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     * @return String array
     */
    @WebMethod(operationName = "Retrive_Customer")
    public java.lang.String[] Retrive_Customer(@WebParam(name = "passCode") String passCode) {
        //TODO write your implementation code here:
        
        try{
            String host = "jdbc:derby://localhost:1527/highStreetbank";
                    String userN = "highStreetbank";
                    String passw = "highStreetbank123";
                  
                    Connection conn = DriverManager.getConnection(host,userN,passw);
                     
                    Statement st = conn.createStatement();        
                    String sql = "SELECT NAME , ACCOUNTNUMBER FROM customer";
                    ResultSet rs = st.executeQuery(sql);
                    ArrayList<String> list=new ArrayList<String>();//Creating arraylist.
                    
                    
        }catch(SQLException err){
                    System.out.println(err.getMessage());
                    return null;
        }
    }
    
    

    

    
}

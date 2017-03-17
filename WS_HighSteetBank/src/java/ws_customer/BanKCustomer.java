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
                    while(rs.next()){
                            String name = rs.getString("NAME");
                            String accountNo = rs.getString("ACCOUNTNUMBER");
                            String coll = name + " : " + accountNo;
                            System.out.println(coll);
                            list.add(coll);
                    }
                    String[] dataSet = new String[list.size()];
                    for(int x=0;x<list.size();x++){
                        dataSet[x]=list.get(x);
                    }
                    return dataSet;
                    
        }catch(SQLException err){
                    System.out.println(err.getMessage());
                    return null;
        }
    }
    
    // db connection 
    public void connectionDB(String sql) {
        try{
            String host = "jdbc:derby://localhost:1527/highStreetbank";
                    String user = "highStreetbank";
                    String pass = "highStreetbank123";
                    Connection conn = DriverManager.getConnection(host,user,pass);
                    conn.createStatement().execute(sql);
                    conn.close();
                    } catch (Exception e) {
         System.err.println(e.getMessage());
                    }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Addcustomer")
    public String Addcustomer(@WebParam(name = "Name") String Name, @WebParam(name = "DOB") String DOB, @WebParam(name = "Address") String Address, @WebParam(name = "MobileNo") 
            String MobileNo, @WebParam(name = "Email") String Email, @WebParam(name = "AccountNo") String AccountNo, @WebParam(name = "AccountType") String AccountType,
            @WebParam(name = "SortCode") String SortCode, @WebParam(name = "Balance") String Balance, @WebParam(name = "card") String card) {
        //TODO write your implementation code here:
        String sql = "INSERT INTO customer VALUES('"+Name+"','"+DOB+"','"+Address+"','"+MobileNo+"','"+Email+"','"+AccountNo+
                "','"+AccountType+"','"+SortCode+"','"+Balance+"','"+card+"')";
                    connectionDB(sql);

                    return "a";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "EditCustomer")
    public String EditCustomer(@WebParam(name = "Name") String Name, @WebParam(name = "DOB") String DOB, @WebParam(name = "Address") String Address, @WebParam(name = "MobileNo") String MobileNo, @WebParam(name = "Email") String Email, @WebParam(name = "AccountNo") String AccountNo, @WebParam(name = "AccountType") String AccountType, @WebParam(name = "SortCode") String SortCode, @WebParam(name = "Balance") String Balance, @WebParam(name = "card") String card) {
        //TODO write your implementation code here:
        
         String sql = "UPDATE CUSTOMER SET NAME ='"+Name+"',BIRTHDATE='"+DOB+"',ADDRESS='"+Address+"',MOBILENO='"+MobileNo+
                 "',EMAIL ='"+Email+"',ACCOUNTNUMBER ='"+AccountNo+"',ACCOUNTTYPE='"+AccountType+"',SORTCODE='"+SortCode+"',BALANCE='"+Balance+"',CARD='"+card+
                 "' WHERE ACCOUNTNUMBER ='"+AccountNo+"'";
            connectionDB(sql);
            return "a";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "deleteCustomer")
    public String deleteCustomer(@WebParam(name = "AccountNumber") String AccountNumber) {
        //TODO write your implementation code here:
         String sql = "DELETE FROM CUSTOMER WHERE ACCOUNTNUMBER = '"+AccountNumber+"'";
                    connectionDB(sql);
         return "a";
    }
}

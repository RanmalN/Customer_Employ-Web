
package ws_employee;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws_employee package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteEmployeeResponse_QNAME = new QName("http://ws_employee/", "deleteEmployeeResponse");
    private final static QName _LoginResponse_QNAME = new QName("http://ws_employee/", "loginResponse");
    private final static QName _ConnectionDBResponse_QNAME = new QName("http://ws_employee/", "connectionDBResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://ws_employee/", "helloResponse");
    private final static QName _AddEmployee_QNAME = new QName("http://ws_employee/", "AddEmployee");
    private final static QName _Hello_QNAME = new QName("http://ws_employee/", "hello");
    private final static QName _EditEmployeeResponse_QNAME = new QName("http://ws_employee/", "EditEmployeeResponse");
    private final static QName _AddEmployeeResponse_QNAME = new QName("http://ws_employee/", "AddEmployeeResponse");
    private final static QName _EditEmployee_QNAME = new QName("http://ws_employee/", "EditEmployee");
    private final static QName _DeleteEmployee_QNAME = new QName("http://ws_employee/", "deleteEmployee");
    private final static QName _ConnectionDB_QNAME = new QName("http://ws_employee/", "connectionDB");
    private final static QName _Login_QNAME = new QName("http://ws_employee/", "login");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws_employee
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteEmployeeResponse }
     * 
     */
    public DeleteEmployeeResponse createDeleteEmployeeResponse() {
        return new DeleteEmployeeResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link AddEmployee }
     * 
     */
    public AddEmployee createAddEmployee() {
        return new AddEmployee();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link ConnectionDBResponse }
     * 
     */
    public ConnectionDBResponse createConnectionDBResponse() {
        return new ConnectionDBResponse();
    }

    /**
     * Create an instance of {@link EditEmployeeResponse }
     * 
     */
    public EditEmployeeResponse createEditEmployeeResponse() {
        return new EditEmployeeResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link ConnectionDB }
     * 
     */
    public ConnectionDB createConnectionDB() {
        return new ConnectionDB();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link DeleteEmployee }
     * 
     */
    public DeleteEmployee createDeleteEmployee() {
        return new DeleteEmployee();
    }

    /**
     * Create an instance of {@link EditEmployee }
     * 
     */
    public EditEmployee createEditEmployee() {
        return new EditEmployee();
    }

    /**
     * Create an instance of {@link AddEmployeeResponse }
     * 
     */
    public AddEmployeeResponse createAddEmployeeResponse() {
        return new AddEmployeeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_employee/", name = "deleteEmployeeResponse")
    public JAXBElement<DeleteEmployeeResponse> createDeleteEmployeeResponse(DeleteEmployeeResponse value) {
        return new JAXBElement<DeleteEmployeeResponse>(_DeleteEmployeeResponse_QNAME, DeleteEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_employee/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionDBResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_employee/", name = "connectionDBResponse")
    public JAXBElement<ConnectionDBResponse> createConnectionDBResponse(ConnectionDBResponse value) {
        return new JAXBElement<ConnectionDBResponse>(_ConnectionDBResponse_QNAME, ConnectionDBResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_employee/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_employee/", name = "AddEmployee")
    public JAXBElement<AddEmployee> createAddEmployee(AddEmployee value) {
        return new JAXBElement<AddEmployee>(_AddEmployee_QNAME, AddEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_employee/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_employee/", name = "EditEmployeeResponse")
    public JAXBElement<EditEmployeeResponse> createEditEmployeeResponse(EditEmployeeResponse value) {
        return new JAXBElement<EditEmployeeResponse>(_EditEmployeeResponse_QNAME, EditEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_employee/", name = "AddEmployeeResponse")
    public JAXBElement<AddEmployeeResponse> createAddEmployeeResponse(AddEmployeeResponse value) {
        return new JAXBElement<AddEmployeeResponse>(_AddEmployeeResponse_QNAME, AddEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_employee/", name = "EditEmployee")
    public JAXBElement<EditEmployee> createEditEmployee(EditEmployee value) {
        return new JAXBElement<EditEmployee>(_EditEmployee_QNAME, EditEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_employee/", name = "deleteEmployee")
    public JAXBElement<DeleteEmployee> createDeleteEmployee(DeleteEmployee value) {
        return new JAXBElement<DeleteEmployee>(_DeleteEmployee_QNAME, DeleteEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionDB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_employee/", name = "connectionDB")
    public JAXBElement<ConnectionDB> createConnectionDB(ConnectionDB value) {
        return new JAXBElement<ConnectionDB>(_ConnectionDB_QNAME, ConnectionDB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_employee/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

}

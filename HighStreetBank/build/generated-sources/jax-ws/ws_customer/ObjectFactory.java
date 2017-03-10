
package ws_customer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws_customer package. 
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

    private final static QName _ConnectionDBResponse_QNAME = new QName("http://ws_customer/", "connectionDBResponse");
    private final static QName _AddcustomerResponse_QNAME = new QName("http://ws_customer/", "AddcustomerResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://ws_customer/", "helloResponse");
    private final static QName _EditCustomerResponse_QNAME = new QName("http://ws_customer/", "EditCustomerResponse");
    private final static QName _RetriveCustomer_QNAME = new QName("http://ws_customer/", "Retrive_Customer");
    private final static QName _Addcustomer_QNAME = new QName("http://ws_customer/", "Addcustomer");
    private final static QName _RetriveCustomerResponse_QNAME = new QName("http://ws_customer/", "Retrive_CustomerResponse");
    private final static QName _DeleteCustomerResponse_QNAME = new QName("http://ws_customer/", "deleteCustomerResponse");
    private final static QName _EditCustomer_QNAME = new QName("http://ws_customer/", "EditCustomer");
    private final static QName _ConnectionDB_QNAME = new QName("http://ws_customer/", "connectionDB");
    private final static QName _Hello_QNAME = new QName("http://ws_customer/", "hello");
    private final static QName _DeleteCustomer_QNAME = new QName("http://ws_customer/", "deleteCustomer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws_customer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Addcustomer }
     * 
     */
    public Addcustomer createAddcustomer() {
        return new Addcustomer();
    }

    /**
     * Create an instance of {@link EditCustomerResponse }
     * 
     */
    public EditCustomerResponse createEditCustomerResponse() {
        return new EditCustomerResponse();
    }

    /**
     * Create an instance of {@link RetriveCustomer }
     * 
     */
    public RetriveCustomer createRetriveCustomer() {
        return new RetriveCustomer();
    }

    /**
     * Create an instance of {@link AddcustomerResponse }
     * 
     */
    public AddcustomerResponse createAddcustomerResponse() {
        return new AddcustomerResponse();
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
     * Create an instance of {@link DeleteCustomer }
     * 
     */
    public DeleteCustomer createDeleteCustomer() {
        return new DeleteCustomer();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link EditCustomer }
     * 
     */
    public EditCustomer createEditCustomer() {
        return new EditCustomer();
    }

    /**
     * Create an instance of {@link ConnectionDB }
     * 
     */
    public ConnectionDB createConnectionDB() {
        return new ConnectionDB();
    }

    /**
     * Create an instance of {@link RetriveCustomerResponse }
     * 
     */
    public RetriveCustomerResponse createRetriveCustomerResponse() {
        return new RetriveCustomerResponse();
    }

    /**
     * Create an instance of {@link DeleteCustomerResponse }
     * 
     */
    public DeleteCustomerResponse createDeleteCustomerResponse() {
        return new DeleteCustomerResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionDBResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_customer/", name = "connectionDBResponse")
    public JAXBElement<ConnectionDBResponse> createConnectionDBResponse(ConnectionDBResponse value) {
        return new JAXBElement<ConnectionDBResponse>(_ConnectionDBResponse_QNAME, ConnectionDBResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddcustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_customer/", name = "AddcustomerResponse")
    public JAXBElement<AddcustomerResponse> createAddcustomerResponse(AddcustomerResponse value) {
        return new JAXBElement<AddcustomerResponse>(_AddcustomerResponse_QNAME, AddcustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_customer/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_customer/", name = "EditCustomerResponse")
    public JAXBElement<EditCustomerResponse> createEditCustomerResponse(EditCustomerResponse value) {
        return new JAXBElement<EditCustomerResponse>(_EditCustomerResponse_QNAME, EditCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetriveCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_customer/", name = "Retrive_Customer")
    public JAXBElement<RetriveCustomer> createRetriveCustomer(RetriveCustomer value) {
        return new JAXBElement<RetriveCustomer>(_RetriveCustomer_QNAME, RetriveCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Addcustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_customer/", name = "Addcustomer")
    public JAXBElement<Addcustomer> createAddcustomer(Addcustomer value) {
        return new JAXBElement<Addcustomer>(_Addcustomer_QNAME, Addcustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetriveCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_customer/", name = "Retrive_CustomerResponse")
    public JAXBElement<RetriveCustomerResponse> createRetriveCustomerResponse(RetriveCustomerResponse value) {
        return new JAXBElement<RetriveCustomerResponse>(_RetriveCustomerResponse_QNAME, RetriveCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_customer/", name = "deleteCustomerResponse")
    public JAXBElement<DeleteCustomerResponse> createDeleteCustomerResponse(DeleteCustomerResponse value) {
        return new JAXBElement<DeleteCustomerResponse>(_DeleteCustomerResponse_QNAME, DeleteCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_customer/", name = "EditCustomer")
    public JAXBElement<EditCustomer> createEditCustomer(EditCustomer value) {
        return new JAXBElement<EditCustomer>(_EditCustomer_QNAME, EditCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionDB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_customer/", name = "connectionDB")
    public JAXBElement<ConnectionDB> createConnectionDB(ConnectionDB value) {
        return new JAXBElement<ConnectionDB>(_ConnectionDB_QNAME, ConnectionDB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_customer/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_customer/", name = "deleteCustomer")
    public JAXBElement<DeleteCustomer> createDeleteCustomer(DeleteCustomer value) {
        return new JAXBElement<DeleteCustomer>(_DeleteCustomer_QNAME, DeleteCustomer.class, null, value);
    }

}

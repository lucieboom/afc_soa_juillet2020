
package fr.afcepf.tp;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CalculTvaImplService", targetNamespace = "http://tp.afcepf.fr/", wsdlLocation = "http://form292:8080/ws/tva?wsdl")
public class CalculTvaImplService
    extends Service
{

    private final static URL CALCULTVAIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException CALCULTVAIMPLSERVICE_EXCEPTION;
    private final static QName CALCULTVAIMPLSERVICE_QNAME = new QName("http://tp.afcepf.fr/", "CalculTvaImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://form292:8080/ws/tva?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALCULTVAIMPLSERVICE_WSDL_LOCATION = url;
        CALCULTVAIMPLSERVICE_EXCEPTION = e;
    }

    public CalculTvaImplService() {
        super(__getWsdlLocation(), CALCULTVAIMPLSERVICE_QNAME);
    }

    public CalculTvaImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALCULTVAIMPLSERVICE_QNAME, features);
    }

    public CalculTvaImplService(URL wsdlLocation) {
        super(wsdlLocation, CALCULTVAIMPLSERVICE_QNAME);
    }

    public CalculTvaImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCULTVAIMPLSERVICE_QNAME, features);
    }

    public CalculTvaImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalculTvaImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CalculTva
     */
    @WebEndpoint(name = "CalculTvaImplPort")
    public CalculTva getCalculTvaImplPort() {
        return super.getPort(new QName("http://tp.afcepf.fr/", "CalculTvaImplPort"), CalculTva.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalculTva
     */
    @WebEndpoint(name = "CalculTvaImplPort")
    public CalculTva getCalculTvaImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://tp.afcepf.fr/", "CalculTvaImplPort"), CalculTva.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALCULTVAIMPLSERVICE_EXCEPTION!= null) {
            throw CALCULTVAIMPLSERVICE_EXCEPTION;
        }
        return CALCULTVAIMPLSERVICE_WSDL_LOCATION;
    }

}

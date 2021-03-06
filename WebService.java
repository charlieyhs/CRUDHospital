
package ServerClient;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import javax.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@jakarta.jws.WebService(name = "webService", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebService {


    /**
     * 
     * @param carlos
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://ws/", className = "ServerClient.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://ws/", className = "ServerClient.HelloResponse")
    @Action(input = "http://ws/webService/helloRequest", output = "http://ws/webService/helloResponse")
    public String hello(
        @WebParam(name = "Carlos", targetNamespace = "")
        String carlos);

}

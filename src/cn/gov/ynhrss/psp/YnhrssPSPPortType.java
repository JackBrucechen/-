
package cn.gov.ynhrss.psp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "YnhrssPSPPortType", targetNamespace = "http://www.ynhrss.gov.cn/psp")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface YnhrssPSPPortType {


    /**
     * 
     * @param parameters
     */
    @WebMethod(operationName = "YnhrssPSPOP", action = "ynhrssPSPOP")
    public void ynhrssPSPOP(
        @WebParam(name = "pspenv", targetNamespace = "http://www.ynhrss.gov.cn/psp", mode = WebParam.Mode.INOUT, partName = "parameters")
        Holder<Pspenv> parameters);

}

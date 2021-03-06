
package com.google.api.ads.dfp.jaxws.v201408;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for creating, updating and retrieving {@link LineItem}
 *       objects.
 *       
 *       <p>Line items define the campaign. For example, line items define:
 *       <ul>
 *       <li>a budget
 *       <li>a span of time to run
 *       <li>ad unit targeting
 *       </ul>
 *       
 *       <p>In short, line items connect all of the elements of an ad campaign.
 *       
 *       <p>Line items and creatives can be associated with each other through
 *       {@link LineItemCreativeAssociation} objects. An ad unit will host a creative
 *       through both this association and the {@link LineItem#targeting} to it.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "LineItemServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LineItemServiceInterface {


    /**
     * 
     *         Creates new {@link LineItem} objects.
     *         
     *         @param lineItems the line items to create
     *         @return the created line items with their IDs filled in
     *       
     * 
     * @param lineItems
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201408.LineItem>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408")
    @RequestWrapper(localName = "createLineItems", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408", className = "com.google.api.ads.dfp.jaxws.v201408.LineItemServiceInterfacecreateLineItems")
    @ResponseWrapper(localName = "createLineItemsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408", className = "com.google.api.ads.dfp.jaxws.v201408.LineItemServiceInterfacecreateLineItemsResponse")
    public List<LineItem> createLineItems(
        @WebParam(name = "lineItems", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408")
        List<LineItem> lineItems)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link LineItemPage} of {@link LineItem} objects that satisfy the
     *         given {@link Statement#query}. The following fields are supported for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code costType}</td>
     *         <td>{@link LineItem#costType}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link LineItem#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lineItemType}</td>
     *         <td>{@link LineItem#lineItemType}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link LineItem#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code orderId}</td>
     *         <td>{@link LineItem#orderId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link LineItem#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code unitsBought}</td>
     *         <td>{@link LineItem#unitsBought}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code deliveryRateType}</td>
     *         <td>{@link LineItem#deliveryRateType}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link LineItem#lastModifiedDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code creationDateTime}</td>
     *         <td>{@link LineItem#creationDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code isMissingCreatives}</td>
     *         <td>{@link LineItem#isMissingCreatives}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of line items.
     *         @return the line items that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201408.LineItemPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408")
    @RequestWrapper(localName = "getLineItemsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408", className = "com.google.api.ads.dfp.jaxws.v201408.LineItemServiceInterfacegetLineItemsByStatement")
    @ResponseWrapper(localName = "getLineItemsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408", className = "com.google.api.ads.dfp.jaxws.v201408.LineItemServiceInterfacegetLineItemsByStatementResponse")
    public LineItemPage getLineItemsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link LineItem} objects that match the given
     *         {@link Statement#query}.
     *         
     *         @param lineItemAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of line items
     *         @return the result of the action performed
     *       
     * 
     * @param filterStatement
     * @param lineItemAction
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201408.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408")
    @RequestWrapper(localName = "performLineItemAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408", className = "com.google.api.ads.dfp.jaxws.v201408.LineItemServiceInterfaceperformLineItemAction")
    @ResponseWrapper(localName = "performLineItemActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408", className = "com.google.api.ads.dfp.jaxws.v201408.LineItemServiceInterfaceperformLineItemActionResponse")
    public UpdateResult performLineItemAction(
        @WebParam(name = "lineItemAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408")
        LineItemAction lineItemAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link LineItem} objects.
     *         
     *         @param lineItems the line items to update
     *         @return the updated line items
     *       
     * 
     * @param lineItems
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201408.LineItem>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408")
    @RequestWrapper(localName = "updateLineItems", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408", className = "com.google.api.ads.dfp.jaxws.v201408.LineItemServiceInterfaceupdateLineItems")
    @ResponseWrapper(localName = "updateLineItemsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408", className = "com.google.api.ads.dfp.jaxws.v201408.LineItemServiceInterfaceupdateLineItemsResponse")
    public List<LineItem> updateLineItems(
        @WebParam(name = "lineItems", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408")
        List<LineItem> lineItems)
        throws ApiException_Exception
    ;

}

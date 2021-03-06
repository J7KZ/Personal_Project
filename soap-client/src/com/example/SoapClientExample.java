package com.example;

import javax.xml.soap.*;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;

public class SoapClientExample
{
	private  boolean  belavia      = true;
	
    private  String   namespaceURI = null;    
    private  String   soapUrl      = null;
    private  String   serviceName  = null;

    private  String   namespace    = null;
    private  String   soapAction   = null;

    private  boolean  useXSLT      = true;
    
	public SoapClientExample()
	{
		setSoapParams();
		callSoapWebService(soapUrl, soapAction);
	}
	private void setSoapParams()
	{
	/*    namespaceURI = "http://speller.yandex.net";
        soapUrl      = "http://speller.yandex.net/services/spellservice";
        serviceName  = "op=test";*/
	/*	if (belavia) {
		    namespaceURI = "http://webservices.belavia.by";
		    soapUrl      = "http://86.57.245.235/TimeTable/Service.asmx";
		    serviceName  = "GetAirportsList";  
		} else {*/
		    namespaceURI = "http://tempuri.org";
		    soapUrl      = "http://www.dneonline.com/calculator.asmx";
		    serviceName  = "Add";
		//}
	    namespace  = "ns"; // Namespace";
	    soapAction = namespaceURI + "/" + serviceName;
	}
    private void createSoapEnvelope(SOAPMessage soapMessage) throws SOAPException 
    {
       
        
        SOAPPart soapPart = soapMessage.getSOAPPart();

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration(namespace, namespaceURI);
/*
            Constructed SOAP Request Message:
            <SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/"
                               xmlns:myNamespace="http://www.webserviceX.NET">
                <SOAP-ENV:Header/>
                <SOAP-ENV:Body>
                    <myNamespace:GetInfoByCity>
                        <myNamespace:USCity>New York</myNamespace:USCity>
                    </myNamespace:GetInfoByCity>
                </SOAP-ENV:Body>
            </SOAP-ENV:Envelope>
*/
        
       /* <soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
        <soap:Body>
          <Add xmlns="http://tempuri.org/">
            <intA>int</intA>
            <intB>int</intB>
          </Add>
        </soap:Body>
      </soap:Envelope>        
*/
        // SOAP Body
        SOAPBody soapBody = envelope.getBody();
    	SOAPElement soapBodyElem;
    	SOAPElement soapBodyElem1;
        if (belavia) {
        	soapBody.addChildElement(serviceName, namespace);
/*
        	serviceName = "GetTimeTable"; 
        	soapBodyElem  = soapBody.addChildElement(serviceName, namespace);
        	soapBodyElem1 = soapBodyElem.addChildElement("Airport", namespace);
        	soapBodyElem1.addTextNode("AER");

        	SOAPElement soapBodyElem2 = soapBodyElem.addChildElement("Type", namespace);
        	soapBodyElem2.addTextNode("Departure");
        	
        	SOAPElement soapBodyElem3 = soapBodyElem.addChildElement("ViewDate", namespace);
        	soapBodyElem3.addTextNode("2017-10-13");
*/
        } else {
        	soapBodyElem  = soapBody.addChildElement(serviceName, namespace);
        	soapBodyElem1 = soapBodyElem.addChildElement("USCity", namespace);
        	soapBodyElem1.addTextNode("New York");
        }
    }
	private SOAPMessage createSOAPRequest(String soapAction) throws Exception
	{
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();

        createSoapEnvelope(soapMessage);

        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", soapAction);

        soapMessage.saveChanges();

        // Печать XML текста запроса
        System.out.println("Request SOAP Message:");
        soapMessage.writeTo(System.out);
        System.out.println("\n");

        return soapMessage;
    }	
    private void callSoapWebService(String destination, String soapAction) 
    {
    	SOAPConnectionFactory soapFactory  = null;
    	SOAPConnection        soapConnect  = null;
    	SOAPMessage           soapRequest  = null;
    	SOAPMessage           soapResponse = null;
        try {
            // Создание SOAP Connection
        	soapFactory = SOAPConnectionFactory.newInstance();
            soapConnect = soapFactory.createConnection();

            // Создание SOAP Message для отправки
            soapRequest  = createSOAPRequest(soapAction);
            //Получение SOAP Message
            soapResponse = soapConnect.call(soapRequest, destination);

            if (!useXSLT) {
            	// Печать SOAP Response
            	System.out.println("Response SOAP Message:");
            	soapResponse.writeTo(System.out);
            	System.out.println();
            } else
            	printSOAPMessage (soapResponse);

            soapConnect.close();
        } catch (Exception e) {
            System.err.println("\nError occurred while sending SOAP Request to Server!\n"
            		         + "Make sure you have the correct endpoint URL and SOAPAction!\n");
            e.printStackTrace();
        }
    }
    private void printSOAPMessage (SOAPMessage soapResponse)
    {
    	TransformerFactory transformerFactory;
    	Transformer        transformer;
        try {
	        // Создание XSLT-процессора
	        transformerFactory = TransformerFactory.newInstance();
	        transformer = transformerFactory.newTransformer();
	        // Получение содержимого ответа
	        Source content;
	        content = soapResponse.getSOAPPart().getContent();
	        // Определение выходного потока
	        StreamResult result = new StreamResult(System.out);
	        transformer.transform(content, result);
	        System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	public static void main(String[] args) 
	{
		new SoapClientExample();
		System.exit(0);
	}
}

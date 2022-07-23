package com.devisefutures.validationpolicies.mappers;

import com.devisefutures.validationpolicies.models.gen.DigestMethodType;
import com.devisefutures.validationpolicies.models.gen.ObjectFactory;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import javax.xml.bind.*;
import java.io.*;

/**
 * Implements the convertion between DigestMethodType
 * object and xml file. (this was a class implemented for test purposes)
 */
public class DigestMethodTypeMapper {

    static final Logger logger = LogManager.getLogger(DigestMethodTypeMapper.class);

    private static JAXBContext jaxbContext;

    static {
        try {
            jaxbContext = JAXBContext.newInstance(DigestMethodType.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private DigestMethodTypeMapper(){}

    /**
     * Creates a xml file from an object
     * @param digestMethod The marshalling object
     * @throws JAXBException Thrown when some error occurs with marshal creating
     * @return String with the xml content
     */
    public static String marshal(DigestMethodType digestMethod) throws JAXBException {
        Marshaller marshaller = jaxbContext.createMarshaller();
        ObjectFactory objectFactory = new ObjectFactory();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        //If we DO NOT have JAXB annotated class
        JAXBElement<DigestMethodType> jaxbElement =
                objectFactory.createDigestMethod(digestMethod);
        StringWriter sw = new StringWriter();
        marshaller.marshal(jaxbElement, sw);
        logger.debug("Xml content: " + sw);
        return sw.toString();
    }

    /**
     * Creates a java object from a xml file with DigestMethodType
     * @param content The xml content
     * @return The DigestMethodType object
     * @throws JAXBException Thrown when some error occurs with unmarshal creating or process
     */
    public static DigestMethodType unmarshal(String content) throws JAXBException {
        StringReader sr = new StringReader(content);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return ((JAXBElement<DigestMethodType>) unmarshaller.unmarshal(sr)).getValue();
    }
}

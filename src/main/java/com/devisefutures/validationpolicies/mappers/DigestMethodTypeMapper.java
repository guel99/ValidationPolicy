package com.devisefutures.validationpolicies.mappers;

import com.devisefutures.validationpolicies.models.gen.DigestMethodType;

import javax.xml.bind.*;
import javax.xml.namespace.QName;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Implements the convertion between DigestMethodType
 * object and xml file
 */
public class DigestMethodTypeMapper {

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
     * @param outputPath The path to output file
     * @throws JAXBException Thrown when some error occurs with marshal creating
     * @throws FileNotFoundException Thrown when some error occurs with file handle
     */
    public static void marshal(DigestMethodType digestMethod, String outputPath) throws JAXBException, FileNotFoundException {
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        //If we DO NOT have JAXB annotated class
        JAXBElement<DigestMethodType> jaxbElement =
                new JAXBElement<>( new QName("", "digestMethod"),
                        DigestMethodType.class,
                        digestMethod); // TODO - remover esta conversão antes de realizar o marshal
                                       // todo - após criar class DigestMethod com @XmlRootElement
        marshaller.marshal(jaxbElement, new FileOutputStream(outputPath));
    }

    /**
     * Creates a java object from a xml file with DigestMethodType
     * @param inputPath The path to input file
     * @return The DigestMethodType object
     * @throws JAXBException Thrown when some error occurs with unmarshal creating or process
     */
    public static DigestMethodType unmarshal(String inputPath) throws JAXBException {
        File file = new File(inputPath);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return (DigestMethodType) unmarshaller.unmarshal(file);
    }
}

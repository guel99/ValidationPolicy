package com.devisefutures.validationpolicies.mappers;

import com.devisefutures.validationpolicies.models.gen.DigestMethodType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.FileNotFoundException;

public class DigestMethodTypeMapperTest {

    @Test
    @DisplayName(value = "Testing marshal a digestmethod")
    void testMarshal(){
        DigestMethodType digestMethodType = new DigestMethodType();
        digestMethodType.setAlgorithm("this is a test");
        Assertions.assertDoesNotThrow(() -> {
            DigestMethodTypeMapper.marshal(digestMethodType, "src/test/resources/digest.xml");
            File generated = new File("src/test/resources/digest.xml");
            Assertions.assertTrue(generated.exists());
            //Assertions.assertEquals(digestMethodType, DigestMethodTypeMapper.unmarshal("src/test/resources/digest.xml"));
        });
    }
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        DigestMethodType digestMethodType = new DigestMethodType();
        digestMethodType.setAlgorithm("this is a test");
        DigestMethodTypeMapper.marshal(digestMethodType, "src/test/resources/digest.xml");
    }
}

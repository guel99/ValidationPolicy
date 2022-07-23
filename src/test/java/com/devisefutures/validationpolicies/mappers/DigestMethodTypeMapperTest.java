package com.devisefutures.validationpolicies.mappers;

import com.devisefutures.validationpolicies.models.gen.DigestMethodType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DigestMethodTypeMapperTest {

    @Test
    @DisplayName(value = "Testing marshal a digestmethod and unmarshalling it")
    void testMarshalUnmarshal(){
        DigestMethodType digestMethodType = new DigestMethodType();
        digestMethodType.setAlgorithm("this is a test");
        Assertions.assertDoesNotThrow(() -> {
            String xmlContent = DigestMethodTypeMapper.marshal(digestMethodType);
            Assertions.assertFalse(xmlContent.isEmpty());
            Assertions.assertEquals(digestMethodType.getAlgorithm(), DigestMethodTypeMapper.unmarshal(xmlContent).getAlgorithm());
        });
    }
}

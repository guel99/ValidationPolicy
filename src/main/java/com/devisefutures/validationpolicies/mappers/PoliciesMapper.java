package com.devisefutures.validationpolicies.mappers;

import com.devisefutures.validationpolicies.models.gen.ConstraintsParameters;
import com.devisefutures.validationpolicies.models.gen.ContainerConstraints;
import com.devisefutures.validationpolicies.models.gen.SignaturePolicyType;

/**
 * Class that implements methods to build a ValidationPolicy
 * object from a SignaturePolicy one
 */
public class PoliciesMapper {

    public ConstraintsParameters buildDSSValidationPolicy(SignaturePolicyType signaturePolicy){
        ConstraintsParameters dssPolicy = new ConstraintsParameters();
        dssPolicy.setContainerConstraints(buildContainerConstraints(signaturePolicy));
        return dssPolicy;
    }

    private ContainerConstraints buildContainerConstraints(SignaturePolicyType signaturePolicy) {
        ContainerConstraints containerConstraints = new ContainerConstraints();
        return containerConstraints;
    }
}

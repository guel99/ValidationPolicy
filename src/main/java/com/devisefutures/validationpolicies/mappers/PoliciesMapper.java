package com.devisefutures.validationpolicies.mappers;

import com.devisefutures.validationpolicies.models.gen.*;

import java.util.List;

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

    /**
     * Builds the containerConstraints of DSS ValidationPolicy by passing a
     * SignaturePolicyType (ETSI Signature Policy)
     * @param signaturePolicy
     * @return
     */
    private ContainerConstraints buildContainerConstraints(SignaturePolicyType signaturePolicy) {
        MultiValuesConstraint acceptableContainerTypes = this.getAcceptableContainerTypes(signaturePolicy);
        ContainerConstraints containerConstraints = new ContainerConstraints();
        containerConstraints.setAcceptableContainerTypes(acceptableContainerTypes);
        return containerConstraints;
    }

    /**
     * Creates a list of all AcceptableContainerTypes accepted by the validation policy
     * @param signaturePolicy The validation policy applied
     * @return MultiValuesConstraint all acceptableContainerTypes
     */
    private MultiValuesConstraint getAcceptableContainerTypes(SignaturePolicyType signaturePolicy){
        MultiValuesConstraint acceptableContainerTypes = new MultiValuesConstraint();
        for(PolicyRuleType policyRule : signaturePolicy.getPolicyComponents().getPolicyRules().getPolicyRule()){
            List<RelativePositionValuesType> sigDTBSRelativePosition = policyRule.getSigToDTBSRelationRules().getSigDTBSRelativePosition();
            if(sigDTBSRelativePosition != null && policyRule.getRecommendedScope().contains(ScopeType.VALIDATION)
                    && sigDTBSRelativePosition.contains(RelativePositionValuesType.A_SI_C)) {
                acceptableContainerTypes.getId().add("ASIC-S");
                acceptableContainerTypes.getId().add("ASIC-E");
            }
        }
        return acceptableContainerTypes;
    }
}

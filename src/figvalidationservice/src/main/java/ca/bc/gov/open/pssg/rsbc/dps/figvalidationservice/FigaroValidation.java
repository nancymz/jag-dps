package ca.bc.gov.open.pssg.rsbc.dps.figvalidationservice;

import ca.bc.gov.open.ords.figcr.client.api.model.ValidateApplicantForSharingOrdsResponse;
import ca.bc.gov.open.ords.figcr.client.api.model.ValidateApplicantPartyIdOrdsResponse;
import ca.bc.gov.open.ords.figcr.client.api.model.ValidateApplicantServiceOrdsResponse;
import ca.bc.gov.open.pssg.rsbc.dps.figvalidationservice.exception.FigaroValidationServiceException;
import ca.bc.gov.open.pssg.rsbc.dps.figvalidationservice.types.LocateMatchingApplicantsRequest;
import ca.bc.gov.open.pssg.rsbc.dps.figvalidationservice.types.LocateMatchingApplicantsResponse;
import ca.bc.gov.open.pssg.rsbc.dps.figvalidationservice.types.ValidateApplicantForSharingRequest;


/**
 * 
 * Figaro Validation Service interface
 * 
 * @author shaunmillargov
 *
 */
public interface FigaroValidation {

	public LocateMatchingApplicantsResponse locateMatchingApplicants(LocateMatchingApplicantsRequest lmr)
			throws FigaroValidationServiceException;
	
	public ValidateApplicantServiceOrdsResponse validateApplicantServiceOrdsResponse(String applPartyId,String orgPartyId)
			throws FigaroValidationServiceException;
	
	public ValidateApplicantForSharingOrdsResponse validateApplicantForSharing(ValidateApplicantForSharingRequest validateApplicantForSharingRequest)
			throws FigaroValidationServiceException;
	
	public ValidateApplicantPartyIdOrdsResponse validateApplicantPartyId(String applParyId)
			throws FigaroValidationServiceException;

}




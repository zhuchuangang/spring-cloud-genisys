package com.szss.genisys.auth.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.security.Principal;

/**
 * REST endpoint to be used by other micro-services using SSO to validate the
 * authentication of the logged in user.
 * 
 * @author zcg
 *
 */
@Api(basePath = "/user", value = "user", description = "REST endpoint to be used by other micro-services " +
		"using SSO to validate the authentication of the logged in user.", produces = "application/json")
@RestController
@SessionAttributes("authorizationRequest")
public class AuthUserController {
	
	/**
	 * Return the principal identifying the logged in user
	 * @param user
	 * @return
	 */
	@ApiOperation(value = "user's principal", notes = "Return the principal identifying the logged in user.", response = Principal.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successful retrieval of user detail", response = Principal.class)
	})
	@RequestMapping(value = "/user",method = RequestMethod.GET)
	public Principal user(Principal user) {
		return user;
	}
}

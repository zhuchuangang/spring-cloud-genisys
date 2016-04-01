package com.szss.genisys.platform.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * 
 * @author Filip Lindby
 *
 */
@RestController
@RequestMapping("/test")
public class TestController {

	@RequestMapping(method = GET)
	public Map<String, String> getTest() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("data", "protected_data");
		return map;
	}

}

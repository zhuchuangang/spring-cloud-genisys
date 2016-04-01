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
@RequestMapping("/demo")
public class DemoController {

	@RequestMapping(method = GET)
	public Map<String, String> getTest() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("data", "unprotected_data");
		return map;
	}

}

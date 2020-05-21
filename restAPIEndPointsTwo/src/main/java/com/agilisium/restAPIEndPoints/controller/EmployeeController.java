package com.agilisium.restAPIEndPoints.controller;
import java.net.URI;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(path = "/loginDetails")
public class EmployeeController 
{
	@RequestMapping(value="{domain}/api/getproductdetails",method=RequestMethod.GET) 
	public ResponseEntity<String> getproductdetails(@PathVariable("domain") String domain) throws Exception 
	{
		System.out.println("aaaaaaaaaaaaaaaaaaaaa " + domain);
		HttpHeaders headers = new HttpHeaders();
	    headers.add("Custom-Header", "foo");
		System.out.println("The Value Embedeyyyyyyyyyyyyyyyyyyd is " + domain + " so Others are Waste ? and Sleeping ????, No!!!!, that's your misconception....");
		if(domain.equals("Telecom")) {
			return new ResponseEntity<>(
		      "Custom header set", headers, HttpStatus.OK);
		} else if(domain.equals("Payments")) {
			return new ResponseEntity<>(
			  "Custom header is wrong", headers, HttpStatus.BAD_GATEWAY);
		} else if(domain.equals("Manufacturing")) {
			return new ResponseEntity<>(
			  "Custom header is bad", headers, HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
		}
		return new ResponseEntity<>(
				  "Custom header set", headers, HttpStatus.OK);
	}
	
	@RequestMapping(value="{domain}/api/getconfigdetails",method=RequestMethod.GET) 
	public ResponseEntity<String> getconfigdetails(@PathVariable("domain") String domain) throws Exception 
	{
		System.out.println("aaaaaaaaaaaaaaaaaaaaa " + domain);
		HttpHeaders headers = new HttpHeaders();
	    headers.add("Custom-Header", "foo");
		System.out.println("The Value Embedeyyyyyyyyyyyyyyyyyyd is " + domain + " so Others are Waste ? and Sleeping ????, No!!!!, that's your misconception....");
		if(domain.equals("Telecom")) {
			return new ResponseEntity<>(
		      "Custom header set", headers, HttpStatus.OK);
		} else if(domain.equals("Payments")) {
			return new ResponseEntity<>(
			  "Custom header is wrong", headers, HttpStatus.BAD_GATEWAY);
		} else if(domain.equals("Manufacturing")) {
			return new ResponseEntity<>(
			  "Custom header is bad", headers, HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
		}
		return new ResponseEntity<>(
				  "Custom header set", headers, HttpStatus.OK);
	}
}
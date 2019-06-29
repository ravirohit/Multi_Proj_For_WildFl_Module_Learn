package com.learn.rest.controller;

import java.util.Optional;
import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.learn.commonutil.AppUtilForAllModue;

@Path("rest")
public class MyController {

	@Path("test")
	@GET
	public String test(@QueryParam("name") String name){                //http://localhost:8080/independentwebproj/rest/test?name=ravi%20singh
		System.out.println("test method of controller get called");
		AppUtilForAllModue obj = new AppUtilForAllModue();
		Optional<String> val = obj.display(name).stream().reduce((x, y) -> x +", " + y);
	    return val.orElse("Name list is empty");
	 }
}

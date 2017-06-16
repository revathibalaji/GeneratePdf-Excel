package sample.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

	private static final Logger LOGGER = Logger.getLogger(SampleController.class);

	//front controller request
	@RequestMapping(value = "/")
	public ModelAndView getLoginCount(HttpServletRequest request) {

		return new ModelAndView("index");
	}
	
	
	// for generate a pdf
	/**
	 *  PdfRevenueSummary configured in the spring-
	 * @param request
	 * @return
	 * @throws ServletRequestBindingException
	 */
	@RequestMapping(value = "/generate-pdf")
	public ModelAndView generatePdf(HttpServletRequest request) throws ServletRequestBindingException {


		//dummy data
		Map<String,String> revenueData = new HashMap<String,String>();
		revenueData.put("1/20/2010", "$100,000");
		revenueData.put("1/21/2010", "$200,000");
		revenueData.put("1/22/2010", "$300,000");
		revenueData.put("1/23/2010", "$400,000");
		revenueData.put("1/24/2010", "$500,000");


		return new ModelAndView("pdf","revenueData",revenueData);


	}
	

	@RequestMapping(value = "/generate-excel")
	public ModelAndView generateExcel(HttpServletRequest request) throws ServletRequestBindingException {


		//dummy data
		Map<String,String> revenueData = new HashMap<String,String>();
		revenueData.put("1/20/2010", "$100,000");
		revenueData.put("1/21/2010", "$200,000");
		revenueData.put("1/22/2010", "$300,000");
		revenueData.put("1/23/2010", "$400,000");
		revenueData.put("1/24/2010", "$500,000");		

		
		return new ModelAndView("excel","revenueData",revenueData);


	}




}

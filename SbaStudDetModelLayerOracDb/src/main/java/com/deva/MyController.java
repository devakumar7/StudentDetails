package com.deva;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

	@Controller
	public class MyController {

		@RequestMapping("/")
		public String reg()
		{
			return "bill";
		}
		@RequestMapping("/req1")
		public String res( @RequestParam int no,
						   @RequestParam String nm,
						   @RequestParam double qty,
						   @RequestParam double cost,
					   	   ModelMap map) {
			 
			map.put("no", no);
			map.put("nm", nm);
			map.put("qty", qty);
			map.put("cost", cost);
			double inv=qty*cost;
			map.put("inv", inv);
			return "res";
		}
		
		
	}
package com.tv2.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.tv2.common.model.Plan;

@Controller
@RequestMapping("/tvp2/plans")
public class JSONController {

	@RequestMapping(value = "{name}", method = RequestMethod.GET)
	public @ResponseBody
	Plan getPlanInJSON(@PathVariable String name) {

		Plan plan = new Plan();
		plan.setName(name);
		plan.setCampains(new String[] { "RADIO1", "RADIO2" });

		return plan;
	}
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.limits.controller;

import com.myapp.limits.bean.LimitsConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LimitsConfigurationController {
    
	@Autowired
	private LimitsConfiguration limits;
	
	@GetMapping("/limits")
	public LimitsConfiguration returnLimits() {
		return new LimitsConfiguration(limits.getMaximum(), limits.getMinimum());
		
	}
    
}

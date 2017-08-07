package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by nghia on 04/08/2017.
 */
@Controller
public class DashboardController {

  @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
  public String showDashboard(){
    return "dashboard";
  }
}

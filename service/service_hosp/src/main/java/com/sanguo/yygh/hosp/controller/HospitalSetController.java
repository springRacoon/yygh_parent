package com.sanguo.yygh.hosp.controller;

import com.sanguo.yygh.hosp.service.HospitalSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: yygh_parent
 * @description:
 * @author: Saxon
 * @create: 2021-10-27 10:46
 */
@RestController
@RequestMapping("")
public class HospitalSetController {

    @Autowired
    private HospitalSetService hospitalSetService;


}

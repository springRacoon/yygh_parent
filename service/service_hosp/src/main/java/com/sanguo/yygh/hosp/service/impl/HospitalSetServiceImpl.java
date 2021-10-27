package com.sanguo.yygh.hosp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sanguo.yygh.hosp.mapper.HospitalSetMapper;
import com.sanguo.yygh.hosp.service.HospitalSetService;
import com.sanguo.yygh.model.hosp.HospitalSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: yygh_parent
 * @description:
 * @author: Saxon
 * @create: 2021-10-27 10:42
 */
@Service
public class HospitalSetServiceImpl extends ServiceImpl<HospitalSetMapper, HospitalSet> implements HospitalSetService {

    @Autowired
    private HospitalSetMapper hospitalSetMapper;

}


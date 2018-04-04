package com.imooc.beanannotation.jsr;

import com.imooc.spring.beanannotation.jsr.JsrDAO;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

//@Service
@SuppressWarnings("unused")
@Named
public class JsrServie {

    //	@Resource
//	@Inject
    private JsrDAO jsrDAO;

    //	@Resource
    @Inject
    public void setJsrDAO(@Named("jsrDAO") JsrDAO jsrDAO) {
        this.jsrDAO = jsrDAO;
    }

    @PostConstruct
    public void init() {
        System.out.println("JsrServie init.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("JsrServie destroy.");
    }

    public void save() {
        jsrDAO.save();
    }

}

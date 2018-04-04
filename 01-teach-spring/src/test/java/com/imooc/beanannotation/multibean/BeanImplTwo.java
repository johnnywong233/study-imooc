package com.imooc.beanannotation.multibean;

import com.imooc.spring.beanannotation.multibean.BeanInterface;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class BeanImplTwo implements BeanInterface {

}

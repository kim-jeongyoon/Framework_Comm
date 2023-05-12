package edu.kh.comm.common.aop;

import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterAspect {
	
	private Logger logger = LoggerFactory.getLogger(AfterAspect.class);
	
	

}

package com.codekul.java10feb;

import com.codekul.java10feb.apo.Boy;
import com.codekul.java10feb.apo.Girl;
import com.codekul.java10feb.di.Company;
import com.codekul.java10feb.ioc.Jio;
import com.codekul.java10feb.ioc.SimConfig;
import com.codekul.java10feb.ioc.Vodafone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.EnvironmentCapable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Java10febApplication {

	private Logger logger = LoggerFactory.getLogger(Java10febApplication.class);
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Java10febApplication.class, args);
//		AnnotationConfigApplicationContext applicationContext1=new AnnotationConfigApplicationContext(SimConfig.class);
//		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(applicationContext1);

//		Jio jio=context.getBean(Jio.class);
//		jio.calling();
//		jio.msg();


//		Vodafone vodafone=applicationContext1.getBean(Vodafone.class);
//		vodafone.calling();
//		vodafone.msg();

//        Company company=applicationContext.getBean(Company.class);
//        company.display();

//		Boy boy = applicationContext.getBean(Boy.class);
//		Girl girl = applicationContext.getBean(Girl.class);
//
//		boy.studyMaths(6);
//		girl.study();
//		boy.myException();

	}
	@GetMapping("hello")
	public String msg(){
		logger.debug("In debugging");
		logger.info("In info");
		logger.warn("In warn");
		logger.error("In error");
		logger.trace("In tracing");
		return "Hello Spring...";
	}


}

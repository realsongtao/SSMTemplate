package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.sql.DataSource;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestBase {
	protected ClassPathXmlApplicationContext ctx;
	@Before
	public void init() {
		ctx = new ClassPathXmlApplicationContext("spring-configs.xml");
	}
	
	@Test
	public void text() {
		System.out.println(ctx);
	}
	
	@Test
	public void textDruidDataSource() throws Exception {
		DataSource ds = ctx.getBean("dataSource",DataSource.class);
		System.out.println(ds.getConnection());
	}
	
	//<util:properties...
	@Test
	public void textUtil()  {
//		Properties util = ctx.getBean("cfg",Properties.class);
//		System.out.println(util);
//		System.out.println(util.getClass());
		Object obj = ctx.getBean("cfg");
		System.out.println(obj.getClass());
		//直接获取类型
		ctx.getType("cfg");
	}

	
	@After
	public void destroy() {
		
	}
	
}

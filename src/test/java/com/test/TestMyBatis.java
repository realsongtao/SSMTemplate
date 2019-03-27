package com.test;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.db.sys.dao.SysLogDao;

public class TestMyBatis extends TestBase{
	@Test
	public void testSqlSessionFactory() {
		SqlSessionFactory bean = ctx.getBean("sqlSessionFactory",SqlSessionFactory.class);
		System.out.println(bean);
	}
	@Test
	public void testSqlSession() {
		SqlSessionFactory bean = ctx.getBean("sqlSessionFactory",SqlSessionFactory.class);
		SqlSession session = bean.openSession();
		String statement = "com.db.sys.dao.SysLogDao.findLogs";
		List<Map<String,Object>> list = session.selectList(statement);
		for(Map<String,Object> map:list) {
			System.out.println(map);
		}
		session.close();
	}
	
	@Test
	public void testSqlSession2() {
		SqlSessionFactory bean = ctx.getBean("sqlSessionFactory",SqlSessionFactory.class);
		SqlSession session = bean.openSession();
		SysLogDao dao = session.getMapper(SysLogDao.class);
		List<Map<String,Object>> list = dao.findLogs();
		for(Map<String,Object> map:list) {
			System.out.println(map);
		}
		session.close();
	}
	
	@Test
	public void testSqlSession3() {
		SysLogDao dao = ctx.getBean("sysLogDao",SysLogDao.class);
		List<Map<String,Object>> list = dao.findLogs();
		for(Map<String,Object> map:list) {
			System.out.println(map);
		}
		
	}
	
	
}

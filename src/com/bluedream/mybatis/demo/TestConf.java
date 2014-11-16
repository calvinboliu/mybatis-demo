package com.bluedream.mybatis.demo;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class TestConf {

	@Test
	public void testSelect() {
		try {
			String resource = "mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
					.build(inputStream);

			SqlSession session=sqlSessionFactory.openSession();
			User user=(User)session.selectOne("com.bluedream.mybatis.demo.UserManager.selectUser",1);
			System.out.println(user.toString());
			session.close();
			
			SqlSession session1=sqlSessionFactory.openSession(false);
			User user1=(User)session1.selectOne("com.bluedream.mybatis.demo.UserManager.selectUser",1);
			System.out.println(user1.toString());
			session1.close();
		} catch (Exception ex) {

			System.out.println(ex);
		}
	}

	@Test
	public void testInsert() {
		
		
	}
	
}
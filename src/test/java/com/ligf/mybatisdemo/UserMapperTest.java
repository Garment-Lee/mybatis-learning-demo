package com.ligf.mybatisdemo;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import com.ligf.mybatisdemo.domain.User;
import com.ligf.mybatisdemo.mapper.UserMapper;

public class UserMapperTest extends BaseMapperTest{
	
	@Test
	public void testSelectById() {
		SqlSession sqlSession = getSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//			User user = userMapper.selectById(1);
			User user = userMapper.selectByLoginnameAndPassword("Garment", "123456");
			Assert.assertNotNull(user);
			Assert.assertEquals("Garment", user.getLoginName());
		} finally {
			// TODO: handle finally clause
			sqlSession.close();
		}
	}

}

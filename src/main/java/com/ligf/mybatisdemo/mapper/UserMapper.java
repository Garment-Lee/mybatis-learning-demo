package com.ligf.mybatisdemo.mapper;

import org.apache.ibatis.annotations.Param;

import com.ligf.mybatisdemo.domain.User;

public interface UserMapper {
	
	User selectById(int id);
	
	User selectByLoginnameAndPassword(@Param("loginName") String loginName, @Param("password") String password);

}

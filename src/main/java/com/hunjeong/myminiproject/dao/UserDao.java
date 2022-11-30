package com.hunjeong.myminiproject.dao;

import com.hunjeong.myminiproject.domain.*;

public interface UserDao {
    int deleteUser(String id, String pwd) throws Exception;

    UserDto selectUser(String id) throws Exception;

    int insertUser(UserDto dto) throws Exception;


    int updateUser(UserDto user) throws Exception;


    int countUser() throws Exception;

    int deleteAll() throws Exception;
}
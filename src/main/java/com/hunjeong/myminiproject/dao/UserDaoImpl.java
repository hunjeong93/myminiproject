package com.hunjeong.myminiproject.dao;

import com.hunjeong.myminiproject.domain.*;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private SqlSession session;
    private static String namespace = "com.hunjeong.myminiproject.dao.RegisterMapper.";

    @Override
    public int deleteUser(String id, String pwd) throws Exception {
        Map map = new HashMap();
        map.put("id", id);
        map.put("pwd", pwd);
        return session.delete(namespace + "delete", map);
    }

    @Override
    public UserDto selectUser(String id) throws Exception {
        return session.selectOne(namespace + "select", id);
    }

    @Override
    public int insertUser(UserDto dto) throws Exception {
        return session.insert(namespace+"insert", dto);
    }

    @Override
    public int updateUser(UserDto dto) throws Exception {
        return session.update(namespace + "update", dto);
    }

    @Override
    public int countUser() throws Exception {
        return session.selectOne(namespace + "count");
    }

    @Override
    public int deleteAll() throws Exception {
        return session.delete(namespace+"deleteAll");
    }
}

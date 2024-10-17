package com.mycompany.myapp.dao;

import com.mycompany.myapp.model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SqlSession sqlSession;

    private static final String NAMESPACE = "com.mycompany.myapp.mapper.UserMapper";

    @Override
    public User getUserByUsername(String username) {
        return sqlSession.selectOne(NAMESPACE + ".getUserByUsername", username);
    }
}
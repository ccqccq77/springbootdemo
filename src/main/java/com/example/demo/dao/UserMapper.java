package com.example.demo.dao;

import com.example.demo.domain.UserVO;

import java.util.List;

/**
 * Created by ccq on 2019/2/21.
 */
public interface UserMapper {

    List<UserVO> getAll();

    UserVO getOne(Long id);

    void insert(UserVO user);

    void insertBatch(List<UserVO> userList);

    void update(UserVO user);

    void delete(Long id);

    List<UserVO> getBatch(UserVO userVO);

}

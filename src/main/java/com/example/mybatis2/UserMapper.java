package com.example.mybatis2;

import java.util.List;

public interface UserMapper
{
    void insertUser(Employee user);

    Employee findUserById(Integer id);
    List<Employee> findAllUsers();
}
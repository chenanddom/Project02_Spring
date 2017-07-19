package com.ccpg5;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by lenovo on 2017/7/19.
 */
public class MyTest {
    public static void main(String[] args){
        //1 创建数据源（连接池） dbcp
        BasicDataSource dataSource = new BasicDataSource();
        // * 基本4项
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/springdb");
        dataSource.setUsername("root");
        dataSource.setPassword("root@123");
        //2  创建模板
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        //3 通过api操作
        jdbcTemplate.update("insert into t_user(username,password) values(?,?);", "tom","998");
    }
}

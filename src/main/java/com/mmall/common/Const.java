package com.mmall.common;

/**
 * Created by yangjingsheng on 20180505//.
 */
public class Const {

    public static final String EMAIL = "email";
    public static final String USERNAME = "username";
    public static final String CURRENT_USER = "current_user";


    public interface Role{
        //普通用户
        int ROLE_CUSTOMER = 0;
        //admin
        int ROLE_ADMIN = 1;
    }

}

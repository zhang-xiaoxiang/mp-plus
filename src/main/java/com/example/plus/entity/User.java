package com.example.plus.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 客户端用户表
 * </p>
 *
 * @author zhangxiaoxiang
 * @since 2019-07-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户主键ID
     */
    private String user_id;

    /**
     * 用户昵称
     */
    private String user_name;

    /**
     * 用户手机号
     */
    private String user_phone;

    /**
     * 用户登录密码
     */
    private String user_password;

    /**
     * 用户头像
     */
    private String user_icon;

    /**
     * 用户邮箱地址
     */
    private String user_email;

    /**
     * 用户身份认证 (0未认证,1已认证)
     */
    private Integer user_autonym;

    /**
     * 用户地址
     */
    private String user_site;

    /**
     * 用户性别( 0女,1男)
     */
    private Integer user_sex;

    /**
     * 用户出生日期
     */
    private LocalDateTime user_date_birth;

    /**
     * 用户个性签名
     */
    private String user_signature;

    /**
     * 是否导游
     */
    private Integer user_guide;

    /**
     * 用户是否会员 ( 0否1是)
     */
    private Integer user_vip;

    /**
     * 用户积分
     */
    private Integer user_integral;

    /**
     * 移动设备唯一cid
     */
    private String c_id;

    /**
     * 用户注册时间
     */
    private LocalDateTime create_time;

    /**
     * 微信openID
     */
    private String wx_openid;

    /**
     * 微信头像
     */
    private String wx_icon;

    /**
     * QQopenID
     */
    private String qq_openid;

    /**
     * QQ头像
     */
    private String qq_icon;


}

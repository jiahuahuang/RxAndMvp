package cn.jiahua.bean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Entity mapped to table CONTACTS.
 */
@Entity
public class Contact
{

    /** Not-null value. */
    @Id
    private String id;
    private String realName;
    private String roleId;
    private String userNo;
    private String mobile;
    private Boolean sex;
    private String avatar;
    private String userName;
    private String roleName;
    @Generated(hash = 1071856462)
    public Contact(String id, String realName, String roleId, String userNo, String mobile, Boolean sex,
            String avatar, String userName, String roleName) {
        this.id = id;
        this.realName = realName;
        this.roleId = roleId;
        this.userNo = userNo;
        this.mobile = mobile;
        this.sex = sex;
        this.avatar = avatar;
        this.userName = userName;
        this.roleName = roleName;
    }
    @Generated(hash = 672515148)
    public Contact() {
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getRealName() {
        return this.realName;
    }
    public void setRealName(String realName) {
        this.realName = realName;
    }
    public String getRoleId() {
        return this.roleId;
    }
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
    public String getUserNo() {
        return this.userNo;
    }
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }
    public String getMobile() {
        return this.mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public Boolean getSex() {
        return this.sex;
    }
    public void setSex(Boolean sex) {
        this.sex = sex;
    }
    public String getAvatar() {
        return this.avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public String getUserName() {
        return this.userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getRoleName() {
        return this.roleName;
    }
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}

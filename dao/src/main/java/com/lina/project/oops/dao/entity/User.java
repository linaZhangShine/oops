package com.lina.project.oops.dao.entity;

public class User
{
    public enum Role
    {
       CONSUME, MERCHANT;
       public int getValue()
       {
           return this.ordinal() + 1;
       }
    }
    private int id;
    private String userName;
    private String password;
    private Role role;

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public Role getRole()
    {
        return role;
    }

    public void setRole(Role role)
    {
        this.role = role;
    }

    @Override
    public String toString()
    {
        return "User{" + "id=" + id + ", userName='" + userName + '\'' + ", password='" + password + '\'' + ", role=" +
                role + '}';
    }
}

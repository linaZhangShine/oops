package com.lina.project.oops.web.service;

import com.lina.project.oops.dao.entity.User;
import com.lina.project.oops.web.entity.RestResponse;
import org.springframework.http.ResponseEntity;

public interface IuserService
{
    ResponseEntity<RestResponse> register(User user);
    void login(User user);
    void logout(User user);
    void unregister(User user);
    void modifyPasswd(User user, String oldPasswd, String newPasswd);

}

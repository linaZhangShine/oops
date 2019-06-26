package com.lina.project.oops.web.service;

import com.lina.project.oops.dao.entity.User;
import com.lina.project.oops.dao.service.UserDaoService;
import com.lina.project.oops.web.entity.RestError;
import com.lina.project.oops.web.entity.RestResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserService implements IuserService
{
    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);
    @Autowired
    UserDaoService daoService;

    @Override
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<RestResponse> register(@RequestBody User user)
    {
        // TODO: 2019/6/26 参数校验

        LOG.info("[oops]Start to invoke method -- register, user is {}", user);
        try
        {
            daoService.insertUser(user);
        }
        catch (Exception e)
        {
            LOG.error("Found error while inserting user to db", e);
            return new ResponseEntity<>(new RestError("errorCode", new String[]{"db"},
                    "Found error while inserting user to db"), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public void login(User user)
    {

    }

    @Override
    public void logout(User user)
    {

    }

    @Override
    public void unregister(User user)
    {

    }

    @Override
    public void modifyPasswd(User user, String oldPasswd, String newPasswd)
    {

    }
}

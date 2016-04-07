package com.szss.genisys.auth.api;

import com.szss.genisys.auth.domain.user.User;
import com.szss.genisys.auth.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zcg on 16/3/21.
 */
@Api(basePath = "/api/users", value = "users", description = "获取用户信息!", produces = "application/json")
@RestController
@RequestMapping("/api/users")
public class UserController  {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "根据用户名和姓名等参数分页查询用户信息", notes = "返回用户分页信息", response = Page.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "成功返回用户信息", response = Page.class)
    })
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public Page<User> findAll(@RequestParam("name") String name,
                              @RequestParam("username") String username,
                              @RequestParam("page") int page,
                              @RequestParam("size") int size){
        return userService.findAll(name,username,page,size);
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public void add(@RequestParam("username") String username,
                    @RequestParam("name") String name,
                    @RequestParam("phone") String phone,
                    @RequestParam("enabled") Boolean enabled){
        userService.add(username ,name, phone, enabled);
    }
}

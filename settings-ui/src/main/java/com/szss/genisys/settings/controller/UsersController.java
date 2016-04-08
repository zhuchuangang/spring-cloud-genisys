package com.szss.genisys.settings.controller;

import com.szss.commons.web.json.JsonPage;
import com.szss.commons.web.plugins.datatables.DataTableCriterias;
import com.szss.commons.web.plugins.datatables.DataTablePage;
import com.szss.genisys.settings.client.auth.UserClient;
import com.szss.genisys.settings.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by zcg on 16/3/18.
 */
@Controller
@RequestMapping("/settings")
public class UsersController {

    @Autowired
    private UserClient userClient;

    @RequestMapping("/users")
    public String usersPage(){
        return "/settings/users";
    }

    @RequestMapping("/create_user")
    public String createUserPage(){return "/settings/create_user";}

    @RequestMapping(value = "/users", method = RequestMethod.GET, params = "method=settings.users.queryall")
    @ResponseBody
//    @PreAuthorize("hasPermission('','privilege.permission.queryall')")
    public DataTablePage<User> users(@ModelAttribute @Valid DataTableCriterias criterias){
        int page=criterias.getStart()/criterias.getLength();
        String username =DataTableCriterias.getColumnValue(criterias,1);
        String name =DataTableCriterias.getColumnValue(criterias,2);
        JsonPage<User> response= userClient.find(name,username,page,criterias.getLength());
        DataTablePage<User> dataTablePage= new DataTablePage<User>(response);
        dataTablePage.setDraw(criterias.getDraw());
        return dataTablePage;
    }

    @RequestMapping(value="/users", method =RequestMethod.POST,params = "method=settings.users.create")
//    @PreAuthorize("hasPermission('','settings.user.add')")
    public String addUser(@RequestParam(value = "username") String username,
                          @RequestParam(value = "name") String name,
                          @RequestParam(value = "phone") String phone,
                          @RequestParam(value = "enabled") Boolean enabled){
        System.out.println(username);
//        if (bindingResult.hasErrors()) {
//            return "/setting/create_user";
//        }
//        JsonPage<User> response = userClient.add(user.getUsername(),user.getName(),user.getPhone(), user.getEnabled());
//        DataTablePage<User> db = new DataTablePage<User>(response);
//        db.setDraw(criterias.getDraw());
        return "/setting/users";
    }
}

package com.szss.genisys.settings.controller;
import com.szss.commons.web.json.JsonPage;
import com.szss.commons.web.plugins.datatables.DataTableCriterias;
import com.szss.commons.web.plugins.datatables.DataTablePage;
import com.szss.genisys.settings.client.auth.UserClient;
import com.szss.genisys.settings.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
}

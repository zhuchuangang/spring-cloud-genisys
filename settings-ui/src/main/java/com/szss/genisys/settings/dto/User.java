package com.szss.genisys.settings.dto;

import com.szss.commons.orm.BaseEntity;
import lombok.Data;

/**
 * Created by zcg on 16/3/16.
 */
@Data
public class User extends BaseEntity {
    private Long id;
    private String username;
    private String password;
    private String name;
    private String phone;
    private Boolean enabled;
}

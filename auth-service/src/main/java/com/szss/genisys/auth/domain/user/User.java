package com.szss.genisys.auth.domain.user;

import com.szss.commons.orm.BaseEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by zcg on 16/3/16.
 */
@Data
@Entity
@Table(name = "users")
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    private String name;
    private String phone;
    private Boolean enabled;
}

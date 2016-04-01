package com.szss.genisys.auth.domain.authority;

import com.szss.commons.orm.BaseEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by zcg on 16/3/16.
 */
@Data
@Entity
@Table(name = "authorities")
public class Authority extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String authority;
    private String description;
    private Boolean enabled;
}

package com.szss.commons.web.json;

import lombok.Data;
import java.io.Serializable;
import java.util.List;

/**
 * Created by zcg on 16/3/19.
 */
@Data
public class JsonPage<T> implements Serializable{
    private Long totalPages;
    private Long totalElements;
    private Long size;
    private Long number;
    private List<T> content;
}

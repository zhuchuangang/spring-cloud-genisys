package com.szss.commons.web.json;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by zcg on 16/3/19.
 */
@Data
public class ResponseType<T> implements Serializable{
    private Map<String,List<T>> _embedded;
    private JsonPage<T> page;
}

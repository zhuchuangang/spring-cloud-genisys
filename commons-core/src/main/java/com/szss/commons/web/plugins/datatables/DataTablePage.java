package com.szss.commons.web.plugins.datatables;

import com.szss.commons.web.json.JsonPage;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zcg on 15/11/24.
 */
@Data
public class DataTablePage<T> implements Serializable{

    public DataTablePage(JsonPage<T> page){
        this.data=page.getContent();
        this.recordsTotal=page.getTotalElements();
        this.recordsFiltered=page.getTotalElements();
    }

    /**
     * 当前页号
     */
    private Integer draw;
    /**
     * 总记录数
     */
    private Long recordsTotal;
    /**
     * 过滤后的记录数
     */
    private Long recordsFiltered;
    /**
     * 数据
     */
    private List<T> data=new ArrayList<T>();

}

package com.szss.commons.web.plugins.datatables;


import org.apache.commons.lang3.StringUtils;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

/**
 * Created by zcg on 15/11/26.
 */
public class DataTableCriterias {
    @NotNull
    private int draw;
    @NotNull
    private int start;
    @NotNull
    private int length;

    private Map<SearchCriterias, String> search;

    private List<Map<ColumnCriterias, String>> columns;

    private List<Map<OrderCriterias, String>> order;

    public enum SearchCriterias {
        value,
        regex
    }

    public enum OrderCriterias {
        column,
        dir
    }

    public enum ColumnCriterias {
        data,
        name,
        searchable,
        orderable,
        searchValue,
        searchRegex
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Map<SearchCriterias, String> getSearch() {
        return search;
    }

    public void setSearch(Map<SearchCriterias, String> search) {
        this.search = search;
    }

    public List<Map<ColumnCriterias, String>> getColumns() {
        return columns;
    }

    public void setColumns(List<Map<ColumnCriterias, String>> columns) {
        this.columns = columns;
    }

    public List<Map<OrderCriterias, String>> getOrder() {
        return order;
    }

    public void setOrder(List<Map<OrderCriterias, String>> order) {
        this.order = order;
    }

    public static final String getColumnValue(DataTableCriterias criterias, Integer index) {
        String temp = null;
        if (criterias.getColumns() != null && criterias.getColumns().size() > index) {
            temp = criterias.getColumns().get(index).get(DataTableCriterias.ColumnCriterias.searchValue);
        }
        return temp;
    }

    public static final Boolean getColumnBooleanValue(DataTableCriterias criterias, Integer index) {
        String temp = null;
        if (criterias.getColumns() != null && criterias.getColumns().size() > index) {
            temp = criterias.getColumns().get(index).get(DataTableCriterias.ColumnCriterias.searchValue);
        }
        Boolean result =null;
        if(StringUtils.isNotEmpty(temp)) {
            result=Boolean.parseBoolean(temp);
        }
        return result;
    }

    public static final Long getColumnLongValue(DataTableCriterias criterias, Integer index) {
        String temp = null;
        if (criterias.getColumns() != null && criterias.getColumns().size() > index) {
            temp = criterias.getColumns().get(index).get(DataTableCriterias.ColumnCriterias.searchValue);
        }
        Long result =null;
        if(StringUtils.isNotEmpty(temp)) {
            result=Long.parseLong(temp);
        }
        return result;
    }
}
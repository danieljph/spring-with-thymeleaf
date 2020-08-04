package com.infinitium.spring_with_thymeleaf.dto;

/**
 * @author Daniel Joi Partogi Hutapea
 */
public class Page<T>
{
    private int total;
    private int limit;
    private int skip;
    private T data;

    public Page()
    {
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getSkip() {
        return skip;
    }

    public void setSkip(int skip) {
        this.skip = skip;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

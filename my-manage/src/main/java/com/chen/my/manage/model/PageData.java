package com.chen.my.manage.model;

import com.github.pagehelper.Page;

import java.util.List;

/**
 * 分页类
 *
 * @param <T>
 */
public class PageData<T> implements java.io.Serializable {

    private static final long serialVersionUID = 811560197992978164L;

    private int page; //当前第几页

    private int size;//系着页最大条件

    private List<T> rows;//分页列表

    private long total;//记录总数

    private long totalPage; //总页数

    public PageData(List<T> list, long total_, int offset_, int length_) {
        this.rows = list;
        this.total = total_;
        this.page = offset_;
        this.size = length_;

        this.totalPage = total_ / length_;
        if (total_ % length_ > 0) {
            this.totalPage++;
        }

    }

    public PageData(Page<T> page) {
        this.rows = page.getResult();
        this.total = page.getTotal();
        this.page = page.getPageNum();
        this.size = page.getPageSize();

        this.totalPage = total / size;
        if (total % size > 0) {
            this.totalPage++;
        }

    }

    public PageData() {

    }

    public int getOffset() {
        return page;
    }


    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setOffset(int offset) {
        this.page = offset;
    }

    public int getLength() {
        return size;
    }

    public void setLength(int length) {
        this.size = length;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }
}

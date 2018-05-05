package com.imooc.page.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pager<T> implements Serializable {

    private static final long serialVersionUID = -8741766802354222579L;

    private int pageSize; // 每页显示多少条记录

    private int currentPage; //当前第几页数据

    private int totalRecord; // 一共多少条记录

    private int totalPage; // 一共多少页记录

    private List<T> dataList; //要显示的数据

    public Pager(int pageNum, int pageSize, List<T> sourceList) {
        if (sourceList == null || sourceList.isEmpty()) {
            return;
        }

        // 总记录条数
        this.totalRecord = sourceList.size();

        // 每页显示多少条记录
        this.pageSize = pageSize;

        //获取总页数
        this.totalPage = this.totalRecord / this.pageSize;
        if (this.totalRecord % this.pageSize != 0) {
            this.totalPage = this.totalPage + 1;
        }

        // 当前第几页数据
        this.currentPage = this.totalPage < pageNum ? this.totalPage : pageNum;

        // 起始索引
        int fromIndex = this.pageSize * (this.currentPage - 1);

        // 结束索引
        int toIndex = this.pageSize * this.currentPage > this.totalRecord ? this.totalRecord : this.pageSize * this.currentPage;

        this.dataList = sourceList.subList(fromIndex, toIndex);
    }
}

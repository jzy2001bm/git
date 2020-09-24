package cn.entity;

import lombok.Data;

@Data
public class Page {
    private Integer pagesize;
    private Integer start;
    private String dname;
    private String status;
}

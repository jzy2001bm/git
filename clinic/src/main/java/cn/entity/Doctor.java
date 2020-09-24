package cn.entity;

import lombok.Data;

@Data
public class Doctor {
    private int did;
    private String dname;
    private String dsex;
    private String dage;
    private String dtel;
    private Depart depart;
    private String dpost;
    private String dtime;
    private String status;
}

package com.imooc.page.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Map;

@Entity
@Table(name = "t_student")
@Data
@AllArgsConstructor
public class Student implements Serializable {

    private static final long serialVersionUID = -7476381137287496245L;

    private int id; //学生记录id

    private String stuName;//学生姓名

    private int age; //学生年龄

    private int gender; //学生性别

    private String address;//学生住址

    public Student() {
        super();
    }

    public Student(Map<String, Object> map) {
        this.id = (int) map.get("id");
        this.stuName = (String) map.get("stu_name");
        this.age = (int) map.get("age");
        this.gender = (int) map.get("gender");
        this.address = (String) map.get("address");
    }

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    public int getId() {
        return id;
    }

    @Column(name = "stu_name")
    public String getStuName() {
        return stuName;
    }

    @Column(name = "age")
    public int getAge() {
        return age;
    }

    @Column(name = "gender")
    public int getGender() {
        return gender;
    }

    @Column(name = "address")
    public String getAddress() {
        return address;
    }
}

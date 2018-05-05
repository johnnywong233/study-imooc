package com.imooc.page.service;

import com.imooc.page.dao.StudentDao;
import com.imooc.page.dao.SublistStudentDaoImpl;
import com.imooc.page.model.Pager;
import com.imooc.page.model.Student;

public class SublistStudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public SublistStudentServiceImpl() {
        // 创建servivce实现类时，初始化dao对象。
        studentDao = new SublistStudentDaoImpl();
    }

    @Override
    public Pager<Student> findStudent(Student searchModel, int pageNum, int pageSize) {
        return studentDao.findStudent(searchModel, pageNum, pageSize);
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}

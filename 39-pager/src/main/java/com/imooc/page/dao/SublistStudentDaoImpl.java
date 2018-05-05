package com.imooc.page.dao;

import com.imooc.page.Constant;
import com.imooc.page.model.Pager;
import com.imooc.page.model.Student;
import com.imooc.page.util.JdbcUtil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SublistStudentDaoImpl implements StudentDao {

    /**
     * 模仿获取所有数据
     *
     * @param searchModel 查询参数
     * @return 查询结果
     */
    private static List<Student> getAllStudent(Student searchModel) {
        List<Student> result = new ArrayList<>();
        List<Object> paramList = new ArrayList<>();

        String stuName = searchModel.getStuName();
        int gender = searchModel.getGender();

        StringBuilder sql = new StringBuilder(
                "select * from t_student where 1=1");

        if (stuName != null && !stuName.equals("")) {
            sql.append(" and stu_name like ?");
            paramList.add("%" + stuName + "%");
        }

        if (gender == Constant.GENDER_FEMALE || gender == Constant.GENDER_MALE) {
            sql.append(" and gender = ?");
            paramList.add(gender);
        }

        JdbcUtil jdbcUtil = null;
        try {
            jdbcUtil = new JdbcUtil();
            jdbcUtil.getConnection(); // 获取数据库链接
            List<Map<String, Object>> mapList = jdbcUtil.findResult(
                    sql.toString(), paramList);
            if (mapList != null) {
                for (Map<String, Object> map : mapList) {
                    Student s = new Student(map);
                    result.add(s);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("查询所有数据异常！", e);
        } finally {
            if (jdbcUtil != null) {
                jdbcUtil.releaseConn(); // 一定要释放资源
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Student> lst = getAllStudent(new Student());
        for (Student s : lst) {
            System.out.println(s);
        }
    }

    @Override
    public Pager<Student> findStudent(Student searchModel, int pageNum,
                                      int pageSize) {
        List<Student> allStudentList = getAllStudent(searchModel);
        return new Pager<>(pageNum, pageSize, allStudentList);
    }
}

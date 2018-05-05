package com.imooc.page.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HibernateServlet extends HttpServlet {

    private static final long serialVersionUID = -318134993070614515L;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 返回结果到页面
        request.getRequestDispatcher("hibernateStudent.jsp").forward(request, response);
    }

}




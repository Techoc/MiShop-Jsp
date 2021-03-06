package com.myshop.controller;

import com.google.gson.Gson;
import com.myshop.entity.Type;
import com.myshop.service.TypeService;
import com.myshop.service.impl.TypeServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

/**
 * 商品类型模块的controller
 */
@WebServlet(name = "TypeController", value = "/type")
public class TypeController extends BaseServlet {
    /**
     * 查找商品分类
     */
    public String findAll(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        TypeService typeService = new TypeServiceImpl();
        List<Type> types = typeService.findAll();

        Gson gson = new Gson();
        String json = gson.toJson(types);

        return json;
    }
}

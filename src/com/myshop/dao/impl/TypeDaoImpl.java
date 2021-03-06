package com.myshop.dao.impl;

import com.myshop.dao.TypeDao;
import com.myshop.entity.Type;
import com.myshop.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class TypeDaoImpl implements TypeDao {

    @Override
    public List<Type> selectAll() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "select * from type limit 5;";
        return queryRunner.query(sql, new BeanListHandler<>(Type.class));
    }
}

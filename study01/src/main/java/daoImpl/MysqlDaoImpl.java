package daoImpl;

import dao.Dao;

public class MysqlDaoImpl implements Dao {
    @Override
    public void name() {
        System.out.println("Mysql数据库连接");
    }
}

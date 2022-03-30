package daoImpl;

import dao.Dao;

public class OracleDao implements Dao {
    @Override
    public void name() {
        System.out.println("Oracle数据库连接");
    }
}

package serviceImpl;

import dao.Dao;
import service.UserService;

public class UserServiceImpl implements UserService {
    private Dao dao;

    public void setDao(Dao dao) {
        this.dao = dao;
    }

    @Override
    public void getConnect() {
        dao.name();
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "dao=" + dao +
                '}';
    }
}

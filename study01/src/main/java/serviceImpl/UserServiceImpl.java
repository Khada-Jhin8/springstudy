package serviceImpl;

import dao.Dao;
import service.UserService;

public class UserServiceImpl implements UserService {
    private Dao dao;

//    public UserServiceImpl() {
//        System.out.println("UserServiceImpl无参构造器被调用");
//       }

    public UserServiceImpl(Dao dao) {
        System.out.println("UserServiceImpl有参构造器被调用");
        this.dao = dao;
    }

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

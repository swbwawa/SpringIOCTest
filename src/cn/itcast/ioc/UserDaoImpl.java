package cn.itcast.ioc;

public class UserDaoImpl implements UserDao {
	
	@Override
	public void save() {
		System.out.println("spring: hello user dao");

	}

}

package cn.itcast.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;

public class TestApp {
	@Test
	public void demo01() {
	
		// 1.定义配置文件路径
		String xmlpath = "applicationContext.xml";
		
		//2.初始化spring容器，加载配置文件
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext(xmlpath);
		
		//3.通过容器获取userDao实例
		UserDao userDao = (UserDao)applicationContext.getBean("userDao");
		
		//4.调用userDao的save()方法
		userDao.save();
	}
}

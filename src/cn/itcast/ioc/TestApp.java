package cn.itcast.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;

public class TestApp {
	@Test
	public void demo01() {
	
		// 1.���������ļ�·��
		String xmlpath = "applicationContext.xml";
		
		//2.��ʼ��spring���������������ļ�
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext(xmlpath);
		
		//3.ͨ��������ȡuserDaoʵ��
		UserDao userDao = (UserDao)applicationContext.getBean("userDao");
		
		//4.����userDao��save()����
		userDao.save();
	}
}

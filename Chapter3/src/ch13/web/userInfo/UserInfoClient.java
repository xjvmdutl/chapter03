package ch13.web.userInfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userInfo.UserInfo;
import ch13.domain.userInfo.dao.UserInfoDao;
import ch13.domain.userInfo.dao.mysql.UserInfoMySqlDao;
import ch13.domain.userInfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException{
		//���Ͽ��� DBŸ���� �о�鿩�� �����Ϸ��� �Ѵ�.
		//����� �ӽ÷� �׳� �ϴ� ���̴�.
		FileInputStream fis = new FileInputStream("db.properties");
		Properties prop = new Properties();//~~ = ~~ ��ü�� ������ �о���̴� Ŭ����
		prop.load(fis);//�ΰ��� ������ �Ǿ��ִ� ���� �о �������ش�.
		
		String dbtype = prop.getProperty("DBTYPE");//DBTYPE=~~ ���� ���� �о�´�.
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("12345");
		userInfo.setPasswword("!@#$%");
		userInfo.setUserName("Lee");
		
		UserInfoDao userInfoDao = null;//�ʱ⿡�� ���� ������ null
		if(dbtype.equals("ORACLE")) {//������Ƽ���� ���� �о �б�ó���Ѵ�.
			userInfoDao = new UserInfoOracleDao();
		}else if(dbtype.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		}else {
			System.out.println("db error");
			return;
		}
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}

}

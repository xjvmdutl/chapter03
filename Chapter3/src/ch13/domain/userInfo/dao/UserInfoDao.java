package ch13.domain.userInfo.dao;

import ch13.domain.userInfo.UserInfo;

public interface UserInfoDao {
	//DB������ �°� ���� �����ڵ忡�� ������ �ָ� �ȴ�.
	//Ŭ���̾�Ʈ������ �ش� �������̽��� ���� ����ϸ� �ȴ�.
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
}

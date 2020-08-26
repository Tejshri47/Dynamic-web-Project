package pack_dto;


import java.util.HashMap;

import pack_dto.User;

public class LoginService {
	HashMap<String,String> hm =new HashMap <String,String>();

	public LoginService() {

		hm.put("tejs", "tejshri");
		hm.put("shri","shreya" );		
	}
	
	public boolean Authentication(String userid,String password) {
	if (password.trim()=="" || password==null)	{
		return false;
	}
	else {
		return true;
	}
	}
	public User getuserdetails(String userid) {
		User user =new User();
		user.setUsername(hm.get(userid));
		user.setUserid(userid);
		return user;
		
		
	}
	}



package User.user;

import java.util.HashMap;
import java.util.Map;

public class Employee {
	
	Map<Integer,String>list;

	 Employee() {
	 list = new HashMap<Integer,String>();
	list.put(12345,"Shankar");
	list.put(123213,"sai");
	
}
	public String findEmployeeBycode(int code) throws  UserDefinedException{
		if(list.containsKey(code)) {
			   String value = list.get(code);
				return value;
	}else {
		throw new UserDefinedException("Employee Not found");
	}
		
	}	

}


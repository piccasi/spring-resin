package wrapper;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import com.piccasi.mvc.model.User;

public class BeanWrapperTester {

	public static void main(String[] args) {
		User user = new User();
		BeanWrapper bw = new BeanWrapperImpl(user);
		Object object = bw.getPropertyType("name");
		
		//bw.setPropertyValues(paramPropertyValues, paramBoolean);
		//bw.setPropertyValues(paramPropertyValues);
		//bw.setPropertyValue(paramPropertyValue);
		//bw.setPropertyValue(paramString, paramObject);
		//bw.setPropertyValues(paramPropertyValues, paramBoolean1, paramBoolean2);
		bw.setPropertyValue("name", "location");
		object = bw.getPropertyType("name");
		object = bw.getPropertyValue("name");
		
		object = (BeanWrapper)null;
		
		System.out.println(object);
	}

}

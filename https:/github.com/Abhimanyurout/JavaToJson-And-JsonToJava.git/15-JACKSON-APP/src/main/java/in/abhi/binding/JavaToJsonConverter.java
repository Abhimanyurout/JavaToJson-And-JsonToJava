package in.abhi.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {
	public static void main(String[] args) throws Exception{
		
		Address addr= new Address();
		addr.setCity("Hyd");
		addr.setState("TG");
		addr.setCountry("India");
		
		Customer c =new Customer();
		
		c.setId(1);
		c.setName("Abhi");
		c.setEmail("abhi12@gmail.com");
		c.setPhno((long) 9834772);
		c.setAddr(addr);
	
		
		ObjectMapper mapper= new ObjectMapper();
		
		mapper.writeValue(new File("customer.json"), c);
		
		System.out.println("Json file is created...");
		
		
	}

}

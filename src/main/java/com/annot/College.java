package com.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component//(value = "colz")
public class College {
	
	@Value("NCC")
	private String name;
	
	@Value("01467897")
	private String phone;
	
	@Autowired  //bean injection
	private Student s;
	
	@Autowired
	@Qualifier("mathTSImpl")
	private TeacherService  ts;
	
	void printCollege() {
		
		System.out.println("Name = "+name);
		System.out.println("Phone = "+phone);
		
		s.printStudent();
		ts.teach();
	}

}

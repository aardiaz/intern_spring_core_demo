package com.annot;

import org.springframework.stereotype.Component;

@Component
public class MathTSImpl implements TeacherService {

	@Override
	public void teach() {
		System.out.println(".....teaching math");
	}

}

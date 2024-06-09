package com.annot;

import org.springframework.stereotype.Component;

@Component
public class NepaliTSImpl implements TeacherService {

	@Override
	public void teach() {
		System.out.println("...Nepali teacher");
	}

}

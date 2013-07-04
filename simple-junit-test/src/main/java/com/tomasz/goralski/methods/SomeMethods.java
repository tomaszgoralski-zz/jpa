package com.tomasz.goralski.methods;

import java.util.Calendar;
import java.util.Date;

public class SomeMethods {

	public boolean returnTrue() {
		return true;
	}

	public boolean validateDate(Date date) {

		Calendar formDate = Calendar.getInstance();
		formDate.setTime(date);

		Calendar _18YearsOld = Calendar.getInstance();
		_18YearsOld.add(Calendar.DAY_OF_YEAR, -18);

		if (formDate.getTimeInMillis() > _18YearsOld.getTimeInMillis())
			return false;
		else
			return true;

	}
}

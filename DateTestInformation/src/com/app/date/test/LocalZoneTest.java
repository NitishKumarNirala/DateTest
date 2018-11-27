package com.app.date.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalZoneTest {
	public static final String dateFormate = "yyyy-MM-dd";

	public static void main(String[] args) throws ParseException {

		// simpleDefaultzoneTime();
		//dateFormatter();

		dateFormatter_formate();
	}

	private static void simpleDefaultzoneTime() {
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.systemDefault());
		LocalTime localTime = zonedDateTime.toLocalTime();
		System.out.println(localTime);
	}

	private static void dateFormatter() throws ParseException {

		SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormate);
		String orgPaymentDate = DateTimeFormatter.ISO_ZONED_DATE_TIME.format(ZonedDateTime.now());
		System.out.println(orgPaymentDate);
		Date date1 = new SimpleDateFormat(dateFormate).parse(orgPaymentDate);
		System.out.println("Date parsed = " + dateFormat.format(date1));
	}
	private static void dateFormatter_formate() throws ParseException {

		SimpleDateFormat formatter=new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");  
		String orgPaymentDate = DateTimeFormatter.ISO_ZONED_DATE_TIME.format(ZonedDateTime.now());
		System.out.println(orgPaymentDate);
		Date date1 = new SimpleDateFormat(dateFormate).parse(orgPaymentDate);
		System.out.println("Date parsed = " + formatter.format(date1));
	}
}

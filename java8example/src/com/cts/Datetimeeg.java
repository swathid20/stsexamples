package com.cts;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Datetimeeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		LocalDate date=today.ofYearDay(2018,65);
		System.out.println("65th day="+date);
		LocalDate tenthFeb2017 = LocalDate.of(2017, Month.FEBRUARY, 10);
		System.out.println("Date for tenthFeb2017"+tenthFeb2017);
		LocalTime sec=LocalTime.ofSecondOfDay(12345);
		System.out.println(" 12345th second of the day:"+sec);
		LocalDateTime local = LocalDateTime.of(2014,2, 20,12, 00);
		System.out.println("LocalDateTime for 2014-02-20 12:00"+local);
		Boolean n=LocalDate.now().isBefore(LocalDate.of(2017, 2,5));
		System.out.println("5th Feb 2017 is before current ate or not?"+n);
	}

}
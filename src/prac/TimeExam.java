package prac;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {

	public static void main(String[] args) {
		LocalDateTime timepoint = LocalDateTime.now();
		System.out.println(timepoint);
		
		LocalDate id = LocalDate.of(2020, Month.DECEMBER, 12);
		System.out.println(id);
		
		LocalTime is = LocalTime.of(17, 18);
		System.out.println(is);
		
		LocalTime iss = LocalTime.parse("11:20:40");
		System.out.println(iss);
		
		LocalDate theDate = timepoint.toLocalDate();
		System.out.println(theDate);
		Month month = timepoint.getMonth();
		System.out.println(timepoint.getMonth());
		System.out.println(month.getValue());
		System.out.println(timepoint.getHour());
		
		

	}

}

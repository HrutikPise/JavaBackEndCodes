import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date= LocalDate.now();
		System.out.println("Today's date is:"+date);
		
		LocalDate date1= date.minusDays(2);
		System.out.println("Two day's back date is:"+date1);
		
		LocalDate date2= date.plusDays(3);
		System.out.println("pluse three  date is:"+date2);
		
		LocalDate date3=LocalDate.of(2000, 05, 12);
		System.out.println(date3);
		
		LocalDate date4=date3.minusDays(3);
		System.out.println(date4);
		
		LocalDate date5=LocalDate.parse("2018-11-11");
		System.out.println(date5);
		
		//Exerise Demo
		AgeFinder age=new AgeFinder();
		System.out.println("Your age is:"+age.getAge(LocalDate.of(1989, 10, 26))+" Years");
		System.out.println(age.getDateAfterNDays(15));
		System.out.println(age.getDateAfterXYearYMonthZDays(1, 2, 3));
	}
}

class AgeFinder{
	public int getAge(LocalDate dateOfBirth) {
		return LocalDate.now().getYear()-dateOfBirth.getYear();
	}
	public LocalDate getDateAfterNDays(int noOfDays) {
		return LocalDate.now().plusDays(noOfDays);
	}
    public LocalDate getDateAfterXYearYMonthZDays(int year, int month, int day) {
		return LocalDate.now().plusYears(year).plusMonths(month).plusDays(day); 
	}
}
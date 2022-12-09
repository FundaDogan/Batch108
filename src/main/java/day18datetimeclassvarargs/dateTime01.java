package day18datetimeclassvarargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class dateTime01 {
    public static void main(String[] args) {

        // 1) How to get "current date" by typing Java code

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);  //2022-09-27  default value for date. if we don't change the format
        // java will print the date in this format

        // java get data from my computer's date-time


        // 2) how to get current time by typing Java code

        LocalTime currentTime = LocalTime.now();  // assign local time to currentTime obj
        System.out.println(currentTime);          // "now" method uses 24 hours, that's why we see 23:07:01


        // 3) How to get "current date and time"

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);  // date and time on the console
        // 2022-09-28 T 23:17:31.616541


        // 4) How to get "current date" in another country
        LocalDate currentDateInJapan = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateInJapan);

        LocalDate currentDateinIstanbul = LocalDate.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateinIstanbul);


        // 5) how to get current time by typing Java code
        LocalTime currentTimeInJapan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentTimeInJapan);


        //  6) How to get "current date and time" in another country
        LocalDateTime currentdateTimeinJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentdateTimeinJapan);


        // 7) How to go future in date
        LocalDate cd1 = LocalDate.now();
        System.out.println(cd1);

        LocalDate cd1Next = cd1.plusYears(2).plusMonths(5).plusDays(120);  // method chain
        System.out.println(cd1Next);


        // 8) How to go past in date
        LocalDate cd1Past = cd1.minusYears(3).minusMonths(2).minusDays(5);
        System.out.println(cd1Past);

        // Homework : Type code to learn going future and past in time

        LocalTime ct1 = LocalTime.now();
        System.out.println(ct1);
        LocalTime ct1Next = ct1.plusHours(2).plusMinutes(10).plusSeconds(7);
        System.out.println(ct1Next);
        LocalTime ct1Past = ct1.minusHours(3).minusMinutes(8).minusSeconds(45);
        System.out.println(ct1Past);

        // How to get a specific part of the time

        LocalTime ct = LocalTime.now();
        int hour = ct.getHour();
        System.out.println(hour);

        int minute = ct.getMinute();
        System.out.println(minute);

        int second = ct.getSecond();
        System.out.println(second);

        // How to get a specific part of the date

        int year = cd1.getYear();
        System.out.println(year);

        // How to change the format of the date

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Uppercase M is for months
        // Lowecase m is for minutes
        String formattedCurrentDate = dtf.format(cd1);
        System.out.println(formattedCurrentDate);  // 29/09/2022


        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MMM/yy");  // MMM gives "first 3 chars" of the month name
        String formattedCurrentDate2 = dt.format(cd1);                    // yy gives "last 2 digits" of the year
        System.out.println(formattedCurrentDate2);  // 29/Sept/2022


        DateTimeFormatter d = DateTimeFormatter.ofPattern("d/MMMM/yyyy");  // MMMM gives full name of the month
        String formattedCurrentDate3 = d.format(cd1);
        System.out.println(formattedCurrentDate3);  // 29/September/2022


        // How to change the format of the time
        DateTimeFormatter mnr = DateTimeFormatter.ofPattern("hh:mm a"); // lower case hh gives 08:00 but doesn't say AM or PM
                                                                      // hh use 12 hours system
                                                                      // upper case HH use 24 hours system and gives 20:00
                                                                      // a display "AM" or "PM"
        LocalTime lt = LocalTime.now();
        String formattedCurrentTime = mnr.format(lt);
        System.out.println(formattedCurrentTime);  // 08:00








    }

}



class Daysofweek {
   public static void main(String[] args) {
   int year = Integer.parseInt(args[0]);
   int month = Integer.parseInt(args[1]);
   int date = Integer.parseInt(args[2]);
System.out.println("The year is" +year+ "the month is" +month+ "the date is" +date);

  int y=year-(14-month)/12;
    int x = y+(y/4)-(y/100)+(y/400);
  int m = month+12*((14-month)/12)-2;
  int day= (date+x+31*m/12)%7;
 
System.out.println("the day is "+day);

}
}

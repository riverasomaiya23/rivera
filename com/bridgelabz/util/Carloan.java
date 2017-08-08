class Carloan {
   public static void main( String[] args) {
   double principle = Double.parseDouble(args[0]);
   double rate = Double.parseDouble(args[1]);
    double year = Double.parseDouble(args[2]);

System.out.println("the principle is " +principle+ "the rate is" +rate+ "the year is" +year);


double n=12*year;
double r=rate/(12*100);
double payment=(principle*r)/(1-Math.pow(1+r,-n));
System.out.println("the payment is" +payment);
}
}
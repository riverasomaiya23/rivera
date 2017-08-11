public class PowerOfTwo {
    public static void main (String[] args) {
        int mInputNumber=Integer.parseInt(args[0]);
        int i=0;
        int powerOfTwo=1;
    while(i<=mInputNumber){
System.out.println(i + " " +powerOfTwo);
powerOfTwo=2*powerOfTwo;
i=i+1;
     }
  }
}


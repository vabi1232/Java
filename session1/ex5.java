package Session1;

public class ex5 {
    public static void main(String[] args) {
        int lowerbound = 1, upperbound = 1000;
        int sumOdd=0;
        int sumEven=0;
        int number= lowerbound;
        while (number<=upperbound){
            if(number % 2==0){
                sumEven += number;
            }else {
                sumOdd +=number;
            }
            ++number;
        }
        System.out.println("The sum of odd numbers from" + lowerbound + "to" + upperbound + "is" + sumOdd);
        System.out.println("The even of odd numbers from" + lowerbound + "to" + upperbound + "is" + sumEven);
        System.out.println("The difference between the two sum is" +(sumOdd-sumEven));
    }
}
public class FirstLastDigitSum {
    

    public static int sumFirstAndLastDigit(int number) {


        if(number >= 0) {

            int lastDigit = 0;
            int firstDigit = number;




            lastDigit = number % 10;

            while (firstDigit >= 10) {
                firstDigit = firstDigit / 10;
            }

            int sum = (lastDigit + firstDigit);

            return sum;

        } else return -1;



    }
}

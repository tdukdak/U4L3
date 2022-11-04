public class WhileLoopFun {
    public WhileLoopFun() { }

    public double factorial(int number)
    {
        double number2 = number;
        double result = number;
        while (number2 > 1) {
            number2 = number2 - 1;
            result = result * number2;
        }
        return result;
    }

    public void printDigits(int number)
    {
        while(number > 0){
            int digits = number % 10;
            System.out.println(digits);
            number = number / 10;

      }
    }

    public int sumOfDigits(int number)
    {
        int total = 0;
        while(number > 0){
            int digits = number % 10;
            number = number / 10;
            total = total + digits;
        }
        return total;
    }


    public boolean isPrime(int number)
    {
        if(number == 1){
            return false;
        }
        else if(number == 2 || number == 3){
            return true;
        }
        else if (number % 2 == 0 || number % 3 == 0){
            return false;
        }
        return true;
    }


    public int maxDoubles(int number, int threshold)
    {
        int doubles = 0;
        while(number < threshold){
            number *= 2;
            if(number < threshold){
                doubles++;
            }
        }
        return doubles;
    }
}



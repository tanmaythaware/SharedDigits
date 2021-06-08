public class SharedDigit {

    public static boolean hasSharedDigit(int number1, int number2){

        if(number1<10 || number1>99 || number2<10 || number2>99){
            return false;
        }

        int originalNumberTwo = number2;
        int checkOne = 0;
        int checkTwo = 0;

        while (number1!=0){
            checkOne = number1 % 10;

            while (number2!=0){
                checkTwo = number2 % 10;
                if(checkOne == checkTwo){
                    return true;
                }
                number2 = number2 / 10;
            }
            number2 = originalNumberTwo;
            number1 = number1 / 10;
        }

        return false;

    }

}

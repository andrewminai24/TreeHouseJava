class Math {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2" + result);

        int prevResult = result;
        result = result - 1;
        System.out.println(prevResult + "1" + result);

        prevResult = result;

        result = result * 10;
        System.out.println(prevResult + "* 10" + result);

        prevResult = result;

        result = result / 5;
        System.out.println(prevResult + "/ 5" + result);

        prevResult = result;
        result = result % 3;
        System.out.println(prevResult + "% 3" + result);

        System.out.println("Result is now" + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result += 10;
        System.out.println("Result is now" + result);
        result -= 10;
        System.out.println("Result is now" + result);
        result /= 10;
        System.out.println("Result is now" + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien");

        int topScore = 100;
        if (topScore < 100)
            System.out.println("You got the high score");

        int secondTopScore = 60;
        if ((topScore > secondTopScore && topScore < 100))
            System.out.println("Greater top score and less than 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests are true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is an error");

        boolean isCar = false;
        if (isCar == true)
            System.out.println("This is not suppose to happen");
        
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");
        }
}
class Challenge {
    public static void main(String[] args) {
        double myFirstValue = 20d;
        double mySecondValue = 80;
        double myTotal = myFirstValue + mySecondValue;
        System.out.println("mytotal" + myTotal);
        double theRemainder = myTotal % 40;
        if (theRemainder <= 20)
            System.out.println("That was over the limit ");

    }
}
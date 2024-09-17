
class factorer {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int numberOfFactors = 0;
        int totalCount = 0;
        int countMax = 100;
        for (int counter = 1; counter <= countMax; counter++) { // this increment our counter by 1

            for (int devisor = 1; devisor <= counter; devisor++) { // this increments what we're dividing our counter
                                                                   // by, by 1

                if (counter % devisor == 0) { // this code runs everytime it finds a factor for counter
                    numberOfFactors++; // this increments number of factors by 1

                }

            }
            if (numberOfFactors == 2) {
                System.out.println(counter);
                totalCount++;
            }
            numberOfFactors = 0;
        }
        System.out.println("there are " + totalCount + " prime numbers between 1 and " + countMax);
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }

}
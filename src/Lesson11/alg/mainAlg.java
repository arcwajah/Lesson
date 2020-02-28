package Lesson11.alg;

import java.time.LocalDateTime;

public class mainAlg {
    public static void main(String[] args) {
        // O(1)
        int[] arraySmall = AlgorithmUtils.generateArray(3);
        int[] arrayBig = AlgorithmUtils.generateArray(9999);

        long timeStart = LocalDateTime.now().getNano();
        //AlgorithmUtils.printLength(AlgorithmUtils.generateArray(3));
        long timeFinish = LocalDateTime.now().getNano();
        long execTime = timeStart-timeFinish;
        System.out.println("Exec Time1: " + execTime);

        timeStart = LocalDateTime.now().getNano();
        //AlgorithmUtils.printLength(AlgorithmUtils.generateArray(9999));
        timeFinish = LocalDateTime.now().getNano();
        execTime = timeStart - timeFinish;
        System.out.println("Exec time2: " + execTime);
    }
}

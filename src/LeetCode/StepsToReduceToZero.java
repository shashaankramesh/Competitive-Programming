package LeetCode;

class StepsToReduceToZero {
    public int numberOfSteps (int num) {
        int stepsCount = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            stepsCount++;
        }

        return stepsCount;
    }
}
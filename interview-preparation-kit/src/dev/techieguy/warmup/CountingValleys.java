package dev.techieguy.warmup;

public class CountingValleys {

    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU"));
    }

    static int countingValleys(final int steps, final String path) {
        int valleyTraversed = 0;
        int current = 0;
        int prev = 0;
        if (steps >= 2 && steps <= (int) Math.pow(10, 6)) {
            for (int index = 0; index < steps; index++) {
                prev = current;
                if (path.charAt(index) == 'D') {
                    current--;
                    if (prev == 0)
                        valleyTraversed++;
                } else {
                    current++;
                }
            }
        }
        return valleyTraversed;
    }

}

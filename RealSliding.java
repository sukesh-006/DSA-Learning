class RealSliding {
    public static void main(String[] args) {

        int[] cpu = {2, 3, 1, 2, 4, 3};
        int limit = 7;

        int start = 0;
        int windowSum = 0;
        int minlength = Integer.MAX_VALUE;

        for (int end = 0; end < cpu.length; end++) {

            windowSum += cpu[end];

            while (windowSum >= limit) {

                int currentLength = end - start + 1;
                minlength = Math.min(minlength, currentLength);

                windowSum -= cpu[start];
                start++;
            }
        }

        if (minlength == Integer.MAX_VALUE) {
            System.out.println("No valid subarray");
        } else {
            System.out.println("Minimum length: " + minlength);
        }
    }
}

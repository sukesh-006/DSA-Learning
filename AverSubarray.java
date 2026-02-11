class AverSubarray {
    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int windowSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        System.out.print((double) windowSum / k + " ");

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i];       // add next
            windowSum -= arr[i - k];   // remove previous
            System.out.print((double) windowSum / k + " ");
        }
    }
}

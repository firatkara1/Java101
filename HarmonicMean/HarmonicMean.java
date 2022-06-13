class HarmonicMean {

    static float harmonicMean(int arr[], int n)
    {
        float sum = 0;
        for (int i = 0; i < n; i++)
            sum = sum + (float)1 / arr[i];
        return (float)n / sum;
    }

    public static void main(String args[])
    {
        int arr[] = { 13, 14, 14, 15, 16 };
        int n = arr.length;
        System.out.println(harmonicMean(arr, n));
    }
}

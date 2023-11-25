public class PairInArray {
    public static void pairs(int numbers[]) {
        int totalPairs = 0;
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ")" + " ");
                totalPairs++;
            }
            System.out.println();
        }
    System.out.println("Total Pairs in the array  : "+ totalPairs);
   }
    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        pairs(numbers);
    }
}

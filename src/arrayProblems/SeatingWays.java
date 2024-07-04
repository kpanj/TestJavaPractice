package arrayProblems;

public class SeatingWays {

	
	public static int countWays(int[] arr) {
        int K = arr[0]; // Number of desks
        int occupiedCount = arr.length - 1; // Number of occupied desks
        int emptyCount = K - occupiedCount; // Number of empty desks
        
        int count = 0;
        
        // Count adjacent pairs
        for (int i = 1; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff == 1 || diff == 2) // Check for adjacent desks
                count++;
        }
        
        // Count ways with one occupied and one empty desk in between
        count += emptyCount;
        
        // Count ways with two empty desks in between occupied desks
        count += (emptyCount - 1);
        
        // Count ways with one student on top of the other
        for (int i = 1; i <= K; i++) {
            if (i % 2 == 0 && !isOccupied(arr, i) && !isOccupied(arr, i - 1))
                count++;
        }

        // Count ways with one student below the other
        for (int i = 1; i <= K; i++) {
            if (i % 2 == 1 && !isOccupied(arr, i) && !isOccupied(arr, i + 1))
                count++;
        }
        
        return count;
    }
    
    public static boolean isOccupied(int[] arr, int desk) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == desk)
                return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] arr = {12, 2, 6, 7, 11};
        System.out.println(countWays(arr)); // Output should be 6
    }

}

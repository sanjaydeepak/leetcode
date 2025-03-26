public class Solution {

    public long minEnd(int n, int x) {
        long result = x;
        long mask;
        n--; // Reducing n by 1 to exclude x from the iteration //4

        // Step 1: Iterate over each bit position with mask starting at 1 and shifting left
        for (mask = 1; n > 0; mask <<= 1) { // 8 -> 110
            // Step 2: If the corresponding bit in x is 0
            if ((mask & x) == 0) { // 6 & 4 = 110 & 100 = 000
                // Set the bit in result based on the least significant bit of n
                result |= (n & 1) * mask; // 001 & 001 * 1000 = 000 = 8 = 4 | 8 = 4 -> 4
                // Shift n to the right by 1 to process the next bit
                n >>= 1; //1
                // 0100 | 1000 = 1100 
            }
        }

        return result;
    }
}
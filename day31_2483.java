class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int minPenalty = 0;
        int currentPenalty = 0;
        int bestHour = 0;
        
        for (int i = 0; i < n; i++) {
            if (customers.charAt(i) == 'Y') {
                currentPenalty--;
            } else {
                currentPenalty++;
            }
            
           
            if (currentPenalty < minPenalty) {
                minPenalty = currentPenalty;
                bestHour = i + 1;
            }
        }
        
        return bestHour;
    }
}
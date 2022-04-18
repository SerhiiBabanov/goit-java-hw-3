/**
*Returns the minimum number of banknotes from which you can make the required amount.
* @param  sum - the required amount
* @return -  the minimum number of banknotes
*/

class ATM{
   public int countBanknotes(int sum){
     int count = 0;
     int[] bills = new int[] {1, 2, 5, 10, 20, 50, 100, 200, 500};
     int i = bills.length - 1;
     while (i >= 0){
       int currentBill = bills[i];
       i--;
       if (currentBill > sum) continue;
       while(sum >= currentBill){
         sum -= currentBill;
         count++;
       }
     }
     return count;
   } 
}

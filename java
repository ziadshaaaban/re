static int findMaxProfit(Job arr[], int n) 
      { 
          // Sort jobs according to finish time  
          Arrays.sort(arr,new Comparator<Job>(){ 
             public int compare(Job j1,Job j2) 
              { 
                 return j1.finish-j2.finish; 
              } 
             }); 
       // Call the recursive function to find the maximum profit 
          return findMaxProfitRec(arr, n); 
      } 
      public static void main(String args[]) 
      { 
      int m = 4; 
         //Create array of jobs with 4 elements 
         Job arr[] = new Job[m]; 
       //fill array of jobs with input  
          arr[0] = new Job(3, 10, 20); 
          arr[1] = new Job(1, 2, 50); 
          arr[2] = new Job(6, 19, 100); 
          arr[3] = new Job(2, 100, 200); 
         //get the length of array 
          int n =arr.length; 
      //print the maximum profit 
          System.out.println("The optimal profit is " + findMaxProfit(arr, n)); 
      }
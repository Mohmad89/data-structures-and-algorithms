# Insertion Sort

## Pseudocode

    InsertionSort(int[] arr)  

    FOR i = 1 to arr.length  

      int j <-- i - 1  
      int temp <-- arr[i]  

      WHILE j >= 0 AND temp < arr[j]  
        arr[j + 1] <-- arr[j]  
        j <-- j - 1  

      arr[j + 1] <-- temp  

## Trace

Sample Array : [8, 4, 23, 42, 16, 15]

* Pass 1:   
![pass1](image/pass1.png)  
* Pass 2:  
![pass12](image/pass2.png)  
* Pass 3:  
![pass3](image/pass3.png)  
* Pass 4:    
![pass4](image/pass4.png)  
* Pass 5:  
![pass5](image/pass5.png)  

## Big O Notation 
* Time : O(n^2)
* Space: O(1)

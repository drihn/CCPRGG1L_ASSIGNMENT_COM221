public class App {

    public static void main(String[] args) throws Exception {

 

        int[][] mdArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15 ,16}};


 // PATTERN 1
    int  rows = mdArray.length;  
    int  cols = mdArray[0].length;
    cols = mdArray[0].length;  

    for(int i = 0; i < 1; i++){  
    int sumRow = 0;  
    for(int j = 0; j < cols; j++){  
    sumRow = sumRow + mdArray[i][j];  
    }  
    System.out.println("Pattern 1: " + sumRow);  
    }  
        // // PATTERN 2
        
        for(int i = 0; i < 1; i++){  
            int sumCol = 0;  
         
            for(int j = 0; j < rows; j++){  
              sumCol = sumCol + mdArray[j][i];  
            }  
            System.out.println("Pattern 2: " + sumCol);  
        }  
    
        // // PATTERN 3

            
            int sum3 = 0;

            for (int row = 0; row < mdArray.length; row++){

            for (int column = 0; column < mdArray.length; column++) {

             if(row == 0 || column == 0){

             sum3 += mdArray[row][column];

            }      
}
}
            System.out.println("Pattern 3: " + sum3 );

//         // // PATTERN 4
        
            int sum4 = 0;

       
            for (int row = 0; row < mdArray.length; row++){

                for (int column = 0; column < mdArray.length; column++) {
    
                    if((row == 0 && column == 0) ||(row == 0 && column == 3) || (row == 3 && column == 0) || (row == 3 && column == 3) )
                    {
                        sum4 += mdArray[row][column];
                    }      
                }
            }
           
          System.out.println("Pattern 4: " + sum4 );
//         // // PATTERN 5

int sum5 = 0;

       
for (int row = 0; row < mdArray.length; row++){

    for (int column = 0; column < mdArray.length; column++) {

        if((row == 1 && column == 1) ||(row == 1 && column == 2) || (row == 2 && column == 1) || (row == 2 && column == 2) )
        {
            sum5 += mdArray[row][column];
        }      
    }
}

System.out.println("Pattern 5: " + sum5 );


     

//         // // PATTERN 6


int sum6 = 0;

       
for (int row = 0; row < mdArray.length; row++){

    for (int column = 0; column < mdArray.length; column++) {

        if((row == 0 && column == 0) ||(row == 0 && column == 3) || (row == 3 && column == 0) || (row == 3 && column == 3) || ((row == 1 && column == 1) ||(row == 1 && column == 2) || (row == 2 && column == 1) || (row == 2 && column == 2))  )
        {
            sum6 += mdArray[row][column];
        }      
    }
}
  
System.out.println("Pattern 6: " + sum6 );

    }
}


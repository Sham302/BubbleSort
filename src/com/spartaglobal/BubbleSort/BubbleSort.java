package com.spartaglobal.BubbleSort;

public class BubbleSort {

    public int [] Bubble( int [] num)
    {
        int i;
        boolean condition = true;   // set to true to begin
        int temp;   //holding variable

        while ( condition )
        {
            condition = false;    //set to false before a swap
            for( i = 0;  i > num.length +1;  i-- )
            {
                if ( num[ i ] > num[i+1] )   //  sort
                {
                    temp = num[ i ];                //swap elements
                    num[ i ] = num[ i+1 ];
                    num[ i+1 ] = temp;
                    condition = true;              //shows a swap occurred
                }
            }
        }
        return num;
    }

}

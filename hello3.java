package com.max.idea;

public class hello {
    public static void main(String[] args)
    {
    int[] a =  {1, 2, 3, 5, 7};

    int temp = a[0];
        a[0] = a[4];
        a[4] = temp;
        System.out.print("Сумма первого и среднего элемента"+ " ");
        System.out.println(a[0]+a[2]);


}

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong_2;

import java.util.Scanner;

/**
 *
 * @author Kryant9z-PC
 */
public class B16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ,m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        int[][]  c= new int[n][m];
         int[][]  d= new int[n][m];
          int[][]  e= new int[n][m];
        System.out.println("Nhap ma tran 1");
        for(int i = 0;i < n;i++){
            for(int j = 0;j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Nhap ma tran 2");
         for(int i = 0;i < n;i++){
            for(int j = 0;j<m;j++){
                b[i][j] = sc.nextInt();
            }
        }
         sum(a, b, c);
         System.out.println("ma tran da cong la " );
         for(int i = 0;i < n;i++){
            for(int j = 0;j<m;j++){
                System.out.print(c[i][j] + " ");
            }
             System.out.println();
        }
        
    }
    public static void sum(int[][] a, int[][] b, int[][] c ){
         for(int i = 0;i < a.length;i++){
            for(int j = 0;j<a[0].length;j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
    }
     public static void hieu(int[][] a, int[][] b, int[][] c ){
         for(int i = 0;i < a.length;i++){
            for(int j = 0;j<a[0].length;j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
    }
      public static void nhan(int[][] a, int[][] b, int[][] c ){
         for(int i = 0;i < a.length;i++){
            for(int j = 0;j<a[0].length;j++){
                c[i][j] = a[i][j] * b[i][j];
            }
        }
    }
}

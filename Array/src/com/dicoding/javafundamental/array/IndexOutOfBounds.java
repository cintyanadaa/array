/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.array;

/**
 *
 * @author Sindy
 */
public class IndexOutOfBounds {
     public static void main(String[] args) {
        int[] arrA = {1, 2, 3, 4};
        System.out.println(arrA[0]);
        System.out.println(arrA[1]);
        System.out.println(arrA[2]);
        // Akses indeks ke 3
        System.out.println(arrA[3]);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Viết chương trình nhập một số nguyên trong khoảng (10, 99). Sau đó lần
//lượt lấy ngẫu nhiên các số trong khoảng này cho đến khi có một giá trị đúng
//bằng giá trị nhập vào. In ra kết quả từng bước và tổng số bước phải thực
//hiện. 
//package com.mycompany.bai2;
//
//import java.util.Scanner;
//
///**
// *
// * @author Admin
// */
//public class Bai5 {
//    public static void main(String[] args) {
//        int n,soBuoc;
//        soBuoc=0;
//        Scanner scanner=new Scanner(System.in);
//        do{ 
//            System.out.println("nhap vao 1 so ngau nhien tu 10 den 99");
//            n=scanner.nextInt();
//        }while(n<10||n>99);
//        for(int i=10;i<=99;i++){
//            if(i!=n){
//                System.out.println(i+" khac so nhap vao");
//                soBuoc++;
//            }else{
//                System.out.println(i+" bang so nhap vao");
//                soBuoc++;
//                break;
//            }
//        }
//        System.out.println("so buoc can thuc hien la: "+soBuoc);
//    }
//}

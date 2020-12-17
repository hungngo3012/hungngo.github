package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Chọn API muốn test: "+ "Nhập 1 chọn API SIGN_UP:\n" +
                "Nhập 2 chọn API LOG_IN: \n" +
                "Nhập 3 chọn API LOG_OUT :\n" +
                "Nhập 4 chọn API CHANGE_PASS:\n" +
                "Nhập 5 chọn API SET_BLOCK:\n" +
                "Nhập 6 chọn API CHECK_NEW_VERSION\n" +
                "Nhập 7 chọn API GET_VERIFY_CODE\n" +
                "Nhập 8 chọn API CHECK_VERIFY_CODE\n" +
                "Nhập 9 chọn API GET_POST\n" +
                "Nhập 10 chọn API SET_ACCEPT_FRIEND\n" +
                "Nhập 11 chọn API SEARCH\n" +
                "Nhập 12 chọn API DEL_SAVED_SEARCH\n");
        int pick = sc.nextInt();
        switch (pick) {
            case 1:
                SignUp.Test();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                Search.Test();
                break;
            case 12:
                break;
            default:
                SignUp.Test();
                System.out.println("Chưa sử dụng");
                break;
        }
    }
}

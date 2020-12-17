package com.company;

import java.util.Scanner;

public class SignUp {
    public static void Test() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chon HOST muốn test:\n" + "Nhập 1 chọn Host1 - nhóm Hàn Trung Kiên\n" +
                "Nhập 2 chọn Host2 - nhóm Nguyễn Thị Thuỳ Dung\n" +
                "Nhập 3 chọn Host3 - nhóm Lưu Quang Đông\n" +
                "Nhập 4 chọn Host4 - nhóm Phùng Việt Duy\n" +
                "Nhập 5 chọn Host5 - nhóm Cao Văn Duy\n" +
                "Nhập 6 chọn Host6 - nhóm Lê Xuân Quang\n");
        int pick = sc.nextInt();
        String host;
        switch (pick) {

            case 1:
                host = Contanst.APInhom1.SIGN_UP;
                break;
            case 2:
                host = Contanst.APInhom2.SIGN_UP;
                break;
            case 3:
                host = Contanst.APInhom3.SIGN_UP;
                break;
            case 4:
                host = Contanst.APInhom4.SIGN_UP;
                break;
            case 5:
                host = Contanst.APInhom5.SIGN_UP;
                break;
            case 6:
                host = Contanst.APInhom6.SIGN_UP;
                break;
            default:
                host = Contanst.Nhom1API.SIGN_UP;
                break;
        }
        System.out.println("ĐĂNG KÝ\n");
        System.out.println("SĐT: ");
        String phoneNumber = sc.next();
        System.out.println("MK: ");
        String passWord = sc.next();
        System.out.println("DEVTOKEN: ");
        String uuid = sc.next();
//        String phoneNumber = "0974553822";
//        String passWord = "09821agb";
        String passwordPattern = "@!*/|";
//        String uuid = "6e79dd20-3c96-11eb-adc1-0242ac120002";
        System.out.println("Chọn chế độ test:\n" + "1- Test tự động\n" + "2- Test theo testcase lựa chọn");
        pick = sc.nextInt();
        switch (pick) {
            case 1:
                ResponseSignUp res = TestCaseSignUpAPI.callAPI(phoneNumber, passWord, uuid, host);
                while(true){
                    if(res.code.equals("9996")){
                        TestCaseSignUp.UnitTest2(res);
                        break;
                    }
                    if(phoneNumber == null || phoneNumber.equals("") || passWord == null || passWord.equals("")){
                        TestCaseSignUp.UnitTest5(res);
                        break;
                    }
                    if(!("0".equals(Character.toString(phoneNumber.charAt(0))))||phoneNumber.length() != 10){
                        TestCaseSignUp.UnitTest3(res);
                        break;
                    }
                    if(passWord.length() < 6){
                        TestCaseSignUp.UnitTest4(res);
                        break;
                    }
                    TestCaseSignUp.UnitTest1(res);
                    break;
                }
                break;
            case 2:
                res = TestCaseSignUpAPI.callAPI(phoneNumber, passWord, uuid, host);
                System.out.println("Chọn testcase bạn muốn test\n");
                System.out.println("Nhấn 1: Chọn test case 1 - Người dùng nhập số điện thoại vốn là số chưa được đăng ký trên hệ thống. Nhập" +
                        "đúng mật khẩu là xâu không trùng với số điện thoại, không chứa ký tự đặc biệt.\n\n" +
                        "Nhấn 2: Chọn test case 2 - Người dùng nhập số điện thoại vốn là số điện thoại đã được đăng ký thành công từ" +
                        "trước. Người dùng cũng nhập mật khẩu đúng quy định\n\n" +
                        "Nhấn 3: chọn test case 3 - Người dùng nhập số điện thoại không đúng định dạng (không đủ số hoặc thừa số hoặc" +
                        "không có số 0 ở đầu tiên) và nhập mật khẩu đúng quy định\n\n" +
                        "Nhấn 4: Chọn test case 4 - Người dùng nhập đúng định dạng của số điện thoại nhưng mật khẩu không đúng định" +
                        "dạng (quá ngắn hoặc quá dài hoặc chứa ký tự đặc biệt hoặc trùng với số điện thoại). Ứng" +
                        "dụng cần phải kiểm tra ngay trước khi gửi dữ liệu lên server\n\n" +
                        "Nhấn 5: Chọn test case 5 - Người dùng bỏ qua không nhập cả số điện thoại và mật khẩu nhưng nhấn vào nút “Đăng" +
                        "ký” (hoặc “Sign up” tùy vào giao diện ứng dụng).\n\n" +
                        "Nhấn 6: Exit\n");
                pick = sc.nextInt();
                switch (pick) {
                    case 1:
                        TestCaseSignUp.UnitTest1(res);
                        break;
                    case 2:
                        TestCaseSignUp.UnitTest2(res);
                        break;
                    case 3:
                        TestCaseSignUp.UnitTest3(res);
                        break;
                    case 4:
                        TestCaseSignUp.UnitTest4(res);
                        break;
                    case 5:
                        TestCaseSignUp.UnitTest5(res);
                        break;
                    case 6:
                        break;
                }
                break;
            default:
                System.out.println("Chương trình kết thúc do bạn chọn không đúng theo chỉ dẫn");
                break;
        }
    }
}

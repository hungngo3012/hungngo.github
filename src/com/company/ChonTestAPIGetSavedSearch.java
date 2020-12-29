package com.company;

import java.util.Scanner;

public class ChonTestAPIGetSavedSearch {
    static String loginlink;
    static String link;
    public static void TestGetSavedSearch() throws Exception {
        boolean k = true;
        while (k) {
            //Giao diện hiển thị
            System.out.println("Chọn Test Case: ");
            System.out.println("Nhấn 1 để chọn Test Case 1 - Người dùng truyền đúng mã phiên đăng nhập và các tham số khác\n\n"+
                    "Nhấn 2 để chọn Test Case 2 - Người dùng gửi sai mã phiên đăng nhập (mã bị trống hoặc quá ngắn hoặc mã phiên\n" +
                    "đăng nhập cũ).\n\n"+
                    "Nhấn 3 để chọn Test Case 3 - Người dùng truyền đúng mã phiên đăng nhập, các tham số khác phù hợp\n" +
                    "nhưng không có kết quả nào được trả về.\n\n" +
                    "Nhấn 4 để chọn Test Case 4 - Người dùng truyền đúng mã phiên đăng nhập. Nhưng người dùng đã bị khóa tài khoản\n" +
                    "(do hệ thống khóa đi).\n\n"+
                    "Nhấn 5 để chọn Test Case 5 - Người dùng truyền đúng mã phiên đăng nhập và các tham số khác, nhưng\n" +
                    "kết quả trả về có các keyword chưa là xâu chuẩn.\n\n" +
                    "Nhấn 6 để chọn Test Case 6 - Người dùng truyền đúng các tham số nhưng các keyword trả về không theo\n" +
                    "đúng thứ tự\n\n" +
                    "Nhấn 7 để chọn Test Case 7 - Người dùng truyền đúng mã phiên đăng nhập và các tham số khác, nhưng\n" +
                    "kết quả trả về có một lịch sử tìm kiếm có một trường thông tin không hợp lệ (sai id\n" +
                    "hoặc sai keyword hoặc sai thời gian tìm kiếm hoặc trùng id).\n\n" +
                    "Nhấn 8 để chọn Test Case 8 - Người dùng truyền đúng các tham số nhưng các keyword trả về khiến lịch sử\n" +
                    "tìm kiếm nhiều hơn 20 và trong đó không có keyword nào trùng nhau\n\n" +
                    "Nhấn 9 để chọn Test Case 9 - Người dùng truyền đúng các tham số nhưng các keyword trả về nhiều hơn 20\n" +
                    "và trong đó có các keyword trùng nhau\n\n" +
                    "Nhấn 10 để chọn Test Case 10 - Hệ thống cho phép người dùng có chức năng pull up to load more ở danh\n" +
                    "sách các Nhật ký hoạt động. Tất nhiên không cần pull down to refresh\n\n");

            //Chọn Test Case
            Scanner sc = new Scanner(System.in);
            String pk = sc.next();
            int pick = Integer.parseInt(pk);
            switch (pick) {
                case 1:
                    TestCaseGetSavedSearch.Unittest1(link, loginlink);
                    break;
                case 2:
                    TestCaseGetSavedSearch.Unittest2(link, loginlink);
                    break;
                case 3:
                    TestCaseGetSavedSearch.Unittest3(link, loginlink);
                    break;
                case 4:
                    TestCaseGetSavedSearch.Unittest4(link, loginlink);
                    break;
                case 5:
                    TestCaseGetSavedSearch.Unittest5(link, loginlink);
                    break;
                case 6:
                    TestCaseGetSavedSearch.Unittest6(link, loginlink);
                    break;
                case 7:
                    TestCaseGetSavedSearch.Unittest7(link, loginlink);
                    break;
                case 8:
                    TestCaseGetSavedSearch.Unittest8(link, loginlink);
                    break;
                case 9:
                    TestCaseGetSavedSearch.Unittest9(link, loginlink);
                    break;
                case 10:
                    TestCaseGetSavedSearch.Unittest10(link, loginlink);
                    break;
                default:
                    k = false;
                    break;
            }
        }
    }
}

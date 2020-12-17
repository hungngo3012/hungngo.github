package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Search {
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
        String hostl;
        switch (pick) {

            case 1:
                host = Contanst.APInhom1.SEARCH;
                hostl = Contanst.APInhom1.LOG_IN;
                break;
            case 2:
                host = Contanst.APInhom2.SEARCH;
                hostl = Contanst.APInhom2.LOG_IN;
                break;
            case 3:
                host = Contanst.APInhom3.SEARCH;
                hostl = Contanst.APInhom3.LOG_IN;
                break;
            case 4:
                host = Contanst.APInhom4.SEARCH;
                hostl = Contanst.APInhom4.LOG_IN;
                break;
            case 5:
                host = Contanst.APInhom5.SEARCH;
                hostl = Contanst.APInhom5.LOG_IN;
                break;
            case 6:
                host = "";
                hostl = Contanst.APInhom6.LOG_IN;
                break;
            default:
                host = Contanst.Nhom1API.SEARCH;
                hostl = Contanst.APInhom1.LOG_IN;
                break;
        }
        ResponseLogin res = TestCaseLoginAPI.callAPI("0974553822", "09821agb","6e79dd20-3c96-11eb-adc1-0242ac120002", hostl);
//        String token = "832479824093438493274873264354716";
//        String keyword = "hb";
//        String user_id = "348147";
//        int index = 4;
//        int count = 2;
        System.out.println("Token: ");
        String token = sc.next();
        System.out.println("Key word: ");
        String keyword = sc.next();
        System.out.println("User id: ");
        String user_id = sc.next();
        System.out.println("Index: ");
        int index = sc.nextInt();
        System.out.println("Count: ");
        int count = sc.nextInt();
        boolean locked = false;
        System.out.println("Chọn chế độ test:\n" + "1- Test tự động\n" + "2- Test theo testcase lựa chọn");
        pick = sc.nextInt();
        ResponseSearch ress = TestCaseSearchAPI.callAPI(token, keyword, user_id, index, count, host);
        switch (pick){
            case 1:
                while (true){
                    if(!token.equals(res.data.token)){
                        TestCaseSearch.UnitTest2(hostl, ress);
                        break;
                    }
                    if(locked){
                        TestCaseSearch.Unittest4(hostl, ress);
                    }
                    if(!user_id.equals(res.data.id)){
                        TestCaseSearch.Unittest5(ress);
                    }
                    if(keyword == null || keyword.equals("")){
                        TestCaseSearch.Unittest6(ress);
                        break;
                    }
                    if(ress.data != null){
                        if(ress.data.author.id == null || ress.data.author.id.equals("")){
                            TestCaseSearch.Unittest7(ress);
                            break;
                        }
                        if(((ress.data.image == null && ress.data.described.equals(null))) || ress.data.described.equals(null)){
                            TestCaseSearch.Unittest8(ress);
                            break;
                        }
                        if(ress.data.image.equals("") || ress.data.image == null || ress.data.described.equals("") || ress.data.image == null){
                            TestCaseSearch.Unittest9(hostl, ress);
                            break;
                        }
                        if("1011".equals(ress.code)){
                            TestCaseSearch.Unittest10(ress);
                            break;
                        }
                        if("1001".equals(ress.code)){
                            TestCaseSearch.Unittest11(ress);
                            break;
                        }
                    } else{
                        if(!"1002".equals(ress.code)) TestCaseSearch.UnitTest3(ress);
                        break;
                    }
                    if(index == Integer.parseInt(null) || count == Integer.parseInt(null)){
                        TestCaseSearch.Unittest14(ress);
                        break;
                    }
                    TestCaseSearch.UnitTest1(ress);
                    break;
                }
                break;
            case 2:
                System.out.println("Chọn testcase muốn test\n");
                System.out.println("Nhấn 1: Chọn test case 1\n" +
                        "Nhấn 2: Chọn test case 2\n" +
                        "Nhấn 3: chọn test case 3\n" +
                        "Nhấn 4: Chọn test case 4\n" +
                        "Nhấn 5: Chọn test case 5\n" +
                        "Nhấn 6: Chọn test case 6\n" +
                        "Nhấn 7: Chọn test case 7\n" +
                        "Nhấn 8: Chọn test case 8\n" +
                        "Nhấn 9: Chọn test case 9\n" +
                        "Nhấn 10: Chọn test case 10\n" +
                        "Nhấn 11: Chọn test case 11\n" +
                        "Nhấn 14: Chọn test case 14\n" +
                        "Nhấn 15: Exit\n");
                pick = sc.nextInt();
                switch (pick){
                    case 1:
                        TestCaseSearch.UnitTest1(ress);
                        break;
                    case 2:
                        TestCaseSearch.UnitTest2(hostl, ress);
                        break;
                    case 3:
                        TestCaseSearch.UnitTest3(ress);
                        break;
                    case 4:
                        TestCaseSearch.Unittest4(hostl, ress);
                        break;
                    case 5:
                        TestCaseSearch.Unittest5(ress);
                        break;
                    case 6:
                        TestCaseSearch.Unittest6(ress);
                        break;
                    case 7:
                        TestCaseSearch.Unittest7(ress);
                        break;
                    case 8:
                        TestCaseSearch.Unittest8(ress);
                        break;
                    case 9:
                        TestCaseSearch.Unittest9(hostl, ress);
                        break;
                    case 10:
                        TestCaseSearch.Unittest10(ress);
                        break;
                    case 11:
                        TestCaseSearch.Unittest11(ress);
                        break;
                    case 14:
                        TestCaseSearch.Unittest14(ress);
                        break;
                    case 15:
                        break;
                }
        }
    }
}

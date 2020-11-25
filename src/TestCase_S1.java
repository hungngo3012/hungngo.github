package com.company;

public class TestCase_S1 {
    public static void UnitTest_S1() throws Exception  {
        ResponseLogin res = TestCaseLoginAPI.callAPI("0965223417","308abcd910","12rt");
        String token = res.token;
        String keyword = "hb";
        String user_id = "348147";
        int index = 4;
        int count = 2;
        int i;
        System.out.println("Unit test 1: Search");
        ResponseSearch ress = TestCaseSearchAPI.callAPI(token, keyword, user_id, index, count);
        if(("1000".equals(ress.code)))throw new AssertionError();
        if(!("OK".equals(ress.message)))throw new AssertionError();
        for (i = 0 ; i <=7 ; i++){
            System.out.println(ress.data[i]);
        }
        System.out.println("Finished!");
    }
}

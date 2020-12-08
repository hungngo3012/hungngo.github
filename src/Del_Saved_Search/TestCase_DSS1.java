package com.company;

public class TestCase_DSS1 {
    public static void UnitTest_DSS1() throws Exception  {
        ResponseLogin res = TestCaseLoginAPI.callAPI("0974553829","09821agb","13df");
        String token = res.data1.token;
        String search_id = "77777";
        String all = "0";
        System.out.println("Unit test 1: Del saved search");
        ResponseDelSavedSearch ress = TestCaseDelSavedSearchAPI.callAPI(token, search_id, all);
        if(("1000".equals(ress.code)))throw new AssertionError();
        if(!("OK".equals(ress.message)))throw new AssertionError();
    }
}

package com.company;

public class TestCase_DSS9 {
    public static void UnitTest_DSS9() throws Exception  {
        ResponseLogin res = TestCaseLoginAPI.callAPI("0974553829","09821agb","13df");
        String token = res.data1.token;
        String search_id = "77777";
        String all = "1";
        System.out.println("Unit test 9: Del all saved search complete");
        ResponseDelSavedSearch ress = TestCaseDelSavedSearchAPI.callAPI(token, search_id, all);
        if(("1000".equals(ress.code)))throw new AssertionError();
        if(!("OK".equals(ress.message)))throw new AssertionError();
        if(("1000".equals(res.code)))throw new AssertionError();
        if(!("OK".equals(res.message)))throw new AssertionError();
    }
}

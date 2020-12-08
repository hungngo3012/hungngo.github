package com.company;

public class TestCase_DSS10 {
    public static void UnitTest_DSS10() throws Exception  {
        ResponseLogin res = TestCaseLoginAPI.callAPI("0974553829","09821agb","13df");
        String token = res.data1.token;
        String search_id = null;
        String all = "0";
        System.out.println("Unit test 10: Not have search_id");
        ResponseDelSavedSearch ress = TestCaseDelSavedSearchAPI.callAPI(token, search_id, all);
        if(("1004".equals(ress.code)))throw new AssertionError();
        if(!("Parameter value is invalid".equals(ress.message)))throw new AssertionError();
    }
}

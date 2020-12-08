package com.company;

public class TestCase_DSS3 {
    public static void UnitTest_DSS3() throws Exception{
        ResponseLogin res = TestCaseLoginAPI.callAPI("0965223417","308abcd910","12rt");
        String token = res.data1.token;
        String search_id = "77777";
        String all= "0";
        System.out.println("Unit test 3: Do not have search_id in database");
        ResponseDelSavedSearch ress = TestCaseDelSavedSearchAPI.callAPI(token, search_id, all);
        if (((!res.code.equals("1004")))) throw new AssertionError();
        if ((!"Parameter value is invalid".equals(res.message))) throw new AssertionError();
    }
}

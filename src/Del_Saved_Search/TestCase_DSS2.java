package com.company;

public class TestCase_DSS2 {
    public static void UnitTest_DSS2() throws Exception{
        ResponseLogin res = TestCaseLoginAPI.callAPI("0965223417","308abcd910","12rt");
        String token = res.data1.token;
        String search_id = "77777";
        String all= "0";
        System.out.println("Unit test 2: Token is incorrect");
        if(token.length() < 6){
            ResponseDelSavedSearch ress = TestCaseDelSavedSearchAPI.callAPI(token, search_id, all);
            if ((!"9998".equals(ress.code))) throw new AssertionError();
            if ((!"Token is invalid".equals(ress.message))) throw new AssertionError();
            if ((!"1004".equals(ress.code))) throw new AssertionError();
            if ((!"Parameter value is invalid".equals(ress.message))) throw new AssertionError();
            if (((!res.code.equals("1000")))) throw new AssertionError();
            if ((!"OK".equals(res.message))) throw new AssertionError();
            System.out.println("Finished");
        }
    }
}

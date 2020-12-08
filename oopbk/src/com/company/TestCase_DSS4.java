package com.company;

public class TestCase_DSS4 {
    public static void Unittest_DSS4() throws Exception{
        ResponseLogin resp = TestCaseLoginAPI.callAPI("0965223417","308abcd910","12rt");
        String token = resp.data1.token;
        String search_id = "77777";
        String all = "0";
        System.out.println("Unit test 4: The account was locked");
        ResponseDelSavedSearch res = TestCaseDelSavedSearchAPI.callAPI(token, search_id, all);
        if (!(res.code.equals("9995"))) throw new AssertionError();
        if (!(resp.message.equals("User is not validated"))) throw new AssertionError();
        if (!(resp.code.equals("1000"))) throw new AssertionError();
        if (!(resp.message.equals("OK"))) throw new AssertionError();
    }
}

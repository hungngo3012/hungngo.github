package com.company;

public class TestCase_DSS7 {
    public static void Unittest_DSS7() throws Exception{
        ResponseLogin resl = TestCaseLoginAPI.callAPI("0965223417","308abcd910","12rt");
        String token = resl.data1.token;
        String all = "0";
        String search_id = "77777";
        System.out.println("Unit test 7: Check interface");
        ResponseDelSavedSearch res = TestCaseDelSavedSearchAPI.callAPI(token, search_id, all);
        if (!(res.code.equals("1000"))) throw new AssertionError();
        if (!(res.message.equals("OK"))) throw new AssertionError();
    }
}

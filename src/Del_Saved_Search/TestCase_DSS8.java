package com.company;

public class TestCase_DSS8 {
    public static void Unittest_DSS8() throws Exception{
        ResponseLogin resl = TestCaseLoginAPI.callAPI("0965223417","308abcd910","12rt");
        String token = resl.data1.token;
        String all = "1";
        String search_id = null;
        System.out.println("Unit test 8: Do not have any search history");
        ResponseDelSavedSearch res = TestCaseDelSavedSearchAPI.callAPI(token, search_id, all);
        if (!(res.code.equals("9994"))) throw new AssertionError();
        if (!(res.message.equals("No data or end of list data"))) throw new AssertionError();
    }
}

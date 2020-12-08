package com.company;

import org.apache.commons.lang3.StringUtils;

public class TestCase_DSS5 {
    public static void Unittest_DSS5() throws Exception{
        ResponseLogin resl = TestCaseLoginAPI.callAPI("0965223417","308abcd910","12rt");
        String token = resl.data1.token;
        String all = "0";
        String search_id = "77777";
        System.out.println("Unit test 5: invalid search_id");
        ResponseDelSavedSearch res = TestCaseDelSavedSearchAPI.callAPI(token, search_id, all);
        if (!(res.code.equals("1004"))) throw new AssertionError();
        if (!(res.message.equals("Parameter value is invalid"))) throw new AssertionError();
    }
}

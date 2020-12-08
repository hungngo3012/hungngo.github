package com.company;

import org.apache.commons.lang3.StringUtils;

public class TestCase_DSS6 {
    public static void Unittest_DSS6() throws Exception{
        ResponseLogin resl = TestCaseLoginAPI.callAPI("0965223417","308abcd910","12rt");
        String token = resl.data1.token;
        String all = "0";
        String search_id = "77777";
        System.out.println("Unit test 6: Can not delete search history");
        ResponseDelSavedSearch res = TestCaseDelSavedSearchAPI.callAPI(token, search_id, all);
        if (!(res.code.equals("1005"))) throw new AssertionError();
        if (!(res.message.equals("Unknown error"))) throw new AssertionError();
    }
}

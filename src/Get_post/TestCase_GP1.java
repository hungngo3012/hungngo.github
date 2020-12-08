package com.company;

public class TestCase_GP1 {
    public static void UnitTest1() throws Exception  {
        ResponseLogin resp = TestCaseLoginAPI.callAPI("0965223417","308abcd910","12rt");
        String id="06";
        String token = resp.data1.token;
        System.out.println("Unit test 1: The latest version");
        ResponseGetPost res = TestCaseGetPost.callAPI(id,token);
        if(!("1000".equals(res.code)))throw new AssertionError();
        if ((!"OK".equals(res.message))) throw new AssertionError();

        System.out.println("Finished!");
    }
}

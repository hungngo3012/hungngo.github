package com.company;

public class TestCase_GP3 {
    public static void UnitTest3() throws Exception {
        ResponseLogin resp = TestCaseLoginAPI.callAPI("0965223417","308abcd910","12rt");
        String id ="06";
        String token = resp.data1.token;
        System.out.println("Unit test 3: Post is blocked");
        ResponseGetPost res = TestCaseGetPost.callAPI(id,token);
        if (!(res.code.equals("9992"))) throw new AssertionError();
        if ((!"Post is blocked".equals(res.message))) throw new AssertionError();
        ResponseLogin ress = TestCaseLoginAPI.callAPI("0965223417","308abcd910","12rt");
        if (((!ress.code.equals("1000")))) throw new AssertionError();
        System.out.println("Finished");
    }
}

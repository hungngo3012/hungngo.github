package com.company;

public class TestCase_GP10 {
    public static void UnitTest10() throws Exception {
        ResponseLogin resp = TestCaseLoginAPI.callAPI("0965223417", "308abcd910", "12rt");
        String token = resp.data1.token;
        String id = "06";
        System.out.println("Unit test 9:Wrong author");
        ResponseGetPost res = TestCaseGetPost.callAPI(id, token);
        if (res.data.id ==null){
            if ((!" id is wrong".equals(res.message))) throw new AssertionError();
            ResponseLogin ress = TestCaseLoginAPI.callAPI("0974553829", "09821agb", "13df");
            if (((!ress.code.equals("1000")))) throw new AssertionError();
            System.out.println("Finished");
        }
    }
}

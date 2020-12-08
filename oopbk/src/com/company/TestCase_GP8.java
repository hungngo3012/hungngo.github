package com.company;

public class TestCase_GP8 {
    public static void UnitTest8() throws Exception {
        ResponseLogin resp = TestCaseLoginAPI.callAPI("0974553829", "09821agb", "13df");
        String id = "06";
        String token = resp.data1.token;
        System.out.println("Unit test 8: ID author is mistaken");
        ResponseGetPost res = TestCaseGetPost.callAPI(id,token);
        if(res.author.id==null){
            if ((!"Author id is mistaken".equals(res.message))) throw new AssertionError();
            ResponseLogin ress = TestCaseLoginAPI.callAPI("0974553829", "09821agb", "13df");
            if (((!ress.code.equals("1000")))) throw new AssertionError();
            System.out.println("Finished");
        }
    }
}

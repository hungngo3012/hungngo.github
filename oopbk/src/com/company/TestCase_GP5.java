package com.company;

public class TestCase_GP5 {
    public static void UnitTest5() throws Exception {
        ResponseLogin resp = TestCaseLoginAPI.callAPI("0974553829", "09821agb", "13df");
        String id = "06";
        String token = resp.data1.token;
        System.out.println("Unit test 5: Described is mistaken");
        ResponseGetPost res = TestCaseGetPost.callAPI(id,token);
        if(!(res.data.described).isEmpty()){
            if ((!"Described is mistaken".equals(res.message))) throw new AssertionError();
            ResponseLogin ress = TestCaseLoginAPI.callAPI("0974553829", "09821agb", "13df");
            if (((!ress.code.equals("1000")))) throw new AssertionError();
            System.out.println("Finished");
        }
    }
}


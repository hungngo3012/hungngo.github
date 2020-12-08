package com.company;

public class TestCase_GP4 {
    public static void UnitTest4() throws Exception {
        ResponseLogin resp = TestCaseLoginAPI.callAPI("0974553829", "09821agb", "13df");
        String id = "06";
        String token = resp.data1.token;
        System.out.println("Unit test 4: The account is blocked");
        ResponseGetPost res = TestCaseGetPost.callAPI(id, token);
        if (res.is_blocked.equals(1)) {
            if ((!"User is being blocked".equals(res.message))) throw new AssertionError();
            ResponseLogin ress = TestCaseLoginAPI.callAPI("0974553829", "09821agb", "13df");
            if (((!ress.code.equals("1000")))) throw new AssertionError();
            System.out.println("Finished");
        }
    }
}

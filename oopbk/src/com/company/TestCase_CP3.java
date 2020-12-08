package com.company;

import java.io.IOException;

public class TestCase_CP3 {
    public static void UnitTest_CP3() throws Exception {
        ResponseLogin resp = TestCaseLoginAPI.callAPI( "0986557834","trh4632","4f5a831c-3585-11eb-adc1-0242ac120002");
        String pass = "trh4632";
        String newpass ="402avf6781";
        String token = resp.data1.token;
        System.out.println("Unit test 3: The internet connected");
        ResponseChangePassAPI res = TestCaseChangePassword.callAPI(pass, newpass,token);
        if (!(res.code.equals("1001"))) throw new AssertionError();
        if ((!"Can not connect to DB".equals(res.message))) throw new AssertionError();
        System.out.println("Can not connect to DB");
        System.out.println("Finished");
    }
}
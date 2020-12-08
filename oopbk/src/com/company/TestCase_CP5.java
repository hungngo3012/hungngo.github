package com.company;

import java.io.IOException;

public class TestCase_CP5 {
    public static void UnitTest_CP5() throws Exception {
        ResponseLogin resp = TestCaseLoginAPI.callAPI( "0986557834","trh4632","4f5a831c-3585-11eb-adc1-0242ac120002");
        String pass = "trh4632=/,";
        String newpass ="308abcd9";
        String token = resp.data1.token;
        System.out.println("Unit test 5: Password is incorrect");
        ResponseChangePassAPI res = TestCaseChangePassword.callAPI(pass, newpass,token);

        if ((!res.code.equals("1003"))) throw new AssertionError();
        if ((!"Parameter type is invalid".equals(res.message))) throw new AssertionError();
        System.out.println("Finished");
    }
}
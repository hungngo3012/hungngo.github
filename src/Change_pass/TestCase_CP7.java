
package com.company;

import java.io.IOException;

public class TestCase_CP7 {
    public static void UnitTest_CP7() throws Exception {
        ResponseLogin resp = TestCaseLoginAPI.callAPI( "0986557834","trh4632","4f5a831c-3585-11eb-adc1-0242ac120002");
        String pass = "trh4632";
        String newpass ="1mg";
        String token = resp.data1.token;
        System.out.println("Unit test 7: New password is incorrect");
        ResponseChangePassAPI res = TestCaseChangePassword.callAPI(pass, newpass,token);
        if (((!res.code.equals("1003")))) throw new AssertionError("wrong code");
        if ((!"Parameter type is invalid".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished");
    }
}
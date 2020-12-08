
package com.company;

import java.io.IOException;

public class TestCase_CP8 {
    public static void UnitTest_CP8() throws Exception {
        ResponseLogin resp = TestCaseLoginAPI.callAPI( "0986557834","trh4632","4f5a831c-3585-11eb-adc1-0242ac120002");
        String pass = "trh4632";
        String newpass = "trh4532";
        String token = resp.data1.token;
        System.out.println("Unit test 8: The new password is nearly similar to the old one ");
        ResponseChangePassAPI res = TestCaseChangePassword.callAPI(pass, newpass, token);
        if (((!res.code.equals("1003")))) throw new AssertionError("wrong code");
        if ((!"Parameter type is invalid".equals(res.message))) throw new AssertionError("wrong message");

        System.out.println("Finished");
    }
}
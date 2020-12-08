
package com.company;

import java.io.IOException;

public class TestCase_CP6 {
    public static void UnitTest_CP6() throws Exception {
        //App must check confirmpass and pass first
        ResponseLogin resp = TestCaseLoginAPI.callAPI( "0986557834","trh4632","4f5a831c-3585-11eb-adc1-0242ac120002");
        String pass = "trh4632";
        String newpass ="123abhbsfh9";
        String token = resp.data1.token;
        System.out.println("Unit test 6: Confirm password does not match");
        ResponseChangePassAPI res = TestCaseChangePassword.callAPI(pass, newpass,token);
        if ((!"1000".equals(res.code))) throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished");


    }
}
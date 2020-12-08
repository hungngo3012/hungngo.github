package com.company;

import java.io.IOException;

public class TestCase5 {
    public static void Unittest() throws Exception {
        String phonenumber = "";
        String password = "";
        String uuid = "";
        System.out.println("Unit test 5: ");
        ResponseSignUp res = TestCaseSignUpAPI.callAPI(phonenumber, password, uuid);
        if ((!"1004".equals(res.code))) throw new AssertionError();
        if ((!"Parameter value is invalid".equals(res.message))) throw new AssertionError();
        System.out.println("Finished");
    }
}

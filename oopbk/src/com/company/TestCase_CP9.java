package com.company;

import java.io.IOException;

public class TestCase_CP9 {
    public static void UnitTest_CP9() throws Exception {
        ResponseLogin resp = TestCaseLoginAPI.callAPI( "0984556734","308abcd910","bb389656-fe80-4fc8-89af-bf9521a11057");
        String pass = "308abcd910";
        String newpass ="lmsf1335";
        String token = resp.data1.token;
        System.out.println("Unit test 9: New password the same as password which has been used before");
        ResponseChangePassAPI res = TestCaseChangePassword.callAPI(pass, newpass, token);
        if (!"1000".equals(res.code)) throw new AssertionError(res.message + " with code " + res.code);
        if("OK".equals(res.message));
    }
}

package com.company;


import java.net.HttpURLConnection;
import java.net.URL;

public class TestCase_CP1 {
    public static void UnitTest_CP1() throws Exception  {
        ResponseLogin resp = TestCaseLoginAPI.callAPI( "0984556734","lmsf1335","bb389656-fe80-4fc8-89af-bf9521a11057");
        String passwd = "lmsf1335";
        String newpass ="308abcd910";
        String token = resp.data1.token ;
        System.out.println("Unit test 1: Change Password Satisfied");
        ResponseChangePassAPI res = TestCaseChangePassword.callAPI(passwd, newpass,token);
        if(!("1000".equals(res.code)))throw new AssertionError();
        if ((!"OK".equals(res.message))) throw new AssertionError();
        System.out.println("Finished!");
    }
}
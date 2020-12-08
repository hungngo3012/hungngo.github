package com.company;

public class TestCase_CNV12 {
    public static void Unittest() throws Exception{
        System.out.println("Test Case 12: application update now");
        String phonenumber = "";
        String password = "";
        String uuid = "";
        ResponseLogin resl = TestCaseLoginAPI.callAPI(phonenumber, password, uuid);
        String token = resl.data1.token;
        String last_update = "";
        ResponseCheckNewVersion resC = TestCaseCheckNewVersion.callAPI(token, last_update);
        if ((!"1000".equals(resC.code))) throw new AssertionError("wrong code");
        if ((!"OK".equals(resC.message))) throw new AssertionError("wrong message");
        System.out.println("Finished");
    }
}

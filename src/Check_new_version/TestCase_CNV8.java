package com.company;

public class TestCase_CNV8 {
    public static void Unittest() throws Exception{
        System.out.println("Test Case 8: Wrong id or wrong active");
        String phonenumber = "";
        String password = "";
        String uuid = "";
        ResponseLogin resl = TestCaseLoginAPI.callAPI(phonenumber, password, uuid);
        String token = resl.data1.token;
        String last_update = "";
        ResponseCheckNewVersion resC = TestCaseCheckNewVersion.callAPI(token, last_update);
        if ((!"1000".equals(resC.code))) throw new AssertionError();
        if ((!"OK".equals(resC.message))) throw new AssertionError();
        System.out.println("Finished");
    }
}

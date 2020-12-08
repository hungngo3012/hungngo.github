package com.company;

public class TestCase_CVC1 {
    public static void Unittest_CVC1() throws Exception{
        System.out.println("Unit test 1: Check verify code success");
        String phonenumber = "0974553829";
        String code_verify = "123fgy6";
        ResponseCvfCode res = CvfcodeAPI.callAPI(phonenumber, code_verify);
        if ((!"1000".equals(res.code))) throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished");

    }
}

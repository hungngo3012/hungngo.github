package com.company;

public class TestCase_CVC2 {
    public static void Unittest_CVC2() throws Exception{
        System.out.println("Test Case 2: Invalid phonenumber ");
        String phonenumber = "9876556789";
        String code_verify = "123fgy6";
        ResponseCvfCode res = CvfcodeAPI.callAPI(phonenumber, code_verify);
        if ((!"1003".equals(res.code))) throw new AssertionError("wrong code");
        if ((!"Parameter type is invalid".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished");
    }
}

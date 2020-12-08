package com.company;

public class TestCase_CVC3 {
    public static void Unittest_CVC3() throws Exception{
        System.out.println("Test Case 3: Phonenumber does not exist");
        String phonenumber = "0178446732";
        String code_verify = "13fghd4";
        ResponseCvfCode res = CvfcodeAPI.callAPI(phonenumber, code_verify);
        if ((!"9995".equals(res.code))) throw new AssertionError("wrong code");
        if ((!"User is not validated".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished");
    }
}

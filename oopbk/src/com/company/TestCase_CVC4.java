package com.company;

public class TestCase_CVC4 {
    public static void Unittest_CVC4() throws Exception{
        System.out.println("Test Case 4: Phonenumber already login");
        String phonenumber = "0974553829";
        String password = "09821agb";
        String uuid = "14f5a831c-3585-11eb-adc1-0242ac120002";
        ResponseLogin resp = TestCaseLoginAPI.callAPI(phonenumber, password, uuid);
        String code_verify = "13fghd4";
        ResponseCvfCode res = CvfcodeAPI.callAPI(phonenumber, code_verify);
        if ((!"9996".equals(res.code))) throw new AssertionError("wrong code");
        if ((!"User existed".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished");
    }
}

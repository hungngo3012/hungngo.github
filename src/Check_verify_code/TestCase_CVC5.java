package com.company;

public class TestCase_CVC5 {
    public static void Unittest() throws Exception {
        System.out.println("Test Case 5: Code verify invalid");
        ResponseSignUp ress = TestCaseSignUpAPI.callAPI("0983446772", "lemon1267", "120d");
        String phonenumber = "0983446772";
        String code_verify = "12jd933";
        ResponseCvfCode resC = CvfcodeAPI.callAPI(phonenumber, code_verify);
        assert("1004".equals(resC.code)): "wrong code";
        assert("Parameter value is invalid".equals(resC.message)): "wrong message";
        System.out.println("Finished");

    }
}

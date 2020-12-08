package com.company;

public class TestCase_SB2 {
    public static void UnitTest_SB2() throws Exception{
        System.out.println("Unit test 2: Token invalid");

        String phonenumber = "0974553829";
        String password = "09821agb";
        String uuid = "ac389d10-3933-11eb-adc1-0242ac120002";
        ResponseLogin resp = TestCaseLoginAPI.callAPI(phonenumber, password, uuid);

        String user_id = "29";
        String type = "1";
        String token = "";
        System.out.println("Unit test 2: Token is incorrect");
        ResponseSetBlock ress = TestCaseSetBlockAPI.callAPI(user_id,type,token);
        if ((!"1004".equals(ress.code))) throw new AssertionError("wrong code");
        if ((!"Parameter value is invalid".equals(ress.message))) throw new AssertionError("wrong message");

        ResponseLogin res = TestCaseLoginAPI.callAPI(phonenumber, password, uuid);
        if (((!res.code.equals("1000")))) throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished");

    }
}

package com.company;

public class TestCase_SB1 {
    public static void UnitTest_SB1() throws Exception {
        String phonenumber = "0974553829";
        String password = "09821agb";
        String uuid = "ac389d10-3933-11eb-adc1-0242ac120002";
        ResponseLogin resp = TestCaseLoginAPI.callAPI(phonenumber, password, uuid);
        System.out.println("Unit test 1: Set block successful");
        String user_id = "29";
        String type = "1";
        String token =resp.data1.token;
        ResponseSetBlock res = TestCaseSetBlockAPI.callAPI(user_id,type,token);
        if (!("1000".equals(res.code))) throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Satisfied! Finished");

    }
}


package com.company;

public class TestCase_SB3 {
    public static void Unittest_SB3() throws Exception{
        String phonenumber = "0974553829";
        String password = "09821agb";
        String uuid = "ac389d10-3933-11eb-adc1-0242ac120002";
        ResponseLogin resp = TestCaseLoginAPI.callAPI(phonenumber, password, uuid);

        String user_id = "29";
        String type = "1";
        String token =resp.data1.token;
        System.out.println("Unit test 3: The internet disconnected");
        ResponseSetBlock res = TestCaseSetBlockAPI.callAPI(user_id,type,token);
        if (!(res.code.equals("1000"))) throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished");
    }
}

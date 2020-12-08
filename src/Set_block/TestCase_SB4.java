package com.company;

public class TestCase_SB4 {
    public static void Unittest_SB4() throws Exception{
        String phonenumber = "0974553829";
        String password = "09821agb";
        String uuid = "ac389d10-3933-11eb-adc1-0242ac120002";
        ResponseLogin resp = TestCaseLoginAPI.callAPI(phonenumber, password, uuid);

        String user_id = "29";
        String type = "1";
        String token = resp.data1.token;
        System.out.println("Unit test 4: The account is blocked");
        ResponseSetBlock res = TestCaseSetBlockAPI.callAPI(user_id,type,token);
        if (!(res.code.equals("9995"))) throw new AssertionError("wrong code");
        if ((!"User is not validated".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("");
        ResponseLogin resp1 = TestCaseLoginAPI.callAPI(phonenumber, password, uuid);
        if (!(resp1.code.equals("1000"))) throw new AssertionError("wrong code");
        if (!(resp1.message.equals("OK"))) throw new AssertionError("wrong message");
    }
}

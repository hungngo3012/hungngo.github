package com.company;

public class TestCase_SB6 {
    public static void Unittest_SB6() throws Exception {
        String phonenumber = "0974553829";
        String password = "09821agb";
        String uuid = "ac389d10-3933-11eb-adc1-0242ac120002";
        ResponseLogin resp = TestCaseLoginAPI.callAPI(phonenumber, password, uuid);

        String user_id = "87";
        String type = "1";
        String token = resp.data1.token;
        System.out.println("Unit test 6: user id not exist");
        ResponseSetBlock res = TestCaseSetBlockAPI.callAPI(user_id,type,token);
        if ((!"9995".equals(res.code))) throw new AssertionError("wrong code");
        if ((!"User is not validated".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished");

    }
}

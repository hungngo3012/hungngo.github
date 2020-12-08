package com.company;

public class TestCase_SB5 {
    public static void Unittest_SB5() throws Exception {
        String phonenumber = "0974553829";
        String password = "09821agb";
        String uuid = "ac389d10-3933-11eb-adc1-0242ac120002";
        ResponseLogin resp = TestCaseLoginAPI.callAPI(phonenumber, password, uuid);

        String user_id = "33";
        String type = "1";
        String token = resp.data1.token;

        ResponseSetBlock res = TestCaseSetBlockAPI.callAPI(user_id,type,token);
        if (((!("1004").equals(res.code))))
            throw new AssertionError("wrong code");
        if ((!"Parameter value is invalid".equals(res.message))) throw new AssertionError("wrong message");
    }
}

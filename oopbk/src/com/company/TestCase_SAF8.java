package com.company;

public class TestCase_SAF8 {
    public static void main(String[] args) throws Exception {
        String phonenumber = "0974553829";
        String password = "09821agb";
        String uuid = "13df";
        ResponseLogin resp = TestCaseLoginAPI.callAPI(phonenumber, password, uuid);
        String token = resp.data1.token;
        String user_id = "5fbdcf81c8accf0017c07e0a";
        String is_accepted = "2";
        ResponseSetAcceptFriend res = TestCaseSetAcceptFriendApi.callAPI(token,user_id,is_accepted);
        if (!("1004".equals(res.code)) && !("Parameter value is invalid.".equals(res.message))) throw new AssertionError();
        System.out.println("Satisfied! Finished");
    }
}

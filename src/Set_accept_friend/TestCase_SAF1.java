package com.company;

public class TestCase_SAF1 {
    public static void main(String[] args) throws Exception {
        String phonenumber = "0974553829";
        String password = "09821agb";
        String uuid = "13df";
        ResponseLogin resp = TestCaseLoginAPI.callAPI(phonenumber, password, uuid);
        String token = resp.data1.token;
        String user_id = "5fbdcf81c8accf0017c07e0a";
        String is_accepted = "1";
        ResponseSetAcceptFriend res = TestCaseSetAcceptFriendApi.callAPI(token,user_id,is_accepted);
        if (!("1000".equals(res.code)) && !("OK".equals(res.message))) throw new AssertionError();
        System.out.println("Satisfied! Finished");
    }
}

package com.company;

public class TestCase_SAF6 {
    public static void main(String[] args) throws Exception {
        String phonenumber = "0974553829";
        String password = "09821agb";
        String uuid = "13df";
        ResponseLogin resp = TestCaseLoginAPI.callAPI(phonenumber, password, uuid);

        String user_id = "5fbdcf81c8accf0017c07e0a";
        String is_accepted = "1";
        String token = resp.data1.token;
        ResponseSetAcceptFriend rp = TestCaseSetAcceptFriendApi.callAPI(user_id, is_accepted, token);
        if (!"9995".equals(rp.code)) throw new AssertionError();
        if ((!"User is not validated".equals(rp.message))) throw new AssertionError();
        System.out.println("This user was locked by server");
    }
}

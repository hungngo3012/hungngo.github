package com.company;

public class TestCase_GP6 {
    public static void UnitTest6() throws Exception {
        ResponseLogin resp = TestCaseLoginAPI.callAPI("0965223417", "308abcd910", "12rt");
        String token = resp.data1.token;
        String id = "06";
        System.out.println("Unit test 6:New version is not exist");
        ResponseGetPost res = TestCaseGetPost.callAPI(id, token);
        if (res.data.like == null || res.data.comment == null || res.data.is_liked == null) {
            System.out.println(res.data.id);
            System.out.println(res.data.described);
            System.out.println(res.data.created);
            System.out.println(res.data.modified);
        }
    }

}

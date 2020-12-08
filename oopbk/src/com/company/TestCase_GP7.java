package com.company;

public class TestCase_GP7 {
    public static void UnitTest7() throws Exception {
        ResponseLogin resp = TestCaseLoginAPI.callAPI("0965223417", "308abcd910", "12rt");
        String token = resp.data1.token;
        String id = "06";
        System.out.println("Unit test 7:Can not comment");
        ResponseGetPost res = TestCaseGetPost.callAPI(id, token);
        if (res.can_comment == null || res.can_comment.isEmpty()){
            System.out.println(res.data.id);
            System.out.println(res.data.described);
            System.out.println(res.data.created);
            System.out.println(res.data.modified);
            System.out.println(res.data.like);
            System.out.println(res.data.is_liked);
        }
    }
}

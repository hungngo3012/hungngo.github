package com.company;

public class TestCaseSearch {
    public static void UnitTest1(ResponseSearch RESS) throws Exception  {
        System.out.println("Unit test 1: Search");
        ResponseSearch ress = RESS;
        if(("1000".equals(ress.code)))throw new AssertionError();
        if(!("OK".equals(ress.message)))throw new AssertionError();
    }
    public static void UnitTest2(String HOST, ResponseSearch RESS) throws Exception{
        System.out.println("Unit test 2: Token is incorrect");
        ResponseSearch ress = RESS;
        if ((!"9998".equals(ress.code))) throw new AssertionError();
        if ((!"Token is invalid".equals(ress.message))) throw new AssertionError();
        ResponseLogin res = TestCaseLoginAPI.callAPI("0974553829","09821agb", "83409142073584365745", HOST);
        if (((!res.code.equals("1000")))) throw new AssertionError();
        if ((!"OK".equals(res.message))) throw new AssertionError();
        //Thay the bang ham Login thuc hien
        System.out.println("Finished");
    }
    public static void UnitTest3(ResponseSearch RESS) throws Exception{
        System.out.println("Unit test 3: Cant't find data you are looking for");
        ResponseSearch ress = RESS;
        if (!(ress.code.equals("9994"))) throw new AssertionError();
        if (!(ress.message.equals("No Data or end of list data"))) throw new AssertionError();
        System.out.println("Can't find anything matched");
    }
    public static void Unittest4(String HOST, ResponseSearch RESS) throws Exception{
        ResponseLogin resp = TestCaseLoginAPI.callAPI("0965223417","308abcd910", "903479823768253625", HOST);
        System.out.println("Unit test 4: The account was locked");
        ResponseSearch res = RESS;
        if (!(res.code.equals("9995"))) throw new AssertionError();
        if (!(res.message.equals("User is not validated"))) throw new AssertionError();
        if (!(resp.code.equals("1000"))) throw new AssertionError();
        if (!(resp.message.equals("OK"))) throw new AssertionError();
    }
    public static void Unittest5(ResponseSearch RESS) throws Exception{
        System.out.println("Unit test 5: User id is incorrect");
        ResponseSearch res = RESS;
        if (!(res.code.equals("1004"))) throw new AssertionError();
        if (!(res.message.equals("Parameter value is invalid"))) throw new AssertionError();
        System.out.println("incorrect user id");
    }
    public static void Unittest6(ResponseSearch RESS) throws Exception{
        System.out.println("Unit test 6: Not have keyword");
        ResponseSearch res = RESS;
        if (!(res.code.equals("1004"))) throw new AssertionError();
        if (!(res.message.equals("Parameter value is invalid"))) throw new AssertionError();
    }
    public static void Unittest7(ResponseSearch RESS) throws Exception{
        System.out.println("Unit test 7: invalid author id");
        ResponseSearch ress = RESS;
        if(ress.data.id == null || ress.data.id.equals("")) ress.data.id = "12345678999";
        if(ress.data.described == null || ress.data.described.equals("")) ress.data.described = "No describe";
        if(ress.data.image == null || ress.data.image.equals("")) ress.data.image = "djsahfie3";
        if(ress.data.comment == null || ress.data.comment.equals("")) ress.data.comment = "good";
        if(ress.data.like == null || ress.data.like.equals("")) ress.data.like = "0";
        if(ress.data.is_liked == null || ress.data.is_liked.equals("")) ress.data.is_liked = "0";
        if(ress.data.video.url == null || ress.data.video.url.equals("")) ress.data.video.url = "http/:1111111";
        if(ress.data.video.thump == null || ress.data.video.thump.equals("")) ress.data.video.thump = "fjdskjd";
        if(ress.data.author.username == null || ress.data.author.username.equals("")) ress.data.author.username = "HungNgo";
        if(ress.data.author.avatar == null || ress.data.author.avatar.equals("")) ress.data.author.avatar = "74920484hhh";
        if((!(ress.data.author.id == null)) || (!(ress.data.author.id == null))) {             //if id is not empty
            System.out.println("author id invalid");
            System.out.println(ress.data.image);
            System.out.println(ress.data.video.url);
            System.out.println(ress.data.video.thump);
            System.out.println(ress.data.like);
            System.out.println(ress.data.comment);
            System.out.println(ress.data.is_liked);
            System.out.println(ress.data.author.id);
            System.out.println(ress.data.author.username);
            System.out.println(ress.data.author.avatar);
            System.out.println(ress.data.described);
        }
    }
    public static void Unittest8(ResponseSearch RESS) throws Exception{
        System.out.println("Unit test 8: image, video, describe error");
        ResponseSearch ress = RESS;
        if(!(((ress.data.image.equals(null) && ress.data.described.equals(null))) || ress.data.described.equals(null))) {
            System.out.println(ress.data.id);
            System.out.println(ress.data.image);
            System.out.println(ress.data.video.url);
            System.out.println(ress.data.video.thump);
            System.out.println(ress.data.like);
            System.out.println(ress.data.comment);
            System.out.println(ress.data.is_liked);
            System.out.println(ress.data.author.id);
            System.out.println(ress.data.author.username);
            System.out.println(ress.data.author.avatar);
        }
    }
    public static void Unittest9(String HOST, ResponseSearch RESS) throws Exception{
        ResponseLogin res = TestCaseLoginAPI.callAPI("0965223417","308abcd910", "9837492740912749865832", HOST);
        System.out.println("Unit test 9: image, video or describe error");
        ResponseSearch ress = RESS;
        if(ress.data.image.equals("") || ress.data.image == null){
            ress.data.image = "djsahfie3";
        }
        if(ress.data.described.equals("") || ress.data.image == null){
            ress.data.described = "No describe";
        }
        System.out.println(ress.data.id);
        System.out.println(ress.data.image);
        System.out.println(ress.data.video.url);
        System.out.println(ress.data.video.thump);
        System.out.println(ress.data.like);
        System.out.println(ress.data.comment);
        System.out.println(ress.data.is_liked);
        System.out.println(ress.data.author.id);
        System.out.println(ress.data.author.username);
        System.out.println(ress.data.author.avatar);
        System.out.println(ress.data.described);
    }
    public static void Unittest10(ResponseSearch RESS) throws Exception {
        System.out.println("Unit test 10: CEN error");
        ResponseSearch ress = RESS;
        if (!(ress.code.equals("1011"))) throw new AssertionError();
        if (!(ress.message.equals("Could not publish this post"))) throw new AssertionError();
        ress.data = null;
    }
    public static void Unittest11(ResponseSearch RESS) throws Exception {
        System.out.println("Unit test 11: Cant connect to internet");
        ResponseSearch ress = RESS;
        if (!(ress.code.equals("1001"))) throw new AssertionError();
        if (!(ress.message.equals("Can not connect to DB"))) throw new AssertionError();
        System.out.println("Can not connect to internet");
    }
    public static void Unittest14(ResponseSearch RESS) throws Exception {
        System.out.println("Unit test 14: invalid index, count");
        ResponseSearch ress = RESS;
        if (!(ress.code.equals("1004"))) throw new AssertionError();
        if (!(ress.message.equals("Parameter value is invalid"))) throw new AssertionError();
        System.out.println("index or count invalid");
    }
}

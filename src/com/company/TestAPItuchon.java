package com.company;

//Lớp để thực thi các Test Case của API theo cách tự người dùng chọn test case muốn test, nhập vào tham số hợp lệ
//Sau khi kết thúc sẽ trả về response tương ứng
public class TestAPItuchon {
    public static void giaodientuchon() throws Exception {
        String url = ChonHost.HOST(); //Lấy link url của Host và API đã được chọn
        System.out.println(url);

        //kiểm tra url gọi tới API nào và thực thi test case cho API đó
        if(url.contains("signup")) {
            ChonTestAPISignUp.link = url; //gán link url gọi API signUp
            System.out.println(url); //kiểm tra lại link url
            System.out.println("Nhập tài khoản chưa đăng ký");
            ChonTestAPISignUp.TestSignUp(); //Chọn Test Case muốn test với API Sign Up, sau đó thực thi test case đã chọn

        } else if (url.contains("login")) {
            ChonTestAPILogin.link = url; //gán link url gọi tới API login
            System.out.println(url); //kiểm tra lại link url
            ChonTestAPILogin.TestLogin(); //Chọn Test Case muốn test với API Login, sau đó thực thi test case đã chọn

        } else if (url.contains("logout")){
            ChonTestAPILogOut.link = url; //gán link url gọi tới API logout
            String loginlink1 = url.replace("logout", "login"); //gán link url gọi tới API login
            ChonTestAPILogOut.loginlink = loginlink1;


            //Đăng nhập tài khoản đã có để thực thi test case
            System.out.println("Đăng nhập tài khoản: ");
            Input.Login.nhap();
            System.out.println(url);

            String getvflink = url.replace("logout", "get_verify_code");
            String checkvflink = url.replace("logout", "check_verify_code");
            ResponseGet_verify_code resget = callAPI.callAPIGVC(Input.Login.phonenumber, getvflink);
            ResponseCheck_verify_code rescheck = callAPI.callAPCheckVC(Input.Login.phonenumber, resget.data.verifyCode, checkvflink);

            //Chọn test case và thực thi test case đã chọn
            System.out.println("Chọn trường hợp test api log out: ");
            ChonTestAPILogOut.TestLogout();

        } else if(url.contains("change_password")){
            ChonTestAPIchangepass.link = url;
            String loginlink1 = url.replace("change_password", "login");
            System.out.println(url);
            System.out.println(loginlink1);
            ChonTestAPIchangepass.loginlink = loginlink1; //gán link url gọi tới API login

            //Đăng nhập tài khoản đã có để thực thi test case
            System.out.println("Đăng nhập tài khoản: ");
            Input.Login.nhap();

            //Chọn test case và thực thi test case đã chọn
            System.out.println("Chọn trường hợp test api change_password: ");
            ChonTestAPIchangepass.TestChangepass();

        } else if (url.contains("block")) {
            ChonTestAPISetBlock.link = url;
            String loginlink1 = url.replace( "set_block", "login");
            String signuplink = url.replace("set_block", "signup");
            System.out.println(url);
            System.out.println(loginlink1);
            System.out.println(signuplink);

            ChonTestAPISetBlock.loginlink = loginlink1;
            ChonTestAPISetBlock.signupLink = signuplink;

            //Đăng ký tài khoản mới để thực thi test case
            System.out.println("Đăng nhập tài khoản");
            Input.SignUp.nhap();
            //Chọn test case và thực thi test case đã chọn
            ChonTestAPISetBlock.TestSetBlock();
        } else if(url.contains("get_verify_code")){
            ChonTestAPIGetverifycode.link = url;
            String signuplink = url.replace("get_verify_code", "signup");
            System.out.println("Đăng ký tài khoản");
            Input.SignUp.nhap();
            Response res = callAPI.callAPISignUp(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, signuplink);
            ChonTestAPIGetverifycode.TestGet_verify_code();

        } else if(url.contains("check_verify_code")){
            ChonTestAPICheck_verify_code.link = url;
            String signuplink = url.replace("check_verify_code", "signup");
            System.out.println("Đăng ký tài khoản");
            Input.SignUp.nhap();
            Response res = callAPI.callAPISignUp(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, signuplink);

            String getverifylink = url.replace("check_verify_code", "get_verify_code");
            ResponseGet_verify_code resget = callAPI.callAPIGVC(Input.SignUp.phonenumber, getverifylink);
            if(url.contains("nhom5")) {
                ChonTestAPICheck_verify_code.verifycode = resget.data.verifyCode;
            } else{
                ChonTestAPICheck_verify_code.verifycode = resget.data.verifycode;
            }
            System.out.println(resget.data.verifyCode);
            System.out.println(resget.data.verifycode);



            ChonTestAPICheck_verify_code.TestCheck_verify_code();;

        } else if (url.contains("set_accept_friend")){
            ChonTestAPISetAcceptFriend.link = url;
            String loginlink = url.replace("set_accept_friend", "login");
            ChonTestAPISetAcceptFriend.loginlink = loginlink;
            System.out.println("Đăng nhập tài khoản");
            Input.Login.nhap();

            ChonTestAPISetAcceptFriend.TestSetAcceptFriend();
        } else if(url.contains("search")){
            ChonTestAPISearch.link = url;
            String loginlink1 = url.replace("search", "login");
            System.out.println(url);
            System.out.println(loginlink1);
            ChonTestAPISearch.loginlink = loginlink1; //gán link url gọi tới API login

            //Đăng nhập tài khoản đã có để thực thi test case
            System.out.println("Đăng nhập tài khoản: ");
            Input.Login.nhap();

            //Chọn test case và thực thi test case đã chọn
            System.out.println("Chọn trường hợp test api search: ");
            ChonTestAPISearch.TestChangepass();
        } else if(url.contains("check_new_version")){
            ChonTestAPICheckNewVersion.link = url;
            String loginlink = url.replace("check_new_version", "login");
            System.out.println(url);
            System.out.println(loginlink);

            System.out.println("Đăng nhập tài khoản: ");
            Input.Login.nhap();
            ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);
            String token = reslog.data.token;
            ChonTestAPICheckNewVersion.token = token;
            ChonTestAPICheckNewVersion.TestCheck_new_version();
        }
    }

}

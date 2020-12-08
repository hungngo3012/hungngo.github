package com.company;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import com.company.Contanst;
import com.company.ResponseSetAcceptFriend;
import com.google.gson.Gson;
public class TestCaseSetAcceptFriendApi {
    public static ResponseSetAcceptFriend callAPI(Object token, Object user_id, Object is_accepted) throws IOException {
        URL url = new URL(Contanst.setAcceptFriendAPI +
                "?token=" + token
                + "&user_id=" + user_id
                + "&is_accepted=" + is_accepted);
        System.out.println("CALL API: " + url);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("POST");
        connection.setDoOutput(true);
        try (DataOutputStream writer = new DataOutputStream(connection.getOutputStream())) {

            StringBuilder content;
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()))) {
                String line;
                content = new StringBuilder();
                while ((line = in.readLine()) != null) {
                    content.append(line);
                    content.append(System.lineSeparator());
                }
            }
            Gson g = new Gson();
            System.out.println(content.toString());
            return g.fromJson(content.toString(), ResponseSetAcceptFriend.class);
        } finally {
            connection.disconnect();
        }
    }
}
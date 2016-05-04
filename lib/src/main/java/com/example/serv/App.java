package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyDquub8Y1ywVGj41a5g8uOXUH4-p5t1Iug";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bF78OwpQXCYh4nYKMnHFIoxzmPBtteR77gnGwRNIrsdTqchcyVc6jGgoXujmKbD8T3fPffmijVQdFnfBBVrxpOpwik9uLZoG2CaY5paIr0j-OI_Jhi9Xh3Kkps_myBEg0qjr-PC");
        c.createData("Working!!", "Test message");

        return c;
    }
}


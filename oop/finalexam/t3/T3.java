package oop.finalexam.t3;
import java.io.*;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import static java.net.http.HttpResponse.BodyHandlers.ofString;

public class T3 {
    public static Scanner scanner = new Scanner(System.in);
    // default values. we are still reading actuall values from a file
    public static String uri;
    public static String chatName;

    public static void get_blog_posts() throws URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(uri+"?api=blogs"))
                .build();
        HttpResponse<String> response = client.send(request, ofString());
        System.out.println(response.body());
    }

    public static void create_blog(String title, String content, String author) throws IOException, InterruptedException, URISyntaxException {
        String requestString = String.format("{\"title\": \"%s\", \"content\": \"%s\", \"author\": \"%s\"}", title, content, author);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(uri+"?api=blogs"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(requestString))
                .build();

        HttpResponse<String> response = client.send(request, ofString());
        System.out.println(response.body());
        System.out.println(response.statusCode());
    }

    public static void get_statistics() throws URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(uri+"?api=stats"))
                .build();
        HttpResponse<String> response = client.send(request, ofString());
        System.out.println(response.body());
    }

    public static void create_blog_routine() throws IOException, URISyntaxException, InterruptedException {
        System.out.println("Choose a title of post: ");
        String title = scanner.nextLine();

        System.out.println("type your name: ");
        String author = scanner.nextLine();

        System.out.println("Enter your message (just one line): ");
        String content = scanner.nextLine();

        create_blog(title, content, author);
    }
    public static void setUri(String server){
        uri = server;
    }
    public static void setChatName(String name){
        chatName = name;
    }

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        // Read variables from file
        String configPath = "src/oop/finalexam/t3/Config.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(configPath))) {
            setUri(br.readLine());
            setChatName(br.readLine());

        } catch (IOException e) {
            System.out.println("Cant load the file.");
            e.printStackTrace();
        }
        while(true){
            System.out.println("you are talking to "+ chatName);
            System.out.println("Actions (type one):");
            System.out.println("\"get blogs\" or \"get statistics\" or \"create blog\"");

            String choise = scanner.nextLine().toLowerCase();
            if (choise.contains("get blogs")){
                get_blog_posts();
            } else if (choise.contains("get statistics")){
                get_statistics();
            } else if (choise.contains("create blog")){
                create_blog_routine();
            } else{
                break;
            }
        }
        scanner.close();
    }
}


package com.back;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private final Scanner scanner;
    private int lastId = 0;
    private final List<WiseSaying> wiseSayings = new ArrayList<>();

    public App(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        System.out.println("== 명언 앱 ==");

        while(true){
            System.out.println("명령) ");
            String cmd = scanner.nextLine();

            switch (cmd){
                case "등록" -> {
                    System.out.println("명언 : ");
                    String content = scanner.nextLine();

                    System.out.println("작가 : ");
                    String author = scanner.nextLine();

                    int id = ++lastId;

                    WiseSaying wiseSaying = new WiseSaying(id, content, author);
                    wiseSayings.add(wiseSaying);

                    System.out.printf("%d번 명언이 등록되었습니다.\n", id);
                }
                case "목록" -> {
                    System.out.println("번호 / 작가 / 명언");
                    System.out.println("----------------------");

                    for(WiseSaying wiseSaying : wiseSayings.reversed()){
                        System.out.printf("%d / %s / %s\n", wiseSaying.getId(), wiseSaying.getAuthor(), wiseSaying.getContent());
                    }
                }
                case "종료" -> {
                    return;
                }
            }
        }
    }
}

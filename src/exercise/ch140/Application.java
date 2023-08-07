package src.exercise.ch140;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Application {
    private static final MemoPad memoPad = new MemoPad();
    private static final FileHandler fileHandler = new FileHandler();

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("메모장 프로그램입니다. 명령어를 입력해주세요(add, get, delete, save, load, quit): ");
            command = scanner.nextLine();

            switch (command) {
                case "add":
                    System.out.println("메모 제목과 내용을 입력하세요: ");
                    String title = scanner.nextLine();
                    String content = scanner.nextLine();
                    memoPad.addMemo(new Memo(title, content, LocalDateTime.now()));
                    break;
                case "get":
                    System.out.println("조회할 메모의 제목을 입력하세요: ");
                    title = scanner.nextLine();
                    Memo memo = memoPad.getMemo(title);
                    if(memo != null){
                        System.out.println("메모 제목: " + memo.getTitle() + "\n메모 내용: " + memo.getContent());
                    } else {
                        System.out.println("해당 제목의 메모가 존재하지 않습니다.");
                    }
                    break;
                case "delete":
                    System.out.println("삭제할 메모의 제목을 입력하세요: ");
                    title = scanner.nextLine();
                    memoPad.deleteMemo(title);
                    break;
                case "save":
                    fileHandler.saveMemos(memoPad.getMemos());
                    System.out.println("메모를 파일에 저장했습니다.");
                    break;
                case "load":
                    memoPad.getMemos().clear();
                    memoPad.getMemos().addAll(fileHandler.loadMemos());
                    System.out.println("파일에서 메모를 불러왔습니다.");
                    break;
                case "quit":
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("유효하지 않은 명령어입니다. 다시 입력해주세요.");
            }
        }
    }

}

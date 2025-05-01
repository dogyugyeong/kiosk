import java.util.*;

public class Kiosk {
    private List<MenuItem> menuItems;

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem item = menuItems.get(i);
                System.out.println((i + 1) + ". " + item.getName() + " W " + item.getPrice() + " " + item.getDesc());
            }
            System.out.println("0. 종료      종료");

            System.out.print("메뉴 번호를 선택하세요: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choice >= 1 && choice <= menuItems.size()) {
                MenuItem selectedItem = menuItems.get(choice - 1);
                System.out.println("선택한 메뉴: " + selectedItem.getName() + " W " + selectedItem.getPrice() + " " + selectedItem.getDesc());
            } else {
                System.out.println("올바른 번호를 입력하세요.");
            }

            System.out.println();
        }
        scanner.close();
    }
}

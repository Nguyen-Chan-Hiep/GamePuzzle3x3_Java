import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameClass gameClass = new GameClass();
        gameClass.print();
        System.out.println("Game Start!!!");
        gameClass.random();
        gameClass.print();
        System.out.println( "Di chuyển số 0 để mảng về hình dạng ban đầu" );
        System.out.println( "Sử dụng các nút sau để di chuyển: " );
        System.out.println( "W: di chuyển số 0 lên trên" );
        System.out.println( "S: di chuyển số 0 xuống dưới" );
        System.out.println( "A: di chuyển số 0 sang trái" );
        System.out.println( "D: di chuyển số 0 sang phải" );
        System.out.println( "p: tự động chơi" );
        int dem = 0;
        while (gameClass.isFinish() == false)
        {
            System.out.println( "Nhập W, A, S or D để chơi: ");
            Scanner scanner = new Scanner(System.in);
            String c = scanner.nextLine();
            if (c.charAt(0) == 'p')
            {
                gameClass.autoPlay();
                gameClass.print();
                break;
            }
            else
            {
                gameClass.play(c.charAt(0));
                gameClass.print();
                dem++;
            }
        }
    }
}

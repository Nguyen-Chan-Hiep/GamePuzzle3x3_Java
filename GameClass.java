import java.util.Random;

public class GameClass implements Game{
    int[][] a = new int[3][3];
    int x0, y0;
    Random generator = new Random();
    public GameClass() {
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        a[1][0] = 4;
        a[1][1] = 5;
        a[1][2] = 6;
        a[2][0] = 7;
        a[2][1] = 8;
        a[2][2] = 0;
        x0 = y0 = 2;
    }

    @Override
    public void up() {
        if (x0 != 0){
            a[x0][y0] = a[x0 - 1][y0];
            a[x0 - 1][y0] = 0;
            x0 = x0 - 1;
        }
    }

    @Override
    public void down() {
        if (x0 != 2)
        {
            a[x0][y0] = a[x0 + 1][y0];
            a[x0 + 1][y0] = 0;
            x0 = x0 + 1;
        }
    }

    @Override
    public void left() {
        if (y0 != 0)
        {
            a[x0][y0] = a[x0][y0 - 1];
            a[x0][y0 - 1] = 0;
            y0 = y0 - 1;
        }
    }

    @Override
    public void right() {
        if (y0 != 2)
        {
            a[x0][y0] = a[x0][y0 + 1];
            a[x0][y0 + 1] = 0;
            y0 = y0 + 1;
        }
    }

    @Override
    public void isUp() {
        if (x0 != 0)
        {
            up();
            System.out.println( "Up sucses" );
        }
        else
        {
            System.out.println( "Can't up" );
        }
    }

    @Override
    public void isDown() {
        if (x0 != 2)
        {
            down();
            System.out.println( "Down sucses" );
        }
        else
        {
            System.out.println( "Can't down" );
        }
    }

    @Override
    public void isLeft() {
        if (y0 != 0)
        {
            left();
            System.out.println( "Left sucses" );
        }
        else
        {
            System.out.println( "Can't left" );
        }
    }

    @Override
    public void isRight() {
        if (y0 != 2)
        {
            right();
            System.out.println( "Right sucses" );
        }
        else
        {
            System.out.println( "Can't right" );
        }
    }

    @Override
    public void mix(int k) {
        switch (k)
        {
            case 1:
                up();
                break;
            case 2:
                down();
                break;
            case 3:
                left();
                break;
            case 4:
                right();
                break;
            default:
                break;
        }
    }

    @Override
    public void random() {
        int step = generator.nextInt(1000000);
        for (int i = 0; i < step; i++)
        {
            int ran = generator.nextInt(4) + 1;
            mix(ran);
        }
    }

    @Override
    public void play(char c) {
        switch (c)
        {
            case 'w':
                isUp();
                break;
            case 's':
                isDown();
                break;
            case 'a':
                isLeft();
                break;
            case 'd':
                isRight();
                break;
            default:
                System.out.println( "Vui lòng nhập đúng ký tự để chơi!" );
                break;
        }
    }

    @Override
    public void autoPlay() {
        int autodem = 0;
        while (isFinish() == false)
        {
            int ran = generator.nextInt(4) + 1;
            mix(ran);
            autodem++;
        }
        System.out.println("Số bước nhảy: " + autodem );
    }

    @Override
    public boolean isFinish() {
        if (a[0][0] == 1 &&
                a[0][1] == 2 &&
                a[0][2] == 3 &&
                a[1][0] == 4 &&
                a[1][1] == 5 &&
                a[1][2] == 6 &&
                a[2][0] == 7 &&
                a[2][1] == 8 &&
                a[2][2] == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public void print() {
        System.out.println( this.a[0][0] + " | " + this.a[0][1] + " | " + this.a[0][2] );
        System.out.println( this.a[1][0] + " | " + this.a[1][1] + " | " + this.a[1][2] );
        System.out.println( this.a[2][0] + " | " + this.a[2][1] + " | " + this.a[2][2]) ;
    }

}

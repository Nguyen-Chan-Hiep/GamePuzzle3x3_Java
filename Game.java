public interface Game {
    void up();
    void down();
    void left();
    void right();
    void isUp();
    void isDown();
    void isLeft();
    void isRight();
    void mix(int k);
    void random();
    void play(char c);
    void autoPlay();
    boolean isFinish();
    void print();
}

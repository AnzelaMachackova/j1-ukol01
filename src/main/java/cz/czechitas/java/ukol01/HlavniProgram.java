package cz.czechitas.java.ukol01;
import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();
        nakresliA();



        nakresliPrasatko();
        zofka.penUp();
        zofka.move(350);
        zofka.penDown();
        // nakresliKruh();
        // zofka.turnLeft(120);
        // zofka.penUp();
        // zofka.move(100);
        // zofka.penDown();
        // nakresliOsmiuhelnik();
        // zofka.penUp();
        // zofka.move(150);
        // zofka.penDown();
        nakresliSlunko();
        zofka.turnLeft(150);
        zofka.penUp();
        zofka.move(300);
        zofka.penDown();
        zofka.turnRight(90);
        nakresliDomecek();
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(300);
        zofka.penDown();
        zofka.turnLeft(90);
        nakresliDomecek();
        for (int i = 0; i < 2; i++){
          zofka.turnRight(180);
          zofka.penUp();
          zofka.move(100);
          zofka.penDown();
          zofka.turnLeft(180);
          nakresliDomecek();
        }
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(300);
        zofka.turnRight(90);
        zofka.penDown();
        nakresliDomecek();

        zofka.penUp();
        zofka.move(800);
        zofka.turnLeft(90);
        zofka.move(350);
        zofka.turnLeft(180);
        zofka.penDown();
    }

    private void nakresliOsmiuhelnik() {
      for (int i = 0; i < 6; i++){
        zofka.move(20);
        zofka.turnRight(60);
      }
    }

    private void nakresliKruh() {
      for (int i = 0; i < 18; i++){
        zofka.turnLeft(20);
        zofka.move(5);
      }
    }

    private void nakresliSlunko() {
      for (int i = 0; i < 12; i++){
        zofka.turnLeft(30);
        zofka.move(10);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.penDown();
      }
    }


    private void nakresliPrasatko() {
      nakresliDomecek();
      zofka.turnRight(150);
      zofka.move(30);
      zofka.penUp();
      for (int i = 0; i < 2; i++){
        zofka.turnRight(120);
        zofka.move(30);
        zofka.penDown();
      }
      zofka.turnLeft(120);
      zofka.move(100);
      zofka.turnLeft(60);
      zofka.move(30);
      zofka.turnLeft(120);
      zofka.penUp();
      zofka.move(30);
      zofka.turnLeft(120);
      zofka.penDown();
      zofka.move(30);

    }

    private void nakresliDomecek() {
      for (int i = 0; i < 3; i++){
        zofka.turnRight(120);
        zofka.move(100);
      }
      zofka.turnLeft(90);
      for (int i = 0; i < 3; i++){
        zofka.move(100);
        zofka.turnLeft(90);
      }
    }

    private void nakresliA() {
      zofka.turnRight(30);
      zofka.move(80);
      zofka.turnRight(120);
      zofka.move(80);
      zofka.penUp();
      zofka.turnRight(120);
      zofka.move(80);
      zofka.penDown();
      zofka.turnRight(120);
      zofka.move(40);
      zofka.turnRight(60);
      zofka.move(40);
      zofka.penUp();
      zofka.move(60);
      zofka.turnRight(90);
      zofka.move(40);
      zofka.turnRight(90);



    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}

package Tugas1.Pacman;
import java.util.Scanner;
public class Input {

    public static int x = 0, y = 0;

    void Input() {
        Pacman Gh = new Pacman();
        Scanner sc = new Scanner(System.in);
        System.out.println(Gh.cek + " Move left ");
        System.out.print("Enter move (w,a,s,d to move)>>  ");
        String s = sc.nextLine();
        System.out.println("Score : " + Gh.skor);
        Input dx = new Input();
        System.out.println("---------------------------------------------");
        dx.Move(s);
        dx.Move();
    }

    void Move(String s) {
        if (s.equalsIgnoreCase("w")) {
            x--;
        } else if (s.equalsIgnoreCase("s")) {
            x++;
        } else if (s.equalsIgnoreCase("d")) {
            y++;
        } else if (s.equalsIgnoreCase("a")) {
            y--;
        }
    }

    void Move() {
        Pacman call = new Pacman();
        call.x1 += x;
        call.y1 += y;
        x = 0;
        y = 0;
    }
}

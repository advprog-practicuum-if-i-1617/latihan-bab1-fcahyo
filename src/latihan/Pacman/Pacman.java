package Tugas1.Pacman;

public class Pacman {

    public static int cek = 20, skor = 0;
    public static int x1, y1;

    public static void main(String[] args) {
        System.out.println("============== PACMAN ==============");
        System.out.println("========= W/A/S/D to move ==========");
        Input call2 = new Input();
        Stage call = new Stage();
        do {            
            call.Cekpos();
            call.Stage();
            call2.Input();
            call.shift();
            cek--;
            if (skor == 4) {
                System.out.println("YOU WIN!!");
                break;
            }
            if (cek == 0) {
                System.out.println("0 Move left");
                System.out.println("YOU LOSE!!");
            }            
        } while (cek != 0);
    }

}

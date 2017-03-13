package Tugas1.Pacman;
public class Stage {

    int[][] map = {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                   {1, 0, 0, 4, 0, 0, 0, 0, 2, 1},
                   {1, 1, 0, 0, 0, 1, 1, 1, 1, 1},
                   {1, 4, 0, 0, 0, 0, 0, 0, 0, 1},
                   {1, 1, 0, 4, 0, 1, 0, 0, 1, 1},
                   {1, 0, 0, 0, 0, 1, 1, 1, 1, 1},
                   {1, 0, 0, 0, 0, 0, 0, 1, 0, 1},
                   {1, 0, 0, 1, 1, 0, 0, 0, 0, 1},
                   {1, 0, 0, 4, 1, 1, 0, 0, 0, 1},
                   {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

    public void Stage() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (map[i][j] == 1) {
                    System.out.print("#");
                } else if (map[i][j] == 2) {
                    System.out.print("o");
                } else if (map[i][j] == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }

    public void Cekpos() {
        Pacman Gh = new Pacman();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (map[i][j] == 2) {
                    Gh.x1 = i;
                    Gh.y1 = j;
                    break;
                }
            }
        }
    }

    public void shift() {
        Pacman Gh = new Pacman();
        if (map[Gh.x1][Gh.y1] == 1) {
        } else {            
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (map[i][j] == 2) {
                        map[i][j] = 0;
                        break;
                    }                    
                }
            }
            
            if (map[Gh.x1][Gh.y1] == 4) {
                Gh.cek++;
                Gh.skor++;                          
            }                
            map[Gh.x1][Gh.y1] = 2;
        }
    }
}

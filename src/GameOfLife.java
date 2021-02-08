public class GameOfLife
{
    public static void main(String[] args)
    {
        int szerokosc = 5, wysokosc = 5;

        int[][] plansza = {{0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };

        System.out.println("Pierwsza generacja");
        for (int i = 0; i < szerokosc; i++)
        {
            for (int j = 0; j < wysokosc; j++)
            {
                if (plansza[i][j] == 0)
                    System.out.print(".");
                 else
                    System.out.print("*");
                 }
            System.out.println("");
            }
            System.out.println("");
            kolejnageneracja(plansza, szerokosc, wysokosc);
        }

            static void kolejnageneracja(int plansza[][],int szerokosc, int wysokosc) {

                int [][] symulacja = new int[szerokosc][wysokosc];

                for (int l = 1; l < szerokosc - 1; l++) {
                    for (int m = 1; m < wysokosc - 1; m++) {

                    int zyjacysasiad = 0;
                    for (int i = -1; i <= 1; i++)
                        for (int j = -1; j <= 1; j++)
                            zyjacysasiad += plansza[l + i][m + j];
                        zyjacysasiad -=plansza[l][m];

                        if ((plansza[l][m] == 1) &&(zyjacysasiad <2))
                            symulacja[l][m]=0;
                        else if ((plansza[l][m] == 1) && (zyjacysasiad >3))
                                symulacja[l][m] = 0;
                        else if ((plansza[l][m] == 0) && (zyjacysasiad == 3))
                                symulacja[l][m] = 1;
                        else symulacja[l][m] = plansza [l][m];
                           }
                        }
                System.out.println("Kolejna generacja");
                for (int i = 0; i < szerokosc; i++) {
                    for (int j = 0; j < wysokosc; j++) {
                        if(symulacja[i][j] ==0)
                            System.out.print(".");
                        else
                            System.out.print("*");

                    }
                    System.out.println();



                }



        }

    }



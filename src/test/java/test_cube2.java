import org.junit.jupiter.api.Test;

public class test_cube2 {

    /**
     * 20 минут ушло только на написание алгоритма в IDEA, со семи подсказками по ошибкам.
     * 5 правок кода по результатам еще 3-5 минут.
     * 3-5 минут на чтение и осмысление задачи.
     * 20 минут ушло на размышления - что и как делать. Тут чисто математика - не запутаться в индексах
     */
    @Test
    public void cube(){
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int n = Integer.parseInt(br.readLine());
        int n = 2;
        n = n * 2 + 1;

        int[][] res = new int[n][n];
        boolean ww = true;
        int cntA = 0, cntB = 0;
        for (int i=0; i < n; i++) {
            for (int j=0; j < n; j++) {
                ww = !ww;
                if (i==j) {
                    continue;
                } else if (ww) {
                    res[i][j] = ++cntA;
                } else {
                    res[j][i] = --cntB;
                }
            }
        }

        for (int i=0; i < n; i++) {
            System.out.print("" + res[i][0]);
            for (int j=1; j < n; j++) {
                System.out.print(" " + res[i][j]);
            }
            System.out.println();
        }

    }

}

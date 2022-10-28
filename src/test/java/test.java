import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class test {

    int x, y;
    int xm = Integer.MAX_VALUE;
    int xmm = 0;
    int ym = Integer.MAX_VALUE;
    int ymm = 0;
    private static int[][] trades;
    int resSUM = 0;
    List<Integer> resTrades;

    private void solve(int dx, int dy) {

        List<Integer> countTab;
        int count;
        for (int kx = xm; kx < xmm - dx + 1; kx++) {
            for (int ky = ym; ky < ymm - dy + 1; ky++) {
                countTab = new ArrayList<>();
                count = 0;
                for (int i = 0; i < trades.length; i++) {
                    x = trades[i][0];
                    y = trades[i][1];
                    if (x >= kx && x <=kx + dx
                        && y >= ky && y <=ky + dy) {
                        // если продажа внутри прямоугольника - запомним
                        count++;
                        countTab.add(i);
                    }
                }

                // если нашли лучше чем было - запомним
                if (count > resSUM) {
                    resSUM = count;
                    resTrades = countTab;
                }
            }
        }
    }

    @Test
    public void cube() throws IOException {

        int n, sq;
        if (false) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s;
            String[] arr;

            s = br.readLine();
            arr = s.split(" ");
            n = Integer.parseInt(arr[0]);
            sq = Integer.parseInt(arr[1]);

            // считаем массив продаж на карте
            trades = new int[n][];
            for (int i = 0; i < n; i++) {
                s = br.readLine();
                arr = s.split(" ");
                x = Integer.parseInt(arr[0]);
                trades[i][0] = x;
                if (x > xmm) xmm = x;
                if (x < xm) xm = x;
                y = Integer.parseInt(arr[1]);
                trades[i][0] = y;
                if (y > ymm) ymm = x;
                if (y < ym) ym = x;
            }
        } else {
            // ручной ввод
            n = 5;
            sq = 3;
            trades = new int[][]{
                    new int[]{1,1},
                    new int[]{1,2},
                    new int[]{4,1},
                    new int[]{13,5},
                    new int[]{2,3}
            };
            for (int i = 0; i < n; i++) {
                x = trades[i][0];
                if (x > xmm) xmm = x;
                if (x < xm) xm = x;
                y = trades[i][0];
                if (y > ymm) ymm = x;
                if (y < ym) ym = x;
            }
        }

        // по площади прямоугольника находим стороны
        int dx, dy;
        dx = (int) Math.sqrt(sq);
        dy = dx;
        while (dx * dy < sq) {
            dx++;
            while (dx * dy > sq) {
                dy--;
            }
        }

        // по точка продаж найдем границы поиска
        solve(dx, dy);

        if (resSUM == 0) {
            System.out.println("0");
            return;
        }
        // выводим сколько нашлось продаж максимум
        System.out.println("" + resSUM);
        // выводим номера продаж
        System.out.print("" + resTrades.get(0));
        if (resSUM == 1)
            return;
        for (int i = 1; i < resSUM; i++) {
            System.out.print(" " + resTrades.get(i));
        }
        System.out.println();

    }
}
package practice.test_35;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import static org.junit.jupiter.api.Assertions.*;


public class DateSortTest {
    Comparator<String>comparator;

    @BeforeEach
    void setUp(){
        comparator = (s1, s2) -> {

            if (s1.substring(6, 10).compareTo(s2.substring(6, 10)) > 0) {
                return 1;
            }
            if (s1.substring(6, 10).compareTo(s2.substring(6, 10)) < 0) {
                return -1;
            }
            if (s1.substring(3, 5).compareTo(s2.substring(3, 5)) > 0) {
                return 1;
            }
            if (s1.substring(3, 5).compareTo(s2.substring(3, 5)) < 0) {
                return -1;
            }

            if (s1.substring(0, 2).compareTo(s2.substring(0, 2)) > 0) {
                return 1;
            }
            if (s1.substring(0, 2).compareTo(s2.substring(0, 2)) < 0) {
                return -1;
            }
            return 0;
        };

        //comparator = (s1, s2) -> {               //этот способ лучше
        //            String[] arr1 = s1.split("-");
        //            String[] arr2 = s2.split("-");
        //            for (int i = arr1.length - 1; i >= 0; i--) {
        //                int d1 = Integer.parseInt(arr1[i]);
        //                int d2 = Integer.parseInt(arr2[i]);
        //                if (d1 > d2) {
        //                    return 1;
        //                }
        //                if (d1 < d2) {
        //                    return -1;
        //                }
        //             }
        //            return 0;
        //        };
    }

    @Test
    void testDateSort(){
        String[] dates={
                "07-05-1990",
                "28-01-2010",
                "11-08-1990",
                "15-01-2010",
                "16-06-1970",
        };
        String[] expected={
                "16-06-1970",
                "07-05-1990",
                "11-08-1990",
                "15-01-2010",
                "28-01-2010",
        };
        Arrays.sort(dates,comparator);
        System.out.println(Arrays.toString(dates));
        assertArrayEquals(expected,dates);
    }
}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int sum1=0, sum2=0, sum3=0;
        int i=0, j=0, k=0;
        for(Integer h1s : h1) {
            sum1+=h1s;
        }
        for(Integer h2s : h2) {
            sum2+=h2s;
        }
        for(Integer h3s : h3) {
            sum3+=h3s;
        }
        while(!(sum3==sum1 && sum3==sum2)) {
            if (sum1 >= sum2 && sum1 >= sum3) {
                sum1 -= h1.get(i);
                i++;
            } else if (sum2 >= sum1 && sum2 >= sum3) {
                sum2 -= h2.get(j);
                j++;
            } else {
                sum3 -= h3.get(k);
                k++;
            }
        }
        return sum1;
    }

}

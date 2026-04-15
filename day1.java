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
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        for(int i=1; i<=d; i++) {
            arr.add(arr.get(0));
            arr.remove(0);
        }
        return arr; 
    }
}

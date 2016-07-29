//copied from http://stackoverflow.com/q/15182496/201514
import java.util.*;

public class Rajani {
    public static void main(String[] args) {
        long seed = -9223372035478857410L;
        System.out.println(randomString(seed));
    }
    public static String randomString(long i)
    {
        Random ran = new Random(i);
        StringBuilder sb = new StringBuilder();
        while (true)
        {
            int k = ran.nextInt(27);
            if (k == 0)
                break;

            sb.append((char)('Z' + k));
        }
        return sb.toString();
    }
}

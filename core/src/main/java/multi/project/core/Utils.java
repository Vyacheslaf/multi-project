package multi.project.core;

import org.example.StringUtils;
public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        if ((str == null) || (str.length == 0)) {
            throw new UnsupportedOperationException("There must be at least one argument and it cannot be null");
        }
        for (String s : str) {
            if (!StringUtils.isPositiveNumber(s)) {
                return false;
            }
        }
        return true;
    }
}

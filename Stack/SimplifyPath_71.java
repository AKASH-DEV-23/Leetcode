package Stack;

import java.util.Stack;

public class SimplifyPath_71 {
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        for (String dir : path.split("/")) {
            if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                if (!dir.equals("") && !dir.equals(".")) {
                    stack.push(dir);
                }
            }
        }
        return "/" + String.join("/", stack);

    }

    public static void main(String[] args) {
        String path = "/home/user/Documents/../Pictures";
        System.out.println(simplifyPath(path));
    }
}
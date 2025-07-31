class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] dict = path.split("/");

        for (String x : dict) {
            if (x.equals("") || x.equals(".")) {
                continue;
            } else if (x.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(x);
            }
        }

        return "/" + String.join("/", stack);
    }
}

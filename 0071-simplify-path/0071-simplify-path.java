class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        String[] components = path.split("/+");      
        for (String dir : components) {
            if (dir.isEmpty() || dir.equals(".")) {
                continue;
            }
            if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.removeLast();
                }
            } else {
                stack.addLast(dir);
            }
        }     
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/").append(dir);
        }       
        return result.length() == 0 ? "/" : result.toString();
    }
}
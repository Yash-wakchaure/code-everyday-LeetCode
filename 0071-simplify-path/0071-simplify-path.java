class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        String[] parts = path.split("/");

        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];

            if (part.equals("")) {
                // ignore
                continue;
            }
            if (part.equals(".")) {
                continue;
            }
            else if (part.equals("..")) {
                if(!s.isEmpty()){
                    s.pop();
                }
            }
            else{
                 s.push(part);
            }
        }
        // Build simplfy String 
        String result = "";
        for (int i = 0; i < s.size(); i++) {
            result += "/" + s.get(i);
        }

        if (result.equals("")) {
            return "/";
        }

        return result;
    }
}
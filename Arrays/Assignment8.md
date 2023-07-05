# Q1
Answer : 
```java
public class MinimumDeleteSum {
    public static int minimumDeleteSum(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        // Fill in the base cases
        for (int i = 1; i <= m; i++) {
            dp[i][0] = dp[i - 1][0] + s1.charAt(i - 1);
        }
        for (int j = 1; j <= n; j++) {
            dp[0][j] = dp[0][j - 1] + s2.charAt(j - 1);
        }

        // Fill in the remaining cells
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j] + s1.charAt(i - 1), dp[i][j - 1] + s2.charAt(j - 1));
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "sea";
        String s2 = "eat";
        int minimumSum = minimumDeleteSum(s1, s2);
        System.out.println("Minimum ASCII delete sum: " + minimumSum);
    }
}

```

# Q2 : 
Answer :
```java
class Solution {
    public boolean checkValidString(String s) {
         Stack<Integer> openBracket = new Stack<>();
        Stack<Integer> stars = new Stack<>();
        for(int i=0;i<s.length();i++){
            // push opening bracket
            if(s.charAt(i)=='('){
                openBracket.push(i);
            }

            // if *
            else if(s.charAt(i)=='*'){
                stars.push(i);
            }

            // if closing bracket
            else{
                if(!openBracket.isEmpty()){
                    openBracket.pop();
                }else if(!stars.isEmpty()){
                    stars.pop();
                }else{
                    return false;
                }
            }
        }

        while(!openBracket.isEmpty()){
            if(stars.isEmpty()){
                return false;
            }else if(openBracket.peek()<stars.peek()){
                openBracket.pop();
                stars.pop();
            }else{
                return false;
            }
        }
        return true;
    }
}
```

# Q3 :
Answer :
```java
public class Solution {
    public int minSteps(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        int[][] dp = new int[m + 1][n + 1];

        // Initialize the first row
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }

        // Initialize the first column
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }

        // Fill in the remaining entries
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1;
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String word1 = "sea";
        String word2 = "eat";
        int minSteps = solution.minSteps(word1, word2);
        System.out.println(minSteps);  // Output: 2
    }
}

```

# Q4 
Answer :
```java
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {
    private int index;

    public TreeNode buildTree(String str) {
        index = 0;
        return constructTree(str);
    }

    private TreeNode constructTree(String str) {
        if (index >= str.length())
            return null;

        // Extract the integer value
        int numEnd = index;
        while (numEnd < str.length() && Character.isDigit(str.charAt(numEnd))) {
            numEnd++;
        }
        int num = Integer.parseInt(str.substring(index, numEnd));
        TreeNode root = new TreeNode(num);

        index = numEnd;

        // Check if there is a left child
        if (index < str.length() && str.charAt(index) == '(') {
            index++; // Move past '('
            root.left = constructTree(str);
            index++; // Move past ')'
        }

        // Check if there is a right child
        if (index < str.length() && str.charAt(index) == '(') {
            index++; // Move past '('
            root.right = constructTree(str);
            index++; // Move past ')'
        }

        return root;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String input = "4(2(3)(1))(6(5))";
        TreeNode root = solution.buildTree(input);

        // Print the constructed binary tree (in-order traversal)
        printInOrder(root);
    }

    private static void printInOrder(TreeNode node) {
        if (node == null)
            return;

        printInOrder(node.left);
        System.out.print(node.val + " ");
        printInOrder(node.right);
    }
}

```

# Q5 :
```java
class Solution {
    public int compress(char[] chars) {
        if(chars.length==1)return 1;
      int count = 1;
        String s = "" + chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[i - 1]) {
                if(count==1){
                    s+=""+chars[i];
                }else{
                    s+=""+count+chars[i];
                }
                count=1;
            } else if (i == chars.length - 1) {
                if(chars[i]==chars[i-1]){
                    s+=""+(count+1);
                }else{
                    if(count==1){
                        s+=""+chars[i];
                    }else{
                        s+=""+count+chars[i];
                    }
                }
            } else {
                count++;
            }
        }
        System.out.println(s);
        // converting to chars
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}
```

# Q6 
Answer 
```java
import java.util.*;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        // Create frequency map for string p
        Map<Character, Integer> pFreqMap = new HashMap<>();
        for (char c : p.toCharArray()) {
            pFreqMap.put(c, pFreqMap.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int matchCount = 0;

        while (right < s.length()) {
            char rightChar = s.charAt(right);
            if (pFreqMap.containsKey(rightChar)) {
                pFreqMap.put(rightChar, pFreqMap.get(rightChar) - 1);
                if (pFreqMap.get(rightChar) == 0) {
                    matchCount++;
                }
            }

            right++;

            if (right - left == p.length()) {
                if (matchCount == pFreqMap.size()) {
                    result.add(left);
                }

                char leftChar = s.charAt(left);
                if (pFreqMap.containsKey(leftChar)) {
                    if (pFreqMap.get(leftChar) == 0) {
                        matchCount--;
                    }
                    pFreqMap.put(leftChar, pFreqMap.get(leftChar) + 1);
                }

                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> indices = solution.findAnagrams(s, p);
        System.out.println(indices);  // Output: [0, 6]
    }
}

```

# Q7 :
Answer :
```java
import java.util.*;
public class Que7 {
    public static void main(String[] args) {
        String s="3[a2[c]]";
        System.out.println(decodeString(s));
    }
    public static String decodeString(String s) {
        // boolean get Num to save num
        boolean getNum=true;
        // 
        String Num="";
        int num=0;
        String res="";
        String result="";
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['){
                num=Integer.parseInt(Num);
                getNum=false;
                stack.push(s.charAt(i));
                continue;
            }
            if(!stack.isEmpty() && s.charAt(i)!=']'){
                res+=s.charAt(i);
            }else if(!stack.isEmpty() && s.charAt(i)==']'){
                stack.remove(stack.size()-1);
                getNum=true;
                Num="";
                for(int j=0;j<num;j++){
                    result+=res;
                }
                res="";
                continue;
            }
            // if num
            if(getNum){
                Num+=s.charAt(i);
            }
            
        }

        return result;
    }
}
```

# Q8 :
```java
class Solution {
    public boolean buddyStrings(String s, String goal) {
       if(s.equals(goal)){
            Set<Character> set=new HashSet<>();
            for(int i=0;i<s.length();i++){
                set.add(s.charAt(i));
            }

            return set.size()<s.length();
        }

        int i=0;
        int j=s.length()-1;
        while(i<j && s.charAt(i)==goal.charAt(i)){
            i++;
        }

        while(i<j && s.charAt(j)==goal.charAt(j)){
            j--;
        }

        if(i<j){
            char arr[]=s.toCharArray();
            char c=arr[i];
            arr[i]=arr[j];
            arr[j]=c;
            s=String.valueOf(arr);
        }
        return s.equals(goal);
    }
}
```
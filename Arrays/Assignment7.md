# Q1 : 
Answer : 
```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        boolean result = isomorphic(s, t);
        System.out.println(result);
    }

    public static boolean isomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        Set<Character> mappedChars = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (map.containsKey(charS)) {
                if (map.get(charS) != charT) {
                    return false; // Different mapping found
                }
            } else {
                if (mappedChars.contains(charT)) {
                    return false; // Same char in s maps to different char in t
                }
                map.put(charS, charT);
                mappedChars.add(charT);
            }
        }

        return true;
    }
}

```

# Q2 : 
Answer :
```java
public class Question2 {
    public static void main(String[] args) {
        System.out.println(check("101"));

    }

    public static boolean check(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '1') {
                if (s.charAt(i) != s.charAt(j))
                    return false;
            } else if ((s.charAt(i) == '9' && s.charAt(j) == '6') || (s.charAt(i) == '6' && s.charAt(j) == '9')) {

                i++;
                j--;
                continue;

            } else {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}

```

# Q3 : 
Answer :
```java
import java.math.BigInteger;

public class Question3 {
    public static void main(String[] args) {
        String num1="11";
        String num2="123";
        StringBuilder sb= new StringBuilder("");

        int i=num1.length() -1, j=num2.length()-1;int carry=0;
        while(i>=0 || j>=0 || carry!=0){
            int sum=carry;
            if(i>=0){
                sum+=num1.charAt(i)-'0';
                i--;
            }

            if(j>=0){
                sum+=num2.charAt(j)-'0';
                j--;
            }

            sb.insert(0,sum%10);
            carry=sum/10;
        }
        System.out.println(sb);

    }
}

```

# Q4 : 
Answer : 
```java
public class Question4 {
    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        String arr[] = s.split("\\s+");
        String result="";
        for(int i=0;i<arr.length;i++){
            int j=arr[i].length()-1;
            while(j>=0){
                result+=arr[i].charAt(j);
                j--;
            }
            if(i!=arr.length-1){
            result+=" ";
            }
        }
        System.out.println(result);
    }
}

```

# Q5 : 
```java
class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i += 2 * k) {
            int start = i;
            int end = Math.min(arr.length - 1, i + k - 1);

            while (start < end) {
                char temp = arr[start];
                arr[start] = arr[end];
                v[end] = temp;

                start ++;
                end --;
            }
        }

        return new String(arr);
    }
}
```

# Q6 :
Answer : 
```java
class Solution {
    public boolean rotateString(String s, String goal) {
        int idx=-1;
        int idx2=0;
        int len=s.length();
        boolean flag=true;
        if(goal.length()!=s.length())return false;
        for(int i=0;i<len;i++){
            if(s.charAt(i)==goal.charAt(idx2)){
                idx2++;
            }
            if(idx==-1 && i==len-1){
                len=s.length()-idx2;
                i=-1;
                idx=0;
            }
        }
        return idx2==s.length();
    }
}
```

# Q7 :
Answer : 
```java
public class Question7 {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("#ywrrmp", "xywrrmu#p"));
    }
    public static boolean backspaceCompare(String s, String t) {
        StringBuilder s1=new StringBuilder("");
        StringBuilder s2=new StringBuilder("");
        int i=0,j=0;
        while(i<s.length() || j<t.length()){
            if(i<s.length()){
                if(s.charAt(i)=='#'){
                    if(s1.length()>0)
                    s1.deleteCharAt(s1.length()-1);
                }else{
                    s1.append(s.charAt(i));
                }
                i++;
            }
            if(j<t.length()){
                if(t.charAt(j)=='#'){
                    if(s2.length()>0)
                    s2.deleteCharAt(s2.length()-1);
                }else{
                    s2.append(t.charAt(j));
                }
                j++;
            }
        }
        return s1.toString().equals(s2.toString());
    }
}

```


# Q8 :
Answer : 
```java
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;

        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];

        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];

        for (int i = 2; i < n; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];

            if ((y - y1) * (x - x2) != (y - y2) * (x - x1)) {
                return false;
            }
        }

        return true;
    }
}
```
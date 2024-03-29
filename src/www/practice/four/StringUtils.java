package www.practice.four;

//4.完成StringUtils.java
public class StringUtils {
    public static void main(String[] args) {
        String str1 = repeat('a',3);
        String str2 = fillBefore(" success",'y',10);
        String str3 = fillAfter("success ",'y',10);
        String str4 = removeAll("under - the - tree","-");
        String str5 = reverse("this is a dream");
        System.out.println(str5);
        System.out.println(str4);
        System.out.println(str3);
        System.out.println(str2);
        System.out.println(str1);
    }
    /**
     * 重复某个字符
     *
     * 例如：
     * 'a' 5   => "aaaaa"
     * 'a' -1  => ""
     *
     * @param c     被重复的字符
     * @param count 重复的数目，如果小于等于0则返回""
     * @return 重复字符字符串
     */
    public static String repeat(char c, int count) {
        //TODO
        if(count <= 0) {
            return "";
        }else {
            StringBuilder str = new StringBuilder();
            for(int i = 0; i < count; i++) {
                str.append(c);
            }
            return str.toString();
        }
    }


    /**
     * 将已有字符串填充为规定长度，如果已有字符串大于等于这个长度则返回这个字符串
     * 字符填充于字符串前
     *
     * 例如：
     * "abc" 'A' 5  => "AAabc"
     * "abc" 'A' 2  => "abc"
     *
     * @param str        被填充的字符串
     * @param filledChar 填充的字符
     * @param len        填充长度
     * @return 填充后的字符串
     */
    public static String fillBefore(String str, char filledChar, int len) {
        //TODO
        if(len <= str.length()) {
            return str;
        }else {
            int length = len - str.length();
            StringBuilder sb = new StringBuilder();
            for( int i = 0;i < length; i ++) {
                sb.append(filledChar);
            }
            sb.append(str);
            return sb.toString();

      /*      char[] data = str.toCharArray();
            StringBuilder strbuilder = new StringBuilder();
            for(int i = 0; i < len - str.length(); i++) {
                strbuilder.append(filledChar);
            }
            for(int i = 0; i < str.length(); i++) {
                StringBuilder append = strbuilder.append(data[i]);
            }*/
        }
       // return strbuilder.toString();
    }

    /**
     * 将已有字符串填充为规定长度，如果已有字符串大于等于这个长度则返回这个字符串<br>
     * 字符填充于字符串后
     * 例如：
     * "abc" 'A' 5  => "abcAA"
     * "abc" 'A' 3  => "abc"
     *
     * @param str        被填充的字符串
     * @param filledChar 填充的字符
     * @param len        填充长度
     * @return 填充后的字符串
     */
    public static String fillAfter(String str, char filledChar, int len) {
        //TODO
        if(str.length() >= len) {
            return str;
        }else {
            int length = len - str.length();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            for(int i =0; i < length; i++) {
                sb.append(filledChar);
            }
            return sb.toString();
        }

    }

    /**
     * 移除字符串中所有给定字符串
     * 例：removeAll("aa-bb-cc-dd", "-") => aabbccdd
     *
     * @param str         字符串
     * @param strToRemove 被移除的字符串
     * @return 移除后的字符串
     */
    public static String removeAll(String str, String strToRemove) {
        //TODO
        if(!str.contains(strToRemove)) {
            return str;
        }else {
            return str.replaceAll(strToRemove,"");
        }
    }

    /**
     * 反转字符串
     * 例如：abcd => dcba
     *
     * @param str 被反转的字符串
     * @return 反转后的字符串
     */
    public static String reverse(String str) {
        //TODO
        char[] data = str.toCharArray();
        char[] tempdata = new char[str.length()];
        int flag = 0;
        for(int i = str.length() - 1; i >= 0; i--) {
            tempdata[flag++] = data[i];
        }

        return String.valueOf(tempdata);
    }
}


    

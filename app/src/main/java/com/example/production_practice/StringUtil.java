package com.example.production_practice;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.StringTokenizer;


public class StringUtil {
    public static final char[] codeSequences = {'0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9'};
    public static final char[] code16Sequences = {'0', '1', '2', '3', '4',
            '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final char[] charSequences = {'A', 'B', 'C', 'D', 'E', 'F',
            'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
            'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static String iso2utf8(String src) {
        try {
            if (isEmpty(src))
                return "";
            return new String(src.getBytes("iso-8859-1"), "utf-8");
        } catch (UnsupportedEncodingException e) {
            return "?";
        }
    }

    public static String iso2gbk(String src) {
        try {
            if (isEmpty(src))
                return "";
            return new String(src.getBytes("iso-8859-1"), "gbk");
        } catch (UnsupportedEncodingException e) {
            return "?";
        }
    }

    public static String utf2gbk(String src) {
        try {
            if (isEmpty(src))
                return "";
            return new String(src.getBytes("utf-8"), "gbk");
        } catch (UnsupportedEncodingException e) {
            return "?";
        }
    }

    /**
     * <li>判断字符串是否为空值</li> <li>NULL、空格均认为空值</li>
     *
     * @param value
     * @return
     */
    public static boolean isEmpty(String value) {
        return null == value || "".equals(value.trim());
    }

    public static boolean isBlank(String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0)
            return true;
        for (int i = 0; i < strLen; i++)
            if (!Character.isWhitespace(str.charAt(i)))
                return false;

        return true;
    }

    /**
     * 内容不为空
     *
     * @param value
     * @return
     */
    public static boolean isNotEmpty(String value) {
        return null != value && !"".equals(value.trim());
    }

    /**
     * 重复字符串 如 repeatString("a",3) ==> "aaa"
     *
     * @param src
     * @param repeats
     * @return
     * @author uke
     */
    public static String repeatString(String src, int repeats) {
        if (null == src || repeats <= 0) {
            return src;
        } else {
            StringBuffer bf = new StringBuffer();
            for (int i = 0; i < repeats; i++) {
                bf.append(src);
            }
            return bf.toString();
        }
    }

    /**
     * 左对齐字符串 * lpadString("X",3); ==>" X" *
     *
     * @param src
     * @param length
     * @return
     */
    public static String lpadString(String src, int length) {
        return lpadString(src, length, " ");
    }

    /**
     * 以指定字符串填补空位，左对齐字符串 * lpadString("X",3,"0"); ==>"00X"
     *
     * @param src
     * @param byteLength
     * @param temp
     * @return
     */
    public static String lpadString(String src, int length, String single) {
        if (src == null || length <= src.getBytes().length) {
            return src;
        } else {
            return repeatString(single, length - src.getBytes().length) + src;
        }
    }

    /**
     * 右对齐字符串 * rpadString("9",3)==>"9 "
     *
     * @param src
     * @param byteLength
     * @return
     */
    public static String rpadString(String src, int byteLength) {
        return rpadString(src, byteLength, " ");
    }

    /**
     * 以指定字符串填补空位，右对齐字符串 rpadString("9",3,"0")==>"900"
     *
     * @param src
     * @param byteLength
     * @param single
     * @return
     */
    public static String rpadString(String src, int length, String single) {
        if (src == null || length <= src.getBytes().length) {
            return src;
        } else {
            return src + repeatString(single, length - src.getBytes().length);
        }
    }

    /**
     * 去除,分隔符，用于金额数值去格式化
     *
     * @param value
     * @return
     */
    public static String decimal(String value) {
        if (null == value || "".equals(value.trim())) {
            return "0";
        } else {
            return value.replaceAll(",", "");
        }
    }

    /**
     * 在数组中查找字符串
     *
     * @param params
     * @param name
     * @param ignoreCase
     * @return
     */
    public static int indexOf(String[] params, String name, boolean ignoreCase) {
        if (params == null)
            return -1;
        for (int i = 0, j = params.length; i < j; i++) {
            if (ignoreCase && params[i].equalsIgnoreCase(name)) {
                return i;
            } else if (params[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 将字符转数组
     *
     * @param str
     * @return
     */
    public static String[] toArr(String str) {
        String inStr = str;
        String a[] = null;
        try {
            if (null != inStr) {
                StringTokenizer st = new StringTokenizer(inStr, ",");
                if (st.countTokens() > 0) {
                    a = new String[st.countTokens()];
                    int i = 0;
                    while (st.hasMoreTokens()) {
                        a[i++] = st.nextToken();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }

    /**
     * 字符串数组包装成字符串
     *
     * @param ary
     * @param s   包装符号如 ' 或 "
     * @return
     */
    public static String toStr(String[] ary, String s) {
        if (ary == null || ary.length < 1)
            return "";
        StringBuffer bf = new StringBuffer();
        bf.append(s);
        bf.append(ary[0]);
        for (int i = 1; i < ary.length; i++) {
            bf.append(s).append(",").append(s);
            bf.append(ary[i]);
        }
        bf.append(s);
        return bf.toString();
    }

    /**
     * 取整数值
     *
     * @param map
     * @param key
     * @param defValue
     * @return
     */
    public static int getInt(Map map, String key, int defValue) {
        if (null != map && isNotEmpty(key)) {
            try {
                return Integer.parseInt((String) map.get(key));
            } catch (Exception e) {
            }
        }
        return defValue;
    }

    /**
     * 取浮点值
     *
     * @param map
     * @param key
     * @param defValue
     * @return
     */
    public static float getFloat(Map map, String key, int defValue) {
        if (null != map && isNotEmpty(key)) {
            try {
                return Float.parseFloat(map.get(key).toString());
            } catch (Exception e) {
            }
        }
        return defValue;
    }

    public static boolean isNumber(String s) {
        if (s == null)
            return false;
        return s.matches("[0-9\\.]+");
    }

    /**
     * 转整数
     *
     * @param str
     * @return
     */
    public static int parseInt(String str) {
        if (!isNumber(str))
            return -1;
        return Integer.parseInt(str);
    }

    /**
     * @param str
     * @param def
     * @return
     */
    public static int parseInt(String str, int def) {
        int rst = parseInt(str);
        if (rst < 0) {
            return def;
        }
        return rst;
    }

    /**
     * 带参字符串文本
     *
     * @param temp
     * @param params
     * @return
     */
    public static String message(String temp, Object... params) {
        for (int i = 0; i < params.length; i++) {
            temp = temp.replaceAll("\\{" + i + "\\}", params[i].toString());
        }
        return temp;
    }

    public static void main(String[] args) {
        String rst = message("2113{0}21{1}", "aaa", "bbb");
        System.out.println(rst);
    }

    /****/
    public static void generyXmlEntry(StringBuffer bf, String entry,
                                      Object value) {
        bf.append("<").append(entry).append(">");
        if (null != value)
            bf.append(value.toString().trim());
        bf.append("</").append(entry).append(">");
    }

    public static String getMessage(String msg, String[] vars) {
        for (int i = 0; i < vars.length; i++) {
            msg = msg.replaceAll("\\{" + i + "\\}", vars[i]);
        }
        return msg;
    }

    /**
     * @param msg
     * @param var
     * @return
     */
    public static String getMessage(String msg, String var) {
        return getMessage(msg, new String[]{var});
    }

    /**
     * @param msg
     * @param var
     * @param var2
     * @return
     */
    public static String getMessage(String msg, String var, String var2) {
        return getMessage(msg, new String[]{var, var2});
    }

    public static Object getMapValue(Map map, Object key) {
        if (null == map || null == key)
            return "";

        if ((key instanceof String)) {
            String keystr = (String) key;
            keystr = keystr.toUpperCase();
            key = keystr;
        }
        Object value = map.get(key);
        return null == value ? "" : value;
    }

    public static String generyImgUrl(Object rootUrl, Object date,
                                      Object imgId, Object imgInfo) {
        StringBuffer bf = new StringBuffer();
        try {
            String ext = StringUtil.getFileExtName((String) imgInfo);
            bf.append(rootUrl).append("/");
            bf.append(date).append("/");
            bf.append(imgId).append(ext);
        } catch (Exception e) {
            bf.append("");
        }
        return bf.toString();
    }

    public static String getFileExtName(String oldName) {
        String ext = "";
        int lastIndex = oldName.lastIndexOf(".");
        if (lastIndex > 0) {
            ext = oldName.substring(lastIndex);
        }
        return ext;
    }

    public static void generyXmlEntryCData(StringBuffer bf, String entry,
                                           Object value) {
        bf.append("<").append(entry).append("><![CDATA[");
        if (null != value)
            bf.append(value);
        bf.append("]]></").append(entry).append(">");
    }

    // /**
    // * 瀛楃涓茶В瀵?
    // *
    // * @param string
    // * @return
    // */
    // public static String decrypt(String src) {
    // try {
    // return DESPlus.getInstance().decrypt(src);
    // } catch (Exception e) {
    // // TODO Auto-generated catch block
    // e.printStackTrace();
    // }
    // return src;
    // }

    /**
     * 随机生成数字
     */
    public static String randomInt(int length) {
        StringBuffer randomCode = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            String strRand = String.valueOf(codeSequences[random.nextInt(10)]);
            randomCode.append(strRand);
        }
        return randomCode.toString();
    }

    public static String randomInt(int length, int min, int max) {
        Random random = new Random();
        String strRand = String.format("%0" + length + "X",
                random.nextInt(max - min) + min);
        if (strRand.length() > length) {
            strRand = strRand.substring(0, length);
        }

        return strRand;
    }

    /**
     * 随机生成字母
     */
    public static String randomString(int length) {
        StringBuffer randomCode = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            String strRand = String.valueOf(charSequences[random.nextInt(26)]);
            randomCode.append(strRand);
        }
        return randomCode.toString();
    }

    public static String randomString16(int length) {
        StringBuffer randomCode = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            String strRand = String
                    .valueOf(code16Sequences[random.nextInt(16)]);
            randomCode.append(strRand);
        }
        return randomCode.toString();
    }

    public static byte[] decode(String src) {
        byte[] dst = new byte[src.length() / 2];
        for (int i = 0; i < dst.length; i++)
            dst[i] = (byte) Integer.parseInt(src.substring(i * 2, i * 2 + 2),
                    16);
        return dst;
    }

    /**
     * 字符串修改
     *
     * @param str   需要修改的字符串
     * @param rep   替换成的字符
     * @param end   字符剪切前半段的结束位置
     * @param start 字符剪切后半段的起始位置
     * @return
     */
    public static String strReplace(String str, String rep, int end, int start) {
        String newStr = str.substring(0,
                str.length() - (str.substring(end)).length())
                + rep + str.substring(start);
        return newStr;
    }

    /**
     * list转数组字符串 中间用，隔开
     *
     * @param list
     * @return
     */
    public static String listToString(List list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append(",");
        }
        return sb.toString().substring(0, sb.toString().length() - 1);
    }

    /**
     * 银行卡格式
     * 银行卡号 6230 4800 0010 2201 171
     *
     * @param allStr 银行卡号
     * @return
     */
    public static String bankNum(String allStr) {
        String formatStr = "";
        StringBuffer strBufCard = new StringBuffer(allStr);
        if (allStr.length() < 5 && allStr.length() > 0) {
            formatStr = allStr;
        } else if (allStr.length() >= 5 && allStr.length() < 9) {
            formatStr = strBufCard.insert(4, " ").toString();
        } else if (allStr.length() >= 9 && allStr.length() < 13) {
            formatStr = strBufCard.insert(4, " ").insert(9, " ")
                    .toString();
        } else if (allStr.length() >= 13 && allStr.length() < 17) {
            formatStr = strBufCard.insert(4, " ").insert(9, " ")
                    .insert(14, " ").toString();
        } else if (allStr.length() >= 17 && allStr.length() < 21) {
            formatStr = strBufCard.insert(4, " ").insert(9, " ")
                    .insert(14, " ").insert(19, " ").toString();
        } else if (allStr.length() >= 21 && allStr.length() < 25) {
            formatStr = strBufCard.insert(4, " ").insert(9, " ")
                    .insert(14, " ").insert(19, " ").insert(24, " ")
                    .toString();
        } else if (allStr.length() >= 25 && allStr.length() < 29) {
            formatStr = strBufCard.insert(4, " ").insert(9, " ")
                    .insert(14, " ").insert(19, " ").insert(24, " ")
                    .insert(29, " ").toString();
        } else if (allStr.length() >= 29 && allStr.length() < 33) {
            formatStr = strBufCard.insert(4, " ").insert(9, " ")
                    .insert(14, " ").insert(19, " ").insert(24, " ")
                    .insert(29, " ").insert(34, " ").toString();
        } else {
            formatStr = strBufCard.insert(4, " ").insert(9, " ")
                    .insert(14, " ").insert(19, " ").insert(24, " ")
                    .insert(29, " ").insert(34, " ").insert(39, " ")
                    .toString();
        }
        return formatStr;
    }
}

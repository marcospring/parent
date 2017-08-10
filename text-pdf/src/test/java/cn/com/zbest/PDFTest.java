package cn.com.zbest;


import com.csyy.file.text.pdf.PdfGenerator;
import com.csyy.file.text.pdf.util.ResourceLoader;

/**
 * Created by zhangbin on 16/6/2.
 */
public class PDFTest {

    public static void main(String[] args) {

        String outputFileClass = ResourceLoader.getPath("")+"xxx.pdf";

        System.out.println(outputFileClass);

        try {
            PdfGenerator.generate(html2,outputFileClass);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static String html="<!DOCTYPE html><html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
            "<head>\n" +
            "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
            "    <title></title>\n" +
            "    <style type=\"text/css\">\n" +
            "    body{font-family:SimSun;} table{table-layout:fixed; word-break:break-strict;}   table.hovertable\n" +
            "        {\n" +
            "            font-family: verdana,arial,sans-serif;\n" +
            "            font-size: 11px;\n" +
            "            color: #333333;\n" +
            "            border-width: 1px;\n" +
            "            border-color: #999999;\n" +
            "            border-collapse: collapse;\n" +
            "        }\n" +
            "\n" +
            "            table.hovertable th\n" +
            "            {\n" +
            "                background-color: #c3dde0;\n" +
            "                border-width: 1px;\n" +
            "                padding: 8px;\n" +
            "                border-style: solid;\n" +
            "                border-color: #a9c6c9;\n" +
            "            }\n" +
            "\n" +
            "            table.hovertable tr\n" +
            "            {\n" +
            "                background-color: #d4e3e5;\n" +
            "            }\n" +
            "\n" +
            "            table.hovertable td\n" +
            "            {\n" +
            "                border-width: 1px;\n" +
            "                padding: 8px;\n" +
            "                border-style: solid;\n" +
            "                border-color: #a9c6c9;\n" +
            "            }\n" +
            "    </style>\n" +
            "</head>\n" +
            "<body style=\"width: 600px; margin: 0 auto;\">\n" +
            "    <p style=\"text-align: center; font-size: 18px; font-weight: 800; color: blue; padding: 10px;\">\n" +
            "        麦芽分期XXX合同\n" +
            "    </p>\n" +
            "    <table class=\"hovertable\" style=\"width: 100%;table-layout:fixed; word-break:break-strict;\">\n" +
            "        <tr>\n" +
            "            <th>Info Header 1</th>\n" +
            "            <th>Info Header 2</th>\n" +
            "            <th>Info Header 3</th>\n" +
            "        </tr>\n" +
            "        <tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n" +
            "            <td>Item 1A</td>\n" +
            "            <td>Item 1B</td>\n" +
            "            <td>Item 1C</td>\n" +
            "        </tr>\n" +
            "        <tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n" +
            "            <td>Item 2A</td>\n" +
            "            <td>Item 2B</td>\n" +
            "            <td>Item 2C</td>\n" +
            "        </tr>\n" +
            "        <tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n" +
            "            <td>Item 3A</td>\n" +
            "            <td>Item 3B</td>\n" +
            "            <td>Item 3C</td>\n" +
            "        </tr>\n" +
            "        <tr style ='font-family:sans-serif;'>\n" +
            "            <td>撒发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发烧发到事发当时发生地方阿三发烧发到撒</td>\n" +
            "            <td>Item 4B</td>\n" +
            "            <td>Item 4C</td>\n" +
            "        </tr>\n" +
            "        <tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n" +
            "            <td>Item 5A</td>\n" +
            "            <td>Item 5B</td>\n" +
            "            <td>Item 5C</td>\n" +
            "        </tr>\n" +
            "        <tr style ='font-family:sans-serif;'>\n" +
            "            <td>撒发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发烧发到事发当时发生地方阿三发烧发到撒</td>\n" +
            "            <td>Item 4B</td>\n" +
            "            <td>Item 4C</td>\n" +
            "        </tr>\n" +
            "        <tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n" +
            "            <td>Item 5A</td>\n" +
            "            <td>Item 5B</td>\n" +
            "            <td>Item 5C</td>\n" +
            "        </tr>\n" +
            "        <tr style ='font-family:sans-serif;'>\n" +
            "            <td>撒发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发烧发到事发当时发生地方阿三发烧发到撒</td>\n" +
            "            <td>Item 4B</td>\n" +
            "            <td>Item 4C</td>\n" +
            "        </tr>\n" +
            "        <tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n" +
            "            <td>Item 5A</td>\n" +
            "            <td>Item 5B</td>\n" +
            "            <td>Item 5C</td>\n" +
            "        </tr>\n" +
            "        <tr style ='font-family:sans-serif;'>\n" +
            "            <td>撒发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发烧发到事发当时发生地方阿三发烧发到撒</td>\n" +
            "            <td>Item 4B</td>\n" +
            "            <td>Item 4C</td>\n" +
            "        </tr>\n" +
            "        <tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n" +
            "            <td>Item 5A</td>\n" +
            "            <td>Item 5B</td>\n" +
            "            <td>Item 5C</td>\n" +
            "        </tr>\n" +
            "        <tr style ='font-family:sans-serif;'>\n" +
            "            <td>撒发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发烧发到事发当时发生地方阿三发烧发到撒</td>\n" +
            "            <td>Item 4B</td>\n" +
            "            <td>Item 4C</td>\n" +
            "        </tr>\n" +
            "        <tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n" +
            "            <td>Item 5A</td>\n" +
            "            <td>Item 5B</td>\n" +
            "            <td>Item 5C</td>\n" +
            "        </tr>\n" +
            "        <tr style ='font-family:sans-serif;'>\n" +
            "            <td>撒发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发烧发到事发当时发生地方阿三发烧发到撒</td>\n" +
            "            <td>Item 4B</td>\n" +
            "            <td>Item 4C</td>\n" +
            "        </tr>\n" +
            "        <tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n" +
            "            <td>Item 5A</td>\n" +
            "            <td>Item 5B</td>\n" +
            "            <td>Item 5C</td>\n" +
            "        </tr>\n" +
            "        <tr style ='font-family:sans-serif;'>\n" +
            "            <td>撒发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发烧发到事发当时发生地方阿三发烧发到撒</td>\n" +
            "            <td>Item 4B</td>\n" +
            "            <td>Item 4C</td>\n" +
            "        </tr>\n" +
            "        <tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n" +
            "            <td>Item 5A</td>\n" +
            "            <td>Item 5B</td>\n" +
            "            <td>Item 5C</td>\n" +
            "        </tr>\n" +
            "        <tr style ='font-family:sans-serif;'>\n" +
            "            <td>撒发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发烧发到事发当时发生地方阿三发烧发到撒</td>\n" +
            "            <td>Item 4B</td>\n" +
            "            <td>Item 4C</td>\n" +
            "        </tr>\n" +
            "        <tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n" +
            "            <td>Item 5A</td>\n" +
            "            <td>Item 5B</td>\n" +
            "            <td>Item 5C</td>\n" +
            "        </tr>\n" +
            "        <tr style ='font-family:sans-serif;'>\n" +
            "            <td>撒发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发烧发到事发当时发生地方阿三发烧发到撒</td>\n" +
            "            <td>Item 4B</td>\n" +
            "            <td>Item 4C</td>\n" +
            "        </tr>\n" +
            "        <tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n" +
            "            <td>Item 5A</td>\n" +
            "            <td>Item 5B</td>\n" +
            "            <td>Item 5C</td>\n" +
            "        </tr>\n" +
            "        <tr style ='font-family:sans-serif;'>\n" +
            "            <td>撒发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发烧发到事发当时发生地方阿三发烧发到撒</td>\n" +
            "            <td>Item 4B</td>\n" +
            "            <td>Item 4C</td>\n" +
            "        </tr>\n" +
            "        <tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n" +
            "            <td>Item 5A</td>\n" +
            "            <td>Item 5B</td>\n" +
            "            <td>Item 5C</td>\n" +
            "        </tr>\n" +
            "        <tr style ='font-family:sans-serif;'>\n" +
            "            <td>撒发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发烧发到事发当时发生地方阿三发烧发到撒</td>\n" +
            "            <td>Item 4B</td>\n" +
            "            <td>Item 4C</td>\n" +
            "        </tr>\n" +
            "        <tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n" +
            "            <td>Item 5A</td>\n" +
            "            <td>Item 5B</td>\n" +
            "            <td>Item 5C</td>\n" +
            "        </tr>\n" +
            "        <tr style ='font-family:sans-serif;'>\n" +
            "            <td>撒发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发烧发到事发当时发生地方阿三发烧发到撒</td>\n" +
            "            <td>Item 4B</td>\n" +
            "            <td>Item 4C</td>\n" +
            "        </tr>\n" +
            "        <tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n" +
            "            <td>Item 5A</td>\n" +
            "            <td>Item 5B</td>\n" +
            "            <td>Item 5C</td>\n" +
            "        </tr>\n" +
            "        <tr style ='font-family:sans-serif;'>\n" +
            "            <td>撒发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发烧发到事发当时发生地方阿三发烧发到撒</td>\n" +
            "            <td>Item 4B</td>\n" +
            "            <td>Item 4C</td>\n" +
            "        </tr>\n" +
            "        <tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n" +
            "            <td>Item 5A</td>\n" +
            "            <td>Item 5B</td>\n" +
            "            <td>Item 5C</td>\n" +
            "        </tr>\n" +
            "        <tr style ='font-family:sans-serif;'>\n" +
            "            <td>撒发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发烧发到事发当时发生地方阿三发烧发到撒</td>\n" +
            "            <td>Item 4B</td>\n" +
            "            <td>Item 4C</td>\n" +
            "        </tr>\n" +
            "        <tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n" +
            "            <td>Item 5A</td>\n" +
            "            <td>Item 5B</td>\n" +
            "            <td>Item 5C</td>\n" +
            "        </tr>\n" +
            "        <tr style ='font-family:sans-serif;'>\n" +
            "            <td>撒发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发烧发到事发当时发生地方阿三发烧发到撒</td>\n" +
            "            <td>Item 4B</td>\n" +
            "            <td>Item 4C</td>\n" +
            "        </tr>\n" +
            "        <tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n" +
            "            <td>Item 5A</td>\n" +
            "            <td>Item 5B</td>\n" +
            "            <td>Item 5C</td>\n" +
            "        </tr>\n" +
            "        <tr style ='font-family:sans-serif;'>\n" +
            "            <td>撒发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发烧发到事发当时发生地方阿三发烧发到撒</td>\n" +
            "            <td>Item 4B</td>\n" +
            "            <td>Item 4C</td>\n" +
            "        </tr>\n" +
            "        <tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n" +
            "            <td>Item 5A</td>\n" +
            "            <td>Item 5B</td>\n" +
            "            <td>Item 5C</td>\n" +
            "        </tr>\n" +
            "        <tr style ='font-family:sans-serif;'>\n" +
            "            <td>撒发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发烧发到事发当时发生地方阿三发烧发到撒</td>\n" +
            "            <td>Item 4B</td>\n" +
            "            <td>Item 4C</td>\n" +
            "        </tr>\n" +
            "        <tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n" +
            "            <td>Item 5A</td>\n" +
            "            <td>Item 5B</td>\n" +
            "            <td>Item 5C</td>\n" +
            "        </tr>\n" +
            "        <tr style ='font-family:sans-serif;'>\n" +
            "            <td>撒发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发烧发到事发当时发生地方阿三发烧发到撒</td>\n" +
            "            <td>Item 4B</td>\n" +
            "            <td>Item 4C</td>\n" +
            "        </tr>\n" +
            "        <tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n" +
            "            <td>Item 5A</td>\n" +
            "            <td>Item 5B</td>\n" +
            "            <td>Item 5C</td>\n" +
            "        </tr>\n" +
            "        <tr style ='font-family:sans-serif;'>\n" +
            "            <td>撒发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发烧发到事发当时发生地方阿三发烧发到撒</td>\n" +
            "            <td>Item 4B</td>\n" +
            "            <td>Item 4C</td>\n" +
            "        </tr>\n" +
            "        <tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n" +
            "            <td>Item 5A</td>\n" +
            "            <td>Item 5B</td>\n" +
            "            <td>Item 5C</td>\n" +
            "        </tr>\n" +
            "        <tr style ='font-family:sans-serif;'>\n" +
            "            <td>撒发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发烧发到事发当时发生地方阿三发烧发到撒</td>\n" +
            "            <td>Item 4B</td>\n" +
            "            <td>Item 4C</td>\n" +
            "        </tr>\n" +
            "        <tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n" +
            "            <td>Item 5A</td>\n" +
            "            <td>Item 5B</td>\n" +
            "            <td>Item 5C</td>\n" +
            "        </tr>\n" +
            "        <tr style ='font-family:sans-serif;'>\n" +
            "            <td>撒发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发烧发到事发当时发生地方阿三发烧发到撒</td>\n" +
            "            <td>Item 4B</td>\n" +
            "            <td>Item 4C</td>\n" +
            "        </tr>\n" +
            "        <tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n" +
            "            <td>Item 5A</td>\n" +
            "            <td>Item 5B</td>\n" +
            "            <td>Item 5C</td>\n" +
            "        </tr>\n" +            "        <tr style ='font-family:sans-serif;'>\n" +
            "            <td>撒发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发烧发到事发当时发生地方阿三发烧发到撒</td>\n" +
            "            <td>Item 4B</td>\n" +
            "            <td>Item 4C</td>\n" +
            "        </tr>\n" +
            "        <tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n" +
            "            <td>Item 5A</td>\n" +
            "            <td>Item 5B</td>\n" +
            "            <td>Item 5C</td>\n" +
            "        </tr>\n" +
            "        <tr style ='font-family:sans-serif;'>\n" +
            "            <td>撒发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发烧发到事发当时发生地方阿三发烧发到撒</td>\n" +
            "            <td>Item 4B</td>\n" +
            "            <td>Item 4C</td>\n" +
            "        </tr>\n" +
            "        <tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n" +
            "            <td>Item 5A</td>\n" +
            "            <td>Item 5B</td>\n" +
            "            <td>Item 5C</td>\n" +
            "        </tr>\n" +
            "        <tr style ='font-family:sans-serif;'>\n" +
            "            <td>撒发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发噶速度发似懂非懂撒的发烧发到事发当时发生地方阿三发烧发到撒</td>\n" +
            "            <td>Item 4B</td>\n" +
            "            <td>Item 4C</td>\n" +
            "        </tr>\n" +
            "        <tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n" +
            "            <td>Item 5A</td>\n" +
            "            <td>Item 5B</td>\n" +
            "            <td>Item 5C</td>\n" +
            "        </tr>\n" +


            "    </table>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n" +
            "\n";


    static String html2 = "\n" +
            "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\"/>\n" +
            "    <title>付款申请单</title>\n" +
            "    <style>\n" +
            "        body{\n" +
            "            font-family:SimSun;\n" +
            "        }\n" +
            "        table{word-break:break-strict;}\n" +
            "        .head{\n" +
            "            width: 680px;\n" +
            "            height:100px;\n" +
            "            margin-bottom: 20px;\n" +
            "        }\n" +
            "        .head div{\n" +
            "            float: left;\n" +
            "            width:200px;\n" +
            "            margin-right: 100px;\n" +
            "            border: 1px solid #000;\n" +
            "        }\n" +
            "        h1{\n" +
            "            float: left;\n" +
            "        }\n" +
            "        .head span{\n" +
            "            padding-right: 80px;\n" +
            "        }\n" +
            "        table{\n" +
            "            border-collapse: collapse;\n" +
            "            margin-bottom: 15px;\n" +
            "            width:680px;\n" +
            "            clear: both;\n" +
            "        }\n" +
            "        tr{\n" +
            "            height:20px;\n" +
            "        }\n" +
            "        .list1{\n" +
            "            text-align: center;\n" +
            "        }\n" +
            "        .req{\n" +
            "            height:80px;\n" +
            "        }\n" +
            "        .req td{\n" +
            "            vertical-align:text-top;\n" +
            "        }\n" +
            "        td{\n" +
            "            padding: 10px 0;\n" +
            "        }\n" +
            "        .list2 td{\n" +
            "            border: none;\n" +
            "        }\n" +
            "        input{\n" +
            "            margin-right: 10px;\n" +
            "        }\n" +
            "        span {\n" +
            "            display: inline-block;\n" +
            "            padding-right:75px;\n" +
            "            text-align: left;\n" +
            "        }\n" +
            "        .money span{\n" +
            "            display: inline-block;\n" +
            "            padding: 0 10px;\n" +
            "        }\n" +
            "        .width-100{\n" +
            "            width:100px;\n" +
            "        }\n" +
            "        .width-200{\n" +
            "            width:160px;\n" +
            "        }\n" +
            "        .txtCenter{\n" +
            "            text-align: center;\n" +
            "        }\n" +
            "    </style>\n" +
            "</head>\n" +
            "<body>\n" +
            "<div class=\"head\">\n" +
            "    <div>\n" +
            "        <p class=\"txtCenter\">仅限财务中心填写</p>\n" +
            "        <p><span>日期:</span>年</p>\n" +
            "        <p>凭证号:</p>\n" +
            "    </div>\n" +
            "    <h1>付款申请单</h1>\n" +
            "</div>\n" +
            "<table class=\"list1\" border=\"1\">\n" +
            "    <tbody>\n" +
            "    <tr>\n" +
            "        <td colspan=\"3\"><span>公司名称:荣域保理</span> <span>所在中心:消费金融 麦芽分期</span> <span>申请人全名:</span></td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td class=\"width-100\"></td>\n" +
            "        <td>摘要</td>\n" +
            "        <td class=\"width-200\">金额</td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td>日期</td>\n" +
            "        <td>内容描述</td>\n" +
            "        <td>人民币</td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td>2016/07/08</td>\n" +
            "        <td>\n" +
            "            线下商户放款：<br/>\n" +
            "            崔栋柱,011607071628107501,艾莱美有效置无效<br/>\n" +
            "            6期,12343.00,月供元<br/>\n" +
            "            乙文中医减肥研究院,6225880131575731\n" +
            "        </td>\n" +
            "        <td>\n" +
            "            12343.00\n" +
            "        </td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td></td>\n" +
            "        <td></td>\n" +
            "        <td></td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td></td>\n" +
            "        <td></td>\n" +
            "        <td></td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td></td>\n" +
            "        <td></td>\n" +
            "        <td></td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td></td>\n" +
            "        <td></td>\n" +
            "        <td></td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td></td>\n" +
            "        <td></td>\n" +
            "        <td></td>\n" +
            "    </tr>\n" +
            "\n" +
            "    <tr>\n" +
            "        <td>合计</td>\n" +
            "        <td class=\"money\">金额（大写）<span></span>拾<span></span>万<span></span>仟<span></span>佰<span></span>拾<span></span>元<span></span>角<span></span>分</td>\n" +
            "        <td>¥12343.00</td>\n" +
            "    </tr>\n" +
            "    </tbody>\n" +
            "</table>\n" +
            "<table class=\"list2\" border=\"1\">\n" +
            "    <tr>\n" +
            "        <td rowspan=\"3\">\n" +
            "            付款方式: <span style=\"padding: 0\">现金</span> <input type=\"checkbox\" /><span style=\"padding: 0\">银行转账</span> <input type=\"checkbox\" /><span style=\"padding: 0\">支票</span> <input type=\"checkbox\" /><span style=\"padding: 0\">银行汇票</span> <input type=\"checkbox\" /><span style=\"padding: 0\">冲销暂支款</span> <input type=\"checkbox\" />\n" +
            "        </td>\n" +
            "        <td class=\"width-200\">已经暂支:¥</td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td>本次冲销:¥</td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td>实际支付:¥</td>\n" +
            "    </tr>\n" +
            "</table>\n" +
            "<table class=\"list3\" border=\"1\">\n" +
            "    <tr><td>要求最后付款日:<br/><br/>\n" +
            "        备注:</td></tr>\n" +
            "</table>\n" +
            "<table class=\"list4\" border=\"1\">\n" +
            "    <tr class=\"req\">\n" +
            "        <td>申请人:</td>\n" +
            "        <td>中心总监审批:</td>\n" +
            "        <td>COO审批:（超一万）</td>\n" +
            "        <td>CFO审批:（超三万）</td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td>日期:</td>\n" +
            "        <td>日期:</td>\n" +
            "        <td>日期:</td>\n" +
            "        <td>日期:</td>\n" +
            "    </tr>\n" +
            "    <tr class=\"req\">\n" +
            "        <td>CEO审批:（超五万)</td>\n" +
            "        <td>人事行政部复核:</td>\n" +
            "        <td>会计复核:</td>\n" +
            "        <td>收款人:</td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td>日期:</td>\n" +
            "        <td>日期:</td>\n" +
            "        <td>日期:</td>\n" +
            "        <td>日期:</td>\n" +
            "    </tr>\n" +
            "</table>\n" +
            "</body>\n" +
            "</html>\n";
}

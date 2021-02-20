package com.wang.jufeng;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class TestHttp {

    public static String sendRequest(String urlParam) {

        HttpURLConnection con = null;

        BufferedReader buffer = null;
        StringBuffer resultBuffer = null;

        try {
            URL url = new URL(urlParam);
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            //设置请求需要返回的数据类型和字符集类型
            con.setRequestProperty("Content-Type", "application/json;charset=GBK");
            con.setRequestProperty("Cookie","sessionid=v309bpxw1n8ywiwjvbs9kg0wvrek15r6");
            con.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.150 Safari/537.36");
            con.setRequestProperty("Referer","http://dtree.pe.dapp.com/");
            con.setRequestProperty("Host","dtree.pe.dapp.com");

            //允许写出
            con.setDoOutput(true);
            //允许读入
            con.setDoInput(true);
            //不使用缓存
            con.setUseCaches(false);
            //得到响应流
            InputStream inputStream = con.getInputStream();
            //将响应流转换成字符串
            resultBuffer = new StringBuffer();
            String line;
            buffer = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while ((line = buffer.readLine()) != null) {
                resultBuffer.append(line);
            }
            return resultBuffer.toString();

        }catch(Exception e) {
            e.printStackTrace();
        }

        return "";
    }

    public static void main(String[] args) {
        /*String s = sendRequest("http://dtree.pe.dapp.com/search?word=10.52.53.112");
        boolean contains = s.contains("共查询到了<strong>0</strong>条应用记录，<strong>0</strong>条机器记录，<strong>0</strong>条下线机器记录");
        System.out.println(contains);*/

        deal();
    }
    static boolean request(String param){
         param = param.trim();
         String s = sendRequest("http://dtree.pe.dapp.com/search?word="+param);
          return s.contains("共查询到了<strong>0</strong>条应用记录，<strong>0</strong>条机器记录，<strong>0</strong>条下线机器记录");
    }

    public static void deal()  {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\wechat-data\\WXWork\\1688851994959441\\Cache\\File\\2021-02\\online_dubbo_consumers.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"utf-8");
            BufferedReader br = new BufferedReader(inputStreamReader);
            String lineText = null;
            String interfaceName = "";
            while ((lineText=br.readLine()) != null){
                if(lineText.contains("com.dang.")){
                    interfaceName = lineText;
                }else if(lineText.contains("**  consumers")|| lineText.contains("group /dubbo")){
                    continue;
                }else if(lineText.contains("host=")){
                    String[] split = lineText.split("host=")[1].replaceAll("\\[", "").replaceAll("\\]", "").split(",");
                    for(String ip : split){
                       if(request(ip)){
                           System.out.println(interfaceName + "<-->" + lineText);
                           break;
                       }
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

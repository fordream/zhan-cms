  
package com.alipay.util;
import java.net.*;
import java.io.*;

/**
 * 名称：支付验证类
 * 功能：负责验证相关信息，返回支付宝ATN返回结果
 * 类属性：支付宝公共类
 * 版本：2.0
 * 日期：2008-12-25
 * 作者：支付宝公司销售部技术支持团队
 * 联系：0571-26888888
 * 版权：支付宝公司
 * */
public class CheckURL {
	   /**
     * 对字符串进行MD5加密
	 * @param myUrl 
     *
     * @param url
     *
     * @return 获取url内容
     */
  public static String check(String urlvalue ) {
	 
	 
	  String inputLine="";
	  
		try{
				URL url = new URL(urlvalue);
				
				HttpURLConnection urlConnection  = (HttpURLConnection)url.openConnection();
				
				BufferedReader in  = new BufferedReader(
			            new InputStreamReader(
			            		urlConnection.getInputStream()));
			
				inputLine = in.readLine().toString();
			}catch(Exception e){
				e.printStackTrace();
			}
			//System.out.println(inputLine);  系统打印出抓取得验证结果
			/*输出对应的参数对应错误：
			 * 1.invalid命令参数不对 出现这个错误，请检测返回处理中partner和key是否为空
			 * 2.true 返回正确信息 
			 * 3.false 请检查防火墙或者是服务器阻止端口问题以及验证时间是否超过一分钟
			 * */
			
	    return inputLine;
  }


  }
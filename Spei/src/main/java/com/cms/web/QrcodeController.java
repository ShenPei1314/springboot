package com.cms.web;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cms.util.LogoCode;
import com.cms.util.QRcodeUtil;

@Controller
public class QrcodeController {
	
	/**
	 * 生成二维码
	 * 方法名：createQrode<br/>
	 * 创建人：ShenPei <br/>
	 * 时间：2017年11月9日-上午10:52:05 <br/>
	 * 手机:1564545646464<br/>
	 * @param response void<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	@RequestMapping("/qrcode")
	public void createQrode(@RequestParam("q")String q,HttpServletResponse response){
		try {
			QRcodeUtil.qrCodeEncode(q, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * 方法名：createQrode3<br/>
	 * 创建人：ShenPei <br/>
	 * 时间：2017年11月9日-下午3:41:05 <br/>
	 * 手机:1564545646464<br/>
	 * @param q
	 * @param response void<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	@RequestMapping("/qrcode2")
	public void createQrode3(@RequestParam("q")String q,HttpServletResponse response){
		try {
			/*String content = "MECARD:N:孙先生;" + 
		    		"ADR:中国安徽合肥;" + 
		    		"ORG:XX有限公司;" + 
		    		"DIV:研发部;" + 
		    		"TIL:程序员;" + 
		    		"TEL:15211111111;" + 
		    		"EMAIL:123456789@163.com;" + 
		    		"URL:weibo.com/sunbreezemoon;" + 
		    		"NOTE:QQ :123456789;" + 
		    		";";*/
			//String content = "http://img.bss.csdn.net/201609251654183128.png";
			LogoCode.createQRCode(q, "d://pei (2).jpg", response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

package kr.co.sinc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.sinc.vo.ProductVO;

@Controller
public class SampleController5 {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController5.class);
	
	
	@RequestMapping("doJSON")
	public @ResponseBody ProductVO doJSON() {
		logger.info("doE Called...................");
		

		ProductVO vo = new ProductVO();
		vo.setName("Test");
		vo.setPrice(200000);
		
		return vo;
				
	}
}

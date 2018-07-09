package kr.co.sinc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sinc.vo.ProductVO;

@Controller
public class SampleController3 {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController3.class);
	
	
	@RequestMapping("doD")
	public String doD(Model model) {
		logger.info("doD Called...................");
		
		ProductVO vo = new ProductVO();
		vo.setName("Sample Product");
		vo.setPrice(10000);
		
		logger.info("doD");
		
		model.addAttribute("vo",vo);
		
		return "prodectDetail";
	}
	
	
}

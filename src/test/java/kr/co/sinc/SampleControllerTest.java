package kr.co.sinc;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


/***
 * was 안올리고 컨트롤러 테스트 하기
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class SampleControllerTest {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleControllerTest.class);
	
	
	@Inject
	private WebApplicationContext wac;
	
	private MockMvc mckMvc;
	
	@Before
	public void setup() {
		this.mckMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
		logger.info("setup....");
	}
	
	@Test
	public void testDoA() throws Exception{
		mckMvc.perform(MockMvcRequestBuilders.get("/doA"));
	}
}

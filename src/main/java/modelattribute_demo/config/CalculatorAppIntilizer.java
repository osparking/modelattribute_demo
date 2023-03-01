package modelattribute_demo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class CalculatorAppIntilizer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class aClass[] = { CalculatorAppConfig.class };
		return aClass;
	}

	@Override
	protected String[] getServletMappings() {
		String arr[] = { "/modatt.space/*" };
		return arr;
	}

}

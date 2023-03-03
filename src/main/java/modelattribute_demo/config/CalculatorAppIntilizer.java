package modelattribute_demo.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
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
	
	 @Override
   protected Filter[] getServletFilters() {

     CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
     characterEncodingFilter.setEncoding("UTF-8");
     return new Filter[] { characterEncodingFilter};
   }

}

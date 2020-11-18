package br.jus.tjrj.integracaoSiscondj.soap;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
@EnableWs
public class WebServiceConfig extends WsConfigurerAdapter {
	
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context) {
		
		MessageDispatcherServlet messageDS = new MessageDispatcherServlet();
		messageDS.setApplicationContext(context);
		messageDS.setTransformWsdlLocations(true);
		
		return new ServletRegistrationBean(messageDS, "/ws/*");
	}
	
	@Bean
	public XsdSchema processoSchema() {
		return new SimpleXsdSchema(new ClassPathResource("/xsd/processo-schema.xsd"));
	}
	
	@Bean(name="processos") 
	public DefaultWsdl11Definition defaultWsdl11DefinitionProcessos(XsdSchema processoSchema) {
		
		DefaultWsdl11Definition dwDefinition = new DefaultWsdl11Definition();
		dwDefinition.setPortTypeName("ProcessosPort");
		dwDefinition.setTargetNamespace("processo.soap.integracaoSiscondj.tjrj.jus.br");
		dwDefinition.setLocationUri("/ws");
		dwDefinition.setSchema(processoSchema);
		return dwDefinition;		
	}
	
	@Bean
	public XsdSchema comarcaSchema() {
		return new SimpleXsdSchema(new ClassPathResource("/xsd/comarca-schema.xsd"));
	}
	
	@Bean(name="comarcas") 
	public DefaultWsdl11Definition defaultWsdl11DefinitionComarcas(XsdSchema comarcaSchema) {
		
		DefaultWsdl11Definition dwDefinition = new DefaultWsdl11Definition();
		dwDefinition.setPortTypeName("ComarcasPort");
		dwDefinition.setTargetNamespace("comarca.soap.integracaoSiscondj.tjrj.jus.br");
		dwDefinition.setLocationUri("/ws");
		dwDefinition.setSchema(comarcaSchema);
		return dwDefinition;		
	}

}

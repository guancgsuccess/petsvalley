package com.petsvalley;

import com.petsvalley.interceptor.AdminInterceptor;
import com.petsvalley.interceptor.LoginInterceptor;
import com.petsvalley.interceptor.RoleInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.*;

import java.util.List;

@SpringBootConfiguration
public class MyspringmvcConfig implements WebMvcConfigurer {
    @Autowired
    private LoginInterceptor interceptor;
    @Autowired
    private RoleInterceptor roleInterceptor;
    @Autowired
    private AdminInterceptor adminInterceptor;
    @Override
    public void addInterceptors( InterceptorRegistry registry ) {
        //登录拦截
        registry.addInterceptor( interceptor ).addPathPatterns("/customer/update" );
        registry.addInterceptor( interceptor ).addPathPatterns("/cs_release_find_pet" );
        registry.addInterceptor( interceptor ).addPathPatterns("/cs_update_find_pet" );
        registry.addInterceptor( interceptor ).addPathPatterns("/findPet/releaseFindPet" );
        registry.addInterceptor( interceptor ).addPathPatterns("/findPet/getPetsByCustId" );
        registry.addInterceptor( interceptor ).addPathPatterns("/cs_release_foster" );
        registry.addInterceptor( interceptor ).addPathPatterns("/cs_release_claim" );
        registry.addInterceptor( interceptor ).addPathPatterns("/cs_update_claim" );
        registry.addInterceptor( interceptor ).addPathPatterns("/claim/update_claim" );
        registry.addInterceptor( interceptor ).addPathPatterns("/userInfo" );
        registry.addInterceptor( interceptor ).addPathPatterns("/message");
        registry.addInterceptor( interceptor ).addPathPatterns("/appeal");
        registry.addInterceptor( interceptor ).addPathPatterns("/apply");
        registry.addInterceptor( interceptor ).addPathPatterns("/match");
        registry.addInterceptor( interceptor ).addPathPatterns("/mypets");
        registry.addInterceptor( interceptor ).addPathPatterns("/physical");
        registry.addInterceptor( interceptor ).addPathPatterns("/punishment");
        registry.addInterceptor( interceptor ).addPathPatterns("/seedoctor");
        registry.addInterceptor( interceptor ).addPathPatterns("/service2");
        registry.addInterceptor( interceptor ).addPathPatterns("/vaccine");
        registry.addInterceptor( interceptor ).addPathPatterns("/myposts");
        registry.addInterceptor( interceptor ).addPathPatterns("/foster");
        registry.addInterceptor( interceptor ).addPathPatterns("/claim");
        registry.addInterceptor( interceptor ).addPathPatterns("/findPet");
        registry.addInterceptor( interceptor ).addPathPatterns("/strategy");
        registry.addInterceptor( interceptor ).addPathPatterns("/system");
        registry.addInterceptor( interceptor ).addPathPatterns("/appealmanage");
        registry.addInterceptor( interceptor ).addPathPatterns("/customer");
        registry.addInterceptor( interceptor ).addPathPatterns("/postmanage");
        registry.addInterceptor( interceptor ).addPathPatterns("/petmanage");
        registry.addInterceptor( interceptor ).addPathPatterns("/physicalmanage");
        registry.addInterceptor( interceptor ).addPathPatterns("/servicemanage");
        registry.addInterceptor( interceptor ).addPathPatterns("/punishmentmanage");
        registry.addInterceptor( interceptor ).addPathPatterns("/vaccinemanage");
        registry.addInterceptor( interceptor ).addPathPatterns("/messagemanage");
        //用户权限拦截
        registry.addInterceptor( roleInterceptor ).addPathPatterns("/system");
        registry.addInterceptor( roleInterceptor ).addPathPatterns("/appealmanage");
        registry.addInterceptor( roleInterceptor ).addPathPatterns("/customer");
        registry.addInterceptor( roleInterceptor ).addPathPatterns("/postmanage");
        registry.addInterceptor( roleInterceptor ).addPathPatterns("/petmanage");
        registry.addInterceptor( roleInterceptor ).addPathPatterns("/physicalmanage");
        registry.addInterceptor( roleInterceptor ).addPathPatterns("/servicemanage");
        registry.addInterceptor( roleInterceptor ).addPathPatterns("/punishmentmanage");
        registry.addInterceptor( roleInterceptor ).addPathPatterns("/vaccinemanage");
        registry.addInterceptor( roleInterceptor ).addPathPatterns("/messagemanage");
        //管理员权限拦截
        registry.addInterceptor( adminInterceptor ).addPathPatterns( "/post" );
        registry.addInterceptor( adminInterceptor ).addPathPatterns( "/post_details" );
        registry.addInterceptor( adminInterceptor ).addPathPatterns( "/system_post" );
        registry.addInterceptor( adminInterceptor ).addPathPatterns( "/cs_find_pets" );
        registry.addInterceptor( adminInterceptor ).addPathPatterns( "/cs_release_find_pet" );
        registry.addInterceptor( adminInterceptor ).addPathPatterns( "/cs_find_pet_info" );
        registry.addInterceptor( adminInterceptor ).addPathPatterns( "/cs_volunteer_service" );
        registry.addInterceptor( adminInterceptor ).addPathPatterns( "/cs_foster" );
        registry.addInterceptor( adminInterceptor ).addPathPatterns( "/cs_foster_info" );
        registry.addInterceptor( adminInterceptor ).addPathPatterns( "/cs_release_foster" );
        registry.addInterceptor( adminInterceptor ).addPathPatterns( "/cs_update_find_pet" );
        registry.addInterceptor( adminInterceptor ).addPathPatterns( "/cs_claim" );
        registry.addInterceptor( adminInterceptor ).addPathPatterns( "/cs_claim_info" );
        registry.addInterceptor( adminInterceptor ).addPathPatterns( "/cs_update_claim" );
        registry.addInterceptor( adminInterceptor ).addPathPatterns( "/cs_release_claim" );
        registry.addInterceptor( adminInterceptor ).addPathPatterns( "/cs_my_claim" );
        registry.addInterceptor( adminInterceptor ).addPathPatterns( "/findPet" );
        registry.addInterceptor( adminInterceptor ).addPathPatterns( "/userInfo" );
        registry.addInterceptor( adminInterceptor ).addPathPatterns("/message");
        registry.addInterceptor( adminInterceptor ).addPathPatterns("/appeal");
        registry.addInterceptor( adminInterceptor ).addPathPatterns("/apply");
        registry.addInterceptor( adminInterceptor ).addPathPatterns("/match");
        registry.addInterceptor( adminInterceptor ).addPathPatterns("/mypets");
        registry.addInterceptor( adminInterceptor ).addPathPatterns("/physical");
        registry.addInterceptor( adminInterceptor ).addPathPatterns("/punishment");
        registry.addInterceptor( adminInterceptor ).addPathPatterns("/seedoctor");
        registry.addInterceptor( adminInterceptor ).addPathPatterns("/service2");
        registry.addInterceptor( adminInterceptor ).addPathPatterns("/vaccine");
        registry.addInterceptor( adminInterceptor ).addPathPatterns("/myposts");
        registry.addInterceptor( adminInterceptor ).addPathPatterns("/foster");
        registry.addInterceptor( adminInterceptor ).addPathPatterns("/claim");
        registry.addInterceptor( adminInterceptor ).addPathPatterns("/findPet");
        registry.addInterceptor( adminInterceptor ).addPathPatterns("/strategy");
    }
    @Override
    public void configurePathMatch( PathMatchConfigurer pathMatchConfigurer ) {

    }

    @Override
    public void configureContentNegotiation( ContentNegotiationConfigurer contentNegotiationConfigurer ) {

    }

    @Override
    public void configureAsyncSupport( AsyncSupportConfigurer asyncSupportConfigurer ) {

    }

    @Override
    public void configureDefaultServletHandling( DefaultServletHandlerConfigurer defaultServletHandlerConfigurer ) {

    }

    @Override
    public void addFormatters( FormatterRegistry formatterRegistry ) {

    }


    @Override
    public void addResourceHandlers( ResourceHandlerRegistry resourceHandlerRegistry ) {

    }

    @Override
    public void addCorsMappings( CorsRegistry corsRegistry ) {

    }

    @Override
    public void addViewControllers( ViewControllerRegistry viewControllerRegistry ) {

    }

    @Override
    public void configureViewResolvers( ViewResolverRegistry viewResolverRegistry ) {

    }

    @Override
    public void addArgumentResolvers( List<HandlerMethodArgumentResolver> list ) {

    }

    @Override
    public void addReturnValueHandlers( List<HandlerMethodReturnValueHandler> list ) {

    }

    @Override
    public void configureMessageConverters( List<HttpMessageConverter<?>> list ) {

    }

    @Override
    public void extendMessageConverters( List<HttpMessageConverter<?>> list ) {

    }

    @Override
    public void configureHandlerExceptionResolvers( List<HandlerExceptionResolver> list ) {

    }

    @Override
    public void extendHandlerExceptionResolvers( List<HandlerExceptionResolver> list ) {

    }

    @Override
    public Validator getValidator( ) {
        return null;
    }

    @Override
    public MessageCodesResolver getMessageCodesResolver( ) {
        return null;
    }
}

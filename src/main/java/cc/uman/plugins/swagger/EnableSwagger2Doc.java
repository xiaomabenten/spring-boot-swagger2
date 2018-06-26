package cc.uman.plugins.swagger;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 开发引用是直接在SpringBoot上注解@EnableSwagger2Doc
 *
 * @author shaohua
 * Email shaohua@uoko.com
 * created by 2018/5/31
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({SwaggerAutoConfiguration.class})
public @interface EnableSwagger2Doc {


}

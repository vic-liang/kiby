/**
 * 
 * @creatTime 下午4:51:53
 * @author Eddy
 */
package org.eddy.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Eddy
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface Validate {

	Algorithm algorithm();
	
	String expect();
	
	String exception() default "param value not match";
}

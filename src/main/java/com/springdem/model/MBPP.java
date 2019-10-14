package com.springdem.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MBPP  implements BeanPostProcessor{

	/* （非 Javadoc）
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessBeforeInitialization(java.lang.Object, java.lang.String)
	 */
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO 自动生成的方法存根
		System.out.println("Before!");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	/* （非 Javadoc）
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessAfterInitialization(java.lang.Object, java.lang.String)
	 */
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO 自动生成的方法存根
		System.out.println("After!");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}



  
}

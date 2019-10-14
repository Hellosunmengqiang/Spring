package com.springdem.aop;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
/*
 * 1.LoggerAspect 类让spring来管理，放入到spring的IOC容器里
 * 2.告诉spring的这个类不是普通类，是一个切面，就是横切关注点的集合，与核心业务代码无关的日志，权限，事务代码，集中起来组合成切面
 */
//@Aspect
@Component("loggerAspect")
public class LoggerAspect {
	
	private Logger logger=Logger.getLogger(this.getClass());
	
	//把一样的切入点表达式，像提公因式一样，提取出来，统一管理和维护
	/*@Pointcut("execution(* com.springdem.aop.*.*(..))")
	public void commonExecution() {
		
	}*/

	
	/*
	 * 指定beforeMethod在那个类的哪个方法之前执行，确定切入点
	 * @Before的参数里，写一个切入点表达式，来告诉spring，要将下面的方法，切入到哪个方法哪个类的前面去执行
	 */

	//@Before("commonExecution()")
	public void beforeMethod(JoinPoint joinPoint)
	{
		String methodName=joinPoint.getSignature().getName();//拿到切入点的方法名
		List<Object> args=Arrays.asList(joinPoint.getArgs());//拿到切入点的参数
		
		logger.info(methodName+"方法之前执行，拿到这个方法的参数:"+args);
	}
	
	//@After("commonExecution()")
	public void afterMethod(JoinPoint joinPoint)
	{
		String methodName=joinPoint.getSignature().getName();//拿到切入点的方法名
		List<Object> args=Arrays.asList(joinPoint.getArgs());//拿到切入点的参数
		
		logger.info(methodName+"方法之后执行，拿到这个方法的参数:"+args);
	}
	//@AfterReturning(value="commonExecution()",returning="rs")
	public void returningMethod(JoinPoint joinPoint,Object rs)
	{
		String methodName=joinPoint.getSignature().getName();//拿到切入点的方法名
		List<Object> args=Arrays.asList(joinPoint.getArgs());//拿到切入点的参数
		
		logger.info(methodName+"方法之后执行没有异常，返回结果，执行日志程序，这个方法的参数:"+args+"，运算结果:"+rs);
	}
	//@AfterThrowing(value="commonExecution()",throwing="ex")
	public void throwingMethod(JoinPoint joinPoint,Exception ex)
	{
		String methodName=joinPoint.getSignature().getName();//拿到切入点的方法名
		List<Object> args=Arrays.asList(joinPoint.getArgs());//拿到切入点的参数
		
		logger.info(methodName+"方法之后发生异常，返回结果，执行日志程序，这个方法的参数:"+args+"，异常信息:"+ex.getMessage());
	}
	
	
	
	/*@Around("commonExecution()")//环绕通知
	public Object aroundMethod(ProceedingJoinPoint pjp)
	{
		Object rs=null;
		String methodName=pjp.getSignature().getName();
		List<Object> args=Arrays.asList(pjp.getArgs());
		try {
			logger.info(methodName+"方法之前执行，拿到这个方法的参数:"+args);
			rs=pjp.proceed();//把切入点的目标方法，移过来在这里执行！
			logger.info(methodName+"方法之后执行没有异常，返回结果，执行日志程序，这个方法的参数:"+args+"，运算结果:"+rs);
			
			
		} catch (Throwable e) {
			logger.info(methodName+"方法之后发生异常，返回结果，执行日志程序，这个方法的参数:"+args+"，异常信息:"+e.getMessage());
			e.printStackTrace();
		}
		logger.info(methodName+"方法之后执行，拿到这个方法的参数:"+args);
		return rs;
		
	}*/
}

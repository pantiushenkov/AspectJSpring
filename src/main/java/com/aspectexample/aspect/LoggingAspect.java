package com.aspectexample.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect {

	@Before("execution(* com.aspectexample.user.User.createPlaylist(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("before method " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.aspectexample.user.User.createPlaylist(..))")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("after method " + joinPoint.getSignature().getName() +"\n");
	}

	public void logAfterReturning(JoinPoint joinPoint, String playlistName) {
		System.out.println("afterReturning of method: " + joinPoint.getSignature().getName());
		System.out.println("Method returned value is : " + playlistName + "\n");
	}
	
	// configured in  
 	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
		System.out.println("logAfterThrowing()  : " + joinPoint.getSignature().getName());
		System.out.println("Exception : " + error);
	}
	
	
	@Around("execution(* com.aspectexample.user.User.createPlaylistAround(..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("running around method of " + joinPoint.getSignature().getName() + " with arguments: " + Arrays.toString(joinPoint.getArgs()));
		
		System.out.println("Around before is running!");
		joinPoint.proceed();
		System.out.println("Around after is running!");
	}
	
}
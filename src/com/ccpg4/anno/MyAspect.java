package com.ccpg4.anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by lenovo on 2017/7/19.
 */
@Component
@Aspect
public class MyAspect {
    //@Before("execution(* com.ccpg4.anno.UserServiceImpl.*(..))")
    public void myBefore(JoinPoint joinPoint){
        System.out.println("前置通知...."+joinPoint.getSignature().getName());
    }

    //声明一个公共的切入点
    @Pointcut("execution(* com.ccpg4.anno.UserServiceImpl.*(..))")
    public void myPointCut(){

    }
   // @AfterReturning(value = "myPointCut()",returning = "ret")
    public void myAfterReturning(JoinPoint joinPoint,Object ret){
        System.out.println("后置通知..."+joinPoint.getSignature().getName()+"---ret---"+ret);
    }
    //@Around(value = "myPointCut()")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        System.out.println("前......");
        Object object = proceedingJoinPoint.proceed();
        System.out.println("后......");
        return object;
    }
    //@AfterThrowing(value = "myPointCut()",throwing = "e")
    public void myAfterThrowing(JoinPoint joinPoin,Throwable e){
        System.out.println("抛出异常通知 ： " + e.getMessage());
    }
    @After(value = "myPointCut()")
    public void myAfter(JoinPoint joinPoint){
    System.out.println("最终通知..."+joinPoint.getSignature().getName());
    }
}

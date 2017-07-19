package com.ccpg4.basexml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by lenovo on 2017/7/19.
 */
public class MyAspect {
    /**
     * 前置通知。。。
     * @param joinPoint 连接点
     */
    public void myBefore(JoinPoint joinPoint){
        System.out.println("前置通知...."+joinPoint.getSignature().getName());
    }

    /**
     *
     * @param joinPoint 连接点
     * @param ret 返回参数
     */
    public void myAfterReturning(JoinPoint joinPoint,Object ret){
        System.out.println("后置通知..."+joinPoint.getSignature().getName()+"---ret---"+ret);
    }

    public Object myAround(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        System.out.println("前......");
        Object object = proceedingJoinPoint.proceed();
        System.out.println("后......");
        return object;
    }
    public void myAfterThrowing(JoinPoint joinPoin,Throwable e){
        System.out.println("抛出异常通知 ： " + e.getMessage());
    }

    public void myAfter(JoinPoint joinPoint){
    System.out.println("最终通知..."+joinPoint.getSignature().getName());
    }
}

package com.example.designPattern.decorator.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Aspect
@Component
public class SimpleAspect {

    @Pointcut("execution(* com.example.designPattern.decorator.Coffee.print*(..))")
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature = pjp.getSignature();
        System.out.println("Called: " + pjp.getTarget().getClass().getName()
                + "." + signature.getName());

        Object [] args = pjp.getArgs();

        for(Object obj : args) {
            Package p = obj.getClass().getPackage();

            if(p.getImplementationTitle() == null) {
                System.out.println(": " + obj.getClass().getSimpleName());
                Field [] fields = obj.getClass().getDeclaredFields();

                for (Field field : fields) {
                    field.setAccessible(true);
                    Object value = field.get(obj);
                    System.out.println("> " + value);
                }
            } else {
                System.out.println(": " + obj);
            }
        }
        Object ret = pjp.proceed();

        return ret;
    }

}
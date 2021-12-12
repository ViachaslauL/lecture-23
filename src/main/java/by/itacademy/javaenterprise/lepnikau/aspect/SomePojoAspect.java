package by.itacademy.javaenterprise.lepnikau.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SomePojoAspect {
    private static final Logger LOG = LoggerFactory.getLogger(SomePojoAspect.class);

    @Pointcut("execution(* by.itacademy.javaenterprise.lepnikau.pojo.SomePojo.firstMethod())")
    public void interceptFirstMethod() {
    }

    @Pointcut("execution(* by.itacademy.javaenterprise.lepnikau.pojo.SomePojo.secondMethod(String, int, double))")
    public void interceptSecondMethod() {
    }

    @Before("interceptFirstMethod()")
    public void beforeFirstMethodWork() {
        LOG.info("Before first method work.");
    }

    @AfterReturning("interceptFirstMethod()")
    public void afterFirstMethodWork() {
        LOG.info("After first method work.");
    }

    @Around("interceptFirstMethod()")
    public void aroundFirstMethod(ProceedingJoinPoint joinPoint) {
        try {
            LOG.info("Start");
            LOG.info("Begin time: " + System.currentTimeMillis());
            Object result = joinPoint.proceed();
            LOG.info("Finish time: " + System.currentTimeMillis());
            LOG.info("Status: " + result);
        } catch (Throwable throwable) {
            LOG.error(throwable.toString(), throwable);
        }
    }

    @Before("interceptSecondMethod()")
    public void beforeSecondMethodWork() {
        LOG.info("Before second method work.");
    }

    @AfterReturning("interceptSecondMethod()")
    public void afterSecondMethodWork() {
        LOG.info("After second method work.");
    }

    @Around("interceptSecondMethod()")
    public void aroundSecondMethod(ProceedingJoinPoint joinPoint) {
        try {
            LOG.info("Start");
            LOG.info("Begin time: " + System.currentTimeMillis());
            Object result = joinPoint.proceed();
            LOG.info("Finish time: " + System.currentTimeMillis());
            LOG.info("Status: " + result);
        } catch (Throwable throwable) {
            LOG.error(throwable.toString(), throwable);
        }
    }
}

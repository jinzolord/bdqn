package cn.tcbd.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

public class ControllerLogin {

    private final Logger logger = Logger.getLogger("ControllerLogin");

    public void before(JoinPoint jp) {
        logger.error("\n-调用了" + jp.getTarget() + "类 \n-" + jp.getSignature().getName()
                + "方法 \n-参数" + Arrays.toString(jp.getArgs()));
    }

    public void after(JoinPoint jp, Object result) {
        logger.error("\n-调用了" + jp.getTarget() + "类 \n-" + jp.getSignature().getName()
                + "方法结束 \n-返回" + result);
    }

}

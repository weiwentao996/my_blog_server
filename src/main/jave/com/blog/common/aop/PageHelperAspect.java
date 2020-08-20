package com.blog.common.aop;


import com.github.pagehelper.PageHelper;

import com.blog.common.utils.ReflectUtil;
import com.blog.query.BaseQuery;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
@Slf4j
public class PageHelperAspect {

    @Pointcut("execution(public * com.blog.service.*.*List(..))")
    public void serviceFindFunction(){}
    /**
     * 使用around方法 在执行查询方法前执行PageHelper.startWith
     * 在执行查询方法后 将结果封装到PageInfo中
     * @param proceedingJoinPoint
     * @return
     * @throws Throwable
     */
    @Around("serviceFindFunction()")
    public Object serviceImplAop(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //获取连接点方法运行时的入参列表
        Object[] args = proceedingJoinPoint.getArgs();

        //获取连接点的方法签名对象
        Signature signature = proceedingJoinPoint.getSignature();

        //获取连接点所在的类的对象(实例)
        Object target = proceedingJoinPoint.getTarget();
        for (int i = 0; i < args.length; i++) {
            Class<?> superclass = args[i].getClass().getSuperclass();
            if (superclass.getName().equals(BaseQuery.class.getName())){
                PageHelper.startPage(Integer.parseInt(ReflectUtil.getValueFormObject(args[i],"currentPage").toString()),Integer.parseInt(ReflectUtil.getValueFormObject(args[i],"pageSize").toString()));
                Object object = proceedingJoinPoint.proceed();
//                if(object instanceof List) {
//                    List objList = (List) object;
//                    PageInfo pageInfo = new PageInfo<>(objList);
//                    return pageInfo;
//                }
                return object;
            }

        }
        Object object = proceedingJoinPoint.proceed();
        return object;
    }

}
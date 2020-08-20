package com.blog.common.utils;

import java.lang.reflect.Field;

public class ReflectUtil {

    public static Object getValueFormObject(Object object, String fieldName) {
        if (object == null) {
//            LOG.error("the fields is wrong,object is null,fieldName is "+fieldName);
            System.out.println("the fields is wrong,object is null,fieldName is " + fieldName);
            return null;
        }
        if (fieldName == null || fieldName == "") {
//            LOG.error("the fields is wrong,object is null,object is  "+object.toString());
            System.out.println("the fields is wrong,object is null,fieldName is " + fieldName);
            return null;
        }
        Field field;
        try {
            field = object.getClass().getField(fieldName);
            if (field != null) {
                field.setAccessible(true);
                return field.get(object);
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
//            LOG.error("Get Value Form Object Wrong");
            System.out.println("Get Value Form Object Wrong");
        }

        return null;
    }
}
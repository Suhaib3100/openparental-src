package yc;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: ClassKey.java */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@vc.f
/* loaded from: classes8.dex */
public @interface a {
    Class<?> value();
}

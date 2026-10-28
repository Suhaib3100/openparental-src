package jf;

import cg.f0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: UnderInitialization.java */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@f0({e.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface d {
    Class<?> value() default Object.class;
}

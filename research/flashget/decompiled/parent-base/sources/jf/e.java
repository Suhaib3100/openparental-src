package jf;

import cg.f0;
import cg.i0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: UnknownInitialization.java */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@f0({})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@cg.e({i0.LOCAL_VARIABLE, i0.RESOURCE_VARIABLE})
/* loaded from: classes3.dex */
public @interface e {
    Class<?> value() default Object.class;
}

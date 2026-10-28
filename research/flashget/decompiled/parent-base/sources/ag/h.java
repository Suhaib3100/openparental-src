package ag;

import cg.f0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: IntRange.java */
@Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
@f0({s.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface h {
    long from() default Long.MIN_VALUE;

    long to() default Long.MAX_VALUE;
}

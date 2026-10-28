package ag;

import cg.f0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: ArrayLenRange.java */
@Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
@f0({s.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface b {
    int from() default 0;

    int to() default Integer.MAX_VALUE;
}

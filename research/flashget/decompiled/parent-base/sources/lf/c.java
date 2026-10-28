package lf;

import cg.f0;
import cg.g0;
import cg.i0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: GuardSatisfied.java */
@g0({i0.RECEIVER, i0.PARAMETER, i0.RETURN})
@Target({ElementType.TYPE_USE})
@f0({f.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface c {
    int value() default -1;
}

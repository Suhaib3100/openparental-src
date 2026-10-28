package p002if;

import cg.f0;
import cg.r;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: LTLengthOf.java */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@f0({h.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface i {
    @r
    String[] offset() default {};

    @r
    String[] value();
}

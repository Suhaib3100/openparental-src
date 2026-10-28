package tf;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: K.java */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@cg.f0({p.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface g {
    m value() default m.one;
}

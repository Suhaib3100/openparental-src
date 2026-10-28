package pf;

import cg.f0;
import cg.q;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: PartialRegex.java */
@Target({})
@f0({e.class})
@q
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface a {
    String value() default "";
}

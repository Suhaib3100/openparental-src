package p002if;

import cg.r;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: SubstringIndexFor.java */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@cg.f0({g0.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface f0 {
    @r
    String[] offset();

    @r
    String[] value();
}

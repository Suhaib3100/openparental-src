package p002if;

import cg.f0;
import cg.r;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: LTOMLengthOf.java */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@f0({i.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface j {
    @r
    String[] value();
}

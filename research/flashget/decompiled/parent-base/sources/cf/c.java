package cf;

import cg.f0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: CalledMethodsPredicate.java */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@f0({a.class})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface c {
    String value();
}

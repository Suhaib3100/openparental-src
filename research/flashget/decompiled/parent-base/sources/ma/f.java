package ma;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: ReflectionSupport.java */
@Target({ElementType.TYPE, ElementType.PACKAGE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes6.dex */
public @interface f {

    /* compiled from: ReflectionSupport.java */
    public enum a {
        NATIVE_ONLY,
        FULL
    }

    a value();
}

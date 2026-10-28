package w4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: IgnoreWhen.java */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes5.dex */
public @interface i0 {

    /* compiled from: IgnoreWhen.java */
    public enum a {
        DETACHED,
        VIEW_DESTROYED
    }

    a value();
}

package w4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: UiThread.java */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes5.dex */
public @interface w1 {

    /* compiled from: UiThread.java */
    public enum a {
        ENQUEUE,
        REUSE
    }

    long delay() default 0;

    String id() default "";

    a propagation() default a.ENQUEUE;
}

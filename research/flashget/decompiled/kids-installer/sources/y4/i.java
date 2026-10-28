package y4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: SharedPref.java */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes5.dex */
public @interface i {

    /* compiled from: SharedPref.java */
    public enum a {
        APPLICATION_DEFAULT,
        ACTIVITY,
        ACTIVITY_DEFAULT,
        UNIQUE
    }

    int mode() default 0;

    String name() default "";

    a value() default a.ACTIVITY;
}

package w4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: OnActivityResult.java */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes5.dex */
public @interface u0 {

    /* compiled from: OnActivityResult.java */
    @Target({ElementType.PARAMETER})
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
        String value() default "";
    }

    int value();
}

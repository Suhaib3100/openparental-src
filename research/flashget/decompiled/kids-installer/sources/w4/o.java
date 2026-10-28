package w4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: EActivity.java */
@Target({ElementType.TYPE})
@org.androidannotations.api.b
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes5.dex */
public @interface o {
    String resName() default "";

    int value() default -1;
}

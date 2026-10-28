package w4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: EBean.java */
@Target({ElementType.TYPE})
@org.androidannotations.api.b
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes5.dex */
public @interface q {

    /* compiled from: EBean.java */
    public enum a {
        Default,
        Activity,
        Fragment,
        Singleton
    }

    a scope() default a.Default;
}

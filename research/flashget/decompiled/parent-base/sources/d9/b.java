package d9;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: GwtCompatible.java */
@Target({ElementType.TYPE, ElementType.METHOD})
@b
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes6.dex */
public @interface b {
    boolean emulated() default false;

    boolean serializable() default false;
}

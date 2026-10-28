package androidx.databinding;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* compiled from: InverseBindingMethod.java */
@Target({ElementType.ANNOTATION_TYPE})
/* loaded from: classes.dex */
public @interface p {
    String attribute();

    String event() default "";

    String method() default "";

    Class type();
}

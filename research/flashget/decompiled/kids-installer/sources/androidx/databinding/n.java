package androidx.databinding;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* compiled from: InverseBindingAdapter.java */
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
/* loaded from: classes.dex */
public @interface n {
    String attribute();

    String event() default "";
}

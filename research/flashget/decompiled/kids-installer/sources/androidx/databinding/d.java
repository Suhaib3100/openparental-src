package androidx.databinding;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* compiled from: BindingAdapter.java */
@Target({ElementType.METHOD})
/* loaded from: classes.dex */
public @interface d {
    boolean requireAll() default true;

    String[] value();
}

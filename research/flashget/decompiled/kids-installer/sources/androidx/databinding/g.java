package androidx.databinding;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* compiled from: BindingMethod.java */
@Target({ElementType.ANNOTATION_TYPE})
/* loaded from: classes.dex */
public @interface g {
    String attribute();

    String method();

    Class type();
}

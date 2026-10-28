package org.intellij.lang.annotations;

import fg.k;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: RegExp.java */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
@d("RegExp")
/* loaded from: classes6.dex */
public @interface i {
    @k
    String prefix() default "";

    @k
    String suffix() default "";
}

package f9;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* compiled from: RestrictedApi.java */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
/* loaded from: classes6.dex */
public @interface t {
    String allowedOnPath() default "";

    Class<? extends Annotation>[] allowlistAnnotations() default {};

    Class<? extends Annotation>[] allowlistWithWarningAnnotations() default {};

    String explanation();

    String link() default "";
}

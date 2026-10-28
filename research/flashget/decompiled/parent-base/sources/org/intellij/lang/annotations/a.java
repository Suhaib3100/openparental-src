package org.intellij.lang.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Flow.java */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes6.dex */
public @interface a {

    /* renamed from: s3, reason: collision with root package name */
    public static final String f86908s3 = "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    /* renamed from: w3, reason: collision with root package name */
    public static final String f86912w3 = "this";

    /* renamed from: v3, reason: collision with root package name */
    public static final String f86911v3 = "The return value of this method";

    /* renamed from: u3, reason: collision with root package name */
    public static final String f86910u3 = "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    /* renamed from: t3, reason: collision with root package name */
    public static final String f86909t3 = "this";

    String source() default "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    boolean sourceIsContainer() default false;

    String target() default "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    boolean targetIsContainer() default false;
}

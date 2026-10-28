package org.intellij.lang.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Flow.java */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes5.dex */
public @interface a {

    /* renamed from: p0, reason: collision with root package name */
    @d5.c
    public static final String f32235p0 = "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    /* renamed from: t0, reason: collision with root package name */
    @d5.c
    public static final String f32239t0 = "this";

    /* renamed from: s0, reason: collision with root package name */
    @d5.c
    public static final String f32238s0 = "The return value of this method";

    /* renamed from: r0, reason: collision with root package name */
    @d5.c
    public static final String f32237r0 = "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    /* renamed from: q0, reason: collision with root package name */
    @d5.c
    public static final String f32236q0 = "this";

    String source() default "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    boolean sourceIsContainer() default false;

    String target() default "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    boolean targetIsContainer() default false;
}

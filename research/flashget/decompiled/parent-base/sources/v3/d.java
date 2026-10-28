package v3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: GlideOption.java */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface d {

    /* renamed from: x3, reason: collision with root package name */
    public static final int f92829x3 = 0;

    /* renamed from: y3, reason: collision with root package name */
    public static final int f92830y3 = 1;

    /* renamed from: z3, reason: collision with root package name */
    public static final int f92831z3 = 2;

    boolean memoizeStaticMethod() default false;

    int override() default 0;

    boolean skipStaticMethod() default false;

    String staticMethodName() default "";
}

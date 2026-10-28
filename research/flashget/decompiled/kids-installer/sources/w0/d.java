package w0;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: GlideOption.java */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface d {

    /* renamed from: u0, reason: collision with root package name */
    public static final int f34015u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public static final int f34016v0 = 1;

    /* renamed from: w0, reason: collision with root package name */
    public static final int f34017w0 = 2;

    boolean memoizeStaticMethod() default false;

    int override() default 0;

    boolean skipStaticMethod() default false;

    String staticMethodName() default "";
}

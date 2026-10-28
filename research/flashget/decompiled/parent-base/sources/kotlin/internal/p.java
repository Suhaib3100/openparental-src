package kotlin.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.n1;

/* compiled from: Annotations.kt */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@dd.d
@c1(version = "1.2")
@dd.e(dd.a.SOURCE)
@Retention(RetentionPolicy.SOURCE)
@dd.f(allowedTargets = {dd.b.CLASS, dd.b.FUNCTION, dd.b.PROPERTY, dd.b.CONSTRUCTOR, dd.b.TYPEALIAS})
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0081\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\rR\u0011\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000eR\u0011\u0010\b\u001a\u00020\u00078\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\u000fR\u0011\u0010\n\u001a\u00020\t8\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/internal/p;", "", "", "version", "message", "Lkotlin/m;", "level", "Lkotlin/internal/q;", "versionKind", "", "errorCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/m;Lkotlin/internal/q;I)V", "()Ljava/lang/String;", "()Lkotlin/m;", "()Lkotlin/internal/q;", "()I", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Repeatable(a.class)
/* loaded from: classes7.dex */
public @interface p {

    /* compiled from: Annotations.kt */
    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @n1
    @dd.e(dd.a.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    @dd.f(allowedTargets = {dd.b.CLASS, dd.b.FUNCTION, dd.b.PROPERTY, dd.b.CONSTRUCTOR, dd.b.TYPEALIAS})
    public @interface a {
        p[] value();
    }

    int errorCode() default -1;

    kotlin.m level() default kotlin.m.ERROR;

    String message() default "";

    String version();

    q versionKind() default q.LANGUAGE_VERSION;
}

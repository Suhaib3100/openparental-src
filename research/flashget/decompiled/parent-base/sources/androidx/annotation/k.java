package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: ChecksSdkIntAtLeast.jvm.kt */
@Target({ElementType.FIELD, ElementType.METHOD})
@dd.c
@dd.e(dd.a.BINARY)
@Retention(RetentionPolicy.CLASS)
@dd.f(allowedTargets = {dd.b.FUNCTION, dd.b.PROPERTY_GETTER, dd.b.PROPERTY_SETTER, dd.b.FIELD})
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0002\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\fR\u0011\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u000bR\u0011\u0010\b\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/annotation/k;", "", "", "api", "", "codename", "parameter", "lambda", "extension", "<init>", "(ILjava/lang/String;III)V", "()I", "()Ljava/lang/String;", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
@Documented
/* loaded from: classes.dex */
public @interface k {
    int api() default -1;

    String codename() default "";

    int extension() default 0;

    int lambda() default -1;

    int parameter() default -1;
}

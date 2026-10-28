package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: ChecksSdkIntAtLeast.jvm.kt */
@i3.e(i3.a.BINARY)
@Target({ElementType.FIELD, ElementType.METHOD})
@i3.f(allowedTargets = {i3.b.FUNCTION, i3.b.PROPERTY_GETTER, i3.b.PROPERTY_SETTER, i3.b.FIELD})
@Retention(RetentionPolicy.CLASS)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0002\u0018\u00002\u00020\u0001B2\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0011\u0010\t\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004R\u0011\u0010\n\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Landroidx/annotation/k;", "", "", "api", "()I", "", "codename", "()Ljava/lang/String;", "parameter", "lambda", "extension", "annotation"}, k = 1, mv = {1, 7, 0})
@i3.c
@Documented
/* loaded from: classes.dex */
public @interface k {
    int api() default -1;

    String codename() default "";

    int extension() default 0;

    int lambda() default -1;

    int parameter() default -1;
}

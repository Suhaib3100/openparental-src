package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: IntRange.kt */
@i3.e(i3.a.BINARY)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@i3.f(allowedTargets = {i3.b.FUNCTION, i3.b.PROPERTY_GETTER, i3.b.PROPERTY_SETTER, i3.b.VALUE_PARAMETER, i3.b.FIELD, i3.b.LOCAL_VARIABLE, i3.b.ANNOTATION_CLASS})
@Retention(RetentionPolicy.CLASS)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0014\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/annotation/g0;", "", "", "from", "()J", "to", "annotation"}, k = 1, mv = {1, 7, 0})
@i3.c
@Documented
/* loaded from: classes.dex */
public @interface g0 {
    long from() default Long.MIN_VALUE;

    long to() default Long.MAX_VALUE;
}

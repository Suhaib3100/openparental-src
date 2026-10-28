package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: LongDef.kt */
@Target({ElementType.ANNOTATION_TYPE})
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\u0002\u0018\u00002\u00020\u0001B)\u0012\f\b\u0002\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/annotation/k0;", "", "", "", "value", "", "flag", "open", "<init>", "([JZZ)V", "()[J", "()Z", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
@dd.e(dd.a.SOURCE)
@Retention(RetentionPolicy.SOURCE)
@dd.f(allowedTargets = {dd.b.ANNOTATION_CLASS})
/* loaded from: classes.dex */
public @interface k0 {
    boolean flag() default false;

    boolean open() default false;

    long[] value() default {};
}

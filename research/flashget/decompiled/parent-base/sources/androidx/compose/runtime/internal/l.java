package androidx.compose.runtime.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.jvm.internal.n1;

/* compiled from: FunctionKeyMeta.kt */
@Target({ElementType.TYPE})
@dd.d
@dd.e(dd.a.RUNTIME)
@Retention(RetentionPolicy.RUNTIME)
@dd.f(allowedTargets = {dd.b.CLASS})
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\bR\u0011\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/internal/l;", "", "", "key", "startOffset", "endOffset", "<init>", "(III)V", "()I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.q
@Repeatable(a.class)
/* loaded from: classes.dex */
public @interface l {

    /* compiled from: FunctionKeyMeta.kt */
    @Target({ElementType.TYPE})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @n1
    @dd.e(dd.a.RUNTIME)
    @Retention(RetentionPolicy.RUNTIME)
    @dd.f(allowedTargets = {dd.b.CLASS})
    public @interface a {
        l[] value();
    }

    int endOffset();

    int key();

    int startOffset();
}

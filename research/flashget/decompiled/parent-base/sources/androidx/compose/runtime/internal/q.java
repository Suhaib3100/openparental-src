package androidx.compose.runtime.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: LiveLiteral.kt */
@Target({ElementType.METHOD})
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\bR\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/internal/q;", "", "", "key", "", "offset", "<init>", "(Ljava/lang/String;I)V", "()Ljava/lang/String;", "()I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.q
@dd.e(dd.a.RUNTIME)
@Retention(RetentionPolicy.RUNTIME)
@dd.f(allowedTargets = {dd.b.FUNCTION})
/* loaded from: classes.dex */
public @interface q {
    String key();

    int offset();
}

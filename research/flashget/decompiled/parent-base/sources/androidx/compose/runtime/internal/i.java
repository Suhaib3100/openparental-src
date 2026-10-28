package androidx.compose.runtime.internal;

import androidx.compose.runtime.c1;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: Decoy.kt */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/internal/i;", "", "", "bitMask", "<init>", "(I)V", "()I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c1
@Retention(RetentionPolicy.RUNTIME)
@dd.f(allowedTargets = {dd.b.FUNCTION, dd.b.CONSTRUCTOR})
/* loaded from: classes.dex */
public @interface i {
    int bitMask();
}

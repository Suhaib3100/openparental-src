package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: Composer.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/b3;", "T", "", "Landroidx/compose/runtime/d0;", "compositionLocal", "value", "", "canOverride", "<init>", "(Landroidx/compose/runtime/d0;Ljava/lang/Object;Z)V", "a", "Landroidx/compose/runtime/d0;", "b", "()Landroidx/compose/runtime/d0;", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "Z", "()Z", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b3<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f15974d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d0<T> compositionLocal;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final T value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean canOverride;

    public b3(@fg.l d0<T> d0Var, T t4, boolean z4) {
        this.compositionLocal = d0Var;
        this.value = t4;
        this.canOverride = z4;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getCanOverride() {
        return this.canOverride;
    }

    @fg.l
    public final d0<T> b() {
        return this.compositionLocal;
    }

    public final T c() {
        return this.value;
    }
}

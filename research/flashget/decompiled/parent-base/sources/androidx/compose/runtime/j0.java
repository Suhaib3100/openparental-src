package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: Effects.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/j0;", "Landroidx/compose/runtime/p3;", "Lkotlinx/coroutines/r0;", "coroutineScope", "<init>", "(Lkotlinx/coroutines/r0;)V", "Lkotlin/k2;", "b", "()V", "d", "c", "Lkotlinx/coroutines/r0;", "a", "()Lkotlinx/coroutines/r0;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.w0
/* loaded from: classes.dex */
public final class j0 implements p3 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f16810c = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.r0 coroutineScope;

    public j0(@fg.l kotlinx.coroutines.r0 r0Var) {
        this.coroutineScope = r0Var;
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final kotlinx.coroutines.r0 getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // androidx.compose.runtime.p3
    public void b() {
    }

    @Override // androidx.compose.runtime.p3
    public void c() {
        kotlinx.coroutines.s0.d(this.coroutineScope, new y1());
    }

    @Override // androidx.compose.runtime.p3
    public void d() {
        kotlinx.coroutines.s0.d(this.coroutineScope, new y1());
    }
}

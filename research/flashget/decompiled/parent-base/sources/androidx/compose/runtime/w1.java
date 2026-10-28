package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: Effects.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u000eR5\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/w1;", "Landroidx/compose/runtime/p3;", "Lkotlin/coroutines/g;", "parentCoroutineContext", "Lkotlin/Function2;", "Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "task", "<init>", "(Lkotlin/coroutines/g;Lld/p;)V", "b", "()V", "d", "c", "Lld/p;", "Lkotlinx/coroutines/r0;", "scope", "Lkotlinx/coroutines/k2;", "Lkotlinx/coroutines/k2;", "job", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w1 implements p3 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f17270e = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> task;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.r0 scope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private kotlinx.coroutines.k2 job;

    /* JADX WARN: Multi-variable type inference failed */
    public w1(@fg.l kotlin.coroutines.g gVar, @fg.l ld.p<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar) {
        this.task = pVar;
        this.scope = kotlinx.coroutines.s0.a(gVar);
    }

    @Override // androidx.compose.runtime.p3
    public void b() {
        kotlinx.coroutines.k2 f4;
        kotlinx.coroutines.k2 k2Var = this.job;
        if (k2Var != null) {
            kotlinx.coroutines.p2.j(k2Var, "Old job was still running!", null, 2, null);
        }
        f4 = kotlinx.coroutines.k.f(this.scope, null, null, this.task, 3, null);
        this.job = f4;
    }

    @Override // androidx.compose.runtime.p3
    public void c() {
        kotlinx.coroutines.k2 k2Var = this.job;
        if (k2Var != null) {
            k2Var.b(new y1());
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.p3
    public void d() {
        kotlinx.coroutines.k2 k2Var = this.job;
        if (k2Var != null) {
            k2Var.b(new y1());
        }
        this.job = null;
    }
}

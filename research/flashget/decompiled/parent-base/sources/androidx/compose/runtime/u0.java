package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: Effects.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B \u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bR%\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/u0;", "Landroidx/compose/runtime/p3;", "Lkotlin/Function1;", "Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "Lkotlin/u;", "effect", "<init>", "(Lld/l;)V", "Lkotlin/k2;", "b", "()V", "d", "c", "Lld/l;", "Landroidx/compose/runtime/v0;", "onDispose", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class u0 implements p3 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<w0, v0> effect;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private v0 onDispose;

    /* JADX WARN: Multi-variable type inference failed */
    public u0(@fg.l ld.l<? super w0, ? extends v0> lVar) {
        this.effect = lVar;
    }

    @Override // androidx.compose.runtime.p3
    public void b() {
        w0 w0Var;
        ld.l<w0, v0> lVar = this.effect;
        w0Var = a1.f15900a;
        this.onDispose = lVar.invoke(w0Var);
    }

    @Override // androidx.compose.runtime.p3
    public void c() {
    }

    @Override // androidx.compose.runtime.p3
    public void d() {
        v0 v0Var = this.onDispose;
        if (v0Var != null) {
            v0Var.dispose();
        }
        this.onDispose = null;
    }
}

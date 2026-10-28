package androidx.compose.ui.node;

import kotlin.Metadata;

/* compiled from: UiApplier.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/node/f2;", "Landroidx/compose/runtime/a;", "Landroidx/compose/ui/node/h0;", "root", "<init>", "(Landroidx/compose/ui/node/h0;)V", "", "index", "instance", "Lkotlin/k2;", "r", "(ILandroidx/compose/ui/node/h0;)V", "q", "count", "a", "(II)V", "from", "to", "c", "(III)V", "n", "()V", "f", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f2 extends androidx.compose.runtime.a<h0> {

    /* renamed from: e, reason: collision with root package name */
    public static final int f19276e = 0;

    public f2(@fg.l h0 h0Var) {
        super(h0Var);
    }

    @Override // androidx.compose.runtime.e
    public void a(int index, int count) {
        b().r1(index, count);
    }

    @Override // androidx.compose.runtime.e
    public void c(int from, int to, int count) {
        b().i1(from, to, count);
    }

    @Override // androidx.compose.runtime.e
    public void e(int i4, Object obj) {
    }

    @Override // androidx.compose.runtime.e
    public void f() {
        p1 owner = l().getOwner();
        if (owner != null) {
            owner.h0();
        }
    }

    @Override // androidx.compose.runtime.a
    protected void n() {
        l().q1();
    }

    @Override // androidx.compose.runtime.e
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void h(int index, @fg.l h0 instance) {
        b().N0(index, instance);
    }

    public void r(int index, @fg.l h0 instance) {
    }
}

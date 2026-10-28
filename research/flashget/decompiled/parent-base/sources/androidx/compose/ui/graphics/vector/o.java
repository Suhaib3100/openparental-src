package androidx.compose.ui.graphics.vector;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: VectorCompose.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/graphics/vector/o;", "Landroidx/compose/runtime/a;", "Landroidx/compose/ui/graphics/vector/n;", "root", "<init>", "(Landroidx/compose/ui/graphics/vector/n;)V", "Landroidx/compose/ui/graphics/vector/c;", "q", "(Landroidx/compose/ui/graphics/vector/n;)Landroidx/compose/ui/graphics/vector/c;", "", "index", "instance", "Lkotlin/k2;", "s", "(ILandroidx/compose/ui/graphics/vector/n;)V", "r", "count", "a", "(II)V", "n", "()V", "from", "to", "c", "(III)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 1)
@r1({"SMAP\nVectorCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorApplier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
/* loaded from: classes.dex */
public final class o extends androidx.compose.runtime.a<n> {

    /* renamed from: e, reason: collision with root package name */
    public static final int f18283e = 0;

    public o(@fg.l n nVar) {
        super(nVar);
    }

    private final c q(n nVar) {
        if (nVar instanceof c) {
            return (c) nVar;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group");
    }

    @Override // androidx.compose.runtime.e
    public void a(int index, int count) {
        q(b()).y(index, count);
    }

    @Override // androidx.compose.runtime.e
    public void c(int from, int to, int count) {
        q(b()).x(from, to, count);
    }

    @Override // androidx.compose.runtime.e
    public void e(int i4, Object obj) {
    }

    @Override // androidx.compose.runtime.a
    protected void n() {
        c q4 = q(l());
        q4.y(0, q4.h());
    }

    @Override // androidx.compose.runtime.e
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void h(int index, @fg.l n instance) {
        q(b()).r(index, instance);
    }

    public void s(int index, @fg.l n instance) {
    }
}

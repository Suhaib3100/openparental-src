package androidx.compose.foundation;

import androidx.compose.ui.layout.g1;
import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;

/* compiled from: Focusable.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0005R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/e1;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/node/h;", "Landroidx/compose/ui/node/k1;", "<init>", "()V", "Landroidx/compose/ui/layout/g1;", "y7", "()Landroidx/compose/ui/layout/g1;", "", "focused", "Lkotlin/k2;", "z7", "(Z)V", "k7", "d2", "Landroidx/compose/ui/layout/g1$a;", "p", "Landroidx/compose/ui/layout/g1$a;", "pinnedHandle", "q", "Z", "isFocused", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class e1 extends q.d implements androidx.compose.ui.node.h, androidx.compose.ui.node.k1 {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private g1.a pinnedHandle;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean isFocused;

    /* compiled from: Focusable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h<androidx.compose.ui.layout.g1> f3650b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e1 f3651c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k1.h<androidx.compose.ui.layout.g1> hVar, e1 e1Var) {
            super(0);
            this.f3650b = hVar;
            this.f3651c = e1Var;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
        public final void a() {
            this.f3650b.f75329b = androidx.compose.ui.node.i.a(this.f3651c, androidx.compose.ui.layout.h1.a());
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    private final androidx.compose.ui.layout.g1 y7() {
        k1.h hVar = new k1.h();
        androidx.compose.ui.node.l1.a(this, new a(hVar, this));
        return (androidx.compose.ui.layout.g1) hVar.f75329b;
    }

    @Override // androidx.compose.ui.node.k1
    public void d2() {
        androidx.compose.ui.layout.g1 y7 = y7();
        if (this.isFocused) {
            g1.a aVar = this.pinnedHandle;
            if (aVar != null) {
                aVar.release();
            }
            this.pinnedHandle = y7 != null ? y7.a() : null;
        }
    }

    @Override // androidx.compose.ui.q.d
    public void k7() {
        g1.a aVar = this.pinnedHandle;
        if (aVar != null) {
            aVar.release();
        }
        this.pinnedHandle = null;
    }

    public final void z7(boolean focused) {
        if (focused) {
            androidx.compose.ui.layout.g1 y7 = y7();
            this.pinnedHandle = y7 != null ? y7.a() : null;
        } else {
            g1.a aVar = this.pinnedHandle;
            if (aVar != null) {
                aVar.release();
            }
            this.pinnedHandle = null;
        }
        this.isFocused = focused;
    }
}

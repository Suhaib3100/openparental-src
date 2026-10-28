package androidx.compose.foundation;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: FocusedBounds.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bR0\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\bR\"\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0017\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\f¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/i1;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/modifier/j;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/u;", "Lkotlin/k2;", "onPositioned", "<init>", "(Lld/l;)V", "p", "Lld/l;", "z7", "()Lld/l;", "B7", "q", "focusBoundsObserver", "Landroidx/compose/ui/modifier/i;", "r", "Landroidx/compose/ui/modifier/i;", "A1", "()Landroidx/compose/ui/modifier/i;", "providedValues", "A7", "parent", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i1 extends q.d implements androidx.compose.ui.modifier.j {

    /* renamed from: s, reason: collision with root package name */
    public static final int f4672s = 8;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super androidx.compose.ui.layout.u, kotlin.k2> onPositioned;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<androidx.compose.ui.layout.u, kotlin.k2> focusBoundsObserver;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.modifier.i providedValues;

    /* compiled from: FocusedBounds.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/u;", "focusedBounds", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/u;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.layout.u, kotlin.k2> {
        a() {
            super(1);
        }

        public final void a(@fg.m androidx.compose.ui.layout.u uVar) {
            if (i1.this.getIsAttached()) {
                i1.this.z7().invoke(uVar);
                ld.l A7 = i1.this.A7();
                if (A7 != null) {
                    A7.invoke(uVar);
                }
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.layout.u uVar) {
            a(uVar);
            return kotlin.k2.f75408a;
        }
    }

    public i1(@fg.l ld.l<? super androidx.compose.ui.layout.u, kotlin.k2> lVar) {
        this.onPositioned = lVar;
        a aVar = new a();
        this.focusBoundsObserver = aVar;
        this.providedValues = androidx.compose.ui.modifier.k.c(new kotlin.q0(g1.a(), aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ld.l<androidx.compose.ui.layout.u, kotlin.k2> A7() {
        if (getIsAttached()) {
            return (ld.l) v(g1.a());
        }
        return null;
    }

    @Override // androidx.compose.ui.modifier.j
    @fg.l
    /* renamed from: A1, reason: from getter */
    public androidx.compose.ui.modifier.i getProvidedValues() {
        return this.providedValues;
    }

    public final void B7(@fg.l ld.l<? super androidx.compose.ui.layout.u, kotlin.k2> lVar) {
        this.onPositioned = lVar;
    }

    @fg.l
    public final ld.l<androidx.compose.ui.layout.u, kotlin.k2> z7() {
        return this.onPositioned;
    }
}

package androidx.compose.foundation;

import kotlin.Metadata;

/* compiled from: FocusedBounds.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\"0\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/q;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/u;", "Lkotlin/k2;", "onPositioned", "b", "(Landroidx/compose/ui/q;Lld/l;)Landroidx/compose/ui/q;", "Landroidx/compose/ui/modifier/p;", "a", "Landroidx/compose/ui/modifier/p;", "()Landroidx/compose/ui/modifier/p;", "ModifierLocalFocusedBoundsObserver", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.ui.modifier.p<ld.l<androidx.compose.ui.layout.u, kotlin.k2>> f3723a = androidx.compose.ui.modifier.g.a(a.f3724b);

    /* compiled from: FocusedBounds.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/layout/u;", "Lkotlin/k2;", "a", "()Lld/l;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<ld.l<? super androidx.compose.ui.layout.u, ? extends kotlin.k2>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f3724b = new a(0);

        a() {
            super(0);
        }

        @fg.m
        public final ld.l<androidx.compose.ui.layout.u, kotlin.k2> a() {
            return null;
        }

        @Override // ld.a
        public ld.l<? super androidx.compose.ui.layout.u, ? extends kotlin.k2> invoke() {
            return null;
        }
    }

    @fg.l
    public static final androidx.compose.ui.modifier.p<ld.l<androidx.compose.ui.layout.u, kotlin.k2>> a() {
        return f3723a;
    }

    @fg.l
    @z0
    public static final androidx.compose.ui.q b(@fg.l androidx.compose.ui.q qVar, @fg.l ld.l<? super androidx.compose.ui.layout.u, kotlin.k2> lVar) {
        return qVar.w3(new FocusedBoundsObserverElement(lVar));
    }
}

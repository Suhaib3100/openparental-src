package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.i1;
import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: Offset.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B(\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R3\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/foundation/layout/h1;", "Landroidx/compose/ui/node/c0;", "Landroidx/compose/ui/q$d;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/q;", "Lkotlin/u;", "offset", "", "rtlAware", "<init>", "(Lld/l;Z)V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "p", "Lld/l;", "y7", "()Lld/l;", "A7", "(Lld/l;)V", "q", "Z", "z7", "()Z", "B7", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class h1 extends q.d implements androidx.compose.ui.node.c0 {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> offset;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean rtlAware;

    /* compiled from: Offset.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.o0 f5062c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f5063d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.o0 o0Var, androidx.compose.ui.layout.i1 i1Var) {
            super(1);
            this.f5062c = o0Var;
            this.f5063d = i1Var;
        }

        public final void a(@fg.l i1.a aVar) {
            long packedValue = h1.this.y7().invoke(this.f5062c).getPackedValue();
            if (h1.this.getRtlAware()) {
                i1.a.q(aVar, this.f5063d, (int) (packedValue >> 32), (int) (packedValue & 4294967295L), 0.0f, null, 12, null);
            } else {
                i1.a.u(aVar, this.f5063d, (int) (packedValue >> 32), (int) (packedValue & 4294967295L), 0.0f, null, 12, null);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    public h1(@fg.l ld.l<? super androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> lVar, boolean z4) {
        this.offset = lVar;
        this.rtlAware = z4;
    }

    public final void A7(@fg.l ld.l<? super androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> lVar) {
        this.offset = lVar;
    }

    public final void B7(boolean z4) {
        this.rtlAware = z4;
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        androidx.compose.ui.layout.i1 m02 = l0Var.m0(j4);
        return androidx.compose.ui.layout.o0.x2(o0Var, m02.getWidth(), m02.getHeight(), null, new a(o0Var, m02), 4, null);
    }

    @fg.l
    public final ld.l<androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> y7() {
        return this.offset;
    }

    /* renamed from: z7, reason: from getter */
    public final boolean getRtlAware() {
        return this.rtlAware;
    }
}

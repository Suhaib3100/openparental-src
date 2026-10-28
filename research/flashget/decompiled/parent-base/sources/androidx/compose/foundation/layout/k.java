package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.i1;
import androidx.compose.ui.q;
import androidx.compose.ui.unit.u;
import kotlin.Metadata;

/* compiled from: AspectRatio.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\u00020\n*\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0010\u001a\u00020\n*\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ \u0010\u0011\u001a\u00020\n*\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ \u0010\u0012\u001a\u00020\n*\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000fJ&\u0010\u0018\u001a\u00020\u0017*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010 \u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010\u001fJ#\u0010\"\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010\u001fJ#\u0010#\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010\u001fR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Landroidx/compose/foundation/layout/k;", "Landroidx/compose/ui/node/c0;", "Landroidx/compose/ui/q$d;", "", "aspectRatio", "", "matchHeightConstraintsFirst", "<init>", "(FZ)V", "Landroidx/compose/ui/unit/b;", "Landroidx/compose/ui/unit/u;", "y7", "(J)J", "enforceConstraints", "F7", "(JZ)J", "D7", "J7", "H7", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "Landroidx/compose/ui/layout/q;", "Landroidx/compose/ui/layout/p;", "", "height", "P", "(Landroidx/compose/ui/layout/q;Landroidx/compose/ui/layout/p;I)I", "V", "width", "G", "p", "F", "z7", "()F", "B7", "(F)V", "q", "Z", "A7", "()Z", "C7", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n1#2:237\n*E\n"})
/* loaded from: classes.dex */
final class k extends q.d implements androidx.compose.ui.node.c0 {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float aspectRatio;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean matchHeightConstraintsFirst;

    /* compiled from: AspectRatio.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f5146b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.i1 i1Var) {
            super(1);
            this.f5146b = i1Var;
        }

        public final void a(@fg.l i1.a aVar) {
            i1.a.m(aVar, this.f5146b, 0, 0, 0.0f, 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    public k(float f4, boolean z4) {
        this.aspectRatio = f4;
        this.matchHeightConstraintsFirst = z4;
    }

    private final long D7(long j4, boolean z4) {
        int L0;
        int o4 = androidx.compose.ui.unit.b.o(j4);
        if (o4 != Integer.MAX_VALUE && (L0 = kotlin.math.b.L0(o4 * this.aspectRatio)) > 0) {
            long a5 = androidx.compose.ui.unit.v.a(L0, o4);
            if (!z4 || androidx.compose.ui.unit.c.h(j4, a5)) {
                return a5;
            }
        }
        androidx.compose.ui.unit.u.INSTANCE.getClass();
        return androidx.compose.ui.unit.u.f21529c;
    }

    static /* synthetic */ long E7(k kVar, long j4, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        return kVar.D7(j4, z4);
    }

    private final long F7(long j4, boolean z4) {
        int L0;
        int p4 = androidx.compose.ui.unit.b.p(j4);
        if (p4 != Integer.MAX_VALUE && (L0 = kotlin.math.b.L0(p4 / this.aspectRatio)) > 0) {
            long a5 = androidx.compose.ui.unit.v.a(p4, L0);
            if (!z4 || androidx.compose.ui.unit.c.h(j4, a5)) {
                return a5;
            }
        }
        androidx.compose.ui.unit.u.INSTANCE.getClass();
        return androidx.compose.ui.unit.u.f21529c;
    }

    static /* synthetic */ long G7(k kVar, long j4, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        return kVar.F7(j4, z4);
    }

    private final long H7(long j4, boolean z4) {
        int q4 = androidx.compose.ui.unit.b.q(j4);
        int L0 = kotlin.math.b.L0(q4 * this.aspectRatio);
        if (L0 > 0) {
            long a5 = androidx.compose.ui.unit.v.a(L0, q4);
            if (!z4 || androidx.compose.ui.unit.c.h(j4, a5)) {
                return a5;
            }
        }
        androidx.compose.ui.unit.u.INSTANCE.getClass();
        return androidx.compose.ui.unit.u.f21529c;
    }

    static /* synthetic */ long I7(k kVar, long j4, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        return kVar.H7(j4, z4);
    }

    private final long J7(long j4, boolean z4) {
        int r4 = androidx.compose.ui.unit.b.r(j4);
        int L0 = kotlin.math.b.L0(r4 / this.aspectRatio);
        if (L0 > 0) {
            long a5 = androidx.compose.ui.unit.v.a(r4, L0);
            if (!z4 || androidx.compose.ui.unit.c.h(j4, a5)) {
                return a5;
            }
        }
        androidx.compose.ui.unit.u.INSTANCE.getClass();
        return androidx.compose.ui.unit.u.f21529c;
    }

    static /* synthetic */ long K7(k kVar, long j4, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        return kVar.J7(j4, z4);
    }

    private final long y7(long j4) {
        if (this.matchHeightConstraintsFirst) {
            long E7 = E7(this, j4, false, 1, null);
            u.Companion companion = androidx.compose.ui.unit.u.INSTANCE;
            if (!androidx.compose.foundation.e.a(companion, E7)) {
                return E7;
            }
            long G7 = G7(this, j4, false, 1, null);
            if (!androidx.compose.foundation.e.a(companion, G7)) {
                return G7;
            }
            long I7 = I7(this, j4, false, 1, null);
            if (!androidx.compose.foundation.e.a(companion, I7)) {
                return I7;
            }
            long K7 = K7(this, j4, false, 1, null);
            if (!androidx.compose.foundation.e.a(companion, K7)) {
                return K7;
            }
            long D7 = D7(j4, false);
            if (!androidx.compose.foundation.e.a(companion, D7)) {
                return D7;
            }
            long F7 = F7(j4, false);
            if (!androidx.compose.foundation.e.a(companion, F7)) {
                return F7;
            }
            long H7 = H7(j4, false);
            if (!androidx.compose.foundation.e.a(companion, H7)) {
                return H7;
            }
            long J7 = J7(j4, false);
            if (!androidx.compose.foundation.e.a(companion, J7)) {
                return J7;
            }
        } else {
            long G72 = G7(this, j4, false, 1, null);
            u.Companion companion2 = androidx.compose.ui.unit.u.INSTANCE;
            if (!androidx.compose.foundation.e.a(companion2, G72)) {
                return G72;
            }
            long E72 = E7(this, j4, false, 1, null);
            if (!androidx.compose.foundation.e.a(companion2, E72)) {
                return E72;
            }
            long K72 = K7(this, j4, false, 1, null);
            if (!androidx.compose.foundation.e.a(companion2, K72)) {
                return K72;
            }
            long I72 = I7(this, j4, false, 1, null);
            if (!androidx.compose.foundation.e.a(companion2, I72)) {
                return I72;
            }
            long F72 = F7(j4, false);
            if (!androidx.compose.foundation.e.a(companion2, F72)) {
                return F72;
            }
            long D72 = D7(j4, false);
            if (!androidx.compose.foundation.e.a(companion2, D72)) {
                return D72;
            }
            long J72 = J7(j4, false);
            if (!androidx.compose.foundation.e.a(companion2, J72)) {
                return J72;
            }
            long H72 = H7(j4, false);
            if (!androidx.compose.foundation.e.a(companion2, H72)) {
                return H72;
            }
        }
        androidx.compose.ui.unit.u.INSTANCE.getClass();
        return androidx.compose.ui.unit.u.f21529c;
    }

    /* renamed from: A7, reason: from getter */
    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    public final void B7(float f4) {
        this.aspectRatio = f4;
    }

    public final void C7(boolean z4) {
        this.matchHeightConstraintsFirst = z4;
    }

    @Override // androidx.compose.ui.node.c0
    public int G(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        return i4 != Integer.MAX_VALUE ? kotlin.math.b.L0(i4 / this.aspectRatio) : pVar.Z(i4);
    }

    @Override // androidx.compose.ui.node.c0
    public int P(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        return i4 != Integer.MAX_VALUE ? kotlin.math.b.L0(i4 * this.aspectRatio) : pVar.k0(i4);
    }

    @Override // androidx.compose.ui.node.c0
    public int V(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        return i4 != Integer.MAX_VALUE ? kotlin.math.b.L0(i4 * this.aspectRatio) : pVar.l0(i4);
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        long y7 = y7(j4);
        if (!androidx.compose.foundation.e.a(androidx.compose.ui.unit.u.INSTANCE, y7)) {
            j4 = androidx.compose.ui.unit.b.INSTANCE.c((int) (y7 >> 32), (int) (y7 & 4294967295L));
        }
        androidx.compose.ui.layout.i1 m02 = l0Var.m0(j4);
        return androidx.compose.ui.layout.o0.x2(o0Var, m02.getWidth(), m02.getHeight(), null, new a(m02), 4, null);
    }

    @Override // androidx.compose.ui.node.c0
    public int p(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        return i4 != Integer.MAX_VALUE ? kotlin.math.b.L0(i4 / this.aspectRatio) : pVar.t(i4);
    }

    /* renamed from: z7, reason: from getter */
    public final float getAspectRatio() {
        return this.aspectRatio;
    }
}

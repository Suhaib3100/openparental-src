package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.i1;
import androidx.compose.ui.q;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000e\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J#\u0010\u0018\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0015J#\u0010\u0019\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0015R(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/foundation/layout/k2;", "Landroidx/compose/ui/node/c0;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/unit/h;", "minWidth", "minHeight", "<init>", "(FFLkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "Landroidx/compose/ui/layout/q;", "Landroidx/compose/ui/layout/p;", "", "height", "P", "(Landroidx/compose/ui/layout/q;Landroidx/compose/ui/layout/p;I)I", "V", "width", "G", "p", "F", "z7", "()F", "B7", "(F)V", "q", "y7", "A7", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class k2 extends q.d implements androidx.compose.ui.node.c0 {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float minWidth;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float minHeight;

    /* compiled from: Size.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f5182b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.i1 i1Var) {
            super(1);
            this.f5182b = i1Var;
        }

        public final void a(@fg.l i1.a aVar) {
            i1.a.m(aVar, this.f5182b, 0, 0, 0.0f, 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    public /* synthetic */ k2(float f4, float f5, kotlin.jvm.internal.w wVar) {
        this(f4, f5);
    }

    public final void A7(float f4) {
        this.minHeight = f4;
    }

    public final void B7(float f4) {
        this.minWidth = f4;
    }

    @Override // androidx.compose.ui.node.c0
    public int G(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        int Z = pVar.Z(i4);
        int q22 = !b.a(androidx.compose.ui.unit.h.INSTANCE, this.minHeight) ? qVar.q2(this.minHeight) : 0;
        return Z < q22 ? q22 : Z;
    }

    @Override // androidx.compose.ui.node.c0
    public int P(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        int k02 = pVar.k0(i4);
        int q22 = !b.a(androidx.compose.ui.unit.h.INSTANCE, this.minWidth) ? qVar.q2(this.minWidth) : 0;
        return k02 < q22 ? q22 : k02;
    }

    @Override // androidx.compose.ui.node.c0
    public int V(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        int l02 = pVar.l0(i4);
        int q22 = !b.a(androidx.compose.ui.unit.h.INSTANCE, this.minWidth) ? qVar.q2(this.minWidth) : 0;
        return l02 < q22 ? q22 : l02;
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        int r4;
        float f4 = this.minWidth;
        h.Companion companion = androidx.compose.ui.unit.h.INSTANCE;
        int i4 = 0;
        if (b.a(companion, f4) || androidx.compose.ui.unit.b.r(j4) != 0) {
            r4 = androidx.compose.ui.unit.b.r(j4);
        } else {
            r4 = o0Var.q2(this.minWidth);
            int p4 = androidx.compose.ui.unit.b.p(j4);
            if (r4 > p4) {
                r4 = p4;
            }
            if (r4 < 0) {
                r4 = 0;
            }
        }
        int p5 = androidx.compose.ui.unit.b.p(j4);
        if (b.a(companion, this.minHeight) || androidx.compose.ui.unit.b.q(j4) != 0) {
            i4 = androidx.compose.ui.unit.b.q(j4);
        } else {
            int q22 = o0Var.q2(this.minHeight);
            int o4 = androidx.compose.ui.unit.b.o(j4);
            if (q22 > o4) {
                q22 = o4;
            }
            if (q22 >= 0) {
                i4 = q22;
            }
        }
        androidx.compose.ui.layout.i1 m02 = l0Var.m0(androidx.compose.ui.unit.c.a(r4, p5, i4, androidx.compose.ui.unit.b.o(j4)));
        return androidx.compose.ui.layout.o0.x2(o0Var, m02.getWidth(), m02.getHeight(), null, new a(m02), 4, null);
    }

    @Override // androidx.compose.ui.node.c0
    public int p(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        int t4 = pVar.t(i4);
        int q22 = !b.a(androidx.compose.ui.unit.h.INSTANCE, this.minHeight) ? qVar.q2(this.minHeight) : 0;
        return t4 < q22 ? q22 : t4;
    }

    /* renamed from: y7, reason: from getter */
    public final float getMinHeight() {
        return this.minHeight;
    }

    /* renamed from: z7, reason: from getter */
    public final float getMinWidth() {
        return this.minWidth;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k2(float r1, float r2, int r3, kotlin.jvm.internal.w r4) {
        /*
            r0 = this;
            r4 = r3 & 1
            if (r4 == 0) goto Ld
            androidx.compose.ui.unit.h$a r1 = androidx.compose.ui.unit.h.INSTANCE
            r1.getClass()
            float r1 = androidx.compose.ui.unit.h.c()
        Ld:
            r3 = r3 & 2
            if (r3 == 0) goto L1a
            androidx.compose.ui.unit.h$a r2 = androidx.compose.ui.unit.h.INSTANCE
            r2.getClass()
            float r2 = androidx.compose.ui.unit.h.c()
        L1a:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.k2.<init>(float, float, int, kotlin.jvm.internal.w):void");
    }

    private k2(float f4, float f5) {
        this.minWidth = f4;
        this.minHeight = f5;
    }
}

package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.i1;
import androidx.compose.ui.q;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J#\u0010\u001c\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J#\u0010\u001d\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u0019R(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R(\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R(\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00105\u001a\u00020\u000f*\u0002028BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b3\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Landroidx/compose/foundation/layout/e2;", "Landroidx/compose/ui/node/c0;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/unit/h;", "minWidth", "minHeight", "maxWidth", "maxHeight", "", "enforceIncoming", "<init>", "(FFFFZLkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "Landroidx/compose/ui/layout/q;", "Landroidx/compose/ui/layout/p;", "", "height", "P", "(Landroidx/compose/ui/layout/q;Landroidx/compose/ui/layout/p;I)I", "width", "G", "V", "p", "F", "C7", "()F", "I7", "(F)V", "q", "B7", "H7", "r", "A7", "G7", "s", "z7", "F7", "t", "Z", "y7", "()Z", "E7", "(Z)V", "Landroidx/compose/ui/unit/d;", "D7", "(Landroidx/compose/ui/unit/d;)J", "targetConstraints", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class e2 extends q.d implements androidx.compose.ui.node.c0 {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float minWidth;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float minHeight;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float maxWidth;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private float maxHeight;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean enforceIncoming;

    /* compiled from: Size.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f5005b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.i1 i1Var) {
            super(1);
            this.f5005b = i1Var;
        }

        public final void a(@fg.l i1.a aVar) {
            i1.a.m(aVar, this.f5005b, 0, 0, 0.0f, 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    public /* synthetic */ e2(float f4, float f5, float f6, float f7, boolean z4, kotlin.jvm.internal.w wVar) {
        this(f4, f5, f6, f7, z4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r5 != Integer.MAX_VALUE) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long D7(androidx.compose.ui.unit.d r8) {
        /*
            r7 = this;
            float r0 = r7.maxWidth
            androidx.compose.ui.unit.h$a r1 = androidx.compose.ui.unit.h.INSTANCE
            boolean r0 = androidx.compose.foundation.layout.b.a(r1, r0)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            if (r0 != 0) goto L18
            float r0 = r7.maxWidth
            int r0 = r8.q2(r0)
            if (r0 >= 0) goto L19
            r0 = r3
            goto L19
        L18:
            r0 = r2
        L19:
            float r4 = r7.maxHeight
            boolean r4 = androidx.compose.foundation.layout.b.a(r1, r4)
            if (r4 != 0) goto L2b
            float r4 = r7.maxHeight
            int r4 = r8.q2(r4)
            if (r4 >= 0) goto L2c
            r4 = r3
            goto L2c
        L2b:
            r4 = r2
        L2c:
            float r5 = r7.minWidth
            boolean r5 = androidx.compose.foundation.layout.b.a(r1, r5)
            if (r5 != 0) goto L43
            float r5 = r7.minWidth
            int r5 = r8.q2(r5)
            if (r5 <= r0) goto L3d
            r5 = r0
        L3d:
            if (r5 >= 0) goto L40
            r5 = r3
        L40:
            if (r5 == r2) goto L43
            goto L44
        L43:
            r5 = r3
        L44:
            float r6 = r7.minHeight
            boolean r1 = androidx.compose.foundation.layout.b.a(r1, r6)
            if (r1 != 0) goto L5b
            float r1 = r7.minHeight
            int r8 = r8.q2(r1)
            if (r8 <= r4) goto L55
            r8 = r4
        L55:
            if (r8 >= 0) goto L58
            r8 = r3
        L58:
            if (r8 == r2) goto L5b
            r3 = r8
        L5b:
            long r0 = androidx.compose.ui.unit.c.a(r5, r0, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.e2.D7(androidx.compose.ui.unit.d):long");
    }

    /* renamed from: A7, reason: from getter */
    public final float getMaxWidth() {
        return this.maxWidth;
    }

    /* renamed from: B7, reason: from getter */
    public final float getMinHeight() {
        return this.minHeight;
    }

    /* renamed from: C7, reason: from getter */
    public final float getMinWidth() {
        return this.minWidth;
    }

    public final void E7(boolean z4) {
        this.enforceIncoming = z4;
    }

    public final void F7(float f4) {
        this.maxHeight = f4;
    }

    @Override // androidx.compose.ui.node.c0
    public int G(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        long D7 = D7(qVar);
        return androidx.compose.ui.unit.b.l(D7) ? androidx.compose.ui.unit.b.o(D7) : androidx.compose.ui.unit.c.f(D7, pVar.Z(i4));
    }

    public final void G7(float f4) {
        this.maxWidth = f4;
    }

    public final void H7(float f4) {
        this.minHeight = f4;
    }

    public final void I7(float f4) {
        this.minWidth = f4;
    }

    @Override // androidx.compose.ui.node.c0
    public int P(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        long D7 = D7(qVar);
        return androidx.compose.ui.unit.b.n(D7) ? androidx.compose.ui.unit.b.p(D7) : androidx.compose.ui.unit.c.g(D7, pVar.k0(i4));
    }

    @Override // androidx.compose.ui.node.c0
    public int V(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        long D7 = D7(qVar);
        return androidx.compose.ui.unit.b.n(D7) ? androidx.compose.ui.unit.b.p(D7) : androidx.compose.ui.unit.c.g(D7, pVar.l0(i4));
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        int r4;
        int p4;
        int q4;
        int o4;
        long a5;
        long D7 = D7(o0Var);
        if (this.enforceIncoming) {
            a5 = androidx.compose.ui.unit.c.e(j4, D7);
        } else {
            float f4 = this.minWidth;
            h.Companion companion = androidx.compose.ui.unit.h.INSTANCE;
            if (b.a(companion, f4)) {
                r4 = androidx.compose.ui.unit.b.r(j4);
                int p5 = androidx.compose.ui.unit.b.p(D7);
                if (r4 > p5) {
                    r4 = p5;
                }
            } else {
                r4 = androidx.compose.ui.unit.b.r(D7);
            }
            if (b.a(companion, this.maxWidth)) {
                p4 = androidx.compose.ui.unit.b.p(j4);
                int r5 = androidx.compose.ui.unit.b.r(D7);
                if (p4 < r5) {
                    p4 = r5;
                }
            } else {
                p4 = androidx.compose.ui.unit.b.p(D7);
            }
            if (b.a(companion, this.minHeight)) {
                q4 = androidx.compose.ui.unit.b.q(j4);
                int o5 = androidx.compose.ui.unit.b.o(D7);
                if (q4 > o5) {
                    q4 = o5;
                }
            } else {
                q4 = androidx.compose.ui.unit.b.q(D7);
            }
            if (b.a(companion, this.maxHeight)) {
                o4 = androidx.compose.ui.unit.b.o(j4);
                int q5 = androidx.compose.ui.unit.b.q(D7);
                if (o4 < q5) {
                    o4 = q5;
                }
            } else {
                o4 = androidx.compose.ui.unit.b.o(D7);
            }
            a5 = androidx.compose.ui.unit.c.a(r4, p4, q4, o4);
        }
        androidx.compose.ui.layout.i1 m02 = l0Var.m0(a5);
        return androidx.compose.ui.layout.o0.x2(o0Var, m02.getWidth(), m02.getHeight(), null, new a(m02), 4, null);
    }

    @Override // androidx.compose.ui.node.c0
    public int p(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        long D7 = D7(qVar);
        return androidx.compose.ui.unit.b.l(D7) ? androidx.compose.ui.unit.b.o(D7) : androidx.compose.ui.unit.c.f(D7, pVar.t(i4));
    }

    /* renamed from: y7, reason: from getter */
    public final boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    /* renamed from: z7, reason: from getter */
    public final float getMaxHeight() {
        return this.maxHeight;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e2(float r7, float r8, float r9, float r10, boolean r11, int r12, kotlin.jvm.internal.w r13) {
        /*
            r6 = this;
            r13 = r12 & 1
            if (r13 == 0) goto Ld
            androidx.compose.ui.unit.h$a r7 = androidx.compose.ui.unit.h.INSTANCE
            r7.getClass()
            float r7 = androidx.compose.ui.unit.h.c()
        Ld:
            r1 = r7
            r7 = r12 & 2
            if (r7 == 0) goto L1b
            androidx.compose.ui.unit.h$a r7 = androidx.compose.ui.unit.h.INSTANCE
            r7.getClass()
            float r8 = androidx.compose.ui.unit.h.c()
        L1b:
            r2 = r8
            r7 = r12 & 4
            if (r7 == 0) goto L29
            androidx.compose.ui.unit.h$a r7 = androidx.compose.ui.unit.h.INSTANCE
            r7.getClass()
            float r9 = androidx.compose.ui.unit.h.c()
        L29:
            r3 = r9
            r7 = r12 & 8
            if (r7 == 0) goto L37
            androidx.compose.ui.unit.h$a r7 = androidx.compose.ui.unit.h.INSTANCE
            r7.getClass()
            float r10 = androidx.compose.ui.unit.h.c()
        L37:
            r4 = r10
            r0 = r6
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.e2.<init>(float, float, float, float, boolean, int, kotlin.jvm.internal.w):void");
    }

    private e2(float f4, float f5, float f6, float f7, boolean z4) {
        this.minWidth = f4;
        this.minHeight = f5;
        this.maxWidth = f6;
        this.maxHeight = f7;
        this.enforceIncoming = z4;
    }
}

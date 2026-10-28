package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.i1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;

/* compiled from: Box.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u0013\u001a\u00020\u0012*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/foundation/layout/n;", "Landroidx/compose/ui/layout/m0;", "Landroidx/compose/ui/c;", "alignment", "", "propagateMinConstraints", "<init>", "(Landroidx/compose/ui/c;Z)V", "k", "()Landroidx/compose/ui/c;", "l", "()Z", "Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;", "m", "(Landroidx/compose/ui/c;Z)Landroidx/compose/foundation/layout/n;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/c;", "b", "Z", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,310:1\n69#2,6:311\n69#2,6:317\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxMeasurePolicy\n*L\n142#1:311,6\n162#1:317,6\n*E\n"})
/* loaded from: classes.dex */
final /* data */ class n implements androidx.compose.ui.layout.m0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.c alignment;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean propagateMinConstraints;

    /* compiled from: Box.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f5209b = new a(1);

        a() {
            super(1);
        }

        public final void a(@fg.l i1.a aVar) {
        }

        @Override // ld.l
        public kotlin.k2 invoke(i1.a aVar) {
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Box.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f5210b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.l0 f5211c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.o0 f5212d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f5213e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f5214f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ n f5215g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.layout.i1 i1Var, androidx.compose.ui.layout.l0 l0Var, androidx.compose.ui.layout.o0 o0Var, int i4, int i5, n nVar) {
            super(1);
            this.f5210b = i1Var;
            this.f5211c = l0Var;
            this.f5212d = o0Var;
            this.f5213e = i4;
            this.f5214f = i5;
            this.f5215g = nVar;
        }

        public final void a(@fg.l i1.a aVar) {
            m.h(aVar, this.f5210b, this.f5211c, this.f5212d.getLayoutDirection(), this.f5213e, this.f5214f, this.f5215g.alignment);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Box.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxMeasurePolicy$measure$5\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,310:1\n13644#2,3:311\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxMeasurePolicy$measure$5\n*L\n171#1:311,3\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1[] f5216b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<androidx.compose.ui.layout.l0> f5217c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.o0 f5218d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k1.f f5219e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k1.f f5220f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ n f5221g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.ui.layout.i1[] i1VarArr, List<? extends androidx.compose.ui.layout.l0> list, androidx.compose.ui.layout.o0 o0Var, k1.f fVar, k1.f fVar2, n nVar) {
            super(1);
            this.f5216b = i1VarArr;
            this.f5217c = list;
            this.f5218d = o0Var;
            this.f5219e = fVar;
            this.f5220f = fVar2;
            this.f5221g = nVar;
        }

        public final void a(@fg.l i1.a aVar) {
            androidx.compose.ui.layout.i1[] i1VarArr = this.f5216b;
            List<androidx.compose.ui.layout.l0> list = this.f5217c;
            androidx.compose.ui.layout.o0 o0Var = this.f5218d;
            k1.f fVar = this.f5219e;
            k1.f fVar2 = this.f5220f;
            n nVar = this.f5221g;
            int length = i1VarArr.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                androidx.compose.ui.layout.i1 i1Var = i1VarArr[i4];
                kotlin.jvm.internal.l0.n(i1Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                m.h(aVar, i1Var, list.get(i5), o0Var.getLayoutDirection(), fVar.f75327b, fVar2.f75327b, nVar.alignment);
                i4++;
                i5++;
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    public n(@fg.l androidx.compose.ui.c cVar, boolean z4) {
        this.alignment = cVar;
        this.propagateMinConstraints = z4;
    }

    /* renamed from: k, reason: from getter */
    private final androidx.compose.ui.c getAlignment() {
        return this.alignment;
    }

    /* renamed from: l, reason: from getter */
    private final boolean getPropagateMinConstraints() {
        return this.propagateMinConstraints;
    }

    public static n n(n nVar, androidx.compose.ui.c cVar, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            cVar = nVar.alignment;
        }
        if ((i4 & 2) != 0) {
            z4 = nVar.propagateMinConstraints;
        }
        nVar.getClass();
        return new n(cVar, z4);
    }

    @Override // androidx.compose.ui.layout.m0
    @fg.l
    public androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
        boolean g4;
        boolean g5;
        boolean g6;
        int r4;
        int q4;
        androidx.compose.ui.layout.i1 m02;
        if (list.isEmpty()) {
            return androidx.compose.ui.layout.o0.x2(o0Var, androidx.compose.ui.unit.b.r(j4), androidx.compose.ui.unit.b.q(j4), null, a.f5209b, 4, null);
        }
        long e4 = this.propagateMinConstraints ? j4 : androidx.compose.ui.unit.b.e(j4, 0, 0, 0, 0, 10, null);
        if (list.size() == 1) {
            androidx.compose.ui.layout.l0 l0Var = list.get(0);
            g6 = m.g(l0Var);
            if (g6) {
                r4 = androidx.compose.ui.unit.b.r(j4);
                q4 = androidx.compose.ui.unit.b.q(j4);
                m02 = l0Var.m0(androidx.compose.ui.unit.b.INSTANCE.c(androidx.compose.ui.unit.b.r(j4), androidx.compose.ui.unit.b.q(j4)));
            } else {
                m02 = l0Var.m0(e4);
                r4 = Math.max(androidx.compose.ui.unit.b.r(j4), m02.getWidth());
                q4 = Math.max(androidx.compose.ui.unit.b.q(j4), m02.getHeight());
            }
            int i4 = r4;
            int i5 = q4;
            return androidx.compose.ui.layout.o0.x2(o0Var, i4, i5, null, new b(m02, l0Var, o0Var, i4, i5, this), 4, null);
        }
        androidx.compose.ui.layout.i1[] i1VarArr = new androidx.compose.ui.layout.i1[list.size()];
        k1.f fVar = new k1.f();
        fVar.f75327b = androidx.compose.ui.unit.b.r(j4);
        k1.f fVar2 = new k1.f();
        fVar2.f75327b = androidx.compose.ui.unit.b.q(j4);
        int size = list.size();
        boolean z4 = false;
        for (int i6 = 0; i6 < size; i6++) {
            androidx.compose.ui.layout.l0 l0Var2 = list.get(i6);
            g5 = m.g(l0Var2);
            if (g5) {
                z4 = true;
            } else {
                androidx.compose.ui.layout.i1 m03 = l0Var2.m0(e4);
                i1VarArr[i6] = m03;
                fVar.f75327b = Math.max(fVar.f75327b, m03.getWidth());
                fVar2.f75327b = Math.max(fVar2.f75327b, m03.getHeight());
            }
        }
        if (z4) {
            int i7 = fVar.f75327b;
            int i10 = i7 != Integer.MAX_VALUE ? i7 : 0;
            int i11 = fVar2.f75327b;
            long a5 = androidx.compose.ui.unit.c.a(i10, i7, i11 != Integer.MAX_VALUE ? i11 : 0, i11);
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                androidx.compose.ui.layout.l0 l0Var3 = list.get(i12);
                g4 = m.g(l0Var3);
                if (g4) {
                    i1VarArr[i12] = l0Var3.m0(a5);
                }
            }
        }
        return androidx.compose.ui.layout.o0.x2(o0Var, fVar.f75327b, fVar2.f75327b, null, new c(i1VarArr, list, o0Var, fVar, fVar2, this), 4, null);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof n)) {
            return false;
        }
        n nVar = (n) other;
        return kotlin.jvm.internal.l0.g(this.alignment, nVar.alignment) && this.propagateMinConstraints == nVar.propagateMinConstraints;
    }

    public int hashCode() {
        return Boolean.hashCode(this.propagateMinConstraints) + (this.alignment.hashCode() * 31);
    }

    @fg.l
    public final n m(@fg.l androidx.compose.ui.c alignment, boolean propagateMinConstraints) {
        return new n(alignment, propagateMinConstraints);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb.append(this.alignment);
        sb.append(", propagateMinConstraints=");
        return androidx.compose.animation.l.a(sb, this.propagateMinConstraints, ')');
    }
}

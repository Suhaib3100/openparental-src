package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.i;
import androidx.compose.ui.layout.i1;
import java.util.List;
import kotlin.Metadata;

/* compiled from: RowColumnImpl.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÂ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\bHÂ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÂ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\fHÂ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010#\u001a\u00020\"*\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010!\u001a\u00020 H\u0016ø\u0001\u0001¢\u0006\u0004\b#\u0010$J)\u0010)\u001a\u00020'*\u00020%2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020&0\u001d2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J)\u0010,\u001a\u00020'*\u00020%2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020&0\u001d2\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b,\u0010*J)\u0010-\u001a\u00020'*\u00020%2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020&0\u001d2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b-\u0010*J)\u0010.\u001a\u00020'*\u00020%2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020&0\u001d2\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b.\u0010*JS\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001ø\u0001\u0001¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020'HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00109\u001a\u0002082\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010;R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010<R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010=R\u001a\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b)\u0010>R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010?R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006B"}, d2 = {"Landroidx/compose/foundation/layout/t1;", "Landroidx/compose/ui/layout/m0;", "Landroidx/compose/foundation/layout/a1;", "orientation", "Landroidx/compose/foundation/layout/i$e;", "horizontalArrangement", "Landroidx/compose/foundation/layout/i$m;", "verticalArrangement", "Landroidx/compose/ui/unit/h;", "arrangementSpacing", "Landroidx/compose/foundation/layout/d2;", "crossAxisSize", "Landroidx/compose/foundation/layout/x;", "crossAxisAlignment", "<init>", "(Landroidx/compose/foundation/layout/a1;Landroidx/compose/foundation/layout/i$e;Landroidx/compose/foundation/layout/i$m;FLandroidx/compose/foundation/layout/d2;Landroidx/compose/foundation/layout/x;Lkotlin/jvm/internal/w;)V", "j", "()Landroidx/compose/foundation/layout/a1;", "k", "()Landroidx/compose/foundation/layout/i$e;", "l", "()Landroidx/compose/foundation/layout/i$m;", "m", "()F", "n", "()Landroidx/compose/foundation/layout/d2;", "o", "()Landroidx/compose/foundation/layout/x;", "Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;", "Landroidx/compose/ui/layout/q;", "Landroidx/compose/ui/layout/p;", "", "height", "d", "(Landroidx/compose/ui/layout/q;Ljava/util/List;I)I", "width", "c", "b", "e", "p", "(Landroidx/compose/foundation/layout/a1;Landroidx/compose/foundation/layout/i$e;Landroidx/compose/foundation/layout/i$m;FLandroidx/compose/foundation/layout/d2;Landroidx/compose/foundation/layout/x;)Landroidx/compose/foundation/layout/t1;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/foundation/layout/a1;", "Landroidx/compose/foundation/layout/i$e;", "Landroidx/compose/foundation/layout/i$m;", "F", "Landroidx/compose/foundation/layout/d2;", "f", "Landroidx/compose/foundation/layout/x;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class t1 implements androidx.compose.ui.layout.m0 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f5325g = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a1 orientation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final i.e horizontalArrangement;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final i.m verticalArrangement;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float arrangementSpacing;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d2 crossAxisSize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x crossAxisAlignment;

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u1 f5332b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ s1 f5333c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.o0 f5334d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u1 u1Var, s1 s1Var, androidx.compose.ui.layout.o0 o0Var) {
            super(1);
            this.f5332b = u1Var;
            this.f5333c = s1Var;
            this.f5334d = o0Var;
        }

        public final void a(@fg.l i1.a aVar) {
            this.f5332b.n(aVar, this.f5333c, 0, this.f5334d.getLayoutDirection());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    public /* synthetic */ t1(a1 a1Var, i.e eVar, i.m mVar, float f4, d2 d2Var, x xVar, kotlin.jvm.internal.w wVar) {
        this(a1Var, eVar, mVar, f4, d2Var, xVar);
    }

    /* renamed from: j, reason: from getter */
    private final a1 getOrientation() {
        return this.orientation;
    }

    /* renamed from: k, reason: from getter */
    private final i.e getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    /* renamed from: l, reason: from getter */
    private final i.m getVerticalArrangement() {
        return this.verticalArrangement;
    }

    /* renamed from: m, reason: from getter */
    private final float getArrangementSpacing() {
        return this.arrangementSpacing;
    }

    /* renamed from: n, reason: from getter */
    private final d2 getCrossAxisSize() {
        return this.crossAxisSize;
    }

    /* renamed from: o, reason: from getter */
    private final x getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public static t1 q(t1 t1Var, a1 a1Var, i.e eVar, i.m mVar, float f4, d2 d2Var, x xVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            a1Var = t1Var.orientation;
        }
        if ((i4 & 2) != 0) {
            eVar = t1Var.horizontalArrangement;
        }
        i.e eVar2 = eVar;
        if ((i4 & 4) != 0) {
            mVar = t1Var.verticalArrangement;
        }
        i.m mVar2 = mVar;
        if ((i4 & 8) != 0) {
            f4 = t1Var.arrangementSpacing;
        }
        float f5 = f4;
        if ((i4 & 16) != 0) {
            d2Var = t1Var.crossAxisSize;
        }
        d2 d2Var2 = d2Var;
        if ((i4 & 32) != 0) {
            xVar = t1Var.crossAxisAlignment;
        }
        t1Var.getClass();
        return new t1(a1Var, eVar2, mVar2, f5, d2Var2, xVar);
    }

    @Override // androidx.compose.ui.layout.m0
    @fg.l
    public androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
        int crossAxisSize;
        int mainAxisSize;
        u1 u1Var = new u1(this.orientation, this.horizontalArrangement, this.verticalArrangement, this.arrangementSpacing, this.crossAxisSize, this.crossAxisAlignment, list, new androidx.compose.ui.layout.i1[list.size()], null);
        s1 m4 = u1Var.m(o0Var, j4, 0, list.size());
        if (this.orientation == a1.Horizontal) {
            crossAxisSize = m4.getMainAxisSize();
            mainAxisSize = m4.getCrossAxisSize();
        } else {
            crossAxisSize = m4.getCrossAxisSize();
            mainAxisSize = m4.getMainAxisSize();
        }
        return androidx.compose.ui.layout.o0.x2(o0Var, crossAxisSize, mainAxisSize, null, new a(u1Var, m4, o0Var), 4, null);
    }

    @Override // androidx.compose.ui.layout.m0
    public int b(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
        ld.q b5;
        b5 = r1.b(this.orientation);
        return ((Number) b5.R(list, Integer.valueOf(i4), Integer.valueOf(qVar.q2(this.arrangementSpacing)))).intValue();
    }

    @Override // androidx.compose.ui.layout.m0
    public int c(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
        ld.q c5;
        c5 = r1.c(this.orientation);
        return ((Number) c5.R(list, Integer.valueOf(i4), Integer.valueOf(qVar.q2(this.arrangementSpacing)))).intValue();
    }

    @Override // androidx.compose.ui.layout.m0
    public int d(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
        ld.q d5;
        d5 = r1.d(this.orientation);
        return ((Number) d5.R(list, Integer.valueOf(i4), Integer.valueOf(qVar.q2(this.arrangementSpacing)))).intValue();
    }

    @Override // androidx.compose.ui.layout.m0
    public int e(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
        ld.q a5;
        a5 = r1.a(this.orientation);
        return ((Number) a5.R(list, Integer.valueOf(i4), Integer.valueOf(qVar.q2(this.arrangementSpacing)))).intValue();
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) other;
        return this.orientation == t1Var.orientation && kotlin.jvm.internal.l0.g(this.horizontalArrangement, t1Var.horizontalArrangement) && kotlin.jvm.internal.l0.g(this.verticalArrangement, t1Var.verticalArrangement) && androidx.compose.ui.unit.h.l(this.arrangementSpacing, t1Var.arrangementSpacing) && this.crossAxisSize == t1Var.crossAxisSize && kotlin.jvm.internal.l0.g(this.crossAxisAlignment, t1Var.crossAxisAlignment);
    }

    public int hashCode() {
        int hashCode = this.orientation.hashCode() * 31;
        i.e eVar = this.horizontalArrangement;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        i.m mVar = this.verticalArrangement;
        return this.crossAxisAlignment.hashCode() + ((this.crossAxisSize.hashCode() + ((androidx.compose.ui.unit.h.n(this.arrangementSpacing) + ((hashCode2 + (mVar != null ? mVar.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    @fg.l
    public final t1 p(@fg.l a1 orientation, @fg.m i.e horizontalArrangement, @fg.m i.m verticalArrangement, float arrangementSpacing, @fg.l d2 crossAxisSize, @fg.l x crossAxisAlignment) {
        return new t1(orientation, horizontalArrangement, verticalArrangement, arrangementSpacing, crossAxisSize, crossAxisAlignment);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("RowColumnMeasurePolicy(orientation=");
        sb.append(this.orientation);
        sb.append(", horizontalArrangement=");
        sb.append(this.horizontalArrangement);
        sb.append(", verticalArrangement=");
        sb.append(this.verticalArrangement);
        sb.append(", arrangementSpacing=");
        androidx.compose.foundation.b0.a(this.arrangementSpacing, sb, ", crossAxisSize=");
        sb.append(this.crossAxisSize);
        sb.append(", crossAxisAlignment=");
        sb.append(this.crossAxisAlignment);
        sb.append(')');
        return sb.toString();
    }

    private t1(a1 a1Var, i.e eVar, i.m mVar, float f4, d2 d2Var, x xVar) {
        this.orientation = a1Var;
        this.horizontalArrangement = eVar;
        this.verticalArrangement = mVar;
        this.arrangementSpacing = f4;
        this.crossAxisSize = d2Var;
        this.crossAxisAlignment = xVar;
    }
}

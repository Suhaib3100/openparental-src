package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.q4;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Placeable.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b'\u0018\u00002\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J=\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0019\u0010\r\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n¢\u0006\u0002\b\fH$ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R0\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8\u0004@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R0\u0010'\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020#8\u0004@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001f\"\u0004\b&\u0010!R*\u0010*\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00068\u0004@BX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001fR\u0014\u0010,\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0015R\u0014\u0010.\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, d2 = {"Landroidx/compose/ui/layout/i1;", "Landroidx/compose/ui/layout/p0;", "<init>", "()V", "Lkotlin/k2;", "G0", "Landroidx/compose/ui/unit/q;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/q4;", "Lkotlin/u;", "layerBlock", "H0", "(JFLld/l;)V", "", "<set-?>", "b", "I", "E0", "()I", "width", "c", "x0", "height", "Landroidx/compose/ui/unit/u;", "value", "d", "J", "C0", "()J", "I0", "(J)V", "measuredSize", "Landroidx/compose/ui/unit/b;", "e", "D0", "J0", "measurementConstraints", "f", "w0", "apparentToRealOffset", "W", "measuredWidth", "v", "measuredHeight", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class i1 implements p0 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f19010g = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int width;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int height;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long measuredSize = androidx.compose.ui.unit.v.a(0, 0);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long measurementConstraints;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long apparentToRealOffset;

    /* compiled from: Placeable.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000f\u001a\u00020\t*\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0011\u001a\u00020\t*\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0010J&\u0010\u0012\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000bJA\u0010\u0017\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0019\b\u0002\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0002\b\u0015ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JF\u0010\u0019\u001a\u00020\t*\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\b\u001a\u00020\u00072\u0019\b\u0002\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0002\b\u0015¢\u0006\u0004\b\u0019\u0010\u001aJF\u0010\u001b\u001a\u00020\t*\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\b\u001a\u00020\u00072\u0019\b\u0002\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0002\b\u0015¢\u0006\u0004\b\u001b\u0010\u001aJA\u0010\u001c\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0019\b\u0002\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0002\b\u0015ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0018JD\u0010\u001d\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u001b\b\b\u0010\u0016\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t\u0018\u00010\u0013¢\u0006\u0002\b\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0018JD\u0010\u001e\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u001b\b\b\u0010\u0016\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t\u0018\u00010\u0013¢\u0006\u0002\b\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0018R\u0014\u0010!\u001a\u00020\f8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8$X¤\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0016\u0010)\u001a\u0004\u0018\u00010&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "", "<init>", "()V", "Landroidx/compose/ui/layout/i1;", "Landroidx/compose/ui/unit/q;", "position", "", "zIndex", "Lkotlin/k2;", "n", "(Landroidx/compose/ui/layout/i1;JF)V", "", "x", "y", "l", "(Landroidx/compose/ui/layout/i1;IIF)V", "f", "h", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/q4;", "Lkotlin/u;", "layerBlock", "r", "(Landroidx/compose/ui/layout/i1;JFLld/l;)V", "p", "(Landroidx/compose/ui/layout/i1;IIFLld/l;)V", "t", "v", "k", "j", "e", "()I", "parentWidth", "Landroidx/compose/ui/unit/w;", "d", "()Landroidx/compose/ui/unit/w;", "parentLayoutDirection", "Landroidx/compose/ui/layout/u;", "c", "()Landroidx/compose/ui/layout/u;", "coordinates", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @kotlin.jvm.internal.r1({"SMAP\nPlaceable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,404:1\n331#1,2:405\n348#1:407\n349#1:409\n334#1,2:410\n348#1,2:412\n340#1:414\n331#1,2:415\n348#1:417\n349#1:419\n334#1,2:420\n348#1,2:422\n340#1:424\n348#1:425\n349#1:427\n348#1:428\n349#1:430\n331#1,2:431\n348#1:433\n349#1:435\n334#1,2:436\n348#1,2:438\n340#1:440\n331#1,2:441\n348#1:443\n349#1:445\n334#1,2:446\n348#1,2:448\n340#1:450\n348#1:451\n349#1:453\n348#1:454\n349#1:456\n348#1:457\n349#1:459\n348#1:460\n349#1:462\n86#2:408\n86#2:418\n86#2:426\n86#2:429\n86#2:434\n86#2:444\n86#2:452\n86#2:455\n86#2:458\n86#2:461\n86#2:463\n*S KotlinDebug\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n*L\n186#1:405,2\n186#1:407\n186#1:409\n186#1:410,2\n186#1:412,2\n186#1:414\n204#1:415,2\n204#1:417\n204#1:419\n204#1:420,2\n204#1:422,2\n204#1:424\n218#1:425\n218#1:427\n231#1:428\n231#1:430\n255#1:431,2\n255#1:433\n255#1:435\n255#1:436,2\n255#1:438,2\n255#1:440\n281#1:441,2\n281#1:443\n281#1:445\n281#1:446,2\n281#1:448,2\n281#1:450\n303#1:451\n303#1:453\n323#1:454\n323#1:456\n332#1:457\n332#1:459\n334#1:460\n334#1:462\n186#1:408\n204#1:418\n218#1:426\n231#1:429\n255#1:434\n281#1:444\n303#1:452\n323#1:455\n332#1:458\n334#1:461\n348#1:463\n*E\n"})
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f19016a = 0;

        public static /* synthetic */ void g(a aVar, i1 i1Var, int i4, int i5, float f4, int i6, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i6 & 4) != 0) {
                f4 = 0.0f;
            }
            aVar.f(i1Var, i4, i5, f4);
        }

        public static /* synthetic */ void i(a aVar, i1 i1Var, long j4, float f4, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i4 & 2) != 0) {
                f4 = 0.0f;
            }
            aVar.h(i1Var, j4, f4);
        }

        public static /* synthetic */ void m(a aVar, i1 i1Var, int i4, int i5, float f4, int i6, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i6 & 4) != 0) {
                f4 = 0.0f;
            }
            aVar.l(i1Var, i4, i5, f4);
        }

        public static /* synthetic */ void o(a aVar, i1 i1Var, long j4, float f4, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i4 & 2) != 0) {
                f4 = 0.0f;
            }
            aVar.n(i1Var, j4, f4);
        }

        public static /* synthetic */ void q(a aVar, i1 i1Var, int i4, int i5, float f4, ld.l lVar, int i6, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i6 & 4) != 0) {
                f4 = 0.0f;
            }
            float f5 = f4;
            if ((i6 & 8) != 0) {
                lVar = j1.f19021a;
            }
            aVar.p(i1Var, i4, i5, f5, lVar);
        }

        public static /* synthetic */ void s(a aVar, i1 i1Var, long j4, float f4, ld.l lVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i4 & 2) != 0) {
                f4 = 0.0f;
            }
            float f5 = f4;
            if ((i4 & 4) != 0) {
                lVar = j1.f19021a;
            }
            aVar.r(i1Var, j4, f5, lVar);
        }

        public static /* synthetic */ void u(a aVar, i1 i1Var, int i4, int i5, float f4, ld.l lVar, int i6, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i6 & 4) != 0) {
                f4 = 0.0f;
            }
            float f5 = f4;
            if ((i6 & 8) != 0) {
                lVar = j1.f19021a;
            }
            aVar.t(i1Var, i4, i5, f5, lVar);
        }

        public static /* synthetic */ void w(a aVar, i1 i1Var, long j4, float f4, ld.l lVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i4 & 2) != 0) {
                f4 = 0.0f;
            }
            float f5 = f4;
            if ((i4 & 4) != 0) {
                lVar = j1.f19021a;
            }
            aVar.v(i1Var, j4, f5, lVar);
        }

        @fg.m
        public u c() {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @fg.l
        public abstract androidx.compose.ui.unit.w d();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract int e();

        public final void f(@fg.l i1 i1Var, int i4, int i5, float f4) {
            long a5 = androidx.compose.ui.unit.r.a(i4, i5);
            long j4 = i1Var.apparentToRealOffset;
            i1Var.H0(androidx.compose.ui.unit.r.a(androidx.compose.ui.unit.q.m(a5) + ((int) (j4 >> 32)), ((int) (a5 & 4294967295L)) + ((int) (j4 & 4294967295L))), f4, null);
        }

        public final void h(@fg.l i1 i1Var, long j4, float f4) {
            long j5 = i1Var.apparentToRealOffset;
            i1Var.H0(androidx.compose.ui.unit.r.a(androidx.compose.ui.unit.q.m(j4) + ((int) (j5 >> 32)), ((int) (j4 & 4294967295L)) + ((int) (j5 & 4294967295L))), f4, null);
        }

        public final void j(@fg.l i1 i1Var, long j4, float f4, @fg.m ld.l<? super q4, k2> lVar) {
            long j5 = i1Var.apparentToRealOffset;
            i1Var.H0(androidx.compose.ui.unit.r.a(androidx.compose.ui.unit.q.m(j4) + ((int) (j5 >> 32)), ((int) (j4 & 4294967295L)) + ((int) (j5 & 4294967295L))), f4, lVar);
        }

        public final void k(@fg.l i1 i1Var, long j4, float f4, @fg.m ld.l<? super q4, k2> lVar) {
            if (d() == androidx.compose.ui.unit.w.Ltr || e() == 0) {
                long j5 = i1Var.apparentToRealOffset;
                i1Var.H0(androidx.compose.ui.unit.r.a(androidx.compose.ui.unit.q.m(j4) + ((int) (j5 >> 32)), ((int) (j4 & 4294967295L)) + ((int) (j5 & 4294967295L))), f4, lVar);
            } else {
                long a5 = androidx.compose.ui.unit.r.a((e() - i1Var.getWidth()) - androidx.compose.ui.unit.q.m(j4), (int) (j4 & 4294967295L));
                long j6 = i1Var.apparentToRealOffset;
                i1Var.H0(androidx.compose.ui.unit.r.a(((int) (a5 >> 32)) + ((int) (j6 >> 32)), ((int) (a5 & 4294967295L)) + ((int) (j6 & 4294967295L))), f4, lVar);
            }
        }

        public final void l(@fg.l i1 i1Var, int i4, int i5, float f4) {
            long a5 = androidx.compose.ui.unit.r.a(i4, i5);
            if (d() == androidx.compose.ui.unit.w.Ltr || e() == 0) {
                long j4 = i1Var.apparentToRealOffset;
                i1Var.H0(androidx.compose.ui.unit.r.a(androidx.compose.ui.unit.q.m(a5) + ((int) (j4 >> 32)), ((int) (a5 & 4294967295L)) + ((int) (j4 & 4294967295L))), f4, null);
            } else {
                long a6 = androidx.compose.ui.unit.r.a((e() - i1Var.getWidth()) - androidx.compose.ui.unit.q.m(a5), (int) (a5 & 4294967295L));
                long j5 = i1Var.apparentToRealOffset;
                i1Var.H0(androidx.compose.ui.unit.r.a(((int) (a6 >> 32)) + ((int) (j5 >> 32)), ((int) (a6 & 4294967295L)) + ((int) (j5 & 4294967295L))), f4, null);
            }
        }

        public final void n(@fg.l i1 i1Var, long j4, float f4) {
            if (d() == androidx.compose.ui.unit.w.Ltr || e() == 0) {
                long j5 = i1Var.apparentToRealOffset;
                i1Var.H0(androidx.compose.ui.unit.r.a(androidx.compose.ui.unit.q.m(j4) + ((int) (j5 >> 32)), ((int) (j4 & 4294967295L)) + ((int) (j5 & 4294967295L))), f4, null);
            } else {
                long a5 = androidx.compose.ui.unit.r.a((e() - i1Var.getWidth()) - androidx.compose.ui.unit.q.m(j4), (int) (j4 & 4294967295L));
                long j6 = i1Var.apparentToRealOffset;
                i1Var.H0(androidx.compose.ui.unit.r.a(((int) (a5 >> 32)) + ((int) (j6 >> 32)), ((int) (a5 & 4294967295L)) + ((int) (j6 & 4294967295L))), f4, null);
            }
        }

        public final void p(@fg.l i1 i1Var, int i4, int i5, float f4, @fg.l ld.l<? super q4, k2> lVar) {
            long a5 = androidx.compose.ui.unit.r.a(i4, i5);
            if (d() == androidx.compose.ui.unit.w.Ltr || e() == 0) {
                long j4 = i1Var.apparentToRealOffset;
                i1Var.H0(androidx.compose.ui.unit.r.a(androidx.compose.ui.unit.q.m(a5) + ((int) (j4 >> 32)), ((int) (a5 & 4294967295L)) + ((int) (j4 & 4294967295L))), f4, lVar);
            } else {
                long a6 = androidx.compose.ui.unit.r.a((e() - i1Var.getWidth()) - androidx.compose.ui.unit.q.m(a5), (int) (a5 & 4294967295L));
                long j5 = i1Var.apparentToRealOffset;
                i1Var.H0(androidx.compose.ui.unit.r.a(((int) (a6 >> 32)) + ((int) (j5 >> 32)), ((int) (a6 & 4294967295L)) + ((int) (j5 & 4294967295L))), f4, lVar);
            }
        }

        public final void r(@fg.l i1 i1Var, long j4, float f4, @fg.l ld.l<? super q4, k2> lVar) {
            if (d() == androidx.compose.ui.unit.w.Ltr || e() == 0) {
                long j5 = i1Var.apparentToRealOffset;
                i1Var.H0(androidx.compose.ui.unit.r.a(androidx.compose.ui.unit.q.m(j4) + ((int) (j5 >> 32)), ((int) (j4 & 4294967295L)) + ((int) (j5 & 4294967295L))), f4, lVar);
            } else {
                long a5 = androidx.compose.ui.unit.r.a((e() - i1Var.getWidth()) - androidx.compose.ui.unit.q.m(j4), (int) (j4 & 4294967295L));
                long j6 = i1Var.apparentToRealOffset;
                i1Var.H0(androidx.compose.ui.unit.r.a(((int) (a5 >> 32)) + ((int) (j6 >> 32)), ((int) (a5 & 4294967295L)) + ((int) (j6 & 4294967295L))), f4, lVar);
            }
        }

        public final void t(@fg.l i1 i1Var, int i4, int i5, float f4, @fg.l ld.l<? super q4, k2> lVar) {
            long a5 = androidx.compose.ui.unit.r.a(i4, i5);
            long j4 = i1Var.apparentToRealOffset;
            i1Var.H0(androidx.compose.ui.unit.r.a(androidx.compose.ui.unit.q.m(a5) + ((int) (j4 >> 32)), ((int) (a5 & 4294967295L)) + ((int) (j4 & 4294967295L))), f4, lVar);
        }

        public final void v(@fg.l i1 i1Var, long j4, float f4, @fg.l ld.l<? super q4, k2> lVar) {
            long j5 = i1Var.apparentToRealOffset;
            i1Var.H0(androidx.compose.ui.unit.r.a(androidx.compose.ui.unit.q.m(j4) + ((int) (j5 >> 32)), ((int) (j4 & 4294967295L)) + ((int) (j5 & 4294967295L))), f4, lVar);
        }
    }

    public i1() {
        long j4;
        j4 = j1.f19022b;
        this.measurementConstraints = j4;
        androidx.compose.ui.unit.q.INSTANCE.getClass();
        this.apparentToRealOffset = androidx.compose.ui.unit.q.f21519c;
    }

    private final void G0() {
        this.width = kotlin.ranges.s.I(androidx.compose.ui.unit.u.m(this.measuredSize), androidx.compose.ui.unit.b.r(this.measurementConstraints), androidx.compose.ui.unit.b.p(this.measurementConstraints));
        int I = kotlin.ranges.s.I((int) (this.measuredSize & 4294967295L), androidx.compose.ui.unit.b.q(this.measurementConstraints), androidx.compose.ui.unit.b.o(this.measurementConstraints));
        this.height = I;
        int i4 = this.width;
        long j4 = this.measuredSize;
        this.apparentToRealOffset = androidx.compose.ui.unit.r.a((i4 - ((int) (j4 >> 32))) / 2, (I - ((int) (4294967295L & j4))) / 2);
    }

    /* renamed from: C0, reason: from getter */
    protected final long getMeasuredSize() {
        return this.measuredSize;
    }

    /* renamed from: D0, reason: from getter */
    protected final long getMeasurementConstraints() {
        return this.measurementConstraints;
    }

    /* renamed from: E0, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void H0(long position, float zIndex, @fg.m ld.l<? super q4, k2> layerBlock);

    protected final void I0(long j4) {
        if (androidx.compose.ui.unit.u.h(this.measuredSize, j4)) {
            return;
        }
        this.measuredSize = j4;
        G0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void J0(long j4) {
        if (androidx.compose.ui.unit.b.g(this.measurementConstraints, j4)) {
            return;
        }
        this.measurementConstraints = j4;
        G0();
    }

    @Override // androidx.compose.ui.layout.p0
    public int W() {
        return androidx.compose.ui.unit.u.m(this.measuredSize);
    }

    @Override // androidx.compose.ui.layout.p0
    public int v() {
        return androidx.compose.ui.unit.u.j(this.measuredSize);
    }

    /* renamed from: w0, reason: from getter */
    protected final long getApparentToRealOffset() {
        return this.apparentToRealOffset;
    }

    /* renamed from: x0, reason: from getter */
    public final int getHeight() {
        return this.height;
    }
}

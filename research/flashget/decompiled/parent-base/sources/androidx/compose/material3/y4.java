package androidx.compose.material3;

import androidx.compose.material3.u6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MenuPosition.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u00128\b\u0002\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u0002HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ@\u0010 \u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\bHÆ\u0003¢\u0006\u0004\b \u0010!Jk\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u000628\b\u0002\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\bHÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b'\u0010\u001fJ\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u00101\u001a\u0004\b2\u0010\u001fRG\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\b8\u0006¢\u0006\f\n\u0004\b\u001e\u00103\u001a\u0004\b4\u0010!R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00106R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00106R\u0014\u0010:\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00106R\u0014\u0010;\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u00106R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010=R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010=R\u0014\u0010@\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010=R\u0014\u0010B\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010=R\u0014\u0010D\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010=\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006E"}, d2 = {"Landroidx/compose/material3/y4;", "Landroidx/compose/ui/window/o;", "Landroidx/compose/ui/unit/j;", "contentOffset", "Landroidx/compose/ui/unit/d;", "density", "", "verticalMargin", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/s;", "Lkotlin/r0;", "name", "anchorBounds", "menuBounds", "Lkotlin/k2;", "onPositionCalculated", "<init>", "(JLandroidx/compose/ui/unit/d;ILld/p;Lkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/unit/u;", "windowSize", "Landroidx/compose/ui/unit/w;", "layoutDirection", "popupContentSize", "Landroidx/compose/ui/unit/q;", "a", "(Landroidx/compose/ui/unit/s;JLandroidx/compose/ui/unit/w;J)J", "b", "()J", "c", "()Landroidx/compose/ui/unit/d;", "d", "()I", "e", "()Lld/p;", "f", "(JLandroidx/compose/ui/unit/d;ILld/p;)Landroidx/compose/material3/y4;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "h", "Landroidx/compose/ui/unit/d;", "i", "I", "k", "Lld/p;", "j", "Landroidx/compose/material3/u6$a;", "Landroidx/compose/material3/u6$a;", "startToAnchorStart", "endToAnchorEnd", "g", "leftToWindowLeft", "rightToWindowRight", "Landroidx/compose/material3/u6$b;", "Landroidx/compose/material3/u6$b;", "topToAnchorBottom", "bottomToAnchorTop", "centerToAnchorTop", "l", "topToWindowTop", "m", "bottomToWindowBottom", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nMenuPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuPosition.kt\nandroidx/compose/material3/DropdownMenuPositionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,412:1\n1#2:413\n151#3,3:414\n33#3,4:417\n154#3,2:421\n38#3:423\n156#3:424\n116#3,2:425\n33#3,6:427\n118#3:433\n151#3,3:434\n33#3,4:437\n154#3,2:441\n38#3:443\n156#3:444\n116#3,2:445\n33#3,6:447\n118#3:453\n*S KotlinDebug\n*F\n+ 1 MenuPosition.kt\nandroidx/compose/material3/DropdownMenuPositionProvider\n*L\n371#1:414,3\n371#1:417,4\n371#1:421,2\n371#1:423\n371#1:424\n379#1:425,2\n379#1:427,6\n379#1:433\n392#1:434,3\n392#1:437,4\n392#1:441,2\n392#1:443\n392#1:444\n399#1:445,2\n399#1:447,6\n399#1:453\n*E\n"})
/* loaded from: classes.dex */
public final /* data */ class y4 implements androidx.compose.ui.window.o {

    /* renamed from: n, reason: collision with root package name */
    public static final int f15789n = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long contentOffset;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.unit.d density;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int verticalMargin;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.p<androidx.compose.ui.unit.s, androidx.compose.ui.unit.s, kotlin.k2> onPositionCalculated;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final u6.a startToAnchorStart;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final u6.a endToAnchorEnd;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final u6.a leftToWindowLeft;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final u6.a rightToWindowRight;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final u6.b topToAnchorBottom;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final u6.b bottomToAnchorTop;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final u6.b centerToAnchorTop;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final u6.b topToWindowTop;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final u6.b bottomToWindowBottom;

    /* compiled from: MenuPosition.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/unit/s;", "<anonymous parameter 0>", "<anonymous parameter 1>", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/unit/s;Landroidx/compose/ui/unit/s;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.unit.s, androidx.compose.ui.unit.s, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f15803b = new a(2);

        a() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.unit.s sVar, @fg.l androidx.compose.ui.unit.s sVar2) {
        }

        @Override // ld.p
        public kotlin.k2 invoke(androidx.compose.ui.unit.s sVar, androidx.compose.ui.unit.s sVar2) {
            return kotlin.k2.f75408a;
        }
    }

    public /* synthetic */ y4(long j4, androidx.compose.ui.unit.d dVar, int i4, ld.p pVar, kotlin.jvm.internal.w wVar) {
        this(j4, dVar, i4, pVar);
    }

    public static y4 g(y4 y4Var, long j4, androidx.compose.ui.unit.d dVar, int i4, ld.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j4 = y4Var.contentOffset;
        }
        long j5 = j4;
        if ((i5 & 2) != 0) {
            dVar = y4Var.density;
        }
        androidx.compose.ui.unit.d dVar2 = dVar;
        if ((i5 & 4) != 0) {
            i4 = y4Var.verticalMargin;
        }
        int i6 = i4;
        if ((i5 & 8) != 0) {
            pVar = y4Var.onPositionCalculated;
        }
        y4Var.getClass();
        return new y4(j5, dVar2, i6, pVar);
    }

    @Override // androidx.compose.ui.window.o
    public long a(@fg.l androidx.compose.ui.unit.s anchorBounds, long windowSize, @fg.l androidx.compose.ui.unit.w layoutDirection, long popupContentSize) {
        Object obj;
        Object obj2;
        List O = kotlin.collections.w.O(this.startToAnchorStart, this.endToAnchorEnd, androidx.compose.ui.unit.q.m(anchorBounds.o()) < androidx.compose.ui.unit.u.m(windowSize) / 2 ? this.leftToWindowLeft : this.rightToWindowRight);
        ArrayList arrayList = new ArrayList(O.size());
        int size = O.size();
        int i4 = 0;
        while (i4 < size) {
            ArrayList arrayList2 = arrayList;
            arrayList2.add(Integer.valueOf(((u6.a) O.get(i4)).a(anchorBounds, windowSize, (int) (popupContentSize >> 32), layoutDirection)));
            i4++;
            O = O;
            size = size;
            arrayList = arrayList2;
        }
        ArrayList arrayList3 = arrayList;
        int size2 = arrayList3.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size2) {
                obj = null;
                break;
            }
            obj = arrayList3.get(i5);
            int intValue = ((Number) obj).intValue();
            if (intValue >= 0 && intValue + ((int) (popupContentSize >> 32)) <= ((int) (windowSize >> 32))) {
                break;
            }
            i5++;
        }
        Integer num = (Integer) obj;
        int intValue2 = num != null ? num.intValue() : ((Number) kotlin.collections.w.p3(arrayList3)).intValue();
        int i6 = (int) (windowSize & 4294967295L);
        List O2 = kotlin.collections.w.O(this.topToAnchorBottom, this.bottomToAnchorTop, this.centerToAnchorTop, ((int) (anchorBounds.o() & 4294967295L)) < i6 / 2 ? this.topToWindowTop : this.bottomToWindowBottom);
        ArrayList arrayList4 = new ArrayList(O2.size());
        int i7 = 0;
        for (int size3 = O2.size(); i7 < size3; size3 = size3) {
            arrayList4.add(Integer.valueOf(((u6.b) O2.get(i7)).a(anchorBounds, windowSize, (int) (popupContentSize & 4294967295L))));
            i7++;
        }
        int size4 = arrayList4.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size4) {
                obj2 = null;
                break;
            }
            obj2 = arrayList4.get(i10);
            int intValue3 = ((Number) obj2).intValue();
            int i11 = this.verticalMargin;
            if (intValue3 >= i11 && intValue3 + ((int) (popupContentSize & 4294967295L)) <= i6 - i11) {
                break;
            }
            i10++;
        }
        Integer num2 = (Integer) obj2;
        long a5 = androidx.compose.ui.unit.r.a(intValue2, num2 != null ? num2.intValue() : ((Number) kotlin.collections.w.p3(arrayList4)).intValue());
        this.onPositionCalculated.invoke(anchorBounds, androidx.compose.ui.unit.t.b(a5, popupContentSize));
        return a5;
    }

    /* renamed from: b, reason: from getter */
    public final long getContentOffset() {
        return this.contentOffset;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final androidx.compose.ui.unit.d getDensity() {
        return this.density;
    }

    /* renamed from: d, reason: from getter */
    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    @fg.l
    public final ld.p<androidx.compose.ui.unit.s, androidx.compose.ui.unit.s, kotlin.k2> e() {
        return this.onPositionCalculated;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof y4)) {
            return false;
        }
        y4 y4Var = (y4) other;
        return androidx.compose.ui.unit.j.h(this.contentOffset, y4Var.contentOffset) && kotlin.jvm.internal.l0.g(this.density, y4Var.density) && this.verticalMargin == y4Var.verticalMargin && kotlin.jvm.internal.l0.g(this.onPositionCalculated, y4Var.onPositionCalculated);
    }

    @fg.l
    public final y4 f(long contentOffset, @fg.l androidx.compose.ui.unit.d density, int verticalMargin, @fg.l ld.p<? super androidx.compose.ui.unit.s, ? super androidx.compose.ui.unit.s, kotlin.k2> onPositionCalculated) {
        return new y4(contentOffset, density, verticalMargin, onPositionCalculated);
    }

    public final long h() {
        return this.contentOffset;
    }

    public int hashCode() {
        return this.onPositionCalculated.hashCode() + androidx.compose.foundation.w1.a(this.verticalMargin, (this.density.hashCode() + (androidx.compose.ui.unit.j.n(this.contentOffset) * 31)) * 31, 31);
    }

    @fg.l
    public final androidx.compose.ui.unit.d i() {
        return this.density;
    }

    @fg.l
    public final ld.p<androidx.compose.ui.unit.s, androidx.compose.ui.unit.s, kotlin.k2> j() {
        return this.onPositionCalculated;
    }

    public final int k() {
        return this.verticalMargin;
    }

    @fg.l
    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) androidx.compose.ui.unit.j.q(this.contentOffset)) + ", density=" + this.density + ", verticalMargin=" + this.verticalMargin + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private y4(long j4, androidx.compose.ui.unit.d dVar, int i4, ld.p<? super androidx.compose.ui.unit.s, ? super androidx.compose.ui.unit.s, kotlin.k2> pVar) {
        this.contentOffset = j4;
        this.density = dVar;
        this.verticalMargin = i4;
        this.onPositionCalculated = pVar;
        int q22 = dVar.q2(androidx.compose.ui.unit.j.j(j4));
        u6 u6Var = u6.f14957a;
        this.startToAnchorStart = u6Var.m(q22);
        this.endToAnchorEnd = u6Var.g(q22);
        this.leftToWindowLeft = u6Var.i(0);
        this.rightToWindowRight = u6Var.k(0);
        int q23 = dVar.q2(androidx.compose.ui.unit.j.l(j4));
        this.topToAnchorBottom = u6Var.o(q23);
        this.bottomToAnchorTop = u6Var.a(q23);
        this.centerToAnchorTop = u6Var.e(q23);
        this.topToWindowTop = u6Var.q(i4);
        this.bottomToWindowBottom = u6Var.c(i4);
    }

    public /* synthetic */ y4(long j4, androidx.compose.ui.unit.d dVar, int i4, ld.p pVar, int i5, kotlin.jvm.internal.w wVar) {
        this(j4, dVar, (i5 & 4) != 0 ? dVar.q2(t6.j()) : i4, (i5 & 8) != 0 ? a.f15803b : pVar);
    }
}

package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.z0;
import androidx.compose.runtime.x4;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.layout.s1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LazyLayoutMeasureScope.kt */
@z0
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJO\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0002\b\u0012H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\t*\u00020\u0017H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t*\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d*\u00020\u0017H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001d*\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0014\u0010$\u001a\u00020#*\u00020\"H\u0097\u0001¢\u0006\u0004\b$\u0010%J(\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010&\u001a\u00020\t2\u0006\u0010(\u001a\u00020'H\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0016\u0010-\u001a\u00020\u0017*\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b-\u0010!J\u0019\u0010.\u001a\u00020\u0017*\u00020\tH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\u00020\u0017*\u00020\u001dH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\u001fJ\u0019\u00101\u001a\u00020\u001a*\u00020\u001dH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u0019\u00103\u001a\u00020\u001a*\u00020\tH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0016\u00105\u001a\u00020\u001a*\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b5\u00102J\u0016\u00108\u001a\u000207*\u000206H\u0016ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u0016\u0010:\u001a\u000206*\u000207H\u0016ø\u0001\u0000¢\u0006\u0004\b:\u00109R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR<\u0010G\u001a*\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0Cj\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)`D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020\u001d8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b;\u0010HR\u0014\u0010K\u001a\u00020\u001d8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010HR\u0014\u0010O\u001a\u00020L8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bQ\u0010R\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006T"}, d2 = {"Landroidx/compose/foundation/lazy/layout/y;", "Landroidx/compose/foundation/lazy/layout/x;", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/foundation/lazy/layout/q;", "itemContentFactory", "Landroidx/compose/ui/layout/s1;", "subcomposeMeasureScope", "<init>", "(Landroidx/compose/foundation/lazy/layout/q;Landroidx/compose/ui/layout/s1;)V", "", "width", "height", "", "Landroidx/compose/ui/layout/a;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "Lkotlin/u;", "placementBlock", "Landroidx/compose/ui/layout/n0;", "U3", "(IILjava/util/Map;Lld/l;)Landroidx/compose/ui/layout/n0;", "Landroidx/compose/ui/unit/h;", "q2", "(F)I", "Landroidx/compose/ui/unit/z;", "J5", "(J)I", "", "v5", "(F)F", "J2", "(J)F", "Landroidx/compose/ui/unit/k;", "Li0/i;", "c5", "(Landroidx/compose/ui/unit/k;)Li0/i;", "index", "Landroidx/compose/ui/unit/b;", "constraints", "", "Landroidx/compose/ui/layout/i1;", "p1", "(IJ)Ljava/util/List;", "i", "R", "(I)F", "S", "w", "(F)J", "u", "(I)J", "h", "Landroidx/compose/ui/unit/l;", "Li0/n;", "d0", "(J)J", "n", "b", "Landroidx/compose/foundation/lazy/layout/q;", "c", "Landroidx/compose/ui/layout/s1;", "Landroidx/compose/foundation/lazy/layout/s;", "d", "Landroidx/compose/foundation/lazy/layout/s;", "itemProvider", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "e", "Ljava/util/HashMap;", "placeablesCache", "()F", "density", "U", "fontScale", "", "E1", "()Z", "isLookingAhead", "Landroidx/compose/ui/unit/w;", "getLayoutDirection", "()Landroidx/compose/ui/unit/w;", "layoutDirection", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 1)
@r1({"SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1#2:155\n*E\n"})
/* loaded from: classes.dex */
public final class y implements x, androidx.compose.ui.layout.o0 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f6159f = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q itemContentFactory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final s1 subcomposeMeasureScope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final s itemProvider;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final HashMap<Integer, List<i1>> placeablesCache = new HashMap<>();

    public y(@fg.l q qVar, @fg.l s1 s1Var) {
        this.itemContentFactory = qVar;
        this.subcomposeMeasureScope = s1Var;
        this.itemProvider = qVar.d().invoke();
    }

    @Override // androidx.compose.ui.layout.q
    public boolean E1() {
        return this.subcomposeMeasureScope.E1();
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public float J2(long j4) {
        return this.subcomposeMeasureScope.J2(j4);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public int J5(long j4) {
        return this.subcomposeMeasureScope.J5(j4);
    }

    @Override // androidx.compose.foundation.lazy.layout.x, androidx.compose.ui.unit.d
    public float R(int i4) {
        return this.subcomposeMeasureScope.R(i4);
    }

    @Override // androidx.compose.foundation.lazy.layout.x, androidx.compose.ui.unit.d
    public float S(float f4) {
        return this.subcomposeMeasureScope.S(f4);
    }

    @Override // androidx.compose.ui.unit.n
    /* renamed from: U */
    public float getFontScale() {
        return this.subcomposeMeasureScope.getFontScale();
    }

    @Override // androidx.compose.ui.layout.o0
    @fg.l
    public androidx.compose.ui.layout.n0 U3(int width, int height, @fg.l Map<androidx.compose.ui.layout.a, Integer> alignmentLines, @fg.l ld.l<? super i1.a, k2> placementBlock) {
        return this.subcomposeMeasureScope.U3(width, height, alignmentLines, placementBlock);
    }

    @Override // androidx.compose.ui.unit.d
    /* renamed from: b */
    public float getDensity() {
        return this.subcomposeMeasureScope.getDensity();
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    @fg.l
    public i0.i c5(@fg.l androidx.compose.ui.unit.k kVar) {
        return this.subcomposeMeasureScope.c5(kVar);
    }

    @Override // androidx.compose.foundation.lazy.layout.x, androidx.compose.ui.unit.d
    public long d0(long j4) {
        return this.subcomposeMeasureScope.d0(j4);
    }

    @Override // androidx.compose.ui.layout.q
    @fg.l
    public androidx.compose.ui.unit.w getLayoutDirection() {
        return this.subcomposeMeasureScope.getLayoutDirection();
    }

    @Override // androidx.compose.foundation.lazy.layout.x, androidx.compose.ui.unit.n
    public long h(float f4) {
        return this.subcomposeMeasureScope.h(f4);
    }

    @Override // androidx.compose.foundation.lazy.layout.x, androidx.compose.ui.unit.n
    public float i(long j4) {
        return this.subcomposeMeasureScope.i(j4);
    }

    @Override // androidx.compose.foundation.lazy.layout.x, androidx.compose.ui.unit.d
    public long n(long j4) {
        return this.subcomposeMeasureScope.n(j4);
    }

    @Override // androidx.compose.foundation.lazy.layout.x
    @fg.l
    public List<i1> p1(int index, long constraints) {
        List<i1> list = this.placeablesCache.get(Integer.valueOf(index));
        if (list != null) {
            return list;
        }
        Object d5 = this.itemProvider.d(index);
        List<androidx.compose.ui.layout.l0> E2 = this.subcomposeMeasureScope.E2(d5, this.itemContentFactory.b(index, d5, this.itemProvider.e(index)));
        int size = E2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(E2.get(i4).m0(constraints));
        }
        this.placeablesCache.put(Integer.valueOf(index), arrayList);
        return arrayList;
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public int q2(float f4) {
        return this.subcomposeMeasureScope.q2(f4);
    }

    @Override // androidx.compose.foundation.lazy.layout.x, androidx.compose.ui.unit.d
    public long u(int i4) {
        return this.subcomposeMeasureScope.u(i4);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public float v5(float f4) {
        return this.subcomposeMeasureScope.v5(f4);
    }

    @Override // androidx.compose.foundation.lazy.layout.x, androidx.compose.ui.unit.d
    public long w(float f4) {
        return this.subcomposeMeasureScope.w(f4);
    }
}

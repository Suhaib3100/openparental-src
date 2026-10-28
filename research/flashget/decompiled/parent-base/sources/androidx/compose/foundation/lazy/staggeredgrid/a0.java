package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.layout.i1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyStaggeredGridMeasure.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0018\u001a\u00020\u0015*\u00020\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0016H\u0082\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010&\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010/\u001a\u0004\b.\u00101R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010/\u001a\u0004\b<\u00101R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010/R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010/R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u00103\u001a\u0004\b@\u00105R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\"\u0010G\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u00108\u001a\u0004\bD\u0010:\"\u0004\bE\u0010FR\u0017\u0010I\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010/\u001a\u0004\bA\u00101R\u0017\u0010K\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010/\u001a\u0004\bJ\u00101R\u0017\u0010M\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bL\u0010/\u001a\u0004\b=\u00101R\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010/R\u0016\u0010N\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010/R\u0016\u0010O\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010/R\"\u0010Q\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u00108\u001a\u0004\bH\u0010:\"\u0004\bP\u0010FR \u0010U\u001a\u00020R8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010S\u001a\u0004\b6\u0010TR*\u0010W\u001a\u00020\u00152\u0006\u0010V\u001a\u00020\u00158\u0016@RX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010S\u001a\u0004\b2\u0010TR\u0018\u0010\u001c\u001a\u00020\u0002*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010XR\u0019\u0010I\u001a\u00020\u0002*\u00020\u00078Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010YR\u0011\u0010Z\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bL\u00101R\u0011\u0010[\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b?\u00101R\u0011\u0010\\\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b;\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006]"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/a0;", "Landroidx/compose/foundation/lazy/staggeredgrid/j;", "", "index", "", "key", "", "Landroidx/compose/ui/layout/i1;", "placeables", "", "isVertical", "spacing", "lane", "span", "beforeContentPadding", "afterContentPadding", "contentType", "Landroidx/compose/foundation/lazy/staggeredgrid/k;", "animator", "<init>", "(ILjava/lang/Object;Ljava/util/List;ZIIIIILjava/lang/Object;Landroidx/compose/foundation/lazy/staggeredgrid/k;)V", "Landroidx/compose/ui/unit/q;", "Lkotlin/Function1;", "mainAxisMap", "e", "(JLld/l;)J", "m", "(I)Ljava/lang/Object;", "mainAxis", "crossAxis", "mainAxisLayoutSize", "Lkotlin/k2;", "t", "(III)V", "Landroidx/compose/ui/layout/i1$a;", "scope", "Landroidx/compose/foundation/lazy/staggeredgrid/u;", "context", "s", "(Landroidx/compose/ui/layout/i1$a;Landroidx/compose/foundation/lazy/staggeredgrid/u;)V", "delta", "d", "(I)V", "", "toString", "()Ljava/lang/String;", "a", "I", "getIndex", "()I", "b", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "c", "Ljava/util/List;", "Z", "q", "()Z", "f", "p", "g", "h", "i", "getContentType", "j", "Landroidx/compose/foundation/lazy/staggeredgrid/k;", "k", "r", "v", "(Z)V", "isVisible", "l", "mainAxisSize", "o", "sizeWithSpacings", "n", "crossAxisSize", "minMainAxisOffset", "maxMainAxisOffset", "u", "nonScrollableItem", "Landroidx/compose/ui/unit/u;", "J", "()J", "size", "<set-?>", "offset", "(J)I", "(Landroidx/compose/ui/layout/i1;)I", "placeablesCount", "mainAxisOffset", "crossAxisOffset", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,1225:1\n1212#1:1247\n1214#1:1249\n1212#1:1250\n1214#1:1253\n1214#1:1254\n317#2,8:1226\n317#2,8:1234\n69#2,4:1243\n74#2:1252\n1#3:1242\n86#4:1248\n86#4:1251\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n*L\n1172#1:1247\n1188#1:1249\n1189#1:1250\n1202#1:1253\n1206#1:1254\n1119#1:1226,8\n1125#1:1234,8\n1171#1:1243,4\n1171#1:1252\n1178#1:1248\n1192#1:1251\n*E\n"})
/* loaded from: classes.dex */
public final class a0 implements j {

    /* renamed from: u, reason: collision with root package name */
    public static final int f6231u = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object key;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<i1> placeables;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int lane;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int span;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int beforeContentPadding;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Object contentType;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k animator;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean isVisible = true;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSize;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int sizeWithSpacings;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int crossAxisSize;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int mainAxisLayoutSize;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int minMainAxisOffset;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int maxMainAxisOffset;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean nonScrollableItem;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long offset;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(int i4, @fg.l Object obj, @fg.l List<? extends i1> list, boolean z4, int i5, int i6, int i7, int i10, int i11, @fg.m Object obj2, @fg.l k kVar) {
        Integer valueOf;
        this.index = i4;
        this.key = obj;
        this.placeables = list;
        this.isVertical = z4;
        this.lane = i6;
        this.span = i7;
        this.beforeContentPadding = i10;
        this.afterContentPadding = i11;
        this.contentType = obj2;
        this.animator = kVar;
        int i12 = 1;
        Integer num = null;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            i1 i1Var = (i1) list.get(0);
            valueOf = Integer.valueOf(z4 ? i1Var.getHeight() : i1Var.getWidth());
            int J = kotlin.collections.w.J(list);
            if (1 <= J) {
                int i13 = 1;
                while (true) {
                    i1 i1Var2 = (i1) list.get(i13);
                    Integer valueOf2 = Integer.valueOf(this.isVertical ? i1Var2.getHeight() : i1Var2.getWidth());
                    valueOf = valueOf2.compareTo(valueOf) > 0 ? valueOf2 : valueOf;
                    if (i13 == J) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        this.mainAxisSize = intValue;
        int i14 = intValue + i5;
        this.sizeWithSpacings = i14 < 0 ? 0 : i14;
        List<i1> list2 = this.placeables;
        if (!list2.isEmpty()) {
            i1 i1Var3 = list2.get(0);
            Integer valueOf3 = Integer.valueOf(this.isVertical ? i1Var3.getWidth() : i1Var3.getHeight());
            int J2 = kotlin.collections.w.J(list2);
            if (1 <= J2) {
                while (true) {
                    i1 i1Var4 = list2.get(i12);
                    Integer valueOf4 = Integer.valueOf(this.isVertical ? i1Var4.getWidth() : i1Var4.getHeight());
                    valueOf3 = valueOf4.compareTo(valueOf3) > 0 ? valueOf4 : valueOf3;
                    if (i12 == J2) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            num = valueOf3;
        }
        int intValue2 = num != null ? num.intValue() : 0;
        this.crossAxisSize = intValue2;
        this.mainAxisLayoutSize = -1;
        this.size = this.isVertical ? androidx.compose.ui.unit.v.a(intValue2, this.mainAxisSize) : androidx.compose.ui.unit.v.a(this.mainAxisSize, intValue2);
        androidx.compose.ui.unit.q.INSTANCE.getClass();
        this.offset = androidx.compose.ui.unit.q.f21519c;
    }

    private final long e(long j4, ld.l<? super Integer, Integer> lVar) {
        int m4 = this.isVertical ? androidx.compose.ui.unit.q.m(j4) : lVar.invoke(Integer.valueOf(androidx.compose.ui.unit.q.m(j4))).intValue();
        boolean z4 = this.isVertical;
        int o4 = androidx.compose.ui.unit.q.o(j4);
        if (z4) {
            o4 = lVar.invoke(Integer.valueOf(o4)).intValue();
        }
        return androidx.compose.ui.unit.r.a(m4, o4);
    }

    private final int h(long j4) {
        return this.isVertical ? androidx.compose.ui.unit.q.o(j4) : androidx.compose.ui.unit.q.m(j4);
    }

    private final int k(i1 i1Var) {
        return this.isVertical ? i1Var.getHeight() : i1Var.getWidth();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.j
    /* renamed from: a, reason: from getter */
    public int getLane() {
        return this.lane;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.j
    /* renamed from: b, reason: from getter */
    public long getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.j
    /* renamed from: c, reason: from getter */
    public long getSize() {
        return this.size;
    }

    public final void d(int delta) {
        if (this.nonScrollableItem) {
            return;
        }
        long j4 = this.offset;
        int m4 = this.isVertical ? androidx.compose.ui.unit.q.m(j4) : androidx.compose.ui.unit.q.m(j4) + delta;
        boolean z4 = this.isVertical;
        int o4 = androidx.compose.ui.unit.q.o(j4);
        if (z4) {
            o4 += delta;
        }
        this.offset = androidx.compose.ui.unit.r.a(m4, o4);
        int size = this.placeables.size();
        for (int i4 = 0; i4 < size; i4++) {
            androidx.compose.foundation.lazy.layout.h b5 = this.animator.b(this.key, i4);
            if (b5 != null) {
                long rawOffset = b5.getRawOffset();
                int m5 = this.isVertical ? androidx.compose.ui.unit.q.m(rawOffset) : Integer.valueOf(androidx.compose.ui.unit.q.m(rawOffset) + delta).intValue();
                boolean z5 = this.isVertical;
                int o5 = androidx.compose.ui.unit.q.o(rawOffset);
                if (z5) {
                    o5 += delta;
                }
                b5.A(androidx.compose.ui.unit.r.a(m5, o5));
            }
        }
    }

    public final int f() {
        return this.isVertical ? androidx.compose.ui.unit.q.m(this.offset) : androidx.compose.ui.unit.q.o(this.offset);
    }

    /* renamed from: g, reason: from getter */
    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.j
    @fg.m
    public Object getContentType() {
        return this.contentType;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.j
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.j
    @fg.l
    public Object getKey() {
        return this.key;
    }

    public final int i() {
        return !this.isVertical ? androidx.compose.ui.unit.q.m(this.offset) : androidx.compose.ui.unit.q.o(this.offset);
    }

    /* renamed from: j, reason: from getter */
    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @fg.m
    public final Object m(int index) {
        return this.placeables.get(index).a();
    }

    public final int n() {
        return this.placeables.size();
    }

    /* renamed from: o, reason: from getter */
    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
    }

    /* renamed from: p, reason: from getter */
    public final int getSpan() {
        return this.span;
    }

    /* renamed from: q, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    /* renamed from: r, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public final void s(@fg.l i1.a scope, @fg.l u context) {
        List<i1> list;
        int i4;
        if (this.mainAxisLayoutSize == -1) {
            throw new IllegalArgumentException("position() should be called first");
        }
        List<i1> list2 = this.placeables;
        int i5 = 0;
        for (int size = list2.size(); i5 < size; size = i4) {
            i1 i1Var = list2.get(i5);
            int height = this.minMainAxisOffset - (this.isVertical ? i1Var.getHeight() : i1Var.getWidth());
            int i6 = this.maxMainAxisOffset;
            long j4 = this.offset;
            androidx.compose.foundation.lazy.layout.h b5 = this.animator.b(this.key, i5);
            if (b5 != null) {
                long o4 = b5.o();
                list = list2;
                i4 = size;
                long a5 = androidx.compose.ui.unit.r.a(androidx.compose.ui.unit.q.m(j4) + ((int) (o4 >> 32)), ((int) (j4 & 4294967295L)) + ((int) (o4 & 4294967295L)));
                if ((h(j4) <= height && h(a5) <= height) || (h(j4) >= i6 && h(a5) >= i6)) {
                    b5.j();
                }
                j4 = a5;
            } else {
                list = list2;
                i4 = size;
            }
            if (context.getReverseLayout()) {
                j4 = androidx.compose.ui.unit.r.a(this.isVertical ? androidx.compose.ui.unit.q.m(j4) : (this.mainAxisLayoutSize - androidx.compose.ui.unit.q.m(j4)) - (this.isVertical ? i1Var.getHeight() : i1Var.getWidth()), this.isVertical ? (this.mainAxisLayoutSize - androidx.compose.ui.unit.q.o(j4)) - (this.isVertical ? i1Var.getHeight() : i1Var.getWidth()) : androidx.compose.ui.unit.q.o(j4));
            }
            long contentOffset = context.getContentOffset();
            i1.a.s(scope, i1Var, androidx.compose.ui.unit.r.a(androidx.compose.ui.unit.q.m(j4) + ((int) (contentOffset >> 32)), ((int) (j4 & 4294967295L)) + ((int) (contentOffset & 4294967295L))), 0.0f, null, 6, null);
            i5++;
            list2 = list;
        }
    }

    public final void t(int mainAxis, int crossAxis, int mainAxisLayoutSize) {
        this.mainAxisLayoutSize = mainAxisLayoutSize;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = mainAxisLayoutSize + this.afterContentPadding;
        this.offset = this.isVertical ? androidx.compose.ui.unit.r.a(crossAxis, mainAxis) : androidx.compose.ui.unit.r.a(mainAxis, crossAxis);
    }

    @fg.l
    public String toString() {
        return super.toString();
    }

    public final void u(boolean z4) {
        this.nonScrollableItem = z4;
    }

    public final void v(boolean z4) {
        this.isVisible = z4;
    }
}

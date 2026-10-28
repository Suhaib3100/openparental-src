package androidx.compose.foundation.lazy;

import androidx.compose.foundation.z0;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.q4;
import androidx.compose.ui.layout.i1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LazyListMeasuredItem.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u0015\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0085\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001e\u001a\u00020\u0013*\u00020\u00132\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001cH\u0082\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J%\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001d\u0010,\u001a\u00020%2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0007¢\u0006\u0004\b,\u0010-J\u001d\u00101\u001a\u00020%2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u0007¢\u0006\u0004\b1\u00102R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u00103\u001a\u0004\b4\u00105R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00106R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00108R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00103R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00103R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00103R\u001a\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b9\u0010CR\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010D\u001a\u0004\bE\u0010FR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010D\u001a\u0004\bG\u0010FR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR$\u0010\"\u001a\u00020\u00022\u0006\u0010J\u001a\u00020\u00028\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bK\u00103\u001a\u0004\bL\u00105R\u001a\u0010O\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u00103\u001a\u0004\bN\u00105R\u0017\u0010Q\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u00103\u001a\u0004\bB\u00105R\u0017\u0010S\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bR\u00103\u001a\u0004\b7\u00105R\"\u0010V\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u00108\u001a\u0004\b?\u0010:\"\u0004\bH\u0010UR\u0016\u0010X\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u00103R\u0016\u0010Z\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u00103R\u0016\u0010\\\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u00103R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010b\u001a\u00020\u0002*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010aR\u0018\u0010d\u001a\u00020\u0002*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010cR\u0011\u0010e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bA\u00105\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006f"}, d2 = {"Landroidx/compose/foundation/lazy/v;", "Landroidx/compose/foundation/lazy/n;", "", "index", "", "Landroidx/compose/ui/layout/i1;", "placeables", "", "isVertical", "Landroidx/compose/ui/c$b;", "horizontalAlignment", "Landroidx/compose/ui/c$c;", "verticalAlignment", "Landroidx/compose/ui/unit/w;", "layoutDirection", "reverseLayout", "beforeContentPadding", "afterContentPadding", "spacing", "Landroidx/compose/ui/unit/q;", "visualOffset", "", "key", "contentType", "Landroidx/compose/foundation/lazy/l;", "animator", "<init>", "(ILjava/util/List;ZLandroidx/compose/ui/c$b;Landroidx/compose/ui/c$c;Landroidx/compose/ui/unit/w;ZIIIJLjava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/l;Lkotlin/jvm/internal/w;)V", "Lkotlin/Function1;", "mainAxisMap", "b", "(JLld/l;)J", "h", "(I)Ljava/lang/Object;", "offset", "layoutWidth", "layoutHeight", "Lkotlin/k2;", "m", "(III)V", "g", "(I)J", "delta", "updateAnimations", "a", "(IZ)V", "Landroidx/compose/ui/layout/i1$a;", "scope", "isLookingAhead", "l", "(Landroidx/compose/ui/layout/i1$a;Z)V", "I", "getIndex", "()I", "Ljava/util/List;", "c", "Z", "k", "()Z", "d", "Landroidx/compose/ui/c$b;", "e", "Landroidx/compose/ui/c$c;", "f", "Landroidx/compose/ui/unit/w;", "i", "j", "J", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "getContentType", "n", "Landroidx/compose/foundation/lazy/l;", "<set-?>", "o", "getOffset", "p", "getSize", "size", "q", "sizeWithSpacings", "r", "crossAxisSize", "s", "(Z)V", "nonScrollableItem", "t", "mainAxisLayoutSize", "u", "minMainAxisOffset", "v", "maxMainAxisOffset", "", "w", "[I", "placeableOffsets", "(J)I", "mainAxis", "(Landroidx/compose/ui/layout/i1;)I", "mainAxisSize", "placeablesCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyListMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,224:1\n220#1:237\n220#1:240\n33#2,6:225\n69#2,6:231\n1#3:238\n86#4:239\n86#4:241\n*S KotlinDebug\n*F\n+ 1 LazyListMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListMeasuredItem\n*L\n160#1:237\n204#1:240\n93#1:225,6\n119#1:231,6\n188#1:239\n208#1:241\n*E\n"})
/* loaded from: classes.dex */
public final class v implements n {

    /* renamed from: x, reason: collision with root package name */
    public static final int f6547x = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<i1> placeables;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final c.b horizontalAlignment;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final c.InterfaceC0326c verticalAlignment;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.unit.w layoutDirection;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int beforeContentPadding;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int spacing;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long visualOffset;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object key;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Object contentType;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l animator;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int offset;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final int sizeWithSpacings;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int crossAxisSize;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean nonScrollableItem;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int mainAxisLayoutSize;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private int minMainAxisOffset;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int maxMainAxisOffset;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final int[] placeableOffsets;

    @z0
    public /* synthetic */ v(int i4, List list, boolean z4, c.b bVar, c.InterfaceC0326c interfaceC0326c, androidx.compose.ui.unit.w wVar, boolean z5, int i5, int i6, int i7, long j4, Object obj, Object obj2, l lVar, kotlin.jvm.internal.w wVar2) {
        this(i4, list, z4, bVar, interfaceC0326c, wVar, z5, i5, i6, i7, j4, obj, obj2, lVar);
    }

    private final long b(long j4, ld.l<? super Integer, Integer> lVar) {
        int m4 = this.isVertical ? androidx.compose.ui.unit.q.m(j4) : lVar.invoke(Integer.valueOf(androidx.compose.ui.unit.q.m(j4))).intValue();
        boolean z4 = this.isVertical;
        int o4 = androidx.compose.ui.unit.q.o(j4);
        if (z4) {
            o4 = lVar.invoke(Integer.valueOf(o4)).intValue();
        }
        return androidx.compose.ui.unit.r.a(m4, o4);
    }

    private final int d(long j4) {
        return this.isVertical ? androidx.compose.ui.unit.q.o(j4) : androidx.compose.ui.unit.q.m(j4);
    }

    private final int e(i1 i1Var) {
        return this.isVertical ? i1Var.getHeight() : i1Var.getWidth();
    }

    public final void a(int delta, boolean updateAnimations) {
        if (this.nonScrollableItem) {
            return;
        }
        this.offset += delta;
        int length = this.placeableOffsets.length;
        for (int i4 = 0; i4 < length; i4++) {
            boolean z4 = this.isVertical;
            if ((z4 && i4 % 2 == 1) || (!z4 && i4 % 2 == 0)) {
                int[] iArr = this.placeableOffsets;
                iArr[i4] = iArr[i4] + delta;
            }
        }
        if (updateAnimations) {
            int size = this.placeables.size();
            for (int i5 = 0; i5 < size; i5++) {
                androidx.compose.foundation.lazy.layout.h a5 = this.animator.a(this.key, i5);
                if (a5 != null) {
                    long rawOffset = a5.getRawOffset();
                    int m4 = this.isVertical ? androidx.compose.ui.unit.q.m(rawOffset) : Integer.valueOf(androidx.compose.ui.unit.q.m(rawOffset) + delta).intValue();
                    boolean z5 = this.isVertical;
                    int o4 = androidx.compose.ui.unit.q.o(rawOffset);
                    if (z5) {
                        o4 += delta;
                    }
                    a5.A(androidx.compose.ui.unit.r.a(m4, o4));
                }
            }
        }
    }

    /* renamed from: c, reason: from getter */
    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    public final long g(int index) {
        int[] iArr = this.placeableOffsets;
        int i4 = index * 2;
        return androidx.compose.ui.unit.r.a(iArr[i4], iArr[i4 + 1]);
    }

    @Override // androidx.compose.foundation.lazy.n
    @fg.m
    public Object getContentType() {
        return this.contentType;
    }

    @Override // androidx.compose.foundation.lazy.n
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.n
    @fg.l
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.n
    public int getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.n
    public int getSize() {
        return this.size;
    }

    @fg.m
    public final Object h(int index) {
        return this.placeables.get(index).a();
    }

    public final int i() {
        return this.placeables.size();
    }

    /* renamed from: j, reason: from getter */
    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    public final void l(@fg.l i1.a scope, boolean isLookingAhead) {
        int i4;
        int i5;
        ld.l<q4, k2> b5;
        if (this.mainAxisLayoutSize == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        int i6 = 0;
        for (int size = this.placeables.size(); i6 < size; size = i4) {
            i1 i1Var = this.placeables.get(i6);
            int e4 = this.minMainAxisOffset - e(i1Var);
            int i7 = this.maxMainAxisOffset;
            long g4 = g(i6);
            androidx.compose.foundation.lazy.layout.h a5 = this.animator.a(this.key, i6);
            if (a5 != null) {
                if (isLookingAhead) {
                    a5.w(g4);
                    i4 = size;
                    i5 = i6;
                } else {
                    long lookaheadOffset = a5.getLookaheadOffset();
                    androidx.compose.foundation.lazy.layout.h.INSTANCE.getClass();
                    if (!androidx.compose.ui.unit.q.j(lookaheadOffset, androidx.compose.foundation.lazy.layout.h.f6001o)) {
                        g4 = a5.getLookaheadOffset();
                    }
                    long o4 = a5.o();
                    i4 = size;
                    i5 = i6;
                    long a6 = androidx.compose.ui.unit.r.a(((int) (g4 >> 32)) + ((int) (o4 >> 32)), ((int) (g4 & 4294967295L)) + ((int) (o4 & 4294967295L)));
                    if ((d(g4) <= e4 && d(a6) <= e4) || (d(g4) >= i7 && d(a6) >= i7)) {
                        a5.j();
                    }
                    g4 = a6;
                }
                b5 = a5.m();
            } else {
                i4 = size;
                i5 = i6;
                b5 = androidx.compose.foundation.lazy.layout.i.b();
            }
            if (this.reverseLayout) {
                g4 = androidx.compose.ui.unit.r.a(this.isVertical ? androidx.compose.ui.unit.q.m(g4) : (this.mainAxisLayoutSize - androidx.compose.ui.unit.q.m(g4)) - e(i1Var), this.isVertical ? (this.mainAxisLayoutSize - androidx.compose.ui.unit.q.o(g4)) - e(i1Var) : androidx.compose.ui.unit.q.o(g4));
            }
            long j4 = this.visualOffset;
            long a7 = androidx.compose.ui.unit.r.a(androidx.compose.ui.unit.q.m(g4) + ((int) (j4 >> 32)), ((int) (g4 & 4294967295L)) + ((int) (j4 & 4294967295L)));
            if (this.isVertical) {
                i1.a.w(scope, i1Var, a7, 0.0f, b5, 2, null);
            } else {
                i1.a.s(scope, i1Var, a7, 0.0f, b5, 2, null);
            }
            i6 = i5 + 1;
        }
    }

    public final void m(int offset, int layoutWidth, int layoutHeight) {
        int width;
        this.offset = offset;
        this.mainAxisLayoutSize = this.isVertical ? layoutHeight : layoutWidth;
        List<i1> list = this.placeables;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            i1 i1Var = list.get(i4);
            int i5 = i4 * 2;
            if (this.isVertical) {
                int[] iArr = this.placeableOffsets;
                c.b bVar = this.horizontalAlignment;
                if (bVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true");
                }
                iArr[i5] = bVar.a(i1Var.getWidth(), layoutWidth, this.layoutDirection);
                this.placeableOffsets[i5 + 1] = offset;
                width = i1Var.getHeight();
            } else {
                int[] iArr2 = this.placeableOffsets;
                iArr2[i5] = offset;
                int i6 = i5 + 1;
                c.InterfaceC0326c interfaceC0326c = this.verticalAlignment;
                if (interfaceC0326c == null) {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false");
                }
                iArr2[i6] = interfaceC0326c.a(i1Var.getHeight(), layoutHeight);
                width = i1Var.getWidth();
            }
            offset = width + offset;
        }
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    public final void n(boolean z4) {
        this.nonScrollableItem = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private v(int i4, List<? extends i1> list, boolean z4, c.b bVar, c.InterfaceC0326c interfaceC0326c, androidx.compose.ui.unit.w wVar, boolean z5, int i5, int i6, int i7, long j4, Object obj, Object obj2, l lVar) {
        this.index = i4;
        this.placeables = list;
        this.isVertical = z4;
        this.horizontalAlignment = bVar;
        this.verticalAlignment = interfaceC0326c;
        this.layoutDirection = wVar;
        this.reverseLayout = z5;
        this.beforeContentPadding = i5;
        this.afterContentPadding = i6;
        this.spacing = i7;
        this.visualOffset = j4;
        this.key = obj;
        this.contentType = obj2;
        this.animator = lVar;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i1 i1Var = (i1) list.get(i12);
            i10 += this.isVertical ? i1Var.getHeight() : i1Var.getWidth();
            i11 = Math.max(i11, !this.isVertical ? i1Var.getHeight() : i1Var.getWidth());
        }
        this.size = i10;
        int i13 = i10 + this.spacing;
        this.sizeWithSpacings = i13 >= 0 ? i13 : 0;
        this.crossAxisSize = i11;
        this.placeableOffsets = new int[this.placeables.size() * 2];
    }
}

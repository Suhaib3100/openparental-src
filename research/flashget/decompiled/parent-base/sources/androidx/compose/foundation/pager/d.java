package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.j0;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.i1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: MeasuredPage.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0015\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001c\u001a\u00020\b*\u00020\b2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001aH\u0082\bø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020!2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020!2\u0006\u0010(\u001a\u00020\u0002¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\b.\u0010-R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b1\u00102R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b1\u00105R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00106R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u00107R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00108R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00109R\u0014\u0010;\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109R\u0017\u0010=\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010+\u001a\u0004\b/\u0010-R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R$\u0010\u001e\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u00028\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bC\u0010+\u001a\u0004\bD\u0010-R\u0016\u0010F\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010+R\u0018\u0010H\u001a\u00020\u0002*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u0010G\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006I"}, d2 = {"Landroidx/compose/foundation/pager/d;", "Landroidx/compose/foundation/pager/f;", "", "index", "size", "", "Landroidx/compose/ui/layout/i1;", "placeables", "Landroidx/compose/ui/unit/q;", "visualOffset", "", "key", "Landroidx/compose/foundation/gestures/j0;", "orientation", "Landroidx/compose/ui/c$b;", "horizontalAlignment", "Landroidx/compose/ui/c$c;", "verticalAlignment", "Landroidx/compose/ui/unit/w;", "layoutDirection", "", "reverseLayout", "<init>", "(IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/gestures/j0;Landroidx/compose/ui/c$b;Landroidx/compose/ui/c$c;Landroidx/compose/ui/unit/w;ZLkotlin/jvm/internal/w;)V", "f", "(I)J", "Lkotlin/Function1;", "mainAxisMap", "b", "(JLld/l;)J", "offset", "layoutWidth", "layoutHeight", "Lkotlin/k2;", "i", "(III)V", "Landroidx/compose/ui/layout/i1$a;", "scope", "h", "(Landroidx/compose/ui/layout/i1$a;)V", "delta", "a", "(I)V", "I", "getIndex", "()I", "g", "c", "Ljava/util/List;", "d", "J", "e", "Ljava/lang/Object;", "()Ljava/lang/Object;", "Landroidx/compose/ui/c$b;", "Landroidx/compose/ui/c$c;", "Landroidx/compose/ui/unit/w;", "Z", "j", "isVertical", "k", "crossAxisSize", "", "l", "[I", "placeableOffsets", "<set-?>", "m", "getOffset", "n", "mainAxisLayoutSize", "(Landroidx/compose/ui/layout/i1;)I", "mainAxisSize", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nMeasuredPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasuredPage.kt\nandroidx/compose/foundation/pager/MeasuredPage\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,133:1\n129#1:146\n33#2,6:134\n69#2,4:140\n74#2:145\n1#3:144\n86#4:147\n*S KotlinDebug\n*F\n+ 1 MeasuredPage.kt\nandroidx/compose/foundation/pager/MeasuredPage\n*L\n100#1:146\n52#1:134,6\n76#1:140,4\n76#1:145\n104#1:147\n*E\n"})
/* loaded from: classes.dex */
public final class d implements f {

    /* renamed from: o, reason: collision with root package name */
    public static final int f6753o = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<i1> placeables;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long visualOffset;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object key;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final c.b horizontalAlignment;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final c.InterfaceC0326c verticalAlignment;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.unit.w layoutDirection;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int crossAxisSize;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final int[] placeableOffsets;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int offset;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int mainAxisLayoutSize;

    public /* synthetic */ d(int i4, int i5, List list, long j4, Object obj, j0 j0Var, c.b bVar, c.InterfaceC0326c interfaceC0326c, androidx.compose.ui.unit.w wVar, boolean z4, kotlin.jvm.internal.w wVar2) {
        this(i4, i5, list, j4, obj, j0Var, bVar, interfaceC0326c, wVar, z4);
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

    private final int e(i1 i1Var) {
        return this.isVertical ? i1Var.getHeight() : i1Var.getWidth();
    }

    private final long f(int index) {
        int[] iArr = this.placeableOffsets;
        int i4 = index * 2;
        return androidx.compose.ui.unit.r.a(iArr[i4], iArr[i4 + 1]);
    }

    public final void a(int delta) {
        this.offset += delta;
        int length = this.placeableOffsets.length;
        for (int i4 = 0; i4 < length; i4++) {
            boolean z4 = this.isVertical;
            if ((z4 && i4 % 2 == 1) || (!z4 && i4 % 2 == 0)) {
                int[] iArr = this.placeableOffsets;
                iArr[i4] = iArr[i4] + delta;
            }
        }
    }

    /* renamed from: c, reason: from getter */
    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final Object getKey() {
        return this.key;
    }

    /* renamed from: g, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.pager.f
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.pager.f
    public int getOffset() {
        return this.offset;
    }

    public final void h(@fg.l i1.a scope) {
        if (this.mainAxisLayoutSize == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        int size = this.placeables.size();
        for (int i4 = 0; i4 < size; i4++) {
            i1 i1Var = this.placeables.get(i4);
            long f4 = f(i4);
            if (this.reverseLayout) {
                f4 = androidx.compose.ui.unit.r.a(this.isVertical ? androidx.compose.ui.unit.q.m(f4) : (this.mainAxisLayoutSize - androidx.compose.ui.unit.q.m(f4)) - e(i1Var), this.isVertical ? (this.mainAxisLayoutSize - androidx.compose.ui.unit.q.o(f4)) - e(i1Var) : androidx.compose.ui.unit.q.o(f4));
            }
            long j4 = this.visualOffset;
            long a5 = androidx.compose.ui.unit.r.a(androidx.compose.ui.unit.q.m(f4) + ((int) (j4 >> 32)), ((int) (f4 & 4294967295L)) + ((int) (j4 & 4294967295L)));
            if (this.isVertical) {
                i1.a.w(scope, i1Var, a5, 0.0f, null, 6, null);
            } else {
                i1.a.s(scope, i1Var, a5, 0.0f, null, 6, null);
            }
        }
    }

    public final void i(int offset, int layoutWidth, int layoutHeight) {
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
                    throw new IllegalArgumentException("null horizontalAlignment");
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
                    throw new IllegalArgumentException("null verticalAlignment");
                }
                iArr2[i6] = interfaceC0326c.a(i1Var.getHeight(), layoutHeight);
                width = i1Var.getWidth();
            }
            offset = width + offset;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d(int i4, int i5, List<? extends i1> list, long j4, Object obj, j0 j0Var, c.b bVar, c.InterfaceC0326c interfaceC0326c, androidx.compose.ui.unit.w wVar, boolean z4) {
        this.index = i4;
        this.size = i5;
        this.placeables = list;
        this.visualOffset = j4;
        this.key = obj;
        this.horizontalAlignment = bVar;
        this.verticalAlignment = interfaceC0326c;
        this.layoutDirection = wVar;
        this.reverseLayout = z4;
        this.isVertical = j0Var == j0.Vertical;
        int size = list.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            i1 i1Var = (i1) list.get(i7);
            i6 = Math.max(i6, !this.isVertical ? i1Var.getHeight() : i1Var.getWidth());
        }
        this.crossAxisSize = i6;
        this.placeableOffsets = new int[this.placeables.size() * 2];
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
    }
}

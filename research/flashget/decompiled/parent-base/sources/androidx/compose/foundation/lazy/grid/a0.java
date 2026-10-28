package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LazyGridMeasuredLine.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b \u0010\u001a¨\u0006'"}, d2 = {"Landroidx/compose/foundation/lazy/grid/a0;", "", "", "index", "", "Landroidx/compose/foundation/lazy/grid/x;", "items", "Landroidx/compose/foundation/lazy/grid/g0;", "slots", "", "Landroidx/compose/foundation/lazy/grid/b;", "spans", "", "isVertical", "mainAxisSpacing", "<init>", "(I[Landroidx/compose/foundation/lazy/grid/x;Landroidx/compose/foundation/lazy/grid/g0;Ljava/util/List;ZI)V", "e", "()Z", "offset", "layoutWidth", "layoutHeight", "f", "(III)[Landroidx/compose/foundation/lazy/grid/x;", "a", "I", "()I", "b", "[Landroidx/compose/foundation/lazy/grid/x;", "()[Landroidx/compose/foundation/lazy/grid/x;", "c", "Landroidx/compose/foundation/lazy/grid/g0;", "d", "Ljava/util/List;", "Z", "g", "mainAxisSize", "h", "mainAxisSizeWithSpacings", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyGridMeasuredLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredLine.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,86:1\n13579#2,2:87\n13644#2,3:89\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredLine.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine\n*L\n46#1:87,2\n68#1:89,3\n*E\n"})
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: i, reason: collision with root package name */
    public static final int f5574i = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x[] items;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final g0 slots;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<b> spans;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSpacing;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSize;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSizeWithSpacings;

    public a0(int i4, @fg.l x[] xVarArr, @fg.l g0 g0Var, @fg.l List<b> list, boolean z4, int i5) {
        this.index = i4;
        this.items = xVarArr;
        this.slots = g0Var;
        this.spans = list;
        this.isVertical = z4;
        this.mainAxisSpacing = i5;
        int i6 = 0;
        for (x xVar : xVarArr) {
            i6 = Math.max(i6, xVar.getMainAxisSize());
        }
        this.mainAxisSize = i6;
        int i7 = i6 + this.mainAxisSpacing;
        this.mainAxisSizeWithSpacings = i7 >= 0 ? i7 : 0;
    }

    /* renamed from: a, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final x[] getItems() {
        return this.items;
    }

    /* renamed from: c, reason: from getter */
    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    /* renamed from: d, reason: from getter */
    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final boolean e() {
        return this.items.length == 0;
    }

    @fg.l
    public final x[] f(int offset, int layoutWidth, int layoutHeight) {
        x[] xVarArr = this.items;
        int length = xVarArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            x xVar = xVarArr[i4];
            int i7 = i5 + 1;
            int packedValue = (int) this.spans.get(i5).getPackedValue();
            int i10 = this.slots.getPositions()[i6];
            boolean z4 = this.isVertical;
            xVar.r(offset, i10, layoutWidth, layoutHeight, z4 ? this.index : i6, z4 ? i6 : this.index);
            k2 k2Var = k2.f75408a;
            i6 += packedValue;
            i4++;
            i5 = i7;
        }
        return this.items;
    }
}

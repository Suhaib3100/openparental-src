package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.layout.i1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyStaggeredGridMeasure.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0013ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016JG\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH&¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0011\u0010&\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b\"\u0010%\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/x;", "", "", "isVertical", "Landroidx/compose/foundation/lazy/staggeredgrid/m;", "itemProvider", "Landroidx/compose/foundation/lazy/layout/x;", "measureScope", "Landroidx/compose/foundation/lazy/staggeredgrid/h0;", "resolvedSlots", "<init>", "(ZLandroidx/compose/foundation/lazy/staggeredgrid/m;Landroidx/compose/foundation/lazy/layout/x;Landroidx/compose/foundation/lazy/staggeredgrid/h0;)V", "", "slot", "span", "Landroidx/compose/ui/unit/b;", "a", "(II)J", "index", "Landroidx/compose/foundation/lazy/staggeredgrid/l0;", "Landroidx/compose/foundation/lazy/staggeredgrid/a0;", "c", "(IJ)Landroidx/compose/foundation/lazy/staggeredgrid/a0;", "lane", "key", "contentType", "", "Landroidx/compose/ui/layout/i1;", "placeables", "b", "(IIILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;)Landroidx/compose/foundation/lazy/staggeredgrid/a0;", "Z", "Landroidx/compose/foundation/lazy/staggeredgrid/m;", "Landroidx/compose/foundation/lazy/layout/x;", "d", "Landroidx/compose/foundation/lazy/staggeredgrid/h0;", "Landroidx/compose/foundation/lazy/layout/v;", "()Landroidx/compose/foundation/lazy/layout/v;", "keyIndexMap", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider\n+ 2 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1225:1\n951#2:1226\n953#2:1228\n952#2:1229\n951#2:1231\n55#3:1227\n62#3:1230\n55#3:1232\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider\n*L\n1074#1:1226\n1075#1:1228\n1075#1:1229\n1075#1:1231\n1074#1:1227\n1075#1:1230\n1075#1:1232\n*E\n"})
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: e, reason: collision with root package name */
    public static final int f6499e = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m itemProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.x measureScope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h0 resolvedSlots;

    public x(boolean z4, @fg.l m mVar, @fg.l androidx.compose.foundation.lazy.layout.x xVar, @fg.l h0 h0Var) {
        this.isVertical = z4;
        this.itemProvider = mVar;
        this.measureScope = xVar;
        this.resolvedSlots = h0Var;
    }

    private final long a(int slot, int span) {
        int i4;
        if (span == 1) {
            i4 = this.resolvedSlots.getSizes()[slot];
        } else {
            int i5 = this.resolvedSlots.getPositions()[slot];
            int i6 = (slot + span) - 1;
            i4 = (this.resolvedSlots.getPositions()[i6] + this.resolvedSlots.getSizes()[i6]) - i5;
        }
        return this.isVertical ? androidx.compose.ui.unit.b.INSTANCE.e(i4) : androidx.compose.ui.unit.b.INSTANCE.d(i4);
    }

    @fg.l
    public abstract a0 b(int index, int lane, int span, @fg.l Object key, @fg.m Object contentType, @fg.l List<? extends i1> placeables);

    @fg.l
    public final a0 c(int index, long span) {
        Object d5 = this.itemProvider.d(index);
        Object e4 = this.itemProvider.e(index);
        int length = this.resolvedSlots.getSizes().length;
        int i4 = (int) (span >> 32);
        int i5 = length - 1;
        int i6 = i4 > i5 ? i5 : i4;
        int i7 = ((int) (span & 4294967295L)) - i4;
        int i10 = length - i6;
        int i11 = i7 > i10 ? i10 : i7;
        return b(index, i6, i11, d5, e4, this.measureScope.p1(index, a(i6, i11)));
    }

    @fg.l
    public final androidx.compose.foundation.lazy.layout.v d() {
        return this.itemProvider.a();
    }
}

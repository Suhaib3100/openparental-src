package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.z0;
import androidx.compose.ui.layout.i1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyGridMeasuredItemProvider.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H&¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0011\u0010 \u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/foundation/lazy/grid/z;", "", "Landroidx/compose/foundation/lazy/grid/n;", "itemProvider", "Landroidx/compose/foundation/lazy/layout/x;", "measureScope", "", "defaultMainAxisSpacing", "<init>", "(Landroidx/compose/foundation/lazy/grid/n;Landroidx/compose/foundation/lazy/layout/x;I)V", "index", "mainAxisSpacing", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/foundation/lazy/grid/x;", "b", "(IIJ)Landroidx/compose/foundation/lazy/grid/x;", "key", "contentType", "crossAxisSize", "", "Landroidx/compose/ui/layout/i1;", "placeables", "a", "(ILjava/lang/Object;Ljava/lang/Object;IILjava/util/List;)Landroidx/compose/foundation/lazy/grid/x;", "Landroidx/compose/foundation/lazy/grid/n;", "Landroidx/compose/foundation/lazy/layout/x;", "c", "I", "Landroidx/compose/foundation/lazy/layout/v;", "d", "()Landroidx/compose/foundation/lazy/layout/v;", "keyIndexMap", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyGridMeasuredItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: d, reason: collision with root package name */
    public static final int f5879d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n itemProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.x measureScope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int defaultMainAxisSpacing;

    @z0
    public z(@fg.l n nVar, @fg.l androidx.compose.foundation.lazy.layout.x xVar, int i4) {
        this.itemProvider = nVar;
        this.measureScope = xVar;
        this.defaultMainAxisSpacing = i4;
    }

    public static /* synthetic */ x c(z zVar, int i4, int i5, long j4, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-3p2s80s");
        }
        if ((i6 & 2) != 0) {
            i5 = zVar.defaultMainAxisSpacing;
        }
        return zVar.b(i4, i5, j4);
    }

    @fg.l
    public abstract x a(int index, @fg.l Object key, @fg.m Object contentType, int crossAxisSize, int mainAxisSpacing, @fg.l List<? extends i1> placeables);

    @fg.l
    public final x b(int index, int mainAxisSpacing, long constraints) {
        int q4;
        Object d5 = this.itemProvider.d(index);
        Object e4 = this.itemProvider.e(index);
        List<i1> p12 = this.measureScope.p1(index, constraints);
        if (androidx.compose.ui.unit.b.n(constraints)) {
            q4 = androidx.compose.ui.unit.b.r(constraints);
        } else {
            if (!androidx.compose.ui.unit.b.l(constraints)) {
                throw new IllegalArgumentException("does not have fixed height");
            }
            q4 = androidx.compose.ui.unit.b.q(constraints);
        }
        return a(index, d5, e4, q4, mainAxisSpacing, p12);
    }

    @fg.l
    public final androidx.compose.foundation.lazy.layout.v d() {
        return this.itemProvider.a();
    }
}

package androidx.compose.foundation.lazy;

import androidx.compose.foundation.z0;
import androidx.compose.ui.layout.i1;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LazyListMeasuredItemProvider.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u001d\u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0011\u0010!\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/foundation/lazy/x;", "", "Landroidx/compose/ui/unit/b;", "constraints", "", "isVertical", "Landroidx/compose/foundation/lazy/o;", "itemProvider", "Landroidx/compose/foundation/lazy/layout/x;", "measureScope", "<init>", "(JZLandroidx/compose/foundation/lazy/o;Landroidx/compose/foundation/lazy/layout/x;Lkotlin/jvm/internal/w;)V", "", "index", "Landroidx/compose/foundation/lazy/v;", "b", "(I)Landroidx/compose/foundation/lazy/v;", "key", "contentType", "", "Landroidx/compose/ui/layout/i1;", "placeables", "a", "(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;)Landroidx/compose/foundation/lazy/v;", "Landroidx/compose/foundation/lazy/o;", "Landroidx/compose/foundation/lazy/layout/x;", "c", "J", "()J", "childConstraints", "Landroidx/compose/foundation/lazy/layout/v;", "d", "()Landroidx/compose/foundation/lazy/layout/v;", "keyIndexMap", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: d, reason: collision with root package name */
    public static final int f6572d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final o itemProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.x measureScope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long childConstraints;

    @z0
    public /* synthetic */ x(long j4, boolean z4, o oVar, androidx.compose.foundation.lazy.layout.x xVar, kotlin.jvm.internal.w wVar) {
        this(j4, z4, oVar, xVar);
    }

    @fg.l
    public abstract v a(int index, @fg.l Object key, @fg.m Object contentType, @fg.l List<? extends i1> placeables);

    @fg.l
    public final v b(int index) {
        return a(index, this.itemProvider.d(index), this.itemProvider.e(index), this.measureScope.p1(index, this.childConstraints));
    }

    /* renamed from: c, reason: from getter */
    public final long getChildConstraints() {
        return this.childConstraints;
    }

    @fg.l
    public final androidx.compose.foundation.lazy.layout.v d() {
        return this.itemProvider.a();
    }

    private x(long j4, boolean z4, o oVar, androidx.compose.foundation.lazy.layout.x xVar) {
        this.itemProvider = oVar;
        this.measureScope = xVar;
        this.childConstraints = androidx.compose.ui.unit.c.b(0, z4 ? androidx.compose.ui.unit.b.p(j4) : Integer.MAX_VALUE, 0, z4 ? Integer.MAX_VALUE : androidx.compose.ui.unit.b.o(j4), 5, null);
    }
}

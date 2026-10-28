package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.q0;
import androidx.compose.foundation.gestures.w0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LazyGridAnimateScrollScope.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u001f\u001a\u00020\u00122'\u0010\u001e\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a¢\u0006\u0002\b\u001dH\u0096@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0014\u0010$\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0014\u0010(\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010#R\u0014\u0010*\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010#R\u0014\u0010,\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010#¨\u0006-"}, d2 = {"Landroidx/compose/foundation/lazy/grid/e;", "Landroidx/compose/foundation/lazy/layout/g;", "Landroidx/compose/foundation/lazy/grid/k0;", "state", "<init>", "(Landroidx/compose/foundation/lazy/grid/k0;)V", "Landroidx/compose/foundation/lazy/grid/u;", "layoutInfo", "", "isVertical", "", "a", "(Landroidx/compose/foundation/lazy/grid/u;Z)I", "index", "i", "(I)I", "Landroidx/compose/foundation/gestures/q0;", "scrollOffset", "Lkotlin/k2;", "f", "(Landroidx/compose/foundation/gestures/q0;II)V", "targetIndex", "targetItemOffset", "", "j", "(II)F", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "h", "(Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/lazy/grid/k0;", "d", "()I", "firstVisibleItemIndex", "c", "firstVisibleItemScrollOffset", "g", "lastVisibleItemIndex", "b", "itemCount", "e", "visibleItemsAverageSize", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyGridAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,121:1\n116#2,2:122\n33#2,6:124\n118#2:130\n*S KotlinDebug\n*F\n+ 1 LazyGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope\n*L\n45#1:122,2\n45#1:124,6\n45#1:130\n*E\n"})
/* loaded from: classes.dex */
public final class e implements androidx.compose.foundation.lazy.layout.g {

    /* renamed from: b, reason: collision with root package name */
    public static final int f5599b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k0 state;

    /* compiled from: LazyGridAnimateScrollScope.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f5601b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<k> f5602c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z4, List<? extends k> list) {
            super(1);
            this.f5601b = z4;
            this.f5602c = list;
        }

        @fg.l
        public final Integer a(int i4) {
            return Integer.valueOf(this.f5601b ? this.f5602c.get(i4).getRow() : this.f5602c.get(i4).getColumn());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    public e(@fg.l k0 k0Var) {
        this.state = k0Var;
    }

    private final int a(u layoutInfo, boolean isVertical) {
        List<k> j4 = layoutInfo.j();
        a aVar = new a(isVertical, j4);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < j4.size()) {
            int intValue = aVar.invoke(Integer.valueOf(i4)).intValue();
            if (intValue == -1) {
                i4++;
            } else {
                int i7 = 0;
                while (i4 < j4.size() && aVar.invoke(Integer.valueOf(i4)).intValue() == intValue) {
                    i7 = Math.max(i7, isVertical ? androidx.compose.ui.unit.u.j(j4.get(i4).getSize()) : androidx.compose.ui.unit.u.m(j4.get(i4).getSize()));
                    i4++;
                }
                i5 += i7;
                i6++;
            }
        }
        return layoutInfo.getMainAxisItemSpacing() + (i5 / i6);
    }

    @Override // androidx.compose.foundation.lazy.layout.g
    public int b() {
        return this.state.v().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.g
    public int c() {
        return this.state.s();
    }

    @Override // androidx.compose.foundation.lazy.layout.g
    public int d() {
        return this.state.r();
    }

    @Override // androidx.compose.foundation.lazy.layout.g
    public int e() {
        return a(this.state.v(), this.state.getIsVertical());
    }

    @Override // androidx.compose.foundation.lazy.layout.g
    public void f(@fg.l q0 q0Var, int i4, int i5) {
        this.state.Y(i4, i5);
    }

    @Override // androidx.compose.foundation.lazy.layout.g
    public int g() {
        k kVar = (k) kotlin.collections.w.v3(this.state.v().j());
        if (kVar != null) {
            return kVar.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.g
    @fg.m
    public Object h(@fg.l ld.p<? super q0, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object h4 = w0.h(this.state, null, pVar, dVar, 1, null);
        return h4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? h4 : k2.f75408a;
    }

    @Override // androidx.compose.foundation.lazy.layout.g
    public int i(int index) {
        k kVar;
        List<k> j4 = this.state.v().j();
        int size = j4.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                kVar = null;
                break;
            }
            kVar = j4.get(i4);
            if (kVar.getIndex() == index) {
                break;
            }
            i4++;
        }
        k kVar2 = kVar;
        if (kVar2 != null) {
            return this.state.getIsVertical() ? androidx.compose.ui.unit.q.o(kVar2.getOffset()) : androidx.compose.ui.unit.q.m(kVar2.getOffset());
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.g
    public float j(int targetIndex, int targetItemOffset) {
        int J = this.state.J();
        int e4 = e();
        int r4 = (((J - 1) * (targetIndex < this.state.r() ? -1 : 1)) + (targetIndex - this.state.r())) / J;
        int min = Math.min(Math.abs(targetItemOffset), e4);
        if (targetItemOffset < 0) {
            min *= -1;
        }
        return ((e4 * r4) + min) - this.state.s();
    }
}

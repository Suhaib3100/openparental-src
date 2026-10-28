package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.q0;
import androidx.compose.foundation.gestures.w0;
import androidx.compose.foundation.z0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LazyStaggeredGridAnimateScrollScope.kt */
@z0
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u0019\u001a\u00020\f2'\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014¢\u0006\u0002\b\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0014\u0010#\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001eR\u0014\u0010%\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001eR\u0014\u0010'\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001e¨\u0006("}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/c;", "Landroidx/compose/foundation/lazy/layout/g;", "Landroidx/compose/foundation/lazy/staggeredgrid/j0;", "state", "<init>", "(Landroidx/compose/foundation/lazy/staggeredgrid/j0;)V", "", "index", "i", "(I)I", "Landroidx/compose/foundation/gestures/q0;", "scrollOffset", "Lkotlin/k2;", "f", "(Landroidx/compose/foundation/gestures/q0;II)V", "targetIndex", "targetItemOffset", "", "j", "(II)F", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "h", "(Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "Landroidx/compose/foundation/lazy/staggeredgrid/j0;", "d", "()I", "firstVisibleItemIndex", "c", "firstVisibleItemScrollOffset", "g", "lastVisibleItemIndex", "b", "itemCount", "e", "visibleItemsAverageSize", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nLazyStaggeredGridAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,77:1\n132#2,3:78\n33#2,4:81\n135#2,2:85\n38#2:87\n137#2:88\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope\n*L\n71#1:78,3\n71#1:81,4\n71#1:85,2\n71#1:87\n71#1:88\n*E\n"})
/* loaded from: classes.dex */
public final class c implements androidx.compose.foundation.lazy.layout.g {

    /* renamed from: b, reason: collision with root package name */
    public static final int f6253b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j0 state;

    /* compiled from: LazyStaggeredGridAnimateScrollScope.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/j;", "it", "", "a", "(Landroidx/compose/foundation/lazy/staggeredgrid/j;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<j, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6255b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i4) {
            super(1);
            this.f6255b = i4;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(@fg.l j jVar) {
            return Integer.valueOf(jVar.getIndex() - this.f6255b);
        }
    }

    public c(@fg.l j0 j0Var) {
        this.state = j0Var;
    }

    @Override // androidx.compose.foundation.lazy.layout.g
    public int b() {
        return this.state.B().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.g
    public int c() {
        return this.state.x();
    }

    @Override // androidx.compose.foundation.lazy.layout.g
    public int d() {
        return this.state.w();
    }

    @Override // androidx.compose.foundation.lazy.layout.g
    public int e() {
        t B = this.state.B();
        List<j> j4 = B.j();
        int size = j4.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            j jVar = j4.get(i5);
            i4 += this.state.getIsVertical() ? androidx.compose.ui.unit.u.j(jVar.getSize()) : androidx.compose.ui.unit.u.m(jVar.getSize());
        }
        return B.getMainAxisItemSpacing() + (i4 / j4.size());
    }

    @Override // androidx.compose.foundation.lazy.layout.g
    public void f(@fg.l q0 q0Var, int i4, int i5) {
        this.state.g0(q0Var, i4, i5);
    }

    @Override // androidx.compose.foundation.lazy.layout.g
    public int g() {
        j jVar = (j) kotlin.collections.w.v3(this.state.B().j());
        if (jVar != null) {
            return jVar.getIndex();
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
        long offset = this.state.B().j().get(kotlin.collections.w.x(this.state.B().j(), 0, 0, new a(index), 3, null)).getOffset();
        return this.state.getIsVertical() ? androidx.compose.ui.unit.q.o(offset) : androidx.compose.ui.unit.q.m(offset);
    }

    @Override // androidx.compose.foundation.lazy.layout.g
    public float j(int targetIndex, int targetItemOffset) {
        int e4 = e();
        int z4 = (targetIndex / this.state.z()) - (this.state.w() / this.state.z());
        int min = Math.min(Math.abs(targetItemOffset), e4);
        if (targetItemOffset < 0) {
            min *= -1;
        }
        return ((e4 * z4) + min) - this.state.x();
    }
}

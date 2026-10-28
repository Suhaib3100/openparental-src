package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.q0;
import androidx.compose.foundation.gestures.w0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LazyListAnimateScrollScope.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u0019\u001a\u00020\f2'\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014¢\u0006\u0002\b\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0014\u0010#\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001eR\u0014\u0010%\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001eR\u0014\u0010'\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001e¨\u0006("}, d2 = {"Landroidx/compose/foundation/lazy/f;", "Landroidx/compose/foundation/lazy/layout/g;", "Landroidx/compose/foundation/lazy/c0;", "state", "<init>", "(Landroidx/compose/foundation/lazy/c0;)V", "", "index", "i", "(I)I", "Landroidx/compose/foundation/gestures/q0;", "scrollOffset", "Lkotlin/k2;", "f", "(Landroidx/compose/foundation/gestures/q0;II)V", "targetIndex", "targetItemOffset", "", "j", "(II)F", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "h", "(Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "Landroidx/compose/foundation/lazy/c0;", "d", "()I", "firstVisibleItemIndex", "c", "firstVisibleItemScrollOffset", "g", "lastVisibleItemIndex", "b", "itemCount", "e", "visibleItemsAverageSize", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyListAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/LazyListAnimateScrollScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,71:1\n116#2,2:72\n33#2,6:74\n118#2:80\n132#2,3:81\n33#2,4:84\n135#2,2:88\n38#2:90\n137#2:91\n*S KotlinDebug\n*F\n+ 1 LazyListAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/LazyListAnimateScrollScope\n*L\n42#1:72,2\n42#1:74,6\n42#1:80\n67#1:81,3\n67#1:84,4\n67#1:88,2\n67#1:90\n67#1:91\n*E\n"})
/* loaded from: classes.dex */
public final class f implements androidx.compose.foundation.lazy.layout.g {

    /* renamed from: b, reason: collision with root package name */
    public static final int f5561b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c0 state;

    public f(@fg.l c0 c0Var) {
        this.state = c0Var;
    }

    @Override // androidx.compose.foundation.lazy.layout.g
    public int b() {
        return this.state.A().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.g
    public int c() {
        return this.state.v();
    }

    @Override // androidx.compose.foundation.lazy.layout.g
    public int d() {
        return this.state.u();
    }

    @Override // androidx.compose.foundation.lazy.layout.g
    public int e() {
        s A = this.state.A();
        List<n> j4 = A.j();
        int size = j4.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += j4.get(i5).getSize();
        }
        return A.getMainAxisItemSpacing() + (i4 / j4.size());
    }

    @Override // androidx.compose.foundation.lazy.layout.g
    public void f(@fg.l q0 q0Var, int i4, int i5) {
        this.state.Z(i4, i5);
    }

    @Override // androidx.compose.foundation.lazy.layout.g
    public int g() {
        n nVar = (n) kotlin.collections.w.v3(this.state.A().j());
        if (nVar != null) {
            return nVar.getIndex();
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
        n nVar;
        List<n> j4 = this.state.A().j();
        int size = j4.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                nVar = null;
                break;
            }
            nVar = j4.get(i4);
            if (nVar.getIndex() == index) {
                break;
            }
            i4++;
        }
        n nVar2 = nVar;
        if (nVar2 != null) {
            return nVar2.getOffset();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.g
    public float j(int targetIndex, int targetItemOffset) {
        int e4 = e();
        int u4 = targetIndex - this.state.u();
        int min = Math.min(Math.abs(targetItemOffset), e4);
        if (targetItemOffset < 0) {
            min *= -1;
        }
        return ((e4 * u4) + min) - this.state.v();
    }
}

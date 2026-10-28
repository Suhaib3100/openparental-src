package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.q0;
import androidx.compose.foundation.gestures.w0;
import androidx.compose.foundation.z0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: PagerLazyAnimateScrollScope.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/pager/c0;", "state", "Landroidx/compose/foundation/lazy/layout/g;", "a", "(Landroidx/compose/foundation/pager/c0;)Landroidx/compose/foundation/lazy/layout/g;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q {

    /* compiled from: PagerLazyAnimateScrollScope.kt */
    @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0015\u001a\u00020\b2'\u0010\u0014\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010¢\u0006\u0002\b\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018R\u0014\u0010!\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0018¨\u0006\""}, d2 = {"androidx/compose/foundation/pager/q$a", "Landroidx/compose/foundation/lazy/layout/g;", "", "index", "i", "(I)I", "Landroidx/compose/foundation/gestures/q0;", "scrollOffset", "Lkotlin/k2;", "f", "(Landroidx/compose/foundation/gestures/q0;II)V", "targetIndex", "targetItemOffset", "", "j", "(II)F", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "h", "(Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "d", "()I", "firstVisibleItemIndex", "c", "firstVisibleItemScrollOffset", "g", "lastVisibleItemIndex", "b", "itemCount", "e", "visibleItemsAverageSize", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nPagerLazyAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerLazyAnimateScrollScope.kt\nandroidx/compose/foundation/pager/PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,67:1\n116#2,2:68\n33#2,6:70\n118#2:76\n*S KotlinDebug\n*F\n+ 1 PagerLazyAnimateScrollScope.kt\nandroidx/compose/foundation/pager/PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1\n*L\n45#1:68,2\n45#1:70,6\n45#1:76\n*E\n"})
    public static final class a implements androidx.compose.foundation.lazy.layout.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c0 f6868a;

        a(c0 c0Var) {
            this.f6868a = c0Var;
        }

        @Override // androidx.compose.foundation.lazy.layout.g
        public int b() {
            return this.f6868a.K();
        }

        @Override // androidx.compose.foundation.lazy.layout.g
        public int c() {
            return this.f6868a.getFirstVisiblePageOffset();
        }

        @Override // androidx.compose.foundation.lazy.layout.g
        public int d() {
            return this.f6868a.getFirstVisiblePage();
        }

        @Override // androidx.compose.foundation.lazy.layout.g
        public int e() {
            return this.f6868a.N() + this.f6868a.L();
        }

        @Override // androidx.compose.foundation.lazy.layout.g
        public void f(@fg.l q0 q0Var, int i4, int i5) {
            this.f6868a.y0(i4, i5 / this.f6868a.M());
        }

        @Override // androidx.compose.foundation.lazy.layout.g
        public int g() {
            return ((f) kotlin.collections.w.p3(this.f6868a.F().y())).getIndex();
        }

        @Override // androidx.compose.foundation.lazy.layout.g
        @fg.m
        public Object h(@fg.l ld.p<? super q0, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            Object h4 = w0.h(this.f6868a, null, pVar, dVar, 1, null);
            return h4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? h4 : k2.f75408a;
        }

        @Override // androidx.compose.foundation.lazy.layout.g
        public int i(int index) {
            f fVar;
            List<f> y4 = this.f6868a.F().y();
            int size = y4.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    fVar = null;
                    break;
                }
                fVar = y4.get(i4);
                if (fVar.getIndex() == index) {
                    break;
                }
                i4++;
            }
            f fVar2 = fVar;
            if (fVar2 != null) {
                return fVar2.getOffset();
            }
            return 0;
        }

        @Override // androidx.compose.foundation.lazy.layout.g
        public float j(int targetIndex, int targetItemOffset) {
            return ((targetIndex - this.f6868a.y()) * e()) + targetItemOffset;
        }
    }

    @fg.l
    @z0
    public static final androidx.compose.foundation.lazy.layout.g a(@fg.l c0 c0Var) {
        return new a(c0Var);
    }
}

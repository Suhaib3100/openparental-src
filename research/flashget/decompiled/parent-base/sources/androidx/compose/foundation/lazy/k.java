package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.l0;
import androidx.compose.foundation.z0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.jvm.internal.n0;
import kotlin.k2;

/* compiled from: LazyListIntervalContent.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B \u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tJ\u0094\u0001\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2#\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00042#\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000421\u0010\u0015\u001a-\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\n¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00050\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017JA\u0010\u0018\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JA\u0010\u001a\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0006H\u0017¢\u0006\u0004\b\u001a\u0010\u0019R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0%8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Landroidx/compose/foundation/lazy/k;", "Landroidx/compose/foundation/lazy/layout/p;", "Landroidx/compose/foundation/lazy/j;", "Landroidx/compose/foundation/lazy/y;", "Lkotlin/Function1;", "Lkotlin/k2;", "Lkotlin/u;", "content", "<init>", "(Lld/l;)V", "", "count", "Lkotlin/r0;", "name", "index", "", "key", "contentType", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/b;", "Landroidx/compose/runtime/i;", "itemContent", "i", "(ILld/l;Lld/l;Lld/r;)V", "e", "(Ljava/lang/Object;Ljava/lang/Object;Lld/q;)V", "u", "Landroidx/compose/foundation/lazy/layout/l0;", "b", "Landroidx/compose/foundation/lazy/layout/l0;", "C", "()Landroidx/compose/foundation/lazy/layout/l0;", "intervals", "", "c", "Ljava/util/List;", "_headerIndexes", "", "B", "()Ljava/util/List;", "headerIndexes", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k extends androidx.compose.foundation.lazy.layout.p<j> implements y {

    /* renamed from: d, reason: collision with root package name */
    public static final int f5890d = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l0<j> intervals = new l0<>();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private List<Integer> _headerIndexes;

    /* compiled from: LazyListIntervalContent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f5893b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj) {
            super(1);
            this.f5893b = obj;
        }

        @fg.l
        public final Object a(int i4) {
            return this.f5893b;
        }

        @Override // ld.l
        public Object invoke(Integer num) {
            num.intValue();
            return this.f5893b;
        }
    }

    /* compiled from: LazyListIntervalContent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f5894b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj) {
            super(1);
            this.f5894b = obj;
        }

        @fg.m
        public final Object a(int i4) {
            return this.f5894b;
        }

        @Override // ld.l
        public Object invoke(Integer num) {
            num.intValue();
            return this.f5894b;
        }
    }

    /* compiled from: LazyListIntervalContent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/b;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/lazy/b;ILandroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.r<androidx.compose.foundation.lazy.b, Integer, androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.lazy.b, androidx.compose.runtime.t, Integer, k2> f5895b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ld.q<? super androidx.compose.foundation.lazy.b, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar) {
            super(4);
            this.f5895b = qVar;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.l androidx.compose.foundation.lazy.b bVar, int i4, @fg.m androidx.compose.runtime.t tVar, int i5) {
            if ((i5 & 14) == 0) {
                i5 |= tVar.q0(bVar) ? 4 : 2;
            }
            if ((i5 & 651) == 130 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1010194746, i5, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:58)");
            }
            this.f5895b.R(bVar, tVar, Integer.valueOf(i5 & 14));
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.r
        public /* bridge */ /* synthetic */ k2 i(androidx.compose.foundation.lazy.b bVar, Integer num, androidx.compose.runtime.t tVar, Integer num2) {
            a(bVar, num.intValue(), tVar, num2.intValue());
            return k2.f75408a;
        }
    }

    public k(@fg.l ld.l<? super y, k2> lVar) {
        lVar.invoke(this);
    }

    @fg.l
    public final List<Integer> B() {
        List<Integer> list = this._headerIndexes;
        return list == null ? j0.f74919b : list;
    }

    @fg.l
    public l0<j> C() {
        return this.intervals;
    }

    @Override // androidx.compose.foundation.lazy.y
    public void e(@fg.m Object key, @fg.m Object contentType, @fg.l ld.q<? super androidx.compose.foundation.lazy.b, ? super androidx.compose.runtime.t, ? super Integer, k2> content) {
        this.intervals.c(1, new j(key != null ? new a(key) : null, new b(contentType), new androidx.compose.runtime.internal.b(-1010194746, true, new c(content))));
    }

    @Override // androidx.compose.foundation.lazy.y
    public void i(int count, @fg.m ld.l<? super Integer, ? extends Object> key, @fg.l ld.l<? super Integer, ? extends Object> contentType, @fg.l ld.r<? super androidx.compose.foundation.lazy.b, ? super Integer, ? super androidx.compose.runtime.t, ? super Integer, k2> itemContent) {
        this.intervals.c(count, new j(key, contentType, itemContent));
    }

    @Override // androidx.compose.foundation.lazy.y
    @z0
    public void u(@fg.m Object key, @fg.m Object contentType, @fg.l ld.q<? super androidx.compose.foundation.lazy.b, ? super androidx.compose.runtime.t, ? super Integer, k2> content) {
        List list = this._headerIndexes;
        if (list == null) {
            list = new ArrayList();
            this._headerIndexes = list;
        }
        list.add(Integer.valueOf(this.intervals.getSize()));
        e(key, contentType, content);
    }

    @Override // androidx.compose.foundation.lazy.layout.p
    public androidx.compose.foundation.lazy.layout.c<j> x() {
        return this.intervals;
    }
}

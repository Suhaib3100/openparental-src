package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.foundation.z0;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.t3;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LazyLayoutPager.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@z0
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0014\u0010$\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001b¨\u0006%"}, d2 = {"Landroidx/compose/foundation/pager/r;", "Landroidx/compose/foundation/lazy/layout/s;", "Landroidx/compose/foundation/pager/c0;", "state", "Landroidx/compose/foundation/lazy/layout/p;", "Landroidx/compose/foundation/pager/l;", "intervalContent", "Landroidx/compose/foundation/lazy/layout/v;", "keyIndexMap", "<init>", "(Landroidx/compose/foundation/pager/c0;Landroidx/compose/foundation/lazy/layout/p;Landroidx/compose/foundation/lazy/layout/v;)V", "", "index", "", "key", "Lkotlin/k2;", "i", "(ILjava/lang/Object;Landroidx/compose/runtime/t;I)V", "d", "(I)Ljava/lang/Object;", "c", "(Ljava/lang/Object;)I", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Landroidx/compose/foundation/pager/c0;", "b", "Landroidx/compose/foundation/lazy/layout/p;", "Landroidx/compose/foundation/lazy/layout/v;", "Landroidx/compose/foundation/pager/w;", "Landroidx/compose/foundation/pager/w;", "pagerScopeImpl", "itemCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r implements androidx.compose.foundation.lazy.layout.s {

    /* renamed from: e, reason: collision with root package name */
    public static final int f6869e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c0 state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.p<l> intervalContent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.v keyIndexMap;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final w pagerScopeImpl = w.f6938a;

    /* compiled from: LazyLayoutPager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyLayoutPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider$Item$1\n+ 2 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n1#1,328:1\n60#2,3:329\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider$Item$1\n*L\n198#1:329,3\n*E\n"})
    static final class a extends n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6875c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i4) {
            super(2);
            this.f6875c = i4;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1142237095, i4, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item.<anonymous> (LazyLayoutPager.kt:197)");
            }
            androidx.compose.foundation.lazy.layout.p pVar = r.this.intervalContent;
            int i5 = this.f6875c;
            r rVar = r.this;
            c.a aVar = pVar.x().get(i5);
            ((l) aVar.c()).a().i(rVar.pagerScopeImpl, Integer.valueOf(i5 - aVar.getStartIndex()), tVar, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: LazyLayoutPager.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6877c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f6878d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6879e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i4, Object obj, int i5) {
            super(2);
            this.f6877c = i4;
            this.f6878d = obj;
            this.f6879e = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            r.this.i(this.f6877c, this.f6878d, tVar, g3.b(this.f6879e | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    public r(@fg.l c0 c0Var, @fg.l androidx.compose.foundation.lazy.layout.p<l> pVar, @fg.l androidx.compose.foundation.lazy.layout.v vVar) {
        this.state = c0Var;
        this.intervalContent = pVar;
        this.keyIndexMap = vVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.s
    public int b() {
        return this.intervalContent.y();
    }

    @Override // androidx.compose.foundation.lazy.layout.s
    public int c(@fg.l Object key) {
        return this.keyIndexMap.c(key);
    }

    @Override // androidx.compose.foundation.lazy.layout.s
    @fg.l
    public Object d(int index) {
        Object d5 = this.keyIndexMap.d(index);
        return d5 == null ? this.intervalContent.z(index) : d5;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof r) {
            return l0.g(this.intervalContent, ((r) other).intervalContent);
        }
        return false;
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }

    @Override // androidx.compose.foundation.lazy.layout.s
    @androidx.compose.runtime.i
    public void i(int i4, @fg.l Object obj, @fg.m androidx.compose.runtime.t tVar, int i5) {
        androidx.compose.runtime.t o4 = tVar.o(-1201380429);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1201380429, i5, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item (LazyLayoutPager.kt:195)");
        }
        androidx.compose.foundation.lazy.layout.b0.a(obj, i4, this.state.getPinnedPages(), androidx.compose.runtime.internal.c.b(o4, 1142237095, true, new a(i4)), o4, ((i5 << 3) & 112) | 3592);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new b(i4, obj, i5));
        }
    }
}

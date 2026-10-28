package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.foundation.z0;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.t3;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LazyGridItemProvider.kt */
@z0
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b\u001c\u0010!R\u0014\u0010\"\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001bR\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Landroidx/compose/foundation/lazy/grid/o;", "Landroidx/compose/foundation/lazy/grid/n;", "Landroidx/compose/foundation/lazy/grid/k0;", "state", "Landroidx/compose/foundation/lazy/grid/j;", "intervalContent", "Landroidx/compose/foundation/lazy/layout/v;", "keyIndexMap", "<init>", "(Landroidx/compose/foundation/lazy/grid/k0;Landroidx/compose/foundation/lazy/grid/j;Landroidx/compose/foundation/lazy/layout/v;)V", "", "index", "", "d", "(I)Ljava/lang/Object;", "e", "key", "Lkotlin/k2;", "i", "(ILjava/lang/Object;Landroidx/compose/runtime/t;I)V", "c", "(Ljava/lang/Object;)I", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Landroidx/compose/foundation/lazy/grid/k0;", "b", "Landroidx/compose/foundation/lazy/grid/j;", "Landroidx/compose/foundation/lazy/layout/v;", "()Landroidx/compose/foundation/lazy/layout/v;", "itemCount", "Landroidx/compose/foundation/lazy/grid/j0;", "j", "()Landroidx/compose/foundation/lazy/grid/j0;", "spanLayoutProvider", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class o implements n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k0 state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j intervalContent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.v keyIndexMap;

    /* compiled from: LazyGridItemProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGridItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemProviderImpl$Item$1\n+ 2 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n1#1,101:1\n60#2,3:102\n*S KotlinDebug\n*F\n+ 1 LazyGridItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemProviderImpl$Item$1\n*L\n77#1:102,3\n*E\n"})
    static final class a extends n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5789c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i4) {
            super(2);
            this.f5789c = i4;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(726189336, i4, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item.<anonymous> (LazyGridItemProvider.kt:76)");
            }
            j jVar = o.this.intervalContent;
            int i5 = this.f5789c;
            c.a<i> aVar = jVar.x().get(i5);
            aVar.c().a().i(r.f5797a, Integer.valueOf(i5 - aVar.getStartIndex()), tVar, 6);
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

    /* compiled from: LazyGridItemProvider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5791c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f5792d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f5793e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i4, Object obj, int i5) {
            super(2);
            this.f5791c = i4;
            this.f5792d = obj;
            this.f5793e = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            o.this.i(this.f5791c, this.f5792d, tVar, g3.b(this.f5793e | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    public o(@fg.l k0 k0Var, @fg.l j jVar, @fg.l androidx.compose.foundation.lazy.layout.v vVar) {
        this.state = k0Var;
        this.intervalContent = jVar;
        this.keyIndexMap = vVar;
    }

    @Override // androidx.compose.foundation.lazy.grid.n
    @fg.l
    /* renamed from: a, reason: from getter */
    public androidx.compose.foundation.lazy.layout.v getKeyIndexMap() {
        return this.keyIndexMap;
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

    @Override // androidx.compose.foundation.lazy.layout.s
    @fg.m
    public Object e(int index) {
        return this.intervalContent.w(index);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof o) {
            return kotlin.jvm.internal.l0.g(this.intervalContent, ((o) other).intervalContent);
        }
        return false;
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }

    @Override // androidx.compose.foundation.lazy.layout.s
    @androidx.compose.runtime.i
    public void i(int i4, @fg.l Object obj, @fg.m androidx.compose.runtime.t tVar, int i5) {
        androidx.compose.runtime.t o4 = tVar.o(1493551140);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1493551140, i5, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:74)");
        }
        androidx.compose.foundation.lazy.layout.b0.a(obj, i4, this.state.getPinnedItems(), androidx.compose.runtime.internal.c.b(o4, 726189336, true, new a(i4)), o4, ((i5 << 3) & 112) | 3592);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new b(i4, obj, i5));
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.n
    @fg.l
    public j0 j() {
        return this.intervalContent.getSpanLayoutProvider();
    }
}

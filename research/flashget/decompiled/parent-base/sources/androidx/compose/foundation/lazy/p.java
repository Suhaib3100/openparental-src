package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.foundation.z0;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.t3;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LazyListItemProvider.kt */
@z0
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b\u001e\u0010&R\u0014\u0010'\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001dR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Landroidx/compose/foundation/lazy/p;", "Landroidx/compose/foundation/lazy/o;", "Landroidx/compose/foundation/lazy/c0;", "state", "Landroidx/compose/foundation/lazy/k;", "intervalContent", "Landroidx/compose/foundation/lazy/c;", "itemScope", "Landroidx/compose/foundation/lazy/layout/v;", "keyIndexMap", "<init>", "(Landroidx/compose/foundation/lazy/c0;Landroidx/compose/foundation/lazy/k;Landroidx/compose/foundation/lazy/c;Landroidx/compose/foundation/lazy/layout/v;)V", "", "index", "", "key", "Lkotlin/k2;", "i", "(ILjava/lang/Object;Landroidx/compose/runtime/t;I)V", "d", "(I)Ljava/lang/Object;", "e", "c", "(Ljava/lang/Object;)I", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Landroidx/compose/foundation/lazy/c0;", "b", "Landroidx/compose/foundation/lazy/k;", "Landroidx/compose/foundation/lazy/c;", "f", "()Landroidx/compose/foundation/lazy/c;", "Landroidx/compose/foundation/lazy/layout/v;", "()Landroidx/compose/foundation/lazy/layout/v;", "itemCount", "", "h", "()Ljava/util/List;", "headerIndexes", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class p implements o {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c0 state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k intervalContent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c itemScope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.v keyIndexMap;

    /* compiled from: LazyListItemProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyListItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderImpl$Item$1\n+ 2 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n1#1,106:1\n60#2,3:107\n*S KotlinDebug\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderImpl$Item$1\n*L\n78#1:107,3\n*E\n"})
    static final class a extends n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6176c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i4) {
            super(2);
            this.f6176c = i4;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-824725566, i4, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:77)");
            }
            k kVar = p.this.intervalContent;
            int i5 = this.f6176c;
            p pVar = p.this;
            c.a<j> aVar = kVar.x().get(i5);
            aVar.c().a().i(pVar.getItemScope(), Integer.valueOf(i5 - aVar.getStartIndex()), tVar, 0);
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

    /* compiled from: LazyListItemProvider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6178c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f6179d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6180e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i4, Object obj, int i5) {
            super(2);
            this.f6178c = i4;
            this.f6179d = obj;
            this.f6180e = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            p.this.i(this.f6178c, this.f6179d, tVar, g3.b(this.f6180e | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    public p(@fg.l c0 c0Var, @fg.l k kVar, @fg.l c cVar, @fg.l androidx.compose.foundation.lazy.layout.v vVar) {
        this.state = c0Var;
        this.intervalContent = kVar;
        this.itemScope = cVar;
        this.keyIndexMap = vVar;
    }

    @Override // androidx.compose.foundation.lazy.o
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
        if (other instanceof p) {
            return l0.g(this.intervalContent, ((p) other).intervalContent);
        }
        return false;
    }

    @Override // androidx.compose.foundation.lazy.o
    @fg.l
    /* renamed from: f, reason: from getter */
    public c getItemScope() {
        return this.itemScope;
    }

    @Override // androidx.compose.foundation.lazy.o
    @fg.l
    public List<Integer> h() {
        return this.intervalContent.B();
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }

    @Override // androidx.compose.foundation.lazy.layout.s
    @androidx.compose.runtime.i
    public void i(int i4, @fg.l Object obj, @fg.m androidx.compose.runtime.t tVar, int i5) {
        androidx.compose.runtime.t o4 = tVar.o(-462424778);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-462424778, i5, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:75)");
        }
        androidx.compose.foundation.lazy.layout.b0.a(obj, i4, this.state.getPinnedItems(), androidx.compose.runtime.internal.c.b(o4, -824725566, true, new a(i4)), o4, ((i5 << 3) & 112) | 3592);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new b(i4, obj, i5));
        }
    }
}

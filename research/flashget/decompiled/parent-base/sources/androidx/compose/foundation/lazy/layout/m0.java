package androidx.compose.foundation.lazy.layout;

import androidx.collection.g2;
import androidx.collection.n2;
import androidx.collection.o2;
import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.foundation.lazy.layout.p;
import androidx.compose.foundation.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LazyLayoutKeyIndexMap.kt */
@z0
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/lazy/layout/m0;", "Landroidx/compose/foundation/lazy/layout/v;", "Lkotlin/ranges/l;", "nearestRange", "Landroidx/compose/foundation/lazy/layout/p;", "intervalContent", "<init>", "(Lkotlin/ranges/l;Landroidx/compose/foundation/lazy/layout/p;)V", "", "key", "", "c", "(Ljava/lang/Object;)I", "index", "d", "(I)Ljava/lang/Object;", "Landroidx/collection/n2;", "b", "Landroidx/collection/n2;", "map", "", "[Ljava/lang/Object;", "keys", "I", "keysStartIndex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nLazyLayoutKeyIndexMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutKeyIndexMap.kt\nandroidx/compose/foundation/lazy/layout/NearestRangeKeyIndexMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 4 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n*L\n1#1,103:1\n1#2:104\n26#3:105\n360#4,5:106\n*S KotlinDebug\n*F\n+ 1 LazyLayoutKeyIndexMap.kt\nandroidx/compose/foundation/lazy/layout/NearestRangeKeyIndexMap\n*L\n73#1:105\n98#1:106,5\n*E\n"})
/* loaded from: classes.dex */
public final class m0 implements v {

    /* renamed from: e, reason: collision with root package name */
    public static final int f6101e = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n2<Object> map;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object[] keys;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int keysStartIndex;

    /* compiled from: LazyLayoutKeyIndexMap.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/layout/c$a;", "Landroidx/compose/foundation/lazy/layout/p$a;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/lazy/layout/c$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<c.a<? extends p.a>, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6105b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6106c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ g2<Object> f6107d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ m0 f6108e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i4, int i5, g2<Object> g2Var, m0 m0Var) {
            super(1);
            this.f6105b = i4;
            this.f6106c = i5;
            this.f6107d = g2Var;
            this.f6108e = m0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
        
            if (r3 == null) goto L7;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(@fg.l androidx.compose.foundation.lazy.layout.c.a<? extends androidx.compose.foundation.lazy.layout.p.a> r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r7.c()
                androidx.compose.foundation.lazy.layout.p$a r0 = (androidx.compose.foundation.lazy.layout.p.a) r0
                ld.l r0 = r0.getKey()
                int r1 = r6.f6105b
                int r2 = r7.getStartIndex()
                int r1 = java.lang.Math.max(r1, r2)
                int r2 = r6.f6106c
                int r3 = r7.getStartIndex()
                int r4 = r7.getSize()
                int r4 = r4 + r3
                int r4 = r4 + (-1)
                int r2 = java.lang.Math.min(r2, r4)
                if (r1 > r2) goto L58
            L27:
                if (r0 == 0) goto L39
                int r3 = r7.getStartIndex()
                int r3 = r1 - r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r3 = r0.invoke(r3)
                if (r3 != 0) goto L3e
            L39:
                androidx.compose.foundation.lazy.layout.DefaultLazyKey r3 = new androidx.compose.foundation.lazy.layout.DefaultLazyKey
                r3.<init>(r1)
            L3e:
                androidx.collection.g2<java.lang.Object> r4 = r6.f6107d
                r4.l0(r3, r1)
                androidx.compose.foundation.lazy.layout.m0 r4 = r6.f6108e
                java.lang.Object[] r4 = androidx.compose.foundation.lazy.layout.m0.a(r4)
                androidx.compose.foundation.lazy.layout.m0 r5 = r6.f6108e
                int r5 = androidx.compose.foundation.lazy.layout.m0.b(r5)
                int r5 = r1 - r5
                r4[r5] = r3
                if (r1 == r2) goto L58
                int r1 = r1 + 1
                goto L27
            L58:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.m0.a.a(androidx.compose.foundation.lazy.layout.c$a):void");
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(c.a<? extends p.a> aVar) {
            a(aVar);
            return k2.f75408a;
        }
    }

    public m0(@fg.l kotlin.ranges.l lVar, @fg.l p<?> pVar) {
        c<?> x4 = pVar.x();
        int first = lVar.getFirst();
        if (first < 0) {
            throw new IllegalStateException("negative nearestRange.first");
        }
        int min = Math.min(lVar.getLast(), x4.getSize() - 1);
        if (min < first) {
            this.map = o2.a();
            this.keys = new Object[0];
            this.keysStartIndex = 0;
        } else {
            int i4 = (min - first) + 1;
            this.keys = new Object[i4];
            this.keysStartIndex = first;
            g2 g2Var = new g2(i4);
            x4.a(first, min, new a(first, min, g2Var, this));
            this.map = g2Var;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.v
    public int c(@fg.l Object key) {
        n2<Object> n2Var = this.map;
        int i4 = n2Var.i(key);
        if (i4 >= 0) {
            return n2Var.values[i4];
        }
        return -1;
    }

    @Override // androidx.compose.foundation.lazy.layout.v
    @fg.m
    public Object d(int index) {
        Object[] objArr = this.keys;
        int i4 = index - this.keysStartIndex;
        if (i4 < 0 || i4 > kotlin.collections.l.we(objArr)) {
            return null;
        }
        return objArr[i4];
    }
}

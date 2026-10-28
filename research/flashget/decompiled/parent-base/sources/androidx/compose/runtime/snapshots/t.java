package androidx.compose.runtime.snapshots;

import androidx.compose.foundation.layout.f3;
import androidx.compose.runtime.m1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: SnapshotIdSet.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B+\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0014J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001d\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b0\u001aH\u0086\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, d2 = {"Landroidx/compose/runtime/snapshots/t;", "", "", "", "upperSet", "lowerSet", "lowerBound", "", "belowBound", "<init>", "(JJI[I)V", "bit", "", "q", "(I)Z", "v", "(I)Landroidx/compose/runtime/snapshots/t;", "m", "bits", "l", "(Landroidx/compose/runtime/snapshots/t;)Landroidx/compose/runtime/snapshots/t;", "j", "s", "", "iterator", "()Ljava/util/Iterator;", "Lkotlin/Function1;", "Lkotlin/k2;", "block", "p", "(Lld/l;)V", "default", "r", "(I)I", "", "toString", "()Ljava/lang/String;", "b", "J", "c", "d", "I", "e", "[I", "f", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@m1
@r1({"SMAP\nSnapshotIdSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,397:1\n13600#2,2:398\n1789#3,3:400\n1789#3,3:403\n1789#3,3:406\n1789#3,3:409\n1789#3,3:412\n1549#3:415\n1620#3,3:416\n*S KotlinDebug\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n*L\n107#1:398,2\n236#1:400,3\n257#1:403,3\n261#1:406,3\n283#1:409,3\n286#1:412,3\n343#1:415\n343#1:416,3\n*E\n"})
/* loaded from: classes.dex */
public final class t implements Iterable<Integer>, md.a {

    /* renamed from: g, reason: collision with root package name */
    public static final int f17145g = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long upperSet;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long lowerSet;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int lowerBound;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final int[] belowBound;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final t f17146h = new t(0, 0, 0, null);

    /* compiled from: SnapshotIdSet.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/snapshots/t$a;", "", "<init>", "()V", "Landroidx/compose/runtime/snapshots/t;", "EMPTY", "Landroidx/compose/runtime/snapshots/t;", "a", "()Landroidx/compose/runtime/snapshots/t;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.snapshots.t$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final t a() {
            return t.f17146h;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: SnapshotIdSet.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", i = {0, 0, 1, 1, 2, 2}, l = {295, 300, 307}, m = "invokeSuspend", n = {"$this$sequence", "belowBound", "$this$sequence", "index", "$this$sequence", "index"}, s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/o;", "", "Lkotlin/k2;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.k implements ld.p<kotlin.sequences.o<? super Integer>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: c, reason: collision with root package name */
        Object f17151c;

        /* renamed from: d, reason: collision with root package name */
        int f17152d;

        /* renamed from: e, reason: collision with root package name */
        int f17153e;

        /* renamed from: f, reason: collision with root package name */
        int f17154f;

        /* renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f17155g;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlin.sequences.o<? super Integer> oVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((b) create(oVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = t.this.new b(dVar);
            bVar.f17155g = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00eb -> B:7:0x00ec). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00ee -> B:8:0x00ef). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0092 -> B:23:0x00af). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ac -> B:23:0x00af). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0071 -> B:35:0x0074). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 244
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.t.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private t(long j4, long j5, int i4, int[] iArr) {
        this.upperSet = j4;
        this.lowerSet = j5;
        this.lowerBound = i4;
        this.belowBound = iArr;
    }

    @Override // java.lang.Iterable
    @fg.l
    public Iterator<Integer> iterator() {
        return kotlin.sequences.p.b(new b(null)).iterator();
    }

    @fg.l
    public final t j(@fg.l t bits) {
        t tVar = f17146h;
        if (kotlin.jvm.internal.l0.g(bits, tVar)) {
            return tVar;
        }
        if (kotlin.jvm.internal.l0.g(this, tVar)) {
            return tVar;
        }
        int i4 = bits.lowerBound;
        int i5 = this.lowerBound;
        if (i4 == i5) {
            int[] iArr = bits.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                long j4 = this.upperSet;
                long j5 = bits.upperSet;
                long j6 = j4 & j5;
                long j7 = this.lowerSet;
                long j10 = bits.lowerSet;
                return (j6 == 0 && (j7 & j10) == 0 && iArr2 == null) ? tVar : new t(j5 & j4, j7 & j10, i5, iArr2);
            }
        }
        if (this.belowBound == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (bits.q(intValue)) {
                    tVar = tVar.v(intValue);
                }
            }
            return tVar;
        }
        Iterator<Integer> it2 = bits.iterator();
        while (it2.hasNext()) {
            int intValue2 = it2.next().intValue();
            if (q(intValue2)) {
                tVar = tVar.v(intValue2);
            }
        }
        return tVar;
    }

    @fg.l
    public final t l(@fg.l t bits) {
        t tVar = f17146h;
        if (bits == tVar) {
            return this;
        }
        if (this == tVar) {
            return tVar;
        }
        int i4 = bits.lowerBound;
        int i5 = this.lowerBound;
        if (i4 == i5) {
            int[] iArr = bits.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                return new t(this.upperSet & (~bits.upperSet), this.lowerSet & (~bits.lowerSet), i5, iArr2);
            }
        }
        Iterator<Integer> it = bits.iterator();
        t tVar2 = this;
        while (it.hasNext()) {
            tVar2 = tVar2.m(it.next().intValue());
        }
        return tVar2;
    }

    @fg.l
    public final t m(int bit) {
        int[] iArr;
        int b5;
        int i4 = this.lowerBound;
        int i5 = bit - i4;
        if (i5 >= 0 && i5 < 64) {
            long j4 = 1 << i5;
            long j5 = this.lowerSet;
            if ((j5 & j4) != 0) {
                return new t(this.upperSet, j5 & (~j4), i4, this.belowBound);
            }
        } else if (i5 >= 64 && i5 < 128) {
            long j6 = 1 << (i5 - 64);
            long j7 = this.upperSet;
            if ((j7 & j6) != 0) {
                return new t(j7 & (~j6), this.lowerSet, i4, this.belowBound);
            }
        } else if (i5 < 0 && (iArr = this.belowBound) != null && (b5 = u.b(iArr, bit)) >= 0) {
            int length = iArr.length;
            int i6 = length - 1;
            if (i6 == 0) {
                return new t(this.upperSet, this.lowerSet, this.lowerBound, null);
            }
            int[] iArr2 = new int[i6];
            if (b5 > 0) {
                kotlin.collections.l.z0(iArr, iArr2, 0, 0, b5);
            }
            if (b5 < i6) {
                kotlin.collections.l.z0(iArr, iArr2, b5, b5 + 1, length);
            }
            return new t(this.upperSet, this.lowerSet, this.lowerBound, iArr2);
        }
        return this;
    }

    public final void p(@fg.l ld.l<? super Integer, k2> block) {
        int[] iArr = this.belowBound;
        if (iArr != null) {
            for (int i4 : iArr) {
                block.invoke(Integer.valueOf(i4));
            }
        }
        if (this.lowerSet != 0) {
            for (int i5 = 0; i5 < 64; i5++) {
                if ((this.lowerSet & (1 << i5)) != 0) {
                    androidx.collection.j.a(i5, this.lowerBound, block);
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i6 = 0; i6 < 64; i6++) {
                if ((this.upperSet & (1 << i6)) != 0) {
                    androidx.collection.j.a(i6 + 64, this.lowerBound, block);
                }
            }
        }
    }

    public final boolean q(int bit) {
        int[] iArr;
        int i4 = bit - this.lowerBound;
        if (i4 >= 0 && i4 < 64) {
            return ((1 << i4) & this.lowerSet) != 0;
        }
        if (i4 >= 64 && i4 < 128) {
            return ((1 << (i4 - 64)) & this.upperSet) != 0;
        }
        if (i4 <= 0 && (iArr = this.belowBound) != null) {
            return u.b(iArr, bit) >= 0;
        }
        return false;
    }

    public final int r(int r6) {
        int i4;
        int c5;
        int[] iArr = this.belowBound;
        if (iArr != null) {
            return iArr[0];
        }
        long j4 = this.lowerSet;
        if (j4 != 0) {
            i4 = this.lowerBound;
            c5 = u.c(j4);
        } else {
            long j5 = this.upperSet;
            if (j5 == 0) {
                return r6;
            }
            i4 = this.lowerBound + 64;
            c5 = u.c(j5);
        }
        return c5 + i4;
    }

    @fg.l
    public final t s(@fg.l t bits) {
        t tVar = f17146h;
        if (bits == tVar) {
            return this;
        }
        if (this == tVar) {
            return bits;
        }
        int i4 = bits.lowerBound;
        int i5 = this.lowerBound;
        if (i4 == i5) {
            int[] iArr = bits.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                return new t(this.upperSet | bits.upperSet, this.lowerSet | bits.lowerSet, i5, iArr2);
            }
        }
        if (this.belowBound == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                bits = bits.v(it.next().intValue());
            }
            return bits;
        }
        Iterator<Integer> it2 = bits.iterator();
        t tVar2 = this;
        while (it2.hasNext()) {
            tVar2 = tVar2.v(it2.next().intValue());
        }
        return tVar2;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(this, 10));
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        return f3.a(sb, d.k(arrayList, null, null, null, 0, null, null, 63, null), ']');
    }

    @fg.l
    public final t v(int bit) {
        int i4;
        int[] iArr;
        int i5 = this.lowerBound;
        int i6 = bit - i5;
        long j4 = 0;
        if (i6 >= 0 && i6 < 64) {
            long j5 = 1 << i6;
            long j6 = this.lowerSet;
            if ((j6 & j5) == 0) {
                return new t(this.upperSet, j6 | j5, i5, this.belowBound);
            }
        } else if (i6 >= 64 && i6 < 128) {
            long j7 = 1 << (i6 - 64);
            long j10 = this.upperSet;
            if ((j10 & j7) == 0) {
                return new t(j10 | j7, this.lowerSet, i5, this.belowBound);
            }
        } else if (i6 < 128) {
            int[] iArr2 = this.belowBound;
            if (iArr2 == null) {
                return new t(this.upperSet, this.lowerSet, i5, new int[]{bit});
            }
            int b5 = u.b(iArr2, bit);
            if (b5 < 0) {
                int i7 = -(b5 + 1);
                int length = iArr2.length;
                int[] iArr3 = new int[length + 1];
                kotlin.collections.l.z0(iArr2, iArr3, 0, 0, i7);
                kotlin.collections.l.z0(iArr2, iArr3, i7 + 1, i7, length);
                iArr3[i7] = bit;
                return new t(this.upperSet, this.lowerSet, this.lowerBound, iArr3);
            }
        } else if (!q(bit)) {
            long j11 = this.upperSet;
            long j12 = this.lowerSet;
            int i10 = this.lowerBound;
            int i11 = ((bit + 1) / 64) * 64;
            ArrayList arrayList = null;
            long j13 = j12;
            long j14 = j11;
            while (true) {
                if (i10 >= i11) {
                    i4 = i10;
                    break;
                }
                if (j13 != j4) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        int[] iArr4 = this.belowBound;
                        if (iArr4 != null) {
                            for (int i12 : iArr4) {
                                arrayList.add(Integer.valueOf(i12));
                            }
                        }
                    }
                    for (int i13 = 0; i13 < 64; i13++) {
                        if (((1 << i13) & j13) != 0) {
                            arrayList.add(Integer.valueOf(i13 + i10));
                        }
                    }
                    j4 = 0;
                }
                if (j14 == j4) {
                    i4 = i11;
                    j13 = j4;
                    break;
                }
                i10 += 64;
                j13 = j14;
                j14 = j4;
            }
            if (arrayList == null || (iArr = kotlin.collections.w.U5(arrayList)) == null) {
                iArr = this.belowBound;
            }
            return new t(j14, j13, i4, iArr).v(bit);
        }
        return this;
    }
}

package androidx.compose.foundation.lazy.layout;

import androidx.collection.m1;
import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.foundation.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: IntervalList.kt */
@z0
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0018\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\u000b0\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\tR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR$\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/foundation/lazy/layout/l0;", "T", "Landroidx/compose/foundation/lazy/layout/c;", "<init>", "()V", "", "itemIndex", "Landroidx/compose/foundation/lazy/layout/c$a;", "f", "(I)Landroidx/compose/foundation/lazy/layout/c$a;", "index", "Lkotlin/k2;", "d", "(I)V", "", "e", "(Landroidx/compose/foundation/lazy/layout/c$a;I)Z", "size", "value", "c", "(ILjava/lang/Object;)V", "fromIndex", "toIndex", "Lkotlin/Function1;", "block", "a", "(IILld/l;)V", "get", "Landroidx/compose/runtime/collection/g;", "Landroidx/compose/runtime/collection/g;", "intervals", "<set-?>", "b", "I", "getSize", "()I", "Landroidx/compose/foundation/lazy/layout/c$a;", "lastInterval", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,222:1\n1208#2:223\n1187#2,2:224\n523#3:226\n523#3:227\n523#3:228\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n*L\n104#1:223\n104#1:224,2\n156#1:226\n158#1:227\n175#1:228\n*E\n"})
/* loaded from: classes.dex */
public final class l0<T> implements c<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f6097d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<c.a<T>> intervals = new androidx.compose.runtime.collection.g<>(new c.a[16], 0);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private c.a<? extends T> lastInterval;

    private final void d(int index) {
        if (index < 0 || index >= this.size) {
            StringBuilder a5 = androidx.collection.s.a("Index ", index, ", size ");
            a5.append(this.size);
            throw new IndexOutOfBoundsException(a5.toString());
        }
    }

    private final boolean e(c.a<? extends T> aVar, int i4) {
        return i4 < aVar.getSize() + aVar.getStartIndex() && aVar.getStartIndex() <= i4;
    }

    private final c.a<T> f(int itemIndex) {
        int b5;
        c.a<? extends T> aVar = this.lastInterval;
        if (aVar != null && e(aVar, itemIndex)) {
            return aVar;
        }
        androidx.compose.runtime.collection.g<c.a<T>> gVar = this.intervals;
        b5 = d.b(gVar, itemIndex);
        c.a aVar2 = (c.a<? extends T>) gVar.L()[b5];
        this.lastInterval = aVar2;
        return aVar2;
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    public void a(int fromIndex, int toIndex, @fg.l ld.l<? super c.a<? extends T>, k2> block) {
        int b5;
        d(fromIndex);
        d(toIndex);
        if (toIndex < fromIndex) {
            throw new IllegalArgumentException(m1.a("toIndex (", toIndex, ") should be not smaller than fromIndex (", fromIndex, ')').toString());
        }
        b5 = d.b(this.intervals, fromIndex);
        int startIndex = this.intervals.L()[b5].getStartIndex();
        while (startIndex <= toIndex) {
            c.a<T> aVar = this.intervals.L()[b5];
            block.invoke(aVar);
            startIndex += aVar.getSize();
            b5++;
        }
    }

    public final void c(int size, T value) {
        if (size < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("size should be >=0, but was ", size).toString());
        }
        if (size == 0) {
            return;
        }
        c.a<T> aVar = new c.a<>(this.size, size, value);
        this.size += size;
        this.intervals.b(aVar);
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    @fg.l
    public c.a<T> get(int index) {
        d(index);
        return f(index);
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    public int getSize() {
        return this.size;
    }
}

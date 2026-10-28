package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyLayoutBeyondBoundsInfo.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/lazy/layout/k;", "", "<init>", "()V", "", "start", "end", "Landroidx/compose/foundation/lazy/layout/k$a;", "a", "(II)Landroidx/compose/foundation/lazy/layout/k$a;", "interval", "Lkotlin/k2;", "e", "(Landroidx/compose/foundation/lazy/layout/k$a;)V", "", "d", "()Z", "Landroidx/compose/runtime/collection/g;", "Landroidx/compose/runtime/collection/g;", "beyondBoundsItems", "c", "()I", "b", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nLazyLayoutBeyondBoundsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1208#2:127\n1187#2,2:128\n460#3,11:130\n460#3,11:142\n1#4:141\n*S KotlinDebug\n*F\n+ 1 LazyLayoutBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo\n*L\n51#1:127\n51#1:128,2\n87#1:130,11\n102#1:142,11\n*E\n"})
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final int f6079b = androidx.compose.runtime.collection.g.f16132e;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<a> beyondBoundsItems = new androidx.compose.runtime.collection.g<>(new a[16], 0);

    /* compiled from: LazyLayoutBeyondBoundsInfo.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/lazy/layout/k$a;", "", "", "start", "end", "<init>", "(II)V", "a", "()I", "b", "c", "(II)Landroidx/compose/foundation/lazy/layout/k$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "f", "e", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nLazyLayoutBeyondBoundsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
    public static final /* data */ class a {

        /* renamed from: c, reason: collision with root package name */
        public static final int f6081c = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int start;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int end;

        public a(int i4, int i5) {
            this.start = i4;
            this.end = i5;
            if (i4 < 0) {
                throw new IllegalArgumentException("negative start index");
            }
            if (i5 < i4) {
                throw new IllegalArgumentException("end index greater than start");
            }
        }

        public static a d(a aVar, int i4, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i4 = aVar.start;
            }
            if ((i6 & 2) != 0) {
                i5 = aVar.end;
            }
            aVar.getClass();
            return new a(i4, i5);
        }

        /* renamed from: a, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* renamed from: b, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        @fg.l
        public final a c(int start, int end) {
            return new a(start, end);
        }

        public final int e() {
            return this.end;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.start == aVar.start && this.end == aVar.end;
        }

        public final int f() {
            return this.start;
        }

        public int hashCode() {
            return Integer.hashCode(this.end) + (Integer.hashCode(this.start) * 31);
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("Interval(start=");
            sb.append(this.start);
            sb.append(", end=");
            return androidx.view.e.a(sb, this.end, ')');
        }
    }

    @fg.l
    public final a a(int start, int end) {
        a aVar = new a(start, end);
        this.beyondBoundsItems.b(aVar);
        return aVar;
    }

    public final int b() {
        int e4 = this.beyondBoundsItems.u().e();
        androidx.compose.runtime.collection.g<a> gVar = this.beyondBoundsItems;
        int size = gVar.getSize();
        if (size > 0) {
            a[] L = gVar.L();
            int i4 = 0;
            do {
                a aVar = L[i4];
                if (aVar.e() > e4) {
                    e4 = aVar.e();
                }
                i4++;
            } while (i4 < size);
        }
        return e4;
    }

    public final int c() {
        int f4 = this.beyondBoundsItems.u().f();
        androidx.compose.runtime.collection.g<a> gVar = this.beyondBoundsItems;
        int size = gVar.getSize();
        if (size > 0) {
            a[] L = gVar.L();
            int i4 = 0;
            do {
                a aVar = L[i4];
                if (aVar.f() < f4) {
                    f4 = aVar.f();
                }
                i4++;
            } while (i4 < size);
        }
        if (f4 >= 0) {
            return f4;
        }
        throw new IllegalArgumentException("negative minIndex");
    }

    public final boolean d() {
        return this.beyondBoundsItems.V();
    }

    public final void e(@fg.l a interval) {
        this.beyondBoundsItems.j0(interval);
    }
}

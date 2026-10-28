package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: IntervalList.kt */
@z0
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\rJ\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0004\u001a\u00020\u0003H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J=\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u000b0\nH&¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0001\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/c;", "T", "", "", "index", "Landroidx/compose/foundation/lazy/layout/c$a;", "get", "(I)Landroidx/compose/foundation/lazy/layout/c$a;", "fromIndex", "toIndex", "Lkotlin/Function1;", "Lkotlin/k2;", "block", "a", "(IILld/l;)V", "getSize", "()I", "size", "Landroidx/compose/foundation/lazy/layout/l0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface c<T> {

    /* compiled from: IntervalList.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B!\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0006\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/lazy/layout/c$a;", "T", "", "", "startIndex", "size", "value", "<init>", "(IILjava/lang/Object;)V", "a", "I", "b", "()I", "c", "Ljava/lang/Object;", "()Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalList$Interval\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n1#2:223\n*E\n"})
    public static final class a<T> {

        /* renamed from: d, reason: collision with root package name */
        public static final int f5934d = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int startIndex;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int size;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final T value;

        public a(int i4, int i5, T t4) {
            this.startIndex = i4;
            this.size = i5;
            this.value = t4;
            if (i4 < 0) {
                throw new IllegalArgumentException(android.support.v4.media.a.a("startIndex should be >= 0, but was ", i4).toString());
            }
            if (i5 <= 0) {
                throw new IllegalArgumentException(android.support.v4.media.a.a("size should be >0, but was ", i5).toString());
            }
        }

        /* renamed from: a, reason: from getter */
        public final int getSize() {
            return this.size;
        }

        /* renamed from: b, reason: from getter */
        public final int getStartIndex() {
            return this.startIndex;
        }

        public final T c() {
            return this.value;
        }
    }

    static /* synthetic */ void b(c cVar, int i4, int i5, ld.l lVar, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forEach");
        }
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = cVar.getSize() - 1;
        }
        cVar.a(i4, i5, lVar);
    }

    void a(int fromIndex, int toIndex, @fg.l ld.l<? super a<? extends T>, k2> block);

    @fg.l
    a<T> get(int index);

    int getSize();
}

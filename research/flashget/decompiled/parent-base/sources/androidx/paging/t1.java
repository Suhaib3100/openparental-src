package androidx.paging;

import androidx.compose.ui.graphics.k6;
import androidx.compose.ui.graphics.l6;
import androidx.paging.w1;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;

/* compiled from: TransformablePage.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\b\u0018\u0000 !*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001'B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bB\u001f\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\n\u0010\rJ5\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJL\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010*\u001a\u0004\b+\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010,\u001a\u0004\b-\u0010\u001bR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u0010*\u001a\u0004\b.\u0010\u001f¨\u0006/"}, d2 = {"Landroidx/paging/t1;", "", "T", "", "originalPageOffsets", "", "data", "", "hintOriginalPageOffset", "hintOriginalIndices", "<init>", "([ILjava/util/List;ILjava/util/List;)V", "originalPageOffset", "(ILjava/util/List;)V", "index", "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "Landroidx/paging/w1$a;", "l", "(IIIII)Landroidx/paging/w1$a;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "()[I", "c", "()Ljava/util/List;", "d", "e", "f", "([ILjava/util/List;ILjava/util/List;)Landroidx/paging/t1;", "", "toString", "()Ljava/lang/String;", "a", "[I", "k", "Ljava/util/List;", "h", "I", "j", "i", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class t1<T> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final t1<Object> f32385f = new t1<>(0, kotlin.collections.j0.f74919b);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final int[] originalPageOffsets;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<T> data;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int hintOriginalPageOffset;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final List<Integer> hintOriginalIndices;

    /* compiled from: TransformablePage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0001\u0010\u0004*\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/paging/t1$a;", "", "<init>", "()V", "T", "Landroidx/paging/t1;", "a", "()Landroidx/paging/t1;", "EMPTY_INITIAL_PAGE", "Landroidx/paging/t1;", "b", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: androidx.paging.t1$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final <T> t1<T> a() {
            return t1.f32385f;
        }

        @fg.l
        public final t1<Object> b() {
            return t1.f32385f;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t1(@fg.l int[] originalPageOffsets, @fg.l List<? extends T> data, int i4, @fg.m List<Integer> list) {
        kotlin.jvm.internal.l0.p(originalPageOffsets, "originalPageOffsets");
        kotlin.jvm.internal.l0.p(data, "data");
        this.originalPageOffsets = originalPageOffsets;
        this.data = data;
        this.hintOriginalPageOffset = i4;
        this.hintOriginalIndices = list;
        if (originalPageOffsets.length == 0) {
            throw new IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage");
        }
        if (list == null || list.size() == data.size()) {
            return;
        }
        StringBuilder sb = new StringBuilder("If originalIndices (size = ");
        kotlin.jvm.internal.l0.m(list);
        sb.append(list.size());
        sb.append(") is provided, it must be same length as data (size = ");
        sb.append(data.size());
        sb.append(')');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ t1 g(t1 t1Var, int[] iArr, List list, int i4, List list2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            iArr = t1Var.originalPageOffsets;
        }
        if ((i5 & 2) != 0) {
            list = t1Var.data;
        }
        if ((i5 & 4) != 0) {
            i4 = t1Var.hintOriginalPageOffset;
        }
        if ((i5 & 8) != 0) {
            list2 = t1Var.hintOriginalIndices;
        }
        return t1Var.f(iArr, list, i4, list2);
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final int[] getOriginalPageOffsets() {
        return this.originalPageOffsets;
    }

    @fg.l
    public final List<T> c() {
        return this.data;
    }

    /* renamed from: d, reason: from getter */
    public final int getHintOriginalPageOffset() {
        return this.hintOriginalPageOffset;
    }

    @fg.m
    public final List<Integer> e() {
        return this.hintOriginalIndices;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.l0.g(t1.class, other == null ? null : other.getClass())) {
            return false;
        }
        if (other == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.paging.TransformablePage<*>");
        }
        t1 t1Var = (t1) other;
        return Arrays.equals(this.originalPageOffsets, t1Var.originalPageOffsets) && kotlin.jvm.internal.l0.g(this.data, t1Var.data) && this.hintOriginalPageOffset == t1Var.hintOriginalPageOffset && kotlin.jvm.internal.l0.g(this.hintOriginalIndices, t1Var.hintOriginalIndices);
    }

    @fg.l
    public final t1<T> f(@fg.l int[] originalPageOffsets, @fg.l List<? extends T> data, int hintOriginalPageOffset, @fg.m List<Integer> hintOriginalIndices) {
        kotlin.jvm.internal.l0.p(originalPageOffsets, "originalPageOffsets");
        kotlin.jvm.internal.l0.p(data, "data");
        return new t1<>(originalPageOffsets, data, hintOriginalPageOffset, hintOriginalIndices);
    }

    @fg.l
    public final List<T> h() {
        return this.data;
    }

    public int hashCode() {
        int a5 = (k6.a(this.data, Arrays.hashCode(this.originalPageOffsets) * 31, 31) + this.hintOriginalPageOffset) * 31;
        List<Integer> list = this.hintOriginalIndices;
        return a5 + (list == null ? 0 : list.hashCode());
    }

    @fg.m
    public final List<Integer> i() {
        return this.hintOriginalIndices;
    }

    public final int j() {
        return this.hintOriginalPageOffset;
    }

    @fg.l
    public final int[] k() {
        return this.originalPageOffsets;
    }

    @fg.l
    public final w1.a l(int index, int presentedItemsBefore, int presentedItemsAfter, int originalPageOffsetFirst, int originalPageOffsetLast) {
        kotlin.ranges.l I;
        int i4 = this.hintOriginalPageOffset;
        List<Integer> list = this.hintOriginalIndices;
        if (list != null && (I = kotlin.collections.w.I(list)) != null && I.r(index)) {
            index = this.hintOriginalIndices.get(index).intValue();
        }
        return new w1.a(i4, index, presentedItemsBefore, presentedItemsAfter, originalPageOffsetFirst, originalPageOffsetLast);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("TransformablePage(originalPageOffsets=");
        sb.append(Arrays.toString(this.originalPageOffsets));
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", hintOriginalPageOffset=");
        sb.append(this.hintOriginalPageOffset);
        sb.append(", hintOriginalIndices=");
        return l6.a(sb, this.hintOriginalIndices, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t1(int i4, @fg.l List<? extends T> data) {
        this(new int[]{i4}, data, i4, null);
        kotlin.jvm.internal.l0.p(data, "data");
    }
}

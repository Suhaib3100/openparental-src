package androidx.paging;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ViewportHint.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0013\u0016B)\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u0012\u0082\u0001\u0002\u0018\u0019¨\u0006\u001a"}, d2 = {"Landroidx/paging/w1;", "", "", "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "<init>", "(IIII)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/paging/g0;", "loadType", "e", "(Landroidx/paging/g0;)I", "hashCode", "()I", "a", "I", "d", "b", "c", "Landroidx/paging/w1$b;", "Landroidx/paging/w1$a;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class w1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int presentedItemsBefore;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int presentedItemsAfter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int originalPageOffsetFirst;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int originalPageOffsetLast;

    /* compiled from: ViewportHint.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u0011¨\u0006\u0019"}, d2 = {"Landroidx/paging/w1$a;", "Landroidx/paging/w1;", "", "pageOffset", "indexInPage", "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "<init>", "(IIIIII)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "e", "I", "g", "f", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a extends w1 {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int pageOffset;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final int indexInPage;

        public a(int i4, int i5, int i6, int i7, int i10, int i11) {
            super(i6, i7, i10, i11, null);
            this.pageOffset = i4;
            this.indexInPage = i5;
        }

        @Override // androidx.paging.w1
        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.pageOffset == aVar.pageOffset && this.indexInPage == aVar.indexInPage && getPresentedItemsBefore() == aVar.getPresentedItemsBefore() && getPresentedItemsAfter() == aVar.getPresentedItemsAfter() && getOriginalPageOffsetFirst() == aVar.getOriginalPageOffsetFirst() && getOriginalPageOffsetLast() == aVar.getOriginalPageOffsetLast();
        }

        /* renamed from: f, reason: from getter */
        public final int getIndexInPage() {
            return this.indexInPage;
        }

        /* renamed from: g, reason: from getter */
        public final int getPageOffset() {
            return this.pageOffset;
        }

        @Override // androidx.paging.w1
        public int hashCode() {
            return Integer.hashCode(this.indexInPage) + Integer.hashCode(this.pageOffset) + super.hashCode();
        }

        @fg.l
        public String toString() {
            return kotlin.text.v.r("ViewportHint.Access(\n            |    pageOffset=" + this.pageOffset + ",\n            |    indexInPage=" + this.indexInPage + ",\n            |    presentedItemsBefore=" + getPresentedItemsBefore() + ",\n            |    presentedItemsAfter=" + getPresentedItemsAfter() + ",\n            |    originalPageOffsetFirst=" + getOriginalPageOffsetFirst() + ",\n            |    originalPageOffsetLast=" + getOriginalPageOffsetLast() + ",\n            |)", null, 1, null);
        }
    }

    /* compiled from: ViewportHint.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/paging/w1$b;", "Landroidx/paging/w1;", "", "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b extends w1 {
        public b(int i4, int i5, int i6, int i7) {
            super(i4, i5, i6, i7, null);
        }

        @fg.l
        public String toString() {
            return kotlin.text.v.r("ViewportHint.Initial(\n            |    presentedItemsBefore=" + getPresentedItemsBefore() + ",\n            |    presentedItemsAfter=" + getPresentedItemsAfter() + ",\n            |    originalPageOffsetFirst=" + getOriginalPageOffsetFirst() + ",\n            |    originalPageOffsetLast=" + getOriginalPageOffsetLast() + ",\n            |)", null, 1, null);
        }
    }

    /* compiled from: ViewportHint.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32431a;

        static {
            int[] iArr = new int[g0.values().length];
            iArr[g0.REFRESH.ordinal()] = 1;
            iArr[g0.PREPEND.ordinal()] = 2;
            iArr[g0.APPEND.ordinal()] = 3;
            f32431a = iArr;
        }
    }

    public /* synthetic */ w1(int i4, int i5, int i6, int i7, kotlin.jvm.internal.w wVar) {
        this(i4, i5, i6, i7);
    }

    /* renamed from: a, reason: from getter */
    public final int getOriginalPageOffsetFirst() {
        return this.originalPageOffsetFirst;
    }

    /* renamed from: b, reason: from getter */
    public final int getOriginalPageOffsetLast() {
        return this.originalPageOffsetLast;
    }

    /* renamed from: c, reason: from getter */
    public final int getPresentedItemsAfter() {
        return this.presentedItemsAfter;
    }

    /* renamed from: d, reason: from getter */
    public final int getPresentedItemsBefore() {
        return this.presentedItemsBefore;
    }

    public final int e(@fg.l g0 loadType) {
        kotlin.jvm.internal.l0.p(loadType, "loadType");
        int i4 = c.f32431a[loadType.ordinal()];
        if (i4 == 1) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        if (i4 == 2) {
            return this.presentedItemsBefore;
        }
        if (i4 == 3) {
            return this.presentedItemsAfter;
        }
        throw new NoWhenBranchMatchedException();
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) other;
        return this.presentedItemsBefore == w1Var.presentedItemsBefore && this.presentedItemsAfter == w1Var.presentedItemsAfter && this.originalPageOffsetFirst == w1Var.originalPageOffsetFirst && this.originalPageOffsetLast == w1Var.originalPageOffsetLast;
    }

    public int hashCode() {
        return Integer.hashCode(this.originalPageOffsetLast) + Integer.hashCode(this.originalPageOffsetFirst) + Integer.hashCode(this.presentedItemsAfter) + Integer.hashCode(this.presentedItemsBefore);
    }

    private w1(int i4, int i5, int i6, int i7) {
        this.presentedItemsBefore = i4;
        this.presentedItemsAfter = i5;
        this.originalPageOffsetFirst = i6;
        this.originalPageOffsetLast = i7;
    }
}

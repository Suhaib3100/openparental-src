package androidx.paging;

import kotlin.Metadata;

/* compiled from: PageFetcherSnapshot.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Landroidx/paging/t;", "", "", "generationId", "Landroidx/paging/w1;", "hint", "<init>", "(ILandroidx/paging/w1;)V", "a", "()I", "b", "()Landroidx/paging/w1;", "c", "(ILandroidx/paging/w1;)Landroidx/paging/t;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "e", "Landroidx/paging/w1;", "f", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
@androidx.annotation.m1
/* loaded from: classes3.dex */
public final /* data */ class t {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int generationId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final w1 hint;

    public t(int i4, @fg.l w1 hint) {
        kotlin.jvm.internal.l0.p(hint, "hint");
        this.generationId = i4;
        this.hint = hint;
    }

    public static /* synthetic */ t d(t tVar, int i4, w1 w1Var, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = tVar.generationId;
        }
        if ((i5 & 2) != 0) {
            w1Var = tVar.hint;
        }
        return tVar.c(i4, w1Var);
    }

    /* renamed from: a, reason: from getter */
    public final int getGenerationId() {
        return this.generationId;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final w1 getHint() {
        return this.hint;
    }

    @fg.l
    public final t c(int generationId, @fg.l w1 hint) {
        kotlin.jvm.internal.l0.p(hint, "hint");
        return new t(generationId, hint);
    }

    public final int e() {
        return this.generationId;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof t)) {
            return false;
        }
        t tVar = (t) other;
        return this.generationId == tVar.generationId && kotlin.jvm.internal.l0.g(this.hint, tVar.hint);
    }

    @fg.l
    public final w1 f() {
        return this.hint;
    }

    public int hashCode() {
        return this.hint.hashCode() + (Integer.hashCode(this.generationId) * 31);
    }

    @fg.l
    public String toString() {
        return "GenerationalViewportHint(generationId=" + this.generationId + ", hint=" + this.hint + ')';
    }
}

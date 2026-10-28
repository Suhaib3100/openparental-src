package kotlin.text;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: Regex.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lkotlin/text/m;", "", "", "value", "Lkotlin/ranges/l;", "range", "<init>", "(Ljava/lang/String;Lkotlin/ranges/l;)V", "a", "()Ljava/lang/String;", "b", "()Lkotlin/ranges/l;", "c", "(Ljava/lang/String;Lkotlin/ranges/l;)Lkotlin/text/m;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "Lkotlin/ranges/l;", "e", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String value;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.ranges.l range;

    public m(@fg.l String str, @fg.l kotlin.ranges.l lVar) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蓈\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("蓉\u0001"));
        this.value = str;
        this.range = lVar;
    }

    public static /* synthetic */ m d(m mVar, String str, kotlin.ranges.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = mVar.value;
        }
        if ((i4 & 2) != 0) {
            lVar = mVar.range;
        }
        return mVar.c(str, lVar);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final kotlin.ranges.l getRange() {
        return this.range;
    }

    @fg.l
    public final m c(@fg.l String value, @fg.l kotlin.ranges.l range) {
        kotlin.jvm.internal.l0.p(value, ProtectedSandApp.s("蓈\u0001"));
        kotlin.jvm.internal.l0.p(range, ProtectedSandApp.s("蓉\u0001"));
        return new m(value, range);
    }

    @fg.l
    public final kotlin.ranges.l e() {
        return this.range;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof m)) {
            return false;
        }
        m mVar = (m) other;
        return kotlin.jvm.internal.l0.g(this.value, mVar.value) && kotlin.jvm.internal.l0.g(this.range, mVar.range);
    }

    @fg.l
    public final String f() {
        return this.value;
    }

    public int hashCode() {
        return this.range.hashCode() + (this.value.hashCode() * 31);
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("蓊\u0001") + this.value + ProtectedSandApp.s("蓋\u0001") + this.range + ')';
    }
}

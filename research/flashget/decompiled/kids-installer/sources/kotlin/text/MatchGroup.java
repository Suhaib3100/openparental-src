package kotlin.text;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.ranges.IntRange;

/* compiled from: Regex.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lkotlin/text/MatchGroup;", "", "value", "", "range", "Lkotlin/ranges/IntRange;", "(Ljava/lang/String;Lkotlin/ranges/IntRange;)V", "getRange", "()Lkotlin/ranges/IntRange;", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.text.m, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final /* data */ class MatchGroup {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final String f27123a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final IntRange f27124b;

    public MatchGroup(@d5.d String str, @d5.d IntRange intRange) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("孔"));
        kotlin.jvm.internal.l0.p(intRange, ProtectedSandApp.s("孕"));
        this.f27123a = str;
        this.f27124b = intRange;
    }

    public static /* synthetic */ MatchGroup d(MatchGroup matchGroup, String str, IntRange intRange, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = matchGroup.f27123a;
        }
        if ((i5 & 2) != 0) {
            intRange = matchGroup.f27124b;
        }
        return matchGroup.c(str, intRange);
    }

    @d5.d
    /* renamed from: a, reason: from getter */
    public final String getF27123a() {
        return this.f27123a;
    }

    @d5.d
    /* renamed from: b, reason: from getter */
    public final IntRange getF27124b() {
        return this.f27124b;
    }

    @d5.d
    public final MatchGroup c(@d5.d String str, @d5.d IntRange intRange) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("孖"));
        kotlin.jvm.internal.l0.p(intRange, ProtectedSandApp.s("字"));
        return new MatchGroup(str, intRange);
    }

    @d5.d
    public final IntRange e() {
        return this.f27124b;
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchGroup)) {
            return false;
        }
        MatchGroup matchGroup = (MatchGroup) other;
        return kotlin.jvm.internal.l0.g(this.f27123a, matchGroup.f27123a) && kotlin.jvm.internal.l0.g(this.f27124b, matchGroup.f27124b);
    }

    @d5.d
    public final String f() {
        return this.f27123a;
    }

    public int hashCode() {
        return this.f27124b.hashCode() + (this.f27123a.hashCode() * 31);
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("存") + this.f27123a + ProtectedSandApp.s("孙") + this.f27124b + ')';
    }
}

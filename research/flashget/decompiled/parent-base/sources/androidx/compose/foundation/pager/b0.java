package androidx.compose.foundation.pager;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: Pager.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/pager/b0;", "Landroidx/compose/foundation/pager/a0;", "", "pagesLimit", "<init>", "(I)V", "startPage", "suggestedTargetPage", "", "velocity", "pageSize", "pageSpacing", "a", "(IIFII)I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerSnapDistanceMaxPages\n+ 2 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n*L\n1#1,967:1\n953#2,4:968\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerSnapDistanceMaxPages\n*L\n559#1:968,4\n*E\n"})
/* loaded from: classes.dex */
public final class b0 implements a0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f6693c = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int pagesLimit;

    public b0(int i4) {
        this.pagesLimit = i4;
    }

    @Override // androidx.compose.foundation.pager.a0
    public int a(int startPage, int suggestedTargetPage, float velocity, int pageSize, int pageSpacing) {
        int i4 = this.pagesLimit;
        return kotlin.ranges.s.I(suggestedTargetPage, startPage - i4, startPage + i4);
    }

    public boolean equals(@fg.m Object other) {
        return (other instanceof b0) && this.pagesLimit == ((b0) other).pagesLimit;
    }

    public int hashCode() {
        return Integer.hashCode(this.pagesLimit);
    }
}

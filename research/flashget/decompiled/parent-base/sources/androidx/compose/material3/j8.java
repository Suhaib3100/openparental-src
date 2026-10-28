package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: SearchBar.android.kt */
@f5
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/j8;", "", "Landroidx/compose/ui/graphics/d2;", "containerColor", "dividerColor", "Landroidx/compose/material3/pa;", "inputFieldColors", "<init>", "(JJLandroidx/compose/material3/pa;Lkotlin/jvm/internal/w;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "J", "()J", "b", "c", "Landroidx/compose/material3/pa;", "()Landroidx/compose/material3/pa;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j8 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f11910d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long dividerColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final pa inputFieldColors;

    public /* synthetic */ j8(long j4, long j5, pa paVar, kotlin.jvm.internal.w wVar) {
        this(j4, j5, paVar);
    }

    /* renamed from: a, reason: from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* renamed from: b, reason: from getter */
    public final long getDividerColor() {
        return this.dividerColor;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final pa getInputFieldColors() {
        return this.inputFieldColors;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.l0.g(j8.class, other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.l0.n(other, "null cannot be cast to non-null type androidx.compose.material3.SearchBarColors");
        j8 j8Var = (j8) other;
        return androidx.compose.ui.graphics.d2.y(this.containerColor, j8Var.containerColor) && kotlin.a2.o(this.dividerColor, j8Var.dividerColor) && kotlin.jvm.internal.l0.g(this.inputFieldColors, j8Var.inputFieldColors);
    }

    public int hashCode() {
        return this.inputFieldColors.hashCode() + m0.a(this.dividerColor, androidx.compose.ui.graphics.d2.K(this.containerColor) * 31, 31);
    }

    private j8(long j4, long j5, pa paVar) {
        this.containerColor = j4;
        this.dividerColor = j5;
        this.inputFieldColors = paVar;
    }
}

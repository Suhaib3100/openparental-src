package androidx.compose.material3;

import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;

/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJB\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/material3/mb;", "", "Landroidx/compose/ui/graphics/d2;", "containerColor", "scrolledContainerColor", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "<init>", "(JJJJJLkotlin/jvm/internal/w;)V", "b", "(JJJJJ)Landroidx/compose/material3/mb;", "", "colorTransitionFraction", "a", "(F)J", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "e", "()J", "g", "c", "f", "d", "h", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.x4
@f5
@kotlin.jvm.internal.r1({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2283:1\n658#2:2284\n646#2:2285\n658#2:2286\n646#2:2287\n658#2:2288\n646#2:2289\n658#2:2290\n646#2:2291\n658#2:2292\n646#2:2293\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarColors\n*L\n1198#1:2284\n1198#1:2285\n1199#1:2286\n1199#1:2287\n1200#1:2288\n1200#1:2289\n1201#1:2290\n1201#1:2291\n1202#1:2292\n1202#1:2293\n*E\n"})
/* loaded from: classes.dex */
public final class mb {

    /* renamed from: f, reason: collision with root package name */
    public static final int f12586f = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long scrolledContainerColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long navigationIconContentColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long titleContentColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long actionIconContentColor;

    public /* synthetic */ mb(long j4, long j5, long j6, long j7, long j10, kotlin.jvm.internal.w wVar) {
        this(j4, j5, j6, j7, j10);
    }

    @androidx.compose.runtime.x4
    public final long a(float colorTransitionFraction) {
        return androidx.compose.ui.graphics.f2.n(this.containerColor, this.scrolledContainerColor, androidx.compose.animation.core.m0.c().a(colorTransitionFraction));
    }

    @fg.l
    public final mb b(long containerColor, long scrolledContainerColor, long navigationIconContentColor, long titleContentColor, long actionIconContentColor) {
        d2.Companion companion = androidx.compose.ui.graphics.d2.INSTANCE;
        companion.getClass();
        long j4 = containerColor != androidx.compose.ui.graphics.d2.f17778o ? containerColor : this.containerColor;
        companion.getClass();
        long j5 = scrolledContainerColor != androidx.compose.ui.graphics.d2.f17778o ? scrolledContainerColor : this.scrolledContainerColor;
        companion.getClass();
        long j6 = navigationIconContentColor != androidx.compose.ui.graphics.d2.f17778o ? navigationIconContentColor : this.navigationIconContentColor;
        companion.getClass();
        long j7 = titleContentColor != androidx.compose.ui.graphics.d2.f17778o ? titleContentColor : this.titleContentColor;
        companion.getClass();
        return new mb(j4, j5, j6, j7, actionIconContentColor != androidx.compose.ui.graphics.d2.f17778o ? actionIconContentColor : this.actionIconContentColor);
    }

    /* renamed from: d, reason: from getter */
    public final long getActionIconContentColor() {
        return this.actionIconContentColor;
    }

    /* renamed from: e, reason: from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof mb)) {
            return false;
        }
        mb mbVar = (mb) other;
        return androidx.compose.ui.graphics.d2.y(this.containerColor, mbVar.containerColor) && kotlin.a2.o(this.scrolledContainerColor, mbVar.scrolledContainerColor) && kotlin.a2.o(this.navigationIconContentColor, mbVar.navigationIconContentColor) && kotlin.a2.o(this.titleContentColor, mbVar.titleContentColor) && kotlin.a2.o(this.actionIconContentColor, mbVar.actionIconContentColor);
    }

    /* renamed from: f, reason: from getter */
    public final long getNavigationIconContentColor() {
        return this.navigationIconContentColor;
    }

    /* renamed from: g, reason: from getter */
    public final long getScrolledContainerColor() {
        return this.scrolledContainerColor;
    }

    /* renamed from: h, reason: from getter */
    public final long getTitleContentColor() {
        return this.titleContentColor;
    }

    public int hashCode() {
        return kotlin.a2.u(this.actionIconContentColor) + m0.a(this.titleContentColor, m0.a(this.navigationIconContentColor, m0.a(this.scrolledContainerColor, androidx.compose.ui.graphics.d2.K(this.containerColor) * 31, 31), 31), 31);
    }

    private mb(long j4, long j5, long j6, long j7, long j10) {
        this.containerColor = j4;
        this.scrolledContainerColor = j5;
        this.navigationIconContentColor = j6;
        this.titleContentColor = j7;
        this.actionIconContentColor = j10;
    }
}

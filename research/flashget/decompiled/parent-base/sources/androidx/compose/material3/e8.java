package androidx.compose.material3;

import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;

/* compiled from: Tooltip.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ8\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/e8;", "", "Landroidx/compose/ui/graphics/d2;", "containerColor", "contentColor", "titleContentColor", "actionContentColor", "<init>", "(JJJJLkotlin/jvm/internal/w;)V", "a", "(JJJJ)Landroidx/compose/material3/e8;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "d", "()J", "b", "e", "c", "f", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.x4
@f5
@androidx.compose.runtime.m1
@kotlin.jvm.internal.r1({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/RichTooltipColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,719:1\n658#2:720\n646#2:721\n658#2:722\n646#2:723\n658#2:724\n646#2:725\n658#2:726\n646#2:727\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/RichTooltipColors\n*L\n466#1:720\n466#1:721\n467#1:722\n467#1:723\n468#1:724\n468#1:725\n469#1:726\n469#1:727\n*E\n"})
/* loaded from: classes.dex */
public final class e8 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f10661e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long contentColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long titleContentColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long actionContentColor;

    public /* synthetic */ e8(long j4, long j5, long j6, long j7, kotlin.jvm.internal.w wVar) {
        this(j4, j5, j6, j7);
    }

    @fg.l
    public final e8 a(long containerColor, long contentColor, long titleContentColor, long actionContentColor) {
        d2.Companion companion = androidx.compose.ui.graphics.d2.INSTANCE;
        companion.getClass();
        long j4 = containerColor != androidx.compose.ui.graphics.d2.f17778o ? containerColor : this.containerColor;
        companion.getClass();
        long j5 = contentColor != androidx.compose.ui.graphics.d2.f17778o ? contentColor : this.contentColor;
        companion.getClass();
        long j6 = titleContentColor != androidx.compose.ui.graphics.d2.f17778o ? titleContentColor : this.titleContentColor;
        companion.getClass();
        return new e8(j4, j5, j6, actionContentColor != androidx.compose.ui.graphics.d2.f17778o ? actionContentColor : this.actionContentColor);
    }

    /* renamed from: c, reason: from getter */
    public final long getActionContentColor() {
        return this.actionContentColor;
    }

    /* renamed from: d, reason: from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* renamed from: e, reason: from getter */
    public final long getContentColor() {
        return this.contentColor;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e8)) {
            return false;
        }
        e8 e8Var = (e8) other;
        return androidx.compose.ui.graphics.d2.y(this.containerColor, e8Var.containerColor) && kotlin.a2.o(this.contentColor, e8Var.contentColor) && kotlin.a2.o(this.titleContentColor, e8Var.titleContentColor) && kotlin.a2.o(this.actionContentColor, e8Var.actionContentColor);
    }

    /* renamed from: f, reason: from getter */
    public final long getTitleContentColor() {
        return this.titleContentColor;
    }

    public int hashCode() {
        return kotlin.a2.u(this.actionContentColor) + m0.a(this.titleContentColor, m0.a(this.contentColor, androidx.compose.ui.graphics.d2.K(this.containerColor) * 31, 31), 31);
    }

    private e8(long j4, long j5, long j6, long j7) {
        this.containerColor = j4;
        this.contentColor = j5;
        this.titleContentColor = j6;
        this.actionContentColor = j7;
    }
}

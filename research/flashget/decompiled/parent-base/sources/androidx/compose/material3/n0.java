package androidx.compose.material3;

import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;

/* compiled from: Button.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ8\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/n0;", "", "Landroidx/compose/ui/graphics/d2;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "<init>", "(JJJJLkotlin/jvm/internal/w;)V", "c", "(JJJJ)Landroidx/compose/material3/n0;", "", "enabled", "a", "(Z)J", "b", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "e", "()J", "f", "g", "d", "h", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,1068:1\n658#2:1069\n646#2:1070\n658#2:1071\n646#2:1072\n658#2:1073\n646#2:1074\n658#2:1075\n646#2:1076\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonColors\n*L\n1024#1:1069\n1024#1:1070\n1025#1:1071\n1025#1:1072\n1026#1:1073\n1026#1:1074\n1027#1:1075\n1027#1:1076\n*E\n"})
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f12594e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long contentColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long disabledContainerColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long disabledContentColor;

    public /* synthetic */ n0(long j4, long j5, long j6, long j7, kotlin.jvm.internal.w wVar) {
        this(j4, j5, j6, j7);
    }

    @androidx.compose.runtime.x4
    public final long a(boolean enabled) {
        return enabled ? this.containerColor : this.disabledContainerColor;
    }

    @androidx.compose.runtime.x4
    public final long b(boolean enabled) {
        return enabled ? this.contentColor : this.disabledContentColor;
    }

    @fg.l
    public final n0 c(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor) {
        d2.Companion companion = androidx.compose.ui.graphics.d2.INSTANCE;
        companion.getClass();
        long j4 = containerColor != androidx.compose.ui.graphics.d2.f17778o ? containerColor : this.containerColor;
        companion.getClass();
        long j5 = contentColor != androidx.compose.ui.graphics.d2.f17778o ? contentColor : this.contentColor;
        companion.getClass();
        long j6 = disabledContainerColor != androidx.compose.ui.graphics.d2.f17778o ? disabledContainerColor : this.disabledContainerColor;
        companion.getClass();
        return new n0(j4, j5, j6, disabledContentColor != androidx.compose.ui.graphics.d2.f17778o ? disabledContentColor : this.disabledContentColor);
    }

    /* renamed from: e, reason: from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) other;
        return androidx.compose.ui.graphics.d2.y(this.containerColor, n0Var.containerColor) && kotlin.a2.o(this.contentColor, n0Var.contentColor) && kotlin.a2.o(this.disabledContainerColor, n0Var.disabledContainerColor) && kotlin.a2.o(this.disabledContentColor, n0Var.disabledContentColor);
    }

    /* renamed from: f, reason: from getter */
    public final long getContentColor() {
        return this.contentColor;
    }

    /* renamed from: g, reason: from getter */
    public final long getDisabledContainerColor() {
        return this.disabledContainerColor;
    }

    /* renamed from: h, reason: from getter */
    public final long getDisabledContentColor() {
        return this.disabledContentColor;
    }

    public int hashCode() {
        return kotlin.a2.u(this.disabledContentColor) + m0.a(this.disabledContainerColor, m0.a(this.contentColor, androidx.compose.ui.graphics.d2.K(this.containerColor) * 31, 31), 31);
    }

    private n0(long j4, long j5, long j6, long j7) {
        this.containerColor = j4;
        this.contentColor = j5;
        this.disabledContainerColor = j6;
        this.disabledContentColor = j7;
    }
}

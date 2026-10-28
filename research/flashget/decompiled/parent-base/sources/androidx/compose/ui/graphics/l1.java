package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import kotlin.Metadata;

/* compiled from: ColorFilter.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/graphics/l1;", "Landroidx/compose/ui/graphics/e2;", "Landroidx/compose/ui/graphics/d2;", "color", "Landroidx/compose/ui/graphics/k1;", "blendMode", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "nativeColorFilter", "<init>", "(JILandroid/graphics/ColorFilter;Lkotlin/jvm/internal/w;)V", "(JILkotlin/jvm/internal/w;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "c", "J", "()J", "d", "I", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l1 extends e2 {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long color;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int blendMode;

    public /* synthetic */ l1(long j4, int i4, ColorFilter colorFilter, kotlin.jvm.internal.w wVar) {
        this(j4, i4, colorFilter);
    }

    /* renamed from: b, reason: from getter */
    public final int getBlendMode() {
        return this.blendMode;
    }

    /* renamed from: c, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) other;
        return d2.y(this.color, l1Var.color) && k1.G(this.blendMode, l1Var.blendMode);
    }

    public int hashCode() {
        return k1.H(this.blendMode) + (d2.K(this.color) * 31);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        androidx.compose.foundation.f2.a(this.color, sb, ", blendMode=");
        sb.append((Object) k1.I(this.blendMode));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ l1(long j4, int i4, kotlin.jvm.internal.w wVar) {
        this(j4, i4);
    }

    private l1(long j4, int i4, ColorFilter colorFilter) {
        super(colorFilter);
        this.color = j4;
        this.blendMode = i4;
    }

    private l1(long j4, int i4) {
        this(j4, i4, m0.d(j4, i4));
    }
}

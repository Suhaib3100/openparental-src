package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import kotlin.Metadata;

/* compiled from: ColorFilter.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/graphics/v4;", "Landroidx/compose/ui/graphics/e2;", "Landroidx/compose/ui/graphics/d2;", "multiply", "add", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "nativeColorFilter", "<init>", "(JJLandroid/graphics/ColorFilter;Lkotlin/jvm/internal/w;)V", "(JJLkotlin/jvm/internal/w;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "c", "J", "()J", "d", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class v4 extends e2 {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long multiply;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long add;

    public /* synthetic */ v4(long j4, long j5, ColorFilter colorFilter, kotlin.jvm.internal.w wVar) {
        this(j4, j5, colorFilter);
    }

    /* renamed from: b, reason: from getter */
    public final long getAdd() {
        return this.add;
    }

    /* renamed from: c, reason: from getter */
    public final long getMultiply() {
        return this.multiply;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof v4)) {
            return false;
        }
        v4 v4Var = (v4) other;
        return d2.y(this.multiply, v4Var.multiply) && kotlin.a2.o(this.add, v4Var.add);
    }

    public int hashCode() {
        return kotlin.a2.u(this.add) + (d2.K(this.multiply) * 31);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("LightingColorFilter(multiply=");
        androidx.compose.foundation.f2.a(this.multiply, sb, ", add=");
        sb.append((Object) d2.L(this.add));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ v4(long j4, long j5, kotlin.jvm.internal.w wVar) {
        this(j4, j5);
    }

    private v4(long j4, long j5, ColorFilter colorFilter) {
        super(colorFilter);
        this.multiply = j4;
        this.add = j5;
    }

    private v4(long j4, long j5) {
        this(j4, j5, m0.c(j4, j5));
    }
}

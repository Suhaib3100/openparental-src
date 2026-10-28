package androidx.core.graphics;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import kotlin.Metadata;

/* compiled from: PorterDuff.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\b¨\u0006\u0007"}, d2 = {"Landroid/graphics/PorterDuff$Mode;", "Landroid/graphics/PorterDuffXfermode;", "b", "", "color", "Landroid/graphics/PorterDuffColorFilter;", "a", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class h2 {
    @d5.d
    public static final PorterDuffColorFilter a(@d5.d PorterDuff.Mode mode, int i5) {
        kotlin.jvm.internal.l0.p(mode, "<this>");
        return new PorterDuffColorFilter(i5, mode);
    }

    @d5.d
    public static final PorterDuffXfermode b(@d5.d PorterDuff.Mode mode) {
        kotlin.jvm.internal.l0.p(mode, "<this>");
        return new PorterDuffXfermode(mode);
    }
}

package androidx.core.graphics.drawable;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.annotation.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ColorDrawable.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\u0087\b¨\u0006\u0005"}, d2 = {"", "Landroid/graphics/drawable/ColorDrawable;", "a", "Landroid/graphics/Color;", "b", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class c {
    @d5.d
    public static final ColorDrawable a(@androidx.annotation.l int i5) {
        return new ColorDrawable(i5);
    }

    @x0(26)
    @d5.d
    public static final ColorDrawable b(@d5.d Color color) {
        int argb;
        l0.p(color, "<this>");
        argb = color.toArgb();
        return new ColorDrawable(argb);
    }
}

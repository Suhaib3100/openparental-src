package androidx.core.util;

import android.util.Size;
import android.util.SizeF;
import androidx.annotation.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0087\n\u001a\r\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0087\n\u001a\r\u0010\u0007\u001a\u00020\u0005*\u00020\u0004H\u0087\n¨\u0006\b"}, d2 = {"Landroid/util/Size;", "", "b", "d", "Landroid/util/SizeF;", "", "a", "c", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class u {
    @x0(21)
    public static final float a(@d5.d SizeF sizeF) {
        l0.p(sizeF, "<this>");
        return sizeF.getWidth();
    }

    @x0(21)
    public static final int b(@d5.d Size size) {
        l0.p(size, "<this>");
        return size.getWidth();
    }

    @x0(21)
    public static final float c(@d5.d SizeF sizeF) {
        l0.p(sizeF, "<this>");
        return sizeF.getHeight();
    }

    @x0(21)
    public static final int d(@d5.d Size size) {
        l0.p(size, "<this>");
        return size.getHeight();
    }
}

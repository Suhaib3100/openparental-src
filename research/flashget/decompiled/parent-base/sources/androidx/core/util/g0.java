package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.x0;
import kotlin.Metadata;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0087\n¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\t\u001a\u00020\u0006*\u00020\u0005H\u0087\n¢\u0006\u0004\b\t\u0010\b\u001a\u0014\u0010\u000b\u001a\u00020\u0006*\u00020\nH\u0086\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u0014\u0010\r\u001a\u00020\u0006*\u00020\nH\u0086\n¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Landroid/util/Size;", "", "c", "(Landroid/util/Size;)I", "f", "Landroid/util/SizeF;", "", "a", "(Landroid/util/SizeF;)F", "d", "Landroidx/core/util/f0;", "b", "(Landroidx/core/util/f0;)F", "e", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes3.dex */
public final class g0 {
    @x0(21)
    public static final float a(@fg.l SizeF sizeF) {
        return sizeF.getWidth();
    }

    public static final float b(@fg.l f0 f0Var) {
        return f0Var.b();
    }

    @x0(21)
    public static final int c(@fg.l Size size) {
        return size.getWidth();
    }

    @x0(21)
    public static final float d(@fg.l SizeF sizeF) {
        return sizeF.getHeight();
    }

    public static final float e(@fg.l f0 f0Var) {
        return f0Var.a();
    }

    @x0(21)
    public static final int f(@fg.l Size size) {
        return size.getHeight();
    }
}

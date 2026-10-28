package androidx.core.util;

import android.util.Half;
import androidx.annotation.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Half.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\r\u0010\u0006\u001a\u00020\u0001*\u00020\u0005H\u0087\b\u001a\r\u0010\b\u001a\u00020\u0001*\u00020\u0007H\u0087\b¨\u0006\t"}, d2 = {"", "Landroid/util/Half;", "d", "", "b", "", "a", "", "c", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class h {
    @x0(26)
    @d5.d
    public static final Half a(double d6) {
        Half valueOf;
        valueOf = Half.valueOf((float) d6);
        l0.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @x0(26)
    @d5.d
    public static final Half b(float f6) {
        Half valueOf;
        valueOf = Half.valueOf(f6);
        l0.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @x0(26)
    @d5.d
    public static final Half c(@d5.d String str) {
        Half valueOf;
        l0.p(str, "<this>");
        valueOf = Half.valueOf(str);
        l0.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @x0(26)
    @d5.d
    public static final Half d(short s5) {
        Half valueOf;
        valueOf = Half.valueOf(s5);
        l0.o(valueOf, "valueOf(this)");
        return valueOf;
    }
}

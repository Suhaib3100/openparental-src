package androidx.core.text;

import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.util.Locale;

/* compiled from: TextUtilsCompat.java */
/* loaded from: classes3.dex */
public final class g0 {
    private g0() {
    }

    public static int a(@q0 Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }

    @o0
    public static String b(@o0 String str) {
        return TextUtils.htmlEncode(str);
    }
}

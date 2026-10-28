package androidx.core.text;

import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.util.Locale;

/* compiled from: TextUtilsCompat.java */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f5159b = "Arab";

    /* renamed from: c, reason: collision with root package name */
    private static final String f5160c = "Hebr";

    /* renamed from: a, reason: collision with root package name */
    private static final Locale f5158a = new Locale("", "");

    /* compiled from: TextUtilsCompat.java */
    @x0(17)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static int a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    private d0() {
    }

    private static int a(@o0 Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    public static int b(@q0 Locale locale) {
        return a.a(locale);
    }

    @o0
    public static String c(@o0 String str) {
        return TextUtils.htmlEncode(str);
    }
}

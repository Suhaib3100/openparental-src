package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.a1;
import androidx.annotation.c1;
import androidx.annotation.o0;
import java.util.Locale;

/* compiled from: BuildCompat.java */
/* loaded from: classes.dex */
public class a {

    /* compiled from: BuildCompat.java */
    @a1
    /* renamed from: androidx.core.os.a$a, reason: collision with other inner class name */
    public @interface InterfaceC0043a {
    }

    private a() {
    }

    @androidx.annotation.k(api = 24)
    @Deprecated
    public static boolean a() {
        return true;
    }

    @androidx.annotation.k(api = 25)
    @Deprecated
    public static boolean b() {
        return Build.VERSION.SDK_INT >= 25;
    }

    @androidx.annotation.k(api = 26)
    @Deprecated
    public static boolean c() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @androidx.annotation.k(api = 27)
    @Deprecated
    public static boolean d() {
        return Build.VERSION.SDK_INT >= 27;
    }

    @androidx.annotation.k(api = 28)
    @Deprecated
    public static boolean e() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @c1({c1.a.TESTS})
    protected static boolean f(@o0 String str, @o0 String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    @androidx.annotation.k(api = 29)
    @Deprecated
    public static boolean g() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @androidx.annotation.k(api = 30)
    @Deprecated
    public static boolean h() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @SuppressLint({"RestrictedApi"})
    @androidx.annotation.k(api = 31, codename = "S")
    @Deprecated
    public static boolean i() {
        int i5 = Build.VERSION.SDK_INT;
        return i5 >= 31 || (i5 >= 30 && f("S", Build.VERSION.CODENAME));
    }

    @InterfaceC0043a
    @androidx.annotation.k(api = 32, codename = "Sv2")
    @Deprecated
    public static boolean j() {
        int i5 = Build.VERSION.SDK_INT;
        return i5 >= 32 || (i5 >= 31 && f("Sv2", Build.VERSION.CODENAME));
    }

    @InterfaceC0043a
    @androidx.annotation.k(api = 33, codename = "Tiramisu")
    public static boolean k() {
        int i5 = Build.VERSION.SDK_INT;
        return i5 >= 33 || (i5 >= 32 && f("Tiramisu", Build.VERSION.CODENAME));
    }

    @InterfaceC0043a
    @androidx.annotation.k(codename = "UpsideDownCake")
    public static boolean l() {
        return Build.VERSION.SDK_INT >= 33 && f("UpsideDownCake", Build.VERSION.CODENAME);
    }
}

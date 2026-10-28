package j1;

import android.os.Build;
import android.util.Log;
import androidx.concurrent.futures.b;
import androidx.constraintlayout.motion.widget.g;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: Logging.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22916a = ProtectedSandApp.s("᬴");

    /* renamed from: b, reason: collision with root package name */
    private static final int f22917b = 23;

    private a() {
    }

    private static String a(String str, String str2) {
        String a6 = b.a(str, str2);
        return a6.length() > 23 ? a6.substring(0, 23) : a6;
    }

    public static void b(String str, String str2) {
        Log.isLoggable(g(str), 3);
    }

    public static void c(String str, String str2, Object obj) {
        if (Log.isLoggable(g(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static void d(String str, String str2, Object obj, Object obj2) {
        if (Log.isLoggable(g(str), 3)) {
            String.format(str2, obj, obj2);
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        if (Log.isLoggable(g(str), 3)) {
            String.format(str2, objArr);
        }
    }

    public static void f(String str, String str2, Throwable th) {
        Log.isLoggable(g(str), 6);
    }

    private static String g(String str) {
        int i5 = Build.VERSION.SDK_INT;
        String s5 = ProtectedSandApp.s("ᬳ");
        return i5 < 26 ? a(s5, str) : g.a(s5, str);
    }

    public static void h(String str, String str2, Object obj) {
        if (Log.isLoggable(g(str), 4)) {
            String.format(str2, obj);
        }
    }

    public static void i(String str, String str2, Object obj) {
        if (Log.isLoggable(g(str), 5)) {
            String.format(str2, obj);
        }
    }
}

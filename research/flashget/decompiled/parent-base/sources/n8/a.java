package n8;

import android.os.Build;
import android.util.Log;
import androidx.compose.runtime.changelist.j;
import androidx.constraintlayout.core.motion.key.c;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Logging.java */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f81681a = ProtectedSandApp.s("\uef3e");

    /* renamed from: b, reason: collision with root package name */
    private static final int f81682b = 23;

    private a() {
    }

    private static String a(String str, String str2) {
        String a5 = j.a(str, str2);
        return a5.length() > 23 ? a5.substring(0, 23) : a5;
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
        int i4 = Build.VERSION.SDK_INT;
        String s4 = ProtectedSandApp.s("\uef3e");
        return i4 < 26 ? a(s4, str) : c.a(s4, str);
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

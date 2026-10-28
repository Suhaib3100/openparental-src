package og;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.collection.a3;
import androidx.fragment.app.Fragment;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: PermissionUtils.java */
/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final a3<String, Integer> f83816a;

    static {
        a3<String, Integer> a3Var = new a3<>(13);
        f83816a = a3Var;
        a3Var.put(ProtectedSandApp.s("ꎍ\u0001"), 14);
        a3Var.put(ProtectedSandApp.s("ꎎ\u0001"), 16);
        a3Var.put(ProtectedSandApp.s("ꎏ\u0001"), 16);
        a3Var.put(ProtectedSandApp.s("ꎐ\u0001"), 16);
        a3Var.put(ProtectedSandApp.s("ꎑ\u0001"), 20);
        a3Var.put(ProtectedSandApp.s("ꎒ\u0001"), 23);
        a3Var.put(ProtectedSandApp.s("ꎓ\u0001"), 23);
        a3Var.put(ProtectedSandApp.s("ꎔ\u0001"), 26);
        a3Var.put(ProtectedSandApp.s("ꎕ\u0001"), 26);
        a3Var.put(ProtectedSandApp.s("ꎖ\u0001"), 28);
        a3Var.put(ProtectedSandApp.s("ꎗ\u0001"), 29);
        a3Var.put(ProtectedSandApp.s("ꎘ\u0001"), 29);
        a3Var.put(ProtectedSandApp.s("ꎙ\u0001"), 29);
    }

    private g() {
    }

    private static boolean a(Context context, String str) {
        try {
            return androidx.core.content.d.checkSelfPermission(context, str) == 0;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public static boolean b(Context context, String... strArr) {
        for (String str : strArr) {
            if (c(str) && !a(context, str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean c(String str) {
        Integer num = f83816a.get(str);
        return num == null || Build.VERSION.SDK_INT >= num.intValue();
    }

    public static boolean d(Activity activity, String... strArr) {
        for (String str : strArr) {
            if (androidx.core.app.b.r(activity, str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Fragment fragment, String... strArr) {
        for (String str : strArr) {
            if (fragment.shouldShowRequestPermissionRationale(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(int... iArr) {
        if (iArr.length == 0) {
            return false;
        }
        for (int i4 : iArr) {
            if (i4 != 0) {
                return false;
            }
        }
        return true;
    }
}

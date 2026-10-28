package l;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.constraintlayout.motion.widget.r;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: AccessibilityServiceInfoCompat.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f29089a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f29090b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f29091c = 4;

    /* renamed from: d, reason: collision with root package name */
    public static final int f29092d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static final int f29093e = 32;

    /* renamed from: f, reason: collision with root package name */
    public static final int f29094f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f29095g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f29096h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int f29097i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final int f29098j = 16;

    /* renamed from: k, reason: collision with root package name */
    public static final int f29099k = 32;

    private a() {
    }

    @o0
    public static String a(int i5) {
        return i5 != 1 ? i5 != 2 ? i5 != 4 ? i5 != 8 ? ProtectedSandApp.s("ᬵ") : ProtectedSandApp.s("ᬶ") : ProtectedSandApp.s("ᬷ") : ProtectedSandApp.s("ᬸ") : ProtectedSandApp.s("ᬹ");
    }

    @o0
    public static String b(int i5) {
        StringBuilder a6 = r.a(ProtectedSandApp.s("ᬺ"));
        while (i5 > 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i5);
            i5 &= ~numberOfTrailingZeros;
            if (a6.length() > 1) {
                a6.append(ProtectedSandApp.s("ᬻ"));
            }
            if (numberOfTrailingZeros == 1) {
                a6.append(ProtectedSandApp.s("ᭀ"));
            } else if (numberOfTrailingZeros == 2) {
                a6.append(ProtectedSandApp.s("ᬿ"));
            } else if (numberOfTrailingZeros == 4) {
                a6.append(ProtectedSandApp.s("ᬾ"));
            } else if (numberOfTrailingZeros == 8) {
                a6.append(ProtectedSandApp.s("ᬽ"));
            } else if (numberOfTrailingZeros == 16) {
                a6.append(ProtectedSandApp.s("ᬼ"));
            }
        }
        a6.append(ProtectedSandApp.s("ᭁ"));
        return a6.toString();
    }

    @q0
    public static String c(int i5) {
        if (i5 == 1) {
            return ProtectedSandApp.s("ᭇ");
        }
        if (i5 == 2) {
            return ProtectedSandApp.s("ᭆ");
        }
        if (i5 == 4) {
            return ProtectedSandApp.s("ᭅ");
        }
        if (i5 == 8) {
            return ProtectedSandApp.s("᭄");
        }
        if (i5 == 16) {
            return ProtectedSandApp.s("ᭃ");
        }
        if (i5 != 32) {
            return null;
        }
        return ProtectedSandApp.s("ᭂ");
    }

    public static int d(@o0 AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getCapabilities();
    }

    @q0
    public static String e(@o0 AccessibilityServiceInfo accessibilityServiceInfo, @o0 PackageManager packageManager) {
        return accessibilityServiceInfo.loadDescription(packageManager);
    }
}

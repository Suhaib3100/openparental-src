package a1;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.w0;
import androidx.compose.material3.j4;

/* compiled from: AccessibilityServiceInfoCompat.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f57a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f58b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f59c = 4;

    /* renamed from: d, reason: collision with root package name */
    public static final int f60d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static final int f61e = 32;

    /* renamed from: f, reason: collision with root package name */
    public static final int f62f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f63g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f64h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int f65i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final int f66j = 16;

    /* renamed from: k, reason: collision with root package name */
    public static final int f67k = 32;

    private a() {
    }

    @o0
    public static String a(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 4 ? i4 != 8 ? "UNKNOWN" : "CAPABILITY_CAN_FILTER_KEY_EVENTS" : "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY" : "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION" : "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
    }

    @o0
    public static String b(int i4) {
        StringBuilder a5 = j4.a("[");
        while (i4 > 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i4);
            i4 &= ~numberOfTrailingZeros;
            if (a5.length() > 1) {
                a5.append(", ");
            }
            if (numberOfTrailingZeros == 1) {
                a5.append("FEEDBACK_SPOKEN");
            } else if (numberOfTrailingZeros == 2) {
                a5.append("FEEDBACK_HAPTIC");
            } else if (numberOfTrailingZeros == 4) {
                a5.append("FEEDBACK_AUDIBLE");
            } else if (numberOfTrailingZeros == 8) {
                a5.append("FEEDBACK_VISUAL");
            } else if (numberOfTrailingZeros == 16) {
                a5.append("FEEDBACK_GENERIC");
            }
        }
        a5.append("]");
        return a5.toString();
    }

    @q0
    public static String c(int i4) {
        if (i4 == 1) {
            return "DEFAULT";
        }
        if (i4 == 2) {
            return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
        }
        if (i4 == 4) {
            return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
        }
        if (i4 == 8) {
            return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }
        if (i4 == 16) {
            return "FLAG_REPORT_VIEW_IDS";
        }
        if (i4 != 32) {
            return null;
        }
        return "FLAG_REQUEST_FILTER_KEY_EVENTS";
    }

    @w0(expression = "info.getCapabilities()")
    @Deprecated
    public static int d(@o0 AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getCapabilities();
    }

    @q0
    @w0(expression = "info.loadDescription(packageManager)")
    @Deprecated
    public static String e(@o0 AccessibilityServiceInfo accessibilityServiceInfo, @o0 PackageManager packageManager) {
        return accessibilityServiceInfo.loadDescription(packageManager);
    }
}

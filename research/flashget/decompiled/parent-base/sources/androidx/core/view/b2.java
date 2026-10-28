package androidx.core.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: ViewConfigurationCompat.java */
/* loaded from: classes3.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f27077a = "ViewConfigCompat";

    /* renamed from: b, reason: collision with root package name */
    private static final int f27078b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    private static final int f27079c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private static final int f27080d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final int f27081e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static Method f27082f;

    /* compiled from: ViewConfigurationCompat.java */
    @androidx.annotation.x0(26)
    static class a {
        private a() {
        }

        static float a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        static float b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* compiled from: ViewConfigurationCompat.java */
    @androidx.annotation.x0(28)
    static class b {
        private b() {
        }

        static int a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        static boolean b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* compiled from: ViewConfigurationCompat.java */
    @androidx.annotation.x0(34)
    static class c {
        private c() {
        }

        static int a(@androidx.annotation.o0 ViewConfiguration viewConfiguration, int i4, int i5, int i6) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i4, i5, i6);
        }

        static int b(@androidx.annotation.o0 ViewConfiguration viewConfiguration, int i4, int i5, int i6) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i4, i5, i6);
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f27082f = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
            } catch (Exception unused) {
            }
        }
    }

    private b2() {
    }

    private static int a(Resources resources, int i4, androidx.core.util.l0<Integer> l0Var, int i5) {
        int dimensionPixelSize;
        return i4 != -1 ? (i4 == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i4)) < 0) ? i5 : dimensionPixelSize : l0Var.get().intValue();
    }

    private static float b(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f27082f) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, null)).intValue();
            } catch (Exception unused) {
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    private static int c(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    private static int d(Resources resources, int i4, int i5) {
        if (i4 == 4194304 && i5 == 26) {
            return resources.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android");
        }
        return -1;
    }

    private static int e(Resources resources, int i4, int i5) {
        if (i4 == 4194304 && i5 == 26) {
            return resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android");
        }
        return -1;
    }

    public static float f(@androidx.annotation.o0 ViewConfiguration viewConfiguration, @androidx.annotation.o0 Context context) {
        return Build.VERSION.SDK_INT >= 26 ? a.a(viewConfiguration) : b(viewConfiguration, context);
    }

    public static int g(@androidx.annotation.o0 ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 28 ? b.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
    }

    public static int h(@androidx.annotation.o0 Context context, @androidx.annotation.o0 final ViewConfiguration viewConfiguration, int i4, int i5, int i6) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.a(viewConfiguration, i4, i5, i6);
        }
        if (!m(i4, i5, i6)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int d5 = d(resources, i6, i5);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, d5, new androidx.core.util.l0() { // from class: androidx.core.view.z1
            @Override // androidx.core.util.l0
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, Integer.MIN_VALUE);
    }

    public static int i(@androidx.annotation.o0 Context context, @androidx.annotation.o0 final ViewConfiguration viewConfiguration, int i4, int i5, int i6) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.b(viewConfiguration, i4, i5, i6);
        }
        if (!m(i4, i5, i6)) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int e4 = e(resources, i6, i5);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, e4, new androidx.core.util.l0() { // from class: androidx.core.view.a2
            @Override // androidx.core.util.l0
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, Integer.MAX_VALUE);
    }

    @androidx.annotation.w0(expression = "config.getScaledPagingTouchSlop()")
    @Deprecated
    public static int j(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledPagingTouchSlop();
    }

    public static float k(@androidx.annotation.o0 ViewConfiguration viewConfiguration, @androidx.annotation.o0 Context context) {
        return Build.VERSION.SDK_INT >= 26 ? a.b(viewConfiguration) : b(viewConfiguration, context);
    }

    @androidx.annotation.w0(expression = "config.hasPermanentMenuKey()")
    @Deprecated
    public static boolean l(ViewConfiguration viewConfiguration) {
        return viewConfiguration.hasPermanentMenuKey();
    }

    private static boolean m(int i4, int i5, int i6) {
        InputDevice device = InputDevice.getDevice(i4);
        return (device == null || device.getMotionRange(i5, i6) == null) ? false : true;
    }

    public static boolean n(@androidx.annotation.o0 ViewConfiguration viewConfiguration, @androidx.annotation.o0 Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.b(viewConfiguration);
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }
}

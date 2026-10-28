package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;

/* compiled from: DisplayCompat.java */
/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private static final int f27455a = 3840;

    /* renamed from: b, reason: collision with root package name */
    private static final int f27456b = 2160;

    /* compiled from: DisplayCompat.java */
    @androidx.annotation.x0(23)
    static class a {
        private a() {
        }

        @androidx.annotation.o0
        static b a(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Display display) {
            Display.Mode mode = display.getMode();
            Point a5 = x.a(context, display);
            return (a5 == null || d(mode, a5)) ? new b(mode, true) : new b(mode, a5);
        }

        @androidx.annotation.o0
        @SuppressLint({"ArrayReturn"})
        public static b[] b(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Display display) {
            Display.Mode[] supportedModes = display.getSupportedModes();
            b[] bVarArr = new b[supportedModes.length];
            Display.Mode mode = display.getMode();
            Point a5 = x.a(context, display);
            if (a5 == null || d(mode, a5)) {
                for (int i4 = 0; i4 < supportedModes.length; i4++) {
                    bVarArr[i4] = new b(supportedModes[i4], e(supportedModes[i4], mode));
                }
            } else {
                for (int i5 = 0; i5 < supportedModes.length; i5++) {
                    bVarArr[i5] = e(supportedModes[i5], mode) ? new b(supportedModes[i5], a5) : new b(supportedModes[i5], false);
                }
            }
            return bVarArr;
        }

        static boolean c(@androidx.annotation.o0 Display display) {
            Display.Mode mode = display.getMode();
            for (Display.Mode mode2 : display.getSupportedModes()) {
                if (mode.getPhysicalHeight() < mode2.getPhysicalHeight() || mode.getPhysicalWidth() < mode2.getPhysicalWidth()) {
                    return false;
                }
            }
            return true;
        }

        static boolean d(Display.Mode mode, Point point) {
            return (mode.getPhysicalWidth() == point.x && mode.getPhysicalHeight() == point.y) || (mode.getPhysicalWidth() == point.y && mode.getPhysicalHeight() == point.x);
        }

        static boolean e(Display.Mode mode, Display.Mode mode2) {
            return mode.getPhysicalWidth() == mode2.getPhysicalWidth() && mode.getPhysicalHeight() == mode2.getPhysicalHeight();
        }
    }

    private x() {
    }

    static Point a(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Display display) {
        Point j4 = Build.VERSION.SDK_INT < 28 ? j("sys.display-size", display) : j("vendor.display-size", display);
        if (j4 != null) {
            return j4;
        }
        if (g(context) && a.c(display)) {
            return new Point(f27455a, f27456b);
        }
        return null;
    }

    @androidx.annotation.o0
    private static Point b(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Display display) {
        Point a5 = a(context, display);
        if (a5 != null) {
            return a5;
        }
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }

    @androidx.annotation.o0
    public static b c(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Display display) {
        return a.a(context, display);
    }

    @androidx.annotation.o0
    @SuppressLint({"ArrayReturn"})
    public static b[] d(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Display display) {
        return a.b(context, display);
    }

    @androidx.annotation.q0
    private static String e(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception unused) {
            return null;
        }
    }

    static boolean f(@androidx.annotation.o0 Display display) {
        return a.c(display);
    }

    private static boolean g(@androidx.annotation.o0 Context context) {
        return h(context) && "Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd");
    }

    private static boolean h(@androidx.annotation.o0 Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    private static Point i(@androidx.annotation.o0 String str) throws NumberFormatException {
        String[] split = str.trim().split("x", -1);
        if (split.length == 2) {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            if (parseInt > 0 && parseInt2 > 0) {
                return new Point(parseInt, parseInt2);
            }
        }
        throw new NumberFormatException();
    }

    @androidx.annotation.q0
    private static Point j(@androidx.annotation.o0 String str, @androidx.annotation.o0 Display display) {
        if (display.getDisplayId() != 0) {
            return null;
        }
        String e4 = e(str);
        if (!TextUtils.isEmpty(e4) && e4 != null) {
            try {
                return i(e4);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* compiled from: DisplayCompat.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Display.Mode f27457a;

        /* renamed from: b, reason: collision with root package name */
        private final Point f27458b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27459c;

        /* compiled from: DisplayCompat.java */
        @androidx.annotation.x0(23)
        static class a {
            private a() {
            }

            static int a(Display.Mode mode) {
                return mode.getPhysicalHeight();
            }

            static int b(Display.Mode mode) {
                return mode.getPhysicalWidth();
            }
        }

        b(@androidx.annotation.o0 Point point) {
            androidx.core.util.w.m(point, "physicalSize == null");
            this.f27458b = point;
            this.f27457a = null;
            this.f27459c = true;
        }

        public int a() {
            return this.f27458b.y;
        }

        public int b() {
            return this.f27458b.x;
        }

        @Deprecated
        public boolean c() {
            return this.f27459c;
        }

        @androidx.annotation.q0
        @androidx.annotation.x0(23)
        public Display.Mode d() {
            return this.f27457a;
        }

        @androidx.annotation.x0(23)
        b(@androidx.annotation.o0 Display.Mode mode, boolean z4) {
            androidx.core.util.w.m(mode, "mode == null, can't wrap a null reference");
            this.f27458b = new Point(mode.getPhysicalWidth(), mode.getPhysicalHeight());
            this.f27457a = mode;
            this.f27459c = z4;
        }

        @androidx.annotation.x0(23)
        b(@androidx.annotation.o0 Display.Mode mode, @androidx.annotation.o0 Point point) {
            androidx.core.util.w.m(mode, "mode == null, can't wrap a null reference");
            androidx.core.util.w.m(point, "physicalSize == null");
            this.f27458b = point;
            this.f27457a = mode;
            this.f27459c = true;
        }
    }
}

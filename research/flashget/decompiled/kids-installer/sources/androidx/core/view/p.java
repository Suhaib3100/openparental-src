package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;

/* compiled from: DisplayCompat.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final int f5632a = 3840;

    /* renamed from: b, reason: collision with root package name */
    private static final int f5633b = 2160;

    /* compiled from: DisplayCompat.java */
    @androidx.annotation.x0(17)
    static class a {
        private a() {
        }

        static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    /* compiled from: DisplayCompat.java */
    @androidx.annotation.x0(23)
    static class b {
        private b() {
        }

        @androidx.annotation.o0
        static c a(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Display display) {
            Display.Mode mode = display.getMode();
            Point a6 = p.a(context, display);
            return (a6 == null || d(mode, a6)) ? new c(mode, true) : new c(mode, a6);
        }

        @androidx.annotation.o0
        @SuppressLint({"ArrayReturn"})
        public static c[] b(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Display display) {
            Display.Mode[] supportedModes = display.getSupportedModes();
            c[] cVarArr = new c[supportedModes.length];
            Display.Mode mode = display.getMode();
            Point a6 = p.a(context, display);
            if (a6 == null || d(mode, a6)) {
                for (int i5 = 0; i5 < supportedModes.length; i5++) {
                    cVarArr[i5] = new c(supportedModes[i5], e(supportedModes[i5], mode));
                }
            } else {
                for (int i6 = 0; i6 < supportedModes.length; i6++) {
                    cVarArr[i6] = e(supportedModes[i6], mode) ? new c(supportedModes[i6], a6) : new c(supportedModes[i6], false);
                }
            }
            return cVarArr;
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

    private p() {
    }

    static Point a(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Display display) {
        Point j5 = Build.VERSION.SDK_INT < 28 ? j("sys.display-size", display) : j("vendor.display-size", display);
        if (j5 != null) {
            return j5;
        }
        if (g(context) && b.c(display)) {
            return new Point(f5632a, f5633b);
        }
        return null;
    }

    @androidx.annotation.o0
    private static Point b(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Display display) {
        Point a6 = a(context, display);
        if (a6 != null) {
            return a6;
        }
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }

    @androidx.annotation.o0
    public static c c(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Display display) {
        return b.a(context, display);
    }

    @androidx.annotation.o0
    @SuppressLint({"ArrayReturn"})
    public static c[] d(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Display display) {
        return b.b(context, display);
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
        return b.c(display);
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
        String e6 = e(str);
        if (!TextUtils.isEmpty(e6) && e6 != null) {
            try {
                return i(e6);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* compiled from: DisplayCompat.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Display.Mode f5634a;

        /* renamed from: b, reason: collision with root package name */
        private final Point f5635b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f5636c;

        /* compiled from: DisplayCompat.java */
        @androidx.annotation.x0(23)
        static class a {
            private a() {
            }

            @androidx.annotation.u
            static int a(Display.Mode mode) {
                return mode.getPhysicalHeight();
            }

            @androidx.annotation.u
            static int b(Display.Mode mode) {
                return mode.getPhysicalWidth();
            }
        }

        c(@androidx.annotation.o0 Point point) {
            androidx.core.util.q.m(point, "physicalSize == null");
            this.f5635b = point;
            this.f5634a = null;
            this.f5636c = true;
        }

        public int a() {
            return this.f5635b.y;
        }

        public int b() {
            return this.f5635b.x;
        }

        @Deprecated
        public boolean c() {
            return this.f5636c;
        }

        @androidx.annotation.q0
        @androidx.annotation.x0(23)
        public Display.Mode d() {
            return this.f5634a;
        }

        @androidx.annotation.x0(23)
        c(@androidx.annotation.o0 Display.Mode mode, boolean z5) {
            androidx.core.util.q.m(mode, "mode == null, can't wrap a null reference");
            this.f5635b = new Point(a.b(mode), a.a(mode));
            this.f5634a = mode;
            this.f5636c = z5;
        }

        @androidx.annotation.x0(23)
        c(@androidx.annotation.o0 Display.Mode mode, @androidx.annotation.o0 Point point) {
            androidx.core.util.q.m(mode, "mode == null, can't wrap a null reference");
            androidx.core.util.q.m(point, "physicalSize == null");
            this.f5635b = point;
            this.f5634a = mode;
            this.f5636c = true;
        }
    }
}

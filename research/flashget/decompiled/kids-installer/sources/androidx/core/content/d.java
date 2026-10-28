package androidx.core.content;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: ContextCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4531a = "ContextCompat";

    /* renamed from: b, reason: collision with root package name */
    private static final Object f4532b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f4533c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static TypedValue f4534d;

    /* compiled from: ContextCompat.java */
    @x0(16)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        @androidx.annotation.u
        static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* compiled from: ContextCompat.java */
    @x0(19)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static File[] a(Context context) {
            return context.getExternalCacheDirs();
        }

        @androidx.annotation.u
        static File[] b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        @androidx.annotation.u
        static File[] c(Context context) {
            return context.getObbDirs();
        }
    }

    /* compiled from: ContextCompat.java */
    @x0(21)
    static class c {
        private c() {
        }

        @androidx.annotation.u
        static File a(Context context) {
            return context.getCodeCacheDir();
        }

        @androidx.annotation.u
        static Drawable b(Context context, int i5) {
            return context.getDrawable(i5);
        }

        @androidx.annotation.u
        static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* compiled from: ContextCompat.java */
    @x0(23)
    /* renamed from: androidx.core.content.d$d, reason: collision with other inner class name */
    static class C0034d {
        private C0034d() {
        }

        @androidx.annotation.u
        static int a(Context context, int i5) {
            return context.getColor(i5);
        }

        @androidx.annotation.u
        static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @androidx.annotation.u
        static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* compiled from: ContextCompat.java */
    @x0(24)
    static class e {
        private e() {
        }

        @androidx.annotation.u
        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        @androidx.annotation.u
        static File b(Context context) {
            return context.getDataDir();
        }

        @androidx.annotation.u
        static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* compiled from: ContextCompat.java */
    @x0(26)
    static class f {
        private f() {
        }

        @androidx.annotation.u
        static ComponentName a(Context context, Intent intent) {
            ComponentName startForegroundService;
            startForegroundService = context.startForegroundService(intent);
            return startForegroundService;
        }
    }

    /* compiled from: ContextCompat.java */
    @x0(28)
    static class g {
        private g() {
        }

        @androidx.annotation.u
        static Executor a(Context context) {
            Executor mainExecutor;
            mainExecutor = context.getMainExecutor();
            return mainExecutor;
        }
    }

    /* compiled from: ContextCompat.java */
    @x0(30)
    static class h {
        private h() {
        }

        @androidx.annotation.u
        static String a(Context context) {
            String attributionTag;
            attributionTag = context.getAttributionTag();
            return attributionTag;
        }
    }

    /* compiled from: ContextCompat.java */
    private static final class i {

        /* renamed from: a, reason: collision with root package name */
        static final HashMap<Class<?>, String> f4535a;

        static {
            HashMap<Class<?>, String> hashMap = new HashMap<>();
            f4535a = hashMap;
            hashMap.put(SubscriptionManager.class, "telephony_subscription_service");
            hashMap.put(UsageStatsManager.class, "usagestats");
            hashMap.put(AppWidgetManager.class, "appwidget");
            hashMap.put(BatteryManager.class, "batterymanager");
            hashMap.put(CameraManager.class, "camera");
            hashMap.put(JobScheduler.class, "jobscheduler");
            hashMap.put(LauncherApps.class, "launcherapps");
            hashMap.put(MediaProjectionManager.class, "media_projection");
            hashMap.put(MediaSessionManager.class, "media_session");
            hashMap.put(RestrictionsManager.class, "restrictions");
            hashMap.put(TelecomManager.class, "telecom");
            hashMap.put(TvInputManager.class, "tv_input");
            hashMap.put(AppOpsManager.class, "appops");
            hashMap.put(CaptioningManager.class, "captioning");
            hashMap.put(ConsumerIrManager.class, "consumer_ir");
            hashMap.put(PrintManager.class, "print");
            hashMap.put(BluetoothManager.class, "bluetooth");
            hashMap.put(DisplayManager.class, "display");
            hashMap.put(UserManager.class, "user");
            hashMap.put(InputManager.class, "input");
            hashMap.put(MediaRouter.class, "media_router");
            hashMap.put(NsdManager.class, "servicediscovery");
            hashMap.put(AccessibilityManager.class, "accessibility");
            hashMap.put(AccountManager.class, "account");
            hashMap.put(ActivityManager.class, "activity");
            hashMap.put(AlarmManager.class, "alarm");
            hashMap.put(AudioManager.class, "audio");
            hashMap.put(ClipboardManager.class, "clipboard");
            hashMap.put(ConnectivityManager.class, "connectivity");
            hashMap.put(DevicePolicyManager.class, "device_policy");
            hashMap.put(DownloadManager.class, "download");
            hashMap.put(DropBoxManager.class, "dropbox");
            hashMap.put(InputMethodManager.class, "input_method");
            hashMap.put(KeyguardManager.class, "keyguard");
            hashMap.put(LayoutInflater.class, "layout_inflater");
            hashMap.put(LocationManager.class, "location");
            hashMap.put(NfcManager.class, "nfc");
            hashMap.put(NotificationManager.class, "notification");
            hashMap.put(PowerManager.class, "power");
            hashMap.put(SearchManager.class, "search");
            hashMap.put(SensorManager.class, "sensor");
            hashMap.put(StorageManager.class, "storage");
            hashMap.put(TelephonyManager.class, "phone");
            hashMap.put(TextServicesManager.class, "textservices");
            hashMap.put(UiModeManager.class, "uimode");
            hashMap.put(UsbManager.class, "usb");
            hashMap.put(Vibrator.class, "vibrator");
            hashMap.put(WallpaperManager.class, "wallpaper");
            hashMap.put(WifiP2pManager.class, "wifip2p");
            hashMap.put(WifiManager.class, "wifi");
            hashMap.put(WindowManager.class, "window");
        }

        private i() {
        }
    }

    protected d() {
    }

    public static int a(@o0 Context context, @o0 String str) {
        androidx.core.util.l.e(str, "permission must be non-null");
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    @q0
    public static Context b(@o0 Context context) {
        return e.a(context);
    }

    private static File c(File file) {
        synchronized (f4533c) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                file.getPath();
            }
            return file;
        }
    }

    @q0
    public static String d(@o0 Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return h.a(context);
        }
        return null;
    }

    @o0
    public static File e(@o0 Context context) {
        return c.a(context);
    }

    @androidx.annotation.l
    public static int f(@o0 Context context, @androidx.annotation.n int i5) {
        return C0034d.a(context, i5);
    }

    @q0
    public static ColorStateList g(@o0 Context context, @androidx.annotation.n int i5) {
        return androidx.core.content.res.i.f(context.getResources(), i5, context.getTheme());
    }

    @q0
    public static File h(@o0 Context context) {
        return e.b(context);
    }

    @q0
    public static Drawable i(@o0 Context context, @androidx.annotation.v int i5) {
        return c.b(context, i5);
    }

    @o0
    public static File[] j(@o0 Context context) {
        return b.a(context);
    }

    @o0
    public static File[] k(@o0 Context context, @q0 String str) {
        return b.b(context, str);
    }

    @o0
    public static Executor l(@o0 Context context) {
        return Build.VERSION.SDK_INT >= 28 ? g.a(context) : androidx.core.os.f.a(new Handler(context.getMainLooper()));
    }

    @q0
    public static File m(@o0 Context context) {
        return c.c(context);
    }

    @o0
    public static File[] n(@o0 Context context) {
        return b.c(context);
    }

    @q0
    public static <T> T o(@o0 Context context, @o0 Class<T> cls) {
        return (T) C0034d.b(context, cls);
    }

    @q0
    public static String p(@o0 Context context, @o0 Class<?> cls) {
        return C0034d.c(context, cls);
    }

    public static boolean q(@o0 Context context) {
        return e.c(context);
    }

    public static boolean r(@o0 Context context, @o0 Intent[] intentArr) {
        a.a(context, intentArr, null);
        return true;
    }

    public static boolean s(@o0 Context context, @o0 Intent[] intentArr, @q0 Bundle bundle) {
        a.a(context, intentArr, bundle);
        return true;
    }

    public static void t(@o0 Context context, @o0 Intent intent, @q0 Bundle bundle) {
        a.b(context, intent, bundle);
    }

    public static void u(@o0 Context context, @o0 Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            f.a(context, intent);
        } else {
            context.startService(intent);
        }
    }
}

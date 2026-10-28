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
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
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
import android.text.TextUtils;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.w0;
import androidx.annotation.x0;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: ContextCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes3.dex */
public class d {
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    private static final String TAG = "ContextCompat";
    private static final Object sSync = new Object();

    /* compiled from: ContextCompat.java */
    @x0(21)
    static class a {
        private a() {
        }

        static File a(Context context) {
            return context.getCodeCacheDir();
        }

        static Drawable b(Context context, int i4) {
            return context.getDrawable(i4);
        }

        static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* compiled from: ContextCompat.java */
    @x0(23)
    static class b {
        private b() {
        }

        static int a(Context context, int i4) {
            return context.getColor(i4);
        }

        static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* compiled from: ContextCompat.java */
    @x0(24)
    static class c {
        private c() {
        }

        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        static File b(Context context) {
            return context.getDataDir();
        }

        static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* compiled from: ContextCompat.java */
    @x0(26)
    /* renamed from: androidx.core.content.d$d, reason: collision with other inner class name */
    static class C0410d {
        private C0410d() {
        }

        static Intent a(Context context, @q0 BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i4) {
            return ((i4 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i4 & 1) : context.registerReceiver(broadcastReceiver, intentFilter, d.obtainAndCheckReceiverPermission(context), handler);
        }

        static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* compiled from: ContextCompat.java */
    @x0(28)
    static class e {
        private e() {
        }

        static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* compiled from: ContextCompat.java */
    @x0(30)
    static class f {
        private f() {
        }

        @o0
        static Context a(@o0 Context context, @q0 String str) {
            return context.createAttributionContext(str);
        }

        static String b(Context context) {
            return context.getAttributionTag();
        }

        static Display c(Context context) {
            try {
                return context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                Objects.toString(context);
                return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
            }
        }
    }

    /* compiled from: ContextCompat.java */
    @x0(33)
    static class g {
        private g() {
        }

        static Intent a(Context context, @q0 BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i4) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i4);
        }
    }

    /* compiled from: ContextCompat.java */
    private static final class h {

        /* renamed from: a, reason: collision with root package name */
        static final HashMap<Class<?>, String> f25972a;

        static {
            HashMap<Class<?>, String> hashMap = new HashMap<>();
            f25972a = hashMap;
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

        private h() {
        }
    }

    /* compiled from: ContextCompat.java */
    @c1({c1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface i {
    }

    protected d() {
    }

    public static int checkSelfPermission(@o0 Context context, @o0 String str) {
        androidx.core.util.r.e(str, "permission must be non-null");
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : androidx.core.app.k0.q(context).a() ? 0 : -1;
    }

    @o0
    public static Context createAttributionContext(@o0 Context context, @q0 String str) {
        return Build.VERSION.SDK_INT >= 30 ? f.a(context, str) : context;
    }

    @q0
    public static Context createDeviceProtectedStorageContext(@o0 Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    private static File createFilesDir(File file) {
        synchronized (sSync) {
            try {
                if (!file.exists()) {
                    if (file.mkdirs()) {
                        return file;
                    }
                    file.getPath();
                }
                return file;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @q0
    public static String getAttributionTag(@o0 Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return f.b(context);
        }
        return null;
    }

    @o0
    public static File getCodeCacheDir(@o0 Context context) {
        return context.getCodeCacheDir();
    }

    @androidx.annotation.l
    public static int getColor(@o0 Context context, @androidx.annotation.n int i4) {
        return context.getColor(i4);
    }

    @q0
    public static ColorStateList getColorStateList(@o0 Context context, @androidx.annotation.n int i4) {
        return androidx.core.content.res.i.f(context.getResources(), i4, context.getTheme());
    }

    @o0
    public static Context getContextForLanguage(@o0 Context context) {
        androidx.core.os.p a5 = androidx.core.app.v.a(context);
        if (Build.VERSION.SDK_INT > 32 || a5.j()) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        androidx.core.os.g.b(configuration, a5);
        return context.createConfigurationContext(configuration);
    }

    @q0
    public static File getDataDir(@o0 Context context) {
        return context.getDataDir();
    }

    @o0
    public static Display getDisplayOrDefault(@o0 Context context) {
        return Build.VERSION.SDK_INT >= 30 ? f.c(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @q0
    public static Drawable getDrawable(@o0 Context context, @androidx.annotation.v int i4) {
        return context.getDrawable(i4);
    }

    @o0
    @w0(expression = "context.getExternalCacheDirs()")
    @Deprecated
    public static File[] getExternalCacheDirs(@o0 Context context) {
        return context.getExternalCacheDirs();
    }

    @o0
    @w0(expression = "context.getExternalFilesDirs(type)")
    @Deprecated
    public static File[] getExternalFilesDirs(@o0 Context context, @q0 String str) {
        return context.getExternalFilesDirs(str);
    }

    @o0
    public static Executor getMainExecutor(@o0 Context context) {
        return Build.VERSION.SDK_INT >= 28 ? e.a(context) : androidx.core.os.j.a(new Handler(context.getMainLooper()));
    }

    @q0
    public static File getNoBackupFilesDir(@o0 Context context) {
        return context.getNoBackupFilesDir();
    }

    @o0
    @w0(expression = "context.getObbDirs()")
    @Deprecated
    public static File[] getObbDirs(@o0 Context context) {
        return context.getObbDirs();
    }

    @o0
    public static String getString(@o0 Context context, int i4) {
        return getContextForLanguage(context).getString(i4);
    }

    @q0
    public static <T> T getSystemService(@o0 Context context, @o0 Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    @q0
    public static String getSystemServiceName(@o0 Context context, @o0 Class<?> cls) {
        return context.getSystemServiceName(cls);
    }

    public static boolean isDeviceProtectedStorage(@o0 Context context) {
        return context.isDeviceProtectedStorage();
    }

    static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (g0.d(context, str) == 0) {
            return str;
        }
        throw new RuntimeException(android.support.v4.media.d.a("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    @q0
    public static Intent registerReceiver(@o0 Context context, @q0 BroadcastReceiver broadcastReceiver, @o0 IntentFilter intentFilter, int i4) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i4);
    }

    public static boolean startActivities(@o0 Context context, @o0 Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    @w0(expression = "context.startActivity(intent, options)")
    @Deprecated
    public static void startActivity(@o0 Context context, @o0 Intent intent, @q0 Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void startForegroundService(@o0 Context context, @o0 Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            C0410d.b(context, intent);
        } else {
            context.startService(intent);
        }
    }

    @q0
    public static Intent registerReceiver(@o0 Context context, @q0 BroadcastReceiver broadcastReceiver, @o0 IntentFilter intentFilter, @q0 String str, @q0 Handler handler, int i4) {
        int i5 = i4 & 1;
        if (i5 != 0 && (i4 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i5 != 0) {
            i4 |= 2;
        }
        int i6 = i4;
        int i7 = i6 & 2;
        if (i7 == 0 && (i6 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i7 != 0 && (i6 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 33 ? g.a(context, broadcastReceiver, intentFilter, str, handler, i6) : i10 >= 26 ? C0410d.a(context, broadcastReceiver, intentFilter, str, handler, i6) : ((i6 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler) : context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
    }

    public static boolean startActivities(@o0 Context context, @o0 Intent[] intentArr, @q0 Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }
}

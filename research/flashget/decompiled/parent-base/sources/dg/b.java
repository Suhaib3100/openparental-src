package dg;

import java.lang.reflect.InvocationTargetException;

/* compiled from: AndroidDependenciesDetector.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f73731a = "org.greenrobot.eventbus.android.AndroidComponentsImpl";

    public static boolean a() {
        try {
            Class.forName("org.greenrobot.eventbus.android.AndroidComponentsImpl");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static a b() {
        try {
            return (a) Class.forName("org.greenrobot.eventbus.android.AndroidComponentsImpl").getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean c() {
        try {
            return Class.forName("android.os.Looper").getDeclaredMethod("getMainLooper", null).invoke(null, null) != null;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }
}

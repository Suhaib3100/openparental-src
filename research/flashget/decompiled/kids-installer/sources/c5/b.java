package c5;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.InvocationTargetException;

/* compiled from: AndroidDependenciesDetector.java */
/* loaded from: classes5.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10691a = ProtectedSandApp.s("㎩");

    public static boolean a() {
        try {
            Class.forName(ProtectedSandApp.s("㎥"));
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static a b() {
        try {
            return (a) Class.forName(ProtectedSandApp.s("㎦")).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean c() {
        try {
            return Class.forName(ProtectedSandApp.s("㎧")).getDeclaredMethod(ProtectedSandApp.s("㎨"), new Class[0]).invoke(null, new Object[0]) != null;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }
}

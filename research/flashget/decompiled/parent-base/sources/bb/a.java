package bb;

import android.app.Application;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: EnContext.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Application f36847a;

    static {
        Application application;
        Throwable th;
        try {
            application = (Application) Class.forName(ProtectedSandApp.s("\uf0b7")).getMethod(ProtectedSandApp.s("\uf0b8"), null).invoke(null, null);
            if (application == null) {
                try {
                    try {
                        throw new IllegalStateException(ProtectedSandApp.s("\uf0b9"));
                    } catch (Exception e4) {
                        e = e4;
                        e.printStackTrace();
                        try {
                            application = (Application) Class.forName(ProtectedSandApp.s("\uf0ba")).getMethod(ProtectedSandApp.s("\uf0bb"), null).invoke(null, null);
                        } catch (Exception unused) {
                            e.printStackTrace();
                        }
                        f36847a = application;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    f36847a = application;
                    throw th;
                }
            }
        } catch (Exception e5) {
            e = e5;
            application = null;
        } catch (Throwable th3) {
            application = null;
            th = th3;
            f36847a = application;
            throw th;
        }
        f36847a = application;
    }

    public static Application a() {
        return f36847a;
    }
}

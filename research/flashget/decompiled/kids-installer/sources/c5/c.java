package c5;

import android.util.Log;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.logging.Level;

/* compiled from: AndroidLogger.java */
/* loaded from: classes5.dex */
public class c implements org.greenrobot.eventbus.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f10692a;

    public c(String str) {
        this.f10692a = str;
    }

    private int c(Level level) {
        int intValue = level.intValue();
        if (intValue < 800) {
            return intValue < 500 ? 2 : 3;
        }
        if (intValue < 900) {
            return 4;
        }
        return intValue < 1000 ? 5 : 6;
    }

    @Override // org.greenrobot.eventbus.f
    public void a(Level level, String str) {
        if (level != Level.OFF) {
            Log.println(c(level), this.f10692a, str);
        }
    }

    @Override // org.greenrobot.eventbus.f
    public void b(Level level, String str, Throwable th) {
        if (level != Level.OFF) {
            int c6 = c(level);
            String str2 = this.f10692a;
            StringBuilder a6 = androidx.constraintlayout.motion.widget.c.a(str, ProtectedSandApp.s("㎪"));
            a6.append(Log.getStackTraceString(th));
            Log.println(c6, str2, a6.toString());
        }
    }
}

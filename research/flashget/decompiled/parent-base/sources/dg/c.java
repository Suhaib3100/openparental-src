package dg;

import android.util.Log;
import java.util.logging.Level;

/* compiled from: AndroidLogger.java */
/* loaded from: classes6.dex */
public class c implements org.greenrobot.eventbus.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f73732a;

    public c(String str) {
        this.f73732a = str;
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
    public void a(Level level, String str, Throwable th) {
        if (level != Level.OFF) {
            int c5 = c(level);
            String str2 = this.f73732a;
            StringBuilder a5 = androidx.constraintlayout.core.e.a(str, "\n");
            a5.append(Log.getStackTraceString(th));
            Log.println(c5, str2, a5.toString());
        }
    }

    @Override // org.greenrobot.eventbus.f
    public void b(Level level, String str) {
        if (level != Level.OFF) {
            Log.println(c(level), this.f73732a, str);
        }
    }
}

package okhttp3.internal.platform.android;

import android.util.Log;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.collections.f1;
import kotlin.jvm.internal.l0;
import kotlin.text.h0;
import kotlin.text.j0;
import okhttp3.c0;

/* compiled from: AndroidLog.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J1\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0007R\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/platform/android/e;", "", "", "loggerName", "d", "logger", "tag", "Lkotlin/m2;", "c", "", "logLevel", "message", "", "t", "a", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "b", "I", "MAX_LOG_LENGTH", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/logging/Logger;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "configuredLoggers", "", "Ljava/util/Map;", "knownLoggers", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
@okhttp3.internal.c
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final int MAX_LOG_LENGTH = 4000;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Map<String, String> knownLoggers;

    /* renamed from: d, reason: collision with root package name */
    public static final e f31273d = new e();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final CopyOnWriteArraySet<Logger> configuredLoggers = new CopyOnWriteArraySet<>();

    static {
        Map<String, String> D0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = c0.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, ProtectedSandApp.s("攱"));
        }
        String name2 = c0.class.getName();
        l0.o(name2, ProtectedSandApp.s("攲"));
        linkedHashMap.put(name2, ProtectedSandApp.s("攳"));
        String name3 = okhttp3.internal.http2.d.class.getName();
        l0.o(name3, ProtectedSandApp.s("攴"));
        linkedHashMap.put(name3, ProtectedSandApp.s("攵"));
        String name4 = okhttp3.internal.concurrent.d.class.getName();
        l0.o(name4, ProtectedSandApp.s("收"));
        linkedHashMap.put(name4, ProtectedSandApp.s("攷"));
        linkedHashMap.put(ProtectedSandApp.s("攸"), ProtectedSandApp.s("改"));
        D0 = f1.D0(linkedHashMap);
        knownLoggers = D0;
    }

    private e() {
    }

    private final void c(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (configuredLoggers.add(logger)) {
            l0.o(logger, ProtectedSandApp.s("攺"));
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(f.f31274a);
        }
    }

    private final String d(String loggerName) {
        String V8;
        String str = knownLoggers.get(loggerName);
        if (str != null) {
            return str;
        }
        V8 = j0.V8(loggerName, 23);
        return V8;
    }

    public final void a(@d5.d String loggerName, int logLevel, @d5.d String message, @d5.e Throwable t5) {
        int o32;
        int min;
        l0.p(loggerName, ProtectedSandApp.s("攻"));
        l0.p(message, ProtectedSandApp.s("攼"));
        String d6 = d(loggerName);
        if (Log.isLoggable(d6, logLevel)) {
            if (t5 != null) {
                StringBuilder a6 = androidx.constraintlayout.motion.widget.c.a(message, ProtectedSandApp.s("攽"));
                a6.append(Log.getStackTraceString(t5));
                message = a6.toString();
            }
            int length = message.length();
            int i5 = 0;
            while (i5 < length) {
                o32 = h0.o3(message, '\n', i5, false, 4, null);
                if (o32 == -1) {
                    o32 = length;
                }
                while (true) {
                    min = Math.min(o32, i5 + MAX_LOG_LENGTH);
                    String substring = message.substring(i5, min);
                    l0.o(substring, ProtectedSandApp.s("放"));
                    Log.println(logLevel, d6, substring);
                    if (min >= o32) {
                        break;
                    } else {
                        i5 = min;
                    }
                }
                i5 = min + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry<String, String> entry : knownLoggers.entrySet()) {
            c(entry.getKey(), entry.getValue());
        }
    }
}

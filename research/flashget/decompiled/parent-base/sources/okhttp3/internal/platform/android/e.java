package okhttp3.internal.platform.android;

import android.util.Log;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.text.v;
import okhttp3.b0;

/* compiled from: AndroidLog.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0003R\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lokhttp3/internal/platform/android/e;", "", "<init>", "()V", "", "loggerName", "d", "(Ljava/lang/String;)Ljava/lang/String;", "logger", "tag", "Lkotlin/k2;", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "", "logLevel", "message", "", "t", "a", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "b", "I", "MAX_LOG_LENGTH", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/logging/Logger;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "configuredLoggers", "", "Ljava/util/Map;", "knownLoggers", "okhttp"}, k = 1, mv = {1, 4, 0})
@okhttp3.internal.c
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final int MAX_LOG_LENGTH = 4000;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Map<String, String> knownLoggers;

    /* renamed from: d, reason: collision with root package name */
    public static final e f84813d = new e();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final CopyOnWriteArraySet<Logger> configuredLoggers = new CopyOnWriteArraySet<>();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = b0.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, ProtectedSandApp.s("ᶾ"));
        }
        String name2 = b0.class.getName();
        l0.o(name2, ProtectedSandApp.s("ᶿ"));
        linkedHashMap.put(name2, ProtectedSandApp.s("᷀"));
        String name3 = okhttp3.internal.http2.d.class.getName();
        l0.o(name3, ProtectedSandApp.s("᷁"));
        linkedHashMap.put(name3, ProtectedSandApp.s("᷂"));
        String name4 = okhttp3.internal.concurrent.d.class.getName();
        l0.o(name4, ProtectedSandApp.s("᷃"));
        linkedHashMap.put(name4, ProtectedSandApp.s("᷄"));
        linkedHashMap.put(ProtectedSandApp.s("᷅"), ProtectedSandApp.s("᷆"));
        knownLoggers = z0.D0(linkedHashMap);
    }

    private e() {
    }

    private final void c(String logger, String tag) {
        Logger logger2 = Logger.getLogger(logger);
        if (configuredLoggers.add(logger2)) {
            l0.o(logger2, ProtectedSandApp.s("᷇"));
            logger2.setUseParentHandlers(false);
            logger2.setLevel(Log.isLoggable(tag, 3) ? Level.FINE : Log.isLoggable(tag, 4) ? Level.INFO : Level.WARNING);
            logger2.addHandler(f.f84814a);
        }
    }

    private final String d(String loggerName) {
        String str = knownLoggers.get(loggerName);
        return str != null ? str : v.V8(loggerName, 23);
    }

    public final void a(@fg.l String loggerName, int logLevel, @fg.l String message, @fg.m Throwable t4) {
        int min;
        l0.p(loggerName, ProtectedSandApp.s("᷈"));
        l0.p(message, ProtectedSandApp.s("᷉"));
        String d5 = d(loggerName);
        if (Log.isLoggable(d5, logLevel)) {
            if (t4 != null) {
                StringBuilder a5 = androidx.constraintlayout.core.e.a(message, ProtectedSandApp.s("᷊"));
                a5.append(Log.getStackTraceString(t4));
                message = a5.toString();
            }
            int length = message.length();
            int i4 = 0;
            while (i4 < length) {
                int o32 = v.o3(message, '\n', i4, false, 4, null);
                if (o32 == -1) {
                    o32 = length;
                }
                while (true) {
                    min = Math.min(o32, i4 + MAX_LOG_LENGTH);
                    String substring = message.substring(i4, min);
                    l0.o(substring, ProtectedSandApp.s("᷋"));
                    Log.println(logLevel, d5, substring);
                    if (min >= o32) {
                        break;
                    } else {
                        i4 = min;
                    }
                }
                i4 = min + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry<String, String> entry : knownLoggers.entrySet()) {
            c(entry.getKey(), entry.getValue());
        }
    }
}

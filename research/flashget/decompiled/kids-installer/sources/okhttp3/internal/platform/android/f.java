package okhttp3.internal.platform.android;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: AndroidLog.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lokhttp3/internal/platform/android/f;", "Ljava/util/logging/Handler;", "Ljava/util/logging/LogRecord;", "record", "Lkotlin/m2;", "publish", "flush", "close", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final f f31274a = new f();

    private f() {
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(@d5.d LogRecord logRecord) {
        int b6;
        l0.p(logRecord, ProtectedSandApp.s("政"));
        e eVar = e.f31273d;
        String loggerName = logRecord.getLoggerName();
        l0.o(loggerName, ProtectedSandApp.s("敀"));
        b6 = g.b(logRecord);
        String message = logRecord.getMessage();
        l0.o(message, ProtectedSandApp.s("敁"));
        eVar.a(loggerName, b6, message, logRecord.getThrown());
    }
}

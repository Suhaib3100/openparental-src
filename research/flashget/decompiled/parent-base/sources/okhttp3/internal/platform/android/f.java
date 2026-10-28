package okhttp3.internal.platform.android;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: AndroidLog.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u0003¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/platform/android/f;", "Ljava/util/logging/Handler;", "<init>", "()V", "Ljava/util/logging/LogRecord;", "record", "Lkotlin/k2;", "publish", "(Ljava/util/logging/LogRecord;)V", "flush", "close", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final f f84814a = new f();

    private f() {
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(@fg.l LogRecord record) {
        int b5;
        l0.p(record, ProtectedSandApp.s("᷌"));
        e eVar = e.f84813d;
        String loggerName = record.getLoggerName();
        l0.o(loggerName, ProtectedSandApp.s("᷍"));
        b5 = g.b(record);
        String message = record.getMessage();
        l0.o(message, ProtectedSandApp.s("᷎"));
        eVar.a(loggerName, b5, message, record.getThrown());
    }
}

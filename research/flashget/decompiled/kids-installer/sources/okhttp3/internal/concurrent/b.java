package okhttp3.internal.concurrent;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.messaging.w0;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.l0;
import kotlin.time.g;
import okhttp3.internal.http2.e;

/* compiled from: TaskLogger.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\u001a*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0080\bø\u0001\u0000\u001a7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a \u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0002\u001a\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/concurrent/a;", "task", "Lokhttp3/internal/concurrent/c;", "queue", "Lkotlin/Function0;", "", "messageBlock", "Lkotlin/m2;", "e", "T", "block", "d", "(Lokhttp3/internal/concurrent/a;Lokhttp3/internal/concurrent/c;Lq3/a;)Ljava/lang/Object;", "message", "c", "", "ns", "b", "okhttp"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class b {
    @d5.d
    public static final String b(long j5) {
        String str;
        long j6 = -999500000;
        String s5 = ProtectedSandApp.s("慕");
        if (j5 <= j6) {
            str = ((j5 - 500000000) / e.W) + s5;
        } else {
            long j7 = -999500;
            String s6 = ProtectedSandApp.s("慖");
            if (j5 <= j7) {
                str = ((j5 - 500000) / g.f27203a) + s6;
            } else {
                String s7 = ProtectedSandApp.s("慗");
                if (j5 <= 0) {
                    str = ((j5 - w0.f17634f) / 1000) + s7;
                } else if (j5 < 999500) {
                    str = ((j5 + w0.f17634f) / 1000) + s7;
                } else if (j5 < 999500000) {
                    str = ((j5 + 500000) / g.f27203a) + s6;
                } else {
                    str = ((j5 + 500000000) / e.W) + s5;
                }
            }
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.f23622a;
        String format = String.format(ProtectedSandApp.s("慘"), Arrays.copyOf(new Object[]{str}, 1));
        l0.o(format, ProtectedSandApp.s("慙"));
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(a aVar, c cVar, String str) {
        d.INSTANCE.getClass();
        Logger logger = d.f30816i;
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.h());
        sb.append(' ');
        StringCompanionObject stringCompanionObject = StringCompanionObject.f23622a;
        String format = String.format(ProtectedSandApp.s("慚"), Arrays.copyOf(new Object[]{str}, 1));
        l0.o(format, ProtectedSandApp.s("慛"));
        sb.append(format);
        sb.append(ProtectedSandApp.s("慜"));
        sb.append(aVar.getName());
        logger.fine(sb.toString());
    }

    public static final <T> T d(@d5.d a aVar, @d5.d c cVar, @d5.d q3.a<? extends T> aVar2) {
        long j5;
        l0.p(aVar, ProtectedSandApp.s("慝"));
        l0.p(cVar, ProtectedSandApp.s("慞"));
        l0.p(aVar2, ProtectedSandApp.s("慟"));
        d.INSTANCE.getClass();
        boolean isLoggable = d.f30816i.isLoggable(Level.FINE);
        if (isLoggable) {
            j5 = cVar.k().getBackend().nanoTime();
            c(aVar, cVar, ProtectedSandApp.s("慠"));
        } else {
            j5 = -1;
        }
        try {
            T n5 = aVar2.n();
            if (isLoggable) {
                c(aVar, cVar, ProtectedSandApp.s("慡") + b(cVar.k().getBackend().nanoTime() - j5));
            }
            return n5;
        } catch (Throwable th) {
            if (isLoggable) {
                c(aVar, cVar, ProtectedSandApp.s("慢") + b(cVar.k().getBackend().nanoTime() - j5));
            }
            throw th;
        }
    }

    public static final void e(@d5.d a aVar, @d5.d c cVar, @d5.d q3.a<String> aVar2) {
        l0.p(aVar, ProtectedSandApp.s("慣"));
        l0.p(cVar, ProtectedSandApp.s("慤"));
        l0.p(aVar2, ProtectedSandApp.s("慥"));
        d.INSTANCE.getClass();
        if (d.f30816i.isLoggable(Level.FINE)) {
            c(aVar, cVar, aVar2.n());
        }
    }
}

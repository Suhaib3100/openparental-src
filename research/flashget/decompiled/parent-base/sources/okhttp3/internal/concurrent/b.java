package okhttp3.internal.concurrent;

import androidx.compose.material3.s3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.t1;

/* compiled from: TaskLogger.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\u001a1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/concurrent/a;", "task", "Lokhttp3/internal/concurrent/c;", "queue", "Lkotlin/Function0;", "", "messageBlock", "Lkotlin/k2;", "e", "(Lokhttp3/internal/concurrent/a;Lokhttp3/internal/concurrent/c;Lld/a;)V", "T", "block", "d", "(Lokhttp3/internal/concurrent/a;Lokhttp3/internal/concurrent/c;Lld/a;)Ljava/lang/Object;", "message", "c", "(Lokhttp3/internal/concurrent/a;Lokhttp3/internal/concurrent/c;Ljava/lang/String;)V", "", "ns", "b", "(J)Ljava/lang/String;", "okhttp"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class b {
    @l
    public static final String b(long j4) {
        String a5;
        long j5 = -999500000;
        String s4 = ProtectedSandApp.s("ꁪ\u0001");
        if (j4 <= j5) {
            a5 = android.support.v4.media.session.b.a(new StringBuilder(), (j4 - 500000000) / 1000000000, s4);
        } else {
            long j6 = -999500;
            String s5 = ProtectedSandApp.s("ꁫ\u0001");
            if (j4 <= j6) {
                a5 = android.support.v4.media.session.b.a(new StringBuilder(), (j4 - 500000) / 1000000, s5);
            } else {
                String s6 = ProtectedSandApp.s("ꁬ\u0001");
                a5 = j4 <= 0 ? android.support.v4.media.session.b.a(new StringBuilder(), (j4 - 500) / 1000, s6) : j4 < ((long) 999500) ? android.support.v4.media.session.b.a(new StringBuilder(), (j4 + 500) / 1000, s6) : j4 < ((long) 999500000) ? android.support.v4.media.session.b.a(new StringBuilder(), (j4 + 500000) / 1000000, s5) : android.support.v4.media.session.b.a(new StringBuilder(), (j4 + 500000000) / 1000000000, s4);
            }
        }
        t1 t1Var = t1.f75371a;
        return s3.a(new Object[]{a5}, 1, ProtectedSandApp.s("ꁭ\u0001"), ProtectedSandApp.s("ꁮ\u0001"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(a aVar, c cVar, String str) {
        d.INSTANCE.getClass();
        Logger logger = d.f84337i;
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.h());
        sb.append(' ');
        t1 t1Var = t1.f75371a;
        String format = String.format(ProtectedSandApp.s("ꁯ\u0001"), Arrays.copyOf(new Object[]{str}, 1));
        l0.o(format, ProtectedSandApp.s("ꁮ\u0001"));
        sb.append(format);
        sb.append(ProtectedSandApp.s("ꁰ\u0001"));
        sb.append(aVar.getName());
        logger.fine(sb.toString());
    }

    public static final <T> T d(@l a aVar, @l c cVar, @l ld.a<? extends T> aVar2) {
        long j4;
        l0.p(aVar, ProtectedSandApp.s("ꁱ\u0001"));
        l0.p(cVar, ProtectedSandApp.s("ꁲ\u0001"));
        l0.p(aVar2, ProtectedSandApp.s("ꁳ\u0001"));
        d.INSTANCE.getClass();
        boolean isLoggable = d.f84337i.isLoggable(Level.FINE);
        if (isLoggable) {
            j4 = cVar.k().getBackend().nanoTime();
            c(aVar, cVar, ProtectedSandApp.s("ꁴ\u0001"));
        } else {
            j4 = -1;
        }
        try {
            T invoke = aVar2.invoke();
            if (isLoggable) {
                c(aVar, cVar, ProtectedSandApp.s("ꁵ\u0001") + b(cVar.k().getBackend().nanoTime() - j4));
            }
            return invoke;
        } catch (Throwable th) {
            if (isLoggable) {
                c(aVar, cVar, ProtectedSandApp.s("ꁶ\u0001") + b(cVar.k().getBackend().nanoTime() - j4));
            }
            throw th;
        }
    }

    public static final void e(@l a aVar, @l c cVar, @l ld.a<String> aVar2) {
        l0.p(aVar, ProtectedSandApp.s("ꁱ\u0001"));
        l0.p(cVar, ProtectedSandApp.s("ꁲ\u0001"));
        l0.p(aVar2, ProtectedSandApp.s("ꁷ\u0001"));
        d.INSTANCE.getClass();
        if (d.f84337i.isLoggable(Level.FINE)) {
            c(aVar, cVar, aVar2.invoke());
        }
    }
}

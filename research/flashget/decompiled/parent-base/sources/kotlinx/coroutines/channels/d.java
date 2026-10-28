package kotlinx.coroutines.channels;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.x0;
import kotlinx.coroutines.a3;
import kotlinx.coroutines.channels.e0;

/* compiled from: BroadcastChannel.kt */
@kotlin.k(level = kotlin.m.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\fH'¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/channels/d;", "E", "Lkotlinx/coroutines/channels/e0;", "Lkotlinx/coroutines/channels/d0;", "w", "()Lkotlinx/coroutines/channels/d0;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lkotlin/k2;", "b", "(Ljava/util/concurrent/CancellationException;)V", "", "", "f", "(Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@a3
/* loaded from: classes7.dex */
public interface d<E> extends e0<E> {

    /* compiled from: BroadcastChannel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(d dVar, CancellationException cancellationException, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("薳\u0001"));
            }
            if ((i4 & 1) != 0) {
                cancellationException = null;
            }
            dVar.b(cancellationException);
        }

        public static /* synthetic */ boolean b(d dVar, Throwable th, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("薳\u0001"));
            }
            if ((i4 & 1) != 0) {
                th = null;
            }
            return dVar.f(th);
        }

        @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @x0(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@fg.l d<E> dVar, E e4) {
            return e0.a.c(dVar, e4);
        }
    }

    void b(@fg.m CancellationException cause);

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility only")
    /* synthetic */ boolean f(Throwable cause);

    @fg.l
    d0<E> w();
}

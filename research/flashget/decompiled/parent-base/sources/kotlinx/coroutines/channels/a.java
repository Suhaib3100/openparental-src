package kotlinx.coroutines.channels;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.v1;
import kotlinx.coroutines.w0;

/* compiled from: Actor.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/channels/a;", "E", "Lkotlinx/coroutines/channels/m;", "Lkotlinx/coroutines/channels/c;", "Lkotlin/coroutines/g;", "parentContext", "Lkotlinx/coroutines/channels/l;", "channel", "", "active", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/l;Z)V", "", "cause", "Lkotlin/k2;", "E1", "(Ljava/lang/Throwable;)V", "exception", "j1", "(Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
class a<E> extends m<E> implements c<E> {
    public a(@fg.l kotlin.coroutines.g gVar, @fg.l l<E> lVar, boolean z4) {
        super(gVar, lVar, false, z4);
        l1((k2) gVar.c(k2.INSTANCE));
    }

    @Override // kotlinx.coroutines.r2
    protected void E1(@fg.m Throwable cause) {
        l<E> b22 = b2();
        if (cause != null) {
            r1 = cause instanceof CancellationException ? (CancellationException) cause : null;
            if (r1 == null) {
                r1 = v1.a(w0.a(this) + ProtectedSandApp.s("薲\u0001"), cause);
            }
        }
        b22.b(r1);
    }

    @Override // kotlinx.coroutines.r2
    protected boolean j1(@fg.l Throwable exception) {
        o0.b(getF75269b(), exception);
        return true;
    }
}

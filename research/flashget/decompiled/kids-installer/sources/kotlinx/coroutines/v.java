package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

/* compiled from: CompletionState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/v;", "Lkotlinx/coroutines/f0;", "", "c", "()Z", "Lkotlin/coroutines/d;", "continuation", "", "cause", "handled", "<init>", "(Lkotlin/coroutines/d;Ljava/lang/Throwable;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class v extends f0 {

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f29043c = AtomicIntegerFieldUpdater.newUpdater(v.class, ProtectedSandApp.s("应"));

    @d5.d
    private volatile /* synthetic */ int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v(@d5.d kotlin.coroutines.Continuation<?> r3, @d5.e java.lang.Throwable r4, boolean r5) {
        /*
            r2 = this;
            if (r4 != 0) goto L22
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "底"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = "庖"
            java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L22:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.v.<init>(kotlin.coroutines.d, java.lang.Throwable, boolean):void");
    }

    public final boolean c() {
        return f29043c.compareAndSet(this, 0, 1);
    }
}

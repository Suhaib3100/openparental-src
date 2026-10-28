package kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Timing.kt */
@kd.i(name = "TimingKt")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u001a.\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a.\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "block", "", "b", "(Lld/a;)J", "a", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: ge.b, reason: from Kotlin metadata */
/* loaded from: classes7.dex */
public final class Function0 {
    public static final long a(@fg.l ld.a<k2> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("恎\u0001"));
        long nanoTime = System.nanoTime();
        aVar.invoke();
        return System.nanoTime() - nanoTime;
    }

    public static final long b(@fg.l ld.a<k2> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("恎\u0001"));
        long currentTimeMillis = System.currentTimeMillis();
        aVar.invoke();
        return System.currentTimeMillis() - currentTimeMillis;
    }
}

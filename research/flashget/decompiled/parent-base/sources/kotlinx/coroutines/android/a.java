package kotlinx.coroutines.android;

import android.os.Looper;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.internal.c0;
import kotlinx.coroutines.v2;

/* compiled from: HandlerDispatcher.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/android/a;", "Lkotlinx/coroutines/internal/c0;", "<init>", "()V", "", "allFactories", "Lkotlinx/coroutines/v2;", "b", "(Ljava/util/List;)Lkotlinx/coroutines/v2;", "", "a", "()Ljava/lang/String;", "", "c", "()I", "loadPriority", "kotlinx-coroutines-android"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class a implements c0 {
    @Override // kotlinx.coroutines.internal.c0
    @l
    public String a() {
        return ProtectedSandApp.s("薚\u0001");
    }

    @Override // kotlinx.coroutines.internal.c0
    @l
    public v2 b(@l List<? extends c0> allFactories) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new d(g.e(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException(ProtectedSandApp.s("薛\u0001"));
    }

    @Override // kotlinx.coroutines.internal.c0
    public int c() {
        return a0.f80730j;
    }
}

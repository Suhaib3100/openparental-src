package kotlinx.coroutines.android;

import android.os.Looper;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.y2;

/* compiled from: HandlerDispatcher.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/android/a;", "Lkotlinx/coroutines/internal/d0;", "", "allFactories", "Lkotlinx/coroutines/y2;", "b", "", "a", "", "c", "()I", "loadPriority", "<init>", "()V", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class a implements d0 {
    @Override // kotlinx.coroutines.internal.d0
    @d5.d
    public String a() {
        return ProtectedSandApp.s("岝");
    }

    @Override // kotlinx.coroutines.internal.d0
    @d5.d
    public y2 b(@d5.d List<? extends d0> allFactories) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new d(g.d(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException(ProtectedSandApp.s("岞"));
    }

    @Override // kotlinx.coroutines.internal.d0
    public int c() {
        return b0.f28670j;
    }
}

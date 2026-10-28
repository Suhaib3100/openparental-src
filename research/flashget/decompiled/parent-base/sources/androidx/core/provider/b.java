package androidx.core.provider;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.o0;

/* compiled from: CalleeHandler.java */
/* loaded from: classes3.dex */
class b {
    private b() {
    }

    @o0
    static Handler a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}

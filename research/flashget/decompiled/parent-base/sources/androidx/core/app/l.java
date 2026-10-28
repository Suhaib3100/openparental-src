package androidx.core.app;

import android.os.Bundle;
import android.os.IBinder;

/* compiled from: BundleCompat.java */
@Deprecated
/* loaded from: classes3.dex */
public final class l {
    private l() {
    }

    @androidx.annotation.q0
    @androidx.annotation.w0(expression = "bundle.getBinder(key)")
    @Deprecated
    public static IBinder a(@androidx.annotation.o0 Bundle bundle, @androidx.annotation.q0 String str) {
        return bundle.getBinder(str);
    }

    @androidx.annotation.w0(expression = "bundle.putBinder(key, binder)")
    @Deprecated
    public static void b(@androidx.annotation.o0 Bundle bundle, @androidx.annotation.q0 String str, @androidx.annotation.q0 IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}

package c5;

import android.os.Looper;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.k;

/* compiled from: DefaultAndroidMainThreadSupport.java */
/* loaded from: classes5.dex */
public class e implements g {
    @Override // org.greenrobot.eventbus.g
    public k a(org.greenrobot.eventbus.c cVar) {
        return new org.greenrobot.eventbus.e(cVar, Looper.getMainLooper(), 10);
    }

    @Override // org.greenrobot.eventbus.g
    public boolean b() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}

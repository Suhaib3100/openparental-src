package dagger.android;

import android.app.Application;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes7.dex */
public abstract class DaggerApplication extends Application implements m {

    /* renamed from: b, reason: collision with root package name */
    @cd.a
    volatile DispatchingAndroidInjector<Object> f73650b;

    private void c() {
        if (this.f73650b == null) {
            synchronized (this) {
                try {
                    if (this.f73650b == null) {
                        b().i(this);
                        if (this.f73650b == null) {
                            throw new IllegalStateException(ProtectedSandApp.s("彙\u0001"));
                        }
                    }
                } finally {
                }
            }
        }
    }

    @f9.g
    protected abstract d<? extends DaggerApplication> b();

    @Override // dagger.android.m
    public d<Object> h() {
        c();
        return this.f73650b;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        c();
    }
}

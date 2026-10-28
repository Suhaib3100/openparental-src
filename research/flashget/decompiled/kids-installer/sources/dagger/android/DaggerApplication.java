package dagger.android;

import android.app.Application;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* loaded from: classes5.dex */
public abstract class DaggerApplication extends Application implements m {

    /* renamed from: o, reason: collision with root package name */
    @h3.a
    volatile DispatchingAndroidInjector<Object> f22337o;

    private void b() {
        if (this.f22337o == null) {
            synchronized (this) {
                if (this.f22337o == null) {
                    a().b(this);
                    if (this.f22337o == null) {
                        throw new IllegalStateException(ProtectedSandApp.s("㚣"));
                    }
                }
            }
        }
    }

    @x1.g
    protected abstract d<? extends DaggerApplication> a();

    @Override // dagger.android.m
    public d<Object> c() {
        b();
        return this.f22337o;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        b();
    }
}

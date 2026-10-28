package dagger.android;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.q0;

/* loaded from: classes5.dex */
public abstract class DaggerActivity extends Activity implements m {

    /* renamed from: o, reason: collision with root package name */
    @h3.a
    DispatchingAndroidInjector<Object> f22336o;

    @Override // dagger.android.m
    public d<Object> c() {
        return this.f22336o;
    }

    @Override // android.app.Activity
    protected void onCreate(@q0 Bundle savedInstanceState) {
        a.b(this);
        super.onCreate(savedInstanceState);
    }
}

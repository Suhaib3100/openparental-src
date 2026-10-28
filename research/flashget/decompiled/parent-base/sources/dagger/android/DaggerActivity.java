package dagger.android;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.q0;

/* loaded from: classes7.dex */
public abstract class DaggerActivity extends Activity implements m {

    /* renamed from: b, reason: collision with root package name */
    @cd.a
    DispatchingAndroidInjector<Object> f73649b;

    @Override // dagger.android.m
    public d<Object> h() {
        return this.f73649b;
    }

    @Override // android.app.Activity
    protected void onCreate(@q0 Bundle savedInstanceState) {
        a.b(this);
        super.onCreate(savedInstanceState);
    }
}

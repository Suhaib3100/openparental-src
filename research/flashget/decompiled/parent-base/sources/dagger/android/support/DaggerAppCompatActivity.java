package dagger.android.support;

import android.os.Bundle;
import androidx.annotation.j0;
import androidx.annotation.o;
import androidx.annotation.q0;
import androidx.appcompat.app.AppCompatActivity;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.m;

/* loaded from: classes7.dex */
public abstract class DaggerAppCompatActivity extends AppCompatActivity implements m {

    /* renamed from: b, reason: collision with root package name */
    @cd.a
    DispatchingAndroidInjector<Object> f73663b;

    public DaggerAppCompatActivity() {
    }

    @Override // dagger.android.m
    public dagger.android.d<Object> h() {
        return this.f73663b;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@q0 Bundle savedInstanceState) {
        dagger.android.a.b(this);
        super.onCreate(savedInstanceState);
    }

    @o
    public DaggerAppCompatActivity(@j0 int contentLayoutId) {
        super(contentLayoutId);
    }
}

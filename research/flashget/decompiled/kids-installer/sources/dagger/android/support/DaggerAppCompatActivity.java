package dagger.android.support;

import android.os.Bundle;
import androidx.annotation.j0;
import androidx.annotation.o;
import androidx.annotation.q0;
import androidx.appcompat.app.AppCompatActivity;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.m;

/* loaded from: classes6.dex */
public abstract class DaggerAppCompatActivity extends AppCompatActivity implements m {

    @h3.a
    DispatchingAndroidInjector<Object> P;

    public DaggerAppCompatActivity() {
    }

    @Override // dagger.android.m
    public dagger.android.d<Object> c() {
        return this.P;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@q0 Bundle savedInstanceState) {
        dagger.android.a.b(this);
        super.onCreate(savedInstanceState);
    }

    @o
    public DaggerAppCompatActivity(@j0 int contentLayoutId) {
        super(contentLayoutId);
    }
}

package android.view;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.annotation.o0;

/* compiled from: AndroidViewModel.java */
/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0524b extends c1 {

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private Application f8488d;

    public C0524b(@o0 Application application) {
        this.f8488d = application;
    }

    @o0
    public <T extends Application> T g() {
        return (T) this.f8488d;
    }
}

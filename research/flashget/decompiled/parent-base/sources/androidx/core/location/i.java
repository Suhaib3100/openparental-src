package androidx.core.location;

import android.location.LocationManager;
import androidx.core.location.j;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationManager f26404a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j.C0419j f26405b;

    public /* synthetic */ i(LocationManager locationManager, j.C0419j c0419j) {
        this.f26404a = locationManager;
        this.f26405b = c0419j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean j4;
        j4 = j.j(this.f26404a, this.f26405b);
        return j4;
    }
}

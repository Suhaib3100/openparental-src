package androidx.core.location;

import android.location.LocationManager;
import androidx.core.location.w;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationManager f4892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w.i f4893b;

    public /* synthetic */ t(LocationManager locationManager, w.i iVar) {
        this.f4892a = locationManager;
        this.f4893b = iVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean i5;
        i5 = w.i(this.f4892a, this.f4893b);
        return i5;
    }
}

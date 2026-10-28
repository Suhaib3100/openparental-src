package androidx.view;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.i;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k;

/* compiled from: LifecycleService.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/LifecycleService;", "Landroid/app/Service;", "Landroidx/lifecycle/e0;", "<init>", "()V", "Lkotlin/k2;", "onCreate", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "startId", "onStart", "(Landroid/content/Intent;I)V", "flags", "onStartCommand", "(Landroid/content/Intent;II)I", "onDestroy", "Landroidx/lifecycle/e1;", "b", "Landroidx/lifecycle/e1;", "dispatcher", "Landroidx/lifecycle/w;", "getLifecycle", "()Landroidx/lifecycle/w;", "lifecycle", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public class LifecycleService extends Service implements InterfaceC1423e0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final e1 dispatcher = new e1(this);

    @Override // androidx.view.InterfaceC1423e0
    @l
    public AbstractC1450w getLifecycle() {
        return this.dispatcher.a();
    }

    @Override // android.app.Service
    @i
    @m
    public IBinder onBind(@l Intent intent) {
        l0.p(intent, "intent");
        this.dispatcher.b();
        return null;
    }

    @Override // android.app.Service
    @i
    public void onCreate() {
        this.dispatcher.c();
        super.onCreate();
    }

    @Override // android.app.Service
    @i
    public void onDestroy() {
        this.dispatcher.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    @i
    @k(message = "Deprecated in Java")
    public void onStart(@m Intent intent, int startId) {
        this.dispatcher.e();
        super.onStart(intent, startId);
    }

    @Override // android.app.Service
    @i
    public int onStartCommand(@m Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }
}

package androidx.view;

import android.os.Handler;
import androidx.view.AbstractC1450w;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ServiceLifecycleDispatcher.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/e1;", "", "Landroidx/lifecycle/e0;", "provider", "<init>", "(Landroidx/lifecycle/e0;)V", "Landroidx/lifecycle/w$a;", "event", "Lkotlin/k2;", "f", "(Landroidx/lifecycle/w$a;)V", "c", "()V", "b", "e", "d", "Landroidx/lifecycle/g0;", "a", "Landroidx/lifecycle/g0;", "registry", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroidx/lifecycle/e1$a;", "Landroidx/lifecycle/e1$a;", "lastDispatchRunnable", "Landroidx/lifecycle/w;", "()Landroidx/lifecycle/w;", "lifecycle", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public class e1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final g0 registry;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final Handler handler;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private a lastDispatchRunnable;

    /* compiled from: ServiceLifecycleDispatcher.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/e1$a;", "Ljava/lang/Runnable;", "Landroidx/lifecycle/g0;", "registry", "Landroidx/lifecycle/w$a;", "event", "<init>", "(Landroidx/lifecycle/g0;Landroidx/lifecycle/w$a;)V", "Lkotlin/k2;", "run", "()V", "b", "Landroidx/lifecycle/g0;", "c", "Landroidx/lifecycle/w$a;", "a", "()Landroidx/lifecycle/w$a;", "", "d", "Z", "wasExecuted", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final g0 registry;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @l
        private final AbstractC1450w.a event;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean wasExecuted;

        public a(@l g0 registry, @l AbstractC1450w.a event) {
            l0.p(registry, "registry");
            l0.p(event, "event");
            this.registry = registry;
            this.event = event;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final AbstractC1450w.a getEvent() {
            return this.event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wasExecuted) {
                return;
            }
            this.registry.l(this.event);
            this.wasExecuted = true;
        }
    }

    public e1(@l InterfaceC1423e0 provider) {
        l0.p(provider, "provider");
        this.registry = new g0(provider);
        this.handler = new Handler();
    }

    private final void f(AbstractC1450w.a event) {
        a aVar = this.lastDispatchRunnable;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.registry, event);
        this.lastDispatchRunnable = aVar2;
        Handler handler = this.handler;
        l0.m(aVar2);
        handler.postAtFrontOfQueue(aVar2);
    }

    @l
    public AbstractC1450w a() {
        return this.registry;
    }

    public void b() {
        f(AbstractC1450w.a.ON_START);
    }

    public void c() {
        f(AbstractC1450w.a.ON_CREATE);
    }

    public void d() {
        f(AbstractC1450w.a.ON_STOP);
        f(AbstractC1450w.a.ON_DESTROY);
    }

    public void e() {
        f(AbstractC1450w.a.ON_START);
    }
}

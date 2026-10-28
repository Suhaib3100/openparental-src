package androidx.view;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.m1;
import androidx.annotation.u;
import androidx.annotation.x0;
import androidx.view.AbstractC1450w;
import androidx.view.v0;
import fg.l;
import fg.m;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: ProcessLifecycleOwner.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0002*\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Landroidx/lifecycle/u0;", "Landroidx/lifecycle/e0;", "<init>", "()V", "Lkotlin/k2;", "f", "e", "d", "g", "j", "k", "Landroid/content/Context;", "context", "h", "(Landroid/content/Context;)V", "", "b", "I", "startedCounter", "c", "resumedCounter", "", "Z", "pauseSent", "stopSent", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroidx/lifecycle/g0;", "Landroidx/lifecycle/g0;", "registry", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "delayedPauseRunnable", "Landroidx/lifecycle/v0$a;", "i", "Landroidx/lifecycle/v0$a;", "initializationListener", "Landroidx/lifecycle/w;", "getLifecycle", "()Landroidx/lifecycle/w;", "lifecycle", "a", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class u0 implements InterfaceC1423e0 {

    /* renamed from: k, reason: collision with root package name */
    public static final long f30446k = 700;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int startedCounter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int resumedCounter;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @m
    private Handler handler;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: l, reason: collision with root package name */
    @l
    private static final u0 f30447l = new u0();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean pauseSent = true;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean stopSent = true;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    private final g0 registry = new g0(this);

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    private final Runnable delayedPauseRunnable = new Runnable() { // from class: androidx.lifecycle.t0
        @Override // java.lang.Runnable
        public final void run() {
            u0.i(u0.this);
        }
    };

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @l
    private final v0.a initializationListener = new d();

    /* compiled from: ProcessLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/u0$a;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/app/Application$ActivityLifecycleCallbacks;", "callback", "Lkotlin/k2;", "a", "(Landroid/app/Activity;Landroid/app/Application$ActivityLifecycleCallbacks;)V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @x0(29)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public static final a f30456a = new a();

        private a() {
        }

        @u
        @n
        public static final void a(@l Activity activity, @l Application.ActivityLifecycleCallbacks callback) {
            l0.p(activity, "activity");
            l0.p(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0000X\u0081T¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0003R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/u0$b;", "", "<init>", "()V", "Landroidx/lifecycle/e0;", "a", "()Landroidx/lifecycle/e0;", "Landroid/content/Context;", "context", "Lkotlin/k2;", "c", "(Landroid/content/Context;)V", "", "TIMEOUT_MS", "J", "b", "Landroidx/lifecycle/u0;", "newInstance", "Landroidx/lifecycle/u0;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.u0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @m1
        public static /* synthetic */ void b() {
        }

        @l
        @n
        public final InterfaceC1423e0 a() {
            return u0.f30447l;
        }

        @n
        public final void c(@l Context context) {
            l0.p(context, "context");
            u0.f30447l.h(context);
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"androidx/lifecycle/u0$c", "Landroidx/lifecycle/p;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/k2;", "onActivityPreCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityCreated", "onActivityPaused", "(Landroid/app/Activity;)V", "onActivityStopped", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends C1440p {

        /* compiled from: ProcessLifecycleOwner.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/lifecycle/u0$c$a", "Landroidx/lifecycle/p;", "Landroid/app/Activity;", "activity", "Lkotlin/k2;", "onActivityPostStarted", "(Landroid/app/Activity;)V", "onActivityPostResumed", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a extends C1440p {
            final /* synthetic */ u0 this$0;

            a(u0 u0Var) {
                this.this$0 = u0Var;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(@l Activity activity) {
                l0.p(activity, "activity");
                this.this$0.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(@l Activity activity) {
                l0.p(activity, "activity");
                this.this$0.f();
            }
        }

        c() {
        }

        @Override // androidx.view.C1440p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@l Activity activity, @m Bundle savedInstanceState) {
            l0.p(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                v0.INSTANCE.b(activity).h(u0.this.initializationListener);
            }
        }

        @Override // androidx.view.C1440p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@l Activity activity) {
            l0.p(activity, "activity");
            u0.this.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        @x0(29)
        public void onActivityPreCreated(@l Activity activity, @m Bundle savedInstanceState) {
            l0.p(activity, "activity");
            a.a(activity, new a(u0.this));
        }

        @Override // androidx.view.C1440p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@l Activity activity) {
            l0.p(activity, "activity");
            u0.this.g();
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"androidx/lifecycle/u0$d", "Landroidx/lifecycle/v0$a;", "Lkotlin/k2;", "a", "()V", "onStart", "onResume", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements v0.a {
        d() {
        }

        @Override // androidx.lifecycle.v0.a
        public void a() {
        }

        @Override // androidx.lifecycle.v0.a
        public void onResume() {
            u0.this.e();
        }

        @Override // androidx.lifecycle.v0.a
        public void onStart() {
            u0.this.f();
        }
    }

    private u0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(u0 this$0) {
        l0.p(this$0, "this$0");
        this$0.j();
        this$0.k();
    }

    @l
    @n
    public static final InterfaceC1423e0 l() {
        INSTANCE.getClass();
        return f30447l;
    }

    @n
    public static final void m(@l Context context) {
        INSTANCE.c(context);
    }

    public final void d() {
        int i4 = this.resumedCounter - 1;
        this.resumedCounter = i4;
        if (i4 == 0) {
            Handler handler = this.handler;
            l0.m(handler);
            handler.postDelayed(this.delayedPauseRunnable, 700L);
        }
    }

    public final void e() {
        int i4 = this.resumedCounter + 1;
        this.resumedCounter = i4;
        if (i4 == 1) {
            if (this.pauseSent) {
                this.registry.l(AbstractC1450w.a.ON_RESUME);
                this.pauseSent = false;
            } else {
                Handler handler = this.handler;
                l0.m(handler);
                handler.removeCallbacks(this.delayedPauseRunnable);
            }
        }
    }

    public final void f() {
        int i4 = this.startedCounter + 1;
        this.startedCounter = i4;
        if (i4 == 1 && this.stopSent) {
            this.registry.l(AbstractC1450w.a.ON_START);
            this.stopSent = false;
        }
    }

    public final void g() {
        this.startedCounter--;
        k();
    }

    @Override // androidx.view.InterfaceC1423e0
    @l
    public AbstractC1450w getLifecycle() {
        return this.registry;
    }

    public final void h(@l Context context) {
        l0.p(context, "context");
        this.handler = new Handler();
        this.registry.l(AbstractC1450w.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        l0.n(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void j() {
        if (this.resumedCounter == 0) {
            this.pauseSent = true;
            this.registry.l(AbstractC1450w.a.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.startedCounter == 0 && this.pauseSent) {
            this.registry.l(AbstractC1450w.a.ON_STOP);
            this.stopSent = true;
        }
    }
}

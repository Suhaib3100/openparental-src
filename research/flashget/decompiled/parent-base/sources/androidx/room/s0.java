package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.room.e0;
import androidx.room.f0;
import androidx.room.m0;
import androidx.room.s0;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* compiled from: MultiInstanceInvalidationClient.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010 \u001a\n \u001d*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010&\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\"\u001a\u0004\b\u001e\u0010#\"\u0004\b$\u0010%R\"\u0010-\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00104\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0017\u00108\u001a\u0002058\u0006¢\u0006\f\n\u0004\b)\u00106\u001a\u0004\b\u0019\u00107R\u0017\u0010>\u001a\u0002098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010C\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b0\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010H\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bA\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010I\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bF\u0010E\u001a\u0004\b:\u0010G¨\u0006J"}, d2 = {"Landroidx/room/s0;", "", "Landroid/content/Context;", "context", "", "name", "Landroid/content/Intent;", "serviceIntent", "Landroidx/room/m0;", "invalidationTracker", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroidx/room/m0;Ljava/util/concurrent/Executor;)V", "Lkotlin/k2;", "s", "()V", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "b", "Landroidx/room/m0;", "f", "()Landroidx/room/m0;", "c", "Ljava/util/concurrent/Executor;", "e", "()Ljava/util/concurrent/Executor;", "kotlin.jvm.PlatformType", "d", "Landroid/content/Context;", "appContext", "", "I", "()I", "o", "(I)V", "clientId", "Landroidx/room/m0$c;", "Landroidx/room/m0$c;", "h", "()Landroidx/room/m0$c;", "p", "(Landroidx/room/m0$c;)V", "observer", "Landroidx/room/f0;", "Landroidx/room/f0;", "j", "()Landroidx/room/f0;", "q", "(Landroidx/room/f0;)V", "service", "Landroidx/room/e0;", "Landroidx/room/e0;", "()Landroidx/room/e0;", "callback", "Ljava/util/concurrent/atomic/AtomicBoolean;", "i", "Ljava/util/concurrent/atomic/AtomicBoolean;", "m", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "stopped", "Landroid/content/ServiceConnection;", "Landroid/content/ServiceConnection;", "k", "()Landroid/content/ServiceConnection;", "serviceConnection", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "l", "()Ljava/lang/Runnable;", "setUpRunnable", "removeObserverRunnable", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nMultiInstanceInvalidationClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiInstanceInvalidationClient.kt\nandroidx/room/MultiInstanceInvalidationClient\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,130:1\n37#2,2:131\n*S KotlinDebug\n*F\n+ 1 MultiInstanceInvalidationClient.kt\nandroidx/room/MultiInstanceInvalidationClient\n*L\n95#1:131,2\n*E\n"})
/* loaded from: classes3.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m0 invalidationTracker;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Executor executor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int clientId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public m0.c observer;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private f0 service;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e0 callback;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AtomicBoolean stopped;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ServiceConnection serviceConnection;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Runnable setUpRunnable;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Runnable removeObserverRunnable;

    /* compiled from: MultiInstanceInvalidationClient.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"androidx/room/s0$a", "Landroidx/room/m0$c;", "", "", "tables", "Lkotlin/k2;", "c", "(Ljava/util/Set;)V", "", "b", "()Z", "isRemote", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nMultiInstanceInvalidationClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiInstanceInvalidationClient.kt\nandroidx/room/MultiInstanceInvalidationClient$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,130:1\n37#2,2:131\n*S KotlinDebug\n*F\n+ 1 MultiInstanceInvalidationClient.kt\nandroidx/room/MultiInstanceInvalidationClient$1\n*L\n102#1:131,2\n*E\n"})
    public static final class a extends m0.c {
        a(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.m0.c
        public boolean b() {
            return true;
        }

        @Override // androidx.room.m0.c
        public void c(@fg.l Set<String> tables) {
            kotlin.jvm.internal.l0.p(tables, "tables");
            if (s0.this.getStopped().get()) {
                return;
            }
            try {
                f0 service = s0.this.getService();
                if (service != null) {
                    service.n(s0.this.getClientId(), (String[]) tables.toArray(new String[0]));
                }
            } catch (RemoteException unused) {
            }
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/room/s0$b", "Landroidx/room/e0$b;", "", "", "tables", "Lkotlin/k2;", "e", "([Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends e0.b {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void G(s0 this$0, String[] tables) {
            kotlin.jvm.internal.l0.p(this$0, "this$0");
            kotlin.jvm.internal.l0.p(tables, "$tables");
            this$0.getInvalidationTracker().p((String[]) Arrays.copyOf(tables, tables.length));
        }

        @Override // androidx.room.e0
        public void e(@fg.l final String[] tables) {
            kotlin.jvm.internal.l0.p(tables, "tables");
            Executor executor = s0.this.getExecutor();
            final s0 s0Var = s0.this;
            executor.execute(new Runnable() { // from class: androidx.room.t0
                @Override // java.lang.Runnable
                public final void run() {
                    s0.b.G(s0.this, tables);
                }
            });
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/room/s0$c", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "service", "Lkotlin/k2;", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements ServiceConnection {
        c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@fg.l ComponentName name, @fg.l IBinder service) {
            kotlin.jvm.internal.l0.p(name, "name");
            kotlin.jvm.internal.l0.p(service, "service");
            s0.this.q(f0.b.E(service));
            s0.this.getExecutor().execute(s0.this.getSetUpRunnable());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@fg.l ComponentName name) {
            kotlin.jvm.internal.l0.p(name, "name");
            s0.this.getExecutor().execute(s0.this.getRemoveObserverRunnable());
            s0.this.q(null);
        }
    }

    public s0(@fg.l Context context, @fg.l String name, @fg.l Intent serviceIntent, @fg.l m0 invalidationTracker, @fg.l Executor executor) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(name, "name");
        kotlin.jvm.internal.l0.p(serviceIntent, "serviceIntent");
        kotlin.jvm.internal.l0.p(invalidationTracker, "invalidationTracker");
        kotlin.jvm.internal.l0.p(executor, "executor");
        this.name = name;
        this.invalidationTracker = invalidationTracker;
        this.executor = executor;
        Context applicationContext = context.getApplicationContext();
        this.appContext = applicationContext;
        this.callback = new b();
        this.stopped = new AtomicBoolean(false);
        c cVar = new c();
        this.serviceConnection = cVar;
        this.setUpRunnable = new Runnable() { // from class: androidx.room.q0
            @Override // java.lang.Runnable
            public final void run() {
                s0.r(s0.this);
            }
        };
        this.removeObserverRunnable = new Runnable() { // from class: androidx.room.r0
            @Override // java.lang.Runnable
            public final void run() {
                s0.n(s0.this);
            }
        };
        p(new a((String[]) invalidationTracker.m().keySet().toArray(new String[0])));
        applicationContext.bindService(serviceIntent, cVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(s0 this$0) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        this$0.invalidationTracker.t(this$0.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(s0 this$0) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        try {
            f0 f0Var = this$0.service;
            if (f0Var != null) {
                this$0.clientId = f0Var.r(this$0.callback, this$0.name);
                this$0.invalidationTracker.c(this$0.h());
            }
        } catch (RemoteException unused) {
        }
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final e0 getCallback() {
        return this.callback;
    }

    /* renamed from: d, reason: from getter */
    public final int getClientId() {
        return this.clientId;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final Executor getExecutor() {
        return this.executor;
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final m0 getInvalidationTracker() {
        return this.invalidationTracker;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @fg.l
    public final m0.c h() {
        m0.c cVar = this.observer;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.l0.S("observer");
        return null;
    }

    @fg.l
    /* renamed from: i, reason: from getter */
    public final Runnable getRemoveObserverRunnable() {
        return this.removeObserverRunnable;
    }

    @fg.m
    /* renamed from: j, reason: from getter */
    public final f0 getService() {
        return this.service;
    }

    @fg.l
    /* renamed from: k, reason: from getter */
    public final ServiceConnection getServiceConnection() {
        return this.serviceConnection;
    }

    @fg.l
    /* renamed from: l, reason: from getter */
    public final Runnable getSetUpRunnable() {
        return this.setUpRunnable;
    }

    @fg.l
    /* renamed from: m, reason: from getter */
    public final AtomicBoolean getStopped() {
        return this.stopped;
    }

    public final void o(int i4) {
        this.clientId = i4;
    }

    public final void p(@fg.l m0.c cVar) {
        kotlin.jvm.internal.l0.p(cVar, "<set-?>");
        this.observer = cVar;
    }

    public final void q(@fg.m f0 f0Var) {
        this.service = f0Var;
    }

    public final void s() {
        if (this.stopped.compareAndSet(false, true)) {
            this.invalidationTracker.t(h());
            try {
                f0 f0Var = this.service;
                if (f0Var != null) {
                    f0Var.D(this.callback, this.clientId);
                }
            } catch (RemoteException unused) {
            }
            this.appContext.unbindService(this.serviceConnection);
        }
    }
}

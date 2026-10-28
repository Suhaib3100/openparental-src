package androidx.window.sidecar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.b0;
import androidx.annotation.m1;
import androidx.core.util.e;
import androidx.window.core.i;
import androidx.window.sidecar.n;
import androidx.window.sidecar.u;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k2;

/* compiled from: SidecarWindowBackend.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 #2\u00020\u0001:\u0003\u0013\u0015#B\u0013\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u0005R&\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Landroidx/window/layout/u;", "Landroidx/window/layout/w;", "Landroidx/window/layout/n;", "windowExtension", "<init>", "(Landroidx/window/layout/n;)V", "Landroid/app/Activity;", "activity", "", "j", "(Landroid/app/Activity;)Z", "Lkotlin/k2;", "f", "(Landroid/app/Activity;)V", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/e;", "Landroidx/window/layout/b0;", "callback", "a", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/e;)V", "b", "(Landroidx/core/util/e;)V", "Landroidx/window/layout/n;", "g", "()Landroidx/window/layout/n;", "k", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/layout/u$c;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "h", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "i", "()V", "windowLayoutChangeCallbacks", "c", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class u implements w {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f35856d = false;

    /* renamed from: e, reason: collision with root package name */
    @m
    private static volatile u f35857e;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @m
    @b0("globalLock")
    @m1
    private n windowExtension;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final CopyOnWriteArrayList<c> windowLayoutChangeCallbacks = new CopyOnWriteArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    @l
    private static final String f35859g = "WindowServer";

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: f, reason: collision with root package name */
    @l
    private static final ReentrantLock f35858f = new ReentrantLock();

    /* compiled from: SidecarWindowBackend.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0003R\u0014\u0010\u0013\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/window/layout/u$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/window/layout/u;", "a", "(Landroid/content/Context;)Landroidx/window/layout/u;", "Landroidx/window/layout/n;", "b", "(Landroid/content/Context;)Landroidx/window/layout/n;", "Landroidx/window/core/i;", "sidecarVersion", "", "c", "(Landroidx/window/core/i;)Z", "Lkotlin/k2;", "d", "DEBUG", "Z", "", "TAG", "Ljava/lang/String;", "globalInstance", "Landroidx/window/layout/u;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.window.layout.u$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        public final u a(@l Context context) {
            l0.p(context, "context");
            if (u.f35857e == null) {
                ReentrantLock reentrantLock = u.f35858f;
                reentrantLock.lock();
                try {
                    if (u.f35857e == null) {
                        u.f35857e = new u(u.INSTANCE.b(context));
                    }
                    k2 k2Var = k2.f75408a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            u uVar = u.f35857e;
            l0.m(uVar);
            return uVar;
        }

        @m
        public final n b(@l Context context) {
            l0.p(context, "context");
            try {
                if (!c(SidecarCompat.INSTANCE.c())) {
                    return null;
                }
                SidecarCompat sidecarCompat = new SidecarCompat(context);
                if (sidecarCompat.d()) {
                    return sidecarCompat;
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        @m1
        public final boolean c(@m i sidecarVersion) {
            if (sidecarVersion == null) {
                return false;
            }
            i.INSTANCE.getClass();
            return sidecarVersion.compareTo(i.f35705i) >= 0;
        }

        @m1
        public final void d() {
            u.f35857e = null;
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: SidecarWindowBackend.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/window/layout/u$b;", "Landroidx/window/layout/n$a;", "<init>", "(Landroidx/window/layout/u;)V", "Landroid/app/Activity;", "activity", "Landroidx/window/layout/b0;", "newLayout", "Lkotlin/k2;", "a", "(Landroid/app/Activity;Landroidx/window/layout/b0;)V", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @m1
    public final class b implements n.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f35862a;

        public b(u this$0) {
            l0.p(this$0, "this$0");
            this.f35862a = this$0;
        }

        @Override // androidx.window.layout.n.a
        @SuppressLint({"SyntheticAccessor"})
        public void a(@l Activity activity, @l b0 newLayout) {
            l0.p(activity, "activity");
            l0.p(newLayout, "newLayout");
            Iterator<c> it = this.f35862a.h().iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (l0.g(next.getActivity(), activity)) {
                    next.b(newLayout);
                }
            }
        }
    }

    /* compiled from: SidecarWindowBackend.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u000e¨\u0006\u001d"}, d2 = {"Landroidx/window/layout/u$c;", "", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/e;", "Landroidx/window/layout/b0;", "callback", "<init>", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/e;)V", "newLayoutInfo", "Lkotlin/k2;", "b", "(Landroidx/window/layout/b0;)V", "a", "Landroid/app/Activity;", "d", "()Landroid/app/Activity;", "Ljava/util/concurrent/Executor;", "c", "Landroidx/core/util/e;", "e", "()Landroidx/core/util/e;", "Landroidx/window/layout/b0;", "f", "()Landroidx/window/layout/b0;", "g", "lastInfo", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final Activity activity;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final Executor executor;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @l
        private final e<b0> callback;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @m
        private b0 lastInfo;

        public c(@l Activity activity, @l Executor executor, @l e<b0> callback) {
            l0.p(activity, "activity");
            l0.p(executor, "executor");
            l0.p(callback, "callback");
            this.activity = activity;
            this.executor = executor;
            this.callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(c this$0, b0 newLayoutInfo) {
            l0.p(this$0, "this$0");
            l0.p(newLayoutInfo, "$newLayoutInfo");
            this$0.callback.accept(newLayoutInfo);
        }

        public final void b(@l final b0 newLayoutInfo) {
            l0.p(newLayoutInfo, "newLayoutInfo");
            this.lastInfo = newLayoutInfo;
            this.executor.execute(new Runnable() { // from class: androidx.window.layout.v
                @Override // java.lang.Runnable
                public final void run() {
                    u.c.c(u.c.this, newLayoutInfo);
                }
            });
        }

        @l
        /* renamed from: d, reason: from getter */
        public final Activity getActivity() {
            return this.activity;
        }

        @l
        public final e<b0> e() {
            return this.callback;
        }

        @m
        /* renamed from: f, reason: from getter */
        public final b0 getLastInfo() {
            return this.lastInfo;
        }

        public final void g(@m b0 b0Var) {
            this.lastInfo = b0Var;
        }
    }

    @m1
    public u(@m n nVar) {
        this.windowExtension = nVar;
        n nVar2 = this.windowExtension;
        if (nVar2 == null) {
            return;
        }
        nVar2.a(new b(this));
    }

    @b0("sLock")
    private final void f(Activity activity) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (l0.g(((c) it.next()).getActivity(), activity)) {
                    return;
                }
            }
        }
        n nVar = this.windowExtension;
        if (nVar == null) {
            return;
        }
        nVar.c(activity);
    }

    @m1
    public static /* synthetic */ void i() {
    }

    private final boolean j(Activity activity) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (l0.g(((c) it.next()).getActivity(), activity)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.window.sidecar.w
    public void a(@l Activity activity, @l Executor executor, @l e<b0> callback) {
        b0 b0Var;
        Object obj;
        l0.p(activity, "activity");
        l0.p(executor, "executor");
        l0.p(callback, "callback");
        ReentrantLock reentrantLock = f35858f;
        reentrantLock.lock();
        try {
            n nVar = this.windowExtension;
            if (nVar == null) {
                callback.accept(new b0(j0.f74919b));
                return;
            }
            boolean j4 = j(activity);
            c cVar = new c(activity, executor, callback);
            this.windowLayoutChangeCallbacks.add(cVar);
            if (j4) {
                Iterator<T> it = this.windowLayoutChangeCallbacks.iterator();
                while (true) {
                    b0Var = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (l0.g(activity, ((c) obj).getActivity())) {
                            break;
                        }
                    }
                }
                c cVar2 = (c) obj;
                if (cVar2 != null) {
                    b0Var = cVar2.getLastInfo();
                }
                if (b0Var != null) {
                    cVar.b(b0Var);
                }
            } else {
                nVar.b(activity);
            }
            k2 k2Var = k2.f75408a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.sidecar.w
    public void b(@l e<b0> callback) {
        l0.p(callback, "callback");
        synchronized (f35858f) {
            try {
                if (this.windowExtension == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<c> it = this.windowLayoutChangeCallbacks.iterator();
                while (it.hasNext()) {
                    c callbackWrapper = it.next();
                    if (callbackWrapper.e() == callback) {
                        l0.o(callbackWrapper, "callbackWrapper");
                        arrayList.add(callbackWrapper);
                    }
                }
                this.windowLayoutChangeCallbacks.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    f(((c) it2.next()).getActivity());
                }
                k2 k2Var = k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @m
    /* renamed from: g, reason: from getter */
    public final n getWindowExtension() {
        return this.windowExtension;
    }

    @l
    public final CopyOnWriteArrayList<c> h() {
        return this.windowLayoutChangeCallbacks;
    }

    public final void k(@m n nVar) {
        this.windowExtension = nVar;
    }
}

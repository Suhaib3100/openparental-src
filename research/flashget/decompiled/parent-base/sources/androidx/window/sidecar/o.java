package androidx.window.sidecar;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.annotation.b0;
import androidx.core.util.e;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import fg.l;
import fg.m;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;

/* compiled from: ExtensionWindowLayoutInfoBackend.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00060\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/window/layout/o;", "Landroidx/window/layout/w;", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "component", "<init>", "(Landroidx/window/extensions/layout/WindowLayoutComponent;)V", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/e;", "Landroidx/window/layout/b0;", "callback", "Lkotlin/k2;", "a", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/e;)V", "b", "(Landroidx/core/util/e;)V", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "extensionWindowBackendLock", "", "Landroidx/window/layout/o$a;", "c", "Ljava/util/Map;", "activityToListeners", "d", "listenerToActivity", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o implements w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final WindowLayoutComponent component;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final ReentrantLock extensionWindowBackendLock;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    @b0("lock")
    private final Map<Activity, a> activityToListeners;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    @b0("lock")
    private final Map<e<b0>, Activity> listenerToActivity;

    /* compiled from: ExtensionWindowLayoutInfoBackend.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/window/layout/o$a;", "Ljava/util/function/Consumer;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "value", "Lkotlin/k2;", "a", "(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", "Landroidx/core/util/e;", "Landroidx/window/layout/b0;", "listener", "b", "(Landroidx/core/util/e;)V", "d", "", "c", "()Z", "Landroid/app/Activity;", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "multicastConsumerLock", "Landroidx/window/layout/b0;", "lastKnownValue", "", "e", "Ljava/util/Set;", "registeredListeners", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @SuppressLint({"NewApi"})
    private static final class a implements Consumer<WindowLayoutInfo> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final Activity activity;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @l
        private final ReentrantLock multicastConsumerLock;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @m
        @b0("lock")
        private b0 lastKnownValue;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @l
        @b0("lock")
        private final Set<e<b0>> registeredListeners;

        public a(@l Activity activity) {
            l0.p(activity, "activity");
            this.activity = activity;
            this.multicastConsumerLock = new ReentrantLock();
            this.registeredListeners = new LinkedHashSet();
        }

        @Override // java.util.function.Consumer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(@l WindowLayoutInfo value) {
            l0.p(value, "value");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                this.lastKnownValue = p.f35820a.b(this.activity, value);
                Iterator<T> it = this.registeredListeners.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).accept(this.lastKnownValue);
                }
                k2 k2Var = k2.f75408a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        public final void b(@l e<b0> listener) {
            l0.p(listener, "listener");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                b0 b0Var = this.lastKnownValue;
                if (b0Var != null) {
                    listener.accept(b0Var);
                }
                this.registeredListeners.add(listener);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final boolean c() {
            return this.registeredListeners.isEmpty();
        }

        public final void d(@l e<b0> listener) {
            l0.p(listener, "listener");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                this.registeredListeners.remove(listener);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public o(@l WindowLayoutComponent component) {
        l0.p(component, "component");
        this.component = component;
        this.extensionWindowBackendLock = new ReentrantLock();
        this.activityToListeners = new LinkedHashMap();
        this.listenerToActivity = new LinkedHashMap();
    }

    @Override // androidx.window.sidecar.w
    public void a(@l Activity activity, @l Executor executor, @l e<b0> callback) {
        k2 k2Var;
        l0.p(activity, "activity");
        l0.p(executor, "executor");
        l0.p(callback, "callback");
        ReentrantLock reentrantLock = this.extensionWindowBackendLock;
        reentrantLock.lock();
        try {
            a aVar = this.activityToListeners.get(activity);
            if (aVar == null) {
                k2Var = null;
            } else {
                aVar.b(callback);
                this.listenerToActivity.put(callback, activity);
                k2Var = k2.f75408a;
            }
            if (k2Var == null) {
                a aVar2 = new a(activity);
                this.activityToListeners.put(activity, aVar2);
                this.listenerToActivity.put(callback, activity);
                aVar2.b(callback);
                this.component.addWindowLayoutInfoListener(activity, aVar2);
            }
            k2 k2Var2 = k2.f75408a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // androidx.window.sidecar.w
    public void b(@l e<b0> callback) {
        l0.p(callback, "callback");
        ReentrantLock reentrantLock = this.extensionWindowBackendLock;
        reentrantLock.lock();
        try {
            Activity activity = this.listenerToActivity.get(callback);
            if (activity == null) {
                reentrantLock.unlock();
                return;
            }
            a aVar = this.activityToListeners.get(activity);
            if (aVar == null) {
                reentrantLock.unlock();
                return;
            }
            aVar.d(callback);
            if (aVar.c()) {
                this.component.removeWindowLayoutInfoListener(aVar);
            }
            k2 k2Var = k2.f75408a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}

package androidx.window.sidecar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.b0;
import androidx.annotation.m1;
import androidx.window.core.i;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import androidx.window.sidecar.n;
import fg.l;
import fg.m;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k2;

/* compiled from: SidecarCompat.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0005\u0013\u0018-\u001d.B\u001d\b\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u000fJ\u001d\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000b0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010&R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020(0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, d2 = {"Landroidx/window/layout/SidecarCompat;", "Landroidx/window/layout/n;", "Landroidx/window/sidecar/SidecarInterface;", "sidecar", "Landroidx/window/layout/t;", "sidecarAdapter", "<init>", "(Landroidx/window/sidecar/SidecarInterface;Landroidx/window/layout/t;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Landroid/app/Activity;", "activity", "Lkotlin/k2;", "k", "(Landroid/app/Activity;)V", "l", "Landroidx/window/layout/n$a;", "extensionCallback", "a", "(Landroidx/window/layout/n$a;)V", "Landroidx/window/layout/b0;", "i", "(Landroid/app/Activity;)Landroidx/window/layout/b0;", "b", "Landroid/os/IBinder;", "windowToken", "j", "(Landroid/os/IBinder;Landroid/app/Activity;)V", "c", "", "d", "()Z", "Landroidx/window/sidecar/SidecarInterface;", "h", "()Landroidx/window/sidecar/SidecarInterface;", "Landroidx/window/layout/t;", "", "Ljava/util/Map;", "windowListenerRegisteredContexts", "Landroid/content/ComponentCallbacks;", "componentCallbackMap", "e", "Landroidx/window/layout/n$a;", "f", "DistinctSidecarElementCallback", "TranslatingCallback", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SidecarCompat implements n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @m
    private final SidecarInterface sidecar;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final t sidecarAdapter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final Map<IBinder, Activity> windowListenerRegisteredContexts;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final Map<Activity, ComponentCallbacks> componentCallbackMap;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @m
    private n.a extensionCallback;

    /* renamed from: g, reason: collision with root package name */
    @l
    private static final String f35778g = "SidecarCompat";

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: SidecarCompat.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/window/layout/SidecarCompat$DistinctSidecarElementCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/layout/t;", "sidecarAdapter", "callbackInterface", "<init>", "(Landroidx/window/layout/t;Landroidx/window/sidecar/SidecarInterface$SidecarCallback;)V", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "Lkotlin/k2;", "onDeviceStateChanged", "(Landroidx/window/sidecar/SidecarDeviceState;)V", "Landroid/os/IBinder;", "token", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V", "a", "Landroidx/window/layout/t;", "b", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Ljava/util/concurrent/locks/ReentrantLock;", "c", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "d", "Landroidx/window/sidecar/SidecarDeviceState;", "lastDeviceState", "Ljava/util/WeakHashMap;", "e", "Ljava/util/WeakHashMap;", "mActivityWindowLayoutInfo", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final t sidecarAdapter;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final SidecarInterface.SidecarCallback callbackInterface;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @l
        private final ReentrantLock lock;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @m
        @b0("lock")
        private SidecarDeviceState lastDeviceState;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @l
        @b0("mLock")
        private final WeakHashMap<IBinder, SidecarWindowLayoutInfo> mActivityWindowLayoutInfo;

        public DistinctSidecarElementCallback(@l t sidecarAdapter, @l SidecarInterface.SidecarCallback callbackInterface) {
            l0.p(sidecarAdapter, "sidecarAdapter");
            l0.p(callbackInterface, "callbackInterface");
            this.sidecarAdapter = sidecarAdapter;
            this.callbackInterface = callbackInterface;
            this.lock = new ReentrantLock();
            this.mActivityWindowLayoutInfo = new WeakHashMap<>();
        }

        public void onDeviceStateChanged(@l SidecarDeviceState newDeviceState) {
            l0.p(newDeviceState, "newDeviceState");
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (this.sidecarAdapter.a(this.lastDeviceState, newDeviceState)) {
                    return;
                }
                this.lastDeviceState = newDeviceState;
                this.callbackInterface.onDeviceStateChanged(newDeviceState);
                k2 k2Var = k2.f75408a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public void onWindowLayoutChanged(@l IBinder token, @l SidecarWindowLayoutInfo newLayout) {
            l0.p(token, "token");
            l0.p(newLayout, "newLayout");
            synchronized (this.lock) {
                if (this.sidecarAdapter.d(this.mActivityWindowLayoutInfo.get(token), newLayout)) {
                    return;
                }
                this.mActivityWindowLayoutInfo.put(token, newLayout);
                this.callbackInterface.onWindowLayoutChanged(token, newLayout);
            }
        }
    }

    /* compiled from: SidecarCompat.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/window/layout/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "<init>", "(Landroidx/window/layout/SidecarCompat;)V", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "Lkotlin/k2;", "onDeviceStateChanged", "(Landroidx/window/sidecar/SidecarDeviceState;)V", "Landroid/os/IBinder;", "windowToken", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SidecarCompat f35789a;

        public TranslatingCallback(SidecarCompat this$0) {
            l0.p(this$0, "this$0");
            this.f35789a = this$0;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDeviceStateChanged(@l SidecarDeviceState newDeviceState) {
            SidecarInterface sidecar;
            l0.p(newDeviceState, "newDeviceState");
            Collection<Activity> values = this.f35789a.windowListenerRegisteredContexts.values();
            SidecarCompat sidecarCompat = this.f35789a;
            for (Activity activity : values) {
                IBinder a5 = SidecarCompat.INSTANCE.a(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (a5 != null && (sidecar = sidecarCompat.getSidecar()) != null) {
                    sidecarWindowLayoutInfo = sidecar.getWindowLayoutInfo(a5);
                }
                n.a aVar = sidecarCompat.extensionCallback;
                if (aVar != null) {
                    aVar.a(activity, sidecarCompat.sidecarAdapter.e(sidecarWindowLayoutInfo, newDeviceState));
                }
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(@l IBinder windowToken, @l SidecarWindowLayoutInfo newLayout) {
            l0.p(windowToken, "windowToken");
            l0.p(newLayout, "newLayout");
            Activity activity = (Activity) this.f35789a.windowListenerRegisteredContexts.get(windowToken);
            if (activity == null) {
                return;
            }
            t tVar = this.f35789a.sidecarAdapter;
            SidecarInterface sidecar = this.f35789a.getSidecar();
            SidecarDeviceState deviceState = sidecar == null ? null : sidecar.getDeviceState();
            if (deviceState == null) {
                deviceState = new SidecarDeviceState();
            }
            b0 e4 = tVar.e(newLayout, deviceState);
            n.a aVar = this.f35789a.extensionCallback;
            if (aVar == null) {
                return;
            }
            aVar.a(activity, e4);
        }
    }

    /* compiled from: SidecarCompat.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\rR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/window/layout/SidecarCompat$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/window/sidecar/SidecarInterface;", "b", "(Landroid/content/Context;)Landroidx/window/sidecar/SidecarInterface;", "Landroid/app/Activity;", "activity", "Landroid/os/IBinder;", "a", "(Landroid/app/Activity;)Landroid/os/IBinder;", "Landroidx/window/core/i;", "c", "()Landroidx/window/core/i;", "sidecarVersion", "", "TAG", "Ljava/lang/String;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.window.layout.SidecarCompat$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @m
        public final IBinder a(@m Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        @m
        public final SidecarInterface b(@l Context context) {
            l0.p(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        @m
        public final i c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return i.INSTANCE.e(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: SidecarCompat.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/window/layout/SidecarCompat$b;", "Landroidx/window/layout/n$a;", "callbackInterface", "<init>", "(Landroidx/window/layout/n$a;)V", "Landroid/app/Activity;", "activity", "Landroidx/window/layout/b0;", "newLayout", "Lkotlin/k2;", "a", "(Landroid/app/Activity;Landroidx/window/layout/b0;)V", "Landroidx/window/layout/n$a;", "Ljava/util/concurrent/locks/ReentrantLock;", "b", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/WeakHashMap;", "c", "Ljava/util/WeakHashMap;", "activityWindowLayoutInfo", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class b implements n.a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final n.a callbackInterface;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final ReentrantLock lock;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @l
        @b0("mLock")
        private final WeakHashMap<Activity, b0> activityWindowLayoutInfo;

        public b(@l n.a callbackInterface) {
            l0.p(callbackInterface, "callbackInterface");
            this.callbackInterface = callbackInterface;
            this.lock = new ReentrantLock();
            this.activityWindowLayoutInfo = new WeakHashMap<>();
        }

        @Override // androidx.window.layout.n.a
        public void a(@l Activity activity, @l b0 newLayout) {
            l0.p(activity, "activity");
            l0.p(newLayout, "newLayout");
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (l0.g(newLayout, this.activityWindowLayoutInfo.get(activity))) {
                    return;
                }
                this.activityWindowLayoutInfo.put(activity, newLayout);
                reentrantLock.unlock();
                this.callbackInterface.a(activity, newLayout);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* compiled from: SidecarCompat.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00040\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/window/layout/SidecarCompat$c;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/window/layout/SidecarCompat;", "sidecarCompat", "Landroid/app/Activity;", "activity", "<init>", "(Landroidx/window/layout/SidecarCompat;Landroid/app/Activity;)V", "Landroid/view/View;", "view", "Lkotlin/k2;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "b", "Landroidx/window/layout/SidecarCompat;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "c", "Ljava/lang/ref/WeakReference;", "activityWeakReference", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class c implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final SidecarCompat sidecarCompat;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @l
        private final WeakReference<Activity> activityWeakReference;

        public c(@l SidecarCompat sidecarCompat, @l Activity activity) {
            l0.p(sidecarCompat, "sidecarCompat");
            l0.p(activity, "activity");
            this.sidecarCompat = sidecarCompat;
            this.activityWeakReference = new WeakReference<>(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@l View view) {
            l0.p(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = this.activityWeakReference.get();
            IBinder a5 = SidecarCompat.INSTANCE.a(activity);
            if (activity == null || a5 == null) {
                return;
            }
            this.sidecarCompat.j(a5, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@l View view) {
            l0.p(view, "view");
        }
    }

    /* compiled from: SidecarCompat.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/window/layout/SidecarCompat$d", "Landroid/content/ComponentCallbacks;", "Landroid/content/res/Configuration;", "newConfig", "Lkotlin/k2;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class d implements ComponentCallbacks {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f35796c;

        d(Activity activity) {
            this.f35796c = activity;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(@l Configuration newConfig) {
            l0.p(newConfig, "newConfig");
            n.a aVar = SidecarCompat.this.extensionCallback;
            if (aVar == null) {
                return;
            }
            Activity activity = this.f35796c;
            aVar.a(activity, SidecarCompat.this.i(activity));
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }

    @m1
    public SidecarCompat(@m @m1 SidecarInterface sidecarInterface, @l t sidecarAdapter) {
        l0.p(sidecarAdapter, "sidecarAdapter");
        this.sidecar = sidecarInterface;
        this.sidecarAdapter = sidecarAdapter;
        this.windowListenerRegisteredContexts = new LinkedHashMap();
        this.componentCallbackMap = new LinkedHashMap();
    }

    private final void k(Activity activity) {
        if (this.componentCallbackMap.get(activity) == null) {
            d dVar = new d(activity);
            this.componentCallbackMap.put(activity, dVar);
            activity.registerComponentCallbacks(dVar);
        }
    }

    private final void l(Activity activity) {
        activity.unregisterComponentCallbacks(this.componentCallbackMap.get(activity));
        this.componentCallbackMap.remove(activity);
    }

    @Override // androidx.window.sidecar.n
    public void a(@l n.a extensionCallback) {
        l0.p(extensionCallback, "extensionCallback");
        this.extensionCallback = new b(extensionCallback);
        SidecarInterface sidecarInterface = this.sidecar;
        if (sidecarInterface == null) {
            return;
        }
        sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.sidecarAdapter, new TranslatingCallback(this)));
    }

    @Override // androidx.window.sidecar.n
    public void b(@l Activity activity) {
        l0.p(activity, "activity");
        IBinder a5 = INSTANCE.a(activity);
        if (a5 != null) {
            j(a5, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new c(this, activity));
        }
    }

    @Override // androidx.window.sidecar.n
    public void c(@l Activity activity) {
        SidecarInterface sidecarInterface;
        l0.p(activity, "activity");
        IBinder a5 = INSTANCE.a(activity);
        if (a5 == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(a5);
        }
        l(activity);
        boolean z4 = this.windowListenerRegisteredContexts.size() == 1;
        this.windowListenerRegisteredContexts.remove(a5);
        if (!z4 || (sidecarInterface = this.sidecar) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089 A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae A[Catch: all -> 0x018a, TRY_LEAVE, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015a A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a4 A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0166 A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007f A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0172 A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0058 A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017e A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x001e A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    @Override // androidx.window.sidecar.n
    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d() {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.sidecar.SidecarCompat.d():boolean");
    }

    @m
    /* renamed from: h, reason: from getter */
    public final SidecarInterface getSidecar() {
        return this.sidecar;
    }

    @l
    @m1
    public final b0 i(@l Activity activity) {
        l0.p(activity, "activity");
        IBinder a5 = INSTANCE.a(activity);
        if (a5 == null) {
            return new b0(kotlin.collections.w.H());
        }
        SidecarInterface sidecarInterface = this.sidecar;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(a5);
        t tVar = this.sidecarAdapter;
        SidecarInterface sidecarInterface2 = this.sidecar;
        SidecarDeviceState deviceState = sidecarInterface2 != null ? sidecarInterface2.getDeviceState() : null;
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        return tVar.e(windowLayoutInfo, deviceState);
    }

    public final void j(@l IBinder windowToken, @l Activity activity) {
        SidecarInterface sidecarInterface;
        l0.p(windowToken, "windowToken");
        l0.p(activity, "activity");
        this.windowListenerRegisteredContexts.put(windowToken, activity);
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(windowToken);
        }
        if (this.windowListenerRegisteredContexts.size() == 1 && (sidecarInterface = this.sidecar) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        n.a aVar = this.extensionCallback;
        if (aVar != null) {
            aVar.a(activity, i(activity));
        }
        k(activity);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(@l Context context) {
        this(INSTANCE.b(context), new t(null, 1, null));
        l0.p(context, "context");
    }
}

package androidx.view;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.m1;
import androidx.annotation.u;
import androidx.annotation.x0;
import androidx.view.AbstractC1450w;
import androidx.view.InterfaceC1416b0;
import androidx.view.InterfaceC1423e0;
import androidx.view.OnBackPressedDispatcher;
import fg.l;
import fg.m;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k2;
import ld.a;

/* compiled from: OnBackPressedDispatcher.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0004:=A\u001cB!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0015\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0005H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b'\u0010\u0013J\u0017\u0010(\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b(\u0010\u0013J\u000f\u0010)\u001a\u00020\u000bH\u0007¢\u0006\u0004\b)\u0010\u000fJ\u000f\u0010*\u001a\u00020\u000bH\u0007¢\u0006\u0004\b*\u0010\u000fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u001a0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00105\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010<\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010?\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010>¨\u0006B"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "", "Ljava/lang/Runnable;", "fallbackOnBackPressed", "Landroidx/core/util/e;", "", "onHasEnabledCallbacksChanged", "<init>", "(Ljava/lang/Runnable;Landroidx/core/util/e;)V", "(Ljava/lang/Runnable;)V", "shouldBeRegistered", "Lkotlin/k2;", "t", "(Z)V", "u", "()V", "Landroidx/activity/f;", "backEvent", "r", "(Landroidx/activity/f;)V", "q", "o", "Landroid/window/OnBackInvokedDispatcher;", "invoker", "s", "(Landroid/window/OnBackInvokedDispatcher;)V", "Landroidx/activity/c0;", "onBackPressedCallback", "h", "(Landroidx/activity/c0;)V", "Landroidx/activity/g;", "j", "(Landroidx/activity/c0;)Landroidx/activity/g;", "Landroidx/lifecycle/e0;", "owner", "i", "(Landroidx/lifecycle/e0;Landroidx/activity/c0;)V", "n", "()Z", "m", "l", "p", "k", "a", "Ljava/lang/Runnable;", "b", "Landroidx/core/util/e;", "Lkotlin/collections/k;", "c", "Lkotlin/collections/k;", "onBackPressedCallbacks", "d", "Landroidx/activity/c0;", "inProgressCallback", "Landroid/window/OnBackInvokedCallback;", "e", "Landroid/window/OnBackInvokedCallback;", "onBackInvokedCallback", "f", "Landroid/window/OnBackInvokedDispatcher;", "invokedDispatcher", "g", "Z", "backInvokedCallbackRegistered", "hasEnabledCallbacks", "LifecycleOnBackPressedCancellable", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nOnBackPressedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,430:1\n1747#2,3:431\n533#2,6:434\n533#2,6:440\n533#2,6:446\n533#2,6:452\n*S KotlinDebug\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n*L\n114#1:431,3\n233#1:434,6\n251#1:440,6\n271#1:446,6\n290#1:452,6\n*E\n"})
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @m
    private final Runnable fallbackOnBackPressed;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private final androidx.core.util.e<Boolean> onHasEnabledCallbacksChanged;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final k<c0> onBackPressedCallbacks;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    private c0 inProgressCallback;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @m
    private OnBackInvokedCallback onBackInvokedCallback;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @m
    private OnBackInvokedDispatcher invokedDispatcher;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean backInvokedCallbackRegistered;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean hasEnabledCallbacks;

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/b0;", "Landroidx/activity/g;", "Landroidx/lifecycle/w;", "lifecycle", "Landroidx/activity/c0;", "onBackPressedCallback", "<init>", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/w;Landroidx/activity/c0;)V", "Landroidx/lifecycle/e0;", "source", "Landroidx/lifecycle/w$a;", "event", "Lkotlin/k2;", "f", "(Landroidx/lifecycle/e0;Landroidx/lifecycle/w$a;)V", "cancel", "()V", "b", "Landroidx/lifecycle/w;", "c", "Landroidx/activity/c0;", "d", "Landroidx/activity/g;", "currentCancellable", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class LifecycleOnBackPressedCancellable implements InterfaceC1416b0, androidx.view.g {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final AbstractC1450w lifecycle;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @l
        private final c0 onBackPressedCallback;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @m
        private androidx.view.g currentCancellable;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f409e;

        public LifecycleOnBackPressedCancellable(@l OnBackPressedDispatcher onBackPressedDispatcher, @l AbstractC1450w lifecycle, c0 onBackPressedCallback) {
            l0.p(lifecycle, "lifecycle");
            l0.p(onBackPressedCallback, "onBackPressedCallback");
            this.f409e = onBackPressedDispatcher;
            this.lifecycle = lifecycle;
            this.onBackPressedCallback = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // androidx.view.g
        public void cancel() {
            this.lifecycle.d(this);
            this.onBackPressedCallback.removeCancellable(this);
            androidx.view.g gVar = this.currentCancellable;
            if (gVar != null) {
                gVar.cancel();
            }
            this.currentCancellable = null;
        }

        @Override // androidx.view.InterfaceC1416b0
        public void f(@l InterfaceC1423e0 source, @l AbstractC1450w.a event) {
            l0.p(source, "source");
            l0.p(event, "event");
            if (event == AbstractC1450w.a.ON_START) {
                this.currentCancellable = this.f409e.j(this.onBackPressedCallback);
                return;
            }
            if (event != AbstractC1450w.a.ON_STOP) {
                if (event == AbstractC1450w.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.view.g gVar = this.currentCancellable;
                if (gVar != null) {
                    gVar.cancel();
                }
            }
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/activity/f;", "backEvent", "Lkotlin/k2;", "a", "(Landroidx/activity/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<androidx.view.f, k2> {
        a() {
            super(1);
        }

        public final void a(@l androidx.view.f backEvent) {
            l0.p(backEvent, "backEvent");
            OnBackPressedDispatcher.this.r(backEvent);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.view.f fVar) {
            a(fVar);
            return k2.f75408a;
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/activity/f;", "backEvent", "Lkotlin/k2;", "a", "(Landroidx/activity/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.l<androidx.view.f, k2> {
        b() {
            super(1);
        }

        public final void a(@l androidx.view.f backEvent) {
            l0.p(backEvent, "backEvent");
            OnBackPressedDispatcher.this.q(backEvent);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.view.f fVar) {
            a(fVar);
            return k2.f75408a;
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.a<k2> {
        c() {
            super(0);
        }

        public final void a() {
            OnBackPressedDispatcher.this.p();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class d extends n0 implements ld.a<k2> {
        d() {
            super(0);
        }

        public final void a() {
            OnBackPressedDispatcher.this.o();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class e extends n0 implements ld.a<k2> {
        e() {
            super(0);
        }

        public final void a() {
            OnBackPressedDispatcher.this.p();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$f;", "", "<init>", "()V", "dispatcher", "", "priority", "callback", "Lkotlin/k2;", "d", "(Ljava/lang/Object;ILjava/lang/Object;)V", "e", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Function0;", "onBackInvoked", "Landroid/window/OnBackInvokedCallback;", "b", "(Lld/a;)Landroid/window/OnBackInvokedCallback;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @x0(33)
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        @l
        public static final f f415a = new f();

        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(ld.a onBackInvoked) {
            l0.p(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        @l
        @u
        public final OnBackInvokedCallback b(@l final ld.a<k2> onBackInvoked) {
            l0.p(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.d0
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.f.c(a.this);
                }
            };
        }

        @u
        public final void d(@l Object dispatcher, int priority, @l Object callback) {
            l0.p(dispatcher, "dispatcher");
            l0.p(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(priority, (OnBackInvokedCallback) callback);
        }

        @u
        public final void e(@l Object dispatcher, @l Object callback) {
            l0.p(dispatcher, "dispatcher");
            l0.p(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jq\u0010\u0010\u001a\u00020\u000f2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00042!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$g;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/activity/f;", "Lkotlin/r0;", "name", "backEvent", "Lkotlin/k2;", "onBackStarted", "onBackProgressed", "Lkotlin/Function0;", "onBackInvoked", "onBackCancelled", "Landroid/window/OnBackInvokedCallback;", "a", "(Lld/l;Lld/l;Lld/a;Lld/a;)Landroid/window/OnBackInvokedCallback;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @x0(34)
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        @l
        public static final g f416a = new g();

        /* compiled from: OnBackPressedDispatcher.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"androidx/activity/OnBackPressedDispatcher$g$a", "Landroid/window/OnBackAnimationCallback;", "Landroid/window/BackEvent;", "backEvent", "Lkotlin/k2;", "onBackStarted", "(Landroid/window/BackEvent;)V", "onBackProgressed", "onBackInvoked", "()V", "onBackCancelled", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements OnBackAnimationCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ld.l<androidx.view.f, k2> f417a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.l<androidx.view.f, k2> f418b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.a<k2> f419c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.a<k2> f420d;

            /* JADX WARN: Multi-variable type inference failed */
            a(ld.l<? super androidx.view.f, k2> lVar, ld.l<? super androidx.view.f, k2> lVar2, ld.a<k2> aVar, ld.a<k2> aVar2) {
                this.f417a = lVar;
                this.f418b = lVar2;
                this.f419c = aVar;
                this.f420d = aVar2;
            }

            public void onBackCancelled() {
                this.f420d.invoke();
            }

            public void onBackInvoked() {
                this.f419c.invoke();
            }

            public void onBackProgressed(@l BackEvent backEvent) {
                l0.p(backEvent, "backEvent");
                this.f418b.invoke(new androidx.view.f(backEvent));
            }

            public void onBackStarted(@l BackEvent backEvent) {
                l0.p(backEvent, "backEvent");
                this.f417a.invoke(new androidx.view.f(backEvent));
            }
        }

        private g() {
        }

        @l
        @u
        public final OnBackInvokedCallback a(@l ld.l<? super androidx.view.f, k2> onBackStarted, @l ld.l<? super androidx.view.f, k2> onBackProgressed, @l ld.a<k2> onBackInvoked, @l ld.a<k2> onBackCancelled) {
            l0.p(onBackStarted, "onBackStarted");
            l0.p(onBackProgressed, "onBackProgressed");
            l0.p(onBackInvoked, "onBackInvoked");
            l0.p(onBackCancelled, "onBackCancelled");
            return new a(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$h;", "Landroidx/activity/g;", "Landroidx/activity/c0;", "onBackPressedCallback", "<init>", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/activity/c0;)V", "Lkotlin/k2;", "cancel", "()V", "b", "Landroidx/activity/c0;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class h implements androidx.view.g {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final c0 onBackPressedCallback;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f422c;

        public h(@l OnBackPressedDispatcher onBackPressedDispatcher, c0 onBackPressedCallback) {
            l0.p(onBackPressedCallback, "onBackPressedCallback");
            this.f422c = onBackPressedDispatcher;
            this.onBackPressedCallback = onBackPressedCallback;
        }

        @Override // androidx.view.g
        public void cancel() {
            this.f422c.onBackPressedCallbacks.remove(this.onBackPressedCallback);
            if (l0.g(this.f422c.inProgressCallback, this.onBackPressedCallback)) {
                this.onBackPressedCallback.handleOnBackCancelled();
                this.f422c.inProgressCallback = null;
            }
            this.onBackPressedCallback.removeCancellable(this);
            ld.a<k2> enabledChangedCallback$activity_release = this.onBackPressedCallback.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            this.onBackPressedCallback.setEnabledChangedCallback$activity_release(null);
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class i extends h0 implements ld.a<k2> {
        i(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public final void Z() {
            ((OnBackPressedDispatcher) this.receiver).u();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            Z();
            return k2.f75408a;
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class j extends h0 implements ld.a<k2> {
        j(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public final void Z() {
            ((OnBackPressedDispatcher) this.receiver).u();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            Z();
            return k2.f75408a;
        }
    }

    @kd.j
    public OnBackPressedDispatcher() {
        this(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.l0
    public final void o() {
        c0 c0Var;
        c0 c0Var2 = this.inProgressCallback;
        if (c0Var2 == null) {
            k<c0> kVar = this.onBackPressedCallbacks;
            ListIterator<c0> listIterator = kVar.listIterator(kVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c0Var = null;
                    break;
                } else {
                    c0Var = listIterator.previous();
                    if (c0Var.getIsEnabled()) {
                        break;
                    }
                }
            }
            c0Var2 = c0Var;
        }
        this.inProgressCallback = null;
        if (c0Var2 != null) {
            c0Var2.handleOnBackCancelled();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.l0
    public final void q(androidx.view.f backEvent) {
        c0 c0Var;
        c0 c0Var2 = this.inProgressCallback;
        if (c0Var2 == null) {
            k<c0> kVar = this.onBackPressedCallbacks;
            ListIterator<c0> listIterator = kVar.listIterator(kVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c0Var = null;
                    break;
                } else {
                    c0Var = listIterator.previous();
                    if (c0Var.getIsEnabled()) {
                        break;
                    }
                }
            }
            c0Var2 = c0Var;
        }
        if (c0Var2 != null) {
            c0Var2.handleOnBackProgressed(backEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.l0
    public final void r(androidx.view.f backEvent) {
        c0 c0Var;
        k<c0> kVar = this.onBackPressedCallbacks;
        ListIterator<c0> listIterator = kVar.listIterator(kVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                c0Var = null;
                break;
            } else {
                c0Var = listIterator.previous();
                if (c0Var.getIsEnabled()) {
                    break;
                }
            }
        }
        c0 c0Var2 = c0Var;
        this.inProgressCallback = c0Var2;
        if (c0Var2 != null) {
            c0Var2.handleOnBackStarted(backEvent);
        }
    }

    @x0(33)
    private final void t(boolean shouldBeRegistered) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.invokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback = this.onBackInvokedCallback;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (shouldBeRegistered && !this.backInvokedCallbackRegistered) {
            f.f415a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = true;
        } else {
            if (shouldBeRegistered || !this.backInvokedCallbackRegistered) {
                return;
            }
            f.f415a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        boolean z4 = this.hasEnabledCallbacks;
        k<c0> kVar = this.onBackPressedCallbacks;
        boolean z5 = false;
        if (kVar == null || !kVar.isEmpty()) {
            Iterator<c0> it = kVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().getIsEnabled()) {
                    z5 = true;
                    break;
                }
            }
        }
        this.hasEnabledCallbacks = z5;
        if (z5 != z4) {
            androidx.core.util.e<Boolean> eVar = this.onHasEnabledCallbacksChanged;
            if (eVar != null) {
                eVar.accept(Boolean.valueOf(z5));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                t(z5);
            }
        }
    }

    @androidx.annotation.l0
    public final void h(@l c0 onBackPressedCallback) {
        l0.p(onBackPressedCallback, "onBackPressedCallback");
        j(onBackPressedCallback);
    }

    @androidx.annotation.l0
    public final void i(@l InterfaceC1423e0 owner, @l c0 onBackPressedCallback) {
        l0.p(owner, "owner");
        l0.p(onBackPressedCallback, "onBackPressedCallback");
        AbstractC1450w lifecycle = owner.getLifecycle();
        if (lifecycle.getState() == AbstractC1450w.b.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        u();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new i(this));
    }

    @l
    @androidx.annotation.l0
    public final androidx.view.g j(@l c0 onBackPressedCallback) {
        l0.p(onBackPressedCallback, "onBackPressedCallback");
        this.onBackPressedCallbacks.addLast(onBackPressedCallback);
        h hVar = new h(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(hVar);
        u();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new j(this));
        return hVar;
    }

    @androidx.annotation.l0
    @m1
    public final void k() {
        o();
    }

    @androidx.annotation.l0
    @m1
    public final void l(@l androidx.view.f backEvent) {
        l0.p(backEvent, "backEvent");
        q(backEvent);
    }

    @androidx.annotation.l0
    @m1
    public final void m(@l androidx.view.f backEvent) {
        l0.p(backEvent, "backEvent");
        r(backEvent);
    }

    @androidx.annotation.l0
    /* renamed from: n, reason: from getter */
    public final boolean getHasEnabledCallbacks() {
        return this.hasEnabledCallbacks;
    }

    @androidx.annotation.l0
    public final void p() {
        c0 c0Var;
        c0 c0Var2 = this.inProgressCallback;
        if (c0Var2 == null) {
            k<c0> kVar = this.onBackPressedCallbacks;
            ListIterator<c0> listIterator = kVar.listIterator(kVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c0Var = null;
                    break;
                } else {
                    c0Var = listIterator.previous();
                    if (c0Var.getIsEnabled()) {
                        break;
                    }
                }
            }
            c0Var2 = c0Var;
        }
        this.inProgressCallback = null;
        if (c0Var2 != null) {
            c0Var2.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.fallbackOnBackPressed;
        if (runnable != null) {
            runnable.run();
        }
    }

    @x0(33)
    public final void s(@l OnBackInvokedDispatcher invoker) {
        l0.p(invoker, "invoker");
        this.invokedDispatcher = invoker;
        t(this.hasEnabledCallbacks);
    }

    public OnBackPressedDispatcher(@m Runnable runnable, @m androidx.core.util.e<Boolean> eVar) {
        this.fallbackOnBackPressed = runnable;
        this.onHasEnabledCallbacksChanged = eVar;
        this.onBackPressedCallbacks = new k<>();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            this.onBackInvokedCallback = i4 >= 34 ? g.f416a.a(new a(), new b(), new c(), new d()) : f.f415a.b(new e());
        }
    }

    @kd.j
    public OnBackPressedDispatcher(@m Runnable runnable) {
        this(runnable, null);
    }

    public OnBackPressedDispatcher(Runnable runnable, int i4, w wVar) {
        this((i4 & 1) != 0 ? null : runnable, null);
    }
}

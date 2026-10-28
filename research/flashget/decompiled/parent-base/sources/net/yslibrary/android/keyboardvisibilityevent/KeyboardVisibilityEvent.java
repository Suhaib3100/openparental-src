package net.yslibrary.android.keyboardvisibilityevent;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.view.AbstractC1450w;
import androidx.view.InterfaceC1421d0;
import androidx.view.InterfaceC1423e0;
import androidx.view.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: KeyboardVisibilityEvent.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lnet/yslibrary/android/keyboardvisibilityevent/KeyboardVisibilityEvent;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroidx/lifecycle/e0;", "lifecycleOwner", "Lnet/yslibrary/android/keyboardvisibilityevent/c;", "listener", "Lkotlin/k2;", "e", "(Landroid/app/Activity;Landroidx/lifecycle/e0;Lnet/yslibrary/android/keyboardvisibilityevent/c;)V", "f", "(Landroid/app/Activity;Lnet/yslibrary/android/keyboardvisibilityevent/c;)V", "Landroid/view/ViewGroup;", "b", "(Landroid/app/Activity;)Landroid/view/ViewGroup;", "Lnet/yslibrary/android/keyboardvisibilityevent/f;", "d", "(Landroid/app/Activity;Lnet/yslibrary/android/keyboardvisibilityevent/c;)Lnet/yslibrary/android/keyboardvisibilityevent/f;", "", "c", "(Landroid/app/Activity;)Z", "Landroid/view/View;", "a", "(Landroid/app/Activity;)Landroid/view/View;", "keyboardvisibilityevent_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class KeyboardVisibilityEvent {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final KeyboardVisibilityEvent f83721a = new KeyboardVisibilityEvent();

    /* compiled from: KeyboardVisibilityEvent.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"net/yslibrary/android/keyboardvisibilityevent/KeyboardVisibilityEvent$a", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lkotlin/k2;", "onGlobalLayout", "()V", "", "b", "Z", "wasOpened", "keyboardvisibilityevent_release"}, k = 1, mv = {1, 4, 2})
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean wasOpened;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f83723c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f83724d;

        a(Activity activity, c cVar) {
            this.f83723c = activity;
            this.f83724d = cVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            boolean c5 = KeyboardVisibilityEvent.f83721a.c(this.f83723c);
            if (c5 == this.wasOpened) {
                return;
            }
            this.wasOpened = c5;
            this.f83724d.a(c5);
        }
    }

    /* compiled from: KeyboardVisibilityEvent.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"net/yslibrary/android/keyboardvisibilityevent/KeyboardVisibilityEvent$b", "Lnet/yslibrary/android/keyboardvisibilityevent/a;", "Lkotlin/k2;", "a", "()V", "keyboardvisibilityevent_release"}, k = 1, mv = {1, 4, 2})
    public static final class b extends net.yslibrary.android.keyboardvisibilityevent.a {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f83725c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f83726d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f fVar, Activity activity, Activity activity2) {
            super(activity2);
            this.f83725c = fVar;
            this.f83726d = activity;
        }

        @Override // net.yslibrary.android.keyboardvisibilityevent.a
        protected void a() {
            this.f83725c.a();
        }
    }

    private KeyboardVisibilityEvent() {
    }

    private final ViewGroup b(Activity activity) {
        View findViewById = activity.findViewById(R.id.content);
        l0.o(findViewById, ProtectedSandApp.s("鸑\u0001"));
        return (ViewGroup) findViewById;
    }

    @n
    public static final void e(@l Activity activity, @l final InterfaceC1423e0 lifecycleOwner, @l c listener) {
        l0.p(activity, ProtectedSandApp.s("鸒\u0001"));
        l0.p(lifecycleOwner, ProtectedSandApp.s("鸓\u0001"));
        l0.p(listener, ProtectedSandApp.s("鸔\u0001"));
        final f d5 = f83721a.d(activity, listener);
        lifecycleOwner.getLifecycle().a(new InterfaceC1421d0() { // from class: net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEvent$setEventListener$1
            @q0(AbstractC1450w.a.ON_DESTROY)
            public final void onDestroy() {
                InterfaceC1423e0.this.getLifecycle().d(this);
                d5.a();
            }
        });
    }

    @n
    public static final void f(@l Activity activity, @l c listener) {
        l0.p(activity, ProtectedSandApp.s("鸒\u0001"));
        l0.p(listener, ProtectedSandApp.s("鸔\u0001"));
        activity.getApplication().registerActivityLifecycleCallbacks(new b(f83721a.d(activity, listener), activity, activity));
    }

    @l
    public final View a(@l Activity activity) {
        l0.p(activity, ProtectedSandApp.s("鸒\u0001"));
        View rootView = b(activity).getRootView();
        l0.o(rootView, ProtectedSandApp.s("鸕\u0001"));
        return rootView;
    }

    public final boolean c(@l Activity activity) {
        l0.p(activity, ProtectedSandApp.s("鸒\u0001"));
        Rect rect = new Rect();
        View a5 = a(activity);
        a5.getWindowVisibleDisplayFrame(rect);
        int[] iArr = new int[2];
        b(activity).getLocationOnScreen(iArr);
        View rootView = a5.getRootView();
        l0.o(rootView, ProtectedSandApp.s("鸖\u0001"));
        int height = rootView.getHeight();
        return ((double) ((height - rect.height()) - iArr[1])) > ((double) height) * 0.15d;
    }

    @l
    public final f d(@m Activity activity, @m c listener) {
        if (activity == null) {
            throw new NullPointerException(ProtectedSandApp.s("鸚\u0001"));
        }
        Window window = activity.getWindow();
        l0.o(window, ProtectedSandApp.s("鸗\u0001"));
        if (!((window.getAttributes().softInputMode & 48) != 48)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("鸙\u0001"));
        }
        if (listener == null) {
            throw new NullPointerException(ProtectedSandApp.s("鸘\u0001"));
        }
        View a5 = a(activity);
        a aVar = new a(activity, listener);
        a5.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
        return new e(activity, aVar);
    }
}

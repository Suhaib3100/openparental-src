package net.yslibrary.android.keyboardvisibilityevent;

import android.app.Activity;
import android.view.ViewTreeObserver;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: SimpleUnregistrar.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0010"}, d2 = {"Lnet/yslibrary/android/keyboardvisibilityevent/e;", "Lnet/yslibrary/android/keyboardvisibilityevent/f;", "Landroid/app/Activity;", "activity", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "globalLayoutListener", "<init>", "(Landroid/app/Activity;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V", "Lkotlin/k2;", "a", "()V", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "activityWeakReference", "b", "onGlobalLayoutListenerWeakReference", "keyboardvisibilityevent_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final WeakReference<Activity> activityWeakReference;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final WeakReference<ViewTreeObserver.OnGlobalLayoutListener> onGlobalLayoutListenerWeakReference;

    public e(@l Activity activity, @l ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        l0.p(activity, ProtectedSandApp.s("鸛\u0001"));
        l0.p(onGlobalLayoutListener, ProtectedSandApp.s("鸜\u0001"));
        this.activityWeakReference = new WeakReference<>(activity);
        this.onGlobalLayoutListenerWeakReference = new WeakReference<>(onGlobalLayoutListener);
    }

    @Override // net.yslibrary.android.keyboardvisibilityevent.f
    public void a() {
        Activity activity = this.activityWeakReference.get();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.onGlobalLayoutListenerWeakReference.get();
        if (activity != null && onGlobalLayoutListener != null) {
            KeyboardVisibilityEvent.f83721a.a(activity).getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        this.activityWeakReference.clear();
        this.onGlobalLayoutListenerWeakReference.clear();
    }
}

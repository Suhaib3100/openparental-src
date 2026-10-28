package androidx.databinding;

import androidx.annotation.c1;
import androidx.annotation.q0;
import androidx.view.InterfaceC1423e0;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
class WeakListener<T> extends WeakReference<ViewDataBinding> {
    protected final int mLocalFieldId;
    private final ObservableReference<T> mObservable;
    private T mTarget;

    public WeakListener(ViewDataBinding viewDataBinding, int i4, ObservableReference<T> observableReference, ReferenceQueue<ViewDataBinding> referenceQueue) {
        super(viewDataBinding, referenceQueue);
        this.mLocalFieldId = i4;
        this.mObservable = observableReference;
    }

    @q0
    protected ViewDataBinding getBinder() {
        ViewDataBinding viewDataBinding = (ViewDataBinding) get();
        if (viewDataBinding == null) {
            unregister();
        }
        return viewDataBinding;
    }

    public T getTarget() {
        return this.mTarget;
    }

    public void setLifecycleOwner(InterfaceC1423e0 interfaceC1423e0) {
        this.mObservable.setLifecycleOwner(interfaceC1423e0);
    }

    public void setTarget(T t4) {
        unregister();
        this.mTarget = t4;
        if (t4 != null) {
            this.mObservable.addListener(t4);
        }
    }

    public boolean unregister() {
        boolean z4;
        T t4 = this.mTarget;
        if (t4 != null) {
            this.mObservable.removeListener(t4);
            z4 = true;
        } else {
            z4 = false;
        }
        this.mTarget = null;
        return z4;
    }
}

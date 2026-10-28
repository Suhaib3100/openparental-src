package androidx.databinding;

import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class OnRebindCallback<T extends ViewDataBinding> {
    public void onBound(T t4) {
    }

    public void onCanceled(T t4) {
    }

    public boolean onPreBind(T t4) {
        return true;
    }
}

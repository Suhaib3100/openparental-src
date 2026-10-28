package androidx.databinding;

import androidx.annotation.o0;
import androidx.databinding.CallbackRegistry;
import androidx.databinding.Observable;

/* loaded from: classes3.dex */
public class PropertyChangeRegistry extends CallbackRegistry<Observable.OnPropertyChangedCallback, Observable, Void> {
    private static final CallbackRegistry.NotifierCallback<Observable.OnPropertyChangedCallback, Observable, Void> NOTIFIER_CALLBACK = new CallbackRegistry.NotifierCallback<Observable.OnPropertyChangedCallback, Observable, Void>() { // from class: androidx.databinding.PropertyChangeRegistry.1
        @Override // androidx.databinding.CallbackRegistry.NotifierCallback
        public void onNotifyCallback(Observable.OnPropertyChangedCallback onPropertyChangedCallback, Observable observable, int i4, Void r4) {
            onPropertyChangedCallback.onPropertyChanged(observable, i4);
        }
    };

    public PropertyChangeRegistry() {
        super(NOTIFIER_CALLBACK);
    }

    public void notifyChange(@o0 Observable observable, int i4) {
        notifyCallbacks(observable, i4, null);
    }
}

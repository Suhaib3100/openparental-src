package androidx.databinding;

import androidx.annotation.o0;
import androidx.core.util.v;
import androidx.databinding.CallbackRegistry;
import androidx.databinding.ObservableList;

/* loaded from: classes3.dex */
public class ListChangeRegistry extends CallbackRegistry<ObservableList.OnListChangedCallback, ObservableList, ListChanges> {
    private static final int ALL = 0;
    private static final int CHANGED = 1;
    private static final int INSERTED = 2;
    private static final int MOVED = 3;
    private static final int REMOVED = 4;
    private static final v.c<ListChanges> sListChanges = new v.c<>(10);
    private static final CallbackRegistry.NotifierCallback<ObservableList.OnListChangedCallback, ObservableList, ListChanges> NOTIFIER_CALLBACK = new CallbackRegistry.NotifierCallback<ObservableList.OnListChangedCallback, ObservableList, ListChanges>() { // from class: androidx.databinding.ListChangeRegistry.1
        @Override // androidx.databinding.CallbackRegistry.NotifierCallback
        public void onNotifyCallback(ObservableList.OnListChangedCallback onListChangedCallback, ObservableList observableList, int i4, ListChanges listChanges) {
            if (i4 == 1) {
                onListChangedCallback.onItemRangeChanged(observableList, listChanges.start, listChanges.count);
                return;
            }
            if (i4 == 2) {
                onListChangedCallback.onItemRangeInserted(observableList, listChanges.start, listChanges.count);
                return;
            }
            if (i4 == 3) {
                onListChangedCallback.onItemRangeMoved(observableList, listChanges.start, listChanges.to, listChanges.count);
            } else if (i4 != 4) {
                onListChangedCallback.onChanged(observableList);
            } else {
                onListChangedCallback.onItemRangeRemoved(observableList, listChanges.start, listChanges.count);
            }
        }
    };

    static class ListChanges {
        public int count;
        public int start;
        public int to;

        ListChanges() {
        }
    }

    public ListChangeRegistry() {
        super(NOTIFIER_CALLBACK);
    }

    private static ListChanges acquire(int i4, int i5, int i6) {
        ListChanges acquire = sListChanges.acquire();
        if (acquire == null) {
            acquire = new ListChanges();
        }
        acquire.start = i4;
        acquire.to = i5;
        acquire.count = i6;
        return acquire;
    }

    public void notifyChanged(@o0 ObservableList observableList) {
        notifyCallbacks(observableList, 0, (ListChanges) null);
    }

    public void notifyInserted(@o0 ObservableList observableList, int i4, int i5) {
        notifyCallbacks(observableList, 2, acquire(i4, 0, i5));
    }

    public void notifyMoved(@o0 ObservableList observableList, int i4, int i5, int i6) {
        notifyCallbacks(observableList, 3, acquire(i4, i5, i6));
    }

    public void notifyRemoved(@o0 ObservableList observableList, int i4, int i5) {
        notifyCallbacks(observableList, 4, acquire(i4, 0, i5));
    }

    @Override // androidx.databinding.CallbackRegistry
    public synchronized void notifyCallbacks(@o0 ObservableList observableList, int i4, ListChanges listChanges) {
        super.notifyCallbacks((ListChangeRegistry) observableList, i4, (int) listChanges);
        if (listChanges != null) {
            sListChanges.release(listChanges);
        }
    }

    public void notifyChanged(@o0 ObservableList observableList, int i4, int i5) {
        notifyCallbacks(observableList, 1, acquire(i4, 0, i5));
    }
}

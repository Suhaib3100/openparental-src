package androidx.databinding;

import androidx.databinding.ObservableMap;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class ObservableArrayMap<K, V> extends androidx.collection.a<K, V> implements ObservableMap<K, V> {
    private transient MapChangeRegistry mListeners;

    private void notifyChange(Object obj) {
        MapChangeRegistry mapChangeRegistry = this.mListeners;
        if (mapChangeRegistry != null) {
            mapChangeRegistry.notifyCallbacks(this, 0, obj);
        }
    }

    @Override // androidx.databinding.ObservableMap
    public void addOnMapChangedCallback(ObservableMap.OnMapChangedCallback<? extends ObservableMap<K, V>, K, V> onMapChangedCallback) {
        if (this.mListeners == null) {
            this.mListeners = new MapChangeRegistry();
        }
        this.mListeners.add(onMapChangedCallback);
    }

    @Override // androidx.collection.a3, java.util.Map
    public void clear() {
        if (isEmpty()) {
            return;
        }
        super.clear();
        notifyChange(null);
    }

    @Override // androidx.collection.a3, java.util.Map
    public V put(K k4, V v4) {
        super.put(k4, v4);
        notifyChange(k4);
        return v4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.a
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            int indexOfKey = indexOfKey(it.next());
            if (indexOfKey >= 0) {
                removeAt(indexOfKey);
                z4 = true;
            }
        }
        return z4;
    }

    @Override // androidx.collection.a3
    public V removeAt(int i4) {
        K keyAt = keyAt(i4);
        V v4 = (V) super.removeAt(i4);
        if (v4 != null) {
            notifyChange(keyAt);
        }
        return v4;
    }

    @Override // androidx.databinding.ObservableMap
    public void removeOnMapChangedCallback(ObservableMap.OnMapChangedCallback<? extends ObservableMap<K, V>, K, V> onMapChangedCallback) {
        MapChangeRegistry mapChangeRegistry = this.mListeners;
        if (mapChangeRegistry != null) {
            mapChangeRegistry.remove(onMapChangedCallback);
        }
    }

    @Override // androidx.collection.a
    public boolean retainAll(Collection<?> collection) {
        boolean z4 = false;
        for (int size = getSize() - 1; size >= 0; size--) {
            if (!collection.contains(keyAt(size))) {
                removeAt(size);
                z4 = true;
            }
        }
        return z4;
    }

    @Override // androidx.collection.a3
    public V setValueAt(int i4, V v4) {
        K keyAt = keyAt(i4);
        V v5 = (V) super.setValueAt(i4, v4);
        notifyChange(keyAt);
        return v5;
    }
}

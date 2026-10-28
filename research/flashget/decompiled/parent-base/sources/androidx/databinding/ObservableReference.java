package androidx.databinding;

import androidx.annotation.c1;
import androidx.view.InterfaceC1423e0;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
interface ObservableReference<T> {
    void addListener(T t4);

    WeakListener<T> getListener();

    void removeListener(T t4);

    void setLifecycleOwner(InterfaceC1423e0 interfaceC1423e0);
}

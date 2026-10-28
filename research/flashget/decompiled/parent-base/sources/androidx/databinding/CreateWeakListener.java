package androidx.databinding;

import androidx.annotation.c1;
import java.lang.ref.ReferenceQueue;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
interface CreateWeakListener {
    WeakListener create(ViewDataBinding viewDataBinding, int i4, ReferenceQueue<ViewDataBinding> referenceQueue);
}

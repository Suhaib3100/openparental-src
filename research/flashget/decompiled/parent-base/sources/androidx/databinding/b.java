package androidx.databinding;

import java.lang.ref.ReferenceQueue;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements CreateWeakListener {
    @Override // androidx.databinding.CreateWeakListener
    public final WeakListener create(ViewDataBinding viewDataBinding, int i4, ReferenceQueue referenceQueue) {
        WeakListener CREATE_STATE_FLOW_LISTENER$lambda$0;
        CREATE_STATE_FLOW_LISTENER$lambda$0 = ViewDataBindingKtx.CREATE_STATE_FLOW_LISTENER$lambda$0(viewDataBinding, i4, referenceQueue);
        return CREATE_STATE_FLOW_LISTENER$lambda$0;
    }
}

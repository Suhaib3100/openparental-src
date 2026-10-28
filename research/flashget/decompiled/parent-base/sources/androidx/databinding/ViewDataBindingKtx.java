package androidx.databinding;

import androidx.annotation.c1;
import androidx.view.C1425f0;
import androidx.view.InterfaceC1423e0;
import fg.l;
import fg.m;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.k;
import kotlinx.coroutines.k2;

/* compiled from: ViewDataBindingKtx.kt */
@c1({c1.a.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/databinding/ViewDataBindingKtx;", "", "<init>", "()V", "Landroidx/databinding/ViewDataBinding;", "viewDataBinding", "", "localFieldId", "Lkotlinx/coroutines/flow/i;", "observable", "", "updateStateFlowRegistration", "(Landroidx/databinding/ViewDataBinding;ILkotlinx/coroutines/flow/i;)Z", "Landroidx/databinding/CreateWeakListener;", "CREATE_STATE_FLOW_LISTENER", "Landroidx/databinding/CreateWeakListener;", "StateFlowListener", "databindingKtx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewDataBindingKtx {

    @l
    public static final ViewDataBindingKtx INSTANCE = new ViewDataBindingKtx();

    @l
    private static final CreateWeakListener CREATE_STATE_FLOW_LISTENER = new b();

    /* compiled from: ViewDataBindingKtx.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B'\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u000f2\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u000f2\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/databinding/ViewDataBindingKtx$StateFlowListener;", "Landroidx/databinding/ObservableReference;", "Lkotlinx/coroutines/flow/i;", "", "Landroidx/databinding/ViewDataBinding;", "binder", "", "localFieldId", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "<init>", "(Landroidx/databinding/ViewDataBinding;ILjava/lang/ref/ReferenceQueue;)V", "Landroidx/lifecycle/e0;", "owner", "flow", "Lkotlin/k2;", "startCollection", "(Landroidx/lifecycle/e0;Lkotlinx/coroutines/flow/i;)V", "Landroidx/databinding/WeakListener;", "getListener", "()Landroidx/databinding/WeakListener;", "target", "addListener", "(Lkotlinx/coroutines/flow/i;)V", "removeListener", "lifecycleOwner", "setLifecycleOwner", "(Landroidx/lifecycle/e0;)V", "Ljava/lang/ref/WeakReference;", "_lifecycleOwnerRef", "Ljava/lang/ref/WeakReference;", "Lkotlinx/coroutines/k2;", "observerJob", "Lkotlinx/coroutines/k2;", "listener", "Landroidx/databinding/WeakListener;", "databindingKtx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StateFlowListener implements ObservableReference<i<? extends Object>> {

        @m
        private WeakReference<InterfaceC1423e0> _lifecycleOwnerRef;

        @l
        private final WeakListener<i<Object>> listener;

        @m
        private k2 observerJob;

        public StateFlowListener(@m ViewDataBinding viewDataBinding, int i4, @l ReferenceQueue<ViewDataBinding> referenceQueue) {
            l0.p(referenceQueue, "referenceQueue");
            this.listener = new WeakListener<>(viewDataBinding, i4, this, referenceQueue);
        }

        private final void startCollection(InterfaceC1423e0 owner, i<? extends Object> flow) {
            k2 f4;
            k2 k2Var = this.observerJob;
            if (k2Var != null) {
                k2.a.b(k2Var, null, 1, null);
            }
            f4 = k.f(C1425f0.a(owner), null, null, new ViewDataBindingKtx$StateFlowListener$startCollection$1(owner, flow, this, null), 3, null);
            this.observerJob = f4;
        }

        @Override // androidx.databinding.ObservableReference
        @l
        public WeakListener<i<? extends Object>> getListener() {
            return this.listener;
        }

        @Override // androidx.databinding.ObservableReference
        public void setLifecycleOwner(@m InterfaceC1423e0 lifecycleOwner) {
            WeakReference<InterfaceC1423e0> weakReference = this._lifecycleOwnerRef;
            if ((weakReference != null ? weakReference.get() : null) == lifecycleOwner) {
                return;
            }
            k2 k2Var = this.observerJob;
            if (k2Var != null) {
                k2.a.b(k2Var, null, 1, null);
            }
            if (lifecycleOwner == null) {
                this._lifecycleOwnerRef = null;
                return;
            }
            this._lifecycleOwnerRef = new WeakReference<>(lifecycleOwner);
            i<? extends Object> iVar = (i) this.listener.getTarget();
            if (iVar != null) {
                startCollection(lifecycleOwner, iVar);
            }
        }

        @Override // androidx.databinding.ObservableReference
        public void addListener(@m i<? extends Object> target) {
            InterfaceC1423e0 interfaceC1423e0;
            WeakReference<InterfaceC1423e0> weakReference = this._lifecycleOwnerRef;
            if (weakReference == null || (interfaceC1423e0 = weakReference.get()) == null || target == null) {
                return;
            }
            startCollection(interfaceC1423e0, target);
        }

        @Override // androidx.databinding.ObservableReference
        public void removeListener(@m i<? extends Object> target) {
            k2 k2Var = this.observerJob;
            if (k2Var != null) {
                k2.a.b(k2Var, null, 1, null);
            }
            this.observerJob = null;
        }
    }

    private ViewDataBindingKtx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WeakListener CREATE_STATE_FLOW_LISTENER$lambda$0(ViewDataBinding viewDataBinding, int i4, ReferenceQueue referenceQueue) {
        l0.m(referenceQueue);
        return new StateFlowListener(viewDataBinding, i4, referenceQueue).getListener();
    }

    @n
    @c1({c1.a.LIBRARY_GROUP})
    public static final boolean updateStateFlowRegistration(@l ViewDataBinding viewDataBinding, int localFieldId, @m i<?> observable) {
        l0.p(viewDataBinding, "viewDataBinding");
        viewDataBinding.mInStateFlowRegisterObserver = true;
        try {
            return viewDataBinding.updateRegistration(localFieldId, observable, CREATE_STATE_FLOW_LISTENER);
        } finally {
            viewDataBinding.mInStateFlowRegisterObserver = false;
        }
    }
}

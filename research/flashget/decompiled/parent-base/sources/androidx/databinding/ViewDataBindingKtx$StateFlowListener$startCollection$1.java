package androidx.databinding;

import androidx.databinding.ViewDataBindingKtx;
import androidx.view.AbstractC1450w;
import androidx.view.InterfaceC1423e0;
import androidx.view.RepeatOnLifecycleKt;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.k2;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.r0;
import ld.p;

/* compiled from: ViewDataBindingKtx.kt */
@f(c = "androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1", f = "ViewDataBindingKtx.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class ViewDataBindingKtx$StateFlowListener$startCollection$1 extends o implements p<r0, d<? super k2>, Object> {
    final /* synthetic */ i<Object> $flow;
    final /* synthetic */ InterfaceC1423e0 $owner;
    int label;
    final /* synthetic */ ViewDataBindingKtx.StateFlowListener this$0;

    /* compiled from: ViewDataBindingKtx.kt */
    @f(c = "androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1$1", f = "ViewDataBindingKtx.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends o implements p<r0, d<? super k2>, Object> {
        final /* synthetic */ i<Object> $flow;
        int label;
        final /* synthetic */ ViewDataBindingKtx.StateFlowListener this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(i<? extends Object> iVar, ViewDataBindingKtx.StateFlowListener stateFlowListener, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$flow = iVar;
            this.this$0 = stateFlowListener;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<k2> create(@m Object obj, @l d<?> dVar) {
            return new AnonymousClass1(this.$flow, this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.label;
            if (i4 == 0) {
                a1.n(obj);
                i<Object> iVar = this.$flow;
                final ViewDataBindingKtx.StateFlowListener stateFlowListener = this.this$0;
                j<? super Object> jVar = new j() { // from class: androidx.databinding.ViewDataBindingKtx.StateFlowListener.startCollection.1.1.1
                    @Override // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(@m Object obj2, @l d<? super k2> dVar) {
                        WeakListener weakListener;
                        WeakListener weakListener2;
                        WeakListener weakListener3;
                        weakListener = ViewDataBindingKtx.StateFlowListener.this.listener;
                        ViewDataBinding binder = weakListener.getBinder();
                        if (binder != null) {
                            weakListener2 = ViewDataBindingKtx.StateFlowListener.this.listener;
                            int i5 = weakListener2.mLocalFieldId;
                            weakListener3 = ViewDataBindingKtx.StateFlowListener.this.listener;
                            binder.handleFieldChange(i5, weakListener3.getTarget(), 0);
                        }
                        return k2.f75408a;
                    }
                };
                this.label = 1;
                if (iVar.a(jVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @m
        public final Object invoke(@l r0 r0Var, @m d<? super k2> dVar) {
            return ((AnonymousClass1) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewDataBindingKtx$StateFlowListener$startCollection$1(InterfaceC1423e0 interfaceC1423e0, i<? extends Object> iVar, ViewDataBindingKtx.StateFlowListener stateFlowListener, d<? super ViewDataBindingKtx$StateFlowListener$startCollection$1> dVar) {
        super(2, dVar);
        this.$owner = interfaceC1423e0;
        this.$flow = iVar;
        this.this$0 = stateFlowListener;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<k2> create(@m Object obj, @l d<?> dVar) {
        return new ViewDataBindingKtx$StateFlowListener$startCollection$1(this.$owner, this.$flow, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        int i4 = this.label;
        if (i4 == 0) {
            a1.n(obj);
            AbstractC1450w lifecycle = this.$owner.getLifecycle();
            AbstractC1450w.b bVar = AbstractC1450w.b.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$flow, this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.a(lifecycle, bVar, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
        }
        return k2.f75408a;
    }

    @Override // ld.p
    @m
    public final Object invoke(@l r0 r0Var, @m d<? super k2> dVar) {
        return ((ViewDataBindingKtx$StateFlowListener$startCollection$1) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
    }
}

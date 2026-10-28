package androidx.content;

import android.content.Context;
import androidx.view.InterfaceC1423e0;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.n1;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: NavHostController.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/navigation/q0;", "Landroidx/navigation/u;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/lifecycle/e0;", "owner", "Lkotlin/k2;", "Q0", "(Landroidx/lifecycle/e0;)V", "Landroidx/activity/OnBackPressedDispatcher;", "dispatcher", "S0", "(Landroidx/activity/OnBackPressedDispatcher;)V", "", "enabled", "x", "(Z)V", "Landroidx/lifecycle/n1;", "viewModelStore", "T0", "(Landroidx/lifecycle/n1;)V", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class q0 extends u {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(@l Context context) {
        super(context);
        l0.p(context, "context");
    }

    @Override // androidx.content.u
    public final void Q0(@l InterfaceC1423e0 owner) {
        l0.p(owner, "owner");
        super.Q0(owner);
    }

    @Override // androidx.content.u
    public final void S0(@l OnBackPressedDispatcher dispatcher) {
        l0.p(dispatcher, "dispatcher");
        super.S0(dispatcher);
    }

    @Override // androidx.content.u
    public final void T0(@l n1 viewModelStore) {
        l0.p(viewModelStore, "viewModelStore");
        super.T0(viewModelStore);
    }

    @Override // androidx.content.u
    public final void x(boolean enabled) {
        super.x(enabled);
    }
}

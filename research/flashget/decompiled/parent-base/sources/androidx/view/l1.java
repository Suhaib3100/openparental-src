package androidx.view;

import fg.l;
import kd.i;
import kotlin.AbstractC1477a;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ViewModelProvider.kt */
@i(name = "ViewModelProviderGetKt")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a \u0010\b\u001a\u00028\u0000\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0005*\u00020\u0007H\u0087\b¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/lifecycle/o1;", "owner", "Lm2/a;", "a", "(Landroidx/lifecycle/o1;)Lm2/a;", "Landroidx/lifecycle/h1;", "VM", "Landroidx/lifecycle/k1;", "b", "(Landroidx/lifecycle/k1;)Landroidx/lifecycle/h1;", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l1 {
    @l
    public static final AbstractC1477a a(@l o1 owner) {
        l0.p(owner, "owner");
        return owner instanceof InterfaceC1449v ? ((InterfaceC1449v) owner).getDefaultViewModelCreationExtras() : AbstractC1477a.C1272a.f81491b;
    }

    @androidx.annotation.l0
    public static final <VM extends h1> VM b(k1 k1Var) {
        l0.p(k1Var, "<this>");
        l0.P();
        return (VM) k1Var.a(h1.class);
    }
}

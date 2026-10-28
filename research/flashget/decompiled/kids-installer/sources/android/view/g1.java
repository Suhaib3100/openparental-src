package android.view;

import d5.d;
import kotlin.AbstractC0540a;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import p3.i;

/* compiled from: ViewModelProvider.kt */
@i(name = "ViewModelProviderGetKt")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a \u0010\u0007\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0004*\u00020\u0006H\u0087\b¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/i1;", "owner", "Ll0/a;", "a", "Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/f1;", "b", "(Landroidx/lifecycle/f1;)Landroidx/lifecycle/c1;", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class g1 {
    @d
    public static final AbstractC0540a a(@d i1 owner) {
        l0.p(owner, "owner");
        if (!(owner instanceof s)) {
            return AbstractC0540a.C0459a.f29101b;
        }
        AbstractC0540a defaultViewModelCreationExtras = ((s) owner).getDefaultViewModelCreationExtras();
        l0.o(defaultViewModelCreationExtras, "{\n        owner.defaultV…ModelCreationExtras\n    }");
        return defaultViewModelCreationExtras;
    }

    @androidx.annotation.l0
    public static final <VM extends c1> VM b(f1 f1Var) {
        l0.p(f1Var, "<this>");
        l0.P();
        return (VM) f1Var.a(c1.class);
    }
}

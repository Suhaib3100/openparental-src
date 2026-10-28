package androidx.view;

import androidx.view.AbstractC1450w;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: CompositeGeneratedAdaptersObserver.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/b0;", "", "Landroidx/lifecycle/t;", "generatedAdapters", "<init>", "([Landroidx/lifecycle/t;)V", "Landroidx/lifecycle/e0;", "source", "Landroidx/lifecycle/w$a;", "event", "Lkotlin/k2;", "f", "(Landroidx/lifecycle/e0;Landroidx/lifecycle/w$a;)V", "b", "[Landroidx/lifecycle/t;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CompositeGeneratedAdaptersObserver implements InterfaceC1416b0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final InterfaceC1447t[] generatedAdapters;

    public CompositeGeneratedAdaptersObserver(@l InterfaceC1447t[] generatedAdapters) {
        l0.p(generatedAdapters, "generatedAdapters");
        this.generatedAdapters = generatedAdapters;
    }

    @Override // androidx.view.InterfaceC1416b0
    public void f(@l InterfaceC1423e0 source, @l AbstractC1450w.a event) {
        l0.p(source, "source");
        l0.p(event, "event");
        n0 n0Var = new n0();
        for (InterfaceC1447t interfaceC1447t : this.generatedAdapters) {
            interfaceC1447t.a(source, event, false, n0Var);
        }
        for (InterfaceC1447t interfaceC1447t2 : this.generatedAdapters) {
            interfaceC1447t2.a(source, event, true, n0Var);
        }
    }
}

package androidx.view;

import androidx.view.AbstractC1450w;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: SavedStateHandleSupport.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/b0;", "Landroidx/lifecycle/a1;", "provider", "<init>", "(Landroidx/lifecycle/a1;)V", "Landroidx/lifecycle/e0;", "source", "Landroidx/lifecycle/w$a;", "event", "Lkotlin/k2;", "f", "(Landroidx/lifecycle/e0;Landroidx/lifecycle/w$a;)V", "b", "Landroidx/lifecycle/a1;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavedStateHandleAttacher implements InterfaceC1416b0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final a1 provider;

    public SavedStateHandleAttacher(@l a1 provider) {
        l0.p(provider, "provider");
        this.provider = provider;
    }

    @Override // androidx.view.InterfaceC1416b0
    public void f(@l InterfaceC1423e0 source, @l AbstractC1450w.a event) {
        l0.p(source, "source");
        l0.p(event, "event");
        if (event == AbstractC1450w.a.ON_CREATE) {
            source.getLifecycle().d(this);
            this.provider.d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}

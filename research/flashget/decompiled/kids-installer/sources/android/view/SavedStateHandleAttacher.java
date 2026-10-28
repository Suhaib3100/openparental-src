package android.view;

import android.view.t;
import d5.d;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: SavedStateHandleSupport.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/w;", "Landroidx/lifecycle/a0;", "source", "Landroidx/lifecycle/t$b;", "event", "Lkotlin/m2;", "h", "Landroidx/lifecycle/u0;", "o", "Landroidx/lifecycle/u0;", "provider", "<init>", "(Landroidx/lifecycle/u0;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class SavedStateHandleAttacher implements w {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d
    private final u0 provider;

    public SavedStateHandleAttacher(@d u0 provider) {
        l0.p(provider, "provider");
        this.provider = provider;
    }

    @Override // android.view.w
    public void h(@d a0 source, @d t.b event) {
        l0.p(source, "source");
        l0.p(event, "event");
        if (event == t.b.ON_CREATE) {
            source.getLifecycle().c(this);
            this.provider.d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}

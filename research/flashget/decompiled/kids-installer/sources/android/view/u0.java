package android.view;

import android.os.Bundle;
import android.view.C0536c;
import d5.d;
import d5.e;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.d0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;

/* compiled from: SavedStateHandleSupport.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014¨\u0006\u001a"}, d2 = {"Landroidx/lifecycle/u0;", "Landroidx/savedstate/c$c;", "Landroid/os/Bundle;", "a", "Lkotlin/m2;", "d", "", "key", "b", "Landroidx/savedstate/c;", "Landroidx/savedstate/c;", "savedStateRegistry", "", "Z", "restored", "c", "Landroid/os/Bundle;", "restoredState", "Landroidx/lifecycle/v0;", "Lkotlin/b0;", "()Landroidx/lifecycle/v0;", "viewModel", "Landroidx/lifecycle/i1;", "viewModelStoreOwner", "<init>", "(Landroidx/savedstate/c;Landroidx/lifecycle/i1;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class u0 implements C0536c.InterfaceC0117c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    private final C0536c savedStateRegistry;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean restored;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @e
    private Bundle restoredState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d
    private final Lazy viewModel;

    /* compiled from: SavedStateHandleSupport.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/v0;", "a", "()Landroidx/lifecycle/v0;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements q3.a<v0> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ i1 f8680p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i1 i1Var) {
            super(0);
            this.f8680p = i1Var;
        }

        @Override // q3.a
        @d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v0 n() {
            return t0.e(this.f8680p);
        }
    }

    public u0(@d C0536c savedStateRegistry, @d i1 viewModelStoreOwner) {
        Lazy c6;
        l0.p(savedStateRegistry, "savedStateRegistry");
        l0.p(viewModelStoreOwner, "viewModelStoreOwner");
        this.savedStateRegistry = savedStateRegistry;
        c6 = d0.c(new a(viewModelStoreOwner));
        this.viewModel = c6;
    }

    private final v0 c() {
        return (v0) this.viewModel.getValue();
    }

    @Override // android.view.C0536c.InterfaceC0117c
    @d
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, s0> entry : c().g().entrySet()) {
            String key = entry.getKey();
            Bundle a6 = entry.getValue().getSavedStateProvider().a();
            if (!l0.g(a6, Bundle.EMPTY)) {
                bundle.putBundle(key, a6);
            }
        }
        this.restored = false;
        return bundle;
    }

    @e
    public final Bundle b(@d String key) {
        l0.p(key, "key");
        d();
        Bundle bundle = this.restoredState;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.restoredState;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.restoredState;
        boolean z5 = false;
        if (bundle4 != null && bundle4.isEmpty()) {
            z5 = true;
        }
        if (z5) {
            this.restoredState = null;
        }
        return bundle2;
    }

    public final void d() {
        if (this.restored) {
            return;
        }
        this.restoredState = this.savedStateRegistry.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        this.restored = true;
        c();
    }
}

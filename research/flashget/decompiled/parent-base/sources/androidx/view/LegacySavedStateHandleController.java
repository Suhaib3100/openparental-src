package androidx.view;

import android.os.Bundle;
import androidx.view.AbstractC1450w;
import androidx.view.C1459c;
import androidx.view.InterfaceC1461e;
import androidx.view.LegacySavedStateHandleController;
import fg.l;
import fg.m;
import java.util.Iterator;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: LegacySavedStateHandleController.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController;", "", "<init>", "()V", "Landroidx/savedstate/c;", "registry", "Landroidx/lifecycle/w;", "lifecycle", "", "key", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/SavedStateHandleController;", "b", "(Landroidx/savedstate/c;Landroidx/lifecycle/w;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/h1;", "viewModel", "Lkotlin/k2;", "a", "(Landroidx/lifecycle/h1;Landroidx/savedstate/c;Landroidx/lifecycle/w;)V", "c", "(Landroidx/savedstate/c;Landroidx/lifecycle/w;)V", "Ljava/lang/String;", "TAG_SAVED_STATE_HANDLE_CONTROLLER", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LegacySavedStateHandleController {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    public static final String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final LegacySavedStateHandleController f30153a = new LegacySavedStateHandleController();

    /* compiled from: LegacySavedStateHandleController.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController$a;", "Landroidx/savedstate/c$a;", "<init>", "()V", "Landroidx/savedstate/e;", "owner", "Lkotlin/k2;", "a", "(Landroidx/savedstate/e;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements C1459c.a {
        @Override // androidx.view.C1459c.a
        public void a(@l InterfaceC1461e owner) {
            l0.p(owner, "owner");
            if (!(owner instanceof o1)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            n1 viewModelStore = ((o1) owner).getViewModelStore();
            C1459c savedStateRegistry = owner.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                h1 b5 = viewModelStore.b(it.next());
                l0.m(b5);
                LegacySavedStateHandleController.a(b5, savedStateRegistry, owner.getLifecycle());
            }
            if (viewModelStore.c().isEmpty()) {
                return;
            }
            savedStateRegistry.k(a.class);
        }
    }

    private LegacySavedStateHandleController() {
    }

    @n
    public static final void a(@l h1 viewModel, @l C1459c registry, @l AbstractC1450w lifecycle) {
        l0.p(viewModel, "viewModel");
        l0.p(registry, "registry");
        l0.p(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.getIsAttached()) {
            return;
        }
        savedStateHandleController.a(registry, lifecycle);
        f30153a.c(registry, lifecycle);
    }

    @l
    @n
    public static final SavedStateHandleController b(@l C1459c registry, @l AbstractC1450w lifecycle, @m String key, @m Bundle defaultArgs) {
        l0.p(registry, "registry");
        l0.p(lifecycle, "lifecycle");
        l0.m(key);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(key, y0.INSTANCE.a(registry.b(key), defaultArgs));
        savedStateHandleController.a(registry, lifecycle);
        f30153a.c(registry, lifecycle);
        return savedStateHandleController;
    }

    private final void c(final C1459c registry, final AbstractC1450w lifecycle) {
        AbstractC1450w.b state = lifecycle.getState();
        if (state == AbstractC1450w.b.INITIALIZED || state.isAtLeast(AbstractC1450w.b.STARTED)) {
            registry.k(a.class);
        } else {
            lifecycle.a(new InterfaceC1416b0() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.view.InterfaceC1416b0
                public void f(@l InterfaceC1423e0 source, @l AbstractC1450w.a event) {
                    l0.p(source, "source");
                    l0.p(event, "event");
                    if (event == AbstractC1450w.a.ON_START) {
                        AbstractC1450w.this.d(this);
                        registry.k(LegacySavedStateHandleController.a.class);
                    }
                }
            });
        }
    }
}

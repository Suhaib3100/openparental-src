package android.view;

import android.os.Bundle;
import android.view.C0536c;
import android.view.InterfaceC0538e;
import android.view.t;
import androidx.annotation.o0;
import java.util.Iterator;

/* loaded from: classes.dex */
class LegacySavedStateHandleController {

    /* renamed from: a, reason: collision with root package name */
    static final String f8395a = "androidx.lifecycle.savedstate.vm.tag";

    /* loaded from: classes3.dex */
    static final class a implements C0536c.a {
        a() {
        }

        @Override // android.view.C0536c.a
        public void a(@o0 InterfaceC0538e interfaceC0538e) {
            if (!(interfaceC0538e instanceof i1)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            h1 viewModelStore = ((i1) interfaceC0538e).getViewModelStore();
            C0536c savedStateRegistry = interfaceC0538e.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                LegacySavedStateHandleController.a(viewModelStore.b(it.next()), savedStateRegistry, interfaceC0538e.getLifecycle());
            }
            if (viewModelStore.c().isEmpty()) {
                return;
            }
            savedStateRegistry.k(a.class);
        }
    }

    private LegacySavedStateHandleController() {
    }

    static void a(c1 c1Var, C0536c c0536c, t tVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) c1Var.d("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.j()) {
            return;
        }
        savedStateHandleController.g(c0536c, tVar);
        c(c0536c, tVar);
    }

    static SavedStateHandleController b(C0536c c0536c, t tVar, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, s0.g(c0536c.b(str), bundle));
        savedStateHandleController.g(c0536c, tVar);
        c(c0536c, tVar);
        return savedStateHandleController;
    }

    private static void c(final C0536c c0536c, final t tVar) {
        t.c b6 = tVar.b();
        if (b6 == t.c.INITIALIZED || b6.isAtLeast(t.c.STARTED)) {
            c0536c.k(a.class);
        } else {
            tVar.a(new w() { // from class: androidx.lifecycle.LegacySavedStateHandleController.1
                @Override // android.view.w
                public void h(@o0 a0 a0Var, @o0 t.b bVar) {
                    if (bVar == t.b.ON_START) {
                        t.this.c(this);
                        c0536c.k(a.class);
                    }
                }
            });
        }
    }
}

package android.view;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Recreator;
import android.view.a0;
import android.view.t;
import d5.d;
import d5.e;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: SavedStateRegistry.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0003\u001a\u0005\nB\t\b\u0000¢\u0006\u0004\b.\u0010/J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000f\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\fH\u0007J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0004H\u0007R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010 R$\u0010&\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001d8G@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010(R\"\u0010-\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001e\u001a\u0004\b#\u0010%\"\u0004\b+\u0010,¨\u00060"}, d2 = {"Landroidx/savedstate/c;", "", "", "key", "Landroid/os/Bundle;", "b", "Landroidx/savedstate/c$c;", "provider", "Lkotlin/m2;", "j", "c", "m", "Ljava/lang/Class;", "Landroidx/savedstate/c$a;", "clazz", "k", "Landroidx/lifecycle/t;", "lifecycle", "g", "(Landroidx/lifecycle/t;)V", "savedState", "h", "(Landroid/os/Bundle;)V", "outBundle", "i", "Landroidx/arch/core/internal/b;", "a", "Landroidx/arch/core/internal/b;", "components", "", "Z", "attached", "Landroid/os/Bundle;", "restoredState", "<set-?>", "d", "e", "()Z", "isRestored", "Landroidx/savedstate/Recreator$b;", "Landroidx/savedstate/Recreator$b;", "recreatorProvider", "f", "l", "(Z)V", "isAllowingSavingState", "<init>", "()V", "savedstate_release"}, k = 1, mv = {1, 6, 0})
@SuppressLint({"RestrictedApi"})
/* renamed from: androidx.savedstate.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0536c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean attached;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @e
    private Bundle restoredState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isRestored;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @e
    private Recreator.b recreatorProvider;

    /* renamed from: h, reason: collision with root package name */
    @d
    @Deprecated
    private static final String f9628h = "androidx.lifecycle.BundlableSavedStateRegistry.key";

    /* renamed from: g, reason: collision with root package name */
    @d
    private static final b f9627g = new b(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    private final androidx.arch.core.internal.b<String, InterfaceC0117c> components = new androidx.arch.core.internal.b<>();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isAllowingSavingState = true;

    /* compiled from: SavedStateRegistry.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Landroidx/savedstate/c$a;", "", "Landroidx/savedstate/e;", "owner", "Lkotlin/m2;", "a", "savedstate_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: androidx.savedstate.c$a */
    public interface a {
        void a(@d InterfaceC0538e interfaceC0538e);
    }

    /* compiled from: SavedStateRegistry.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/savedstate/c$b;", "", "", "SAVED_COMPONENTS_KEY", "Ljava/lang/String;", "<init>", "()V", "savedstate_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: androidx.savedstate.c$b */
    private static final class b {
        private b() {
        }

        public b(w wVar) {
        }
    }

    /* compiled from: SavedStateRegistry.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Landroidx/savedstate/c$c;", "", "Landroid/os/Bundle;", "a", "savedstate_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: androidx.savedstate.c$c, reason: collision with other inner class name */
    public interface InterfaceC0117c {
        @d
        Bundle a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C0536c this$0, a0 a0Var, t.b event) {
        l0.p(this$0, "this$0");
        l0.p(a0Var, "<anonymous parameter 0>");
        l0.p(event, "event");
        if (event == t.b.ON_START) {
            this$0.isAllowingSavingState = true;
        } else if (event == t.b.ON_STOP) {
            this$0.isAllowingSavingState = false;
        }
    }

    @e
    @androidx.annotation.l0
    public final Bundle b(@d String key) {
        l0.p(key, "key");
        if (!this.isRestored) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.restoredState;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.restoredState;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.restoredState;
        boolean z5 = false;
        if (bundle4 != null && !bundle4.isEmpty()) {
            z5 = true;
        }
        if (!z5) {
            this.restoredState = null;
        }
        return bundle2;
    }

    @e
    public final InterfaceC0117c c(@d String key) {
        l0.p(key, "key");
        Iterator<Map.Entry<String, InterfaceC0117c>> it = this.components.iterator();
        while (it.hasNext()) {
            Map.Entry<String, InterfaceC0117c> components = it.next();
            l0.o(components, "components");
            String key2 = components.getKey();
            InterfaceC0117c value = components.getValue();
            if (l0.g(key2, key)) {
                return value;
            }
        }
        return null;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsAllowingSavingState() {
        return this.isAllowingSavingState;
    }

    @androidx.annotation.l0
    /* renamed from: e, reason: from getter */
    public final boolean getIsRestored() {
        return this.isRestored;
    }

    @androidx.annotation.l0
    public final void g(@d t lifecycle) {
        l0.p(lifecycle, "lifecycle");
        if (!(!this.attached)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lifecycle.a(new w() { // from class: androidx.savedstate.b
            @Override // android.view.w
            public final void h(a0 a0Var, t.b bVar) {
                C0536c.f(C0536c.this, a0Var, bVar);
            }
        });
        this.attached = true;
    }

    @androidx.annotation.l0
    public final void h(@e Bundle savedState) {
        if (!this.attached) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.isRestored)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.restoredState = savedState != null ? savedState.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.isRestored = true;
    }

    @androidx.annotation.l0
    public final void i(@d Bundle outBundle) {
        l0.p(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        androidx.arch.core.internal.b<String, InterfaceC0117c>.d g5 = this.components.g();
        l0.o(g5, "this.components.iteratorWithAdditions()");
        while (g5.hasNext()) {
            Map.Entry next = g5.next();
            bundle.putBundle((String) next.getKey(), ((InterfaceC0117c) next.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    @androidx.annotation.l0
    public final void j(@d String key, @d InterfaceC0117c provider) {
        l0.p(key, "key");
        l0.p(provider, "provider");
        if (!(this.components.o(key, provider) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    @androidx.annotation.l0
    public final void k(@d Class<? extends a> clazz) {
        l0.p(clazz, "clazz");
        if (!this.isAllowingSavingState) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.b bVar = this.recreatorProvider;
        if (bVar == null) {
            bVar = new Recreator.b(this);
        }
        this.recreatorProvider = bVar;
        try {
            clazz.getDeclaredConstructor(new Class[0]);
            Recreator.b bVar2 = this.recreatorProvider;
            if (bVar2 != null) {
                String name = clazz.getName();
                l0.o(name, "clazz.name");
                bVar2.b(name);
            }
        } catch (NoSuchMethodException e6) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e6);
        }
    }

    public final void l(boolean z5) {
        this.isAllowingSavingState = z5;
    }

    @androidx.annotation.l0
    public final void m(@d String key) {
        l0.p(key, "key");
        this.components.p(key);
    }
}

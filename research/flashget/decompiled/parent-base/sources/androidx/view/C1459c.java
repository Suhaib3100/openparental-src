package androidx.view;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.view.AbstractC1450w;
import androidx.view.InterfaceC1416b0;
import androidx.view.InterfaceC1423e0;
import androidx.view.Recreator;
import fg.l;
import fg.m;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

/* compiled from: SavedStateRegistry.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0003!\u0007\u000eB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000b2\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001f\u0010\u001dR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010'R$\u0010-\u001a\u00020$2\u0006\u0010)\u001a\u00020$8G@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010/R\"\u00104\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010%\u001a\u0004\b*\u0010,\"\u0004\b2\u00103¨\u00065"}, d2 = {"Landroidx/savedstate/c;", "", "<init>", "()V", "", "key", "Landroid/os/Bundle;", "b", "(Ljava/lang/String;)Landroid/os/Bundle;", "Landroidx/savedstate/c$c;", "provider", "Lkotlin/k2;", "j", "(Ljava/lang/String;Landroidx/savedstate/c$c;)V", "c", "(Ljava/lang/String;)Landroidx/savedstate/c$c;", "m", "(Ljava/lang/String;)V", "Ljava/lang/Class;", "Landroidx/savedstate/c$a;", "clazz", "k", "(Ljava/lang/Class;)V", "Landroidx/lifecycle/w;", "lifecycle", "g", "(Landroidx/lifecycle/w;)V", "savedState", "h", "(Landroid/os/Bundle;)V", "outBundle", "i", "Landroidx/arch/core/internal/b;", "a", "Landroidx/arch/core/internal/b;", "components", "", "Z", "attached", "Landroid/os/Bundle;", "restoredState", "<set-?>", "d", "e", "()Z", "isRestored", "Landroidx/savedstate/Recreator$b;", "Landroidx/savedstate/Recreator$b;", "recreatorProvider", "f", "l", "(Z)V", "isAllowingSavingState", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"RestrictedApi"})
@r1({"SMAP\nSavedStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateRegistry.kt\nandroidx/savedstate/SavedStateRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
/* renamed from: androidx.savedstate.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1459c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean attached;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private Bundle restoredState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isRestored;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @m
    private Recreator.b recreatorProvider;

    /* renamed from: h, reason: collision with root package name */
    @l
    @Deprecated
    private static final String f34010h = "androidx.lifecycle.BundlableSavedStateRegistry.key";

    /* renamed from: g, reason: collision with root package name */
    @l
    private static final b f34009g = new b();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final androidx.arch.core.internal.b<String, InterfaceC0615c> components = new androidx.arch.core.internal.b<>();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isAllowingSavingState = true;

    /* compiled from: SavedStateRegistry.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/savedstate/c$a;", "", "Landroidx/savedstate/e;", "owner", "Lkotlin/k2;", "a", "(Landroidx/savedstate/e;)V", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.savedstate.c$a */
    public interface a {
        void a(@l InterfaceC1461e owner);
    }

    /* compiled from: SavedStateRegistry.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/savedstate/c$b;", "", "<init>", "()V", "", "SAVED_COMPONENTS_KEY", "Ljava/lang/String;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.savedstate.c$b */
    private static final class b {
        private b() {
        }

        public b(w wVar) {
        }
    }

    /* compiled from: SavedStateRegistry.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/savedstate/c$c;", "", "Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.savedstate.c$c, reason: collision with other inner class name */
    public interface InterfaceC0615c {
        @l
        Bundle a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C1459c this$0, InterfaceC1423e0 interfaceC1423e0, AbstractC1450w.a event) {
        l0.p(this$0, "this$0");
        l0.p(interfaceC1423e0, "<anonymous parameter 0>");
        l0.p(event, "event");
        if (event == AbstractC1450w.a.ON_START) {
            this$0.isAllowingSavingState = true;
        } else if (event == AbstractC1450w.a.ON_STOP) {
            this$0.isAllowingSavingState = false;
        }
    }

    @m
    @androidx.annotation.l0
    public final Bundle b(@l String key) {
        l0.p(key, "key");
        if (!this.isRestored) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
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
        if (bundle4 == null || bundle4.isEmpty()) {
            this.restoredState = null;
        }
        return bundle2;
    }

    @m
    public final InterfaceC0615c c(@l String key) {
        l0.p(key, "key");
        Iterator<Map.Entry<String, InterfaceC0615c>> it = this.components.iterator();
        while (it.hasNext()) {
            Map.Entry<String, InterfaceC0615c> components = it.next();
            l0.o(components, "components");
            String key2 = components.getKey();
            InterfaceC0615c value = components.getValue();
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
    public final void g(@l AbstractC1450w lifecycle) {
        l0.p(lifecycle, "lifecycle");
        if (this.attached) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new InterfaceC1416b0() { // from class: androidx.savedstate.b
            @Override // androidx.view.InterfaceC1416b0
            public final void f(InterfaceC1423e0 interfaceC1423e0, AbstractC1450w.a aVar) {
                C1459c.f(C1459c.this, interfaceC1423e0, aVar);
            }
        });
        this.attached = true;
    }

    @androidx.annotation.l0
    public final void h(@m Bundle savedState) {
        if (!this.attached) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.isRestored) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.restoredState = savedState != null ? savedState.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.isRestored = true;
    }

    @androidx.annotation.l0
    public final void i(@l Bundle outBundle) {
        l0.p(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        androidx.arch.core.internal.b<String, InterfaceC0615c>.d f4 = this.components.f();
        l0.o(f4, "this.components.iteratorWithAdditions()");
        while (f4.hasNext()) {
            Map.Entry next = f4.next();
            bundle.putBundle((String) next.getKey(), ((InterfaceC0615c) next.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    @androidx.annotation.l0
    public final void j(@l String key, @l InterfaceC0615c provider) {
        l0.p(key, "key");
        l0.p(provider, "provider");
        if (this.components.j(key, provider) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    @androidx.annotation.l0
    public final void k(@l Class<? extends a> clazz) {
        l0.p(clazz, "clazz");
        if (!this.isAllowingSavingState) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        Recreator.b bVar = this.recreatorProvider;
        if (bVar == null) {
            bVar = new Recreator.b(this);
        }
        this.recreatorProvider = bVar;
        try {
            clazz.getDeclaredConstructor(null);
            Recreator.b bVar2 = this.recreatorProvider;
            if (bVar2 != null) {
                String name = clazz.getName();
                l0.o(name, "clazz.name");
                bVar2.b(name);
            }
        } catch (NoSuchMethodException e4) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
        }
    }

    public final void l(boolean z4) {
        this.isAllowingSavingState = z4;
    }

    @androidx.annotation.l0
    public final void m(@l String key) {
        l0.p(key, "key");
        this.components.l(key);
    }
}

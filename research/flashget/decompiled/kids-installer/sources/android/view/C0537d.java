package android.view;

import android.os.Bundle;
import android.view.t;
import d5.d;
import d5.e;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p3.n;

/* compiled from: SavedStateRegistryController.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/savedstate/d;", "", "Lkotlin/m2;", "c", "Landroid/os/Bundle;", "savedState", "d", "outBundle", "e", "Landroidx/savedstate/e;", "a", "Landroidx/savedstate/e;", "owner", "Landroidx/savedstate/c;", "b", "Landroidx/savedstate/c;", "()Landroidx/savedstate/c;", "savedStateRegistry", "", "Z", "attached", "<init>", "(Landroidx/savedstate/e;)V", "savedstate_release"}, k = 1, mv = {1, 6, 0})
/* renamed from: androidx.savedstate.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0537d {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    private final InterfaceC0538e owner;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d
    private final C0536c savedStateRegistry;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean attached;

    /* compiled from: SavedStateRegistryController.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Landroidx/savedstate/d$a;", "", "Landroidx/savedstate/e;", "owner", "Landroidx/savedstate/d;", "a", "<init>", "()V", "savedstate_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: androidx.savedstate.d$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @d
        @n
        public final C0537d a(@d InterfaceC0538e owner) {
            l0.p(owner, "owner");
            return new C0537d(owner, null);
        }

        public Companion(w wVar) {
        }
    }

    public /* synthetic */ C0537d(InterfaceC0538e interfaceC0538e, w wVar) {
        this(interfaceC0538e);
    }

    @d
    @n
    public static final C0537d a(@d InterfaceC0538e interfaceC0538e) {
        return INSTANCE.a(interfaceC0538e);
    }

    @d
    /* renamed from: b, reason: from getter */
    public final C0536c getSavedStateRegistry() {
        return this.savedStateRegistry;
    }

    @androidx.annotation.l0
    public final void c() {
        t lifecycle = this.owner.getLifecycle();
        l0.o(lifecycle, "owner.lifecycle");
        if (!(lifecycle.b() == t.c.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.a(new Recreator(this.owner));
        this.savedStateRegistry.g(lifecycle);
        this.attached = true;
    }

    @androidx.annotation.l0
    public final void d(@e Bundle bundle) {
        if (!this.attached) {
            c();
        }
        t lifecycle = this.owner.getLifecycle();
        l0.o(lifecycle, "owner.lifecycle");
        if (!lifecycle.b().isAtLeast(t.c.STARTED)) {
            this.savedStateRegistry.h(bundle);
        } else {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
        }
    }

    @androidx.annotation.l0
    public final void e(@d Bundle outBundle) {
        l0.p(outBundle, "outBundle");
        this.savedStateRegistry.i(outBundle);
    }

    private C0537d(InterfaceC0538e interfaceC0538e) {
        this.owner = interfaceC0538e;
        this.savedStateRegistry = new C0536c();
    }
}

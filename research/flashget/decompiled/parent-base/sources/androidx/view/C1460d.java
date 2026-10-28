package androidx.view;

import android.os.Bundle;
import androidx.view.AbstractC1450w;
import fg.l;
import fg.m;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: SavedStateRegistryController.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/savedstate/d;", "", "Landroidx/savedstate/e;", "owner", "<init>", "(Landroidx/savedstate/e;)V", "Lkotlin/k2;", "c", "()V", "Landroid/os/Bundle;", "savedState", "d", "(Landroid/os/Bundle;)V", "outBundle", "e", "a", "Landroidx/savedstate/e;", "Landroidx/savedstate/c;", "b", "Landroidx/savedstate/c;", "()Landroidx/savedstate/c;", "savedStateRegistry", "", "Z", "attached", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.savedstate.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1460d {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final InterfaceC1461e owner;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final C1459c savedStateRegistry;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean attached;

    /* compiled from: SavedStateRegistryController.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/savedstate/d$a;", "", "<init>", "()V", "Landroidx/savedstate/e;", "owner", "Landroidx/savedstate/d;", "a", "(Landroidx/savedstate/e;)Landroidx/savedstate/d;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.savedstate.d$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        @n
        public final C1460d a(@l InterfaceC1461e owner) {
            l0.p(owner, "owner");
            return new C1460d(owner, null);
        }

        public Companion(w wVar) {
        }
    }

    public /* synthetic */ C1460d(InterfaceC1461e interfaceC1461e, w wVar) {
        this(interfaceC1461e);
    }

    @l
    @n
    public static final C1460d a(@l InterfaceC1461e interfaceC1461e) {
        return INSTANCE.a(interfaceC1461e);
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C1459c getSavedStateRegistry() {
        return this.savedStateRegistry;
    }

    @androidx.annotation.l0
    public final void c() {
        AbstractC1450w lifecycle = this.owner.getLifecycle();
        if (lifecycle.getState() != AbstractC1450w.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new Recreator(this.owner));
        this.savedStateRegistry.g(lifecycle);
        this.attached = true;
    }

    @androidx.annotation.l0
    public final void d(@m Bundle savedState) {
        if (!this.attached) {
            c();
        }
        AbstractC1450w lifecycle = this.owner.getLifecycle();
        if (!lifecycle.getState().isAtLeast(AbstractC1450w.b.STARTED)) {
            this.savedStateRegistry.h(savedState);
        } else {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.getState()).toString());
        }
    }

    @androidx.annotation.l0
    public final void e(@l Bundle outBundle) {
        l0.p(outBundle, "outBundle");
        this.savedStateRegistry.i(outBundle);
    }

    private C1460d(InterfaceC1461e interfaceC1461e) {
        this.owner = interfaceC1461e;
        this.savedStateRegistry = new C1459c();
    }
}

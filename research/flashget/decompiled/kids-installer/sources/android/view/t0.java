package android.view;

import android.os.Bundle;
import android.view.C0536c;
import android.view.InterfaceC0538e;
import android.view.f1;
import android.view.t;
import kotlin.AbstractC0540a;
import kotlin.C0541c;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import p3.f;
import p3.i;
import q3.l;

/* compiled from: SavedStateHandleSupport.kt */
@i(name = "SavedStateHandleSupport")
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0003\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u001a\f\u0010\u000f\u001a\u00020\f*\u00020\u000eH\u0007\"\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0010\"\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014\"\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014\"\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014\"\u0018\u0010\u001c\u001a\u00020\u001a*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001b\"\u0018\u0010\u001f\u001a\u00020\u001d*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/savedstate/e;", "Landroidx/lifecycle/i1;", "T", "Lkotlin/m2;", "c", "(Landroidx/savedstate/e;)V", "savedStateRegistryOwner", "viewModelStoreOwner", "", "key", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/s0;", "a", "Ll0/a;", "b", "Ljava/lang/String;", "VIEWMODEL_KEY", "SAVED_STATE_KEY", "Ll0/a$b;", "Ll0/a$b;", "SAVED_STATE_REGISTRY_OWNER_KEY", "d", "VIEW_MODEL_STORE_OWNER_KEY", "e", "DEFAULT_ARGS_KEY", "Landroidx/lifecycle/v0;", "(Landroidx/lifecycle/i1;)Landroidx/lifecycle/v0;", "savedStateHandlesVM", "Landroidx/lifecycle/u0;", "(Landroidx/savedstate/e;)Landroidx/lifecycle/u0;", "savedStateHandlesProvider", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final String f8661a = "androidx.lifecycle.internal.SavedStateHandlesVM";

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final String f8662b = "androidx.lifecycle.internal.SavedStateHandlesProvider";

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    @f
    public static final AbstractC0540a.b<InterfaceC0538e> f8663c = new b();

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    @f
    public static final AbstractC0540a.b<i1> f8664d = new c();

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    @f
    public static final AbstractC0540a.b<Bundle> f8665e = new a();

    /* compiled from: SavedStateHandleSupport.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/t0$a", "Ll0/a$b;", "Landroid/os/Bundle;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a implements AbstractC0540a.b<Bundle> {
        a() {
        }
    }

    /* compiled from: SavedStateHandleSupport.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/t0$b", "Ll0/a$b;", "Landroidx/savedstate/e;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b implements AbstractC0540a.b<InterfaceC0538e> {
        b() {
        }
    }

    /* compiled from: SavedStateHandleSupport.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/t0$c", "Ll0/a$b;", "Landroidx/lifecycle/i1;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class c implements AbstractC0540a.b<i1> {
        c() {
        }
    }

    /* compiled from: SavedStateHandleSupport.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll0/a;", "Landroidx/lifecycle/v0;", "a", "(Ll0/a;)Landroidx/lifecycle/v0;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    static final class d extends Lambda implements l<AbstractC0540a, v0> {

        /* renamed from: p, reason: collision with root package name */
        public static final d f8666p = new d();

        d() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v0 N(@d5.d AbstractC0540a initializer) {
            l0.p(initializer, "$this$initializer");
            return new v0();
        }
    }

    private static final s0 a(InterfaceC0538e interfaceC0538e, i1 i1Var, String str, Bundle bundle) {
        u0 d6 = d(interfaceC0538e);
        v0 e6 = e(i1Var);
        s0 s0Var = e6.g().get(str);
        if (s0Var != null) {
            return s0Var;
        }
        s0 a6 = s0.INSTANCE.a(d6.b(str), bundle);
        e6.g().put(str, a6);
        return a6;
    }

    @androidx.annotation.l0
    @d5.d
    public static final s0 b(@d5.d AbstractC0540a abstractC0540a) {
        l0.p(abstractC0540a, "<this>");
        InterfaceC0538e interfaceC0538e = (InterfaceC0538e) abstractC0540a.a(f8663c);
        if (interfaceC0538e == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        i1 i1Var = (i1) abstractC0540a.a(f8664d);
        if (i1Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) abstractC0540a.a(f8665e);
        String str = (String) abstractC0540a.a(f1.c.f8555d);
        if (str != null) {
            return a(interfaceC0538e, i1Var, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.l0
    public static final <T extends InterfaceC0538e & i1> void c(@d5.d T t5) {
        l0.p(t5, "<this>");
        t.c b6 = t5.getLifecycle().b();
        l0.o(b6, "lifecycle.currentState");
        if (!(b6 == t.c.INITIALIZED || b6 == t.c.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (t5.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            u0 u0Var = new u0(t5.getSavedStateRegistry(), t5);
            t5.getSavedStateRegistry().j("androidx.lifecycle.internal.SavedStateHandlesProvider", u0Var);
            t5.getLifecycle().a(new SavedStateHandleAttacher(u0Var));
        }
    }

    @d5.d
    public static final u0 d(@d5.d InterfaceC0538e interfaceC0538e) {
        l0.p(interfaceC0538e, "<this>");
        C0536c.InterfaceC0117c c6 = interfaceC0538e.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        u0 u0Var = c6 instanceof u0 ? (u0) c6 : null;
        if (u0Var != null) {
            return u0Var;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    @d5.d
    public static final v0 e(@d5.d i1 i1Var) {
        l0.p(i1Var, "<this>");
        C0541c c0541c = new C0541c();
        c0541c.a(l1.d(v0.class), d.f8666p);
        return (v0) new f1(i1Var, c0541c.b()).b("androidx.lifecycle.internal.SavedStateHandlesVM", v0.class);
    }
}

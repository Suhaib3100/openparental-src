package androidx.view;

import android.os.Bundle;
import androidx.view.AbstractC1450w;
import androidx.view.C1459c;
import androidx.view.InterfaceC1461e;
import androidx.view.k1;
import fg.l;
import kd.f;
import kd.i;
import kotlin.AbstractC1477a;
import kotlin.C1479c;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

/* compiled from: SavedStateHandleSupport.kt */
@i(name = "SavedStateHandleSupport")
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0003\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012\"\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016\"\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016\"\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016\"\u0018\u0010\u001e\u001a\u00020\u001c*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001d\"\u0018\u0010!\u001a\u00020\u001f*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010 ¨\u0006\""}, d2 = {"Landroidx/savedstate/e;", "Landroidx/lifecycle/o1;", "T", "Lkotlin/k2;", "c", "(Landroidx/savedstate/e;)V", "savedStateRegistryOwner", "viewModelStoreOwner", "", "key", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/y0;", "a", "(Landroidx/savedstate/e;Landroidx/lifecycle/o1;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/y0;", "Lm2/a;", "b", "(Lm2/a;)Landroidx/lifecycle/y0;", "Ljava/lang/String;", "VIEWMODEL_KEY", "SAVED_STATE_KEY", "Lm2/a$b;", "Lm2/a$b;", "SAVED_STATE_REGISTRY_OWNER_KEY", "d", "VIEW_MODEL_STORE_OWNER_KEY", "e", "DEFAULT_ARGS_KEY", "Landroidx/lifecycle/b1;", "(Landroidx/lifecycle/o1;)Landroidx/lifecycle/b1;", "savedStateHandlesVM", "Landroidx/lifecycle/a1;", "(Landroidx/savedstate/e;)Landroidx/lifecycle/a1;", "savedStateHandlesProvider", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,225:1\n1#2:226\n31#3:227\n63#3,2:228\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n*L\n109#1:227\n110#1:228,2\n*E\n"})
/* loaded from: classes3.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    @l
    private static final String f30491a = "androidx.lifecycle.internal.SavedStateHandlesVM";

    /* renamed from: b, reason: collision with root package name */
    @l
    private static final String f30492b = "androidx.lifecycle.internal.SavedStateHandlesProvider";

    /* renamed from: c, reason: collision with root package name */
    @l
    @f
    public static final AbstractC1477a.b<InterfaceC1461e> f30493c = new b();

    /* renamed from: d, reason: collision with root package name */
    @l
    @f
    public static final AbstractC1477a.b<o1> f30494d = new c();

    /* renamed from: e, reason: collision with root package name */
    @l
    @f
    public static final AbstractC1477a.b<Bundle> f30495e = new a();

    /* compiled from: SavedStateHandleSupport.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/z0$a", "Lm2/a$b;", "Landroid/os/Bundle;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements AbstractC1477a.b<Bundle> {
        a() {
        }
    }

    /* compiled from: SavedStateHandleSupport.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/z0$b", "Lm2/a$b;", "Landroidx/savedstate/e;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements AbstractC1477a.b<InterfaceC1461e> {
        b() {
        }
    }

    /* compiled from: SavedStateHandleSupport.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/z0$c", "Lm2/a$b;", "Landroidx/lifecycle/o1;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements AbstractC1477a.b<o1> {
        c() {
        }
    }

    /* compiled from: SavedStateHandleSupport.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm2/a;", "Landroidx/lifecycle/b1;", "a", "(Lm2/a;)Landroidx/lifecycle/b1;"}, k = 3, mv = {1, 8, 0})
    static final class d extends n0 implements ld.l<AbstractC1477a, b1> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f30496b = new d(1);

        d() {
            super(1);
        }

        @Override // ld.l
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b1 invoke(@l AbstractC1477a initializer) {
            l0.p(initializer, "$this$initializer");
            return new b1();
        }
    }

    private static final y0 a(InterfaceC1461e interfaceC1461e, o1 o1Var, String str, Bundle bundle) {
        a1 d5 = d(interfaceC1461e);
        b1 e4 = e(o1Var);
        y0 y0Var = e4.b().get(str);
        if (y0Var != null) {
            return y0Var;
        }
        y0 a5 = y0.INSTANCE.a(d5.b(str), bundle);
        e4.b().put(str, a5);
        return a5;
    }

    @l
    @androidx.annotation.l0
    public static final y0 b(@l AbstractC1477a abstractC1477a) {
        l0.p(abstractC1477a, "<this>");
        InterfaceC1461e interfaceC1461e = (InterfaceC1461e) abstractC1477a.a(f30493c);
        if (interfaceC1461e == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        o1 o1Var = (o1) abstractC1477a.a(f30494d);
        if (o1Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) abstractC1477a.a(f30495e);
        String str = (String) abstractC1477a.a(k1.c.f30379d);
        if (str != null) {
            return a(interfaceC1461e, o1Var, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.l0
    public static final <T extends InterfaceC1461e & o1> void c(@l T t4) {
        l0.p(t4, "<this>");
        AbstractC1450w.b state = t4.getLifecycle().getState();
        if (state != AbstractC1450w.b.INITIALIZED && state != AbstractC1450w.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t4.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            a1 a1Var = new a1(t4.getSavedStateRegistry(), t4);
            t4.getSavedStateRegistry().j("androidx.lifecycle.internal.SavedStateHandlesProvider", a1Var);
            t4.getLifecycle().a(new SavedStateHandleAttacher(a1Var));
        }
    }

    @l
    public static final a1 d(@l InterfaceC1461e interfaceC1461e) {
        l0.p(interfaceC1461e, "<this>");
        C1459c.InterfaceC0615c c5 = interfaceC1461e.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        a1 a1Var = c5 instanceof a1 ? (a1) c5 : null;
        if (a1Var != null) {
            return a1Var;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    @l
    public static final b1 e(@l o1 o1Var) {
        l0.p(o1Var, "<this>");
        C1479c c1479c = new C1479c();
        c1479c.a(l1.d(b1.class), d.f30496b);
        return (b1) new k1(o1Var, c1479c.b()).b("androidx.lifecycle.internal.SavedStateHandlesVM", b1.class);
    }
}

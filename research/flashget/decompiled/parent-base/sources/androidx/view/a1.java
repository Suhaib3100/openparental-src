package androidx.view;

import android.os.Bundle;
import androidx.view.C1459c;
import fg.l;
import fg.m;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.c0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

/* compiled from: SavedStateHandleSupport.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001c\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/a1;", "Landroidx/savedstate/c$c;", "Landroidx/savedstate/c;", "savedStateRegistry", "Landroidx/lifecycle/o1;", "viewModelStoreOwner", "<init>", "(Landroidx/savedstate/c;Landroidx/lifecycle/o1;)V", "Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;", "Lkotlin/k2;", "d", "()V", "", "key", "b", "(Ljava/lang/String;)Landroid/os/Bundle;", "Landroidx/savedstate/c;", "", "Z", "restored", "c", "Landroid/os/Bundle;", "restoredState", "Landroidx/lifecycle/b1;", "Lkotlin/b0;", "()Landroidx/lifecycle/b1;", "viewModel", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n215#2,2:226\n1#3:228\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n*L\n146#1:226,2\n*E\n"})
/* loaded from: classes3.dex */
public final class a1 implements C1459c.InterfaceC0615c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final C1459c savedStateRegistry;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean restored;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private Bundle restoredState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final b0 viewModel;

    /* compiled from: SavedStateHandleSupport.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/b1;", "a", "()Landroidx/lifecycle/b1;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.a<b1> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o1 f30244b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o1 o1Var) {
            super(0);
            this.f30244b = o1Var;
        }

        @l
        public final b1 a() {
            return z0.e(this.f30244b);
        }

        @Override // ld.a
        public b1 invoke() {
            return z0.e(this.f30244b);
        }
    }

    public a1(@l C1459c savedStateRegistry, @l o1 viewModelStoreOwner) {
        l0.p(savedStateRegistry, "savedStateRegistry");
        l0.p(viewModelStoreOwner, "viewModelStoreOwner");
        this.savedStateRegistry = savedStateRegistry;
        this.viewModel = c0.c(new a(viewModelStoreOwner));
    }

    private final b1 c() {
        return (b1) this.viewModel.getValue();
    }

    @Override // androidx.view.C1459c.InterfaceC0615c
    @l
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, y0> entry : c().b().entrySet()) {
            String key = entry.getKey();
            Bundle a5 = entry.getValue().getSavedStateProvider().a();
            if (!l0.g(a5, Bundle.EMPTY)) {
                bundle.putBundle(key, a5);
            }
        }
        this.restored = false;
        return bundle;
    }

    @m
    public final Bundle b(@l String key) {
        l0.p(key, "key");
        d();
        Bundle bundle = this.restoredState;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.restoredState;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.restoredState;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.restoredState = null;
        }
        return bundle2;
    }

    public final void d() {
        if (this.restored) {
            return;
        }
        Bundle b5 = this.savedStateRegistry.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (b5 != null) {
            bundle.putAll(b5);
        }
        this.restoredState = bundle;
        this.restored = true;
        c();
    }
}

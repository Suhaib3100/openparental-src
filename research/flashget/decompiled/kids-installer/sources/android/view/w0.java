package android.view;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import android.view.C0536c;
import android.view.InterfaceC0538e;
import android.view.f1;
import androidx.annotation.c1;
import d5.d;
import d5.e;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.AbstractC0540a;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: SavedStateViewModelFactory.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b$\u0010%B\u001b\b\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b$\u0010(B%\b\u0017\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b$\u0010)J/\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0003H\u0017R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006*"}, d2 = {"Landroidx/lifecycle/w0;", "Landroidx/lifecycle/f1$d;", "Landroidx/lifecycle/f1$b;", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "Ll0/a;", "extras", "c", "(Ljava/lang/Class;Ll0/a;)Landroidx/lifecycle/c1;", "", "key", "e", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/c1;", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/c1;", "viewModel", "Lkotlin/m2;", "d", "Landroid/app/Application;", "b", "Landroid/app/Application;", "application", "Landroidx/lifecycle/f1$b;", "factory", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/t;", "Landroidx/lifecycle/t;", "lifecycle", "Landroidx/savedstate/c;", "f", "Landroidx/savedstate/c;", "savedStateRegistry", "<init>", "()V", "Landroidx/savedstate/e;", "owner", "(Landroid/app/Application;Landroidx/savedstate/e;)V", "(Landroid/app/Application;Landroidx/savedstate/e;Landroid/os/Bundle;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class w0 extends f1.d implements f1.b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @e
    private Application application;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d
    private final f1.b factory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @e
    private Bundle defaultArgs;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @e
    private t lifecycle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @e
    private C0536c savedStateRegistry;

    public w0() {
        this.factory = new f1.a();
    }

    @Override // androidx.lifecycle.f1.b
    @d
    public <T extends c1> T a(@d Class<T> modelClass) {
        l0.p(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) e(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.f1.b
    @d
    public <T extends c1> T c(@d Class<T> modelClass, @d AbstractC0540a extras) {
        List list;
        Constructor c6;
        List list2;
        l0.p(modelClass, "modelClass");
        l0.p(extras, "extras");
        String str = (String) extras.a(f1.c.f8555d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(t0.f8663c) == null || extras.a(t0.f8664d) == null) {
            if (this.lifecycle != null) {
                return (T) e(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(f1.a.f8548i);
        boolean isAssignableFrom = C0524b.class.isAssignableFrom(modelClass);
        if (!isAssignableFrom || application == null) {
            list = x0.f8689b;
            c6 = x0.c(modelClass, list);
        } else {
            list2 = x0.f8688a;
            c6 = x0.c(modelClass, list2);
        }
        return c6 == null ? (T) this.factory.c(modelClass, extras) : (!isAssignableFrom || application == null) ? (T) x0.d(modelClass, c6, t0.b(extras)) : (T) x0.d(modelClass, c6, application, t0.b(extras));
    }

    @Override // androidx.lifecycle.f1.d
    @c1({c1.a.LIBRARY_GROUP})
    public void d(@d c1 viewModel) {
        l0.p(viewModel, "viewModel");
        t tVar = this.lifecycle;
        if (tVar != null) {
            LegacySavedStateHandleController.a(viewModel, this.savedStateRegistry, tVar);
        }
    }

    @d
    public final <T extends c1> T e(@d String key, @d Class<T> modelClass) {
        List list;
        Constructor c6;
        T t5;
        Application application;
        List list2;
        l0.p(key, "key");
        l0.p(modelClass, "modelClass");
        if (this.lifecycle == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = C0524b.class.isAssignableFrom(modelClass);
        if (!isAssignableFrom || this.application == null) {
            list = x0.f8689b;
            c6 = x0.c(modelClass, list);
        } else {
            list2 = x0.f8688a;
            c6 = x0.c(modelClass, list2);
        }
        if (c6 == null) {
            return this.application != null ? (T) this.factory.a(modelClass) : (T) f1.c.INSTANCE.a().a(modelClass);
        }
        SavedStateHandleController b6 = LegacySavedStateHandleController.b(this.savedStateRegistry, this.lifecycle, key, this.defaultArgs);
        if (!isAssignableFrom || (application = this.application) == null) {
            s0 i5 = b6.i();
            l0.o(i5, "controller.handle");
            t5 = (T) x0.d(modelClass, c6, i5);
        } else {
            l0.m(application);
            s0 i6 = b6.i();
            l0.o(i6, "controller.handle");
            t5 = (T) x0.d(modelClass, c6, application, i6);
        }
        t5.f("androidx.lifecycle.savedstate.vm.tag", b6);
        return t5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w0(@e Application application, @d InterfaceC0538e owner) {
        this(application, owner, null);
        l0.p(owner, "owner");
    }

    @SuppressLint({"LambdaLast"})
    public w0(@e Application application, @d InterfaceC0538e owner, @e Bundle bundle) {
        f1.a aVar;
        l0.p(owner, "owner");
        this.savedStateRegistry = owner.getSavedStateRegistry();
        this.lifecycle = owner.getLifecycle();
        this.defaultArgs = bundle;
        this.application = application;
        if (application != null) {
            aVar = f1.a.INSTANCE.b(application);
        } else {
            aVar = new f1.a();
        }
        this.factory = aVar;
    }
}

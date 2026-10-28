package androidx.view;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.c1;
import androidx.view.C1459c;
import androidx.view.InterfaceC1461e;
import androidx.view.k1;
import fg.l;
import fg.m;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.AbstractC1477a;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: SavedStateViewModelFactory.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0003\u0010\tB%\b\u0017\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0003\u0010\fJ/\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0017\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\rH\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010 R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Landroidx/lifecycle/c1;", "Landroidx/lifecycle/k1$d;", "Landroidx/lifecycle/k1$b;", "<init>", "()V", "Landroid/app/Application;", "application", "Landroidx/savedstate/e;", "owner", "(Landroid/app/Application;Landroidx/savedstate/e;)V", "Landroid/os/Bundle;", "defaultArgs", "(Landroid/app/Application;Landroidx/savedstate/e;Landroid/os/Bundle;)V", "Landroidx/lifecycle/h1;", "T", "Ljava/lang/Class;", "modelClass", "Lm2/a;", "extras", "b", "(Ljava/lang/Class;Lm2/a;)Landroidx/lifecycle/h1;", "", "key", "d", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/h1;", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/h1;", "viewModel", "Lkotlin/k2;", "c", "(Landroidx/lifecycle/h1;)V", "Landroid/app/Application;", "Landroidx/lifecycle/k1$b;", "factory", "Landroid/os/Bundle;", "Landroidx/lifecycle/w;", "e", "Landroidx/lifecycle/w;", "lifecycle", "Landroidx/savedstate/c;", "f", "Landroidx/savedstate/c;", "savedStateRegistry", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c1 extends k1.d implements k1.b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private Application application;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final k1.b factory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    private Bundle defaultArgs;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @m
    private AbstractC1450w lifecycle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @m
    private C1459c savedStateRegistry;

    public c1() {
        this.factory = new k1.a();
    }

    @Override // androidx.lifecycle.k1.b
    @l
    public <T extends h1> T b(@l Class<T> modelClass, @l AbstractC1477a extras) {
        List list;
        Constructor c5;
        List list2;
        l0.p(modelClass, "modelClass");
        l0.p(extras, "extras");
        String str = (String) extras.a(k1.c.f30379d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(z0.f30493c) == null || extras.a(z0.f30494d) == null) {
            if (this.lifecycle != null) {
                return (T) d(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(k1.a.f30372i);
        boolean isAssignableFrom = C1415b.class.isAssignableFrom(modelClass);
        if (!isAssignableFrom || application == null) {
            list = d1.f30281b;
            c5 = d1.c(modelClass, list);
        } else {
            list2 = d1.f30280a;
            c5 = d1.c(modelClass, list2);
        }
        return c5 == null ? (T) this.factory.b(modelClass, extras) : (!isAssignableFrom || application == null) ? (T) d1.d(modelClass, c5, z0.b(extras)) : (T) d1.d(modelClass, c5, application, z0.b(extras));
    }

    @Override // androidx.lifecycle.k1.d
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public void c(@l h1 viewModel) {
        l0.p(viewModel, "viewModel");
        if (this.lifecycle != null) {
            C1459c c1459c = this.savedStateRegistry;
            l0.m(c1459c);
            AbstractC1450w abstractC1450w = this.lifecycle;
            l0.m(abstractC1450w);
            LegacySavedStateHandleController.a(viewModel, c1459c, abstractC1450w);
        }
    }

    @Override // androidx.lifecycle.k1.b
    @l
    public <T extends h1> T create(@l Class<T> modelClass) {
        l0.p(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) d(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @l
    public final <T extends h1> T d(@l String key, @l Class<T> modelClass) {
        List list;
        Constructor c5;
        T t4;
        Application application;
        List list2;
        l0.p(key, "key");
        l0.p(modelClass, "modelClass");
        AbstractC1450w abstractC1450w = this.lifecycle;
        if (abstractC1450w == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = C1415b.class.isAssignableFrom(modelClass);
        if (!isAssignableFrom || this.application == null) {
            list = d1.f30281b;
            c5 = d1.c(modelClass, list);
        } else {
            list2 = d1.f30280a;
            c5 = d1.c(modelClass, list2);
        }
        if (c5 == null) {
            return this.application != null ? (T) this.factory.create(modelClass) : (T) k1.c.INSTANCE.a().create(modelClass);
        }
        C1459c c1459c = this.savedStateRegistry;
        l0.m(c1459c);
        SavedStateHandleController b5 = LegacySavedStateHandleController.b(c1459c, abstractC1450w, key, this.defaultArgs);
        if (!isAssignableFrom || (application = this.application) == null) {
            t4 = (T) d1.d(modelClass, c5, b5.getHandle());
        } else {
            l0.m(application);
            t4 = (T) d1.d(modelClass, c5, application, b5.getHandle());
        }
        t4.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", b5);
        return t4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c1(@m Application application, @l InterfaceC1461e owner) {
        this(application, owner, null);
        l0.p(owner, "owner");
    }

    @SuppressLint({"LambdaLast"})
    public c1(@m Application application, @l InterfaceC1461e owner, @m Bundle bundle) {
        k1.a aVar;
        l0.p(owner, "owner");
        this.savedStateRegistry = owner.getSavedStateRegistry();
        this.lifecycle = owner.getLifecycle();
        this.defaultArgs = bundle;
        this.application = application;
        if (application != null) {
            aVar = k1.a.INSTANCE.b(application);
        } else {
            aVar = new k1.a();
        }
        this.factory = aVar;
    }
}

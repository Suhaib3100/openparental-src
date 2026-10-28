package androidx.view;

import android.os.Bundle;
import androidx.annotation.c1;
import androidx.view.C1459c;
import androidx.view.InterfaceC1461e;
import androidx.view.k1;
import fg.l;
import fg.m;
import kotlin.AbstractC1477a;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: AbstractSavedStateViewModelFactory.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001'B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0003\u0010\tJ/\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001a\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H$¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\nH\u0017¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010$R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010&¨\u0006("}, d2 = {"Landroidx/lifecycle/a;", "Landroidx/lifecycle/k1$d;", "Landroidx/lifecycle/k1$b;", "<init>", "()V", "Landroidx/savedstate/e;", "owner", "Landroid/os/Bundle;", "defaultArgs", "(Landroidx/savedstate/e;Landroid/os/Bundle;)V", "Landroidx/lifecycle/h1;", "T", "", "key", "Ljava/lang/Class;", "modelClass", "d", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/h1;", "Lm2/a;", "extras", "b", "(Ljava/lang/Class;Lm2/a;)Landroidx/lifecycle/h1;", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/h1;", "Landroidx/lifecycle/y0;", "handle", "e", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/y0;)Landroidx/lifecycle/h1;", "viewModel", "Lkotlin/k2;", "c", "(Landroidx/lifecycle/h1;)V", "Landroidx/savedstate/c;", "Landroidx/savedstate/c;", "savedStateRegistry", "Landroidx/lifecycle/w;", "Landroidx/lifecycle/w;", "lifecycle", "Landroid/os/Bundle;", "a", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1413a extends k1.d implements k1.b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private C1459c savedStateRegistry;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private AbstractC1450w lifecycle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    private Bundle defaultArgs;

    /* renamed from: f, reason: collision with root package name */
    @l
    public static final String f30234f = "androidx.lifecycle.savedstate.vm.tag";

    public AbstractC1413a() {
    }

    private final <T extends h1> T d(String key, Class<T> modelClass) {
        C1459c c1459c = this.savedStateRegistry;
        l0.m(c1459c);
        AbstractC1450w abstractC1450w = this.lifecycle;
        l0.m(abstractC1450w);
        SavedStateHandleController b5 = LegacySavedStateHandleController.b(c1459c, abstractC1450w, key, this.defaultArgs);
        T t4 = (T) e(key, modelClass, b5.getHandle());
        t4.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", b5);
        return t4;
    }

    @Override // androidx.lifecycle.k1.b
    @l
    public <T extends h1> T b(@l Class<T> modelClass, @l AbstractC1477a extras) {
        l0.p(modelClass, "modelClass");
        l0.p(extras, "extras");
        String str = (String) extras.a(k1.c.f30379d);
        if (str != null) {
            return this.savedStateRegistry != null ? (T) d(str, modelClass) : (T) e(str, modelClass, z0.b(extras));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.k1.d
    @c1({c1.a.LIBRARY_GROUP})
    public void c(@l h1 viewModel) {
        l0.p(viewModel, "viewModel");
        C1459c c1459c = this.savedStateRegistry;
        if (c1459c != null) {
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
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.lifecycle != null) {
            return (T) d(canonicalName, modelClass);
        }
        throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @l
    protected abstract <T extends h1> T e(@l String key, @l Class<T> modelClass, @l y0 handle);

    public AbstractC1413a(@l InterfaceC1461e owner, @m Bundle bundle) {
        l0.p(owner, "owner");
        this.savedStateRegistry = owner.getSavedStateRegistry();
        this.lifecycle = owner.getLifecycle();
        this.defaultArgs = bundle;
    }
}

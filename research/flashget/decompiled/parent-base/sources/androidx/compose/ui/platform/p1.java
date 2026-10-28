package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.t;
import androidx.view.C1459c;
import androidx.view.InterfaceC1461e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: DisposableSaveableStateRegistry.android.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a)\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0013\u0018\u00010\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0016\u001a\u00020\u0011*\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00130\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\"\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroid/view/View;", "view", "Landroidx/savedstate/e;", "owner", "Landroidx/compose/ui/platform/n1;", "b", "(Landroid/view/View;Landroidx/savedstate/e;)Landroidx/compose/ui/platform/n1;", "", "id", "savedStateRegistryOwner", "c", "(Ljava/lang/String;Landroidx/savedstate/e;)Landroidx/compose/ui/platform/n1;", "", "value", "", "f", "(Ljava/lang/Object;)Z", "Landroid/os/Bundle;", "", "", "h", "(Landroid/os/Bundle;)Ljava/util/Map;", "g", "(Ljava/util/Map;)Landroid/os/Bundle;", "", "Ljava/lang/Class;", "a", "[Ljava/lang/Class;", "AcceptableClasses", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nDisposableSaveableStateRegistry.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisposableSaveableStateRegistry.android.kt\nandroidx/compose/ui/platform/DisposableSaveableStateRegistry_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,190:1\n1855#2,2:191\n215#3,2:193\n*S KotlinDebug\n*F\n+ 1 DisposableSaveableStateRegistry.android.kt\nandroidx/compose/ui/platform/DisposableSaveableStateRegistry_androidKt\n*L\n172#1:191,2\n181#1:193,2\n*E\n"})
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final Class<? extends Object>[] f20079a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* compiled from: DisposableSaveableStateRegistry.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f20080b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1459c f20081c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f20082d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z4, C1459c c1459c, String str) {
            super(0);
            this.f20080b = z4;
            this.f20081c = c1459c;
            this.f20082d = str;
        }

        public final void a() {
            if (this.f20080b) {
                this.f20081c.m(this.f20082d);
            }
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DisposableSaveableStateRegistry.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<Object, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f20083b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l Object obj) {
            return Boolean.valueOf(p1.f(obj));
        }
    }

    @fg.l
    public static final n1 b(@fg.l View view, @fg.l InterfaceC1461e interfaceC1461e) {
        Object parent = view.getParent();
        kotlin.jvm.internal.l0.n(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(t.b.H);
        String str = tag instanceof String ? (String) tag : null;
        if (str == null) {
            str = String.valueOf(view2.getId());
        }
        return c(str, interfaceC1461e);
    }

    @fg.l
    public static final n1 c(@fg.l String str, @fg.l InterfaceC1461e interfaceC1461e) {
        boolean z4;
        String str2 = androidx.compose.runtime.saveable.i.class.getSimpleName() + ':' + str;
        C1459c savedStateRegistry = interfaceC1461e.getSavedStateRegistry();
        Bundle b5 = savedStateRegistry.b(str2);
        final androidx.compose.runtime.saveable.i a5 = androidx.compose.runtime.saveable.k.a(b5 != null ? h(b5) : null, b.f20083b);
        try {
            savedStateRegistry.j(str2, new C1459c.InterfaceC0615c() { // from class: androidx.compose.ui.platform.o1
                @Override // androidx.view.C1459c.InterfaceC0615c
                public final Bundle a() {
                    Bundle d5;
                    d5 = p1.d(androidx.compose.runtime.saveable.i.this);
                    return d5;
                }
            });
            z4 = true;
        } catch (IllegalArgumentException unused) {
            z4 = false;
        }
        return new n1(a5, new a(z4, savedStateRegistry, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(androidx.compose.runtime.saveable.i iVar) {
        return g(iVar.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(Object obj) {
        if (obj instanceof androidx.compose.runtime.snapshots.a0) {
            androidx.compose.runtime.snapshots.a0 a0Var = (androidx.compose.runtime.snapshots.a0) obj;
            if (a0Var.e() != androidx.compose.runtime.o4.m() && a0Var.e() != androidx.compose.runtime.o4.x() && a0Var.e() != androidx.compose.runtime.o4.t()) {
                return false;
            }
            T value = a0Var.getValue();
            if (value == 0) {
                return true;
            }
            return f(value);
        }
        if ((obj instanceof kotlin.v) && (obj instanceof Serializable)) {
            return false;
        }
        for (Class<? extends Object> cls : f20079a) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    private static final Bundle g(Map<String, ? extends List<? extends Object>> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<? extends Object> value = entry.getValue();
            bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
        }
        return bundle;
    }

    private static final Map<String, List<Object>> h(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            kotlin.jvm.internal.l0.n(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}

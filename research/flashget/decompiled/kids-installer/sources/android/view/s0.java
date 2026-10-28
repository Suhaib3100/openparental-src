package android.view;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.C0536c;
import androidx.annotation.c1;
import d5.d;
import d5.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.f1;
import kotlin.collections.r1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.t0;
import kotlinx.coroutines.flow.v0;
import p3.n;

/* compiled from: SavedStateHandle.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0002!$B\u001f\b\u0016\u0012\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010.¢\u0006\u0004\b0\u00101B\t\b\u0016¢\u0006\u0004\b0\u00102J3\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0007J\u0011\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0087\u0002J\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u0007J \u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001a\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001c\u0010\u0017J\u0018\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u000bH\u0007J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0003H\u0007R\"\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R$\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030&0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\"R(\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010)0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\"R\u0014\u0010-\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010,¨\u00063"}, d2 = {"Landroidx/lifecycle/s0;", "", "T", "", "key", "", "hasInitialValue", "initialValue", "Landroidx/lifecycle/j0;", "k", "(Ljava/lang/String;ZLjava/lang/Object;)Landroidx/lifecycle/j0;", "Landroidx/savedstate/c$c;", "o", "f", "i", "j", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/j0;", "Lkotlinx/coroutines/flow/t0;", "l", "(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/t0;", "", "m", "h", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "Lkotlin/m2;", "q", "(Ljava/lang/String;Ljava/lang/Object;)V", "n", "provider", "r", "e", "", "a", "Ljava/util/Map;", "regular", "b", "savedStateProviders", "Landroidx/lifecycle/s0$b;", "c", "liveDatas", "Lkotlinx/coroutines/flow/e0;", "d", "flows", "Landroidx/savedstate/c$c;", "savedStateProvider", "", "initialState", "<init>", "(Ljava/util/Map;)V", "()V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    private final Map<String, Object> regular;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d
    private final Map<String, C0536c.InterfaceC0117c> savedStateProviders;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d
    private final Map<String, b<?>> liveDatas;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d
    private final Map<String, e0<Object>> flows;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d
    private final C0536c.InterfaceC0117c savedStateProvider;

    /* renamed from: g, reason: collision with root package name */
    @d
    private static final String f8648g = "values";

    /* renamed from: h, reason: collision with root package name */
    @d
    private static final String f8649h = "keys";

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @d
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    @d
    private static final Class<? extends Object>[] f8650i = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* compiled from: SavedStateHandle.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0007R$\u0010\f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/s0$a;", "", "Landroid/os/Bundle;", "restoredState", "defaultState", "Landroidx/lifecycle/s0;", "a", "value", "", "b", "", "Ljava/lang/Class;", "ACCEPTABLE_CLASSES", "[Ljava/lang/Class;", "", "KEYS", "Ljava/lang/String;", "VALUES", "<init>", "()V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: androidx.lifecycle.s0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @c1({c1.a.LIBRARY_GROUP})
        @d
        @n
        public final s0 a(@e Bundle restoredState, @e Bundle defaultState) {
            if (restoredState == null) {
                if (defaultState == null) {
                    return new s0();
                }
                HashMap hashMap = new HashMap();
                for (String key : defaultState.keySet()) {
                    l0.o(key, "key");
                    hashMap.put(key, defaultState.get(key));
                }
                return new s0(hashMap);
            }
            ArrayList parcelableArrayList = restoredState.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = restoredState.getParcelableArrayList("values");
            if (!((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true)) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = parcelableArrayList.get(i5);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i5));
            }
            return new s0(linkedHashMap);
        }

        @c1({c1.a.LIBRARY_GROUP})
        public final boolean b(@e Object value) {
            if (value == null) {
                return true;
            }
            for (Class cls : s0.f8650i) {
                l0.m(cls);
                if (cls.isInstance(value)) {
                    return true;
                }
            }
            return false;
        }

        public Companion(w wVar) {
        }
    }

    public s0(@d Map<String, ? extends Object> initialState) {
        l0.p(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.regular = linkedHashMap;
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new C0536c.InterfaceC0117c() { // from class: androidx.lifecycle.r0
            @Override // android.view.C0536c.InterfaceC0117c
            public final Bundle a() {
                Bundle p5;
                p5 = s0.p(s0.this);
                return p5;
            }
        };
        linkedHashMap.putAll(initialState);
    }

    @c1({c1.a.LIBRARY_GROUP})
    @d
    @n
    public static final s0 g(@e Bundle bundle, @e Bundle bundle2) {
        return INSTANCE.a(bundle, bundle2);
    }

    private final <T> j0<T> k(String key, boolean hasInitialValue, T initialValue) {
        b<?> bVar;
        b<?> bVar2 = this.liveDatas.get(key);
        b<?> bVar3 = bVar2 instanceof j0 ? bVar2 : null;
        if (bVar3 != null) {
            return bVar3;
        }
        if (this.regular.containsKey(key)) {
            bVar = new b<>(this, key, this.regular.get(key));
        } else if (hasInitialValue) {
            this.regular.put(key, initialValue);
            bVar = new b<>(this, key, initialValue);
        } else {
            bVar = new b<>(this, key);
        }
        this.liveDatas.put(key, bVar);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle p(s0 this$0) {
        Map D0;
        l0.p(this$0, "this$0");
        D0 = f1.D0(this$0.savedStateProviders);
        for (Map.Entry entry : D0.entrySet()) {
            this$0.q((String) entry.getKey(), ((C0536c.InterfaceC0117c) entry.getValue()).a());
        }
        Set<String> keySet = this$0.regular.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(this$0.regular.get(str));
        }
        return androidx.core.os.b.a(new Pair("keys", arrayList), new Pair("values", arrayList2));
    }

    @androidx.annotation.l0
    public final void e(@d String key) {
        l0.p(key, "key");
        this.savedStateProviders.remove(key);
    }

    @androidx.annotation.l0
    public final boolean f(@d String key) {
        l0.p(key, "key");
        return this.regular.containsKey(key);
    }

    @e
    @androidx.annotation.l0
    public final <T> T h(@d String key) {
        l0.p(key, "key");
        return (T) this.regular.get(key);
    }

    @androidx.annotation.l0
    @d
    public final <T> j0<T> i(@d String key) {
        l0.p(key, "key");
        return k(key, false, null);
    }

    @androidx.annotation.l0
    @d
    public final <T> j0<T> j(@d String key, T initialValue) {
        l0.p(key, "key");
        return k(key, true, initialValue);
    }

    @androidx.annotation.l0
    @d
    public final <T> t0<T> l(@d String key, T initialValue) {
        l0.p(key, "key");
        Map<String, e0<Object>> map = this.flows;
        e0<Object> e0Var = map.get(key);
        if (e0Var == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, initialValue);
            }
            e0Var = v0.a(this.regular.get(key));
            this.flows.put(key, e0Var);
            map.put(key, e0Var);
        }
        return k.m(e0Var);
    }

    @androidx.annotation.l0
    @d
    public final Set<String> m() {
        Set C;
        Set<String> C2;
        C = r1.C(this.regular.keySet(), this.savedStateProviders.keySet());
        C2 = r1.C(C, this.liveDatas.keySet());
        return C2;
    }

    @e
    @androidx.annotation.l0
    public final <T> T n(@d String key) {
        l0.p(key, "key");
        T t5 = (T) this.regular.remove(key);
        b<?> remove = this.liveDatas.remove(key);
        if (remove != null) {
            remove.r();
        }
        this.flows.remove(key);
        return t5;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @d
    /* renamed from: o, reason: from getter */
    public final C0536c.InterfaceC0117c getSavedStateProvider() {
        return this.savedStateProvider;
    }

    @androidx.annotation.l0
    public final <T> void q(@d String key, @e T value) {
        l0.p(key, "key");
        if (!INSTANCE.b(value)) {
            StringBuilder sb = new StringBuilder("Can't put value with type ");
            l0.m(value);
            sb.append(value.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        b<?> bVar = this.liveDatas.get(key);
        b<?> bVar2 = bVar instanceof j0 ? bVar : null;
        if (bVar2 != null) {
            bVar2.q(value);
        } else {
            this.regular.put(key, value);
        }
        e0<Object> e0Var = this.flows.get(key);
        if (e0Var == null) {
            return;
        }
        e0Var.setValue(value);
    }

    @androidx.annotation.l0
    public final void r(@d String key, @d C0536c.InterfaceC0117c provider) {
        l0.p(key, "key");
        l0.p(provider, "provider");
        this.savedStateProviders.put(key, provider);
    }

    /* compiled from: SavedStateHandle.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\b\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011B\u001b\b\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\u0004R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/s0$b;", "T", "Landroidx/lifecycle/j0;", "value", "Lkotlin/m2;", "q", "(Ljava/lang/Object;)V", "r", "", "m", "Ljava/lang/String;", "key", "Landroidx/lifecycle/s0;", "n", "Landroidx/lifecycle/s0;", "handle", "<init>", "(Landroidx/lifecycle/s0;Ljava/lang/String;Ljava/lang/Object;)V", "(Landroidx/lifecycle/s0;Ljava/lang/String;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b<T> extends j0<T> {

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        @d
        private String key;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        @e
        private s0 handle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@e s0 s0Var, @d String key, T t5) {
            super(t5);
            l0.p(key, "key");
            this.key = key;
            this.handle = s0Var;
        }

        @Override // android.view.j0, android.view.LiveData
        public void q(T value) {
            s0 s0Var = this.handle;
            if (s0Var != null) {
                s0Var.regular.put(this.key, value);
                e0 e0Var = (e0) s0Var.flows.get(this.key);
                if (e0Var != null) {
                    e0Var.setValue(value);
                }
            }
            super.q(value);
        }

        public final void r() {
            this.handle = null;
        }

        public b(@e s0 s0Var, @d String key) {
            l0.p(key, "key");
            this.key = key;
            this.handle = s0Var;
        }
    }

    public s0() {
        this.regular = new LinkedHashMap();
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new C0536c.InterfaceC0117c() { // from class: androidx.lifecycle.r0
            @Override // android.view.C0536c.InterfaceC0117c
            public final Bundle a() {
                Bundle p5;
                p5 = s0.p(s0.this);
                return p5;
            }
        };
    }
}

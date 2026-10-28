package androidx.view;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.annotation.c1;
import androidx.core.os.e;
import androidx.view.C1459c;
import fg.l;
import fg.m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kd.n;
import kotlin.Metadata;
import kotlin.collections.l1;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.q0;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.t0;
import kotlinx.coroutines.flow.v0;

/* compiled from: SavedStateHandle.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0002,/B\u001f\b\u0016\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u001f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u001f\u0010 J(\u0010#\u001a\u00020\"\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0004\b%\u0010 J\u001f\u0010'\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0010H\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0004\b)\u0010*R\"\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R \u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010-R$\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u0003010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010-R(\u00106\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001040+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010-R\u0014\u00108\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00107¨\u00069"}, d2 = {"Landroidx/lifecycle/y0;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", "()V", "T", "key", "", "hasInitialValue", "initialValue", "Landroidx/lifecycle/o0;", "k", "(Ljava/lang/String;ZLjava/lang/Object;)Landroidx/lifecycle/o0;", "Landroidx/savedstate/c$c;", "o", "()Landroidx/savedstate/c$c;", "f", "(Ljava/lang/String;)Z", "i", "(Ljava/lang/String;)Landroidx/lifecycle/o0;", "j", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/o0;", "Lkotlinx/coroutines/flow/t0;", "l", "(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/t0;", "", "m", "()Ljava/util/Set;", "h", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "Lkotlin/k2;", "q", "(Ljava/lang/String;Ljava/lang/Object;)V", "n", "provider", "r", "(Ljava/lang/String;Landroidx/savedstate/c$c;)V", "e", "(Ljava/lang/String;)V", "", "a", "Ljava/util/Map;", "regular", "b", "savedStateProviders", "Landroidx/lifecycle/y0$b;", "c", "liveDatas", "Lkotlinx/coroutines/flow/e0;", "d", "flows", "Landroidx/savedstate/c$c;", "savedStateProvider", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSavedStateHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n361#2,3:451\n364#2,4:455\n1#3:454\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n*L\n198#1:451,3\n198#1:455,4\n*E\n"})
/* loaded from: classes3.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final Map<String, Object> regular;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final Map<String, C1459c.InterfaceC0615c> savedStateProviders;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final Map<String, b<?>> liveDatas;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final Map<String, e0<Object>> flows;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final C1459c.InterfaceC0615c savedStateProvider;

    /* renamed from: g, reason: collision with root package name */
    @l
    private static final String f30472g = "values";

    /* renamed from: h, reason: collision with root package name */
    @l
    private static final String f30473h = "keys";

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: i, reason: collision with root package name */
    @l
    private static final Class<? extends Object>[] f30474i = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* compiled from: SavedStateHandle.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/y0$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "restoredState", "defaultState", "Landroidx/lifecycle/y0;", "a", "(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/y0;", "value", "", "b", "(Ljava/lang/Object;)Z", "", "Ljava/lang/Class;", "ACCEPTABLE_CLASSES", "[Ljava/lang/Class;", "", "KEYS", "Ljava/lang/String;", "VALUES", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.y0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        @n
        @c1({c1.a.LIBRARY_GROUP})
        public final y0 a(@m Bundle restoredState, @m Bundle defaultState) {
            if (restoredState == null) {
                if (defaultState == null) {
                    return new y0();
                }
                HashMap hashMap = new HashMap();
                for (String key : defaultState.keySet()) {
                    l0.o(key, "key");
                    hashMap.put(key, defaultState.get(key));
                }
                return new y0(hashMap);
            }
            ArrayList parcelableArrayList = restoredState.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = restoredState.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                Object obj = parcelableArrayList.get(i4);
                l0.n(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i4));
            }
            return new y0(linkedHashMap);
        }

        @c1({c1.a.LIBRARY_GROUP})
        public final boolean b(@m Object value) {
            if (value == null) {
                return true;
            }
            for (Class cls : y0.f30474i) {
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

    public y0(@l Map<String, ? extends Object> initialState) {
        l0.p(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.regular = linkedHashMap;
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new C1459c.InterfaceC0615c() { // from class: androidx.lifecycle.x0
            @Override // androidx.view.C1459c.InterfaceC0615c
            public final Bundle a() {
                Bundle p4;
                p4 = y0.p(y0.this);
                return p4;
            }
        };
        linkedHashMap.putAll(initialState);
    }

    @l
    @n
    @c1({c1.a.LIBRARY_GROUP})
    public static final y0 g(@m Bundle bundle, @m Bundle bundle2) {
        return INSTANCE.a(bundle, bundle2);
    }

    private final <T> o0<T> k(String key, boolean hasInitialValue, T initialValue) {
        b<?> bVar;
        b<?> bVar2 = this.liveDatas.get(key);
        b<?> bVar3 = bVar2 instanceof o0 ? bVar2 : null;
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
    public static final Bundle p(y0 this$0) {
        l0.p(this$0, "this$0");
        for (Map.Entry entry : z0.D0(this$0.savedStateProviders).entrySet()) {
            this$0.q((String) entry.getKey(), ((C1459c.InterfaceC0615c) entry.getValue()).a());
        }
        Set<String> keySet = this$0.regular.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(this$0.regular.get(str));
        }
        return e.b(new q0("keys", arrayList), new q0("values", arrayList2));
    }

    @androidx.annotation.l0
    public final void e(@l String key) {
        l0.p(key, "key");
        this.savedStateProviders.remove(key);
    }

    @androidx.annotation.l0
    public final boolean f(@l String key) {
        l0.p(key, "key");
        return this.regular.containsKey(key);
    }

    @m
    @androidx.annotation.l0
    public final <T> T h(@l String key) {
        l0.p(key, "key");
        try {
            return (T) this.regular.get(key);
        } catch (ClassCastException unused) {
            n(key);
            return null;
        }
    }

    @l
    @androidx.annotation.l0
    public final <T> o0<T> i(@l String key) {
        l0.p(key, "key");
        o0<T> k4 = k(key, false, null);
        l0.n(k4, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return k4;
    }

    @l
    @androidx.annotation.l0
    public final <T> o0<T> j(@l String key, T initialValue) {
        l0.p(key, "key");
        return k(key, true, initialValue);
    }

    @l
    @androidx.annotation.l0
    public final <T> t0<T> l(@l String key, T initialValue) {
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
        t0<T> m4 = k.m(e0Var);
        l0.n(m4, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return m4;
    }

    @l
    @androidx.annotation.l0
    public final Set<String> m() {
        return l1.C(l1.C(this.regular.keySet(), this.savedStateProviders.keySet()), this.liveDatas.keySet());
    }

    @m
    @androidx.annotation.l0
    public final <T> T n(@l String key) {
        l0.p(key, "key");
        T t4 = (T) this.regular.remove(key);
        b<?> remove = this.liveDatas.remove(key);
        if (remove != null) {
            remove.s();
        }
        this.flows.remove(key);
        return t4;
    }

    @l
    @c1({c1.a.LIBRARY_GROUP})
    /* renamed from: o, reason: from getter */
    public final C1459c.InterfaceC0615c getSavedStateProvider() {
        return this.savedStateProvider;
    }

    @androidx.annotation.l0
    public final <T> void q(@l String key, @m T value) {
        l0.p(key, "key");
        if (!INSTANCE.b(value)) {
            StringBuilder sb = new StringBuilder("Can't put value with type ");
            l0.m(value);
            sb.append(value.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        b<?> bVar = this.liveDatas.get(key);
        b<?> bVar2 = bVar instanceof o0 ? bVar : null;
        if (bVar2 != null) {
            bVar2.r(value);
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
    public final void r(@l String key, @l C1459c.InterfaceC0615c provider) {
        l0.p(key, "key");
        l0.p(provider, "provider");
        this.savedStateProviders.put(key, provider);
    }

    /* compiled from: SavedStateHandle.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/y0$b;", "T", "Landroidx/lifecycle/o0;", "Landroidx/lifecycle/y0;", "handle", "", "key", "value", "<init>", "(Landroidx/lifecycle/y0;Ljava/lang/String;Ljava/lang/Object;)V", "(Landroidx/lifecycle/y0;Ljava/lang/String;)V", "Lkotlin/k2;", "r", "(Ljava/lang/Object;)V", "s", "()V", "m", "Ljava/lang/String;", "n", "Landroidx/lifecycle/y0;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b<T> extends o0<T> {

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        @l
        private String key;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        @m
        private y0 handle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m y0 y0Var, @l String key, T t4) {
            super(t4);
            l0.p(key, "key");
            this.key = key;
            this.handle = y0Var;
        }

        @Override // androidx.view.o0, androidx.view.LiveData
        public void r(T value) {
            y0 y0Var = this.handle;
            if (y0Var != null) {
                y0Var.regular.put(this.key, value);
                e0 e0Var = (e0) y0Var.flows.get(this.key);
                if (e0Var != null) {
                    e0Var.setValue(value);
                }
            }
            super.r(value);
        }

        public final void s() {
            this.handle = null;
        }

        public b(@m y0 y0Var, @l String key) {
            l0.p(key, "key");
            this.key = key;
            this.handle = y0Var;
        }
    }

    public y0() {
        this.regular = new LinkedHashMap();
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new C1459c.InterfaceC0615c() { // from class: androidx.lifecycle.x0
            @Override // androidx.view.C1459c.InterfaceC0615c
            public final Bundle a() {
                Bundle p4;
                p4 = y0.p(y0.this);
                return p4;
            }
        };
    }
}

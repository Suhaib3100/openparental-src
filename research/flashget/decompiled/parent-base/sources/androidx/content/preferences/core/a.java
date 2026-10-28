package androidx.content.preferences.core;

import androidx.content.preferences.core.d;
import fg.l;
import fg.m;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;

/* compiled from: Preferences.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\fJ$\u0010\u0010\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0018\u001a\u00020\n\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0017\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u00020\n2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010 \u001a\u00020\n2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0086\u0002¢\u0006\u0004\b \u0010!J\u001c\u0010\"\u001a\u00020\n2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0086\u0002¢\u0006\u0004\b\"\u0010#J)\u0010&\u001a\u00020\n2\u001a\u0010%\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u001e0$\"\u0006\u0012\u0002\b\u00030\u001e¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b(\u0010\u0013J\r\u0010)\u001a\u00020\n¢\u0006\u0004\b)\u0010\fJ\u001a\u0010+\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102R*\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u00103\u001a\u0004\b4\u0010\u0016R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00106¨\u00068"}, d2 = {"Landroidx/datastore/preferences/core/a;", "Landroidx/datastore/preferences/core/d;", "", "Landroidx/datastore/preferences/core/d$a;", "", "preferencesMap", "", "startFrozen", "<init>", "(Ljava/util/Map;Z)V", "Lkotlin/k2;", "f", "()V", "h", "T", "key", "b", "(Landroidx/datastore/preferences/core/d$a;)Z", "c", "(Landroidx/datastore/preferences/core/d$a;)Ljava/lang/Object;", "", "a", "()Ljava/util/Map;", "value", "o", "(Landroidx/datastore/preferences/core/d$a;Ljava/lang/Object;)V", "p", "prefs", "l", "(Landroidx/datastore/preferences/core/d;)V", "Landroidx/datastore/preferences/core/d$b;", "pair", "k", "(Landroidx/datastore/preferences/core/d$b;)V", "j", "(Landroidx/datastore/preferences/core/d$a;)V", "", "pairs", "m", "([Landroidx/datastore/preferences/core/d$b;)V", "n", "g", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "i", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "frozen", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final Map<d.a<?>, Object> preferencesMap;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final AtomicBoolean frozen;

    /* compiled from: Preferences.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Landroidx/datastore/preferences/core/d$a;", "", "entry", "", "<anonymous>", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: androidx.datastore.preferences.core.a$a, reason: collision with other inner class name */
    static final class C0468a extends n0 implements ld.l<Map.Entry<d.a<?>, Object>, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0468a f28555b = new C0468a(1);

        C0468a() {
            super(1);
        }

        @Override // ld.l
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@l Map.Entry<d.a<?>, Object> entry) {
            l0.p(entry, "entry");
            return "  " + entry.getKey().getName() + " = " + entry.getValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @Override // androidx.content.preferences.core.d
    @l
    public Map<d.a<?>, Object> a() {
        Map<d.a<?>, Object> unmodifiableMap = Collections.unmodifiableMap(this.preferencesMap);
        l0.o(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    @Override // androidx.content.preferences.core.d
    public <T> boolean b(@l d.a<T> key) {
        l0.p(key, "key");
        return this.preferencesMap.containsKey(key);
    }

    @Override // androidx.content.preferences.core.d
    @m
    public <T> T c(@l d.a<T> key) {
        l0.p(key, "key");
        return (T) this.preferencesMap.get(key);
    }

    public boolean equals(@m Object other) {
        if (other instanceof a) {
            return l0.g(this.preferencesMap, ((a) other).preferencesMap);
        }
        return false;
    }

    public final void f() {
        if (this.frozen.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void g() {
        f();
        this.preferencesMap.clear();
    }

    public final void h() {
        this.frozen.set(true);
    }

    public int hashCode() {
        return this.preferencesMap.hashCode();
    }

    @l
    public final Map<d.a<?>, Object> i() {
        return this.preferencesMap;
    }

    public final void j(@l d.a<?> key) {
        l0.p(key, "key");
        f();
        n(key);
    }

    public final void k(@l d.b<?> pair) {
        l0.p(pair, "pair");
        f();
        m(pair);
    }

    public final void l(@l d prefs) {
        l0.p(prefs, "prefs");
        f();
        this.preferencesMap.putAll(prefs.a());
    }

    public final void m(@l d.b<?>... pairs) {
        l0.p(pairs, "pairs");
        f();
        for (d.b<?> bVar : pairs) {
            p(bVar.a(), bVar.b());
        }
    }

    public final <T> T n(@l d.a<T> key) {
        l0.p(key, "key");
        f();
        return (T) this.preferencesMap.remove(key);
    }

    public final <T> void o(@l d.a<T> key, T value) {
        l0.p(key, "key");
        p(key, value);
    }

    public final void p(@l d.a<?> key, @m Object value) {
        l0.p(key, "key");
        f();
        if (value == null) {
            n(key);
            return;
        }
        if (!(value instanceof Set)) {
            this.preferencesMap.put(key, value);
            return;
        }
        Map<d.a<?>, Object> map = this.preferencesMap;
        Set unmodifiableSet = Collections.unmodifiableSet(w.a6((Iterable) value));
        l0.o(unmodifiableSet, "unmodifiableSet(value.toSet())");
        map.put(key, unmodifiableSet);
    }

    @l
    public String toString() {
        return w.m3(this.preferencesMap.entrySet(), ",\n", "{\n", "\n}", 0, null, C0468a.f28555b, 24, null);
    }

    public /* synthetic */ a(Map map, boolean z4, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? new LinkedHashMap() : map, (i4 & 2) != 0 ? true : z4);
    }

    public a(@l Map<d.a<?>, Object> preferencesMap, boolean z4) {
        l0.p(preferencesMap, "preferencesMap");
        this.preferencesMap = preferencesMap;
        this.frozen = new AtomicBoolean(z4);
    }
}

package android.content.preferences.core;

import android.content.preferences.core.d;
import d5.d;
import d5.e;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import q3.l;

/* compiled from: Preferences.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0018\b\u0002\u0010*\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\u000e0&\u0012\b\b\u0002\u0010.\u001a\u00020\t¢\u0006\u0004\b/\u00100J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u001d\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0096\u0002J&\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\u000e0\rH\u0016J,\u0010\u0011\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0010\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0013\u001a\u00020\u00022\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u0011\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0001H\u0086\u0002J\u0015\u0010\u0018\u001a\u00020\u00022\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0086\u0002J\u0015\u0010\u0019\u001a\u00020\u00022\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0086\u0002J)\u0010\u001c\u001a\u00020\u00022\u001a\u0010\u001b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00160\u001a\"\u0006\u0012\u0002\b\u00030\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u001e\u0010\fJ\u0006\u0010\u001f\u001a\u00020\u0002J\u0013\u0010!\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010#\u001a\u00020\"H\u0016J\b\u0010%\u001a\u00020$H\u0016R*\u0010*\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\u000e0&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010,¨\u00061"}, d2 = {"Landroidx/datastore/preferences/core/a;", "Landroidx/datastore/preferences/core/d;", "Lkotlin/m2;", "f", "()V", "h", "T", "Landroidx/datastore/preferences/core/d$a;", "key", "", "b", "c", "(Landroidx/datastore/preferences/core/d$a;)Ljava/lang/Object;", "", "", "a", "value", "o", "(Landroidx/datastore/preferences/core/d$a;Ljava/lang/Object;)V", "p", "prefs", "l", "Landroidx/datastore/preferences/core/d$b;", "pair", "k", "j", "", "pairs", "m", "([Landroidx/datastore/preferences/core/d$b;)V", "n", "g", "other", "equals", "", "hashCode", "", "toString", "", "Ljava/util/Map;", "i", "()Ljava/util/Map;", "preferencesMap", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "frozen", "startFrozen", "<init>", "(Ljava/util/Map;Z)V", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    private final Map<d.a<?>, Object> preferencesMap;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final AtomicBoolean frozen;

    /* compiled from: Preferences.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "Landroidx/datastore/preferences/core/d$a;", "", "entry", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: androidx.datastore.preferences.core.a$a, reason: collision with other inner class name */
    static final class C0079a extends Lambda implements l<Map.Entry<d.a<?>, Object>, CharSequence> {

        /* renamed from: p, reason: collision with root package name */
        public static final C0079a f7101p = new C0079a();

        C0079a() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence N(@d5.d Map.Entry<d.a<?>, Object> entry) {
            l0.p(entry, "entry");
            return "  " + entry.getKey().getName() + " = " + entry.getValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @Override // android.content.preferences.core.d
    @d5.d
    public Map<d.a<?>, Object> a() {
        Map<d.a<?>, Object> unmodifiableMap = Collections.unmodifiableMap(this.preferencesMap);
        l0.o(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    @Override // android.content.preferences.core.d
    public <T> boolean b(@d5.d d.a<T> key) {
        l0.p(key, "key");
        return this.preferencesMap.containsKey(key);
    }

    @Override // android.content.preferences.core.d
    @e
    public <T> T c(@d5.d d.a<T> key) {
        l0.p(key, "key");
        return (T) this.preferencesMap.get(key);
    }

    public boolean equals(@e Object other) {
        if (other instanceof a) {
            return l0.g(this.preferencesMap, ((a) other).preferencesMap);
        }
        return false;
    }

    public final void f() {
        if (!(!this.frozen.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
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

    @d5.d
    public final Map<d.a<?>, Object> i() {
        return this.preferencesMap;
    }

    public final void j(@d5.d d.a<?> key) {
        l0.p(key, "key");
        f();
        n(key);
    }

    public final void k(@d5.d d.b<?> pair) {
        l0.p(pair, "pair");
        f();
        m(pair);
    }

    public final void l(@d5.d d prefs) {
        l0.p(prefs, "prefs");
        f();
        this.preferencesMap.putAll(prefs.a());
    }

    public final void m(@d5.d d.b<?>... pairs) {
        l0.p(pairs, "pairs");
        f();
        for (d.b<?> bVar : pairs) {
            p(bVar.a(), bVar.b());
        }
    }

    public final <T> T n(@d5.d d.a<T> key) {
        l0.p(key, "key");
        f();
        return (T) this.preferencesMap.remove(key);
    }

    public final <T> void o(@d5.d d.a<T> key, T value) {
        l0.p(key, "key");
        p(key, value);
    }

    public final void p(@d5.d d.a<?> key, @e Object value) {
        Set a6;
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
        a6 = j0.a6((Iterable) value);
        Set unmodifiableSet = Collections.unmodifiableSet(a6);
        l0.o(unmodifiableSet, "unmodifiableSet(value.toSet())");
        map.put(key, unmodifiableSet);
    }

    @d5.d
    public String toString() {
        String m32;
        m32 = j0.m3(this.preferencesMap.entrySet(), ",\n", "{\n", "\n}", 0, null, C0079a.f7101p, 24, null);
        return m32;
    }

    public /* synthetic */ a(Map map, boolean z5, int i5, w wVar) {
        this((i5 & 1) != 0 ? new LinkedHashMap() : map, (i5 & 2) != 0 ? true : z5);
    }

    public a(@d5.d Map<d.a<?>, Object> preferencesMap, boolean z5) {
        l0.p(preferencesMap, "preferencesMap");
        this.preferencesMap = preferencesMap;
        this.frozen = new AtomicBoolean(z5);
    }
}

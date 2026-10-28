package androidx.content.migrations;

import android.content.SharedPreferences;
import fg.l;
import fg.m;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;

/* compiled from: SharedPreferencesMigration.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u00052\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010 ¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$¨\u0006%"}, d2 = {"Landroidx/datastore/migrations/c;", "", "Landroid/content/SharedPreferences;", "prefs", "", "", "keySet", "<init>", "(Landroid/content/SharedPreferences;Ljava/util/Set;)V", "key", "a", "(Ljava/lang/String;)Ljava/lang/String;", "", "b", "(Ljava/lang/String;)Z", "defValue", "d", "(Ljava/lang/String;Z)Z", "", "e", "(Ljava/lang/String;F)F", "", "f", "(Ljava/lang/String;I)I", "", "g", "(Ljava/lang/String;J)J", "h", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "defValues", "j", "(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;", "", "c", "()Ljava/util/Map;", "Landroid/content/SharedPreferences;", "Ljava/util/Set;", "datastore_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final SharedPreferences prefs;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private final Set<String> keySet;

    public c(@l SharedPreferences prefs, @m Set<String> set) {
        l0.p(prefs, "prefs");
        this.prefs = prefs;
        this.keySet = set;
    }

    private final String a(String key) {
        Set<String> set = this.keySet;
        if (set == null || set.contains(key)) {
            return key;
        }
        throw new IllegalStateException(l0.C("Can't access key outside migration: ", key).toString());
    }

    public static /* synthetic */ String i(c cVar, String str, String str2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = null;
        }
        return cVar.h(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Set k(c cVar, String str, Set set, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            set = null;
        }
        return cVar.j(str, set);
    }

    public final boolean b(@l String key) {
        l0.p(key, "key");
        return this.prefs.contains(a(key));
    }

    @l
    public final Map<String, Object> c() {
        Map<String, ?> all = this.prefs.getAll();
        l0.o(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set<String> set = this.keySet;
            if (set == null ? true : set.contains(key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(z0.j(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = w.a6((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }

    public final boolean d(@l String key, boolean defValue) {
        l0.p(key, "key");
        return this.prefs.getBoolean(a(key), defValue);
    }

    public final float e(@l String key, float defValue) {
        l0.p(key, "key");
        return this.prefs.getFloat(a(key), defValue);
    }

    public final int f(@l String key, int defValue) {
        l0.p(key, "key");
        return this.prefs.getInt(a(key), defValue);
    }

    public final long g(@l String key, long defValue) {
        l0.p(key, "key");
        return this.prefs.getLong(a(key), defValue);
    }

    @m
    public final String h(@l String key, @m String defValue) {
        l0.p(key, "key");
        return this.prefs.getString(a(key), defValue);
    }

    @m
    public final Set<String> j(@l String key, @m Set<String> defValues) {
        l0.p(key, "key");
        Set<String> stringSet = this.prefs.getStringSet(a(key), defValues);
        if (stringSet == null) {
            return null;
        }
        return w.Z5(stringSet);
    }
}

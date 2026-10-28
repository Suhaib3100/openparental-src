package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: Maps.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\bÂ\u0002\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00060\u0004j\u0002`\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0003H\u0016J\u0013\u0010\u001d\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010 \u001a\u00020\u0011H\u0016J\b\u0010!\u001a\u00020\u0019H\u0016J\b\u0010\"\u001a\u00020\u0002H\u0002J\b\u0010#\u001a\u00020$H\u0016R(\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lkotlin/collections/EmptyMap;", "", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "serialVersionUID", "", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "containsKey", "", "key", "containsValue", "value", "equals", "other", "get", "hashCode", "isEmpty", "readResolve", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.collections.n0, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class EmptyMap implements Map, Serializable, r3.a {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    public static final EmptyMap f23172o = new EmptyMap();

    /* renamed from: p, reason: collision with root package name */
    private static final long f23173p = 8246714829545688274L;

    private EmptyMap() {
    }

    private final Object m() {
        return f23172o;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㟹"));
    }

    @Override // java.util.Map
    public boolean containsKey(@d5.e Object key) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return d((Void) obj);
        }
        return false;
    }

    public boolean d(@d5.d Void r22) {
        kotlin.jvm.internal.l0.p(r22, ProtectedSandApp.s("㟺"));
        return false;
    }

    @Override // java.util.Map
    public final Set<Map.Entry> entrySet() {
        return EmptySet.f23181o;
    }

    @Override // java.util.Map
    public boolean equals(@d5.e Object other) {
        return (other instanceof Map) && ((Map) other).isEmpty();
    }

    @d5.e
    public Void f(@d5.e Object obj) {
        return null;
    }

    @d5.d
    public Set<Map.Entry> g() {
        return EmptySet.f23181o;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return null;
    }

    @d5.d
    public Set<Object> h() {
        return EmptySet.f23181o;
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    public int j() {
        return 0;
    }

    @d5.d
    public Collection k() {
        return EmptyList.f23167o;
    }

    @Override // java.util.Map
    public final Set<Object> keySet() {
        return EmptySet.f23181o;
    }

    public Void l(Object obj, Void r22) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㟻"));
    }

    @Override // java.util.Map
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㟼"));
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㟽"));
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㟾"));
    }

    @Override // java.util.Map
    public final int size() {
        return 0;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("㟿");
    }

    @Override // java.util.Map
    public final Collection values() {
        return EmptyList.f23167o;
    }
}

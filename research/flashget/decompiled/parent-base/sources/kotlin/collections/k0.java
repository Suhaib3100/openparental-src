package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: Maps.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00060\u0004j\u0002`\u0005B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\rJ\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u0014\u0010!\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0010R(\u0010&\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030#0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lkotlin/collections/k0;", "", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "j", "()Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isEmpty", "()Z", "key", "containsKey", "value", "b", "(Ljava/lang/Void;)Z", "c", "(Ljava/lang/Object;)Ljava/lang/Void;", "", "J", "serialVersionUID", "f", "size", "", "", "d", "()Ljava/util/Set;", "entries", "e", "keys", "", "h", "()Ljava/util/Collection;", "values", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class k0 implements Map, Serializable, md.a {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static final k0 f74930b = new k0();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final long serialVersionUID = 8246714829545688274L;

    private k0() {
    }

    private final Object j() {
        return f74930b;
    }

    public boolean b(@fg.l Void value) {
        kotlin.jvm.internal.l0.p(value, ProtectedSandApp.s("憌\u0001"));
        return false;
    }

    @fg.m
    public Void c(@fg.m Object key) {
        return null;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("憍\u0001"));
    }

    @Override // java.util.Map
    public boolean containsKey(@fg.m Object key) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return b((Void) obj);
        }
        return false;
    }

    @fg.l
    public Set<Map.Entry> d() {
        return l0.f74939b;
    }

    @fg.l
    public Set<Object> e() {
        return l0.f74939b;
    }

    @Override // java.util.Map
    public final Set<Map.Entry> entrySet() {
        return l0.f74939b;
    }

    @Override // java.util.Map
    public boolean equals(@fg.m Object other) {
        return (other instanceof Map) && ((Map) other).isEmpty();
    }

    public int f() {
        return 0;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return null;
    }

    @fg.l
    public Collection h() {
        return j0.f74919b;
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    public Void i(Object obj, Void r22) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("憍\u0001"));
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final Set<Object> keySet() {
        return l0.f74939b;
    }

    @Override // java.util.Map
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("憍\u0001"));
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("憍\u0001"));
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("憍\u0001"));
    }

    @Override // java.util.Map
    public final int size() {
        return 0;
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("憎\u0001");
    }

    @Override // java.util.Map
    public final Collection values() {
        return j0.f74919b;
    }
}

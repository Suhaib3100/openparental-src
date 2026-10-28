package androidx.collection;

import java.util.Map;
import kotlin.Metadata;
import md.g;

/* compiled from: ScatterMap.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B/\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u000f\u0010\u0016R\u001a\u0010\u001a\u001a\u00028\u00008VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\u00028\u00018VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001e"}, d2 = {"Landroidx/collection/e2;", "K", "V", "", "", "", "keys", "values", "", "index", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;I)V", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "b", "[Ljava/lang/Object;", "d", "()[Ljava/lang/Object;", "c", "f", "I", "()I", "getKey", "()Ljava/lang/Object;", "()V", "key", "getValue", "e", "value", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class e2<K, V> implements Map.Entry<K, V>, g.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object[] keys;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object[] values;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int index;

    public e2(@fg.l Object[] keys, @fg.l Object[] values, int i4) {
        kotlin.jvm.internal.l0.p(keys, "keys");
        kotlin.jvm.internal.l0.p(values, "values");
        this.keys = keys;
        this.values = values;
        this.index = i4;
    }

    public static /* synthetic */ void c() {
    }

    public static /* synthetic */ void e() {
    }

    /* renamed from: b, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final Object[] getKeys() {
        return this.keys;
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final Object[] getValues() {
        return this.values;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return (K) this.keys[this.index];
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return (V) this.values[this.index];
    }

    @Override // java.util.Map.Entry
    public V setValue(V newValue) {
        Object[] objArr = this.values;
        int i4 = this.index;
        V v4 = (V) objArr[i4];
        objArr[i4] = newValue;
        return v4;
    }
}

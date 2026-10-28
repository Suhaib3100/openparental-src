package androidx.collection;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SimpleArrayMap.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0018\u0010\b\u001a\u0014\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u0001\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\tJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0012\u001a\u00028\u0002\"\n\b\u0002\u0010\u0010*\u0004\u0018\u00018\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00028\u0002H\u0082\b¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0007J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00028\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b!\u0010\u001bJ\u001a\u0010\"\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u00028\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b$\u0010\u0013J\u0017\u0010&\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00028\u00012\u0006\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010'J\u001f\u0010)\u001a\u00028\u00012\u0006\u0010%\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0019H\u0016¢\u0006\u0004\b+\u0010,J!\u0010-\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b-\u0010\u0013J'\u0010.\u001a\u00020\u00142\u0016\u0010\b\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0000H\u0016¢\u0006\u0004\b.\u0010\tJ!\u0010/\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b/\u0010\u0013J\u0019\u00100\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u0010#J\u001f\u00100\u001a\u00020\u00192\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00028\u00012\u0006\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u0010'J!\u00103\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b3\u0010\u0013J'\u00103\u001a\u00020\u00192\u0006\u0010\n\u001a\u00028\u00002\u0006\u00104\u001a\u00028\u00012\u0006\u00105\u001a\u00028\u0001H\u0016¢\u0006\u0004\b3\u00106J\u000f\u00107\u001a\u00020\u0004H\u0016¢\u0006\u0004\b7\u0010\u000fJ\u001a\u00109\u001a\u00020\u00192\b\u00108\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b9\u0010\u001bJ\u000f\u0010:\u001a\u00020\u0004H\u0016¢\u0006\u0004\b:\u0010\u000fJ\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u00107\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010D¨\u0006E"}, d2 = {"Landroidx/collection/a3;", "K", "V", "", "", "capacity", "<init>", "(I)V", "map", "(Landroidx/collection/a3;)V", "key", "hash", "indexOf", "(Ljava/lang/Object;I)I", "indexOfNull", "()I", "T", "defaultValue", "getOrDefaultInternal", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/k2;", "clear", "()V", "minimumCapacity", "ensureCapacity", "", "containsKey", "(Ljava/lang/Object;)Z", "indexOfKey", "(Ljava/lang/Object;)I", "value", "__restricted$indexOfValue", "indexOfValue", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "getOrDefault", "index", "keyAt", "(I)Ljava/lang/Object;", "valueAt", "setValueAt", "(ILjava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "put", "putAll", "putIfAbsent", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "removeAt", "replace", "oldValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "size", "other", "equals", "hashCode", "", "toString", "()Ljava/lang/String;", "", "hashes", "[I", "", "array", "[Ljava/lang/Object;", "I", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSimpleArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,769:1\n297#1,5:770\n297#1,5:775\n1#2:780\n*S KotlinDebug\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n*L\n276#1:770,5\n291#1:775,5\n*E\n"})
/* loaded from: classes.dex */
public class a3<K, V> {

    @fg.l
    private Object[] array;

    @fg.l
    private int[] hashes;
    private int size;

    @kd.j
    public a3() {
        this(0, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends V> T getOrDefaultInternal(Object key, T defaultValue) {
        int indexOfKey = indexOfKey(key);
        return indexOfKey >= 0 ? (T) this.array[(indexOfKey << 1) + 1] : defaultValue;
    }

    private final int indexOf(K key, int hash) {
        int i4 = this.size;
        if (i4 == 0) {
            return -1;
        }
        int a5 = m.a.a(this.hashes, i4, hash);
        if (a5 < 0) {
            return a5;
        }
        if (kotlin.jvm.internal.l0.g(key, this.array[a5 << 1])) {
            return a5;
        }
        int i5 = a5 + 1;
        while (i5 < i4 && this.hashes[i5] == hash) {
            if (kotlin.jvm.internal.l0.g(key, this.array[i5 << 1])) {
                return i5;
            }
            i5++;
        }
        for (int i6 = a5 - 1; i6 >= 0 && this.hashes[i6] == hash; i6--) {
            if (kotlin.jvm.internal.l0.g(key, this.array[i6 << 1])) {
                return i6;
            }
        }
        return ~i5;
    }

    private final int indexOfNull() {
        int i4 = this.size;
        if (i4 == 0) {
            return -1;
        }
        int a5 = m.a.a(this.hashes, i4, 0);
        if (a5 < 0) {
            return a5;
        }
        if (this.array[a5 << 1] == null) {
            return a5;
        }
        int i5 = a5 + 1;
        while (i5 < i4 && this.hashes[i5] == 0) {
            if (this.array[i5 << 1] == null) {
                return i5;
            }
            i5++;
        }
        for (int i6 = a5 - 1; i6 >= 0 && this.hashes[i6] == 0; i6--) {
            if (this.array[i6 << 1] == null) {
                return i6;
            }
        }
        return ~i5;
    }

    @kd.i(name = "__restricted$indexOfValue")
    public final int __restricted$indexOfValue(V value) {
        int i4 = this.size * 2;
        Object[] objArr = this.array;
        if (value == null) {
            for (int i5 = 1; i5 < i4; i5 += 2) {
                if (objArr[i5] == null) {
                    return i5 >> 1;
                }
            }
            return -1;
        }
        for (int i6 = 1; i6 < i4; i6 += 2) {
            if (kotlin.jvm.internal.l0.g(value, objArr[i6])) {
                return i6 >> 1;
            }
        }
        return -1;
    }

    public void clear() {
        if (this.size > 0) {
            this.hashes = m.a.f81460a;
            this.array = m.a.f81462c;
            this.size = 0;
        }
        if (this.size > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K key) {
        return indexOfKey(key) >= 0;
    }

    public boolean containsValue(V value) {
        return __restricted$indexOfValue(value) >= 0;
    }

    public void ensureCapacity(int minimumCapacity) {
        int i4 = this.size;
        int[] iArr = this.hashes;
        if (iArr.length < minimumCapacity) {
            int[] copyOf = Arrays.copyOf(iArr, minimumCapacity);
            kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.array, minimumCapacity * 2);
            kotlin.jvm.internal.l0.o(copyOf2, "copyOf(this, newSize)");
            this.array = copyOf2;
        }
        if (this.size != i4) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        try {
            if (other instanceof a3) {
                if (getSize() != ((a3) other).getSize()) {
                    return false;
                }
                a3 a3Var = (a3) other;
                int i4 = this.size;
                for (int i5 = 0; i5 < i4; i5++) {
                    K keyAt = keyAt(i5);
                    V valueAt = valueAt(i5);
                    Object obj = a3Var.get(keyAt);
                    if (valueAt == null) {
                        if (obj != null || !a3Var.containsKey(keyAt)) {
                            return false;
                        }
                    } else if (!kotlin.jvm.internal.l0.g(valueAt, obj)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(other instanceof Map) || getSize() != ((Map) other).size()) {
                return false;
            }
            int i6 = this.size;
            for (int i7 = 0; i7 < i6; i7++) {
                K keyAt2 = keyAt(i7);
                V valueAt2 = valueAt(i7);
                Object obj2 = ((Map) other).get(keyAt2);
                if (valueAt2 == null) {
                    if (obj2 != null || !((Map) other).containsKey(keyAt2)) {
                        return false;
                    }
                } else if (!kotlin.jvm.internal.l0.g(valueAt2, obj2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    @fg.m
    public V get(K key) {
        int indexOfKey = indexOfKey(key);
        if (indexOfKey >= 0) {
            return (V) this.array[(indexOfKey << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(@fg.m Object key, V defaultValue) {
        int indexOfKey = indexOfKey(key);
        return indexOfKey >= 0 ? (V) this.array[(indexOfKey << 1) + 1] : defaultValue;
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.array;
        int i4 = this.size;
        int i5 = 1;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            Object obj = objArr[i5];
            i7 += (obj != null ? obj.hashCode() : 0) ^ iArr[i6];
            i6++;
            i5 += 2;
        }
        return i7;
    }

    public int indexOfKey(K key) {
        return key == null ? indexOfNull() : indexOf(key, key.hashCode());
    }

    public boolean isEmpty() {
        return this.size <= 0;
    }

    public K keyAt(int index) {
        if (index < 0 || index >= this.size) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Expected index to be within 0..size()-1, but was ", index).toString());
        }
        return (K) this.array[index << 1];
    }

    @fg.m
    public V put(K key, V value) {
        int i4 = this.size;
        int hashCode = key != null ? key.hashCode() : 0;
        int indexOf = key != null ? indexOf(key, hashCode) : indexOfNull();
        if (indexOf >= 0) {
            int i5 = (indexOf << 1) + 1;
            Object[] objArr = this.array;
            V v4 = (V) objArr[i5];
            objArr[i5] = value;
            return v4;
        }
        int i6 = ~indexOf;
        int[] iArr = this.hashes;
        if (i4 >= iArr.length) {
            int i7 = 8;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i7 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i7);
            kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.array, i7 << 1);
            kotlin.jvm.internal.l0.o(copyOf2, "copyOf(this, newSize)");
            this.array = copyOf2;
            if (i4 != this.size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i6 < i4) {
            int[] iArr2 = this.hashes;
            int i10 = i6 + 1;
            kotlin.collections.l.z0(iArr2, iArr2, i10, i6, i4);
            Object[] objArr2 = this.array;
            kotlin.collections.l.B0(objArr2, objArr2, i10 << 1, i6 << 1, this.size << 1);
        }
        int i11 = this.size;
        if (i4 == i11) {
            int[] iArr3 = this.hashes;
            if (i6 < iArr3.length) {
                iArr3[i6] = hashCode;
                Object[] objArr3 = this.array;
                int i12 = i6 << 1;
                objArr3[i12] = key;
                objArr3[i12 + 1] = value;
                this.size = i11 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void putAll(@fg.l a3<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l0.p(map, "map");
        int i4 = map.size;
        ensureCapacity(this.size + i4);
        if (this.size != 0) {
            for (int i5 = 0; i5 < i4; i5++) {
                put(map.keyAt(i5), map.valueAt(i5));
            }
        } else if (i4 > 0) {
            kotlin.collections.l.z0(map.hashes, this.hashes, 0, 0, i4);
            kotlin.collections.l.B0(map.array, this.array, 0, 0, i4 << 1);
            this.size = i4;
        }
    }

    @fg.m
    public V putIfAbsent(K key, V value) {
        V v4 = get(key);
        return v4 == null ? put(key, value) : v4;
    }

    @fg.m
    public V remove(K key) {
        int indexOfKey = indexOfKey(key);
        if (indexOfKey >= 0) {
            return removeAt(indexOfKey);
        }
        return null;
    }

    public V removeAt(int index) {
        int i4;
        if (index < 0 || index >= (i4 = this.size)) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Expected index to be within 0..size()-1, but was ", index).toString());
        }
        Object[] objArr = this.array;
        int i5 = index << 1;
        V v4 = (V) objArr[i5 + 1];
        if (i4 <= 1) {
            clear();
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.hashes;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (index < i6) {
                    int i7 = index + 1;
                    kotlin.collections.l.z0(iArr, iArr, index, i7, i4);
                    Object[] objArr2 = this.array;
                    kotlin.collections.l.B0(objArr2, objArr2, i5, i7 << 1, i4 << 1);
                }
                Object[] objArr3 = this.array;
                int i10 = i6 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            } else {
                int i11 = i4 > 8 ? i4 + (i4 >> 1) : 8;
                int[] copyOf = Arrays.copyOf(iArr, i11);
                kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
                this.hashes = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.array, i11 << 1);
                kotlin.jvm.internal.l0.o(copyOf2, "copyOf(this, newSize)");
                this.array = copyOf2;
                if (i4 != this.size) {
                    throw new ConcurrentModificationException();
                }
                if (index > 0) {
                    kotlin.collections.l.z0(iArr, this.hashes, 0, 0, index);
                    kotlin.collections.l.B0(objArr, this.array, 0, 0, i5);
                }
                if (index < i6) {
                    int i12 = index + 1;
                    kotlin.collections.l.z0(iArr, this.hashes, index, i12, i4);
                    kotlin.collections.l.B0(objArr, this.array, i5, i12 << 1, i4 << 1);
                }
            }
            if (i4 != this.size) {
                throw new ConcurrentModificationException();
            }
            this.size = i6;
        }
        return v4;
    }

    @fg.m
    public V replace(K key, V value) {
        int indexOfKey = indexOfKey(key);
        if (indexOfKey >= 0) {
            return setValueAt(indexOfKey, value);
        }
        return null;
    }

    public V setValueAt(int index, V value) {
        if (index < 0 || index >= this.size) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Expected index to be within 0..size()-1, but was ", index).toString());
        }
        int i4 = (index << 1) + 1;
        Object[] objArr = this.array;
        V v4 = (V) objArr[i4];
        objArr[i4] = value;
        return v4;
    }

    /* renamed from: size, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @fg.l
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i4 = this.size;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            K keyAt = keyAt(i5);
            if (keyAt != sb) {
                sb.append(keyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V valueAt = valueAt(i5);
            if (valueAt != sb) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        return c.a(sb, '}', "StringBuilder(capacity).…builderAction).toString()");
    }

    public V valueAt(int index) {
        if (index < 0 || index >= this.size) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Expected index to be within 0..size()-1, but was ", index).toString());
        }
        return (V) this.array[(index << 1) + 1];
    }

    @kd.j
    public a3(int i4) {
        this.hashes = i4 == 0 ? m.a.f81460a : new int[i4];
        this.array = i4 == 0 ? m.a.f81462c : new Object[i4 << 1];
    }

    public boolean remove(K key, V value) {
        int indexOfKey = indexOfKey(key);
        if (indexOfKey < 0 || !kotlin.jvm.internal.l0.g(value, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public boolean replace(K key, V oldValue, V newValue) {
        int indexOfKey = indexOfKey(key);
        if (indexOfKey < 0 || !kotlin.jvm.internal.l0.g(oldValue, valueAt(indexOfKey))) {
            return false;
        }
        setValueAt(indexOfKey, newValue);
        return true;
    }

    public /* synthetic */ a3(int i4, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? 0 : i4);
    }

    public a3(@fg.m a3<? extends K, ? extends V> a3Var) {
        this(0, 1, null);
        if (a3Var != null) {
            putAll(a3Var);
        }
    }
}

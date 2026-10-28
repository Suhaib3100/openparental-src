package androidx.compose.ui.text.caches;

import androidx.compose.runtime.internal.u;
import fg.l;
import fg.m;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kd.i;
import kd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: SimpleArrayMap.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0013\b\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0016\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\tJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0007J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u0001H\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00028\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u001a\u0010\u001d\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00028\u0001¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00028\u00012\u0006\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b%\u0010$J\u001d\u0010&\u001a\u00028\u00012\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u0001¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0015¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0001¢\u0006\u0004\b*\u0010!J%\u0010,\u001a\u00020\u00102\u0016\u0010+\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0000¢\u0006\u0004\b,\u0010\tJ\u001f\u0010-\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0001¢\u0006\u0004\b-\u0010!J\u0017\u0010.\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b.\u0010\u001eJ\u001d\u0010/\u001a\u00020\u00152\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0001¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u0004\u0018\u00018\u00012\u0006\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b1\u0010$J\u001f\u00102\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0001¢\u0006\u0004\b2\u0010!J%\u00105\u001a\u00020\u00152\u0006\u0010\n\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u00012\u0006\u00104\u001a\u00028\u0001¢\u0006\u0004\b5\u00106J\u001a\u00108\u001a\u00020\u00152\b\u00107\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b8\u0010\u0017J\u000f\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\b9\u0010\u000fJ\u000f\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<R\u0016\u0010?\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010>R\u001e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010AR\"\u0010F\u001a\u00020\u00048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010C\u001a\u0004\bD\u0010\u000f\"\u0004\bE\u0010\u0007R\u0017\u0010I\u001a\u00020\u00048G¢\u0006\f\u0012\u0004\bH\u0010\u0012\u001a\u0004\bG\u0010\u000f¨\u0006J"}, d2 = {"Landroidx/compose/ui/text/caches/c;", "K", "V", "", "", "capacity", "<init>", "(I)V", "map", "(Landroidx/compose/ui/text/caches/c;)V", "key", "hash", "h", "(Ljava/lang/Object;I)I", "j", "()I", "Lkotlin/k2;", "a", "()V", "minimumCapacity", "d", "", "b", "(Ljava/lang/Object;)Z", "i", "(Ljava/lang/Object;)I", "value", "k", "c", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "defaultValue", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "index", "m", "(I)Ljava/lang/Object;", "z", "v", "(ILjava/lang/Object;)Ljava/lang/Object;", "l", "()Z", "n", "array", "o", "p", "q", "r", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "s", "t", "oldValue", "newValue", "u", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "other", "equals", "hashCode", "", "toString", "()Ljava/lang/String;", "", "[I", "hashes", "", "[Ljava/lang/Object;", "keyValues", "I", "g", "w", "_size", "x", "y", "size", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c<K, V> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f20622d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private int[] hashes;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private Object[] keyValues;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int _size;

    @j
    public c() {
        this(0, 1, null);
    }

    public static /* synthetic */ void y() {
    }

    public final void a() {
        if (this._size > 0) {
            this.hashes = a.f20609a;
            this.keyValues = a.f20610b;
            this._size = 0;
        }
        if (this._size > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean b(K key) {
        return i(key) >= 0;
    }

    public final boolean c(V value) {
        return k(value) >= 0;
    }

    public final void d(int minimumCapacity) {
        int i4 = this._size;
        int[] iArr = this.hashes;
        if (iArr.length < minimumCapacity) {
            int[] copyOf = Arrays.copyOf(iArr, minimumCapacity);
            l0.o(copyOf, "copyOf(this, newSize)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.keyValues, minimumCapacity << 1);
            l0.o(copyOf2, "copyOf(this, newSize)");
            this.keyValues = copyOf2;
        }
        if (this._size != i4) {
            throw new ConcurrentModificationException();
        }
    }

    @m
    public final V e(K key) {
        int i4 = i(key);
        if (i4 >= 0) {
            return (V) this.keyValues[(i4 << 1) + 1];
        }
        return null;
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        try {
            if (other instanceof c) {
                c cVar = (c) other;
                int i4 = this._size;
                if (i4 != cVar._size) {
                    return false;
                }
                for (int i5 = 0; i5 < i4; i5++) {
                    K m4 = m(i5);
                    V z4 = z(i5);
                    Object e4 = cVar.e(m4);
                    if (z4 == null) {
                        if (e4 != null || !cVar.b(m4)) {
                            return false;
                        }
                    } else if (!l0.g(z4, e4)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(other instanceof Map) || this._size != ((Map) other).size()) {
                return false;
            }
            int i6 = this._size;
            for (int i7 = 0; i7 < i6; i7++) {
                K m5 = m(i7);
                V z5 = z(i7);
                Object obj = ((Map) other).get(m5);
                if (z5 == null) {
                    if (obj != null || !((Map) other).containsKey(m5)) {
                        return false;
                    }
                } else if (!l0.g(z5, obj)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final V f(K key, V defaultValue) {
        int i4 = i(key);
        return i4 >= 0 ? (V) this.keyValues[(i4 << 1) + 1] : defaultValue;
    }

    /* renamed from: g, reason: from getter */
    protected final int get_size() {
        return this._size;
    }

    protected final int h(@l Object key, int hash) {
        int i4 = this._size;
        if (i4 == 0) {
            return -1;
        }
        int a5 = a.a(this.hashes, i4, hash);
        if (a5 < 0) {
            return a5;
        }
        if (l0.g(key, this.keyValues[a5 << 1])) {
            return a5;
        }
        int i5 = a5 + 1;
        while (i5 < i4 && this.hashes[i5] == hash) {
            if (l0.g(key, this.keyValues[i5 << 1])) {
                return i5;
            }
            i5++;
        }
        for (int i6 = a5 - 1; i6 >= 0 && this.hashes[i6] == hash; i6--) {
            if (l0.g(key, this.keyValues[i6 << 1])) {
                return i6;
            }
        }
        return ~i5;
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.keyValues;
        int i4 = this._size;
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

    public final int i(@m Object key) {
        return key == null ? j() : h(key, key.hashCode());
    }

    protected final int j() {
        int i4 = this._size;
        if (i4 == 0) {
            return -1;
        }
        int a5 = a.a(this.hashes, i4, 0);
        if (a5 < 0) {
            return a5;
        }
        if (this.keyValues[a5 << 1] == null) {
            return a5;
        }
        int i5 = a5 + 1;
        while (i5 < i4 && this.hashes[i5] == 0) {
            if (this.keyValues[i5 << 1] == null) {
                return i5;
            }
            i5++;
        }
        for (int i6 = a5 - 1; i6 >= 0 && this.hashes[i6] == 0; i6--) {
            if (this.keyValues[i6 << 1] == null) {
                return i6;
            }
        }
        return ~i5;
    }

    public final int k(V value) {
        int i4 = this._size << 1;
        Object[] objArr = this.keyValues;
        if (value == null) {
            for (int i5 = 1; i5 < i4; i5 += 2) {
                if (objArr[i5] == null) {
                    return i5 >> 1;
                }
            }
            return -1;
        }
        for (int i6 = 1; i6 < i4; i6 += 2) {
            if (l0.g(value, objArr[i6])) {
                return i6 >> 1;
            }
        }
        return -1;
    }

    public final boolean l() {
        return this._size <= 0;
    }

    public final K m(int index) {
        return (K) this.keyValues[index << 1];
    }

    @m
    public final V n(K key, V value) {
        int hashCode;
        int h4;
        int i4 = this._size;
        if (key == null) {
            h4 = j();
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
            h4 = h(key, hashCode);
        }
        if (h4 >= 0) {
            int i5 = (h4 << 1) + 1;
            Object[] objArr = this.keyValues;
            V v4 = (V) objArr[i5];
            objArr[i5] = value;
            return v4;
        }
        int i6 = ~h4;
        int[] iArr = this.hashes;
        if (i4 >= iArr.length) {
            int i7 = 8;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i7 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i7);
            l0.o(copyOf, "copyOf(this, newSize)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.keyValues, i7 << 1);
            l0.o(copyOf2, "copyOf(this, newSize)");
            this.keyValues = copyOf2;
            if (i4 != this._size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i6 < i4) {
            int[] iArr2 = this.hashes;
            int i10 = i6 + 1;
            kotlin.collections.l.z0(iArr2, iArr2, i10, i6, i4);
            Object[] objArr2 = this.keyValues;
            kotlin.collections.l.B0(objArr2, objArr2, i10 << 1, i6 << 1, this._size << 1);
        }
        int i11 = this._size;
        if (i4 == i11) {
            int[] iArr3 = this.hashes;
            if (i6 < iArr3.length) {
                iArr3[i6] = hashCode;
                Object[] objArr3 = this.keyValues;
                int i12 = i6 << 1;
                objArr3[i12] = key;
                objArr3[i12 + 1] = value;
                this._size = i11 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final void o(@l c<? extends K, ? extends V> array) {
        int i4 = array._size;
        d(this._size + i4);
        if (this._size != 0) {
            for (int i5 = 0; i5 < i4; i5++) {
                n(array.m(i5), array.z(i5));
            }
        } else if (i4 > 0) {
            kotlin.collections.l.z0(array.hashes, this.hashes, 0, 0, i4);
            kotlin.collections.l.B0(array.keyValues, this.keyValues, 0, 0, i4 << 1);
            this._size = i4;
        }
    }

    @m
    public final V p(K key, V value) {
        V e4 = e(key);
        return e4 == null ? n(key, value) : e4;
    }

    @m
    public final V q(K key) {
        int i4 = i(key);
        if (i4 >= 0) {
            return s(i4);
        }
        return null;
    }

    public final boolean r(K key, V value) {
        int i4 = i(key);
        if (i4 < 0 || !l0.g(value, z(i4))) {
            return false;
        }
        s(i4);
        return true;
    }

    @m
    public final V s(int index) {
        Object[] objArr = this.keyValues;
        int i4 = index << 1;
        V v4 = (V) objArr[i4 + 1];
        int i5 = this._size;
        if (i5 <= 1) {
            a();
        } else {
            int i6 = i5 - 1;
            int[] iArr = this.hashes;
            if (iArr.length <= 8 || i5 >= iArr.length / 3) {
                if (index < i6) {
                    int i7 = index + 1;
                    kotlin.collections.l.z0(iArr, iArr, index, i7, i5);
                    Object[] objArr2 = this.keyValues;
                    kotlin.collections.l.B0(objArr2, objArr2, i4, i7 << 1, i5 << 1);
                }
                Object[] objArr3 = this.keyValues;
                int i10 = i6 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            } else {
                int i11 = i5 > 8 ? i5 + (i5 >> 1) : 8;
                int[] iArr2 = new int[i11];
                this.hashes = iArr2;
                this.keyValues = new Object[i11 << 1];
                if (index > 0) {
                    kotlin.collections.l.z0(iArr, iArr2, 0, 0, index);
                    kotlin.collections.l.B0(objArr, this.keyValues, 0, 0, i4);
                }
                if (index < i6) {
                    int i12 = index + 1;
                    kotlin.collections.l.z0(iArr, this.hashes, index, i12, i5);
                    kotlin.collections.l.B0(objArr, this.keyValues, i4, i12 << 1, i5 << 1);
                }
            }
            if (i5 != this._size) {
                throw new ConcurrentModificationException();
            }
            this._size = i6;
        }
        return v4;
    }

    @m
    public final V t(K key, V value) {
        int i4 = i(key);
        if (i4 >= 0) {
            return v(i4, value);
        }
        return null;
    }

    @l
    public String toString() {
        if (l()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this._size * 28);
        sb.append('{');
        int i4 = this._size;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            K m4 = m(i5);
            if (m4 != this) {
                sb.append(m4);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V z4 = z(i5);
            if (z4 != this) {
                sb.append(z4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean u(K key, V oldValue, V newValue) {
        int i4 = i(key);
        if (i4 < 0 || z(i4) != oldValue) {
            return false;
        }
        v(i4, newValue);
        return true;
    }

    public final V v(int index, V value) {
        int i4 = (index << 1) + 1;
        Object[] objArr = this.keyValues;
        V v4 = (V) objArr[i4];
        objArr[i4] = value;
        return v4;
    }

    protected final void w(int i4) {
        this._size = i4;
    }

    @i(name = "size")
    public final int x() {
        return this._size;
    }

    public final V z(int index) {
        return (V) this.keyValues[(index << 1) + 1];
    }

    @j
    public c(int i4) {
        if (i4 == 0) {
            this.hashes = a.f20609a;
            this.keyValues = a.f20610b;
        } else {
            this.hashes = new int[i4];
            this.keyValues = new Object[i4 << 1];
        }
        this._size = 0;
    }

    public /* synthetic */ c(int i4, int i5, w wVar) {
        this((i5 & 1) != 0 ? 0 : i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@m c<K, V> cVar) {
        this(0, 1, null);
        if (cVar != 0) {
            o(cVar);
        }
    }
}

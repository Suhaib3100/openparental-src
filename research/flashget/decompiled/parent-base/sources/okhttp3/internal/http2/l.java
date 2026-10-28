package okhttp3.internal.http2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Settings.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J \u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0011J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u000fJ\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u000fJ\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0011\u0010!\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b \u0010\u0011R\u0011\u0010#\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0011¨\u0006$"}, d2 = {"Lokhttp3/internal/http2/l;", "", "<init>", "()V", "Lkotlin/k2;", "a", "", "id", "value", "k", "(II)Lokhttp3/internal/http2/l;", "", "i", "(I)Z", "b", "(I)I", "l", "()I", "defaultValue", "c", "(Z)Z", "f", "g", "h", "other", "j", "(Lokhttp3/internal/http2/l;)V", "I", "set", "", "[I", "values", "d", "headerTableSize", "e", "initialWindowSize", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static final int f84789c = 65535;

    /* renamed from: d, reason: collision with root package name */
    public static final int f84790d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f84791e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f84792f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f84793g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f84794h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f84795i = 7;

    /* renamed from: j, reason: collision with root package name */
    public static final int f84796j = 10;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int set;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int[] values = new int[10];

    public final void a() {
        this.set = 0;
        kotlin.collections.l.T1(this.values, 0, 0, 0, 6, null);
    }

    public final int b(int id2) {
        return this.values[id2];
    }

    public final boolean c(boolean defaultValue) {
        return (this.set & 4) != 0 ? this.values[2] == 1 : defaultValue;
    }

    public final int d() {
        if ((this.set & 2) != 0) {
            return this.values[1];
        }
        return -1;
    }

    public final int e() {
        if ((this.set & 128) != 0) {
            return this.values[7];
        }
        return 65535;
    }

    public final int f() {
        if ((this.set & 16) != 0) {
            return this.values[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int g(int defaultValue) {
        return (this.set & 32) != 0 ? this.values[5] : defaultValue;
    }

    public final int h(int defaultValue) {
        return (this.set & 64) != 0 ? this.values[6] : defaultValue;
    }

    public final boolean i(int id2) {
        return ((1 << id2) & this.set) != 0;
    }

    public final void j(@fg.l l other) {
        l0.p(other, ProtectedSandApp.s("ᶈ"));
        for (int i4 = 0; i4 < 10; i4++) {
            if (other.i(i4)) {
                k(i4, other.values[i4]);
            }
        }
    }

    @fg.l
    public final l k(int id2, int value) {
        if (id2 >= 0) {
            int[] iArr = this.values;
            if (id2 < iArr.length) {
                this.set = (1 << id2) | this.set;
                iArr[id2] = value;
            }
        }
        return this;
    }

    public final int l() {
        return Integer.bitCount(this.set);
    }
}

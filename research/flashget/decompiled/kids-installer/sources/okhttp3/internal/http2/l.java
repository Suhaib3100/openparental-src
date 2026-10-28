package okhttp3.internal.http2;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.l0;

/* compiled from: Settings.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\n\u0018\u0000 \u00072\u00020\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0019\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0086\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u0011\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002J\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0000R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/http2/l;", "", "Lkotlin/m2;", "a", "", "id", "value", "k", "", "i", "b", "l", "defaultValue", "c", "f", "g", "h", "other", "j", "I", "set", "", "[I", "values", "d", "()I", "headerTableSize", "e", "initialWindowSize", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static final int f31249c = 65535;

    /* renamed from: d, reason: collision with root package name */
    public static final int f31250d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f31251e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f31252f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f31253g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f31254h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f31255i = 7;

    /* renamed from: j, reason: collision with root package name */
    public static final int f31256j = 10;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int set;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int[] values = new int[10];

    public final void a() {
        this.set = 0;
        p.T1(this.values, 0, 0, 0, 6, null);
    }

    public final int b(int id) {
        return this.values[id];
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

    public final boolean i(int id) {
        return ((1 << id) & this.set) != 0;
    }

    public final void j(@d5.d l lVar) {
        l0.p(lVar, ProtectedSandApp.s("擪"));
        for (int i5 = 0; i5 < 10; i5++) {
            if (lVar.i(i5)) {
                k(i5, lVar.values[i5]);
            }
        }
    }

    @d5.d
    public final l k(int id, int value) {
        if (id >= 0) {
            int[] iArr = this.values;
            if (id < iArr.length) {
                this.set = (1 << id) | this.set;
                iArr[id] = value;
            }
        }
        return this;
    }

    public final int l() {
        return Integer.bitCount(this.set);
    }
}

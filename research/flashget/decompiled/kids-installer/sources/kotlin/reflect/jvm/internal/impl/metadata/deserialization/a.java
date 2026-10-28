package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.j0;
import kotlin.collections.p;
import kotlin.collections.t;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import org.apache.commons.io.k;

/* compiled from: BinaryVersion.kt */
/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    public static final C0350a f25427f = new C0350a(null);

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final int[] f25428a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25429b;

    /* renamed from: c, reason: collision with root package name */
    private final int f25430c;

    /* renamed from: d, reason: collision with root package name */
    private final int f25431d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private final List<Integer> f25432e;

    /* compiled from: BinaryVersion.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.deserialization.a$a, reason: collision with other inner class name */
    public static final class C0350a {
        private C0350a() {
        }

        public C0350a(w wVar) {
        }
    }

    public a(@d5.d int... iArr) {
        Integer Ne;
        Integer Ne2;
        Integer Ne3;
        List<Integer> list;
        List r5;
        l0.p(iArr, ProtectedSandApp.s("㎝"));
        this.f25428a = iArr;
        Ne = t.Ne(iArr, 0);
        this.f25429b = Ne != null ? Ne.intValue() : -1;
        Ne2 = t.Ne(iArr, 1);
        this.f25430c = Ne2 != null ? Ne2.intValue() : -1;
        Ne3 = t.Ne(iArr, 2);
        this.f25431d = Ne3 != null ? Ne3.intValue() : -1;
        if (iArr.length <= 3) {
            list = EmptyList.f23167o;
        } else {
            if (iArr.length > 1024) {
                throw new IllegalArgumentException(ProtectedSandApp.s("㎞") + iArr.length + k.f32026a);
            }
            r5 = p.r(iArr);
            list = j0.V5(r5.subList(3, iArr.length));
        }
        this.f25432e = list;
    }

    public final int a() {
        return this.f25429b;
    }

    public final int b() {
        return this.f25430c;
    }

    public final boolean c(int i5, int i6, int i7) {
        int i8 = this.f25429b;
        if (i8 > i5) {
            return true;
        }
        if (i8 < i5) {
            return false;
        }
        int i9 = this.f25430c;
        if (i9 > i6) {
            return true;
        }
        return i9 >= i6 && this.f25431d >= i7;
    }

    public final boolean d(@d5.d a aVar) {
        l0.p(aVar, ProtectedSandApp.s("㎟"));
        return c(aVar.f25429b, aVar.f25430c, aVar.f25431d);
    }

    public final boolean e(int i5, int i6, int i7) {
        int i8 = this.f25429b;
        if (i8 < i5) {
            return true;
        }
        if (i8 > i5) {
            return false;
        }
        int i9 = this.f25430c;
        if (i9 < i6) {
            return true;
        }
        return i9 <= i6 && this.f25431d <= i7;
    }

    public boolean equals(@d5.e Object obj) {
        if (obj != null && l0.g(getClass(), obj.getClass())) {
            a aVar = (a) obj;
            if (this.f25429b == aVar.f25429b && this.f25430c == aVar.f25430c && this.f25431d == aVar.f25431d && l0.g(this.f25432e, aVar.f25432e)) {
                return true;
            }
        }
        return false;
    }

    protected final boolean f(@d5.d a aVar) {
        l0.p(aVar, ProtectedSandApp.s("㎠"));
        int i5 = this.f25429b;
        if (i5 == 0) {
            if (aVar.f25429b == 0 && this.f25430c == aVar.f25430c) {
                return true;
            }
        } else if (i5 == aVar.f25429b && this.f25430c <= aVar.f25430c) {
            return true;
        }
        return false;
    }

    @d5.d
    public final int[] g() {
        return this.f25428a;
    }

    public int hashCode() {
        int i5 = this.f25429b;
        int i6 = (i5 * 31) + this.f25430c + i5;
        int i7 = (i6 * 31) + this.f25431d + i6;
        return this.f25432e.hashCode() + (i7 * 31) + i7;
    }

    @d5.d
    public String toString() {
        String m32;
        int[] g5 = g();
        ArrayList arrayList = new ArrayList();
        int length = g5.length;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = g5[i5];
            if (!(i6 != -1)) {
                break;
            }
            arrayList.add(Integer.valueOf(i6));
        }
        if (arrayList.isEmpty()) {
            return ProtectedSandApp.s("㎡");
        }
        m32 = j0.m3(arrayList, ProtectedSandApp.s("㎢"), null, null, 0, null, null, 62, null);
        return m32;
    }
}

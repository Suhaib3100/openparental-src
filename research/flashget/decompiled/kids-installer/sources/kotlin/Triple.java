package kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Serializable;

/* compiled from: Tuples.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00028\u0002¢\u0006\u0002\u0010\tJ\u000e\u0010\u000f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0010\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0011\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\u000bJ>\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u00012\b\b\u0002\u0010\b\u001a\u00028\u0002HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\b\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001c"}, d2 = {"Lkotlin/Triple;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "third", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSecond", "getThird", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.l1, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final /* data */ class Triple<A, B, C> implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    private final A f23659o;

    /* renamed from: p, reason: collision with root package name */
    private final B f23660p;

    /* renamed from: q, reason: collision with root package name */
    private final C f23661q;

    public Triple(A a6, B b6, C c6) {
        this.f23659o = a6;
        this.f23660p = b6;
        this.f23661q = c6;
    }

    public static Triple e(Triple triple, Object obj, Object obj2, Object obj3, int i5, Object obj4) {
        if ((i5 & 1) != 0) {
            obj = triple.f23659o;
        }
        if ((i5 & 2) != 0) {
            obj2 = triple.f23660p;
        }
        if ((i5 & 4) != 0) {
            obj3 = triple.f23661q;
        }
        triple.getClass();
        return new Triple(obj, obj2, obj3);
    }

    public final A a() {
        return this.f23659o;
    }

    public final B b() {
        return this.f23660p;
    }

    public final C c() {
        return this.f23661q;
    }

    @d5.d
    public final Triple<A, B, C> d(A a6, B b6, C c6) {
        return new Triple<>(a6, b6, c6);
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) other;
        return kotlin.jvm.internal.l0.g(this.f23659o, triple.f23659o) && kotlin.jvm.internal.l0.g(this.f23660p, triple.f23660p) && kotlin.jvm.internal.l0.g(this.f23661q, triple.f23661q);
    }

    public final A f() {
        return this.f23659o;
    }

    public final B g() {
        return this.f23660p;
    }

    public final C h() {
        return this.f23661q;
    }

    public int hashCode() {
        A a6 = this.f23659o;
        int hashCode = (a6 == null ? 0 : a6.hashCode()) * 31;
        B b6 = this.f23660p;
        int hashCode2 = (hashCode + (b6 == null ? 0 : b6.hashCode())) * 31;
        C c6 = this.f23661q;
        return hashCode2 + (c6 != null ? c6.hashCode() : 0);
    }

    @d5.d
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䆙"));
        sb.append(this.f23659o);
        String s5 = ProtectedSandApp.s("䆚");
        sb.append(s5);
        sb.append(this.f23660p);
        sb.append(s5);
        sb.append(this.f23661q);
        sb.append(')');
        return sb.toString();
    }
}

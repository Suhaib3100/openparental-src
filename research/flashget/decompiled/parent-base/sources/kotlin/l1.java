package kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;

/* compiled from: Tuples.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005B\u001f\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00028\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ@\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u00012\b\b\u0002\u0010\b\u001a\u00028\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0007\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\b\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001f\u0010\u000f¨\u0006 "}, d2 = {"Lkotlin/l1;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "third", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "a", "()Ljava/lang/Object;", "b", "c", "d", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/l1;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "f", "g", "h", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class l1<A, B, C> implements Serializable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final A first;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final B second;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C third;

    public l1(A a5, B b5, C c5) {
        this.first = a5;
        this.second = b5;
        this.third = c5;
    }

    public static l1 e(l1 l1Var, Object obj, Object obj2, Object obj3, int i4, Object obj4) {
        if ((i4 & 1) != 0) {
            obj = l1Var.first;
        }
        if ((i4 & 2) != 0) {
            obj2 = l1Var.second;
        }
        if ((i4 & 4) != 0) {
            obj3 = l1Var.third;
        }
        l1Var.getClass();
        return new l1(obj, obj2, obj3);
    }

    public final A a() {
        return this.first;
    }

    public final B b() {
        return this.second;
    }

    public final C c() {
        return this.third;
    }

    @fg.l
    public final l1<A, B, C> d(A first, B second, C third) {
        return new l1<>(first, second, third);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) other;
        return kotlin.jvm.internal.l0.g(this.first, l1Var.first) && kotlin.jvm.internal.l0.g(this.second, l1Var.second) && kotlin.jvm.internal.l0.g(this.third, l1Var.third);
    }

    public final A f() {
        return this.first;
    }

    public final B g() {
        return this.second;
    }

    public final C h() {
        return this.third;
    }

    public int hashCode() {
        A a5 = this.first;
        int hashCode = (a5 == null ? 0 : a5.hashCode()) * 31;
        B b5 = this.second;
        int hashCode2 = (hashCode + (b5 == null ? 0 : b5.hashCode())) * 31;
        C c5 = this.third;
        return hashCode2 + (c5 != null ? c5.hashCode() : 0);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("敻\u0001"));
        sb.append(this.first);
        String s4 = ProtectedSandApp.s("敼\u0001");
        sb.append(s4);
        sb.append(this.second);
        sb.append(s4);
        sb.append(this.third);
        sb.append(')');
        return sb.toString();
    }
}

package kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;

/* compiled from: Tuples.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004B\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ0\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0006\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001b\u0010\r¨\u0006\u001c"}, d2 = {"Lkotlin/q0;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "a", "()Ljava/lang/Object;", "b", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/q0;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "e", "f", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class q0<A, B> implements Serializable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final A first;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final B second;

    public q0(A a5, B b5) {
        this.first = a5;
        this.second = b5;
    }

    public static q0 d(q0 q0Var, Object obj, Object obj2, int i4, Object obj3) {
        if ((i4 & 1) != 0) {
            obj = q0Var.first;
        }
        if ((i4 & 2) != 0) {
            obj2 = q0Var.second;
        }
        q0Var.getClass();
        return new q0(obj, obj2);
    }

    public final A a() {
        return this.first;
    }

    public final B b() {
        return this.second;
    }

    @fg.l
    public final q0<A, B> c(A first, B second) {
        return new q0<>(first, second);
    }

    public final A e() {
        return this.first;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) other;
        return kotlin.jvm.internal.l0.g(this.first, q0Var.first) && kotlin.jvm.internal.l0.g(this.second, q0Var.second);
    }

    public final B f() {
        return this.second;
    }

    public int hashCode() {
        A a5 = this.first;
        int hashCode = (a5 == null ? 0 : a5.hashCode()) * 31;
        B b5 = this.second;
        return hashCode + (b5 != null ? b5.hashCode() : 0);
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("斖\u0001") + this.first + ProtectedSandApp.s("斗\u0001") + this.second + ')';
    }
}

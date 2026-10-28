package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: OpaqueKey.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/q2;", "", "", "key", "<init>", "(Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "b", "(Ljava/lang/String;)Landroidx/compose/runtime/q2;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class q2 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f16895b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String key;

    public q2(@fg.l String str) {
        this.key = str;
    }

    public static q2 c(q2 q2Var, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = q2Var.key;
        }
        q2Var.getClass();
        return new q2(str);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @fg.l
    public final q2 b(@fg.l String key) {
        return new q2(key);
    }

    @fg.l
    public final String d() {
        return this.key;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof q2) && kotlin.jvm.internal.l0.g(this.key, ((q2) other).key);
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    @fg.l
    public String toString() {
        return androidx.compose.foundation.layout.f3.a(new StringBuilder("OpaqueKey(key="), this.key, ')');
    }
}

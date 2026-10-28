package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: JoinedKey.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u001a\u0010\r¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/t1;", "", "left", "right", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "value", "", "g", "(Ljava/lang/Object;)I", "hashCode", "()I", "a", "()Ljava/lang/Object;", "b", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/t1;", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "e", "f", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class t1 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f17192c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Object left;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Object right;

    public t1(@fg.m Object obj, @fg.m Object obj2) {
        this.left = obj;
        this.right = obj2;
    }

    public static t1 d(t1 t1Var, Object obj, Object obj2, int i4, Object obj3) {
        if ((i4 & 1) != 0) {
            obj = t1Var.left;
        }
        if ((i4 & 2) != 0) {
            obj2 = t1Var.right;
        }
        t1Var.getClass();
        return new t1(obj, obj2);
    }

    private final int g(Object value) {
        if (value instanceof Enum) {
            return ((Enum) value).ordinal();
        }
        if (value != null) {
            return value.hashCode();
        }
        return 0;
    }

    @fg.m
    /* renamed from: a, reason: from getter */
    public final Object getLeft() {
        return this.left;
    }

    @fg.m
    /* renamed from: b, reason: from getter */
    public final Object getRight() {
        return this.right;
    }

    @fg.l
    public final t1 c(@fg.m Object left, @fg.m Object right) {
        return new t1(left, right);
    }

    @fg.m
    public final Object e() {
        return this.left;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) other;
        return kotlin.jvm.internal.l0.g(this.left, t1Var.left) && kotlin.jvm.internal.l0.g(this.right, t1Var.right);
    }

    @fg.m
    public final Object f() {
        return this.right;
    }

    public int hashCode() {
        return (g(this.left) * 31) + g(this.right);
    }

    @fg.l
    public String toString() {
        return "JoinedKey(left=" + this.left + ", right=" + this.right + ')';
    }
}

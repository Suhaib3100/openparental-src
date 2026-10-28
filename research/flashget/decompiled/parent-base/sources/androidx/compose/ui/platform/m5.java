package androidx.compose.ui.platform;

import kotlin.Metadata;

/* compiled from: InspectableValue.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/m5;", "", "", "name", "value", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "a", "()Ljava/lang/String;", "b", "()Ljava/lang/Object;", "c", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/compose/ui/platform/m5;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "Ljava/lang/Object;", "f", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class m5 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f20010c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Object value;

    public m5(@fg.l String str, @fg.m Object obj) {
        this.name = str;
        this.value = obj;
    }

    public static m5 d(m5 m5Var, String str, Object obj, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            str = m5Var.name;
        }
        if ((i4 & 2) != 0) {
            obj = m5Var.value;
        }
        m5Var.getClass();
        return new m5(str, obj);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @fg.m
    /* renamed from: b, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    @fg.l
    public final m5 c(@fg.l String name, @fg.m Object value) {
        return new m5(name, value);
    }

    @fg.l
    public final String e() {
        return this.name;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof m5)) {
            return false;
        }
        m5 m5Var = (m5) other;
        return kotlin.jvm.internal.l0.g(this.name, m5Var.name) && kotlin.jvm.internal.l0.g(this.value, m5Var.value);
    }

    @fg.m
    public final Object f() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        Object obj = this.value;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    @fg.l
    public String toString() {
        return "ValueElement(name=" + this.name + ", value=" + this.value + ')';
    }
}

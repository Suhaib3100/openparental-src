package androidx.content;

import android.os.Bundle;
import androidx.annotation.c1;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: NavArgument.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0019B3\b\u0000\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b\u0019\u0010#¨\u0006$"}, d2 = {"Landroidx/navigation/q;", "", "Landroidx/navigation/x0;", "type", "", "isNullable", "defaultValue", "defaultValuePresent", "<init>", "(Landroidx/navigation/x0;ZLjava/lang/Object;Z)V", "", "name", "Landroid/os/Bundle;", "bundle", "Lkotlin/k2;", "e", "(Ljava/lang/String;Landroid/os/Bundle;)V", "f", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroidx/navigation/x0;", "b", "()Landroidx/navigation/x0;", "Z", "d", "()Z", "c", "isDefaultValuePresent", "Ljava/lang/Object;", "()Ljava/lang/Object;", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final x0<Object> type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isNullable;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isDefaultValuePresent;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    private final Object defaultValue;

    /* compiled from: NavArgument.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/navigation/q$a;", "", "<init>", "()V", "T", "Landroidx/navigation/x0;", "type", "d", "(Landroidx/navigation/x0;)Landroidx/navigation/q$a;", "", "isNullable", "c", "(Z)Landroidx/navigation/q$a;", "defaultValue", "b", "(Ljava/lang/Object;)Landroidx/navigation/q$a;", "Landroidx/navigation/q;", "a", "()Landroidx/navigation/q;", "Landroidx/navigation/x0;", "Z", "Ljava/lang/Object;", "defaultValuePresent", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @m
        private x0<Object> type;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean isNullable;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @m
        private Object defaultValue;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean defaultValuePresent;

        @l
        public final q a() {
            x0<Object> x0Var = this.type;
            if (x0Var == null) {
                x0Var = x0.INSTANCE.c(this.defaultValue);
            }
            return new q(x0Var, this.isNullable, this.defaultValue, this.defaultValuePresent);
        }

        @l
        public final a b(@m Object defaultValue) {
            this.defaultValue = defaultValue;
            this.defaultValuePresent = true;
            return this;
        }

        @l
        public final a c(boolean isNullable) {
            this.isNullable = isNullable;
            return this;
        }

        @l
        public final <T> a d(@l x0<T> type) {
            l0.p(type, "type");
            this.type = type;
            return this;
        }
    }

    public q(@l x0<Object> type, boolean z4, @m Object obj, boolean z5) {
        l0.p(type, "type");
        if (!type.getIsNullableAllowed() && z4) {
            throw new IllegalArgumentException(l0.C(type.getName(), " does not allow nullable values").toString());
        }
        if (!z4 && z5 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + type.getName() + " has null value but is not nullable.").toString());
        }
        this.type = type;
        this.isNullable = z4;
        this.defaultValue = obj;
        this.isDefaultValuePresent = z5;
    }

    @m
    /* renamed from: a, reason: from getter */
    public final Object getDefaultValue() {
        return this.defaultValue;
    }

    @l
    public final x0<Object> b() {
        return this.type;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsDefaultValuePresent() {
        return this.isDefaultValuePresent;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsNullable() {
        return this.isNullable;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public final void e(@l String name, @l Bundle bundle) {
        l0.p(name, "name");
        l0.p(bundle, "bundle");
        if (this.isDefaultValuePresent) {
            this.type.i(bundle, name, this.defaultValue);
        }
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !l0.g(q.class, other.getClass())) {
            return false;
        }
        q qVar = (q) other;
        if (this.isNullable != qVar.isNullable || this.isDefaultValuePresent != qVar.isDefaultValuePresent || !l0.g(this.type, qVar.type)) {
            return false;
        }
        Object obj = this.defaultValue;
        return obj != null ? l0.g(obj, qVar.defaultValue) : qVar.defaultValue == null;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public final boolean f(@l String name, @l Bundle bundle) {
        l0.p(name, "name");
        l0.p(bundle, "bundle");
        if (!this.isNullable && bundle.containsKey(name) && bundle.get(name) == null) {
            return false;
        }
        try {
            this.type.b(bundle, name);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        int hashCode = ((((this.type.hashCode() * 31) + (this.isNullable ? 1 : 0)) * 31) + (this.isDefaultValuePresent ? 1 : 0)) * 31;
        Object obj = this.defaultValue;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }
}

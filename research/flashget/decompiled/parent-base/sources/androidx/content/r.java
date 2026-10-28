package androidx.content;

import androidx.content.q;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: NavDestinationBuilder.kt */
@h0
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u001c\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR*\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R.\u0010\u001b\u001a\u0004\u0018\u00010\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u000b\u0010\u0018\"\u0004\b\u0019\u0010\u001aR,\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\n2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/navigation/r;", "", "<init>", "()V", "Landroidx/navigation/q;", "a", "()Landroidx/navigation/q;", "Landroidx/navigation/q$a;", "Landroidx/navigation/q$a;", "builder", "Landroidx/navigation/x0;", "b", "Landroidx/navigation/x0;", "_type", "", "value", "c", "Z", "()Z", "f", "(Z)V", "nullable", "d", "Ljava/lang/Object;", "()Ljava/lang/Object;", "e", "(Ljava/lang/Object;)V", "defaultValue", "()Landroidx/navigation/x0;", "g", "(Landroidx/navigation/x0;)V", "type", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final q.a builder = new q.a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private x0<?> _type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean nullable;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    private Object defaultValue;

    @l
    public final q a() {
        return this.builder.a();
    }

    @m
    /* renamed from: b, reason: from getter */
    public final Object getDefaultValue() {
        return this.defaultValue;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getNullable() {
        return this.nullable;
    }

    @l
    public final x0<?> d() {
        x0<?> x0Var = this._type;
        if (x0Var != null) {
            return x0Var;
        }
        throw new IllegalStateException("NavType has not been set on this builder.");
    }

    public final void e(@m Object obj) {
        this.defaultValue = obj;
        this.builder.b(obj);
    }

    public final void f(boolean z4) {
        this.nullable = z4;
        this.builder.c(z4);
    }

    public final void g(@l x0<?> value) {
        l0.p(value, "value");
        this._type = value;
        this.builder.d(value);
    }
}

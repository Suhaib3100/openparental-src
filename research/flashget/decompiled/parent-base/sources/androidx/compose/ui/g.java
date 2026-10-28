package androidx.compose.ui;

import androidx.compose.foundation.layout.f3;
import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;

/* compiled from: Modifier.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\r\u0010\fJ#\u0010\u0011\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u001e\u0010!¨\u0006\""}, d2 = {"Landroidx/compose/ui/g;", "Landroidx/compose/ui/q;", "outer", "inner", "<init>", "(Landroidx/compose/ui/q;Landroidx/compose/ui/q;)V", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/q$c;", "operation", "I", "(Ljava/lang/Object;Lld/p;)Ljava/lang/Object;", "t", "Lkotlin/Function1;", "", "predicate", "y", "(Lld/l;)Z", "Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Landroidx/compose/ui/q;", "c", "()Landroidx/compose/ui/q;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g implements q {

    /* renamed from: d, reason: collision with root package name */
    public static final int f17603d = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q outer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q inner;

    /* compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "acc", "Landroidx/compose/ui/q$c;", "element", "a", "(Ljava/lang/String;Landroidx/compose/ui/q$c;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.p<String, q.c, String> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f17606b = new a(2);

        a() {
            super(2);
        }

        @Override // ld.p
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@fg.l String str, @fg.l q.c cVar) {
            if (str.length() == 0) {
                return cVar.toString();
            }
            return str + ", " + cVar;
        }
    }

    public g(@fg.l q qVar, @fg.l q qVar2) {
        this.outer = qVar;
        this.inner = qVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.q
    public <R> R I(R initial, @fg.l ld.p<? super R, ? super q.c, ? extends R> operation) {
        return (R) this.inner.I(this.outer.I(initial, operation), operation);
    }

    @Override // androidx.compose.ui.q
    public boolean Z(@fg.l ld.l<? super q.c, Boolean> predicate) {
        return this.outer.Z(predicate) && this.inner.Z(predicate);
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final q getInner() {
        return this.inner;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final q getOuter() {
        return this.outer;
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof g) {
            g gVar = (g) other;
            if (l0.g(this.outer, gVar.outer) && l0.g(this.inner, gVar.inner)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.inner.hashCode() * 31) + this.outer.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.q
    public <R> R t(R initial, @fg.l ld.p<? super q.c, ? super R, ? extends R> operation) {
        return (R) this.outer.t(this.inner.t(initial, operation), operation);
    }

    @fg.l
    public String toString() {
        return f3.a(new StringBuilder("["), (String) I("", a.f17606b), ']');
    }

    @Override // androidx.compose.ui.q
    public boolean y(@fg.l ld.l<? super q.c, Boolean> predicate) {
        return this.outer.y(predicate) || this.inner.y(predicate);
    }
}

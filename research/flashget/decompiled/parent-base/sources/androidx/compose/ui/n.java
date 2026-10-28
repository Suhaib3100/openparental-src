package androidx.compose.ui;

import androidx.compose.runtime.x4;
import androidx.compose.ui.platform.a2;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;

/* compiled from: ComposedModifier.kt */
@x4
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001BZ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n\u0012\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0002\b\r¢\u0006\u0002\b\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006\""}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/ui/h;", "", "fqName", "", "key1", "key2", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "Lkotlin/u;", "inspectorInfo", "Landroidx/compose/ui/q;", "Landroidx/compose/runtime/i;", "factory", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lld/l;Lld/q;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "f", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "g", "Ljava/lang/Object;", "m", "()Ljava/lang/Object;", "h", "n", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class n extends h {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String fqName;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Object key1;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Object key2;

    public n(@fg.l String str, @fg.m Object obj, @fg.m Object obj2, @fg.l ld.l<? super a2, k2> lVar, @fg.l ld.q<? super q, ? super androidx.compose.runtime.t, ? super Integer, ? extends q> qVar) {
        super(lVar, qVar);
        this.fqName = str;
        this.key1 = obj;
        this.key2 = obj2;
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof n) {
            n nVar = (n) other;
            if (l0.g(this.fqName, nVar.fqName) && l0.g(this.key1, nVar.key1) && l0.g(this.key2, nVar.key2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.fqName.hashCode() * 31;
        Object obj = this.key1;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.key2;
        return hashCode2 + (obj2 != null ? obj2.hashCode() : 0);
    }

    @fg.l
    /* renamed from: k, reason: from getter */
    public final String getFqName() {
        return this.fqName;
    }

    @fg.m
    /* renamed from: m, reason: from getter */
    public final Object getKey1() {
        return this.key1;
    }

    @fg.m
    /* renamed from: n, reason: from getter */
    public final Object getKey2() {
        return this.key2;
    }
}

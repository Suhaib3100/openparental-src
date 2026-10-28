package androidx.compose.ui;

import androidx.compose.runtime.x4;
import androidx.compose.ui.platform.a2;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;

/* compiled from: ComposedModifier.kt */
@x4
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001BP\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t\u0012\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0002\b\f¢\u0006\u0002\b\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/m;", "Landroidx/compose/ui/h;", "", "fqName", "", "key1", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "Lkotlin/u;", "inspectorInfo", "Landroidx/compose/ui/q;", "Landroidx/compose/runtime/i;", "factory", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Lld/l;Lld/q;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "f", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "g", "Ljava/lang/Object;", "m", "()Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class m extends h {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String fqName;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Object key1;

    public m(@fg.l String str, @fg.m Object obj, @fg.l ld.l<? super a2, k2> lVar, @fg.l ld.q<? super q, ? super androidx.compose.runtime.t, ? super Integer, ? extends q> qVar) {
        super(lVar, qVar);
        this.fqName = str;
        this.key1 = obj;
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof m) {
            m mVar = (m) other;
            if (l0.g(this.fqName, mVar.fqName) && l0.g(this.key1, mVar.key1)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.fqName.hashCode() * 31;
        Object obj = this.key1;
        return hashCode + (obj != null ? obj.hashCode() : 0);
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
}

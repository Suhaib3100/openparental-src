package androidx.compose.ui;

import androidx.compose.runtime.x4;
import androidx.compose.ui.platform.a2;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;

/* compiled from: ComposedModifier.kt */
@x4
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001BX\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n\u0012\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0002\b\r¢\u0006\u0002\b\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR!\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Landroidx/compose/ui/p;", "Landroidx/compose/ui/h;", "", "fqName", "", "", "keys", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "Lkotlin/u;", "inspectorInfo", "Landroidx/compose/ui/q;", "Landroidx/compose/runtime/i;", "factory", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;Lld/l;Lld/q;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "f", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "g", "[Ljava/lang/Object;", "m", "()[Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class p extends h {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String fqName;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object[] keys;

    public p(@fg.l String str, @fg.l Object[] objArr, @fg.l ld.l<? super a2, k2> lVar, @fg.l ld.q<? super q, ? super androidx.compose.runtime.t, ? super Integer, ? extends q> qVar) {
        super(lVar, qVar);
        this.fqName = str;
        this.keys = objArr;
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof p) {
            p pVar = (p) other;
            if (l0.g(this.fqName, pVar.fqName) && Arrays.equals(this.keys, pVar.keys)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.keys) + (this.fqName.hashCode() * 31);
    }

    @fg.l
    /* renamed from: k, reason: from getter */
    public final String getFqName() {
        return this.fqName;
    }

    @fg.l
    /* renamed from: m, reason: from getter */
    public final Object[] getKeys() {
        return this.keys;
    }
}

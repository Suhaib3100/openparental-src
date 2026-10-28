package androidx.compose.ui.modifier;

import androidx.compose.runtime.x4;
import androidx.compose.ui.platform.a2;
import androidx.compose.ui.platform.b2;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;

/* compiled from: ModifierLocalConsumer.kt */
@x4
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R(\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/modifier/e;", "Landroidx/compose/ui/modifier/d;", "Landroidx/compose/ui/platform/b2;", "Lkotlin/Function1;", "Landroidx/compose/ui/modifier/n;", "Lkotlin/k2;", "Lkotlin/u;", "consumer", "Landroidx/compose/ui/platform/a2;", "debugInspectorInfo", "<init>", "(Lld/l;Lld/l;)V", "scope", "e4", "(Landroidx/compose/ui/modifier/n;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "e", "Lld/l;", "j", "()Lld/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class e extends b2 implements d {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<n, k2> consumer;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@fg.l ld.l<? super n, k2> lVar, @fg.l ld.l<? super a2, k2> lVar2) {
        super(lVar2);
        this.consumer = lVar;
    }

    @Override // androidx.compose.ui.modifier.d
    public void e4(@fg.l n scope) {
        this.consumer.invoke(scope);
    }

    public boolean equals(@fg.m Object other) {
        return (other instanceof e) && l0.g(((e) other).consumer, this.consumer);
    }

    public int hashCode() {
        return this.consumer.hashCode();
    }

    @fg.l
    public final ld.l<n, k2> j() {
        return this.consumer;
    }
}

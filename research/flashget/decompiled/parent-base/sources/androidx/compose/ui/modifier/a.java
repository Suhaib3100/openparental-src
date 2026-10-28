package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.u;
import kotlin.Metadata;

/* compiled from: ModifierLocalModifierNode.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0090\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0010\u001a\u00020\u000f2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0090\u0002¢\u0006\u0004\b\u0010\u0010\u0011R&\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0005¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/modifier/a;", "Landroidx/compose/ui/modifier/i;", "Landroidx/compose/ui/modifier/l;", "element", "<init>", "(Landroidx/compose/ui/modifier/l;)V", "T", "Landroidx/compose/ui/modifier/c;", "key", "value", "Lkotlin/k2;", "c", "(Landroidx/compose/ui/modifier/c;Ljava/lang/Object;)V", "b", "(Landroidx/compose/ui/modifier/c;)Ljava/lang/Object;", "", "a", "(Landroidx/compose/ui/modifier/c;)Z", "Landroidx/compose/ui/modifier/l;", "d", "()Landroidx/compose/ui/modifier/l;", "e", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: c, reason: collision with root package name */
    public static final int f19125c = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private l<?> element;

    public a(@fg.l l<?> lVar) {
        super(null);
        this.element = lVar;
    }

    @Override // androidx.compose.ui.modifier.i
    public boolean a(@fg.l c<?> key) {
        return key == this.element.getKey();
    }

    @Override // androidx.compose.ui.modifier.i
    @fg.m
    public <T> T b(@fg.l c<T> key) {
        if (key == this.element.getKey()) {
            return (T) this.element.getValue();
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // androidx.compose.ui.modifier.i
    public <T> void c(@fg.l c<T> key, T value) {
        throw new IllegalStateException("Set is not allowed on a backwards compat provider");
    }

    @fg.l
    public final l<?> d() {
        return this.element;
    }

    public final void e(@fg.l l<?> lVar) {
        this.element = lVar;
    }
}

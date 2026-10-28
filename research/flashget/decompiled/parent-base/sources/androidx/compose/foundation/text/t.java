package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.k2;

/* compiled from: InlineTextContent.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR(\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/text/t;", "", "Landroidx/compose/ui/text/a0;", "placeholder", "Lkotlin/Function1;", "", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "children", "<init>", "(Landroidx/compose/ui/text/a0;Lld/q;)V", "a", "Landroidx/compose/ui/text/a0;", "b", "()Landroidx/compose/ui/text/a0;", "Lld/q;", "()Lld/q;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t {

    /* renamed from: c, reason: collision with root package name */
    public static final int f8249c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.a0 placeholder;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.q<String, androidx.compose.runtime.t, Integer, k2> children;

    /* JADX WARN: Multi-variable type inference failed */
    public t(@fg.l androidx.compose.ui.text.a0 a0Var, @fg.l ld.q<? super String, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar) {
        this.placeholder = a0Var;
        this.children = qVar;
    }

    @fg.l
    public final ld.q<String, androidx.compose.runtime.t, Integer, k2> a() {
        return this.children;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final androidx.compose.ui.text.a0 getPlaceholder() {
        return this.placeholder;
    }
}

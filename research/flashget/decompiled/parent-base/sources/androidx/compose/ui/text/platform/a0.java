package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.b5;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: AndroidParagraphIntrinsics.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/platform/a0;", "", "Landroidx/compose/runtime/b5;", "resolveResult", "next", "<init>", "(Landroidx/compose/runtime/b5;Landroidx/compose/ui/text/platform/a0;)V", "a", "Landroidx/compose/runtime/b5;", "b", "Landroidx/compose/ui/text/platform/a0;", "c", "Ljava/lang/Object;", "()Ljava/lang/Object;", "initial", "Landroid/graphics/Typeface;", "()Landroid/graphics/Typeface;", "typeface", "", "()Z", "isStaleResolvedFont", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class a0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b5<Object> resolveResult;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final a0 next;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object initial;

    public a0(@fg.l b5<? extends Object> b5Var, @fg.m a0 a0Var) {
        this.resolveResult = b5Var;
        this.next = a0Var;
        this.initial = b5Var.getValue();
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final Object getInitial() {
        return this.initial;
    }

    @fg.l
    public final Typeface b() {
        Object obj = this.initial;
        l0.n(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    public final boolean c() {
        a0 a0Var;
        return this.resolveResult.getValue() != this.initial || ((a0Var = this.next) != null && a0Var.c());
    }

    public /* synthetic */ a0(b5 b5Var, a0 a0Var, int i4, kotlin.jvm.internal.w wVar) {
        this(b5Var, (i4 & 2) != 0 ? null : a0Var);
    }
}

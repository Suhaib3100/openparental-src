package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.Metadata;

/* compiled from: ComposeView.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0013\u001a\u00020\n2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0002\b\u0011¢\u0006\u0004\b\u0013\u0010\u0014R'\u0010\u0012\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010¢\u0006\u0002\b\u00110\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R*\u0010 \u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0014@RX\u0094\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/k2;", "e", "(Landroidx/compose/runtime/t;I)V", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Lkotlin/Function0;", "Landroidx/compose/runtime/i;", "content", "z", "(Lld/p;)V", "Landroidx/compose/runtime/k2;", "k", "Landroidx/compose/runtime/k2;", "", "<set-?>", "l", "Z", "m", "()Z", "y", "()V", "shouldCreateCompositionOnAttachedToWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposeView extends AbstractComposeView {

    /* renamed from: m, reason: collision with root package name */
    public static final int f19682m = 8;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2<ld.p<androidx.compose.runtime.t, Integer, kotlin.k2>> content;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean shouldCreateCompositionOnAttachedToWindow;

    /* compiled from: ComposeView.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f19686c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i4) {
            super(2);
            this.f19686c = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            ComposeView.this.e(tVar, androidx.compose.runtime.g3.b(this.f19686c | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    @kd.j
    public ComposeView(@fg.l Context context) {
        this(context, null, 0, 6, null);
    }

    protected static /* synthetic */ void y() {
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @androidx.compose.runtime.i
    public void e(@fg.m androidx.compose.runtime.t tVar, int i4) {
        androidx.compose.runtime.t o4 = tVar.o(420213850);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(420213850, i4, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:426)");
        }
        ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> value = this.content.getValue();
        if (value != null) {
            value.invoke(o4, 0);
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new a(i4));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @fg.l
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    /* renamed from: m, reason: from getter */
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    public final void z(@fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> content) {
        this.shouldCreateCompositionOnAttachedToWindow = true;
        this.content.setValue(content);
        if (isAttachedToWindow()) {
            h();
        }
    }

    @kd.j
    public ComposeView(@fg.l Context context, @fg.m AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i4, int i5, kotlin.jvm.internal.w wVar) {
        this(context, (i5 & 2) != 0 ? null : attributeSet, (i5 & 4) != 0 ? 0 : i4);
    }

    @kd.j
    public ComposeView(@fg.l Context context, @fg.m AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        androidx.compose.runtime.k2<ld.p<androidx.compose.runtime.t, Integer, kotlin.k2>> g4;
        g4 = androidx.compose.runtime.t4.g(null, null, 2, null);
        this.content = g4;
    }
}

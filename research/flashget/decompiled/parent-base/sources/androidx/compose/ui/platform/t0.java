package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import kotlin.Metadata;

/* compiled from: AndroidTextToolbar.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JW\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R$\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/t0;", "Landroidx/compose/ui/platform/i5;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Li0/i;", "rect", "Lkotlin/Function0;", "Lkotlin/k2;", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "c", "(Li0/i;Lld/a;Lld/a;Lld/a;Lld/a;)V", "a", "()V", "Landroid/view/View;", "Landroid/view/ActionMode;", "b", "Landroid/view/ActionMode;", "actionMode", "Lo0/d;", "Lo0/d;", "textActionModeCallback", "Landroidx/compose/ui/platform/k5;", "<set-?>", "d", "Landroidx/compose/ui/platform/k5;", "getStatus", "()Landroidx/compose/ui/platform/k5;", "status", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t0 implements i5 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f20133e = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final View view;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ActionMode actionMode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final o0.d textActionModeCallback = new o0.d(new a(), null, null, null, null, null, 62, null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private k5 status = k5.Hidden;

    /* compiled from: AndroidTextToolbar.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {
        a() {
            super(0);
        }

        public final void a() {
            t0.this.actionMode = null;
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    public t0(@fg.l View view) {
        this.view = view;
    }

    @Override // androidx.compose.ui.platform.i5
    public void a() {
        this.status = k5.Hidden;
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.actionMode = null;
    }

    @Override // androidx.compose.ui.platform.i5
    public void c(@fg.l i0.i rect, @fg.m ld.a<kotlin.k2> onCopyRequested, @fg.m ld.a<kotlin.k2> onPasteRequested, @fg.m ld.a<kotlin.k2> onCutRequested, @fg.m ld.a<kotlin.k2> onSelectAllRequested) {
        this.textActionModeCallback.q(rect);
        this.textActionModeCallback.m(onCopyRequested);
        this.textActionModeCallback.n(onCutRequested);
        this.textActionModeCallback.o(onPasteRequested);
        this.textActionModeCallback.p(onSelectAllRequested);
        ActionMode actionMode = this.actionMode;
        if (actionMode == null) {
            this.status = k5.Shown;
            this.actionMode = j5.f19953a.b(this.view, new o0.a(this.textActionModeCallback), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }

    @Override // androidx.compose.ui.platform.i5
    @fg.l
    public k5 getStatus() {
        return this.status;
    }
}

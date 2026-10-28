package androidx.compose.ui.focus;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: FocusRestorer.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\bR \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\u00138\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/focus/i0;", "Landroidx/compose/ui/focus/w;", "Landroidx/compose/ui/focus/e0;", "Landroidx/compose/ui/q$d;", "Lkotlin/Function0;", "Landroidx/compose/ui/focus/a0;", "onRestoreFailed", "<init>", "(Lld/a;)V", "Landroidx/compose/ui/focus/t;", "focusProperties", "Lkotlin/k2;", "V3", "(Landroidx/compose/ui/focus/t;)V", "p", "Lld/a;", "z7", "()Lld/a;", "A7", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/f;", "q", "Lld/l;", "onExit", "r", "y7", "()V", "onEnter", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i0 extends q.d implements w, e0 {

    /* renamed from: s, reason: collision with root package name */
    public static final int f17539s = 8;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.a<a0> onRestoreFailed;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<f, a0> onExit = new b();

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<f, a0> onEnter = new a();

    /* compiled from: FocusRestorer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/f;", "it", "Landroidx/compose/ui/focus/a0;", "a", "(I)Landroidx/compose/ui/focus/a0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<f, a0> {
        a() {
            super(1);
        }

        @fg.l
        public final a0 a(int i4) {
            a0 invoke;
            if (f0.d(i0.this)) {
                a0.INSTANCE.getClass();
                return a0.f17516e;
            }
            ld.a<a0> z7 = i0.this.z7();
            if (z7 != null && (invoke = z7.invoke()) != null) {
                return invoke;
            }
            a0.INSTANCE.getClass();
            return a0.f17515d;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ a0 invoke(f fVar) {
            return a(fVar.getValue());
        }
    }

    /* compiled from: FocusRestorer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/f;", "it", "Landroidx/compose/ui/focus/a0;", "a", "(I)Landroidx/compose/ui/focus/a0;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<f, a0> {
        b() {
            super(1);
        }

        @fg.l
        public final a0 a(int i4) {
            f0.e(i0.this);
            a0.INSTANCE.getClass();
            return a0.f17515d;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ a0 invoke(f fVar) {
            return a(fVar.getValue());
        }
    }

    public i0(@fg.m ld.a<a0> aVar) {
        this.onRestoreFailed = aVar;
    }

    private static /* synthetic */ void y7() {
    }

    public final void A7(@fg.m ld.a<a0> aVar) {
        this.onRestoreFailed = aVar;
    }

    @Override // androidx.compose.ui.focus.w
    public void V3(@fg.l t focusProperties) {
        focusProperties.l(this.onEnter);
        focusProperties.f(this.onExit);
    }

    @fg.m
    public final ld.a<a0> z7() {
        return this.onRestoreFailed;
    }
}

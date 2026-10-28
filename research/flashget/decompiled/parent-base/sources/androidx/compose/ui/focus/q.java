package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.k2;
import kotlin.x0;

/* compiled from: FocusOrderModifier.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a,\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a4\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/q;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/o;", "Lkotlin/k2;", "Lkotlin/u;", "focusOrderReceiver", "c", "(Landroidx/compose/ui/q;Lld/l;)Landroidx/compose/ui/q;", "Landroidx/compose/ui/focus/a0;", "focusRequester", "a", "(Landroidx/compose/ui/q;Landroidx/compose/ui/focus/a0;)Landroidx/compose/ui/q;", "b", "(Landroidx/compose/ui/q;Landroidx/compose/ui/focus/a0;Lld/l;)Landroidx/compose/ui/q;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q {

    /* compiled from: FocusOrderModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/focus/t;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/focus/t;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<t, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f17564b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r rVar) {
            super(1);
            this.f17564b = rVar;
        }

        public final void a(@fg.l t tVar) {
            this.f17564b.a(tVar);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(t tVar) {
            a(tVar);
            return k2.f75408a;
        }
    }

    /* compiled from: FocusOrderModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/focus/t;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/focus/t;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<t, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f17565b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(r rVar) {
            super(1);
            this.f17565b = rVar;
        }

        public final void a(@fg.l t tVar) {
            this.f17565b.a(tVar);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(t tVar) {
            a(tVar);
            return k2.f75408a;
        }
    }

    @fg.l
    @kotlin.k(message = "Use focusRequester() instead", replaceWith = @x0(expression = "this.focusRequester(focusRequester)", imports = {"androidx.compose.ui.focus.focusRequester"}))
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.l a0 a0Var) {
        return d0.a(qVar, a0Var);
    }

    @fg.l
    @kotlin.k(message = "Use focusProperties() and focusRequester() instead", replaceWith = @x0(expression = "this.focusRequester(focusRequester).focusProperties(focusOrderReceiver)", imports = {"androidx.compose.ui.focus.focusProperties, androidx.compose.ui.focus.focusRequester"}))
    public static final androidx.compose.ui.q b(@fg.l androidx.compose.ui.q qVar, @fg.l a0 a0Var, @fg.l ld.l<? super o, k2> lVar) {
        return v.a(d0.a(qVar, a0Var), new b(new r(lVar)));
    }

    @fg.l
    @kotlin.k(message = "Use focusProperties() instead", replaceWith = @x0(expression = "this.focusProperties(focusOrderReceiver)", imports = {"androidx.compose.ui.focus.focusProperties"}))
    public static final androidx.compose.ui.q c(@fg.l androidx.compose.ui.q qVar, @fg.l ld.l<? super o, k2> lVar) {
        return v.a(qVar, new a(new r(lVar)));
    }
}

package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.q;
import kotlin.Metadata;

/* compiled from: SelectionAdjustment.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/w;", "", "Landroidx/compose/foundation/text/selection/d0;", "layout", "Landroidx/compose/foundation/text/selection/q;", "a", "(Landroidx/compose/foundation/text/selection/d0;)Landroidx/compose/foundation/text/selection/q;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f8165a;

    /* compiled from: SelectionAdjustment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/text/selection/w$a;", "", "<init>", "()V", "Landroidx/compose/foundation/text/selection/w;", "b", "Landroidx/compose/foundation/text/selection/w;", "m", "()Landroidx/compose/foundation/text/selection/w;", "None", "c", "k", "Character", "d", "o", "Word", "e", "n", "Paragraph", "f", "l", "CharacterWithWordAccelerate", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.w$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f8165a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final w None = new r();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final w Character = new s();

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final w Word = new t();

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final w Paragraph = new u();

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final w CharacterWithWordAccelerate = new v();

        /* compiled from: SelectionAdjustment.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/text/selection/p;", "", "it", "Landroidx/compose/ui/text/t0;", "a", "(Landroidx/compose/foundation/text/selection/p;I)J"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text.selection.w$a$a, reason: collision with other inner class name */
        static final class C0162a implements c {

            /* renamed from: a, reason: collision with root package name */
            public static final C0162a f8171a = new C0162a();

            C0162a() {
            }

            @Override // androidx.compose.foundation.text.selection.c
            public final long a(@fg.l p pVar, int i4) {
                return androidx.compose.foundation.text.j0.c(pVar.c(), i4);
            }
        }

        /* compiled from: SelectionAdjustment.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/text/selection/p;", "", "it", "Landroidx/compose/ui/text/t0;", "a", "(Landroidx/compose/foundation/text/selection/p;I)J"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text.selection.w$a$b */
        static final class b implements c {

            /* renamed from: a, reason: collision with root package name */
            public static final b f8172a = new b();

            b() {
            }

            @Override // androidx.compose.foundation.text.selection.c
            public final long a(@fg.l p pVar, int i4) {
                return pVar.getTextLayoutResult().C(i4);
            }
        }

        private Companion() {
        }

        public static q a(d0 d0Var) {
            q e4;
            e4 = x.e(d0Var, b.f8172a);
            return e4;
        }

        public static q b(d0 d0Var) {
            q e4;
            e4 = x.e(d0Var, C0162a.f8171a);
            return e4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q f(d0 d0Var) {
            return x.h(None.a(d0Var), d0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q g(d0 d0Var) {
            q.a f4;
            q.a l4;
            q.a h4;
            q.a aVar;
            q g4 = d0Var.g();
            if (g4 == null) {
                return Word.a(d0Var);
            }
            if (d0Var.a()) {
                f4 = g4.h();
                l4 = x.l(d0Var, d0Var.l(), f4);
                aVar = g4.f();
                h4 = l4;
            } else {
                f4 = g4.f();
                l4 = x.l(d0Var, d0Var.j(), f4);
                h4 = g4.h();
                aVar = l4;
            }
            if (kotlin.jvm.internal.l0.g(l4, f4)) {
                return g4;
            }
            return x.h(new q(h4, aVar, d0Var.f() == e.CROSSED || (d0Var.f() == e.COLLAPSED && h4.g() > aVar.g())), d0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q h(d0 d0Var) {
            return new q(d0Var.l().a(d0Var.l().getRawStartHandleOffset()), d0Var.j().a(d0Var.j().getRawEndHandleOffset()), d0Var.f() == e.CROSSED);
        }

        private static final q i(d0 d0Var) {
            q e4;
            e4 = x.e(d0Var, C0162a.f8171a);
            return e4;
        }

        private static final q j(d0 d0Var) {
            q e4;
            e4 = x.e(d0Var, b.f8172a);
            return e4;
        }

        @fg.l
        public final w k() {
            return Character;
        }

        @fg.l
        public final w l() {
            return CharacterWithWordAccelerate;
        }

        @fg.l
        public final w m() {
            return None;
        }

        @fg.l
        public final w n() {
            return Paragraph;
        }

        @fg.l
        public final w o() {
            return Word;
        }
    }

    @fg.l
    q a(@fg.l d0 layout);
}

package androidx.compose.ui.focus;

import kotlin.Metadata;

/* compiled from: FocusProperties.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b \bf\u0018\u00002\u00020\u0001RB\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028W@WX\u0097\u000e¢\u0006\u0012\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tRB\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028W@WX\u0097\u000e¢\u0006\u0012\u0012\u0004\b\u000f\u0010\u000b\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR\u001c\u0010\u0016\u001a\u00020\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR$\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR$\u0010$\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR$\u0010'\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR$\u0010*\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001aR$\u0010-\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR$\u00100\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b.\u0010\u0018\"\u0004\b/\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00061À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/t;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/f;", "Landroidx/compose/ui/focus/a0;", "<anonymous parameter 0>", "n", "()Lld/l;", "l", "(Lld/l;)V", "v", "()V", "enter", "h", "f", "w", "exit", "", "t", "()Z", "m", "(Z)V", "canFocus", "getNext", "()Landroidx/compose/ui/focus/a0;", "y", "(Landroidx/compose/ui/focus/a0;)V", "next", "u", "x", "previous", "g", "j", "up", "k", "o", "down", "d", "q", "left", "e", "r", "right", "c", "s", "start", "i", "p", "end", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface t {

    /* compiled from: FocusProperties.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/f;", "it", "Landroidx/compose/ui/focus/a0;", "a", "(I)Landroidx/compose/ui/focus/a0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<f, a0> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f17578b = new a(1);

        a() {
            super(1);
        }

        @fg.l
        public final a0 a(int i4) {
            a0.INSTANCE.getClass();
            return a0.f17515d;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ a0 invoke(f fVar) {
            return a(fVar.getValue());
        }
    }

    /* compiled from: FocusProperties.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/f;", "it", "Landroidx/compose/ui/focus/a0;", "a", "(I)Landroidx/compose/ui/focus/a0;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<f, a0> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f17579b = new b(1);

        b() {
            super(1);
        }

        @fg.l
        public final a0 a(int i4) {
            a0.INSTANCE.getClass();
            return a0.f17515d;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ a0 invoke(f fVar) {
            return a(fVar.getValue());
        }
    }

    @androidx.compose.ui.k
    static /* synthetic */ void v() {
    }

    @androidx.compose.ui.k
    static /* synthetic */ void w() {
    }

    @fg.l
    default a0 c() {
        a0.INSTANCE.getClass();
        return a0.f17515d;
    }

    @fg.l
    default a0 d() {
        a0.INSTANCE.getClass();
        return a0.f17515d;
    }

    @fg.l
    default a0 e() {
        a0.INSTANCE.getClass();
        return a0.f17515d;
    }

    @androidx.compose.ui.k
    default void f(@fg.l ld.l<? super f, a0> lVar) {
    }

    @fg.l
    default a0 g() {
        a0.INSTANCE.getClass();
        return a0.f17515d;
    }

    @fg.l
    default a0 getNext() {
        a0.INSTANCE.getClass();
        return a0.f17515d;
    }

    @fg.l
    @androidx.compose.ui.k
    default ld.l<f, a0> h() {
        return b.f17579b;
    }

    @fg.l
    default a0 i() {
        a0.INSTANCE.getClass();
        return a0.f17515d;
    }

    default void j(@fg.l a0 a0Var) {
    }

    @fg.l
    default a0 k() {
        a0.INSTANCE.getClass();
        return a0.f17515d;
    }

    @androidx.compose.ui.k
    default void l(@fg.l ld.l<? super f, a0> lVar) {
    }

    void m(boolean z4);

    @fg.l
    @androidx.compose.ui.k
    default ld.l<f, a0> n() {
        return a.f17578b;
    }

    default void o(@fg.l a0 a0Var) {
    }

    default void p(@fg.l a0 a0Var) {
    }

    default void q(@fg.l a0 a0Var) {
    }

    default void r(@fg.l a0 a0Var) {
    }

    default void s(@fg.l a0 a0Var) {
    }

    boolean t();

    @fg.l
    default a0 u() {
        a0.INSTANCE.getClass();
        return a0.f17515d;
    }

    default void x(@fg.l a0 a0Var) {
    }

    default void y(@fg.l a0 a0Var) {
    }
}

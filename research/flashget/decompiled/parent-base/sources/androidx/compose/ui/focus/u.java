package androidx.compose.ui.focus;

import androidx.compose.ui.focus.a0;
import kotlin.Metadata;

/* compiled from: FocusProperties.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\"\u0010\u001b\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\"\u0010\u001f\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\"\u0010\"\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010\u000e\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b!\u0010\u0012R\"\u0010$\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b#\u0010\u0012R\"\u0010'\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b&\u0010\u0012R\"\u0010*\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010\u000e\u001a\u0004\b(\u0010\u0010\"\u0004\b)\u0010\u0012R4\u00103\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\f0+8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010-\u0012\u0004\b2\u0010\u0003\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R4\u00105\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\f0+8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010-\u0012\u0004\b4\u0010\u0003\u001a\u0004\b%\u0010/\"\u0004\b \u00101¨\u00066"}, d2 = {"Landroidx/compose/ui/focus/u;", "Landroidx/compose/ui/focus/t;", "<init>", "()V", "", "a", "Z", "t", "()Z", "m", "(Z)V", "canFocus", "Landroidx/compose/ui/focus/a0;", "b", "Landroidx/compose/ui/focus/a0;", "getNext", "()Landroidx/compose/ui/focus/a0;", "y", "(Landroidx/compose/ui/focus/a0;)V", "next", "c", "u", "x", "previous", "d", "g", "j", "up", "e", "k", "o", "down", "f", "q", "left", "r", "right", "h", "s", "start", "i", "p", "end", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/f;", "Lld/l;", "n", "()Lld/l;", "l", "(Lld/l;)V", "v", "enter", "w", "exit", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u implements t {

    /* renamed from: l, reason: collision with root package name */
    public static final int f17587l = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean canFocus = true;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private a0 next;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private a0 previous;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private a0 up;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private a0 down;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private a0 left;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private a0 right;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private a0 start;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private a0 end;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super f, a0> enter;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super f, a0> exit;

    /* compiled from: FocusProperties.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/f;", "it", "Landroidx/compose/ui/focus/a0;", "a", "(I)Landroidx/compose/ui/focus/a0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<f, a0> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f17599b = new a(1);

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
        public static final b f17600b = new b(1);

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

    public u() {
        a0.Companion companion = a0.INSTANCE;
        companion.getClass();
        this.next = a0.f17515d;
        companion.getClass();
        this.previous = a0.f17515d;
        companion.getClass();
        this.up = a0.f17515d;
        companion.getClass();
        this.down = a0.f17515d;
        companion.getClass();
        this.left = a0.f17515d;
        companion.getClass();
        this.right = a0.f17515d;
        companion.getClass();
        this.start = a0.f17515d;
        companion.getClass();
        this.end = a0.f17515d;
        this.enter = a.f17599b;
        this.exit = b.f17600b;
    }

    public static /* synthetic */ void v() {
    }

    public static /* synthetic */ void w() {
    }

    @Override // androidx.compose.ui.focus.t
    @fg.l
    /* renamed from: c, reason: from getter */
    public a0 getStart() {
        return this.start;
    }

    @Override // androidx.compose.ui.focus.t
    @fg.l
    /* renamed from: d, reason: from getter */
    public a0 getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.focus.t
    @fg.l
    /* renamed from: e, reason: from getter */
    public a0 getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.focus.t
    public void f(@fg.l ld.l<? super f, a0> lVar) {
        this.exit = lVar;
    }

    @Override // androidx.compose.ui.focus.t
    @fg.l
    /* renamed from: g, reason: from getter */
    public a0 getUp() {
        return this.up;
    }

    @Override // androidx.compose.ui.focus.t
    @fg.l
    public a0 getNext() {
        return this.next;
    }

    @Override // androidx.compose.ui.focus.t
    @fg.l
    public ld.l<f, a0> h() {
        return this.exit;
    }

    @Override // androidx.compose.ui.focus.t
    @fg.l
    /* renamed from: i, reason: from getter */
    public a0 getEnd() {
        return this.end;
    }

    @Override // androidx.compose.ui.focus.t
    public void j(@fg.l a0 a0Var) {
        this.up = a0Var;
    }

    @Override // androidx.compose.ui.focus.t
    @fg.l
    /* renamed from: k, reason: from getter */
    public a0 getDown() {
        return this.down;
    }

    @Override // androidx.compose.ui.focus.t
    public void l(@fg.l ld.l<? super f, a0> lVar) {
        this.enter = lVar;
    }

    @Override // androidx.compose.ui.focus.t
    public void m(boolean z4) {
        this.canFocus = z4;
    }

    @Override // androidx.compose.ui.focus.t
    @fg.l
    public ld.l<f, a0> n() {
        return this.enter;
    }

    @Override // androidx.compose.ui.focus.t
    public void o(@fg.l a0 a0Var) {
        this.down = a0Var;
    }

    @Override // androidx.compose.ui.focus.t
    public void p(@fg.l a0 a0Var) {
        this.end = a0Var;
    }

    @Override // androidx.compose.ui.focus.t
    public void q(@fg.l a0 a0Var) {
        this.left = a0Var;
    }

    @Override // androidx.compose.ui.focus.t
    public void r(@fg.l a0 a0Var) {
        this.right = a0Var;
    }

    @Override // androidx.compose.ui.focus.t
    public void s(@fg.l a0 a0Var) {
        this.start = a0Var;
    }

    @Override // androidx.compose.ui.focus.t
    /* renamed from: t, reason: from getter */
    public boolean getCanFocus() {
        return this.canFocus;
    }

    @Override // androidx.compose.ui.focus.t
    @fg.l
    /* renamed from: u, reason: from getter */
    public a0 getPrevious() {
        return this.previous;
    }

    @Override // androidx.compose.ui.focus.t
    public void x(@fg.l a0 a0Var) {
        this.previous = a0Var;
    }

    @Override // androidx.compose.ui.focus.t
    public void y(@fg.l a0 a0Var) {
        this.next = a0Var;
    }
}

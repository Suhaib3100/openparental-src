package androidx.compose.foundation.text;

import android.view.KeyEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: TextFieldKeyInput.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0000\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\u0016*\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u001c\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\"H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&J(\u0010*\u001a\u00020\u00162\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b(H\u0002¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"ø\u0001\u0000¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010;\u001a\u0004\b>\u0010=R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b*\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b<\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010HR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010IR \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010JR\u001a\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b>\u0010K\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, d2 = {"Landroidx/compose/foundation/text/u0;", "", "Landroidx/compose/foundation/text/c1;", "state", "Landroidx/compose/foundation/text/selection/s0;", "selectionManager", "Landroidx/compose/ui/text/input/z0;", "value", "", "editable", "singleLine", "Landroidx/compose/foundation/text/selection/w0;", "preparedSelectionState", "Landroidx/compose/ui/text/input/p0;", "offsetMapping", "Landroidx/compose/foundation/text/j1;", "undoManager", "Landroidx/compose/foundation/text/l;", "keyCombiner", "Landroidx/compose/foundation/text/y;", "keyMapping", "Lkotlin/Function1;", "Lkotlin/k2;", "onValueChange", "Landroidx/compose/ui/text/input/y;", "imeAction", "<init>", "(Landroidx/compose/foundation/text/c1;Landroidx/compose/foundation/text/selection/s0;Landroidx/compose/ui/text/input/z0;ZZLandroidx/compose/foundation/text/selection/w0;Landroidx/compose/ui/text/input/p0;Landroidx/compose/foundation/text/j1;Landroidx/compose/foundation/text/l;Landroidx/compose/foundation/text/y;Lld/l;ILkotlin/jvm/internal/w;)V", "", "Landroidx/compose/ui/text/input/p;", "f", "(Ljava/util/List;)V", "e", "(Landroidx/compose/ui/text/input/p;)V", "Landroidx/compose/ui/input/key/c;", "event", "Landroidx/compose/ui/text/input/b;", "q", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/text/input/b;", "Landroidx/compose/foundation/text/selection/r0;", "Lkotlin/u;", "block", "g", "(Lld/l;)V", "p", "(Landroid/view/KeyEvent;)Z", "a", "Landroidx/compose/foundation/text/c1;", "m", "()Landroidx/compose/foundation/text/c1;", "b", "Landroidx/compose/foundation/text/selection/s0;", "k", "()Landroidx/compose/foundation/text/selection/s0;", "c", "Landroidx/compose/ui/text/input/z0;", "o", "()Landroidx/compose/ui/text/input/z0;", "d", "Z", "h", "()Z", "l", "Landroidx/compose/foundation/text/selection/w0;", "j", "()Landroidx/compose/foundation/text/selection/w0;", "Landroidx/compose/ui/text/input/p0;", "i", "()Landroidx/compose/ui/text/input/p0;", "Landroidx/compose/foundation/text/j1;", "n", "()Landroidx/compose/foundation/text/j1;", "Landroidx/compose/foundation/text/l;", "Landroidx/compose/foundation/text/y;", "Lld/l;", "I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: m, reason: collision with root package name */
    public static final int f8254m = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c1 state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.text.selection.s0 selectionManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.input.z0 value;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean editable;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean singleLine;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.text.selection.w0 preparedSelectionState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.input.p0 offsetMapping;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final j1 undoManager;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l keyCombiner;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final y keyMapping;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<androidx.compose.ui.text.input.z0, k2> onValueChange;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int imeAction;

    /* compiled from: TextFieldKeyInput.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/z0;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/input/z0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.input.z0, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f8267b = new a(1);

        a() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.text.input.z0 z0Var) {
        }

        @Override // ld.l
        public k2 invoke(androidx.compose.ui.text.input.z0 z0Var) {
            return k2.f75408a;
        }
    }

    /* compiled from: TextFieldKeyInput.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/selection/r0;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text/selection/r0;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nTextFieldKeyInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyInput.kt\nandroidx/compose/foundation/text/TextFieldKeyInput$process$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,263:1\n1#2:264\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.foundation.text.selection.r0, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f8268b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ u0 f8269c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k1.a f8270d;

        /* compiled from: TextFieldKeyInput.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/selection/r0;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text/selection/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.foundation.text.selection.r0, k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f8271b = new a(1);

            a() {
                super(1);
            }

            public final void a(@fg.l androidx.compose.foundation.text.selection.r0 r0Var) {
                r0Var.F();
            }

            @Override // ld.l
            public k2 invoke(androidx.compose.foundation.text.selection.r0 r0Var) {
                r0Var.F();
                return k2.f75408a;
            }
        }

        /* compiled from: TextFieldKeyInput.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/selection/r0;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text/selection/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text.u0$b$b, reason: collision with other inner class name */
        static final class C0164b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.foundation.text.selection.r0, k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0164b f8272b = new C0164b(1);

            C0164b() {
                super(1);
            }

            public final void a(@fg.l androidx.compose.foundation.text.selection.r0 r0Var) {
                r0Var.N();
            }

            @Override // ld.l
            public k2 invoke(androidx.compose.foundation.text.selection.r0 r0Var) {
                r0Var.N();
                return k2.f75408a;
            }
        }

        /* compiled from: TextFieldKeyInput.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/selection/r0;", "Landroidx/compose/ui/text/input/p;", "a", "(Landroidx/compose/foundation/text/selection/r0;)Landroidx/compose/ui/text/input/p;"}, k = 3, mv = {1, 8, 0})
        static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.foundation.text.selection.r0, androidx.compose.ui.text.input.p> {

            /* renamed from: b, reason: collision with root package name */
            public static final c f8273b = new c(1);

            c() {
                super(1);
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.ui.text.input.p invoke(@fg.l androidx.compose.foundation.text.selection.r0 r0Var) {
                return new androidx.compose.ui.text.input.n(androidx.compose.ui.text.t0.i(r0Var.getSelection()) - r0Var.v(), 0);
            }
        }

        /* compiled from: TextFieldKeyInput.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/selection/r0;", "Landroidx/compose/ui/text/input/p;", "a", "(Landroidx/compose/foundation/text/selection/r0;)Landroidx/compose/ui/text/input/p;"}, k = 3, mv = {1, 8, 0})
        static final class d extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.foundation.text.selection.r0, androidx.compose.ui.text.input.p> {

            /* renamed from: b, reason: collision with root package name */
            public static final d f8274b = new d(1);

            d() {
                super(1);
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.ui.text.input.p invoke(@fg.l androidx.compose.foundation.text.selection.r0 r0Var) {
                int o4 = r0Var.o();
                if (o4 != -1) {
                    return new androidx.compose.ui.text.input.n(0, o4 - androidx.compose.ui.text.t0.i(r0Var.getSelection()));
                }
                return null;
            }
        }

        /* compiled from: TextFieldKeyInput.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/selection/r0;", "Landroidx/compose/ui/text/input/p;", "a", "(Landroidx/compose/foundation/text/selection/r0;)Landroidx/compose/ui/text/input/p;"}, k = 3, mv = {1, 8, 0})
        static final class e extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.foundation.text.selection.r0, androidx.compose.ui.text.input.p> {

            /* renamed from: b, reason: collision with root package name */
            public static final e f8275b = new e(1);

            e() {
                super(1);
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.ui.text.input.p invoke(@fg.l androidx.compose.foundation.text.selection.r0 r0Var) {
                Integer y4 = r0Var.y();
                if (y4 == null) {
                    return null;
                }
                return new androidx.compose.ui.text.input.n(androidx.compose.ui.text.t0.i(r0Var.getSelection()) - y4.intValue(), 0);
            }
        }

        /* compiled from: TextFieldKeyInput.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/selection/r0;", "Landroidx/compose/ui/text/input/p;", "a", "(Landroidx/compose/foundation/text/selection/r0;)Landroidx/compose/ui/text/input/p;"}, k = 3, mv = {1, 8, 0})
        static final class f extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.foundation.text.selection.r0, androidx.compose.ui.text.input.p> {

            /* renamed from: b, reason: collision with root package name */
            public static final f f8276b = new f(1);

            f() {
                super(1);
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.ui.text.input.p invoke(@fg.l androidx.compose.foundation.text.selection.r0 r0Var) {
                Integer p4 = r0Var.p();
                if (p4 != null) {
                    return new androidx.compose.ui.text.input.n(0, p4.intValue() - androidx.compose.ui.text.t0.i(r0Var.getSelection()));
                }
                return null;
            }
        }

        /* compiled from: TextFieldKeyInput.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/selection/r0;", "Landroidx/compose/ui/text/input/p;", "a", "(Landroidx/compose/foundation/text/selection/r0;)Landroidx/compose/ui/text/input/p;"}, k = 3, mv = {1, 8, 0})
        static final class g extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.foundation.text.selection.r0, androidx.compose.ui.text.input.p> {

            /* renamed from: b, reason: collision with root package name */
            public static final g f8277b = new g(1);

            g() {
                super(1);
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.ui.text.input.p invoke(@fg.l androidx.compose.foundation.text.selection.r0 r0Var) {
                Integer l4 = r0Var.l();
                if (l4 == null) {
                    return null;
                }
                return new androidx.compose.ui.text.input.n(androidx.compose.ui.text.t0.i(r0Var.getSelection()) - l4.intValue(), 0);
            }
        }

        /* compiled from: TextFieldKeyInput.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/selection/r0;", "Landroidx/compose/ui/text/input/p;", "a", "(Landroidx/compose/foundation/text/selection/r0;)Landroidx/compose/ui/text/input/p;"}, k = 3, mv = {1, 8, 0})
        static final class h extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.foundation.text.selection.r0, androidx.compose.ui.text.input.p> {

            /* renamed from: b, reason: collision with root package name */
            public static final h f8278b = new h(1);

            h() {
                super(1);
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.ui.text.input.p invoke(@fg.l androidx.compose.foundation.text.selection.r0 r0Var) {
                Integer i4 = r0Var.i();
                if (i4 != null) {
                    return new androidx.compose.ui.text.input.n(0, i4.intValue() - androidx.compose.ui.text.t0.i(r0Var.getSelection()));
                }
                return null;
            }
        }

        /* compiled from: TextFieldKeyInput.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class i {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f8279a;

            static {
                int[] iArr = new int[w.values().length];
                try {
                    iArr[w.COPY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[w.PASTE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[w.CUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[w.LEFT_CHAR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[w.RIGHT_CHAR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[w.LEFT_WORD.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[w.RIGHT_WORD.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[w.PREV_PARAGRAPH.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[w.NEXT_PARAGRAPH.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[w.UP.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[w.DOWN.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[w.PAGE_UP.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[w.PAGE_DOWN.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[w.LINE_START.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[w.LINE_END.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[w.LINE_LEFT.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[w.LINE_RIGHT.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[w.HOME.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[w.END.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[w.DELETE_PREV_CHAR.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[w.DELETE_NEXT_CHAR.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[w.DELETE_PREV_WORD.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[w.DELETE_NEXT_WORD.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[w.DELETE_FROM_LINE_START.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[w.DELETE_TO_LINE_END.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[w.NEW_LINE.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[w.TAB.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[w.SELECT_ALL.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[w.SELECT_LEFT_CHAR.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[w.SELECT_RIGHT_CHAR.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[w.SELECT_LEFT_WORD.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[w.SELECT_RIGHT_WORD.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[w.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[w.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[w.SELECT_LINE_START.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[w.SELECT_LINE_END.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[w.SELECT_LINE_LEFT.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[w.SELECT_LINE_RIGHT.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[w.SELECT_UP.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[w.SELECT_DOWN.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[w.SELECT_PAGE_UP.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[w.SELECT_PAGE_DOWN.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[w.SELECT_HOME.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[w.SELECT_END.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[w.DESELECT.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[w.UNDO.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[w.REDO.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[w.CHARACTER_PALETTE.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                f8279a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(w wVar, u0 u0Var, k1.a aVar) {
            super(1);
            this.f8268b = wVar;
            this.f8269c = u0Var;
            this.f8270d = aVar;
        }

        public final void a(@fg.l androidx.compose.foundation.text.selection.r0 r0Var) {
            androidx.compose.ui.text.input.z0 h4;
            androidx.compose.ui.text.input.z0 d5;
            switch (i.f8279a[this.f8268b.ordinal()]) {
                case 1:
                    this.f8269c.getSelectionManager().o(false);
                    break;
                case 2:
                    this.f8269c.getSelectionManager().V();
                    break;
                case 3:
                    this.f8269c.getSelectionManager().s();
                    break;
                case 4:
                    r0Var.d(a.f8271b);
                    break;
                case 5:
                    r0Var.e(C0164b.f8272b);
                    break;
                case 6:
                    r0Var.G();
                    break;
                case 7:
                    r0Var.O();
                    break;
                case 8:
                    r0Var.L();
                    break;
                case 9:
                    r0Var.I();
                    break;
                case 10:
                    r0Var.V();
                    break;
                case 11:
                    r0Var.E();
                    break;
                case 12:
                    r0Var.l0();
                    break;
                case 13:
                    r0Var.k0();
                    break;
                case 14:
                    r0Var.U();
                    break;
                case 15:
                    r0Var.R();
                    break;
                case 16:
                    r0Var.S();
                    break;
                case 17:
                    r0Var.T();
                    break;
                case 18:
                    r0Var.Q();
                    break;
                case 19:
                    r0Var.P();
                    break;
                case 20:
                    List<androidx.compose.ui.text.input.p> f02 = r0Var.f0(c.f8273b);
                    if (f02 != null) {
                        this.f8269c.f(f02);
                        break;
                    }
                    break;
                case 21:
                    List<androidx.compose.ui.text.input.p> f03 = r0Var.f0(d.f8274b);
                    if (f03 != null) {
                        this.f8269c.f(f03);
                        break;
                    }
                    break;
                case 22:
                    List<androidx.compose.ui.text.input.p> f04 = r0Var.f0(e.f8275b);
                    if (f04 != null) {
                        this.f8269c.f(f04);
                        break;
                    }
                    break;
                case 23:
                    List<androidx.compose.ui.text.input.p> f05 = r0Var.f0(f.f8276b);
                    if (f05 != null) {
                        this.f8269c.f(f05);
                        break;
                    }
                    break;
                case 24:
                    List<androidx.compose.ui.text.input.p> f06 = r0Var.f0(g.f8277b);
                    if (f06 != null) {
                        this.f8269c.f(f06);
                        break;
                    }
                    break;
                case 25:
                    List<androidx.compose.ui.text.input.p> f07 = r0Var.f0(h.f8278b);
                    if (f07 != null) {
                        this.f8269c.f(f07);
                        break;
                    }
                    break;
                case 26:
                    if (!this.f8269c.getSingleLine()) {
                        this.f8269c.e(new androidx.compose.ui.text.input.b("\n", 1));
                        break;
                    } else {
                        this.f8269c.getState().j().invoke(androidx.compose.ui.text.input.y.i(this.f8269c.imeAction));
                        break;
                    }
                case 27:
                    if (!this.f8269c.getSingleLine()) {
                        this.f8269c.e(new androidx.compose.ui.text.input.b("\t", 1));
                        break;
                    } else {
                        this.f8270d.f75322b = false;
                        break;
                    }
                case 28:
                    r0Var.W();
                    break;
                case 29:
                    r0Var.F().X();
                    break;
                case 30:
                    r0Var.N().X();
                    break;
                case 31:
                    r0Var.G().X();
                    break;
                case 32:
                    r0Var.O().X();
                    break;
                case 33:
                    r0Var.L().X();
                    break;
                case 34:
                    r0Var.I().X();
                    break;
                case 35:
                    r0Var.U().X();
                    break;
                case 36:
                    r0Var.R().X();
                    break;
                case 37:
                    r0Var.S().X();
                    break;
                case 38:
                    r0Var.T().X();
                    break;
                case 39:
                    r0Var.V().X();
                    break;
                case 40:
                    r0Var.E().X();
                    break;
                case 41:
                    r0Var.l0().X();
                    break;
                case 42:
                    r0Var.k0().X();
                    break;
                case 43:
                    r0Var.Q().X();
                    break;
                case 44:
                    r0Var.P().X();
                    break;
                case 45:
                    r0Var.f();
                    break;
                case 46:
                    j1 undoManager = this.f8269c.getUndoManager();
                    if (undoManager != null) {
                        undoManager.c(r0Var.i0());
                    }
                    j1 undoManager2 = this.f8269c.getUndoManager();
                    if (undoManager2 != null && (h4 = undoManager2.h()) != null) {
                        this.f8269c.onValueChange.invoke(h4);
                        break;
                    }
                    break;
                case 47:
                    j1 undoManager3 = this.f8269c.getUndoManager();
                    if (undoManager3 != null && (d5 = undoManager3.d()) != null) {
                        this.f8269c.onValueChange.invoke(d5);
                        break;
                    }
                    break;
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.foundation.text.selection.r0 r0Var) {
            a(r0Var);
            return k2.f75408a;
        }
    }

    public /* synthetic */ u0(c1 c1Var, androidx.compose.foundation.text.selection.s0 s0Var, androidx.compose.ui.text.input.z0 z0Var, boolean z4, boolean z5, androidx.compose.foundation.text.selection.w0 w0Var, androidx.compose.ui.text.input.p0 p0Var, j1 j1Var, l lVar, y yVar, ld.l lVar2, int i4, kotlin.jvm.internal.w wVar) {
        this(c1Var, s0Var, z0Var, z4, z5, w0Var, p0Var, j1Var, lVar, yVar, lVar2, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(androidx.compose.ui.text.input.p pVar) {
        f(kotlin.collections.w.k(pVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(List<? extends androidx.compose.ui.text.input.p> list) {
        androidx.compose.ui.text.input.r processor = this.state.getProcessor();
        List<? extends androidx.compose.ui.text.input.p> Y5 = kotlin.collections.w.Y5(list);
        Y5.add(0, new androidx.compose.ui.text.input.u());
        this.onValueChange.invoke(processor.b(Y5));
    }

    private final void g(ld.l<? super androidx.compose.foundation.text.selection.r0, k2> block) {
        androidx.compose.foundation.text.selection.r0 r0Var = new androidx.compose.foundation.text.selection.r0(this.value, this.offsetMapping, this.state.h(), this.preparedSelectionState);
        block.invoke(r0Var);
        if (androidx.compose.ui.text.t0.g(r0Var.getSelection(), this.value.getSelection()) && kotlin.jvm.internal.l0.g(r0Var.getAnnotatedString(), this.value.getAnnotatedString())) {
            return;
        }
        this.onValueChange.invoke(r0Var.i0());
    }

    private final androidx.compose.ui.text.input.b q(KeyEvent event) {
        Integer a5;
        if (w0.a(event) && (a5 = this.keyCombiner.a(event)) != null) {
            return new androidx.compose.ui.text.input.b(new StringBuilder().appendCodePoint(a5.intValue()).toString(), 1);
        }
        return null;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getEditable() {
        return this.editable;
    }

    @fg.l
    /* renamed from: i, reason: from getter */
    public final androidx.compose.ui.text.input.p0 getOffsetMapping() {
        return this.offsetMapping;
    }

    @fg.l
    /* renamed from: j, reason: from getter */
    public final androidx.compose.foundation.text.selection.w0 getPreparedSelectionState() {
        return this.preparedSelectionState;
    }

    @fg.l
    /* renamed from: k, reason: from getter */
    public final androidx.compose.foundation.text.selection.s0 getSelectionManager() {
        return this.selectionManager;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getSingleLine() {
        return this.singleLine;
    }

    @fg.l
    /* renamed from: m, reason: from getter */
    public final c1 getState() {
        return this.state;
    }

    @fg.m
    /* renamed from: n, reason: from getter */
    public final j1 getUndoManager() {
        return this.undoManager;
    }

    @fg.l
    /* renamed from: o, reason: from getter */
    public final androidx.compose.ui.text.input.z0 getValue() {
        return this.value;
    }

    public final boolean p(@fg.l KeyEvent event) {
        w a5;
        androidx.compose.ui.text.input.b q4 = q(event);
        if (q4 != null) {
            if (!this.editable) {
                return false;
            }
            e(q4);
            this.preparedSelectionState.b();
            return true;
        }
        int b5 = androidx.compose.ui.input.key.e.b(event);
        androidx.compose.ui.input.key.d.INSTANCE.getClass();
        if (!androidx.compose.ui.input.key.d.g(b5, androidx.compose.ui.input.key.d.f18651e) || (a5 = this.keyMapping.a(event)) == null || (a5.getEditsText() && !this.editable)) {
            return false;
        }
        k1.a aVar = new k1.a();
        aVar.f75322b = true;
        g(new b(a5, this, aVar));
        j1 j1Var = this.undoManager;
        if (j1Var != null) {
            j1Var.a();
        }
        return aVar.f75322b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private u0(c1 c1Var, androidx.compose.foundation.text.selection.s0 s0Var, androidx.compose.ui.text.input.z0 z0Var, boolean z4, boolean z5, androidx.compose.foundation.text.selection.w0 w0Var, androidx.compose.ui.text.input.p0 p0Var, j1 j1Var, l lVar, y yVar, ld.l<? super androidx.compose.ui.text.input.z0, k2> lVar2, int i4) {
        this.state = c1Var;
        this.selectionManager = s0Var;
        this.value = z0Var;
        this.editable = z4;
        this.singleLine = z5;
        this.preparedSelectionState = w0Var;
        this.offsetMapping = p0Var;
        this.undoManager = j1Var;
        this.keyCombiner = lVar;
        this.keyMapping = yVar;
        this.onValueChange = lVar2;
        this.imeAction = i4;
    }

    public /* synthetic */ u0(c1 c1Var, androidx.compose.foundation.text.selection.s0 s0Var, androidx.compose.ui.text.input.z0 z0Var, boolean z4, boolean z5, androidx.compose.foundation.text.selection.w0 w0Var, androidx.compose.ui.text.input.p0 p0Var, j1 j1Var, l lVar, y yVar, ld.l lVar2, int i4, int i5, kotlin.jvm.internal.w wVar) {
        this(c1Var, s0Var, (i5 & 4) != 0 ? new androidx.compose.ui.text.input.z0((String) null, 0L, (androidx.compose.ui.text.t0) null, 7, (kotlin.jvm.internal.w) null) : z0Var, (i5 & 8) != 0 ? true : z4, (i5 & 16) != 0 ? false : z5, w0Var, (i5 & 64) != 0 ? androidx.compose.ui.text.input.p0.INSTANCE.a() : p0Var, (i5 & 128) != 0 ? null : j1Var, lVar, (i5 & 512) != 0 ? a0.a() : yVar, (i5 & 1024) != 0 ? a.f8267b : lVar2, i4);
    }
}

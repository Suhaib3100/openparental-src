package androidx.compose.ui.text.font;

import androidx.compose.runtime.b5;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: FontFamily.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0002\r\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0003\u001a\u00020\u00028G¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/font/y;", "", "", "canLoadSynchronously", "<init>", "(Z)V", "b", "Z", "j", "()Z", "l", "()V", "c", "a", "Landroidx/compose/ui/text/font/w;", "Landroidx/compose/ui/text/font/r0;", "Landroidx/compose/ui/text/font/c1;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: d, reason: collision with root package name */
    public static final int f20892d = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean canLoadSynchronously;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final c1 f20893e = new p(null);

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final q0 f20894f = new q0("sans-serif", "FontFamily.SansSerif");

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final q0 f20895g = new q0("serif", "FontFamily.Serif");

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final q0 f20896h = new q0("monospace", "FontFamily.Monospace");

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final q0 f20897i = new q0("cursive", "FontFamily.Cursive");

    /* compiled from: FontFamily.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/font/y$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/c1;", "Default", "Landroidx/compose/ui/text/font/c1;", "b", "()Landroidx/compose/ui/text/font/c1;", "Landroidx/compose/ui/text/font/q0;", "SansSerif", "Landroidx/compose/ui/text/font/q0;", "d", "()Landroidx/compose/ui/text/font/q0;", "Serif", "e", "Monospace", "c", "Cursive", "a", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.font.y$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final q0 a() {
            return y.f20897i;
        }

        @fg.l
        public final c1 b() {
            return y.f20893e;
        }

        @fg.l
        public final q0 c() {
            return y.f20896h;
        }

        @fg.l
        public final q0 d() {
            return y.f20894f;
        }

        @fg.l
        public final q0 e() {
            return y.f20895g;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: FontFamily.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006JB\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH&ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0001\u0001\u0010ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/y$b;", "", "Landroidx/compose/ui/text/font/y;", "fontFamily", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/font/y;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/o0;", "fontWeight", "Landroidx/compose/ui/text/font/k0;", "fontStyle", "Landroidx/compose/ui/text/font/l0;", "fontSynthesis", "Landroidx/compose/runtime/b5;", "b", "(Landroidx/compose/ui/text/font/y;Landroidx/compose/ui/text/font/o0;II)Landroidx/compose/runtime/b5;", "Landroidx/compose/ui/text/font/a0;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b {
        static b5 c(b bVar, y yVar, o0 o0Var, int i4, int i5, int i6, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
            }
            if ((i6 & 1) != 0) {
                yVar = null;
            }
            if ((i6 & 2) != 0) {
                o0.INSTANCE.getClass();
                o0Var = o0.f20834q;
            }
            if ((i6 & 4) != 0) {
                k0.INSTANCE.getClass();
                i4 = k0.f20754c;
            }
            if ((i6 & 8) != 0) {
                l0.INSTANCE.getClass();
                i5 = l0.f20760d;
            }
            return bVar.b(yVar, o0Var, i4, i5);
        }

        @fg.m
        Object a(@fg.l y yVar, @fg.l kotlin.coroutines.d<? super k2> dVar);

        @fg.l
        b5<Object> b(@fg.m y fontFamily, @fg.l o0 fontWeight, int fontStyle, int fontSynthesis);
    }

    public /* synthetic */ y(boolean z4, kotlin.jvm.internal.w wVar) {
        this(z4);
    }

    public static /* synthetic */ void l() {
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Unused property that has no meaning. Do not use.")
    /* renamed from: j, reason: from getter */
    public final boolean getCanLoadSynchronously() {
        return this.canLoadSynchronously;
    }

    private y(boolean z4) {
        this.canLoadSynchronously = z4;
    }
}

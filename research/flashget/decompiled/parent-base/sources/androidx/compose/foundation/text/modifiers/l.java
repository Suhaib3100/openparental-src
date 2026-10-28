package androidx.compose.foundation.text.modifiers;

import androidx.compose.runtime.internal.u;
import androidx.compose.ui.graphics.g5;
import androidx.compose.ui.text.n0;
import androidx.compose.ui.text.style.t;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: SelectionController.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0010\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0010B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/text/modifiers/l;", "", "Landroidx/compose/ui/layout/u;", "layoutCoordinates", "Landroidx/compose/ui/text/n0;", "textLayoutResult", "<init>", "(Landroidx/compose/ui/layout/u;Landroidx/compose/ui/text/n0;)V", "", "start", "end", "Landroidx/compose/ui/graphics/g5;", "e", "(II)Landroidx/compose/ui/graphics/g5;", "b", "(Landroidx/compose/ui/layout/u;Landroidx/compose/ui/text/n0;)Landroidx/compose/foundation/text/modifiers/l;", "a", "Landroidx/compose/ui/layout/u;", "d", "()Landroidx/compose/ui/layout/u;", "Landroidx/compose/ui/text/n0;", "g", "()Landroidx/compose/ui/text/n0;", "", "f", "()Z", "shouldClip", "c", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class l {

    /* renamed from: d, reason: collision with root package name */
    public static final int f7788d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final androidx.compose.ui.layout.u layoutCoordinates;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final n0 textLayoutResult;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final l f7789e = new l(null, null);

    /* compiled from: SelectionController.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text/modifiers/l$a;", "", "<init>", "()V", "Landroidx/compose/foundation/text/modifiers/l;", "Empty", "Landroidx/compose/foundation/text/modifiers/l;", "a", "()Landroidx/compose/foundation/text/modifiers/l;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.modifiers.l$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final l a() {
            return l.f7789e;
        }

        public Companion(w wVar) {
        }
    }

    public l(@fg.m androidx.compose.ui.layout.u uVar, @fg.m n0 n0Var) {
        this.layoutCoordinates = uVar;
        this.textLayoutResult = n0Var;
    }

    public static l c(l lVar, androidx.compose.ui.layout.u uVar, n0 n0Var, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i4 & 1) != 0) {
            uVar = lVar.layoutCoordinates;
        }
        if ((i4 & 2) != 0) {
            n0Var = lVar.textLayoutResult;
        }
        lVar.getClass();
        return new l(uVar, n0Var);
    }

    @fg.l
    public final l b(@fg.m androidx.compose.ui.layout.u layoutCoordinates, @fg.m n0 textLayoutResult) {
        return new l(layoutCoordinates, textLayoutResult);
    }

    @fg.m
    /* renamed from: d, reason: from getter */
    public final androidx.compose.ui.layout.u getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    @fg.m
    public g5 e(int start, int end) {
        n0 n0Var = this.textLayoutResult;
        if (n0Var != null) {
            return n0Var.z(start, end);
        }
        return null;
    }

    public boolean f() {
        n0 n0Var = this.textLayoutResult;
        if (n0Var == null) {
            return false;
        }
        int overflow = n0Var.getLayoutInput().getOverflow();
        t.INSTANCE.getClass();
        return !t.g(overflow, t.f21406e) && n0Var.i();
    }

    @fg.m
    /* renamed from: g, reason: from getter */
    public final n0 getTextLayoutResult() {
        return this.textLayoutResult;
    }
}

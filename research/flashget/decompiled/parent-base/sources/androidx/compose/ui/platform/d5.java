package androidx.compose.ui.platform;

import java.util.List;
import kotlin.Metadata;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u001b\u0010\u001aR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u000e\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b!\u0010 R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/ui/platform/d5;", "Landroidx/compose/ui/node/q1;", "", "semanticsNodeId", "", "allScopes", "", "oldXValue", "oldYValue", "Landroidx/compose/ui/semantics/j;", "horizontalScrollAxisRange", "verticalScrollAxisRange", "<init>", "(ILjava/util/List;Ljava/lang/Float;Ljava/lang/Float;Landroidx/compose/ui/semantics/j;Landroidx/compose/ui/semantics/j;)V", "b", "I", "e", "()I", "c", "Ljava/util/List;", "a", "()Ljava/util/List;", "d", "Ljava/lang/Float;", "()Ljava/lang/Float;", "h", "(Ljava/lang/Float;)V", "i", "f", "Landroidx/compose/ui/semantics/j;", "()Landroidx/compose/ui/semantics/j;", "g", "(Landroidx/compose/ui/semantics/j;)V", "j", "", "G3", "()Z", "isValidOwnerScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class d5 implements androidx.compose.ui.node.q1 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int semanticsNodeId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<d5> allScopes;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Float oldXValue;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Float oldYValue;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.semantics.j horizontalScrollAxisRange;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.semantics.j verticalScrollAxisRange;

    public d5(int i4, @fg.l List<d5> list, @fg.m Float f4, @fg.m Float f5, @fg.m androidx.compose.ui.semantics.j jVar, @fg.m androidx.compose.ui.semantics.j jVar2) {
        this.semanticsNodeId = i4;
        this.allScopes = list;
        this.oldXValue = f4;
        this.oldYValue = f5;
        this.horizontalScrollAxisRange = jVar;
        this.verticalScrollAxisRange = jVar2;
    }

    @Override // androidx.compose.ui.node.q1
    public boolean G3() {
        return this.allScopes.contains(this);
    }

    @fg.l
    public final List<d5> a() {
        return this.allScopes;
    }

    @fg.m
    /* renamed from: b, reason: from getter */
    public final androidx.compose.ui.semantics.j getHorizontalScrollAxisRange() {
        return this.horizontalScrollAxisRange;
    }

    @fg.m
    /* renamed from: c, reason: from getter */
    public final Float getOldXValue() {
        return this.oldXValue;
    }

    @fg.m
    /* renamed from: d, reason: from getter */
    public final Float getOldYValue() {
        return this.oldYValue;
    }

    /* renamed from: e, reason: from getter */
    public final int getSemanticsNodeId() {
        return this.semanticsNodeId;
    }

    @fg.m
    /* renamed from: f, reason: from getter */
    public final androidx.compose.ui.semantics.j getVerticalScrollAxisRange() {
        return this.verticalScrollAxisRange;
    }

    public final void g(@fg.m androidx.compose.ui.semantics.j jVar) {
        this.horizontalScrollAxisRange = jVar;
    }

    public final void h(@fg.m Float f4) {
        this.oldXValue = f4;
    }

    public final void i(@fg.m Float f4) {
        this.oldYValue = f4;
    }

    public final void j(@fg.m androidx.compose.ui.semantics.j jVar) {
        this.verticalScrollAxisRange = jVar;
    }
}

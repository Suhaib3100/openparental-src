package androidx.compose.foundation;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJT\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\n*\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010!\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/foundation/k0;", "Landroidx/compose/ui/node/y1;", "Landroidx/compose/ui/q$d;", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/i;", "role", "Lkotlin/Function0;", "Lkotlin/k2;", "onClick", "onLongClickLabel", "onLongClick", "<init>", "(ZLjava/lang/String;Landroidx/compose/ui/semantics/i;Lld/a;Ljava/lang/String;Lld/a;Lkotlin/jvm/internal/w;)V", "A7", "(ZLjava/lang/String;Landroidx/compose/ui/semantics/i;Lld/a;Ljava/lang/String;Lld/a;)V", "Landroidx/compose/ui/semantics/z;", "f6", "(Landroidx/compose/ui/semantics/z;)V", "p", "Z", "q", "Ljava/lang/String;", "r", "Landroidx/compose/ui/semantics/i;", "s", "Lld/a;", "t", "u", "s6", "()Z", "shouldMergeDescendantSemantics", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class k0 extends q.d implements androidx.compose.ui.node.y1 {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private String onClickLabel;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.semantics.i role;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.a<kotlin.k2> onClick;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private String onLongClickLabel;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.a<kotlin.k2> onLongClick;

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {
        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            k0.this.onClick.invoke();
            return Boolean.TRUE;
        }
    }

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {
        b() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            ld.a aVar = k0.this.onLongClick;
            if (aVar != null) {
                aVar.invoke();
            }
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ k0(boolean z4, String str, androidx.compose.ui.semantics.i iVar, ld.a aVar, String str2, ld.a aVar2, kotlin.jvm.internal.w wVar) {
        this(z4, str, iVar, aVar, str2, aVar2);
    }

    public final void A7(boolean enabled, @fg.m String onClickLabel, @fg.m androidx.compose.ui.semantics.i role, @fg.l ld.a<kotlin.k2> onClick, @fg.m String onLongClickLabel, @fg.m ld.a<kotlin.k2> onLongClick) {
        this.enabled = enabled;
        this.onClickLabel = onClickLabel;
        this.role = role;
        this.onClick = onClick;
        this.onLongClickLabel = onLongClickLabel;
        this.onLongClick = onLongClick;
    }

    @Override // androidx.compose.ui.node.y1
    public void f6(@fg.l androidx.compose.ui.semantics.z zVar) {
        androidx.compose.ui.semantics.i iVar = this.role;
        if (iVar != null) {
            kotlin.jvm.internal.l0.m(iVar);
            androidx.compose.ui.semantics.w.l1(zVar, iVar.getValue());
        }
        androidx.compose.ui.semantics.w.w0(zVar, this.onClickLabel, new a());
        if (this.onLongClick != null) {
            androidx.compose.ui.semantics.w.A0(zVar, this.onLongClickLabel, new b());
        }
        if (this.enabled) {
            return;
        }
        androidx.compose.ui.semantics.w.n(zVar);
    }

    @Override // androidx.compose.ui.node.y1
    /* renamed from: s6 */
    public boolean getMergeDescendants() {
        return true;
    }

    private k0(boolean z4, String str, androidx.compose.ui.semantics.i iVar, ld.a<kotlin.k2> aVar, String str2, ld.a<kotlin.k2> aVar2) {
        this.enabled = z4;
        this.onClickLabel = str;
        this.role = iVar;
        this.onClick = aVar;
        this.onLongClickLabel = str2;
        this.onLongClick = aVar2;
    }
}

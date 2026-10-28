package androidx.compose.runtime;

import java.util.List;
import kotlin.Metadata;

/* compiled from: Composer.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@p1
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001Be\b\u0000\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012 \u0010\u000f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e0\f0\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0014\u0010$R<\u0010\u000f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e0\f0\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010%\u001a\u0004\b\u001e\u0010&\"\u0004\b'\u0010(R\u001a\u0010\u0011\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010)\u001a\u0004\b\"\u0010*¨\u0006+"}, d2 = {"Landroidx/compose/runtime/f2;", "", "Landroidx/compose/runtime/c2;", "content", "parameter", "Landroidx/compose/runtime/n0;", "composition", "Landroidx/compose/runtime/x3;", "slotTable", "Landroidx/compose/runtime/d;", "anchor", "", "Lkotlin/q0;", "Landroidx/compose/runtime/f3;", "Landroidx/compose/runtime/collection/d;", "invalidations", "Landroidx/compose/runtime/t2;", "locals", "<init>", "(Landroidx/compose/runtime/c2;Ljava/lang/Object;Landroidx/compose/runtime/n0;Landroidx/compose/runtime/x3;Landroidx/compose/runtime/d;Ljava/util/List;Landroidx/compose/runtime/t2;)V", "a", "Landroidx/compose/runtime/c2;", "c", "()Landroidx/compose/runtime/c2;", "b", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "Landroidx/compose/runtime/n0;", "()Landroidx/compose/runtime/n0;", "d", "Landroidx/compose/runtime/x3;", "g", "()Landroidx/compose/runtime/x3;", "e", "Landroidx/compose/runtime/d;", "()Landroidx/compose/runtime/d;", "Ljava/util/List;", "()Ljava/util/List;", "h", "(Ljava/util/List;)V", "Landroidx/compose/runtime/t2;", "()Landroidx/compose/runtime/t2;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f2 {

    /* renamed from: h, reason: collision with root package name */
    public static final int f16391h = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c2<Object> content;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Object parameter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n0 composition;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x3 slotTable;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d anchor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private List<kotlin.q0<f3, androidx.compose.runtime.collection.d<Object>>> invalidations;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final t2 locals;

    public f2(@fg.l c2<Object> c2Var, @fg.m Object obj, @fg.l n0 n0Var, @fg.l x3 x3Var, @fg.l d dVar, @fg.l List<kotlin.q0<f3, androidx.compose.runtime.collection.d<Object>>> list, @fg.l t2 t2Var) {
        this.content = c2Var;
        this.parameter = obj;
        this.composition = n0Var;
        this.slotTable = x3Var;
        this.anchor = dVar;
        this.invalidations = list;
        this.locals = t2Var;
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final d getAnchor() {
        return this.anchor;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final n0 getComposition() {
        return this.composition;
    }

    @fg.l
    public final c2<Object> c() {
        return this.content;
    }

    @fg.l
    public final List<kotlin.q0<f3, androidx.compose.runtime.collection.d<Object>>> d() {
        return this.invalidations;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final t2 getLocals() {
        return this.locals;
    }

    @fg.m
    /* renamed from: f, reason: from getter */
    public final Object getParameter() {
        return this.parameter;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final x3 getSlotTable() {
        return this.slotTable;
    }

    public final void h(@fg.l List<kotlin.q0<f3, androidx.compose.runtime.collection.d<Object>>> list) {
        this.invalidations = list;
    }
}

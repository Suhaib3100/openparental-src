package androidx.view.compose;

import androidx.compose.runtime.snapshots.g0;
import androidx.view.z;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.k2;

/* compiled from: ReportDrawn.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\t\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R&\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0001\u0012\u0004\u0012\u00020\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/activity/compose/o;", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/activity/z;", "fullyDrawnReporter", "", "predicate", "<init>", "(Landroidx/activity/z;Lld/a;)V", "c", "(Lld/a;)V", "b", "()V", "d", "Landroidx/activity/z;", "Lld/a;", "Landroidx/compose/runtime/snapshots/g0;", "Landroidx/compose/runtime/snapshots/g0;", "snapshotStateObserver", "Lkotlin/Function1;", "e", "Lld/l;", "checkReporter", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class o implements ld.a<k2> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final z fullyDrawnReporter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final ld.a<Boolean> predicate;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final g0 snapshotStateObserver;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final ld.l<ld.a<Boolean>, k2> checkReporter;

    /* compiled from: ReportDrawn.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends h0 implements ld.l<ld.a<? extends Boolean>, k2> {
        a(Object obj) {
            super(1, obj, o.class, "observeReporter", "observeReporter(Lkotlin/jvm/functions/Function0;)V", 0);
        }

        public final void Z(@l ld.a<Boolean> aVar) {
            ((o) this.receiver).c(aVar);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(ld.a<? extends Boolean> aVar) {
            Z(aVar);
            return k2.f75408a;
        }
    }

    /* compiled from: ReportDrawn.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.a f498b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<Boolean> f499c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k1.a aVar, ld.a<Boolean> aVar2) {
            super(0);
            this.f498b = aVar;
            this.f499c = aVar2;
        }

        public final void a() {
            this.f498b.f75322b = this.f499c.invoke().booleanValue();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: ReportDrawn.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "command", "a", "(Lld/a;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.l<ld.a<? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f500b = new c(1);

        c() {
            super(1);
        }

        public final void a(@l ld.a<k2> aVar) {
            aVar.invoke();
        }

        @Override // ld.l
        public k2 invoke(ld.a<? extends k2> aVar) {
            aVar.invoke();
            return k2.f75408a;
        }
    }

    public o(@l z zVar, @l ld.a<Boolean> aVar) {
        this.fullyDrawnReporter = zVar;
        this.predicate = aVar;
        g0 g0Var = new g0(c.f500b);
        g0Var.v();
        this.snapshotStateObserver = g0Var;
        this.checkReporter = new a(this);
        zVar.b(this);
        if (zVar.e()) {
            return;
        }
        zVar.c();
        c(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(ld.a<Boolean> predicate) {
        k1.a aVar = new k1.a();
        this.snapshotStateObserver.q(predicate, this.checkReporter, new b(aVar, predicate));
        if (aVar.f75322b) {
            d();
        }
    }

    public void b() {
        this.snapshotStateObserver.j();
        this.snapshotStateObserver.w();
    }

    public final void d() {
        this.snapshotStateObserver.k(this.predicate);
        if (!this.fullyDrawnReporter.e()) {
            this.fullyDrawnReporter.h();
        }
        b();
    }

    @Override // ld.a
    public /* bridge */ /* synthetic */ k2 invoke() {
        b();
        return k2.f75408a;
    }
}

package androidx.compose.ui.input.pointer;

import androidx.collection.e1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: PointerInputEventProcessor.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0003R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/input/pointer/c0;", "", "<init>", "()V", "Landroidx/compose/ui/input/pointer/d0;", "pointerInputEvent", "Landroidx/compose/ui/input/pointer/r0;", "positionCalculator", "Landroidx/compose/ui/input/pointer/h;", "b", "(Landroidx/compose/ui/input/pointer/d0;Landroidx/compose/ui/input/pointer/r0;)Landroidx/compose/ui/input/pointer/h;", "Lkotlin/k2;", "a", "Landroidx/collection/e1;", "Landroidx/compose/ui/input/pointer/c0$a;", "Landroidx/collection/e1;", "previousPointerInputData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPointerInputEventProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputChangeEventProducer\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,261:1\n33#2,6:262\n*S KotlinDebug\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputChangeEventProducer\n*L\n169#1:262,6\n*E\n"})
/* loaded from: classes.dex */
final class c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e1<a> previousPointerInputData = new e1<>(0, 1, null);

    /* compiled from: PointerInputEventProcessor.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\f\u0010\u0013R\u001d\u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/input/pointer/c0$a;", "", "", "uptime", "Li0/f;", "positionOnScreen", "", "down", "Landroidx/compose/ui/input/pointer/q0;", "type", "<init>", "(JJZILkotlin/jvm/internal/w;)V", "a", "J", "d", "()J", "b", "c", "Z", "()Z", "I", "()I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long uptime;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long positionOnScreen;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean down;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int type;

        public /* synthetic */ a(long j4, long j5, boolean z4, int i4, kotlin.jvm.internal.w wVar) {
            this(j4, j5, z4, i4);
        }

        /* renamed from: a, reason: from getter */
        public final boolean getDown() {
            return this.down;
        }

        /* renamed from: b, reason: from getter */
        public final long getPositionOnScreen() {
            return this.positionOnScreen;
        }

        /* renamed from: c, reason: from getter */
        public final int getType() {
            return this.type;
        }

        /* renamed from: d, reason: from getter */
        public final long getUptime() {
            return this.uptime;
        }

        private a(long j4, long j5, boolean z4, int i4) {
            this.uptime = j4;
            this.positionOnScreen = j5;
            this.down = z4;
            this.type = i4;
        }
    }

    public final void a() {
        this.previousPointerInputData.c();
    }

    @fg.l
    public final h b(@fg.l d0 pointerInputEvent, @fg.l r0 positionCalculator) {
        long j4;
        boolean down;
        long k4;
        e1 e1Var = new e1(pointerInputEvent.b().size());
        List<e0> b5 = pointerInputEvent.b();
        int size = b5.size();
        for (int i4 = 0; i4 < size; i4++) {
            e0 e0Var = b5.get(i4);
            a i5 = this.previousPointerInputData.i(e0Var.p());
            if (i5 == null) {
                j4 = e0Var.x();
                k4 = e0Var.s();
                down = false;
            } else {
                long uptime = i5.getUptime();
                j4 = uptime;
                down = i5.getDown();
                k4 = positionCalculator.k(i5.getPositionOnScreen());
            }
            e1Var.p(e0Var.p(), new b0(e0Var.p(), e0Var.x(), e0Var.s(), e0Var.n(), e0Var.u(), j4, k4, down, false, e0Var.w(), e0Var.o(), e0Var.v(), e0Var.r(), null));
            if (e0Var.n()) {
                this.previousPointerInputData.p(e0Var.p(), new a(e0Var.x(), e0Var.t(), e0Var.n(), e0Var.w(), null));
            } else {
                this.previousPointerInputData.s(e0Var.p());
            }
        }
        return new h(e1Var, pointerInputEvent);
    }
}

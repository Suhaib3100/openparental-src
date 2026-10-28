package androidx.compose.material3;

import androidx.constraintlayout.core.motion.utils.w;
import java.util.List;
import kotlin.Metadata;

/* compiled from: TimePicker.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001)B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0002*\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u0002*\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u0016J'\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\"\u0010!\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\f2\b\b\u0002\u0010 \u001a\u00020\u0005H\u0080@¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0014H\u0080@¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b%\u0010$J0\u0010'\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0005H\u0080@¢\u0006\u0004\b'\u0010(R\u0017\u0010-\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R!\u00103\u001a\u00020.8@X\u0080\u0084\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R1\u0010:\u001a\u0002042\u0006\u00105\u001a\u0002048@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00102\"\u0004\b\u0019\u00109R1\u0010?\u001a\u00020;2\u0006\u00105\u001a\u00020;8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b#\u00107\u001a\u0004\b<\u0010=\"\u0004\b>\u0010\u0016R+\u0010B\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b8\u00107\u001a\u0004\b@\u0010,\"\u0004\b\u0018\u0010AR+\u0010F\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bC\u00107\u001a\u0004\bD\u0010,\"\u0004\bE\u0010AR+\u0010M\u001a\u00020\f2\u0006\u00105\u001a\u00020\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR+\u0010P\u001a\u00020\f2\u0006\u00105\u001a\u00020\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bI\u0010H\u001a\u0004\bN\u0010J\"\u0004\bO\u0010LR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001b\u0010W\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u00100\u001a\u0004\bV\u0010,R&\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020Y0X8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010Z\u001a\u0004\bC\u0010[R\u0011\u0010\u0013\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bU\u0010=R\u0011\u0010\t\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bG\u0010=R\u0014\u0010]\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bR\u0010=R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00020^8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006b"}, d2 = {"Landroidx/compose/material3/db;", "", "", "initialHour", "initialMinute", "", "is24Hour", "<init>", "(IIZ)V", "hour", "o", "(I)I", "", "angle", "v", "(F)F", "G", "(F)I", "H", "minute", "Lkotlin/k2;", "C", "(I)V", "z", "x", "y", "maxDist", "u", "(FFF)V", "value", "t", "(I)Z", "fromTap", "I", "(FZLkotlin/coroutines/d;)Ljava/lang/Object;", "d", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "F", "autoSwitchToMinute", "w", "(FFFZLkotlin/coroutines/d;)Ljava/lang/Object;", "a", "Z", "p", "()Z", "is24hour", "Landroidx/compose/ui/unit/j;", "b", "Landroidx/compose/runtime/b5;", "m", "()J", "selectorPos", "Landroidx/compose/ui/unit/q;", "<set-?>", "c", "Landroidx/compose/runtime/k2;", "e", "(J)V", "center", "Landroidx/compose/material3/u8;", "l", "()I", "E", "selection", "r", "(Z)V", "isAfternoonToggle", "f", "s", "B", "isInnerCircle", "g", "Landroidx/compose/runtime/h2;", "h", "()F", "A", "(F)V", "hourAngle", "k", "D", "minuteAngle", "Landroidx/compose/foundation/c2;", "i", "Landroidx/compose/foundation/c2;", "mutex", "j", "q", "isAfternoon", "Landroidx/compose/animation/core/b;", "Landroidx/compose/animation/core/o;", "Landroidx/compose/animation/core/b;", "()Landroidx/compose/animation/core/b;", "currentAngle", "hourForDisplay", "", "n", "()Ljava/util/List;", "values", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.x4
@f5
@kotlin.jvm.internal.r1({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,1843:1\n1#2:1844\n81#3:1845\n81#3:1846\n107#3,2:1847\n81#3:1849\n107#3,2:1850\n81#3:1852\n107#3,2:1853\n81#3:1855\n107#3,2:1856\n81#3:1864\n76#4:1858\n109#4,2:1859\n76#4:1861\n109#4,2:1862\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerState\n*L\n621#1:1845\n637#1:1846\n637#1:1847,2\n640#1:1849\n640#1:1850,2\n641#1:1852\n641#1:1853,2\n642#1:1855\n642#1:1856,2\n652#1:1864\n644#1:1858\n644#1:1859,2\n647#1:1861\n647#1:1862,2\n*E\n"})
/* loaded from: classes.dex */
public final class db {

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: m, reason: collision with root package name */
    public static final int f10513m = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean is24hour;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.b5 selectorPos;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 center;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 selection;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 isAfternoonToggle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 isInnerCircle;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.h2 hourAngle;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.h2 minuteAngle;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.c2 mutex;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.b5 isAfternoon;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> currentAngle;

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/material3/db$a;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/material3/db;", "a", "()Landroidx/compose/runtime/saveable/l;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.db$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: TimePicker.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/material3/db;", "it", "", "", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/material3/db;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.db$a$a, reason: collision with other inner class name */
        static final class C0236a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, db, List<? extends Object>> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0236a f10525b = new C0236a(2);

            C0236a() {
                super(2);
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<Object> invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l db dbVar) {
                return kotlin.collections.w.O(Integer.valueOf(dbVar.g()), Integer.valueOf(dbVar.j()), Boolean.valueOf(dbVar.getIs24hour()));
            }
        }

        /* compiled from: TimePicker.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "value", "Landroidx/compose/material3/db;", "a", "(Ljava/util/List;)Landroidx/compose/material3/db;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.db$a$b */
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<List, db> {

            /* renamed from: b, reason: collision with root package name */
            public static final b f10526b = new b(1);

            b() {
                super(1);
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final db invoke(@fg.l List<? extends Object> list) {
                Object obj = list.get(0);
                kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) obj).intValue();
                Object obj2 = list.get(1);
                kotlin.jvm.internal.l0.n(obj2, "null cannot be cast to non-null type kotlin.Int");
                int intValue2 = ((Integer) obj2).intValue();
                Object obj3 = list.get(2);
                kotlin.jvm.internal.l0.n(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                return new db(intValue, intValue2, ((Boolean) obj3).booleanValue());
            }
        }

        private Companion() {
        }

        @fg.l
        public final androidx.compose.runtime.saveable.l<db, ?> a() {
            return androidx.compose.runtime.saveable.m.a(C0236a.f10525b, b.f10526b);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: TimePicker.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TimePickerState", f = "TimePicker.kt", i = {0, 0}, l = {703, w.h.f22558n}, m = "animateToCurrent$material3_release", n = {"this", "end"}, s = {"L$0", "F$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f10527b;

        /* renamed from: c, reason: collision with root package name */
        float f10528c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f10529d;

        /* renamed from: f, reason: collision with root package name */
        int f10531f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f10529d = obj;
            this.f10531f |= Integer.MIN_VALUE;
            return db.this.d(this);
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {
        c() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf((db.this.getIs24hour() && db.this.s()) || db.this.r());
        }
    }

    /* compiled from: TimePicker.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TimePickerState", f = "TimePicker.kt", i = {0, 0, 0, 0, 0, 1, 1}, l = {738, 746, 747, 750}, m = "onTap$material3_release", n = {"this", "x", "y", "maxDist", "autoSwitchToMinute", "this", "targetValue"}, s = {"L$0", "F$0", "F$1", "F$2", "Z$0", "L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f10533b;

        /* renamed from: c, reason: collision with root package name */
        Object f10534c;

        /* renamed from: d, reason: collision with root package name */
        float f10535d;

        /* renamed from: e, reason: collision with root package name */
        float f10536e;

        /* renamed from: f, reason: collision with root package name */
        float f10537f;

        /* renamed from: g, reason: collision with root package name */
        boolean f10538g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f10539h;

        /* renamed from: j, reason: collision with root package name */
        int f10541j;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f10539h = obj;
            this.f10541j |= Integer.MIN_VALUE;
            return db.this.w(0.0f, 0.0f, 0.0f, false, this);
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/unit/j;", "a", "()J"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerState$selectorPos$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1843:1\n75#2:1844\n58#2:1845\n51#2:1846\n88#2:1847\n75#2:1848\n51#2:1849\n88#2:1850\n75#2:1851\n51#2:1852\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerState$selectorPos$2\n*L\n623#1:1844\n628#1:1845\n630#1:1846\n631#1:1847\n631#1:1848\n631#1:1849\n632#1:1850\n632#1:1851\n632#1:1852\n*E\n"})
    static final class e extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.ui.unit.j> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f10543c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z4) {
            super(0);
            this.f10543c = z4;
        }

        public final long a() {
            float f4;
            boolean s4 = db.this.s();
            c0.k1 k1Var = c0.k1.f37594a;
            float f5 = 2;
            float g4 = androidx.compose.ui.unit.h.g(k1Var.j() / f5);
            if (this.f10543c && s4) {
                int l4 = db.this.l();
                u8.INSTANCE.getClass();
                if (u8.f(l4, u8.f14967c)) {
                    f4 = bb.f10000g;
                    float f6 = (f4 - g4) + g4;
                    return androidx.compose.ui.unit.i.a((k1Var.b() / f5) + (((float) Math.cos(db.this.f().v().floatValue())) * f6), (k1Var.b() / f5) + (f6 * ((float) Math.sin(db.this.f().v().floatValue()))));
                }
            }
            f4 = bb.f9999f;
            float f62 = (f4 - g4) + g4;
            return androidx.compose.ui.unit.i.a((k1Var.b() / f5) + (((float) Math.cos(db.this.f().v().floatValue())) * f62), (k1Var.b() / f5) + (f62 * ((float) Math.sin(db.this.f().v().floatValue()))));
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.j invoke() {
            return androidx.compose.ui.unit.j.c(a());
        }
    }

    /* compiled from: TimePicker.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TimePickerState", f = "TimePicker.kt", i = {0, 0}, l = {733, 734}, m = "settle", n = {"this", "targetValue"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f10544b;

        /* renamed from: c, reason: collision with root package name */
        Object f10545c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f10546d;

        /* renamed from: f, reason: collision with root package name */
        int f10548f;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f10546d = obj;
            this.f10548f |= Integer.MIN_VALUE;
            return db.this.F(this);
        }
    }

    /* compiled from: TimePicker.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TimePickerState$update$2", f = "TimePicker.kt", i = {}, l = {689, 691}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.coroutines.jvm.internal.o implements ld.l<kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f10549b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f10551d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f10552e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(float f4, boolean z4, kotlin.coroutines.d<? super g> dVar) {
            super(1, dVar);
            this.f10551d = f4;
            this.f10552e = z4;
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((g) create(dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.l kotlin.coroutines.d<?> dVar) {
            return db.this.new g(this.f10551d, this.f10552e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f10549b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                int l4 = db.this.l();
                u8.INSTANCE.getClass();
                if (u8.f(l4, u8.f14967c)) {
                    db.this.A((r8.G(this.f10551d) % 12) * 0.5235988f);
                } else if (this.f10552e) {
                    db.this.D((r8.H(this.f10551d) - (db.this.H(this.f10551d) % 5)) * 0.10471976f);
                } else {
                    db.this.D(r8.H(this.f10551d) * 0.10471976f);
                }
                if (this.f10552e) {
                    androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> f4 = db.this.f();
                    Float f5 = new Float(db.this.k());
                    this.f10549b = 1;
                    if (f4.C(f5, this) == aVar) {
                        return aVar;
                    }
                } else {
                    androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> f6 = db.this.f();
                    Float f7 = new Float(db.this.v(this.f10551d));
                    this.f10549b = 2;
                    if (f6.C(f7, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i4 != 1 && i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }
    }

    public db(int i4, int i5, boolean z4) {
        androidx.compose.runtime.k2 g4;
        androidx.compose.runtime.k2 g5;
        androidx.compose.runtime.k2 g6;
        androidx.compose.runtime.k2 g7;
        if (i4 < 0 || i4 >= 24) {
            throw new IllegalArgumentException("initialHour should in [0..23] range");
        }
        if (i5 < 0 || i5 >= 60) {
            throw new IllegalArgumentException("initialMinute should be in [0..59] range");
        }
        this.is24hour = z4;
        this.selectorPos = androidx.compose.runtime.o4.d(androidx.compose.runtime.o4.x(), new e(z4));
        androidx.compose.ui.unit.q.INSTANCE.getClass();
        g4 = androidx.compose.runtime.t4.g(androidx.compose.ui.unit.q.b(androidx.compose.ui.unit.q.f21519c), null, 2, null);
        this.center = g4;
        u8.INSTANCE.getClass();
        g5 = androidx.compose.runtime.t4.g(u8.c(u8.f14967c), null, 2, null);
        this.selection = g5;
        g6 = androidx.compose.runtime.t4.g(Boolean.valueOf(i4 >= 12 && !z4), null, 2, null);
        this.isAfternoonToggle = g6;
        g7 = androidx.compose.runtime.t4.g(Boolean.valueOf(i4 >= 12), null, 2, null);
        this.isInnerCircle = g7;
        androidx.compose.runtime.h2 b5 = androidx.compose.runtime.b.b(((i4 % 12) * 0.5235988f) - 1.5707964f);
        this.hourAngle = b5;
        this.minuteAngle = androidx.compose.runtime.b.b((i5 * 0.10471976f) - 1.5707964f);
        this.mutex = new androidx.compose.foundation.c2();
        this.isAfternoon = androidx.compose.runtime.o4.e(new c());
        this.currentAngle = androidx.compose.animation.core.c.b(b5.b(), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int G(float f4) {
        return ((int) ((f4 + (0.2617994f + 1.5707963267948966d)) / 0.5235988f)) % 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int H(float f4) {
        return ((int) ((f4 + (0.05235988f + 1.5707963267948966d)) / 0.10471976f)) % 60;
    }

    public static /* synthetic */ Object J(db dbVar, float f4, boolean z4, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return dbVar.I(f4, z4, dVar);
    }

    private final int o(int hour) {
        if (this.is24hour) {
            return hour % 24;
        }
        if (hour % 12 == 0) {
            return 12;
        }
        return q() ? hour - 12 : hour;
    }

    private final boolean q() {
        return ((Boolean) this.isAfternoon.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float v(float angle) {
        float f4 = angle + 1.5707964f;
        return f4 < 0.0f ? f4 + 6.2831855f : f4;
    }

    public final void A(float f4) {
        this.hourAngle.E(f4);
    }

    public final void B(boolean z4) {
        this.isInnerCircle.setValue(Boolean.valueOf(z4));
    }

    public final void C(int minute) {
        D((minute * 0.10471976f) - 1.5707964f);
    }

    public final void D(float f4) {
        this.minuteAngle.E(f4);
    }

    public final void E(int i4) {
        this.selection.setValue(u8.c(i4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(@fg.l kotlin.coroutines.d<? super kotlin.k2> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof androidx.compose.material3.db.f
            if (r0 == 0) goto L14
            r0 = r11
            androidx.compose.material3.db$f r0 = (androidx.compose.material3.db.f) r0
            int r1 = r0.f10548f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f10548f = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.material3.db$f r0 = new androidx.compose.material3.db$f
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f10546d
            kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r1 = r6.f10548f
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L40
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            kotlin.a1.n(r11)
            goto L94
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L34:
            java.lang.Object r1 = r6.f10545c
            kotlin.q0 r1 = (kotlin.q0) r1
            java.lang.Object r3 = r6.f10544b
            androidx.compose.material3.db r3 = (androidx.compose.material3.db) r3
            kotlin.a1.n(r11)
            goto L6d
        L40:
            kotlin.a1.n(r11)
            androidx.compose.animation.core.b<java.lang.Float, androidx.compose.animation.core.o> r11 = r10.currentAngle
            java.lang.Object r11 = r11.v()
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            androidx.compose.runtime.h2 r1 = r10.minuteAngle
            float r1 = r1.b()
            kotlin.q0 r1 = androidx.compose.material3.bb.d0(r11, r1)
            androidx.compose.animation.core.b<java.lang.Float, androidx.compose.animation.core.o> r11 = r10.currentAngle
            java.lang.Object r4 = r1.e()
            r6.f10544b = r10
            r6.f10545c = r1
            r6.f10548f = r3
            java.lang.Object r11 = r11.C(r4, r6)
            if (r11 != r0) goto L6c
            return r0
        L6c:
            r3 = r10
        L6d:
            androidx.compose.animation.core.b<java.lang.Float, androidx.compose.animation.core.o> r11 = r3.currentAngle
            java.lang.Object r3 = r1.f()
            r1 = 0
            r4 = 6
            r5 = 200(0xc8, float:2.8E-43)
            r7 = 0
            androidx.compose.animation.core.h2 r4 = androidx.compose.animation.core.l.r(r5, r1, r7, r4, r7)
            r6.f10544b = r7
            r6.f10545c = r7
            r6.f10548f = r2
            r5 = 0
            r8 = 12
            r9 = 0
            r1 = r11
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r7
            r7 = r8
            r8 = r9
            java.lang.Object r11 = androidx.compose.animation.core.b.i(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r11 != r0) goto L94
            return r0
        L94:
            kotlin.k2 r11 = kotlin.k2.f75408a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.db.F(kotlin.coroutines.d):java.lang.Object");
    }

    @fg.m
    public final Object I(float f4, boolean z4, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object d5 = this.mutex.d(androidx.compose.foundation.a2.UserInput, new g(f4, z4, null), dVar);
        return d5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? d5 : kotlin.k2.f75408a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@fg.l kotlin.coroutines.d<? super kotlin.k2> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof androidx.compose.material3.db.b
            if (r0 == 0) goto L14
            r0 = r11
            androidx.compose.material3.db$b r0 = (androidx.compose.material3.db.b) r0
            int r1 = r0.f10531f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f10531f = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.material3.db$b r0 = new androidx.compose.material3.db$b
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f10529d
            kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r1 = r6.f10531f
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            kotlin.a1.n(r11)
            goto Lc6
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L35:
            float r1 = r6.f10528c
            java.lang.Object r3 = r6.f10527b
            androidx.compose.material3.db r3 = (androidx.compose.material3.db) r3
            kotlin.a1.n(r11)
            goto La0
        L3f:
            kotlin.a1.n(r11)
            int r11 = r10.l()
            androidx.compose.material3.u8$a r1 = androidx.compose.material3.u8.INSTANCE
            r1.getClass()
            int r1 = androidx.compose.material3.u8.a()
            boolean r11 = androidx.compose.material3.u8.f(r11, r1)
            if (r11 == 0) goto L66
            androidx.compose.runtime.h2 r11 = r10.minuteAngle
            float r11 = r11.b()
            androidx.compose.runtime.h2 r1 = r10.hourAngle
            float r1 = r1.b()
            kotlin.q0 r11 = androidx.compose.material3.bb.d0(r11, r1)
            goto L76
        L66:
            androidx.compose.runtime.h2 r11 = r10.hourAngle
            float r11 = r11.b()
            androidx.compose.runtime.h2 r1 = r10.minuteAngle
            float r1 = r1.b()
            kotlin.q0 r11 = androidx.compose.material3.bb.d0(r11, r1)
        L76:
            java.lang.Object r1 = r11.a()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Object r11 = r11.b()
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            androidx.compose.animation.core.b<java.lang.Float, androidx.compose.animation.core.o> r4 = r10.currentAngle
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r1)
            r6.f10527b = r10
            r6.f10528c = r11
            r6.f10531f = r3
            java.lang.Object r1 = r4.C(r5, r6)
            if (r1 != r0) goto L9e
            return r0
        L9e:
            r3 = r10
            r1 = r11
        La0:
            androidx.compose.animation.core.b<java.lang.Float, androidx.compose.animation.core.o> r11 = r3.currentAngle
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r1)
            r1 = 0
            r4 = 6
            r5 = 200(0xc8, float:2.8E-43)
            r7 = 0
            androidx.compose.animation.core.h2 r4 = androidx.compose.animation.core.l.r(r5, r1, r7, r4, r7)
            r6.f10527b = r7
            r6.f10531f = r2
            r5 = 0
            r8 = 12
            r9 = 0
            r1 = r11
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r7
            r7 = r8
            r8 = r9
            java.lang.Object r11 = androidx.compose.animation.core.b.i(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r11 != r0) goto Lc6
            return r0
        Lc6:
            kotlin.k2 r11 = kotlin.k2.f75408a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.db.d(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e() {
        return ((androidx.compose.ui.unit.q) this.center.getValue()).getPackedValue();
    }

    @fg.l
    public final androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> f() {
        return this.currentAngle;
    }

    public final int g() {
        return G(this.hourAngle.b()) + (q() ? 12 : 0);
    }

    public final float h() {
        return this.hourAngle.b();
    }

    public final int i() {
        return o(g());
    }

    public final int j() {
        return H(this.minuteAngle.b());
    }

    public final float k() {
        return this.minuteAngle.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int l() {
        return ((u8) this.selection.getValue()).j();
    }

    public final long m() {
        return ((androidx.compose.ui.unit.j) this.selectorPos.getValue()).getPackedValue();
    }

    @fg.l
    public final List<Integer> n() {
        List<Integer> list;
        List<Integer> list2;
        int l4 = l();
        u8.INSTANCE.getClass();
        if (u8.f(l4, u8.f14968d)) {
            list2 = bb.f10008o;
            return list2;
        }
        list = bb.f10009p;
        return list;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getIs24hour() {
        return this.is24hour;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean r() {
        return ((Boolean) this.isAfternoonToggle.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean s() {
        return ((Boolean) this.isInnerCircle.getValue()).booleanValue();
    }

    public final boolean t(int value) {
        int l4 = l();
        u8.INSTANCE.getClass();
        if (!u8.f(l4, u8.f14968d)) {
            if (g() == value + (q() ? 12 : 0)) {
                return true;
            }
        } else if (value == j()) {
            return true;
        }
        return false;
    }

    public final void u(float x4, float y4, float maxDist) {
        float f02;
        int l4 = l();
        u8.INSTANCE.getClass();
        if (u8.f(l4, u8.f14967c) && this.is24hour) {
            f02 = bb.f0(x4, y4, androidx.compose.ui.unit.q.m(e()), (int) (e() & 4294967295L));
            B(f02 < maxDist);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(float r11, float r12, float r13, boolean r14, @fg.l kotlin.coroutines.d<? super kotlin.k2> r15) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.db.w(float, float, float, boolean, kotlin.coroutines.d):java.lang.Object");
    }

    public final void x(boolean z4) {
        this.isAfternoonToggle.setValue(Boolean.valueOf(z4));
    }

    public final void y(long j4) {
        this.center.setValue(androidx.compose.ui.unit.q.b(j4));
    }

    public final void z(int hour) {
        B(hour >= 12);
        A(((hour % 12) * 0.5235988f) - 1.5707964f);
    }
}

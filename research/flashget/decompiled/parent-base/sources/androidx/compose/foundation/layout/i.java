package androidx.compose.foundation.layout;

import androidx.compose.runtime.x4;
import androidx.compose.ui.c;
import kotlin.Metadata;

/* compiled from: Arrangement.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b1\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u001b9;FDB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u000b\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0082\b¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010#\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0005H\u0000¢\u0006\u0004\b#\u0010$J'\u0010%\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0005H\u0000¢\u0006\u0004\b%\u0010&J/\u0010'\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0005H\u0000¢\u0006\u0004\b'\u0010$J/\u0010(\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0005H\u0000¢\u0006\u0004\b(\u0010$J/\u0010)\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0005H\u0000¢\u0006\u0004\b)\u0010$J/\u0010*\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0005H\u0000¢\u0006\u0004\b*\u0010$R \u0010/\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010+\u0012\u0004\b.\u0010\u0003\u001a\u0004\b,\u0010-R \u00102\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010+\u0012\u0004\b1\u0010\u0003\u001a\u0004\b0\u0010-R \u00108\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b7\u0010\u0003\u001a\u0004\b5\u00106R \u0010:\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u00104\u0012\u0004\b9\u0010\u0003\u001a\u0004\b3\u00106R \u0010?\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b>\u0010\u0003\u001a\u0004\b;\u0010=R \u0010B\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u0010<\u0012\u0004\bA\u0010\u0003\u001a\u0004\b@\u0010=R \u0010E\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010<\u0012\u0004\bD\u0010\u0003\u001a\u0004\bC\u0010=R \u0010H\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010<\u0012\u0004\bG\u0010\u0003\u001a\u0004\bF\u0010=\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006I"}, d2 = {"Landroidx/compose/foundation/layout/i;", "", "<init>", "()V", "", "", "reversed", "Lkotlin/Function2;", "", "Lkotlin/k2;", "action", "c", "([IZLld/p;)V", "Landroidx/compose/ui/unit/h;", "space", "Landroidx/compose/foundation/layout/i$f;", "z", "(F)Landroidx/compose/foundation/layout/i$f;", "Landroidx/compose/ui/c$b;", "alignment", "Landroidx/compose/foundation/layout/i$e;", "A", "(FLandroidx/compose/ui/c$b;)Landroidx/compose/foundation/layout/i$e;", "Landroidx/compose/ui/c$c;", "Landroidx/compose/foundation/layout/i$m;", "B", "(FLandroidx/compose/ui/c$c;)Landroidx/compose/foundation/layout/i$m;", "a", "(Landroidx/compose/ui/c$b;)Landroidx/compose/foundation/layout/i$e;", "b", "(Landroidx/compose/ui/c$c;)Landroidx/compose/foundation/layout/i$m;", "totalSize", "size", "outPosition", "reverseInput", "v", "(I[I[IZ)V", "u", "([I[IZ)V", "t", "y", "x", "w", "Landroidx/compose/foundation/layout/i$e;", "p", "()Landroidx/compose/foundation/layout/i$e;", "q", "Start", "h", "i", "End", "d", "Landroidx/compose/foundation/layout/i$m;", "r", "()Landroidx/compose/foundation/layout/i$m;", "s", "Top", "e", "Bottom", "f", "Landroidx/compose/foundation/layout/i$f;", "()Landroidx/compose/foundation/layout/i$f;", "g", "Center", "n", "o", "SpaceEvenly", "l", "m", "SpaceBetween", "j", "k", "SpaceAround", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.m1
@kotlin.jvm.internal.r1({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,715:1\n706#1,2:721\n709#1,5:726\n706#1,2:731\n709#1,5:736\n706#1,2:744\n709#1,5:749\n706#1,2:757\n709#1,5:762\n706#1,2:770\n709#1,5:775\n706#1,2:783\n709#1,5:788\n154#2:716\n154#2:717\n13032#3,3:718\n13674#3,3:723\n13674#3,3:733\n13032#3,3:741\n13674#3,3:746\n13032#3,3:754\n13674#3,3:759\n13032#3,3:767\n13674#3,3:772\n13032#3,3:780\n13674#3,3:785\n13674#3,3:793\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n*L\n619#1:721,2\n619#1:726,5\n627#1:731,2\n627#1:736,5\n641#1:744,2\n641#1:749,5\n656#1:757,2\n656#1:762,5\n680#1:770,2\n680#1:775,5\n699#1:783,2\n699#1:788,5\n355#1:716\n367#1:717\n617#1:718,3\n619#1:723,3\n627#1:733,3\n639#1:741,3\n641#1:746,3\n653#1:754,3\n656#1:759,3\n670#1:767,3\n680#1:772,3\n692#1:780,3\n699#1:785,3\n707#1:793,3\n*E\n"})
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final i f5073a = new i();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final e Start = new k();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final e End = new d();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final m Top = new l();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final m Bottom = new b();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final f Center = new c();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final f SpaceEvenly = new C0095i();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final f SpaceBetween = new h();

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final f SpaceAround = new g();

    /* renamed from: j, reason: collision with root package name */
    public static final int f5082j = 0;

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0019\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001b\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0014\u0010\u0017R \u0010\u001e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0015\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001c\u0010\u0017R \u0010!\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0015\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001f\u0010\u0017R \u0010$\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0015\u0012\u0004\b#\u0010\u0003\u001a\u0004\b\"\u0010\u0017R \u0010'\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u0015\u0012\u0004\b&\u0010\u0003\u001a\u0004\b%\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/foundation/layout/i$a;", "", "<init>", "()V", "Landroidx/compose/ui/unit/h;", "space", "Landroidx/compose/foundation/layout/i$f;", "n", "(F)Landroidx/compose/foundation/layout/i$f;", "Landroidx/compose/ui/c$b;", "alignment", "Landroidx/compose/foundation/layout/i$e;", "o", "(FLandroidx/compose/ui/c$b;)Landroidx/compose/foundation/layout/i$e;", "Landroidx/compose/ui/c$c;", "Landroidx/compose/foundation/layout/i$m;", "p", "(FLandroidx/compose/ui/c$c;)Landroidx/compose/foundation/layout/i$m;", "a", "(Landroidx/compose/ui/c$b;)Landroidx/compose/foundation/layout/i$e;", "b", "Landroidx/compose/foundation/layout/i$e;", "d", "()Landroidx/compose/foundation/layout/i$e;", "e", "Left", "c", "Center", "f", "g", "Right", "j", "k", "SpaceBetween", "l", "m", "SpaceEvenly", "h", "i", "SpaceAround", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.m1
    @kotlin.jvm.internal.r1({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Absolute\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n154#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Absolute\n*L\n556#1:716\n*E\n"})
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final a f5083a = new a();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final e Left = new b();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final e Center = new C0093a();

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final e Right = new c();

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final e SpaceBetween = new e();

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final e SpaceEvenly = new f();

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final e SpaceAround = new d();

        /* renamed from: h, reason: collision with root package name */
        public static final int f5090h = 0;

        /* compiled from: Arrangement.kt */
        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/i$a$a", "Landroidx/compose/foundation/layout/i$e;", "Landroidx/compose/ui/unit/d;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/w;", "layoutDirection", "outPositions", "Lkotlin/k2;", "e", "(Landroidx/compose/ui/unit/d;I[ILandroidx/compose/ui/unit/w;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.layout.i$a$a, reason: collision with other inner class name */
        public static final class C0093a implements e {
            C0093a() {
            }

            @Override // androidx.compose.foundation.layout.i.e
            public void e(@fg.l androidx.compose.ui.unit.d dVar, int i4, @fg.l int[] iArr, @fg.l androidx.compose.ui.unit.w wVar, @fg.l int[] iArr2) {
                i.f5073a.t(i4, iArr, iArr2, false);
            }

            @fg.l
            public String toString() {
                return "AbsoluteArrangement#Center";
            }
        }

        /* compiled from: Arrangement.kt */
        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/i$a$b", "Landroidx/compose/foundation/layout/i$e;", "Landroidx/compose/ui/unit/d;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/w;", "layoutDirection", "outPositions", "Lkotlin/k2;", "e", "(Landroidx/compose/ui/unit/d;I[ILandroidx/compose/ui/unit/w;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b implements e {
            b() {
            }

            @Override // androidx.compose.foundation.layout.i.e
            public void e(@fg.l androidx.compose.ui.unit.d dVar, int i4, @fg.l int[] iArr, @fg.l androidx.compose.ui.unit.w wVar, @fg.l int[] iArr2) {
                i.f5073a.u(iArr, iArr2, false);
            }

            @fg.l
            public String toString() {
                return "AbsoluteArrangement#Left";
            }
        }

        /* compiled from: Arrangement.kt */
        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/i$a$c", "Landroidx/compose/foundation/layout/i$e;", "Landroidx/compose/ui/unit/d;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/w;", "layoutDirection", "outPositions", "Lkotlin/k2;", "e", "(Landroidx/compose/ui/unit/d;I[ILandroidx/compose/ui/unit/w;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class c implements e {
            c() {
            }

            @Override // androidx.compose.foundation.layout.i.e
            public void e(@fg.l androidx.compose.ui.unit.d dVar, int i4, @fg.l int[] iArr, @fg.l androidx.compose.ui.unit.w wVar, @fg.l int[] iArr2) {
                i.f5073a.v(i4, iArr, iArr2, false);
            }

            @fg.l
            public String toString() {
                return "AbsoluteArrangement#Right";
            }
        }

        /* compiled from: Arrangement.kt */
        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/i$a$d", "Landroidx/compose/foundation/layout/i$e;", "Landroidx/compose/ui/unit/d;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/w;", "layoutDirection", "outPositions", "Lkotlin/k2;", "e", "(Landroidx/compose/ui/unit/d;I[ILandroidx/compose/ui/unit/w;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class d implements e {
            d() {
            }

            @Override // androidx.compose.foundation.layout.i.e
            public void e(@fg.l androidx.compose.ui.unit.d dVar, int i4, @fg.l int[] iArr, @fg.l androidx.compose.ui.unit.w wVar, @fg.l int[] iArr2) {
                i.f5073a.w(i4, iArr, iArr2, false);
            }

            @fg.l
            public String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }
        }

        /* compiled from: Arrangement.kt */
        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/i$a$e", "Landroidx/compose/foundation/layout/i$e;", "Landroidx/compose/ui/unit/d;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/w;", "layoutDirection", "outPositions", "Lkotlin/k2;", "e", "(Landroidx/compose/ui/unit/d;I[ILandroidx/compose/ui/unit/w;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class e implements e {
            e() {
            }

            @Override // androidx.compose.foundation.layout.i.e
            public void e(@fg.l androidx.compose.ui.unit.d dVar, int i4, @fg.l int[] iArr, @fg.l androidx.compose.ui.unit.w wVar, @fg.l int[] iArr2) {
                i.f5073a.x(i4, iArr, iArr2, false);
            }

            @fg.l
            public String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }
        }

        /* compiled from: Arrangement.kt */
        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/i$a$f", "Landroidx/compose/foundation/layout/i$e;", "Landroidx/compose/ui/unit/d;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/w;", "layoutDirection", "outPositions", "Lkotlin/k2;", "e", "(Landroidx/compose/ui/unit/d;I[ILandroidx/compose/ui/unit/w;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class f implements e {
            f() {
            }

            @Override // androidx.compose.foundation.layout.i.e
            public void e(@fg.l androidx.compose.ui.unit.d dVar, int i4, @fg.l int[] iArr, @fg.l androidx.compose.ui.unit.w wVar, @fg.l int[] iArr2) {
                i.f5073a.y(i4, iArr, iArr2, false);
            }

            @fg.l
            public String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }
        }

        /* compiled from: Arrangement.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "size", "Landroidx/compose/ui/unit/w;", "layoutDirection", "a", "(ILandroidx/compose/ui/unit/w;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        static final class g extends kotlin.jvm.internal.n0 implements ld.p<Integer, androidx.compose.ui.unit.w, Integer> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c.b f5091b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(c.b bVar) {
                super(2);
                this.f5091b = bVar;
            }

            @fg.l
            public final Integer a(int i4, @fg.l androidx.compose.ui.unit.w wVar) {
                return Integer.valueOf(this.f5091b.a(0, i4, wVar));
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, androidx.compose.ui.unit.w wVar) {
                return a(num.intValue(), wVar);
            }
        }

        /* compiled from: Arrangement.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "size", "Landroidx/compose/ui/unit/w;", "layoutDirection", "a", "(ILandroidx/compose/ui/unit/w;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        static final class h extends kotlin.jvm.internal.n0 implements ld.p<Integer, androidx.compose.ui.unit.w, Integer> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c.b f5092b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(c.b bVar) {
                super(2);
                this.f5092b = bVar;
            }

            @fg.l
            public final Integer a(int i4, @fg.l androidx.compose.ui.unit.w wVar) {
                return Integer.valueOf(this.f5092b.a(0, i4, wVar));
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, androidx.compose.ui.unit.w wVar) {
                return a(num.intValue(), wVar);
            }
        }

        /* compiled from: Arrangement.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "size", "Landroidx/compose/ui/unit/w;", "<anonymous parameter 1>", "a", "(ILandroidx/compose/ui/unit/w;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.layout.i$a$i, reason: collision with other inner class name */
        static final class C0094i extends kotlin.jvm.internal.n0 implements ld.p<Integer, androidx.compose.ui.unit.w, Integer> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c.InterfaceC0326c f5093b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0094i(c.InterfaceC0326c interfaceC0326c) {
                super(2);
                this.f5093b = interfaceC0326c;
            }

            @fg.l
            public final Integer a(int i4, @fg.l androidx.compose.ui.unit.w wVar) {
                return Integer.valueOf(this.f5093b.a(0, i4));
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, androidx.compose.ui.unit.w wVar) {
                return a(num.intValue(), wVar);
            }
        }

        private a() {
        }

        @x4
        public static /* synthetic */ void c() {
        }

        @x4
        public static /* synthetic */ void e() {
        }

        @x4
        public static /* synthetic */ void g() {
        }

        @x4
        public static /* synthetic */ void i() {
        }

        @x4
        public static /* synthetic */ void k() {
        }

        @x4
        public static /* synthetic */ void m() {
        }

        @x4
        @fg.l
        public final e a(@fg.l c.b alignment) {
            return new j(androidx.compose.ui.unit.h.g(0), false, new g(alignment), null);
        }

        @fg.l
        public final e b() {
            return Center;
        }

        @fg.l
        public final e d() {
            return Left;
        }

        @fg.l
        public final e f() {
            return Right;
        }

        @fg.l
        public final e h() {
            return SpaceAround;
        }

        @fg.l
        public final e j() {
            return SpaceBetween;
        }

        @fg.l
        public final e l() {
            return SpaceEvenly;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @x4
        @fg.l
        public final f n(float space) {
            return new j(space, false, null, 0 == true ? 1 : 0);
        }

        @x4
        @fg.l
        public final e o(float space, @fg.l c.b alignment) {
            return new j(space, false, new h(alignment), null);
        }

        @x4
        @fg.l
        public final m p(float space, @fg.l c.InterfaceC0326c alignment) {
            return new j(space, false, new C0094i(alignment), null);
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/layout/i$b", "Landroidx/compose/foundation/layout/i$m;", "Landroidx/compose/ui/unit/d;", "", "totalSize", "", "sizes", "outPositions", "Lkotlin/k2;", "d", "(Landroidx/compose/ui/unit/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements m {
        b() {
        }

        @Override // androidx.compose.foundation.layout.i.m
        public void d(@fg.l androidx.compose.ui.unit.d dVar, int i4, @fg.l int[] iArr, @fg.l int[] iArr2) {
            i.f5073a.v(i4, iArr, iArr2, false);
        }

        @fg.l
        public String toString() {
            return "Arrangement#Bottom";
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"androidx/compose/foundation/layout/i$c", "Landroidx/compose/foundation/layout/i$f;", "Landroidx/compose/ui/unit/d;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/w;", "layoutDirection", "outPositions", "Lkotlin/k2;", "e", "(Landroidx/compose/ui/unit/d;I[ILandroidx/compose/ui/unit/w;[I)V", "d", "(Landroidx/compose/ui/unit/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/unit/h;", "a", "F", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Center$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n154#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Center$1\n*L\n191#1:716\n*E\n"})
    public static final class c implements f {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float spacing = androidx.compose.ui.unit.h.g(0);

        c() {
        }

        @Override // androidx.compose.foundation.layout.i.f, androidx.compose.foundation.layout.i.e, androidx.compose.foundation.layout.i.m
        /* renamed from: a, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.i.m
        public void d(@fg.l androidx.compose.ui.unit.d dVar, int i4, @fg.l int[] iArr, @fg.l int[] iArr2) {
            i.f5073a.t(i4, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.i.e
        public void e(@fg.l androidx.compose.ui.unit.d dVar, int i4, @fg.l int[] iArr, @fg.l androidx.compose.ui.unit.w wVar, @fg.l int[] iArr2) {
            if (wVar == androidx.compose.ui.unit.w.Ltr) {
                i.f5073a.t(i4, iArr, iArr2, false);
            } else {
                i.f5073a.t(i4, iArr, iArr2, true);
            }
        }

        @fg.l
        public String toString() {
            return "Arrangement#Center";
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/i$d", "Landroidx/compose/foundation/layout/i$e;", "Landroidx/compose/ui/unit/d;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/w;", "layoutDirection", "outPositions", "Lkotlin/k2;", "e", "(Landroidx/compose/ui/unit/d;I[ILandroidx/compose/ui/unit/w;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements e {
        d() {
        }

        @Override // androidx.compose.foundation.layout.i.e
        public void e(@fg.l androidx.compose.ui.unit.d dVar, int i4, @fg.l int[] iArr, @fg.l androidx.compose.ui.unit.w wVar, @fg.l int[] iArr2) {
            if (wVar == androidx.compose.ui.unit.w.Ltr) {
                i.f5073a.v(i4, iArr, iArr2, false);
            } else {
                i.f5073a.u(iArr, iArr2, true);
            }
        }

        @fg.l
        public String toString() {
            return "Arrangement#End";
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\r8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/i$e;", "", "Landroidx/compose/ui/unit/d;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/w;", "layoutDirection", "outPositions", "Lkotlin/k2;", "e", "(Landroidx/compose/ui/unit/d;I[ILandroidx/compose/ui/unit/w;[I)V", "Landroidx/compose/ui/unit/h;", "a", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @x4
    @kotlin.jvm.internal.r1({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n154#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n*L\n51#1:716\n*E\n"})
    public interface e {

        /* compiled from: Arrangement.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            @Deprecated
            public static float a(@fg.l e eVar) {
                return e.c(eVar);
            }
        }

        static float c(e eVar) {
            eVar.getClass();
            return androidx.compose.ui.unit.h.g(0);
        }

        /* renamed from: a */
        default float getSpacing() {
            return androidx.compose.ui.unit.h.g(0);
        }

        void e(@fg.l androidx.compose.ui.unit.d dVar, int i4, @fg.l int[] iArr, @fg.l androidx.compose.ui.unit.w wVar, @fg.l int[] iArr2);
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u00012\u00020\u0002R\u001a\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/i$f;", "Landroidx/compose/foundation/layout/i$e;", "Landroidx/compose/foundation/layout/i$m;", "Landroidx/compose/ui/unit/h;", "a", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @x4
    @kotlin.jvm.internal.r1({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n154#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n*L\n108#1:716\n*E\n"})
    public interface f extends e, m {

        /* compiled from: Arrangement.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            @Deprecated
            public static float a(@fg.l f fVar) {
                return f.f(fVar);
            }
        }

        static float f(f fVar) {
            fVar.getClass();
            return androidx.compose.ui.unit.h.g(0);
        }

        @Override // androidx.compose.foundation.layout.i.e, androidx.compose.foundation.layout.i.m
        /* renamed from: a */
        default float getSpacing() {
            return androidx.compose.ui.unit.h.g(0);
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"androidx/compose/foundation/layout/i$g", "Landroidx/compose/foundation/layout/i$f;", "Landroidx/compose/ui/unit/d;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/w;", "layoutDirection", "outPositions", "Lkotlin/k2;", "e", "(Landroidx/compose/ui/unit/d;I[ILandroidx/compose/ui/unit/w;[I)V", "d", "(Landroidx/compose/ui/unit/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/unit/h;", "a", "F", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceAround$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n154#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceAround$1\n*L\n279#1:716\n*E\n"})
    public static final class g implements f {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float spacing = androidx.compose.ui.unit.h.g(0);

        g() {
        }

        @Override // androidx.compose.foundation.layout.i.f, androidx.compose.foundation.layout.i.e, androidx.compose.foundation.layout.i.m
        /* renamed from: a, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.i.m
        public void d(@fg.l androidx.compose.ui.unit.d dVar, int i4, @fg.l int[] iArr, @fg.l int[] iArr2) {
            i.f5073a.w(i4, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.i.e
        public void e(@fg.l androidx.compose.ui.unit.d dVar, int i4, @fg.l int[] iArr, @fg.l androidx.compose.ui.unit.w wVar, @fg.l int[] iArr2) {
            if (wVar == androidx.compose.ui.unit.w.Ltr) {
                i.f5073a.w(i4, iArr, iArr2, false);
            } else {
                i.f5073a.w(i4, iArr, iArr2, true);
            }
        }

        @fg.l
        public String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"androidx/compose/foundation/layout/i$h", "Landroidx/compose/foundation/layout/i$f;", "Landroidx/compose/ui/unit/d;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/w;", "layoutDirection", "outPositions", "Lkotlin/k2;", "e", "(Landroidx/compose/ui/unit/d;I[ILandroidx/compose/ui/unit/w;[I)V", "d", "(Landroidx/compose/ui/unit/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/unit/h;", "a", "F", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceBetween$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n154#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceBetween$1\n*L\n249#1:716\n*E\n"})
    public static final class h implements f {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float spacing = androidx.compose.ui.unit.h.g(0);

        h() {
        }

        @Override // androidx.compose.foundation.layout.i.f, androidx.compose.foundation.layout.i.e, androidx.compose.foundation.layout.i.m
        /* renamed from: a, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.i.m
        public void d(@fg.l androidx.compose.ui.unit.d dVar, int i4, @fg.l int[] iArr, @fg.l int[] iArr2) {
            i.f5073a.x(i4, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.i.e
        public void e(@fg.l androidx.compose.ui.unit.d dVar, int i4, @fg.l int[] iArr, @fg.l androidx.compose.ui.unit.w wVar, @fg.l int[] iArr2) {
            if (wVar == androidx.compose.ui.unit.w.Ltr) {
                i.f5073a.x(i4, iArr, iArr2, false);
            } else {
                i.f5073a.x(i4, iArr, iArr2, true);
            }
        }

        @fg.l
        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"androidx/compose/foundation/layout/i$i", "Landroidx/compose/foundation/layout/i$f;", "Landroidx/compose/ui/unit/d;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/w;", "layoutDirection", "outPositions", "Lkotlin/k2;", "e", "(Landroidx/compose/ui/unit/d;I[ILandroidx/compose/ui/unit/w;[I)V", "d", "(Landroidx/compose/ui/unit/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/unit/h;", "a", "F", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceEvenly$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n154#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceEvenly$1\n*L\n220#1:716\n*E\n"})
    /* renamed from: androidx.compose.foundation.layout.i$i, reason: collision with other inner class name */
    public static final class C0095i implements f {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float spacing = androidx.compose.ui.unit.h.g(0);

        C0095i() {
        }

        @Override // androidx.compose.foundation.layout.i.f, androidx.compose.foundation.layout.i.e, androidx.compose.foundation.layout.i.m
        /* renamed from: a, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.i.m
        public void d(@fg.l androidx.compose.ui.unit.d dVar, int i4, @fg.l int[] iArr, @fg.l int[] iArr2) {
            i.f5073a.y(i4, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.i.e
        public void e(@fg.l androidx.compose.ui.unit.d dVar, int i4, @fg.l int[] iArr, @fg.l androidx.compose.ui.unit.w wVar, @fg.l int[] iArr2) {
            if (wVar == androidx.compose.ui.unit.w.Ltr) {
                i.f5073a.y(i4, iArr, iArr2, false);
            } else {
                i.f5073a.y(i4, iArr, iArr2, true);
            }
        }

        @fg.l
        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0013\u001a\u00020\u0012*\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0015\u001a\u00020\u0012*\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJE\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001dR+\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u001fR \u00101\u001a\u00020\u00028\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0015\u0010)\u001a\u0004\b(\u0010\u001b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Landroidx/compose/foundation/layout/i$j;", "Landroidx/compose/foundation/layout/i$f;", "Landroidx/compose/ui/unit/h;", "space", "", "rtlMirror", "Lkotlin/Function2;", "", "Landroidx/compose/ui/unit/w;", "alignment", "<init>", "(FZLld/p;Lkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/unit/d;", "totalSize", "", "sizes", "layoutDirection", "outPositions", "Lkotlin/k2;", "e", "(Landroidx/compose/ui/unit/d;I[ILandroidx/compose/ui/unit/w;[I)V", "d", "(Landroidx/compose/ui/unit/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "g", "()F", "h", "()Z", "i", "()Lld/p;", "j", "(FZLld/p;)Landroidx/compose/foundation/layout/i$j;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "n", "b", "Z", "m", "c", "Lld/p;", "l", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.m1
    @kotlin.jvm.internal.r1({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n+ 2 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,715:1\n706#2,2:716\n709#2,5:721\n13674#3,3:718\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n*L\n586#1:716,2\n586#1:721,5\n586#1:718,3\n*E\n"})
    public static final /* data */ class j implements f {

        /* renamed from: e, reason: collision with root package name */
        public static final int f5098e = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float space;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean rtlMirror;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private final ld.p<Integer, androidx.compose.ui.unit.w, Integer> alignment;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float spacing;

        public /* synthetic */ j(float f4, boolean z4, ld.p pVar, kotlin.jvm.internal.w wVar) {
            this(f4, z4, pVar);
        }

        public static j k(j jVar, float f4, boolean z4, ld.p pVar, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f4 = jVar.space;
            }
            if ((i4 & 2) != 0) {
                z4 = jVar.rtlMirror;
            }
            if ((i4 & 4) != 0) {
                pVar = jVar.alignment;
            }
            jVar.getClass();
            return new j(f4, z4, pVar);
        }

        @Override // androidx.compose.foundation.layout.i.f, androidx.compose.foundation.layout.i.e, androidx.compose.foundation.layout.i.m
        /* renamed from: a, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.i.m
        public void d(@fg.l androidx.compose.ui.unit.d dVar, int i4, @fg.l int[] iArr, @fg.l int[] iArr2) {
            e(dVar, i4, iArr, androidx.compose.ui.unit.w.Ltr, iArr2);
        }

        @Override // androidx.compose.foundation.layout.i.e
        public void e(@fg.l androidx.compose.ui.unit.d dVar, int i4, @fg.l int[] iArr, @fg.l androidx.compose.ui.unit.w wVar, @fg.l int[] iArr2) {
            int i5;
            int i6;
            if (iArr.length == 0) {
                return;
            }
            int q22 = dVar.q2(this.space);
            boolean z4 = this.rtlMirror && wVar == androidx.compose.ui.unit.w.Rtl;
            i iVar = i.f5073a;
            if (z4) {
                i5 = 0;
                i6 = 0;
                for (int length = iArr.length - 1; -1 < length; length--) {
                    int i7 = iArr[length];
                    int min = Math.min(i5, i4 - i7);
                    iArr2[length] = min;
                    i6 = Math.min(q22, (i4 - min) - i7);
                    i5 = iArr2[length] + i7 + i6;
                }
            } else {
                int length2 = iArr.length;
                int i10 = 0;
                i5 = 0;
                i6 = 0;
                int i11 = 0;
                while (i10 < length2) {
                    int i12 = iArr[i10];
                    int min2 = Math.min(i5, i4 - i12);
                    iArr2[i11] = min2;
                    int min3 = Math.min(q22, (i4 - min2) - i12);
                    int i13 = iArr2[i11] + i12 + min3;
                    i10++;
                    i11++;
                    i6 = min3;
                    i5 = i13;
                }
            }
            int i14 = i5 - i6;
            ld.p<Integer, androidx.compose.ui.unit.w, Integer> pVar = this.alignment;
            if (pVar == null || i14 >= i4) {
                return;
            }
            int intValue = pVar.invoke(Integer.valueOf(i4 - i14), wVar).intValue();
            int length3 = iArr2.length;
            for (int i15 = 0; i15 < length3; i15++) {
                iArr2[i15] = iArr2[i15] + intValue;
            }
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return androidx.compose.ui.unit.h.l(this.space, jVar.space) && this.rtlMirror == jVar.rtlMirror && kotlin.jvm.internal.l0.g(this.alignment, jVar.alignment);
        }

        /* renamed from: g, reason: from getter */
        public final float getSpace() {
            return this.space;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getRtlMirror() {
            return this.rtlMirror;
        }

        public int hashCode() {
            int a5 = androidx.compose.animation.d1.a(this.rtlMirror, androidx.compose.ui.unit.h.n(this.space) * 31, 31);
            ld.p<Integer, androidx.compose.ui.unit.w, Integer> pVar = this.alignment;
            return a5 + (pVar == null ? 0 : pVar.hashCode());
        }

        @fg.m
        public final ld.p<Integer, androidx.compose.ui.unit.w, Integer> i() {
            return this.alignment;
        }

        @fg.l
        public final j j(float space, boolean rtlMirror, @fg.m ld.p<? super Integer, ? super androidx.compose.ui.unit.w, Integer> alignment) {
            return new j(space, rtlMirror, alignment);
        }

        @fg.m
        public final ld.p<Integer, androidx.compose.ui.unit.w, Integer> l() {
            return this.alignment;
        }

        public final boolean m() {
            return this.rtlMirror;
        }

        public final float n() {
            return this.space;
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.rtlMirror ? "" : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            androidx.compose.foundation.b0.a(this.space, sb, ", ");
            sb.append(this.alignment);
            sb.append(')');
            return sb.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private j(float f4, boolean z4, ld.p<? super Integer, ? super androidx.compose.ui.unit.w, Integer> pVar) {
            this.space = f4;
            this.rtlMirror = z4;
            this.alignment = pVar;
            this.spacing = f4;
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/i$k", "Landroidx/compose/foundation/layout/i$e;", "Landroidx/compose/ui/unit/d;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/w;", "layoutDirection", "outPositions", "Lkotlin/k2;", "e", "(Landroidx/compose/ui/unit/d;I[ILandroidx/compose/ui/unit/w;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class k implements e {
        k() {
        }

        @Override // androidx.compose.foundation.layout.i.e
        public void e(@fg.l androidx.compose.ui.unit.d dVar, int i4, @fg.l int[] iArr, @fg.l androidx.compose.ui.unit.w wVar, @fg.l int[] iArr2) {
            if (wVar == androidx.compose.ui.unit.w.Ltr) {
                i.f5073a.u(iArr, iArr2, false);
            } else {
                i.f5073a.v(i4, iArr, iArr2, true);
            }
        }

        @fg.l
        public String toString() {
            return "Arrangement#Start";
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/layout/i$l", "Landroidx/compose/foundation/layout/i$m;", "Landroidx/compose/ui/unit/d;", "", "totalSize", "", "sizes", "outPositions", "Lkotlin/k2;", "d", "(Landroidx/compose/ui/unit/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class l implements m {
        l() {
        }

        @Override // androidx.compose.foundation.layout.i.m
        public void d(@fg.l androidx.compose.ui.unit.d dVar, int i4, @fg.l int[] iArr, @fg.l int[] iArr2) {
            i.f5073a.u(iArr, iArr2, false);
        }

        @fg.l
        public String toString() {
            return "Arrangement#Top";
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/i$m;", "", "Landroidx/compose/ui/unit/d;", "", "totalSize", "", "sizes", "outPositions", "Lkotlin/k2;", "d", "(Landroidx/compose/ui/unit/d;I[I[I)V", "Landroidx/compose/ui/unit/h;", "a", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @x4
    @kotlin.jvm.internal.r1({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n154#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n*L\n80#1:716\n*E\n"})
    public interface m {

        /* compiled from: Arrangement.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            @Deprecated
            public static float a(@fg.l m mVar) {
                return m.b(mVar);
            }
        }

        static float b(m mVar) {
            mVar.getClass();
            return androidx.compose.ui.unit.h.g(0);
        }

        /* renamed from: a */
        default float getSpacing() {
            return androidx.compose.ui.unit.h.g(0);
        }

        void d(@fg.l androidx.compose.ui.unit.d dVar, int i4, @fg.l int[] iArr, @fg.l int[] iArr2);
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "size", "Landroidx/compose/ui/unit/w;", "layoutDirection", "a", "(ILandroidx/compose/ui/unit/w;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class n extends kotlin.jvm.internal.n0 implements ld.p<Integer, androidx.compose.ui.unit.w, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.b f5103b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(c.b bVar) {
            super(2);
            this.f5103b = bVar;
        }

        @fg.l
        public final Integer a(int i4, @fg.l androidx.compose.ui.unit.w wVar) {
            return Integer.valueOf(this.f5103b.a(0, i4, wVar));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, androidx.compose.ui.unit.w wVar) {
            return a(num.intValue(), wVar);
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "size", "Landroidx/compose/ui/unit/w;", "<anonymous parameter 1>", "a", "(ILandroidx/compose/ui/unit/w;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class o extends kotlin.jvm.internal.n0 implements ld.p<Integer, androidx.compose.ui.unit.w, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.InterfaceC0326c f5104b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(c.InterfaceC0326c interfaceC0326c) {
            super(2);
            this.f5104b = interfaceC0326c;
        }

        @fg.l
        public final Integer a(int i4, @fg.l androidx.compose.ui.unit.w wVar) {
            return Integer.valueOf(this.f5104b.a(0, i4));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, androidx.compose.ui.unit.w wVar) {
            return a(num.intValue(), wVar);
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "size", "Landroidx/compose/ui/unit/w;", "layoutDirection", "a", "(ILandroidx/compose/ui/unit/w;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class p extends kotlin.jvm.internal.n0 implements ld.p<Integer, androidx.compose.ui.unit.w, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final p f5105b = new p(2);

        p() {
            super(2);
        }

        @fg.l
        public final Integer a(int i4, @fg.l androidx.compose.ui.unit.w wVar) {
            return Integer.valueOf(androidx.compose.ui.c.INSTANCE.u().a(0, i4, wVar));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, androidx.compose.ui.unit.w wVar) {
            return a(num.intValue(), wVar);
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "size", "Landroidx/compose/ui/unit/w;", "layoutDirection", "a", "(ILandroidx/compose/ui/unit/w;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class q extends kotlin.jvm.internal.n0 implements ld.p<Integer, androidx.compose.ui.unit.w, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.b f5106b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(c.b bVar) {
            super(2);
            this.f5106b = bVar;
        }

        @fg.l
        public final Integer a(int i4, @fg.l androidx.compose.ui.unit.w wVar) {
            return Integer.valueOf(this.f5106b.a(0, i4, wVar));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, androidx.compose.ui.unit.w wVar) {
            return a(num.intValue(), wVar);
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "size", "Landroidx/compose/ui/unit/w;", "<anonymous parameter 1>", "a", "(ILandroidx/compose/ui/unit/w;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class r extends kotlin.jvm.internal.n0 implements ld.p<Integer, androidx.compose.ui.unit.w, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.InterfaceC0326c f5107b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(c.InterfaceC0326c interfaceC0326c) {
            super(2);
            this.f5107b = interfaceC0326c;
        }

        @fg.l
        public final Integer a(int i4, @fg.l androidx.compose.ui.unit.w wVar) {
            return Integer.valueOf(this.f5107b.a(0, i4));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, androidx.compose.ui.unit.w wVar) {
            return a(num.intValue(), wVar);
        }
    }

    private i() {
    }

    private final void c(int[] iArr, boolean z4, ld.p<? super Integer, ? super Integer, kotlin.k2> pVar) {
        if (!z4) {
            int length = iArr.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                pVar.invoke(Integer.valueOf(i5), Integer.valueOf(iArr[i4]));
                i4++;
                i5++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            } else {
                pVar.invoke(Integer.valueOf(length2), Integer.valueOf(iArr[length2]));
            }
        }
    }

    @x4
    public static /* synthetic */ void e() {
    }

    @x4
    public static /* synthetic */ void g() {
    }

    @x4
    public static /* synthetic */ void i() {
    }

    @x4
    public static /* synthetic */ void k() {
    }

    @x4
    public static /* synthetic */ void m() {
    }

    @x4
    public static /* synthetic */ void o() {
    }

    @x4
    public static /* synthetic */ void q() {
    }

    @x4
    public static /* synthetic */ void s() {
    }

    @x4
    @fg.l
    public final e A(float space, @fg.l c.b alignment) {
        return new j(space, true, new q(alignment), null);
    }

    @x4
    @fg.l
    public final m B(float space, @fg.l c.InterfaceC0326c alignment) {
        return new j(space, false, new r(alignment), null);
    }

    @x4
    @fg.l
    public final e a(@fg.l c.b alignment) {
        return new j(androidx.compose.ui.unit.h.g(0), true, new n(alignment), null);
    }

    @x4
    @fg.l
    public final m b(@fg.l c.InterfaceC0326c alignment) {
        return new j(androidx.compose.ui.unit.h.g(0), false, new o(alignment), null);
    }

    @fg.l
    public final m d() {
        return Bottom;
    }

    @fg.l
    public final f f() {
        return Center;
    }

    @fg.l
    public final e h() {
        return End;
    }

    @fg.l
    public final f j() {
        return SpaceAround;
    }

    @fg.l
    public final f l() {
        return SpaceBetween;
    }

    @fg.l
    public final f n() {
        return SpaceEvenly;
    }

    @fg.l
    public final e p() {
        return Start;
    }

    @fg.l
    public final m r() {
        return Top;
    }

    public final void t(int totalSize, @fg.l int[] size, @fg.l int[] outPosition, boolean reverseInput) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 : size) {
            i5 += i6;
        }
        float f4 = (totalSize - i5) / 2;
        if (!reverseInput) {
            int length = size.length;
            int i7 = 0;
            while (i4 < length) {
                int i10 = size[i4];
                outPosition[i7] = kotlin.math.b.L0(f4);
                f4 += i10;
                i4++;
                i7++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i11 = size[length2];
            outPosition[length2] = kotlin.math.b.L0(f4);
            f4 += i11;
        }
    }

    public final void u(@fg.l int[] size, @fg.l int[] outPosition, boolean reverseInput) {
        int i4 = 0;
        if (!reverseInput) {
            int length = size.length;
            int i5 = 0;
            int i6 = 0;
            while (i4 < length) {
                int i7 = size[i4];
                outPosition[i5] = i6;
                i6 += i7;
                i4++;
                i5++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i10 = size[length2];
            outPosition[length2] = i4;
            i4 += i10;
        }
    }

    public final void v(int totalSize, @fg.l int[] size, @fg.l int[] outPosition, boolean reverseInput) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 : size) {
            i5 += i6;
        }
        int i7 = totalSize - i5;
        if (!reverseInput) {
            int length = size.length;
            int i10 = 0;
            while (i4 < length) {
                int i11 = size[i4];
                outPosition[i10] = i7;
                i7 += i11;
                i4++;
                i10++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i12 = size[length2];
            outPosition[length2] = i7;
            i7 += i12;
        }
    }

    public final void w(int totalSize, @fg.l int[] size, @fg.l int[] outPosition, boolean reverseInput) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 : size) {
            i5 += i6;
        }
        float length = !(size.length == 0) ? (totalSize - i5) / size.length : 0.0f;
        float f4 = length / 2;
        if (reverseInput) {
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i7 = size[length2];
                outPosition[length2] = kotlin.math.b.L0(f4);
                f4 += i7 + length;
            }
            return;
        }
        int length3 = size.length;
        int i10 = 0;
        while (i4 < length3) {
            int i11 = size[i4];
            outPosition[i10] = kotlin.math.b.L0(f4);
            f4 += i11 + length;
            i4++;
            i10++;
        }
    }

    public final void x(int totalSize, @fg.l int[] size, @fg.l int[] outPosition, boolean reverseInput) {
        if (size.length == 0) {
            return;
        }
        int i4 = 0;
        int i5 = 0;
        for (int i6 : size) {
            i5 += i6;
        }
        float max = (totalSize - i5) / Math.max(kotlin.collections.l.ue(size), 1);
        float f4 = (reverseInput && size.length == 1) ? max : 0.0f;
        if (reverseInput) {
            for (int length = size.length - 1; -1 < length; length--) {
                int i7 = size[length];
                outPosition[length] = kotlin.math.b.L0(f4);
                f4 += i7 + max;
            }
            return;
        }
        int length2 = size.length;
        int i10 = 0;
        while (i4 < length2) {
            int i11 = size[i4];
            outPosition[i10] = kotlin.math.b.L0(f4);
            f4 += i11 + max;
            i4++;
            i10++;
        }
    }

    public final void y(int totalSize, @fg.l int[] size, @fg.l int[] outPosition, boolean reverseInput) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 : size) {
            i5 += i6;
        }
        float length = (totalSize - i5) / (size.length + 1);
        if (reverseInput) {
            float f4 = length;
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i7 = size[length2];
                outPosition[length2] = kotlin.math.b.L0(f4);
                f4 += i7 + length;
            }
            return;
        }
        int length3 = size.length;
        float f5 = length;
        int i10 = 0;
        while (i4 < length3) {
            int i11 = size[i4];
            outPosition[i10] = kotlin.math.b.L0(f5);
            f5 += i11 + length;
            i4++;
            i10++;
        }
    }

    @x4
    @fg.l
    public final f z(float space) {
        return new j(space, true, p.f5105b, null);
    }
}

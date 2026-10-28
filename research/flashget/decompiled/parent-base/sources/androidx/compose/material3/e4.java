package androidx.compose.material3;

import androidx.compose.foundation.layout.i;
import androidx.compose.material3.p4;
import androidx.compose.material3.t9;
import androidx.compose.material3.x7;
import androidx.compose.ui.c;
import androidx.compose.ui.node.g;
import java.util.Locale;
import kotlin.Metadata;
import org.eclipse.paho.client.mqttv3.internal.ClientDefaults;

/* compiled from: DateRangePicker.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0087\u0001\u0010\u0016\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u00122\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u00122\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0018\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J@\u0010\u001a\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/material3/e4;", "", "<init>", "()V", "", "selectedStartDateMillis", "selectedEndDateMillis", "Landroidx/compose/material3/p4;", "displayMode", "Landroidx/compose/material3/x3;", "dateFormatter", "Landroidx/compose/ui/q;", "modifier", "", "startDateText", "endDateText", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "startDatePlaceholder", "endDatePlaceholder", "datesDelimiter", "a", "(Ljava/lang/Long;Ljava/lang/Long;ILandroidx/compose/material3/x3;Landroidx/compose/ui/q;Ljava/lang/String;Ljava/lang/String;Lld/p;Lld/p;Lld/p;Landroidx/compose/runtime/t;II)V", "c", "(ILandroidx/compose/ui/q;Landroidx/compose/runtime/t;II)V", "b", "(Ljava/lang/Long;Ljava/lang/Long;ILandroidx/compose/material3/x3;Landroidx/compose/ui/q;Landroidx/compose/runtime/t;II)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.x4
@f5
@kotlin.jvm.internal.r1({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerDefaults\n+ 2 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1099:1\n109#2:1100\n121#2:1101\n111#2:1102\n113#2:1103\n81#2:1104\n97#2:1105\n81#2:1106\n97#2:1107\n1116#3,6:1108\n154#4:1114\n91#5,2:1115\n93#5:1145\n97#5:1150\n78#6,11:1117\n91#6:1149\n456#7,8:1128\n464#7,3:1142\n467#7,3:1146\n3737#8,6:1136\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerDefaults\n*L\n343#1:1100\n348#1:1101\n374#1:1102\n375#1:1103\n443#1:1104\n444#1:1105\n453#1:1106\n454#1:1107\n462#1:1108,6\n467#1:1114\n461#1:1115,2\n461#1:1145\n461#1:1150\n461#1:1117,11\n461#1:1149\n461#1:1128,8\n461#1:1142,3\n461#1:1146,3\n461#1:1136,6\n*E\n"})
/* loaded from: classes.dex */
public final class e4 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final e4 f10614a = new e4();

    /* renamed from: b, reason: collision with root package name */
    public static final int f10615b = 0;

    /* compiled from: DateRangePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10616b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(2);
            this.f10616b = str;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(482821121, i4, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline.<anonymous> (DateRangePicker.kt:383)");
            }
            xa.c(this.f10616b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tVar, 0, 0, 131070);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DateRangePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10617b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(2);
            this.f10617b = str;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1522669758, i4, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline.<anonymous> (DateRangePicker.kt:384)");
            }
            xa.c(this.f10617b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tVar, 0, 0, 131070);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DateRangePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f10619c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Long f10620d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f10621e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ x3 f10622f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f10623g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f10624h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f10625i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Long l4, Long l5, int i4, x3 x3Var, androidx.compose.ui.q qVar, int i5, int i6) {
            super(2);
            this.f10619c = l4;
            this.f10620d = l5;
            this.f10621e = i4;
            this.f10622f = x3Var;
            this.f10623g = qVar;
            this.f10624h = i5;
            this.f10625i = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            e4.this.b(this.f10619c, this.f10620d, this.f10621e, this.f10622f, this.f10623g, tVar, androidx.compose.runtime.g3.b(this.f10624h | 1), this.f10625i);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DateRangePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10626b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f10627c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2) {
            super(1);
            this.f10626b = str;
            this.f10627c = str2;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.g.INSTANCE.getClass();
            androidx.compose.ui.semantics.w.g1(zVar, androidx.compose.ui.semantics.g.f20299c);
            androidx.compose.ui.semantics.w.a1(zVar, this.f10626b + ", " + this.f10627c);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DateRangePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f10629c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Long f10630d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f10631e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ x3 f10632f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f10633g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f10634h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f10635i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f10636j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f10637k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f10638l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f10639m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f10640n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Long l4, Long l5, int i4, x3 x3Var, androidx.compose.ui.q qVar, String str, String str2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, int i5, int i6) {
            super(2);
            this.f10629c = l4;
            this.f10630d = l5;
            this.f10631e = i4;
            this.f10632f = x3Var;
            this.f10633g = qVar;
            this.f10634h = str;
            this.f10635i = str2;
            this.f10636j = pVar;
            this.f10637k = pVar2;
            this.f10638l = pVar3;
            this.f10639m = i5;
            this.f10640n = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            e4.this.a(this.f10629c, this.f10630d, this.f10631e, this.f10632f, this.f10633g, this.f10634h, this.f10635i, this.f10636j, this.f10637k, this.f10638l, tVar, androidx.compose.runtime.g3.b(this.f10639m | 1), androidx.compose.runtime.g3.b(this.f10640n));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DateRangePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f10642c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f10643d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f10644e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f10645f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i4, androidx.compose.ui.q qVar, int i5, int i6) {
            super(2);
            this.f10642c = i4;
            this.f10643d = qVar;
            this.f10644e = i5;
            this.f10645f = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            e4.this.c(this.f10642c, this.f10643d, tVar, androidx.compose.runtime.g3.b(this.f10644e | 1), this.f10645f);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    private e4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public final void a(Long l4, Long l5, int i4, x3 x3Var, androidx.compose.ui.q qVar, String str, String str2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, androidx.compose.runtime.t tVar, int i5, int i6) {
        int i7;
        androidx.compose.runtime.t tVar2;
        androidx.compose.runtime.t o4 = tVar.o(-820363420);
        if ((i5 & 6) == 0) {
            i7 = (o4.q0(l4) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= o4.q0(l5) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= o4.f(i4) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= (i5 & 4096) == 0 ? o4.q0(x3Var) : o4.S(x3Var) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= o4.q0(qVar) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i7 |= o4.q0(str) ? 131072 : 65536;
        }
        if ((1572864 & i5) == 0) {
            i7 |= o4.q0(str2) ? 1048576 : 524288;
        }
        if ((12582912 & i5) == 0) {
            i7 |= o4.S(pVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i5) == 0) {
            i7 |= o4.S(pVar2) ? androidx.core.view.accessibility.b.f26943s : 33554432;
        }
        if ((805306368 & i5) == 0) {
            i7 |= o4.S(pVar3) ? 536870912 : ClientDefaults.MAX_MSG_SIZE;
        }
        int i10 = i7;
        if ((306783379 & i10) == 306783378 && (i6 & 1) == 0 && o4.p()) {
            o4.d0();
            tVar2 = o4;
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-820363420, i10, i6, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:425)");
            }
            Locale a5 = androidx.compose.material3.a.a(o4, 0);
            String a6 = x3.a(x3Var, l4, a5, false, 4, null);
            String a7 = x3.a(x3Var, l5, a5, false, 4, null);
            String c5 = x3Var.c(l4, a5, true);
            tVar2 = o4;
            tVar2.P(-1212631660);
            String str3 = "";
            if (c5 == null) {
                p4.Companion companion = p4.INSTANCE;
                companion.getClass();
                if (p4.f(i4, p4.f13206c)) {
                    tVar2.P(-1212631439);
                    t9.Companion companion2 = t9.INSTANCE;
                    String a8 = v9.a(x7.a.f15609q, tVar2, 0);
                    tVar2.p0();
                    c5 = a8;
                } else {
                    companion.getClass();
                    if (p4.f(i4, p4.f13207d)) {
                        tVar2.P(-1212631354);
                        t9.Companion companion3 = t9.INSTANCE;
                        c5 = v9.a(x7.a.f15604l, tVar2, 0);
                        tVar2.p0();
                    } else {
                        tVar2.P(1063135767);
                        tVar2.p0();
                        c5 = "";
                    }
                }
            }
            tVar2.p0();
            String c6 = x3Var.c(l5, a5, true);
            tVar2.P(-1212631233);
            if (c6 == null) {
                p4.Companion companion4 = p4.INSTANCE;
                companion4.getClass();
                if (p4.f(i4, p4.f13206c)) {
                    tVar2.P(-1212631014);
                    t9.Companion companion5 = t9.INSTANCE;
                    str3 = v9.a(x7.a.f15609q, tVar2, 0);
                    tVar2.p0();
                } else {
                    companion4.getClass();
                    if (p4.f(i4, p4.f13207d)) {
                        tVar2.P(-1212630929);
                        t9.Companion companion6 = t9.INSTANCE;
                        str3 = v9.a(x7.a.f15604l, tVar2, 0);
                        tVar2.p0();
                    } else {
                        tVar2.P(1063148942);
                        tVar2.p0();
                    }
                }
            } else {
                str3 = c6;
            }
            tVar2.p0();
            String str4 = str + ": " + c5;
            String str5 = str2 + ": " + str3;
            tVar2.P(-1212630615);
            boolean q02 = tVar2.q0(str4) | tVar2.q0(str5);
            Object Q = tVar2.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new d(str4, str5);
                tVar2.E(Q);
            }
            tVar2.p0();
            androidx.compose.ui.q c7 = androidx.compose.ui.semantics.o.c(qVar, (ld.l) Q);
            c.InterfaceC0326c q4 = androidx.compose.ui.c.INSTANCE.q();
            i.f z4 = androidx.compose.foundation.layout.i.f5073a.z(androidx.compose.ui.unit.h.g(4));
            tVar2.P(693286680);
            androidx.compose.ui.layout.m0 d5 = androidx.compose.foundation.layout.w1.d(z4, q4, tVar2, 54);
            tVar2.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar2, 0);
            androidx.compose.runtime.g0 B = tVar2.B();
            g.Companion companion7 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a10 = companion7.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(c7);
            if (tVar2.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar2.W();
            if (tVar2.getInserting()) {
                tVar2.F(a10);
            } else {
                tVar2.C();
            }
            ld.p a11 = androidx.compose.animation.p.a(companion7, tVar2, d5, tVar2, B);
            if (tVar2.getInserting() || !kotlin.jvm.internal.l0.g(tVar2.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar2, j4, a11);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar2), tVar2, 2058660585);
            androidx.compose.foundation.layout.y1 y1Var = androidx.compose.foundation.layout.y1.f5410a;
            if (a6 != null) {
                tVar2.P(1922100124);
                xa.c(a6, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tVar2, 0, 0, 131070);
                tVar2.p0();
            } else {
                tVar2.P(1922100193);
                pVar.invoke(tVar2, Integer.valueOf((i10 >> 21) & 14));
                tVar2.p0();
            }
            pVar3.invoke(tVar2, Integer.valueOf((i10 >> 27) & 14));
            if (a7 != null) {
                tVar2.P(1922100319);
                xa.c(a7, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tVar2, 0, 0, 131070);
                tVar2.p0();
            } else {
                tVar2.P(1922100386);
                pVar2.invoke(tVar2, Integer.valueOf((i10 >> 24) & 14));
                tVar2.p0();
            }
            if (t.a(tVar2)) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = tVar2.t();
        if (t4 != null) {
            t4.a(new e(l4, l5, i4, x3Var, qVar, str, str2, pVar, pVar2, pVar3, i5, i6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(@fg.m java.lang.Long r22, @fg.m java.lang.Long r23, int r24, @fg.l androidx.compose.material3.x3 r25, @fg.m androidx.compose.ui.q r26, @fg.m androidx.compose.runtime.t r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.e4.b(java.lang.Long, java.lang.Long, int, androidx.compose.material3.x3, androidx.compose.ui.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r30, @fg.m androidx.compose.ui.q r31, @fg.m androidx.compose.runtime.t r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.e4.c(int, androidx.compose.ui.q, androidx.compose.runtime.t, int, int):void");
    }
}

package androidx.compose.material3;

import androidx.compose.foundation.interaction.a;
import androidx.compose.foundation.interaction.m;
import androidx.compose.ui.graphics.i6;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Slider.kt */
@androidx.compose.runtime.x4
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0010\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014Jv\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJB\u0010&\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'J5\u0010*\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b*\u0010+J5\u0010.\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020,2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b.\u0010/J5\u00102\u001a\u00020\u000f2\u0006\u00101\u001a\u0002002\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b2\u00103R\u0018\u00107\u001a\u00020\u0012*\u0002048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u00106\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"Landroidx/compose/material3/f9;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/drawscope/f;", "", "tickFractions", "", "activeRangeStart", "activeRangeEnd", "Landroidx/compose/ui/graphics/d2;", "inactiveTrackColor", "activeTrackColor", "inactiveTickColor", "activeTickColor", "Lkotlin/k2;", "h", "(Landroidx/compose/ui/graphics/drawscope/f;[FFFJJJJ)V", "Landroidx/compose/material3/d9;", "f", "(Landroidx/compose/runtime/t;I)Landroidx/compose/material3/d9;", "thumbColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "g", "(JJJJJJJJJJLandroidx/compose/runtime/t;III)Landroidx/compose/material3/d9;", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "Landroidx/compose/ui/q;", "modifier", "colors", "", "enabled", "Landroidx/compose/ui/unit/l;", "thumbSize", "a", "(Landroidx/compose/foundation/interaction/k;Landroidx/compose/ui/q;Landroidx/compose/material3/d9;ZJLandroidx/compose/runtime/t;II)V", "Landroidx/compose/material3/h9;", "sliderPositions", "c", "(Landroidx/compose/material3/h9;Landroidx/compose/ui/q;Landroidx/compose/material3/d9;ZLandroidx/compose/runtime/t;II)V", "Landroidx/compose/material3/j9;", "sliderState", "d", "(Landroidx/compose/material3/j9;Landroidx/compose/ui/q;Landroidx/compose/material3/d9;ZLandroidx/compose/runtime/t;II)V", "Landroidx/compose/material3/d8;", "rangeSliderState", "b", "(Landroidx/compose/material3/d8;Landroidx/compose/ui/q;Landroidx/compose/material3/d9;ZLandroidx/compose/runtime/t;II)V", "Landroidx/compose/material3/a3;", "i", "(Landroidx/compose/material3/a3;)Landroidx/compose/material3/d9;", "defaultSliderColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2151:1\n1116#2,6:2152\n1116#2,6:2158\n1116#2,6:2166\n1116#2,6:2172\n1116#2,6:2178\n75#3:2164\n154#4:2165\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults\n*L\n988#1:2152,6\n989#1:2158,6\n1055#1:2166,6\n1133#1:2172,6\n1173#1:2178,6\n1017#1:2164\n1021#1:2165\n*E\n"})
/* loaded from: classes.dex */
public final class f9 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final f9 f10692a = new f9();

    /* renamed from: b, reason: collision with root package name */
    public static final int f10693b = 0;

    /* compiled from: Slider.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SliderDefaults$Thumb$1$1", f = "Slider.kt", i = {}, l = {990}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f10694b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f10695c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.snapshots.b0<androidx.compose.foundation.interaction.h> f10696d;

        /* compiled from: Slider.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/interaction/h;", "interaction", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/interaction/h;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.f9$a$a, reason: collision with other inner class name */
        static final class C0238a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.snapshots.b0<androidx.compose.foundation.interaction.h> f10697b;

            C0238a(androidx.compose.runtime.snapshots.b0<androidx.compose.foundation.interaction.h> b0Var) {
                this.f10697b = b0Var;
            }

            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(@fg.l androidx.compose.foundation.interaction.h hVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
                if (hVar instanceof m.b) {
                    this.f10697b.add(hVar);
                } else if (hVar instanceof m.c) {
                    this.f10697b.remove(((m.c) hVar).getPress());
                } else if (hVar instanceof m.a) {
                    this.f10697b.remove(((m.a) hVar).getPress());
                } else if (hVar instanceof a.b) {
                    this.f10697b.add(hVar);
                } else if (hVar instanceof a.c) {
                    this.f10697b.remove(((a.c) hVar).getStart());
                } else if (hVar instanceof a.C0082a) {
                    this.f10697b.remove(((a.C0082a) hVar).getStart());
                }
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.foundation.interaction.k kVar, androidx.compose.runtime.snapshots.b0<androidx.compose.foundation.interaction.h> b0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f10695c = kVar;
            this.f10696d = b0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new a(this.f10695c, this.f10696d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f10694b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.h> c5 = this.f10695c.c();
                C0238a c0238a = new C0238a(this.f10696d);
                this.f10694b = 1;
                if (c5.a(c0238a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f10699c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f10700d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d9 f10701e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f10702f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f10703g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f10704h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f10705i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.foundation.interaction.k kVar, androidx.compose.ui.q qVar, d9 d9Var, boolean z4, long j4, int i4, int i5) {
            super(2);
            this.f10699c = kVar;
            this.f10700d = qVar;
            this.f10701e = d9Var;
            this.f10702f = z4;
            this.f10703g = j4;
            this.f10704h = i4;
            this.f10705i = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            f9.this.a(this.f10699c, this.f10700d, this.f10701e, this.f10702f, this.f10703g, tVar, androidx.compose.runtime.g3.b(this.f10704h | 1), this.f10705i);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/f;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults$Track$1$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,2151:1\n10843#2:2152\n11093#2,3:2153\n11096#2,3:2163\n361#3,7:2156\n215#4:2166\n216#4:2178\n151#5,3:2167\n33#5,4:2170\n154#5,2:2174\n38#5:2176\n156#5:2177\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults$Track$1$1\n*L\n1089#1:2152\n1089#1:2153,3\n1089#1:2163,3\n1089#1:2156,7\n1092#1:2166\n1092#1:2178\n1094#1:2167,3\n1094#1:2170,4\n1094#1:2174,2\n1094#1:2176\n1094#1:2177\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.f, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f10706b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h9 f10707c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f10708d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f10709e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f10710f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j4, h9 h9Var, long j5, long j6, long j7) {
            super(1);
            this.f10706b = j4;
            this.f10707c = h9Var;
            this.f10708d = j5;
            this.f10709e = j6;
            this.f10710f = j7;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.f fVar) {
            float f4;
            boolean z4 = fVar.getLayoutDirection() == androidx.compose.ui.unit.w.Rtl;
            long a5 = i0.g.a(0.0f, i0.f.r(fVar.c0()));
            long a6 = i0.g.a(i0.n.t(fVar.e()), i0.f.r(fVar.c0()));
            long j4 = z4 ? a6 : a5;
            long j5 = z4 ? a5 : a6;
            f4 = g9.f11132f;
            float v5 = fVar.v5(f4);
            float v52 = fVar.v5(g9.z());
            long j6 = this.f10706b;
            i6.Companion companion = androidx.compose.ui.graphics.i6.INSTANCE;
            companion.getClass();
            long j7 = j5;
            long j10 = j4;
            androidx.compose.ui.graphics.drawscope.f.R2(fVar, j6, j4, j5, v52, androidx.compose.ui.graphics.i6.f17862d, null, 0.0f, null, 0, 480, null);
            long a7 = i0.g.a((this.f10707c.a().h().floatValue() * (i0.f.p(j7) - i0.f.p(j10))) + i0.f.p(j10), i0.f.r(fVar.c0()));
            long a8 = i0.g.a((this.f10707c.a().c().floatValue() * (i0.f.p(j7) - i0.f.p(j10))) + i0.f.p(j10), i0.f.r(fVar.c0()));
            long j11 = this.f10708d;
            companion.getClass();
            androidx.compose.ui.graphics.drawscope.f.R2(fVar, j11, a8, a7, v52, androidx.compose.ui.graphics.i6.f17862d, null, 0.0f, null, 0, 480, null);
            float[] b5 = this.f10707c.b();
            h9 h9Var = this.f10707c;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int length = b5.length;
            for (int i4 = 0; i4 < length; i4++) {
                float f5 = b5[i4];
                Boolean valueOf = Boolean.valueOf(f5 > h9Var.a().h().floatValue() || f5 < h9Var.a().c().floatValue());
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(valueOf, obj);
                }
                ((List) obj).add(Float.valueOf(f5));
            }
            long j12 = this.f10709e;
            long j13 = this.f10710f;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
                List list = (List) entry.getValue();
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.add(i0.f.d(i0.g.a(i0.f.p(i0.g.h(j10, j7, ((Number) list.get(i5)).floatValue())), i0.f.r(fVar.c0()))));
                }
                long j14 = j10;
                long j15 = j7;
                androidx.compose.ui.graphics.n5.INSTANCE.getClass();
                int i6 = androidx.compose.ui.graphics.n5.f17968c;
                long j16 = booleanValue ? j12 : j13;
                androidx.compose.ui.graphics.i6.INSTANCE.getClass();
                androidx.compose.ui.graphics.drawscope.f.Z4(fVar, arrayList, i6, j16, v5, androidx.compose.ui.graphics.i6.f17862d, null, 0.0f, null, 0, 480, null);
                j13 = j13;
                j7 = j15;
                j10 = j14;
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
            a(fVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h9 f10712c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f10713d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d9 f10714e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f10715f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f10716g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f10717h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(h9 h9Var, androidx.compose.ui.q qVar, d9 d9Var, boolean z4, int i4, int i5) {
            super(2);
            this.f10712c = h9Var;
            this.f10713d = qVar;
            this.f10714e = d9Var;
            this.f10715f = z4;
            this.f10716g = i4;
            this.f10717h = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            f9.this.c(this.f10712c, this.f10713d, this.f10714e, this.f10715f, tVar, androidx.compose.runtime.g3.b(this.f10716g | 1), this.f10717h);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.f, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j9 f10718b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f10719c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f10720d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f10721e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f10722f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(j9 j9Var, long j4, long j5, long j6, long j7) {
            super(1);
            this.f10718b = j9Var;
            this.f10719c = j4;
            this.f10720d = j5;
            this.f10721e = j6;
            this.f10722f = j7;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.f fVar) {
            f9.f10692a.h(fVar, this.f10718b.getTickFractions(), 0.0f, this.f10718b.g(), this.f10719c, this.f10720d, this.f10721e, this.f10722f);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
            a(fVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j9 f10724c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f10725d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d9 f10726e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f10727f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f10728g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f10729h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(j9 j9Var, androidx.compose.ui.q qVar, d9 d9Var, boolean z4, int i4, int i5) {
            super(2);
            this.f10724c = j9Var;
            this.f10725d = qVar;
            this.f10726e = d9Var;
            this.f10727f = z4;
            this.f10728g = i4;
            this.f10729h = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            f9.this.d(this.f10724c, this.f10725d, this.f10726e, this.f10727f, tVar, androidx.compose.runtime.g3.b(this.f10728g | 1), this.f10729h);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.f, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d8 f10730b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f10731c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f10732d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f10733e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f10734f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(d8 d8Var, long j4, long j5, long j6, long j7) {
            super(1);
            this.f10730b = d8Var;
            this.f10731c = j4;
            this.f10732d = j5;
            this.f10733e = j6;
            this.f10734f = j7;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.f fVar) {
            f9.f10692a.h(fVar, this.f10730b.getTickFractions(), this.f10730b.f(), this.f10730b.e(), this.f10731c, this.f10732d, this.f10733e, this.f10734f);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
            a(fVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d8 f10736c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f10737d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d9 f10738e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f10739f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f10740g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f10741h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(d8 d8Var, androidx.compose.ui.q qVar, d9 d9Var, boolean z4, int i4, int i5) {
            super(2);
            this.f10736c = d8Var;
            this.f10737d = qVar;
            this.f10738e = d9Var;
            this.f10739f = z4;
            this.f10740g = i4;
            this.f10741h = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            f9.this.b(this.f10736c, this.f10737d, this.f10738e, this.f10739f, tVar, androidx.compose.runtime.g3.b(this.f10740g | 1), this.f10741h);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    private f9() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(androidx.compose.ui.graphics.drawscope.f fVar, float[] fArr, float f4, float f5, long j4, long j5, long j6, long j7) {
        float f6;
        long j10;
        long j11;
        boolean z4 = fVar.getLayoutDirection() == androidx.compose.ui.unit.w.Rtl;
        long a5 = i0.g.a(0.0f, i0.f.r(fVar.c0()));
        long a6 = i0.g.a(i0.n.t(fVar.e()), i0.f.r(fVar.c0()));
        long j12 = z4 ? a6 : a5;
        long j13 = z4 ? a5 : a6;
        f6 = g9.f11132f;
        float v5 = fVar.v5(f6);
        float v52 = fVar.v5(g9.z());
        i6.Companion companion = androidx.compose.ui.graphics.i6.INSTANCE;
        companion.getClass();
        long j14 = j13;
        long j15 = j12;
        androidx.compose.ui.graphics.drawscope.f.R2(fVar, j4, j12, j13, v52, androidx.compose.ui.graphics.i6.f17862d, null, 0.0f, null, 0, 480, null);
        long a7 = i0.g.a(((i0.f.p(j14) - i0.f.p(j15)) * f5) + i0.f.p(j15), i0.f.r(fVar.c0()));
        long a8 = i0.g.a(((i0.f.p(j14) - i0.f.p(j15)) * f4) + i0.f.p(j15), i0.f.r(fVar.c0()));
        companion.getClass();
        androidx.compose.ui.graphics.drawscope.f.R2(fVar, j5, a8, a7, v52, androidx.compose.ui.graphics.i6.f17862d, null, 0.0f, null, 0, 480, null);
        int length = fArr.length;
        int i4 = 0;
        while (i4 < length) {
            float f7 = fArr[i4];
            if (f7 > f5 || f7 < f4) {
                j10 = j14;
                j11 = j6;
            } else {
                j10 = j14;
                j11 = j7;
            }
            long j16 = j15;
            androidx.compose.ui.graphics.drawscope.f.u6(fVar, j11, v5 / 2.0f, i0.g.a(i0.f.p(i0.g.h(j16, j10, f7)), i0.f.r(fVar.c0())), 0.0f, null, null, 0, 120, null);
            i4++;
            j15 = j16;
            j14 = j10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0065  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@fg.l androidx.compose.foundation.interaction.k r29, @fg.m androidx.compose.ui.q r30, @fg.m androidx.compose.material3.d9 r31, boolean r32, long r33, @fg.m androidx.compose.runtime.t r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.f9.a(androidx.compose.foundation.interaction.k, androidx.compose.ui.q, androidx.compose.material3.d9, boolean, long, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x005f  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(@fg.l androidx.compose.material3.d8 r22, @fg.m androidx.compose.ui.q r23, @fg.m androidx.compose.material3.d9 r24, boolean r25, @fg.m androidx.compose.runtime.t r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.f9.b(androidx.compose.material3.d8, androidx.compose.ui.q, androidx.compose.material3.d9, boolean, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x005f  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @kotlin.k(message = "Use version that supports slider state")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(@fg.l androidx.compose.material3.h9 r22, @fg.m androidx.compose.ui.q r23, @fg.m androidx.compose.material3.d9 r24, boolean r25, @fg.m androidx.compose.runtime.t r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.f9.c(androidx.compose.material3.h9, androidx.compose.ui.q, androidx.compose.material3.d9, boolean, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x005f  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(@fg.l androidx.compose.material3.j9 r22, @fg.m androidx.compose.ui.q r23, @fg.m androidx.compose.material3.d9 r24, boolean r25, @fg.m androidx.compose.runtime.t r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.f9.d(androidx.compose.material3.j9, androidx.compose.ui.q, androidx.compose.material3.d9, boolean, androidx.compose.runtime.t, int, int):void");
    }

    @fg.l
    @androidx.compose.runtime.i
    public final d9 f(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1376295968);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1376295968, i4, -1, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:886)");
        }
        d9 i5 = i(p6.f13227a.a(tVar, 6));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return i5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final d9 g(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, @fg.m androidx.compose.runtime.t tVar, int i4, int i5, int i6) {
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        tVar.P(885588574);
        if ((i6 & 1) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j16 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j16 = j4;
        }
        if ((i6 & 2) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j17 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j17 = j5;
        }
        if ((i6 & 4) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j18 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j18 = j6;
        }
        if ((i6 & 8) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j19 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j19 = j7;
        }
        if ((i6 & 16) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j20 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j20 = j10;
        }
        if ((i6 & 32) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j21 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j21 = j11;
        }
        if ((i6 & 64) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j22 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j22 = j12;
        }
        if ((i6 & 128) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j23 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j23 = j13;
        }
        if ((i6 & 256) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j24 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j24 = j14;
        }
        if ((i6 & 512) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j25 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j25 = j15;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(885588574, i4, i5, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:927)");
        }
        d9 a5 = i(p6.f13227a.a(tVar, 6)).a(j16, j17, j18, j19, j20, j21, j22, j23, j24, j25);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return a5;
    }

    @fg.l
    public final d9 i(@fg.l a3 a3Var) {
        d9 defaultSliderColorsCached = a3Var.getDefaultSliderColorsCached();
        if (defaultSliderColorsCached != null) {
            return defaultSliderColorsCached;
        }
        c0.d1 d1Var = c0.d1.f37152a;
        d9 d9Var = new d9(b3.h(a3Var, d1Var.i()), b3.h(a3Var, d1Var.a()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, d1Var.A()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), b3.h(a3Var, d1Var.o()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, d1Var.E()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.f2.h(androidx.compose.ui.graphics.d2.w(b3.h(a3Var, d1Var.e()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), a3Var.getSurface()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, d1Var.d()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, d1Var.D()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, d1Var.g()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, d1Var.D()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        a3Var.d1(d9Var);
        return d9Var;
    }
}

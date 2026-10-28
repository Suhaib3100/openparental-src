package androidx.compose.animation.core;

import androidx.compose.animation.core.e2;
import androidx.compose.animation.core.e2.a;
import androidx.compose.animation.core.e2.d;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.t;
import kotlin.Metadata;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Transition.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\u001ac\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0013R\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\u0010*\u00020\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a^\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010\u001b\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00028\u00010\u0016¢\u0006\u0002\b\u001aH\u0087\b¢\u0006\u0004\b\u001c\u0010\u001d\u001aC\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u0001\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00020\u0002H\u0001¢\u0006\u0004\b \u0010!\u001a¨\u0001\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010(\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\u0010*\u00020\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00112*\b\n\u0010%\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010#0\u0016¢\u0006\u0002\b\u001a¢\u0006\u0002\b$2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010'\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(&\u0012\u0004\u0012\u00028\u00010\u0016¢\u0006\u0002\b\u001aH\u0087\b¢\u0006\u0004\b)\u0010*\u001ao\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010(\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\u0010*\u00020\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010+\u001a\u00028\u00012\u0006\u0010,\u001a\u00028\u00012\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00010#2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b.\u0010/\u001a\u0084\u0001\u00101\u001a\b\u0012\u0004\u0012\u0002000(\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010%\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"\u0012\n\u0012\b\u0012\u0004\u0012\u0002000#0\u0016¢\u0006\u0002\b\u001a¢\u0006\u0002\b$2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010'\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(&\u0012\u0004\u0012\u0002000\u0016¢\u0006\u0002\b\u001aH\u0087\b¢\u0006\u0004\b1\u00102\u001a\u0084\u0001\u00104\u001a\b\u0012\u0004\u0012\u0002030(\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010%\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"\u0012\n\u0012\b\u0012\u0004\u0012\u0002030#0\u0016¢\u0006\u0002\b\u001a¢\u0006\u0002\b$2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010'\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(&\u0012\u0004\u0012\u0002030\u0016¢\u0006\u0002\b\u001aH\u0087\b¢\u0006\u0004\b4\u00102\u001a\u0084\u0001\u00106\u001a\b\u0012\u0004\u0012\u0002050(\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010%\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"\u0012\n\u0012\b\u0012\u0004\u0012\u0002050#0\u0016¢\u0006\u0002\b\u001a¢\u0006\u0002\b$2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010'\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(&\u0012\u0004\u0012\u0002050\u0016¢\u0006\u0002\b\u001aH\u0087\b¢\u0006\u0004\b6\u00102\u001a\u0084\u0001\u00108\u001a\b\u0012\u0004\u0012\u0002070(\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010%\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"\u0012\n\u0012\b\u0012\u0004\u0012\u0002070#0\u0016¢\u0006\u0002\b\u001a¢\u0006\u0002\b$2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010'\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(&\u0012\u0004\u0012\u0002070\u0016¢\u0006\u0002\b\u001aH\u0087\b¢\u0006\u0004\b8\u00102\u001a\u0084\u0001\u0010:\u001a\b\u0012\u0004\u0012\u0002090(\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010%\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"\u0012\n\u0012\b\u0012\u0004\u0012\u0002090#0\u0016¢\u0006\u0002\b\u001a¢\u0006\u0002\b$2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010'\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(&\u0012\u0004\u0012\u0002090\u0016¢\u0006\u0002\b\u001aH\u0087\b¢\u0006\u0004\b:\u00102\u001a\u0084\u0001\u0010<\u001a\b\u0012\u0004\u0012\u00020;0(\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010%\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0#0\u0016¢\u0006\u0002\b\u001a¢\u0006\u0002\b$2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010'\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020;0\u0016¢\u0006\u0002\b\u001aH\u0087\b¢\u0006\u0004\b<\u00102\u001a\u0084\u0001\u0010>\u001a\b\u0012\u0004\u0012\u00020=0(\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010%\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0#0\u0016¢\u0006\u0002\b\u001a¢\u0006\u0002\b$2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010'\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020=0\u0016¢\u0006\u0002\b\u001aH\u0087\b¢\u0006\u0004\b>\u00102\u001a\u0084\u0001\u0010@\u001a\b\u0012\u0004\u0012\u00020?0(\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010%\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0#0\u0016¢\u0006\u0002\b\u001a¢\u0006\u0002\b$2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010'\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020?0\u0016¢\u0006\u0002\b\u001aH\u0087\b¢\u0006\u0004\b@\u00102\"\u0014\u0010B\u001a\u00020;8\u0000X\u0080T¢\u0006\u0006\n\u0004\b4\u0010A¨\u0006C"}, d2 = {"T", "targetState", "", "label", "Landroidx/compose/animation/core/e2;", "p", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/t;II)Landroidx/compose/animation/core/e2;", "Landroidx/compose/animation/core/g2;", "transitionState", "n", "(Landroidx/compose/animation/core/g2;Ljava/lang/String;Landroidx/compose/runtime/t;II)Landroidx/compose/animation/core/e2;", "Landroidx/compose/animation/core/h1;", "o", "(Landroidx/compose/animation/core/h1;Ljava/lang/String;Landroidx/compose/runtime/t;II)Landroidx/compose/animation/core/e2;", "S", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/i2;", "typeConverter", "Landroidx/compose/animation/core/e2$a;", "l", "(Landroidx/compose/animation/core/e2;Landroidx/compose/animation/core/i2;Ljava/lang/String;Landroidx/compose/runtime/t;II)Landroidx/compose/animation/core/e2$a;", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "parentState", "Landroidx/compose/runtime/i;", "transformToChildState", "j", "(Landroidx/compose/animation/core/e2;Ljava/lang/String;Lld/q;Landroidx/compose/runtime/t;II)Landroidx/compose/animation/core/e2;", "initialState", "childLabel", "k", "(Landroidx/compose/animation/core/e2;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/t;I)Landroidx/compose/animation/core/e2;", "Landroidx/compose/animation/core/e2$b;", "Landroidx/compose/animation/core/p0;", "Lkotlin/u;", "transitionSpec", "state", "targetValueByState", "Landroidx/compose/runtime/b5;", "i", "(Landroidx/compose/animation/core/e2;Landroidx/compose/animation/core/i2;Lld/q;Ljava/lang/String;Lld/q;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/b5;", "initialValue", "targetValue", "animationSpec", "m", "(Landroidx/compose/animation/core/e2;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/p0;Landroidx/compose/animation/core/i2;Ljava/lang/String;Landroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "", "b", "(Landroidx/compose/animation/core/e2;Lld/q;Ljava/lang/String;Lld/q;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/b5;", "Landroidx/compose/ui/unit/h;", "a", "Li0/f;", "f", "Li0/n;", "h", "Landroidx/compose/ui/unit/q;", "d", "", "c", "Landroidx/compose/ui/unit/u;", "e", "Li0/i;", "g", "I", "AnimationDebugDurationScale", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1382:1\n1083#1,5:1449\n1083#1,5:1454\n1083#1,5:1459\n1083#1,5:1464\n1083#1,5:1469\n1083#1,5:1474\n1083#1,5:1479\n1083#1,5:1484\n25#2:1383\n36#2:1396\n36#2:1409\n36#2:1416\n36#2:1423\n36#2:1436\n1116#3,6:1384\n1116#3,6:1390\n1116#3,6:1397\n1116#3,6:1403\n1116#3,6:1410\n1116#3,6:1417\n1116#3,6:1424\n1116#3,6:1430\n1116#3,6:1437\n1116#3,6:1443\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n1166#1:1449,5\n1197#1:1454,5\n1228#1:1459,5\n1259#1:1464,5\n1290#1:1469,5\n1321#1:1474,5\n1351#1:1479,5\n1381#1:1484,5\n75#1:1383\n318#1:1396\n978#1:1409\n1011#1:1416\n1024#1:1423\n1099#1:1436\n75#1:1384,6\n77#1:1390,6\n318#1:1397,6\n322#1:1403,6\n978#1:1410,6\n1011#1:1417,6\n1024#1:1424,6\n1028#1:1430,6\n1099#1:1437,6\n1122#1:1443,6\n*E\n"})
/* loaded from: classes.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2701a = 1;

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* compiled from: Transition.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @kotlin.jvm.internal.r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateDp$1\n*L\n1#1,1382:1\n*E\n"})
    public static final class a<S> extends kotlin.jvm.internal.n0 implements ld.q<e2.b<S>, androidx.compose.runtime.t, Integer, y1<androidx.compose.ui.unit.h>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f2702b = new a(3);

        public a() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ y1<androidx.compose.ui.unit.h> R(Object obj, androidx.compose.runtime.t tVar, Integer num) {
            return a((e2.b) obj, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final y1<androidx.compose.ui.unit.h> a(@fg.l e2.b<S> bVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(-575880366);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-575880366, i4, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:1191)");
            }
            y1<androidx.compose.ui.unit.h> p4 = androidx.compose.animation.core.l.p(0.0f, 0.0f, androidx.compose.ui.unit.h.d(z2.a(androidx.compose.ui.unit.h.INSTANCE)), 3, null);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return p4;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* compiled from: Transition.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @kotlin.jvm.internal.r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateFloat$1\n*L\n1#1,1382:1\n*E\n"})
    public static final class b<S> extends kotlin.jvm.internal.n0 implements ld.q<e2.b<S>, androidx.compose.runtime.t, Integer, y1<Float>> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f2703b = new b(3);

        public b() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ y1<Float> R(Object obj, androidx.compose.runtime.t tVar, Integer num) {
            return a((e2.b) obj, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final y1<Float> a(@fg.l e2.b<S> bVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(-522164544);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-522164544, i4, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:1161)");
            }
            y1<Float> p4 = androidx.compose.animation.core.l.p(0.0f, 0.0f, null, 7, null);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return p4;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* compiled from: Transition.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @kotlin.jvm.internal.r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateInt$1\n*L\n1#1,1382:1\n*E\n"})
    public static final class c<S> extends kotlin.jvm.internal.n0 implements ld.q<e2.b<S>, androidx.compose.runtime.t, Integer, y1<Integer>> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f2704b = new c(3);

        public c() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ y1<Integer> R(Object obj, androidx.compose.runtime.t tVar, Integer num) {
            return a((e2.b) obj, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final y1<Integer> a(@fg.l e2.b<S> bVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(-785273069);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-785273069, i4, -1, "androidx.compose.animation.core.animateInt.<anonymous> (Transition.kt:1315)");
            }
            y1<Integer> p4 = androidx.compose.animation.core.l.p(0.0f, 0.0f, 1, 3, null);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return p4;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* compiled from: Transition.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @kotlin.jvm.internal.r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateIntOffset$1\n*L\n1#1,1382:1\n*E\n"})
    public static final class d<S> extends kotlin.jvm.internal.n0 implements ld.q<e2.b<S>, androidx.compose.runtime.t, Integer, y1<androidx.compose.ui.unit.q>> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f2705b = new d(3);

        public d() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ y1<androidx.compose.ui.unit.q> R(Object obj, androidx.compose.runtime.t tVar, Integer num) {
            return a((e2.b) obj, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final y1<androidx.compose.ui.unit.q> a(@fg.l e2.b<S> bVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(-1953479610);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1953479610, i4, -1, "androidx.compose.animation.core.animateIntOffset.<anonymous> (Transition.kt:1285)");
            }
            y1<androidx.compose.ui.unit.q> p4 = androidx.compose.animation.core.l.p(0.0f, 0.0f, androidx.compose.ui.unit.q.b(androidx.compose.ui.unit.r.a(1, 1)), 3, null);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return p4;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* compiled from: Transition.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @kotlin.jvm.internal.r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateIntSize$1\n*L\n1#1,1382:1\n*E\n"})
    public static final class e<S> extends kotlin.jvm.internal.n0 implements ld.q<e2.b<S>, androidx.compose.runtime.t, Integer, y1<androidx.compose.ui.unit.u>> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f2706b = new e(3);

        public e() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ y1<androidx.compose.ui.unit.u> R(Object obj, androidx.compose.runtime.t tVar, Integer num) {
            return a((e2.b) obj, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final y1<androidx.compose.ui.unit.u> a(@fg.l e2.b<S> bVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(967893300);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(967893300, i4, -1, "androidx.compose.animation.core.animateIntSize.<anonymous> (Transition.kt:1346)");
            }
            y1<androidx.compose.ui.unit.u> p4 = androidx.compose.animation.core.l.p(0.0f, 0.0f, androidx.compose.ui.unit.u.b(androidx.compose.ui.unit.v.a(1, 1)), 3, null);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return p4;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* compiled from: Transition.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @kotlin.jvm.internal.r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateOffset$1\n*L\n1#1,1382:1\n*E\n"})
    public static final class f<S> extends kotlin.jvm.internal.n0 implements ld.q<e2.b<S>, androidx.compose.runtime.t, Integer, y1<i0.f>> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f2707b = new f(3);

        public f() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ y1<i0.f> R(Object obj, androidx.compose.runtime.t tVar, Integer num) {
            return a((e2.b) obj, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final y1<i0.f> a(@fg.l e2.b<S> bVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(1623385561);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1623385561, i4, -1, "androidx.compose.animation.core.animateOffset.<anonymous> (Transition.kt:1222)");
            }
            y1<i0.f> p4 = androidx.compose.animation.core.l.p(0.0f, 0.0f, i0.f.d(z2.f(i0.f.INSTANCE)), 3, null);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return p4;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* compiled from: Transition.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @kotlin.jvm.internal.r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateRect$1\n*L\n1#1,1382:1\n*E\n"})
    public static final class g<S> extends kotlin.jvm.internal.n0 implements ld.q<e2.b<S>, androidx.compose.runtime.t, Integer, y1<i0.i>> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f2708b = new g(3);

        public g() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ y1<i0.i> R(Object obj, androidx.compose.runtime.t tVar, Integer num) {
            return a((e2.b) obj, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final y1<i0.i> a(@fg.l e2.b<S> bVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(691336298);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(691336298, i4, -1, "androidx.compose.animation.core.animateRect.<anonymous> (Transition.kt:1376)");
            }
            y1<i0.i> p4 = androidx.compose.animation.core.l.p(0.0f, 0.0f, z2.h(i0.i.INSTANCE), 3, null);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return p4;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* compiled from: Transition.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @kotlin.jvm.internal.r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateSize$1\n*L\n1#1,1382:1\n*E\n"})
    public static final class h<S> extends kotlin.jvm.internal.n0 implements ld.q<e2.b<S>, androidx.compose.runtime.t, Integer, y1<i0.n>> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f2709b = new h(3);

        public h() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ y1<i0.n> R(Object obj, androidx.compose.runtime.t tVar, Integer num) {
            return a((e2.b) obj, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final y1<i0.n> a(@fg.l e2.b<S> bVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(-1607152761);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1607152761, i4, -1, "androidx.compose.animation.core.animateSize.<anonymous> (Transition.kt:1253)");
            }
            y1<i0.n> p4 = androidx.compose.animation.core.l.p(0.0f, 0.0f, i0.n.c(z2.g(i0.n.INSTANCE)), 3, null);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return p4;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S, T] */
    /* compiled from: Transition.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @kotlin.jvm.internal.r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateValue$1\n*L\n1#1,1382:1\n*E\n"})
    public static final class i<S, T> extends kotlin.jvm.internal.n0 implements ld.q<e2.b<S>, androidx.compose.runtime.t, Integer, y1<T>> {

        /* renamed from: b, reason: collision with root package name */
        public static final i f2710b = new i(3);

        public i() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Object R(Object obj, androidx.compose.runtime.t tVar, Integer num) {
            return a((e2.b) obj, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final y1<T> a(@fg.l e2.b<S> bVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(-895531546);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-895531546, i4, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:1077)");
            }
            y1<T> p4 = androidx.compose.animation.core.l.p(0.0f, 0.0f, null, 7, null);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return p4;
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "T", "Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createChildTransitionInternal$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1382:1\n64#2,5:1383\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createChildTransitionInternal$1$1\n*L\n1030#1:1383,5\n*E\n"})
    static final class j extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.runtime.w0, androidx.compose.runtime.v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e2<S> f2711b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e2<T> f2712c;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlin.jvm.internal.r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createChildTransitionInternal$1$1\n*L\n1#1,497:1\n1031#2,2:498\n*E\n"})
        public static final class a implements androidx.compose.runtime.v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e2 f2713a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e2 f2714b;

            public a(e2 e2Var, e2 e2Var2) {
                this.f2713a = e2Var;
                this.f2714b = e2Var2;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f2713a.B(this.f2714b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(e2<S> e2Var, e2<T> e2Var2) {
            super(1);
            this.f2711b = e2Var;
            this.f2712c = e2Var2;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.v0 invoke(@fg.l androidx.compose.runtime.w0 w0Var) {
            this.f2711b.e(this.f2712c);
            return new a(this.f2711b, this.f2712c);
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u0002*\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"S", "T", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createDeferredAnimation$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1382:1\n64#2,5:1383\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createDeferredAnimation$1\n*L\n980#1:1383,5\n*E\n"})
    static final class k extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.runtime.w0, androidx.compose.runtime.v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e2<S> f2715b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e2<S>.a<T, V> f2716c;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlin.jvm.internal.r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createDeferredAnimation$1\n*L\n1#1,497:1\n981#2,2:498\n*E\n"})
        public static final class a implements androidx.compose.runtime.v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e2 f2717a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e2.a f2718b;

            public a(e2 e2Var, e2.a aVar) {
                this.f2717a = e2Var;
                this.f2718b = aVar;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f2717a.z(this.f2718b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(e2<S> e2Var, e2<S>.a<T, V> aVar) {
            super(1);
            this.f2715b = e2Var;
            this.f2716c = aVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.v0 invoke(@fg.l androidx.compose.runtime.w0 w0Var) {
            return new a(this.f2715b, this.f2716c);
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u0002*\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"S", "T", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createTransitionAnimation$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1382:1\n64#2,5:1383\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createTransitionAnimation$1$1\n*L\n1124#1:1383,5\n*E\n"})
    static final class l extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.runtime.w0, androidx.compose.runtime.v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e2<S> f2719b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e2<S>.d<T, V> f2720c;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlin.jvm.internal.r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createTransitionAnimation$1$1\n*L\n1#1,497:1\n1125#2,2:498\n*E\n"})
        public static final class a implements androidx.compose.runtime.v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e2 f2721a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e2.d f2722b;

            public a(e2 e2Var, e2.d dVar) {
                this.f2721a = e2Var;
                this.f2722b = dVar;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f2721a.A(this.f2722b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(e2<S> e2Var, e2<S>.d<T, V> dVar) {
            super(1);
            this.f2719b = e2Var;
            this.f2720c = dVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.v0 invoke(@fg.l androidx.compose.runtime.w0 w0Var) {
            this.f2719b.d(this.f2720c);
            return new a(this.f2719b, this.f2720c);
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$rememberTransition$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1382:1\n64#2,5:1383\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$rememberTransition$1$1\n*L\n323#1:1383,5\n*E\n"})
    static final class m extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.runtime.w0, androidx.compose.runtime.v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e2<T> f2723b;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlin.jvm.internal.r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt$rememberTransition$1$1\n*L\n1#1,497:1\n326#2,2:498\n*E\n"})
        public static final class a implements androidx.compose.runtime.v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e2 f2724a;

            public a(e2 e2Var) {
                this.f2724a = e2Var;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f2724a.x();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(e2<T> e2Var) {
            super(1);
            this.f2723b = e2Var;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.v0 invoke(@fg.l androidx.compose.runtime.w0 w0Var) {
            return new a(this.f2723b);
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$updateTransition$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1382:1\n64#2,5:1383\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$updateTransition$1$1\n*L\n78#1:1383,5\n*E\n"})
    static final class n extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.runtime.w0, androidx.compose.runtime.v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e2<T> f2725b;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlin.jvm.internal.r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt$updateTransition$1$1\n*L\n1#1,497:1\n81#2,2:498\n*E\n"})
        public static final class a implements androidx.compose.runtime.v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e2 f2726a;

            public a(e2 e2Var) {
                this.f2726a = e2Var;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f2726a.x();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(e2<T> e2Var) {
            super(1);
            this.f2725b = e2Var;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.v0 invoke(@fg.l androidx.compose.runtime.w0 w0Var) {
            return new a(this.f2725b);
        }
    }

    @fg.l
    @androidx.compose.runtime.j(scheme = "[0[0][0]]")
    @androidx.compose.runtime.i
    public static final <S> b5<androidx.compose.ui.unit.h> a(@fg.l e2<S> e2Var, @fg.m ld.q<? super e2.b<S>, ? super androidx.compose.runtime.t, ? super Integer, ? extends p0<androidx.compose.ui.unit.h>> qVar, @fg.m String str, @fg.l ld.q<? super S, ? super androidx.compose.runtime.t, ? super Integer, androidx.compose.ui.unit.h> qVar2, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(184732935);
        if ((i5 & 1) != 0) {
            qVar = a.f2702b;
        }
        if ((i5 & 2) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        i2<androidx.compose.ui.unit.h, o> b5 = k2.b(androidx.compose.ui.unit.h.INSTANCE);
        int i6 = i4 & 14;
        int i7 = i4 << 3;
        int i10 = i6 | (i7 & 896) | (i7 & 7168) | (i7 & 57344);
        tVar.P(-142660079);
        int i11 = (i10 >> 9) & 112;
        b5<androidx.compose.ui.unit.h> m4 = m(e2Var, qVar2.R(e2Var.h(), tVar, Integer.valueOf(i11)), qVar2.R(e2Var.o(), tVar, Integer.valueOf(i11)), qVar.R(e2Var.m(), tVar, Integer.valueOf((i10 >> 3) & 112)), b5, str2, tVar, (i10 & 14) | ((i10 << 6) & 458752));
        tVar.p0();
        tVar.p0();
        return m4;
    }

    @fg.l
    @androidx.compose.runtime.j(scheme = "[0[0][0]]")
    @androidx.compose.runtime.i
    public static final <S> b5<Float> b(@fg.l e2<S> e2Var, @fg.m ld.q<? super e2.b<S>, ? super androidx.compose.runtime.t, ? super Integer, ? extends p0<Float>> qVar, @fg.m String str, @fg.l ld.q<? super S, ? super androidx.compose.runtime.t, ? super Integer, Float> qVar2, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-1338768149);
        if ((i5 & 1) != 0) {
            qVar = b.f2703b;
        }
        if ((i5 & 2) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        i2<Float, o> i6 = k2.i(kotlin.jvm.internal.a0.f75283a);
        int i7 = i4 & 14;
        int i10 = i4 << 3;
        int i11 = i7 | (i10 & 896) | (i10 & 7168) | (i10 & 57344);
        tVar.P(-142660079);
        int i12 = (i11 >> 9) & 112;
        b5<Float> m4 = m(e2Var, qVar2.R(e2Var.h(), tVar, Integer.valueOf(i12)), qVar2.R(e2Var.o(), tVar, Integer.valueOf(i12)), qVar.R(e2Var.m(), tVar, Integer.valueOf((i11 >> 3) & 112)), i6, str2, tVar, (i11 & 14) | ((i11 << 6) & 458752));
        tVar.p0();
        tVar.p0();
        return m4;
    }

    @fg.l
    @androidx.compose.runtime.j(scheme = "[0[0][0]]")
    @androidx.compose.runtime.i
    public static final <S> b5<Integer> c(@fg.l e2<S> e2Var, @fg.m ld.q<? super e2.b<S>, ? super androidx.compose.runtime.t, ? super Integer, ? extends p0<Integer>> qVar, @fg.m String str, @fg.l ld.q<? super S, ? super androidx.compose.runtime.t, ? super Integer, Integer> qVar2, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(1318902782);
        if ((i5 & 1) != 0) {
            qVar = c.f2704b;
        }
        if ((i5 & 2) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        i2<Integer, o> j4 = k2.j(kotlin.jvm.internal.j0.f75314a);
        int i6 = i4 & 14;
        int i7 = i4 << 3;
        int i10 = i6 | (i7 & 896) | (i7 & 7168) | (i7 & 57344);
        tVar.P(-142660079);
        int i11 = (i10 >> 9) & 112;
        b5<Integer> m4 = m(e2Var, qVar2.R(e2Var.h(), tVar, Integer.valueOf(i11)), qVar2.R(e2Var.o(), tVar, Integer.valueOf(i11)), qVar.R(e2Var.m(), tVar, Integer.valueOf((i10 >> 3) & 112)), j4, str2, tVar, (i10 & 14) | ((i10 << 6) & 458752));
        tVar.p0();
        tVar.p0();
        return m4;
    }

    @fg.l
    @androidx.compose.runtime.j(scheme = "[0[0][0]]")
    @androidx.compose.runtime.i
    public static final <S> b5<androidx.compose.ui.unit.q> d(@fg.l e2<S> e2Var, @fg.m ld.q<? super e2.b<S>, ? super androidx.compose.runtime.t, ? super Integer, ? extends p0<androidx.compose.ui.unit.q>> qVar, @fg.m String str, @fg.l ld.q<? super S, ? super androidx.compose.runtime.t, ? super Integer, androidx.compose.ui.unit.q> qVar2, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(776131825);
        if ((i5 & 1) != 0) {
            qVar = d.f2705b;
        }
        if ((i5 & 2) != 0) {
            str = "IntOffsetAnimation";
        }
        String str2 = str;
        i2<androidx.compose.ui.unit.q, p> d5 = k2.d(androidx.compose.ui.unit.q.INSTANCE);
        int i6 = i4 & 14;
        int i7 = i4 << 3;
        int i10 = i6 | (i7 & 896) | (i7 & 7168) | (i7 & 57344);
        tVar.P(-142660079);
        int i11 = (i10 >> 9) & 112;
        b5<androidx.compose.ui.unit.q> m4 = m(e2Var, qVar2.R(e2Var.h(), tVar, Integer.valueOf(i11)), qVar2.R(e2Var.o(), tVar, Integer.valueOf(i11)), qVar.R(e2Var.m(), tVar, Integer.valueOf((i10 >> 3) & 112)), d5, str2, tVar, (i10 & 14) | ((i10 << 6) & 458752));
        tVar.p0();
        tVar.p0();
        return m4;
    }

    @fg.l
    @androidx.compose.runtime.j(scheme = "[0[0][0]]")
    @androidx.compose.runtime.i
    public static final <S> b5<androidx.compose.ui.unit.u> e(@fg.l e2<S> e2Var, @fg.m ld.q<? super e2.b<S>, ? super androidx.compose.runtime.t, ? super Integer, ? extends p0<androidx.compose.ui.unit.u>> qVar, @fg.m String str, @fg.l ld.q<? super S, ? super androidx.compose.runtime.t, ? super Integer, androidx.compose.ui.unit.u> qVar2, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-2104123233);
        if ((i5 & 1) != 0) {
            qVar = e.f2706b;
        }
        if ((i5 & 2) != 0) {
            str = "IntSizeAnimation";
        }
        String str2 = str;
        i2<androidx.compose.ui.unit.u, p> e4 = k2.e(androidx.compose.ui.unit.u.INSTANCE);
        int i6 = i4 & 14;
        int i7 = i4 << 3;
        int i10 = i6 | (i7 & 896) | (i7 & 7168) | (i7 & 57344);
        tVar.P(-142660079);
        int i11 = (i10 >> 9) & 112;
        b5<androidx.compose.ui.unit.u> m4 = m(e2Var, qVar2.R(e2Var.h(), tVar, Integer.valueOf(i11)), qVar2.R(e2Var.o(), tVar, Integer.valueOf(i11)), qVar.R(e2Var.m(), tVar, Integer.valueOf((i10 >> 3) & 112)), e4, str2, tVar, (i10 & 14) | ((i10 << 6) & 458752));
        tVar.p0();
        tVar.p0();
        return m4;
    }

    @fg.l
    @androidx.compose.runtime.j(scheme = "[0[0][0]]")
    @androidx.compose.runtime.i
    public static final <S> b5<i0.f> f(@fg.l e2<S> e2Var, @fg.m ld.q<? super e2.b<S>, ? super androidx.compose.runtime.t, ? super Integer, ? extends p0<i0.f>> qVar, @fg.m String str, @fg.l ld.q<? super S, ? super androidx.compose.runtime.t, ? super Integer, i0.f> qVar2, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(2078477582);
        if ((i5 & 1) != 0) {
            qVar = f.f2707b;
        }
        if ((i5 & 2) != 0) {
            str = "OffsetAnimation";
        }
        String str2 = str;
        i2<i0.f, p> f4 = k2.f(i0.f.INSTANCE);
        int i6 = i4 & 14;
        int i7 = i4 << 3;
        int i10 = i6 | (i7 & 896) | (i7 & 7168) | (i7 & 57344);
        tVar.P(-142660079);
        int i11 = (i10 >> 9) & 112;
        b5<i0.f> m4 = m(e2Var, qVar2.R(e2Var.h(), tVar, Integer.valueOf(i11)), qVar2.R(e2Var.o(), tVar, Integer.valueOf(i11)), qVar.R(e2Var.m(), tVar, Integer.valueOf((i10 >> 3) & 112)), f4, str2, tVar, (i10 & 14) | ((i10 << 6) & 458752));
        tVar.p0();
        tVar.p0();
        return m4;
    }

    @fg.l
    @androidx.compose.runtime.j(scheme = "[0[0][0]]")
    @androidx.compose.runtime.i
    public static final <S> b5<i0.i> g(@fg.l e2<S> e2Var, @fg.m ld.q<? super e2.b<S>, ? super androidx.compose.runtime.t, ? super Integer, ? extends p0<i0.i>> qVar, @fg.m String str, @fg.l ld.q<? super S, ? super androidx.compose.runtime.t, ? super Integer, i0.i> qVar2, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(1496278239);
        if ((i5 & 1) != 0) {
            qVar = g.f2708b;
        }
        if ((i5 & 2) != 0) {
            str = "RectAnimation";
        }
        String str2 = str;
        i2<i0.i, r> g4 = k2.g(i0.i.INSTANCE);
        int i6 = i4 & 14;
        int i7 = i4 << 3;
        int i10 = i6 | (i7 & 896) | (i7 & 7168) | (i7 & 57344);
        tVar.P(-142660079);
        int i11 = (i10 >> 9) & 112;
        b5<i0.i> m4 = m(e2Var, qVar2.R(e2Var.h(), tVar, Integer.valueOf(i11)), qVar2.R(e2Var.o(), tVar, Integer.valueOf(i11)), qVar.R(e2Var.m(), tVar, Integer.valueOf((i10 >> 3) & 112)), g4, str2, tVar, (i10 & 14) | ((i10 << 6) & 458752));
        tVar.p0();
        tVar.p0();
        return m4;
    }

    @fg.l
    @androidx.compose.runtime.j(scheme = "[0[0][0]]")
    @androidx.compose.runtime.i
    public static final <S> b5<i0.n> h(@fg.l e2<S> e2Var, @fg.m ld.q<? super e2.b<S>, ? super androidx.compose.runtime.t, ? super Integer, ? extends p0<i0.n>> qVar, @fg.m String str, @fg.l ld.q<? super S, ? super androidx.compose.runtime.t, ? super Integer, i0.n> qVar2, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-802210820);
        if ((i5 & 1) != 0) {
            qVar = h.f2709b;
        }
        if ((i5 & 2) != 0) {
            str = "SizeAnimation";
        }
        String str2 = str;
        i2<i0.n, p> h4 = k2.h(i0.n.INSTANCE);
        int i6 = i4 & 14;
        int i7 = i4 << 3;
        int i10 = i6 | (i7 & 896) | (i7 & 7168) | (i7 & 57344);
        tVar.P(-142660079);
        int i11 = (i10 >> 9) & 112;
        b5<i0.n> m4 = m(e2Var, qVar2.R(e2Var.h(), tVar, Integer.valueOf(i11)), qVar2.R(e2Var.o(), tVar, Integer.valueOf(i11)), qVar.R(e2Var.m(), tVar, Integer.valueOf((i10 >> 3) & 112)), h4, str2, tVar, (i10 & 14) | ((i10 << 6) & 458752));
        tVar.p0();
        tVar.p0();
        return m4;
    }

    @fg.l
    @androidx.compose.runtime.j(scheme = "[0[0][0]]")
    @androidx.compose.runtime.i
    public static final <S, T, V extends s> b5<T> i(@fg.l e2<S> e2Var, @fg.l i2<T, V> i2Var, @fg.m ld.q<? super e2.b<S>, ? super androidx.compose.runtime.t, ? super Integer, ? extends p0<T>> qVar, @fg.m String str, @fg.l ld.q<? super S, ? super androidx.compose.runtime.t, ? super Integer, ? extends T> qVar2, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-142660079);
        if ((i5 & 2) != 0) {
            qVar = i.f2710b;
        }
        if ((i5 & 4) != 0) {
            str = "ValueAnimation";
        }
        int i6 = (i4 >> 9) & 112;
        b5<T> m4 = m(e2Var, qVar2.R(e2Var.h(), tVar, Integer.valueOf(i6)), qVar2.R(e2Var.o(), tVar, Integer.valueOf(i6)), qVar.R(e2Var.m(), tVar, Integer.valueOf((i4 >> 3) & 112)), i2Var, str, tVar, (i4 & 14) | (57344 & (i4 << 9)) | ((i4 << 6) & 458752));
        tVar.p0();
        return m4;
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    @o0
    @fg.l
    @androidx.compose.runtime.i
    public static final <S, T> e2<T> j(@fg.l e2<S> e2Var, @fg.m String str, @fg.l ld.q<? super S, ? super androidx.compose.runtime.t, ? super Integer, ? extends T> qVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(1215497572);
        if ((i5 & 1) != 0) {
            str = "ChildTransition";
        }
        String str2 = str;
        int i6 = i4 & 14;
        tVar.P(1157296644);
        boolean q02 = tVar.q0(e2Var);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = e2Var.h();
            tVar.E(Q);
        }
        tVar.p0();
        if (e2Var.t()) {
            Q = e2Var.h();
        }
        int i7 = (i4 >> 3) & 112;
        e2<T> k4 = k(e2Var, qVar.R(Q, tVar, Integer.valueOf(i7)), qVar.R(e2Var.o(), tVar, Integer.valueOf(i7)), str2, tVar, i6 | ((i4 << 6) & 7168));
        tVar.p0();
        return k4;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kotlin.w0
    public static final <S, T> e2<T> k(@fg.l e2<S> e2Var, T t4, T t5, @fg.l String str, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-198307638);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-198307638, i4, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1022)");
        }
        tVar.P(1157296644);
        boolean q02 = tVar.q0(e2Var);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new e2(new h1(t4), e2Var.getLabel() + " > " + str);
            tVar.E(Q);
        }
        tVar.p0();
        e2<T> e2Var2 = (e2) Q;
        tVar.P(-561014285);
        boolean q03 = tVar.q0(e2Var) | tVar.q0(e2Var2);
        Object Q2 = tVar.Q();
        if (q03 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
            Q2 = new j(e2Var, e2Var2);
            tVar.E(Q2);
        }
        tVar.p0();
        androidx.compose.runtime.a1.c(e2Var2, (ld.l) Q2, tVar, 0);
        if (e2Var.t()) {
            e2Var2.C(t4, t5, e2Var.getLastSeekedTimeNanos());
        } else {
            e2Var2.K(t5, tVar, ((i4 >> 3) & 8) | ((i4 >> 6) & 14));
            e2Var2.F(false);
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e2Var2;
    }

    @fg.l
    @a1
    @androidx.compose.runtime.i
    public static final <S, T, V extends s> e2<S>.a<T, V> l(@fg.l e2<S> e2Var, @fg.l i2<T, V> i2Var, @fg.m String str, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-1714122528);
        if ((i5 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1714122528, i4, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:976)");
        }
        tVar.P(1157296644);
        boolean q02 = tVar.q0(e2Var);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = e2Var.new a(i2Var, str);
            tVar.E(Q);
        }
        tVar.p0();
        e2<S>.a<T, V> aVar = (e2.a) Q;
        androidx.compose.runtime.a1.c(aVar, new k(e2Var, aVar), tVar, 0);
        if (e2Var.t()) {
            aVar.f();
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return aVar;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kotlin.w0
    public static final <S, T, V extends s> b5<T> m(@fg.l e2<S> e2Var, T t4, T t5, @fg.l p0<T> p0Var, @fg.l i2<T, V> i2Var, @fg.l String str, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-304821198);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-304821198, i4, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1097)");
        }
        tVar.P(1157296644);
        boolean q02 = tVar.q0(e2Var);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = e2Var.new d(t4, androidx.compose.animation.core.n.i(i2Var, t5), i2Var, str);
            tVar.E(Q);
        }
        tVar.p0();
        e2.d dVar = (e2.d) Q;
        if (e2Var.t()) {
            dVar.Y(t4, t5, p0Var);
        } else {
            dVar.Z(t5, p0Var);
        }
        tVar.P(-561010487);
        boolean q03 = tVar.q0(e2Var) | tVar.q0(dVar);
        Object Q2 = tVar.Q();
        if (q03 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
            Q2 = new l(e2Var, dVar);
            tVar.E(Q2);
        }
        tVar.p0();
        androidx.compose.runtime.a1.c(dVar, (ld.l) Q2, tVar, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return dVar;
    }

    @fg.l
    @androidx.compose.runtime.i
    @o0
    public static final <T> e2<T> n(@fg.l g2<T> g2Var, @fg.m String str, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(1643203617);
        if ((i5 & 2) != 0) {
            str = null;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1643203617, i4, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:316)");
        }
        tVar.P(1157296644);
        boolean q02 = tVar.q0(g2Var);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new e2((g2) g2Var, str);
            tVar.E(Q);
        }
        tVar.p0();
        e2<T> e2Var = (e2) Q;
        e2Var.f(g2Var.b(), tVar, 0);
        tVar.P(-561041970);
        boolean q03 = tVar.q0(e2Var);
        Object Q2 = tVar.Q();
        if (q03 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
            Q2 = new m(e2Var);
            tVar.E(Q2);
        }
        tVar.p0();
        androidx.compose.runtime.a1.c(e2Var, (ld.l) Q2, tVar, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e2Var;
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final <T> e2<T> o(@fg.l h1<T> h1Var, @fg.m String str, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(882913843);
        if ((i5 & 2) != 0) {
            str = null;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(882913843, i4, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:355)");
        }
        e2<T> n4 = n(h1Var, str, tVar, i4 & 126, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return n4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final <T> e2<T> p(T t4, @fg.m String str, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(2029166765);
        if ((i5 & 2) != 0) {
            str = null;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(2029166765, i4, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:73)");
        }
        tVar.P(-492369756);
        Object Q = tVar.Q();
        t.Companion companion = androidx.compose.runtime.t.INSTANCE;
        if (Q == companion.a()) {
            Q = new e2(t4, str);
            tVar.E(Q);
        }
        tVar.p0();
        e2<T> e2Var = (e2) Q;
        e2Var.f(t4, tVar, (i4 & 8) | 48 | (i4 & 14));
        tVar.P(-561051652);
        boolean q02 = tVar.q0(e2Var);
        Object Q2 = tVar.Q();
        if (q02 || Q2 == companion.a()) {
            Q2 = new n(e2Var);
            tVar.E(Q2);
        }
        tVar.p0();
        androidx.compose.runtime.a1.c(e2Var, (ld.l) Q2, tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e2Var;
    }
}

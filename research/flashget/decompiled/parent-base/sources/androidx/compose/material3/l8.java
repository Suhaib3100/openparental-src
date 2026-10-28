package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.i;
import androidx.compose.material3.t9;
import androidx.compose.material3.x7;
import androidx.compose.runtime.t;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import androidx.profileinstaller.o;
import kotlin.Metadata;
import org.eclipse.paho.client.mqttv3.internal.ClientDefaults;

/* compiled from: SearchBar.android.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0091\u0002\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\r¢\u0006\u0002\b\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0087\u0002\u0010!\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\r¢\u0006\u0002\b\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aÈ\u0001\u0010$\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0014\u001a\u00020#2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b$\u0010%\"\u001a\u0010)\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\f\n\u0004\b!\u0010&\u0012\u0004\b'\u0010(\"\u001a\u0010,\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b*\u0010+\"\u0014\u0010.\u001a\u00020-8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010&\"\u001a\u00101\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010+\"\u0014\u00103\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010&\"\u001a\u00106\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u0010&\u001a\u0004\b5\u0010+\"\u0014\u00108\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010&\"\u0014\u0010<\u001a\u0002098\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u0010;\"\u0014\u0010>\u001a\u0002098\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u0010;\"\u0014\u0010@\u001a\u0002098\u0002X\u0082T¢\u0006\u0006\n\u0004\b?\u0010;\"\u0014\u0010C\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010B\"\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010B\"\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020-0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010F\"\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020-0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010F\"\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020I0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010F\"\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020I0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010F\"\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010P\"\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010T\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006X²\u0006\f\u0010V\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010W\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"", "query", "Lkotlin/Function1;", "Lkotlin/k2;", "onQueryChange", "onSearch", "", "active", "onActiveChange", "Landroidx/compose/ui/q;", "modifier", "enabled", "Lkotlin/Function0;", "Landroidx/compose/runtime/i;", "placeholder", "leadingIcon", "trailingIcon", "Landroidx/compose/ui/graphics/e6;", "shape", "Landroidx/compose/material3/j8;", "colors", "Landroidx/compose/ui/unit/h;", "tonalElevation", "shadowElevation", "Landroidx/compose/foundation/layout/n2;", "windowInsets", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "Landroidx/compose/foundation/layout/u;", "Lkotlin/u;", "content", "b", "(Ljava/lang/String;Lld/l;Lld/l;ZLld/l;Landroidx/compose/ui/q;ZLld/p;Lld/p;Lld/p;Landroidx/compose/ui/graphics/e6;Landroidx/compose/material3/j8;FFLandroidx/compose/foundation/layout/n2;Landroidx/compose/foundation/interaction/k;Lld/q;Landroidx/compose/runtime/t;III)V", "a", "(Ljava/lang/String;Lld/l;Lld/l;ZLld/l;Landroidx/compose/ui/q;ZLld/p;Lld/p;Lld/p;Landroidx/compose/ui/graphics/e6;Landroidx/compose/material3/j8;FFLandroidx/compose/foundation/interaction/k;Lld/q;Landroidx/compose/runtime/t;III)V", "Landroidx/compose/material3/pa;", "c", "(Ljava/lang/String;Lld/l;Lld/l;ZLld/l;Landroidx/compose/ui/q;ZLld/p;Lld/p;Lld/p;Landroidx/compose/material3/pa;Landroidx/compose/foundation/interaction/k;Landroidx/compose/runtime/t;III)V", "F", "l", "()V", "SearchBarCornerRadius", "k", "()F", "DockedActiveTableMinHeight", "", "DockedActiveTableMaxHeightScreenRatio", "d", "m", "SearchBarMinWidth", "e", "SearchBarMaxWidth", "f", "n", "SearchBarVerticalPadding", "g", "SearchBarIconOffsetX", "", "h", "I", "AnimationEnterDurationMillis", "i", "AnimationExitDurationMillis", "j", "AnimationDelayMillis", "Landroidx/compose/animation/core/x;", "Landroidx/compose/animation/core/x;", "AnimationEnterEasing", "AnimationExitEasing", "Landroidx/compose/animation/core/p0;", "Landroidx/compose/animation/core/p0;", "AnimationEnterFloatSpec", "AnimationExitFloatSpec", "Landroidx/compose/ui/unit/u;", "o", "AnimationEnterSizeSpec", "p", "AnimationExitSizeSpec", "Landroidx/compose/animation/f0;", "q", "Landroidx/compose/animation/f0;", "DockedEnterTransition", "Landroidx/compose/animation/h0;", "r", "Landroidx/compose/animation/h0;", "DockedExitTransition", "useFullScreenShape", "showResults", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,741:1\n1116#2,6:742\n1116#2,6:750\n1116#2,6:756\n1116#2,6:762\n1116#2,6:768\n1116#2,6:774\n1116#2,6:780\n1116#2,6:786\n1116#2,6:792\n1116#2,6:798\n1116#2,6:805\n1116#2,6:811\n1116#2,6:817\n1116#2,6:823\n1116#2,6:834\n1116#2,6:840\n1116#2,6:847\n74#3:748\n74#3:749\n74#3:804\n74#3:831\n74#3:846\n60#4:829\n62#4:830\n658#5:832\n646#5:833\n81#6:853\n75#7:854\n154#8:855\n154#8:856\n154#8:857\n154#8:858\n154#8:859\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt\n*L\n176#1:742,6\n189#1:750,6\n192#1:756,6\n212#1:762,6\n213#1:768,6\n228#1:774,6\n232#1:780,6\n287#1:786,6\n296#1:792,6\n363#1:798,6\n416#1:805,6\n425#1:811,6\n444#1:817,6\n446#1:823,6\n460#1:834,6\n461#1:840,6\n476#1:847,6\n184#1:748\n185#1:749\n366#1:804\n449#1:831\n473#1:846\n447#1:829\n448#1:830\n449#1:832\n449#1:833\n189#1:853\n702#1:854\n703#1:855\n705#1:856\n706#1:857\n707#1:858\n709#1:859\n*E\n"})
/* loaded from: classes.dex */
public final class l8 {

    /* renamed from: c, reason: collision with root package name */
    private static final float f12328c = 0.6666667f;

    /* renamed from: h, reason: collision with root package name */
    private static final int f12333h = 600;

    /* renamed from: i, reason: collision with root package name */
    private static final int f12334i = 350;

    /* renamed from: j, reason: collision with root package name */
    private static final int f12335j = 100;

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.animation.core.x f12336k;

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.animation.core.x f12337l;

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.animation.core.p0<Float> f12338m;

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.animation.core.p0<Float> f12339n;

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.animation.core.p0<androidx.compose.ui.unit.u> f12340o;

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.animation.core.p0<androidx.compose.ui.unit.u> f12341p;

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.animation.f0 f12342q;

    /* renamed from: r, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.animation.h0 f12343r;

    /* renamed from: a, reason: collision with root package name */
    private static final float f12326a = androidx.compose.ui.unit.h.g(k8.f12100a.f() / 2);

    /* renamed from: b, reason: collision with root package name */
    private static final float f12327b = 240;

    /* renamed from: d, reason: collision with root package name */
    private static final float f12329d = 360;

    /* renamed from: e, reason: collision with root package name */
    private static final float f12330e = 720;

    /* renamed from: f, reason: collision with root package name */
    private static final float f12331f = 8;

    /* renamed from: g, reason: collision with root package name */
    private static final float f12332g = 4;

    /* compiled from: SearchBar.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$DockedSearchBar$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,741:1\n73#2,7:742\n80#2:777\n84#2:782\n78#3,11:749\n91#3:781\n456#4,8:760\n464#4,3:774\n467#4,3:778\n3737#5,6:768\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$DockedSearchBar$2\n*L\n378#1:742,7\n378#1:777\n378#1:782\n378#1:749,11\n378#1:781\n378#1:760,8\n378#1:774,3\n378#1:778,3\n378#1:768,6\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12344b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<String, kotlin.k2> f12345c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<String, kotlin.k2> f12346d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f12347e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.l<Boolean, kotlin.k2> f12348f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f12349g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12350h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12351i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12352j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ j8 f12353k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f12354l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f12355m;

        /* compiled from: SearchBar.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/animation/s;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/s;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$DockedSearchBar$2$1$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,741:1\n74#2:742\n154#3:743\n1116#4,3:744\n1119#4,3:748\n1116#4,6:751\n88#5:747\n74#6,6:757\n80#6:791\n84#6:796\n78#7,11:763\n91#7:795\n456#8,8:774\n464#8,3:788\n467#8,3:792\n3737#9,6:782\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$DockedSearchBar$2$1$1\n*L\n398#1:742\n398#1:743\n399#1:744,3\n399#1:748,3\n402#1:751,6\n400#1:747\n406#1:757,6\n406#1:791\n406#1:796\n406#1:763,11\n406#1:795\n406#1:774,8\n406#1:788,3\n406#1:792,3\n406#1:782,6\n*E\n"})
        /* renamed from: androidx.compose.material3.l8$a$a, reason: collision with other inner class name */
        static final class C0272a extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.animation.s, androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j8 f12356b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f12357c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0272a(j8 j8Var, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar) {
                super(3);
                this.f12356b = j8Var;
                this.f12357c = qVar;
            }

            @Override // ld.q
            public /* bridge */ /* synthetic */ kotlin.k2 R(androidx.compose.animation.s sVar, androidx.compose.runtime.t tVar, Integer num) {
                a(sVar, tVar, num.intValue());
                return kotlin.k2.f75408a;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.l androidx.compose.animation.s sVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(1804538904, i4, -1, "androidx.compose.material3.DockedSearchBar.<anonymous>.<anonymous>.<anonymous> (SearchBar.android.kt:397)");
                }
                float g4 = androidx.compose.ui.unit.h.g(((Configuration) tVar.x(androidx.compose.ui.platform.o0.f())).screenHeightDp);
                tVar.P(747855826);
                boolean d5 = tVar.d(g4);
                Object Q = tVar.Q();
                if (d5 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                    Q = androidx.compose.ui.unit.h.d(g4 * l8.f12328c);
                    tVar.E(Q);
                }
                float u4 = ((androidx.compose.ui.unit.h) Q).u();
                tVar.p0();
                tVar.P(747855974);
                boolean d6 = tVar.d(u4);
                Object Q2 = tVar.Q();
                if (d6 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                    Q2 = androidx.compose.ui.unit.h.d(((androidx.compose.ui.unit.h) kotlin.ranges.s.D(androidx.compose.ui.unit.h.d(l8.k()), androidx.compose.ui.unit.h.d(u4))).u());
                    tVar.E(Q2);
                }
                float u5 = ((androidx.compose.ui.unit.h) Q2).u();
                tVar.p0();
                androidx.compose.ui.q j4 = androidx.compose.foundation.layout.c2.j(androidx.compose.ui.q.INSTANCE, u5, u4);
                j8 j8Var = this.f12356b;
                ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> qVar = this.f12357c;
                tVar.P(-483455358);
                androidx.compose.ui.layout.m0 a5 = androidx.compose.material3.d.a(androidx.compose.ui.c.INSTANCE, androidx.compose.foundation.layout.i.f5073a.r(), tVar, 0, -1323940314);
                int j5 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B = tVar.B();
                g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
                ld.a<androidx.compose.ui.node.g> a6 = companion.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(j4);
                if (tVar.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar.W();
                if (tVar.getInserting()) {
                    tVar.F(a6);
                } else {
                    tVar.C();
                }
                ld.p a7 = androidx.compose.animation.p.a(companion, tVar, a5, tVar, B);
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j5))) {
                    androidx.compose.animation.d.a(j5, tVar, j5, a7);
                }
                androidx.compose.animation.e.a(0, g5, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                androidx.compose.foundation.layout.v vVar = androidx.compose.foundation.layout.v.f5347a;
                r4.b(null, 0.0f, j8Var.getDividerColor(), tVar, 0, 3);
                qVar.R(vVar, tVar, 6);
                tVar.p0();
                tVar.H();
                tVar.p0();
                tVar.p0();
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.q0();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(String str, ld.l<? super String, kotlin.k2> lVar, ld.l<? super String, kotlin.k2> lVar2, boolean z4, ld.l<? super Boolean, kotlin.k2> lVar3, boolean z5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, j8 j8Var, androidx.compose.foundation.interaction.k kVar, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar) {
            super(2);
            this.f12344b = str;
            this.f12345c = lVar;
            this.f12346d = lVar2;
            this.f12347e = z4;
            this.f12348f = lVar3;
            this.f12349g = z5;
            this.f12350h = pVar;
            this.f12351i = pVar2;
            this.f12352j = pVar3;
            this.f12353k = j8Var;
            this.f12354l = kVar;
            this.f12355m = qVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1088676554, i4, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.android.kt:377)");
            }
            String str = this.f12344b;
            ld.l<String, kotlin.k2> lVar = this.f12345c;
            ld.l<String, kotlin.k2> lVar2 = this.f12346d;
            boolean z4 = this.f12347e;
            ld.l<Boolean, kotlin.k2> lVar3 = this.f12348f;
            boolean z5 = this.f12349g;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f12350h;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar2 = this.f12351i;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar3 = this.f12352j;
            j8 j8Var = this.f12353k;
            androidx.compose.foundation.interaction.k kVar = this.f12354l;
            ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> qVar = this.f12355m;
            tVar.P(-483455358);
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            androidx.compose.ui.layout.m0 a5 = androidx.compose.material3.d.a(androidx.compose.ui.c.INSTANCE, androidx.compose.foundation.layout.i.f5073a.r(), tVar, 0, -1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(companion);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a6);
            } else {
                tVar.C();
            }
            ld.p a7 = androidx.compose.animation.p.a(companion2, tVar, a5, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a7);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.v vVar = androidx.compose.foundation.layout.v.f5347a;
            l8.c(str, lVar, lVar2, z4, lVar3, null, z5, pVar, pVar2, pVar3, j8Var.getInputFieldColors(), kVar, tVar, 0, 0, 32);
            androidx.compose.animation.q.g(vVar, z4, null, l8.f12342q, l8.f12343r, null, androidx.compose.runtime.internal.c.b(tVar, 1804538904, true, new C0272a(j8Var, qVar)), tVar, 1600518, 18);
            if (t.a(tVar)) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SearchBar.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$3$1", f = "SearchBar.android.kt", i = {}, l = {420}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f12358b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f12359c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.m f12360d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z4, androidx.compose.ui.focus.m mVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f12359c = z4;
            this.f12360d = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new b(this.f12359c, this.f12360d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f12358b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                if (this.f12359c) {
                    this.f12358b = 1;
                    if (kotlinx.coroutines.c1.b(100L, this) == aVar) {
                        return aVar;
                    }
                }
                return kotlin.k2.f75408a;
            }
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            androidx.compose.ui.focus.m.j(this.f12360d, false, 1, null);
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: SearchBar.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Boolean, kotlin.k2> f12361b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ld.l<? super Boolean, kotlin.k2> lVar) {
            super(0);
            this.f12361b = lVar;
        }

        public final void a() {
            this.f12361b.invoke(Boolean.FALSE);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SearchBar.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12362b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<String, kotlin.k2> f12363c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<String, kotlin.k2> f12364d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f12365e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.l<Boolean, kotlin.k2> f12366f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12367g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f12368h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12369i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12370j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12371k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f12372l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ j8 f12373m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ float f12374n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ float f12375o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f12376p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f12377q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f12378r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f12379s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f12380t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(String str, ld.l<? super String, kotlin.k2> lVar, ld.l<? super String, kotlin.k2> lVar2, boolean z4, ld.l<? super Boolean, kotlin.k2> lVar3, androidx.compose.ui.q qVar, boolean z5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, androidx.compose.ui.graphics.e6 e6Var, j8 j8Var, float f4, float f5, androidx.compose.foundation.interaction.k kVar, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5, int i6) {
            super(2);
            this.f12362b = str;
            this.f12363c = lVar;
            this.f12364d = lVar2;
            this.f12365e = z4;
            this.f12366f = lVar3;
            this.f12367g = qVar;
            this.f12368h = z5;
            this.f12369i = pVar;
            this.f12370j = pVar2;
            this.f12371k = pVar3;
            this.f12372l = e6Var;
            this.f12373m = j8Var;
            this.f12374n = f4;
            this.f12375o = f5;
            this.f12376p = kVar;
            this.f12377q = qVar2;
            this.f12378r = i4;
            this.f12379s = i5;
            this.f12380t = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            l8.a(this.f12362b, this.f12363c, this.f12364d, this.f12365e, this.f12366f, this.f12367g, this.f12368h, this.f12369i, this.f12370j, this.f12371k, this.f12372l, this.f12373m, this.f12374n, this.f12375o, this.f12376p, this.f12377q, tVar, androidx.compose.runtime.g3.b(this.f12378r | 1), androidx.compose.runtime.g3.b(this.f12379s), this.f12380t);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SearchBar.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/n2;", "consumedInsets", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/layout/n2;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.foundation.layout.n2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e7 f12381b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f12382c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(e7 e7Var, androidx.compose.foundation.layout.n2 n2Var) {
            super(1);
            this.f12381b = e7Var;
            this.f12382c = n2Var;
        }

        public final void a(@fg.l androidx.compose.foundation.layout.n2 n2Var) {
            this.f12381b.f(androidx.compose.foundation.layout.r2.i(this.f12382c, n2Var));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.foundation.layout.n2 n2Var) {
            a(n2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SearchBar.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$SearchBar$3$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,741:1\n154#2:742\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$SearchBar$3$1\n*L\n234#1:742\n*E\n"})
    static final class f extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.layout.o0, androidx.compose.ui.layout.l0, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<androidx.compose.ui.unit.h> f12383b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<Float> f12384c;

        /* compiled from: SearchBar.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f12385b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f12386c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.layout.i1 i1Var, int i4) {
                super(1);
                this.f12385b = i1Var;
                this.f12386c = i4;
            }

            public final void a(@fg.l i1.a aVar) {
                i1.a.m(aVar, this.f12385b, 0, this.f12386c, 0.0f, 4, null);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
                a(aVar);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(androidx.compose.runtime.b5<androidx.compose.ui.unit.h> b5Var, androidx.compose.runtime.b5<Float> b5Var2) {
            super(3);
            this.f12383b = b5Var;
            this.f12384c = b5Var2;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.n0 R(androidx.compose.ui.layout.o0 o0Var, androidx.compose.ui.layout.l0 l0Var, androidx.compose.ui.unit.b bVar) {
            return a(o0Var, l0Var, bVar.getValue());
        }

        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
            int q22 = o0Var.q2(androidx.compose.ui.unit.i.I(this.f12383b.getValue().u(), 0, this.f12384c.getValue().floatValue()));
            int max = Math.max(androidx.compose.ui.unit.b.r(j4), o0Var.q2(l8.m()));
            int min = Math.min(androidx.compose.ui.unit.b.p(j4), o0Var.q2(l8.f12330e));
            if (max > min) {
                max = min;
            }
            int max2 = Math.max(androidx.compose.ui.unit.b.q(j4), o0Var.q2(k8.f12100a.f()));
            int o4 = androidx.compose.ui.unit.b.o(j4);
            if (max2 > o4) {
                max2 = o4;
            }
            int p4 = androidx.compose.ui.unit.b.p(j4);
            int o5 = androidx.compose.ui.unit.b.o(j4);
            int b5 = androidx.compose.ui.util.d.b(max, p4, this.f12384c.getValue().floatValue());
            int b6 = androidx.compose.ui.util.d.b(max2, o5, this.f12384c.getValue().floatValue()) + q22;
            return androidx.compose.ui.layout.o0.x2(o0Var, b5, b6, null, new a(l0Var.m0(androidx.compose.ui.unit.c.j(androidx.compose.ui.unit.b.INSTANCE.c(b5, b6), 0, -q22, 1, null)), q22), 4, null);
        }
    }

    /* compiled from: SearchBar.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$SearchBar$4\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,741:1\n73#2,7:742\n80#2:777\n74#2,6:796\n80#2:830\n84#2:835\n84#2:840\n78#3,11:749\n78#3,11:802\n91#3:834\n91#3:839\n456#4,8:760\n464#4,3:774\n456#4,8:813\n464#4,3:827\n467#4,3:831\n467#4,3:836\n3737#5,6:768\n3737#5,6:821\n1116#6,6:778\n1116#6,6:784\n1116#6,6:790\n81#7:841\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$SearchBar$4\n*L\n254#1:742,7\n254#1:777\n277#1:796,6\n277#1:830\n277#1:835\n254#1:840\n254#1:749,11\n277#1:802,11\n277#1:834\n254#1:839\n254#1:760,8\n254#1:774,3\n277#1:813,8\n277#1:827,3\n277#1:831,3\n254#1:836,3\n254#1:768,6\n277#1:821,6\n255#1:778,6\n273#1:784,6\n277#1:790,6\n273#1:841\n*E\n"})
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12387b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<String, kotlin.k2> f12388c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<String, kotlin.k2> f12389d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f12390e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.l<Boolean, kotlin.k2> f12391f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f12392g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12393h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12394i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12395j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ j8 f12396k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f12397l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<Float> f12398m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<androidx.compose.ui.unit.h> f12399n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f12400o;

        /* compiled from: SearchBar.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/q4;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/q4;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.q4, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.b5<Float> f12401b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.runtime.b5<Float> b5Var) {
                super(1);
                this.f12401b = b5Var;
            }

            public final void a(@fg.l androidx.compose.ui.graphics.q4 q4Var) {
                q4Var.k(this.f12401b.getValue().floatValue());
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.q4 q4Var) {
                a(q4Var);
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: SearchBar.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.b5<Float> f12402b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(androidx.compose.runtime.b5<Float> b5Var) {
                super(0);
                this.f12402b = b5Var;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(this.f12402b.getValue().floatValue() > 0.0f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(String str, ld.l<? super String, kotlin.k2> lVar, ld.l<? super String, kotlin.k2> lVar2, boolean z4, ld.l<? super Boolean, kotlin.k2> lVar3, boolean z5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, j8 j8Var, androidx.compose.foundation.interaction.k kVar, androidx.compose.runtime.b5<Float> b5Var, androidx.compose.runtime.b5<androidx.compose.ui.unit.h> b5Var2, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar) {
            super(2);
            this.f12387b = str;
            this.f12388c = lVar;
            this.f12389d = lVar2;
            this.f12390e = z4;
            this.f12391f = lVar3;
            this.f12392g = z5;
            this.f12393h = pVar;
            this.f12394i = pVar2;
            this.f12395j = pVar3;
            this.f12396k = j8Var;
            this.f12397l = kVar;
            this.f12398m = b5Var;
            this.f12399n = b5Var2;
            this.f12400o = qVar;
        }

        private static final boolean b(androidx.compose.runtime.b5<Boolean> b5Var) {
            return b5Var.getValue().booleanValue();
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            androidx.compose.runtime.b5<Float> b5Var;
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(483163116, i4, -1, "androidx.compose.material3.SearchBar.<anonymous> (SearchBar.android.kt:253)");
            }
            String str = this.f12387b;
            ld.l<String, kotlin.k2> lVar = this.f12388c;
            ld.l<String, kotlin.k2> lVar2 = this.f12389d;
            boolean z4 = this.f12390e;
            ld.l<Boolean, kotlin.k2> lVar3 = this.f12391f;
            boolean z5 = this.f12392g;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f12393h;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar2 = this.f12394i;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar3 = this.f12395j;
            j8 j8Var = this.f12396k;
            androidx.compose.foundation.interaction.k kVar = this.f12397l;
            androidx.compose.runtime.b5<Float> b5Var2 = this.f12398m;
            androidx.compose.runtime.b5<androidx.compose.ui.unit.h> b5Var3 = this.f12399n;
            ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> qVar = this.f12400o;
            tVar.P(-483455358);
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f5073a;
            i.m r4 = iVar.r();
            c.Companion companion2 = androidx.compose.ui.c.INSTANCE;
            androidx.compose.ui.layout.m0 a5 = androidx.compose.material3.d.a(companion2, r4, tVar, 0, -1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion3 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion3.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(companion);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a6);
            } else {
                tVar.C();
            }
            ld.p a7 = androidx.compose.animation.p.a(companion3, tVar, a5, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a7);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.v vVar = androidx.compose.foundation.layout.v.f5347a;
            tVar.P(-685095283);
            Object Q = tVar.Q();
            t.Companion companion4 = androidx.compose.runtime.t.INSTANCE;
            if (Q == companion4.a()) {
                Q = new androidx.compose.material3.n(b5Var2, b5Var3);
                tVar.E(Q);
            }
            tVar.p0();
            l8.c(str, lVar, lVar2, z4, lVar3, androidx.compose.foundation.layout.j1.j(companion, (androidx.compose.material3.n) Q), z5, pVar, pVar2, pVar3, j8Var.getInputFieldColors(), kVar, tVar, o.c.f32821k, 0, 0);
            tVar.P(-685094554);
            Object Q2 = tVar.Q();
            if (Q2 == companion4.a()) {
                b5Var = b5Var2;
                Q2 = androidx.compose.runtime.o4.d(androidx.compose.runtime.o4.x(), new b(b5Var));
                tVar.E(Q2);
            } else {
                b5Var = b5Var2;
            }
            tVar.p0();
            tVar.P(551421253);
            if (b((androidx.compose.runtime.b5) Q2)) {
                tVar.P(-685094361);
                boolean q02 = tVar.q0(b5Var);
                Object Q3 = tVar.Q();
                if (q02 || Q3 == companion4.a()) {
                    Q3 = new a(b5Var);
                    tVar.E(Q3);
                }
                tVar.p0();
                androidx.compose.ui.q a8 = androidx.compose.ui.graphics.p4.a(companion, (ld.l) Q3);
                tVar.P(-483455358);
                androidx.compose.ui.layout.m0 a10 = androidx.compose.material3.d.a(companion2, iVar.r(), tVar, 0, -1323940314);
                int j5 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B2 = tVar.B();
                ld.a<androidx.compose.ui.node.g> a11 = companion3.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(a8);
                if (tVar.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar.W();
                if (tVar.getInserting()) {
                    tVar.F(a11);
                } else {
                    tVar.C();
                }
                ld.p a12 = androidx.compose.animation.p.a(companion3, tVar, a10, tVar, B2);
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j5))) {
                    androidx.compose.animation.d.a(j5, tVar, j5, a12);
                }
                androidx.compose.animation.e.a(0, g5, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                r4.b(null, 0.0f, j8Var.getDividerColor(), tVar, 0, 3);
                qVar.R(vVar, tVar, 6);
                tVar.p0();
                tVar.H();
                tVar.p0();
                tVar.p0();
            }
            if (androidx.compose.animation.y.a(tVar)) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SearchBar.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SearchBar_androidKt$SearchBar$5$1", f = "SearchBar.android.kt", i = {}, l = {291}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f12403b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f12404c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.m f12405d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z4, androidx.compose.ui.focus.m mVar, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f12404c = z4;
            this.f12405d = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new h(this.f12404c, this.f12405d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f12403b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                if (this.f12404c) {
                    this.f12403b = 1;
                    if (kotlinx.coroutines.c1.b(100L, this) == aVar) {
                        return aVar;
                    }
                }
                return kotlin.k2.f75408a;
            }
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            androidx.compose.ui.focus.m.j(this.f12405d, false, 1, null);
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((h) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: SearchBar.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Boolean, kotlin.k2> f12406b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(ld.l<? super Boolean, kotlin.k2> lVar) {
            super(0);
            this.f12406b = lVar;
        }

        public final void a() {
            this.f12406b.invoke(Boolean.FALSE);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SearchBar.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12407b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<String, kotlin.k2> f12408c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<String, kotlin.k2> f12409d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f12410e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.l<Boolean, kotlin.k2> f12411f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12412g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f12413h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12414i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12415j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12416k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f12417l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ j8 f12418m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ float f12419n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ float f12420o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f12421p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f12422q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f12423r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f12424s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f12425t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f12426u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(String str, ld.l<? super String, kotlin.k2> lVar, ld.l<? super String, kotlin.k2> lVar2, boolean z4, ld.l<? super Boolean, kotlin.k2> lVar3, androidx.compose.ui.q qVar, boolean z5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, androidx.compose.ui.graphics.e6 e6Var, j8 j8Var, float f4, float f5, androidx.compose.foundation.layout.n2 n2Var, androidx.compose.foundation.interaction.k kVar, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5, int i6) {
            super(2);
            this.f12407b = str;
            this.f12408c = lVar;
            this.f12409d = lVar2;
            this.f12410e = z4;
            this.f12411f = lVar3;
            this.f12412g = qVar;
            this.f12413h = z5;
            this.f12414i = pVar;
            this.f12415j = pVar2;
            this.f12416k = pVar3;
            this.f12417l = e6Var;
            this.f12418m = j8Var;
            this.f12419n = f4;
            this.f12420o = f5;
            this.f12421p = n2Var;
            this.f12422q = kVar;
            this.f12423r = qVar2;
            this.f12424s = i4;
            this.f12425t = i5;
            this.f12426u = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            l8.b(this.f12407b, this.f12408c, this.f12409d, this.f12410e, this.f12411f, this.f12412g, this.f12413h, this.f12414i, this.f12415j, this.f12416k, this.f12417l, this.f12418m, this.f12419n, this.f12420o, this.f12421p, this.f12422q, this.f12423r, tVar, androidx.compose.runtime.g3.b(this.f12424s | 1), androidx.compose.runtime.g3.b(this.f12425t), this.f12426u);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SearchBar.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/graphics/g5;", "Li0/n;", "size", "Landroidx/compose/ui/unit/w;", "<anonymous parameter 1>", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/g5;JLandroidx/compose/ui/unit/w;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$SearchBar$animatedShape$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,741:1\n88#2:742\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$SearchBar$animatedShape$1$1\n*L\n198#1:742\n*E\n"})
    static final class k extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.graphics.g5, i0.n, androidx.compose.ui.unit.w, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.unit.d f12427b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<Float> f12428c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(androidx.compose.ui.unit.d dVar, androidx.compose.runtime.b5<Float> b5Var) {
            super(3);
            this.f12427b = dVar;
            this.f12428c = b5Var;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(androidx.compose.ui.graphics.g5 g5Var, i0.n nVar, androidx.compose.ui.unit.w wVar) {
            a(g5Var, nVar.getPackedValue(), wVar);
            return kotlin.k2.f75408a;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.g5 g5Var, long j4, @fg.l androidx.compose.ui.unit.w wVar) {
            g5Var.r(i0.m.f(i0.o.m(j4), i0.b.b(this.f12427b.v5(androidx.compose.ui.unit.h.g((1 - this.f12428c.getValue().floatValue()) * l8.f12326a)), 0.0f, 2, null)));
        }
    }

    /* compiled from: SearchBar.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/unit/h;", "a", "()F"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$SearchBar$topPadding$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,741:1\n51#2:742\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$SearchBar$topPadding$1$1\n*L\n215#1:742\n*E\n"})
    static final class l extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.ui.unit.h> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e7 f12429b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.unit.d f12430c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(e7 e7Var, androidx.compose.ui.unit.d dVar) {
            super(0);
            this.f12429b = e7Var;
            this.f12430c = dVar;
        }

        public final float a() {
            return androidx.compose.ui.unit.h.g(androidx.compose.foundation.layout.r2.h(this.f12429b, this.f12430c).getTop() + l8.n());
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.h invoke() {
            return androidx.compose.ui.unit.h.d(a());
        }
    }

    /* compiled from: SearchBar.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class m extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<Float> f12431b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(androidx.compose.runtime.b5<Float> b5Var) {
            super(0);
            this.f12431b = b5Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f12431b.getValue().floatValue() == 1.0f);
        }
    }

    /* compiled from: SearchBar.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/j0;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/focus/j0;)V"}, k = 3, mv = {1, 8, 0})
    static final class n extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.focus.j0, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Boolean, kotlin.k2> f12432b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(ld.l<? super Boolean, kotlin.k2> lVar) {
            super(1);
            this.f12432b = lVar;
        }

        public final void a(@fg.l androidx.compose.ui.focus.j0 j0Var) {
            if (j0Var.isFocused()) {
                this.f12432b.invoke(Boolean.TRUE);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.focus.j0 j0Var) {
            a(j0Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SearchBar.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class o extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12433b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f12434c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f12435d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.a0 f12436e;

        /* compiled from: SearchBar.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.a0 f12437b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.focus.a0 a0Var) {
                super(0);
                this.f12437b = a0Var;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                this.f12437b.e();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, boolean z4, String str2, androidx.compose.ui.focus.a0 a0Var) {
            super(1);
            this.f12433b = str;
            this.f12434c = z4;
            this.f12435d = str2;
            this.f12436e = a0Var;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.a1(zVar, this.f12433b);
            if (this.f12434c) {
                androidx.compose.ui.semantics.w.q1(zVar, this.f12435d);
            }
            androidx.compose.ui.semantics.w.x0(zVar, null, new a(this.f12436e), 1, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SearchBar.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/c0;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text/c0;)V"}, k = 3, mv = {1, 8, 0})
    static final class p extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.foundation.text.c0, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<String, kotlin.k2> f12438b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f12439c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p(ld.l<? super String, kotlin.k2> lVar, String str) {
            super(1);
            this.f12438b = lVar;
            this.f12439c = str;
        }

        public final void a(@fg.l androidx.compose.foundation.text.c0 c0Var) {
            this.f12438b.invoke(this.f12439c);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.foundation.text.c0 c0Var) {
            a(c0Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SearchBar.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "innerTextField", "a", "(Lld/p;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$5\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,741:1\n1#2:742\n*E\n"})
    static final class q extends kotlin.jvm.internal.n0 implements ld.q<ld.p<? super androidx.compose.runtime.t, ? super Integer, ? extends kotlin.k2>, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12440b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f12441c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f12442d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12443e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12444f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12445g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ pa f12446h;

        /* compiled from: SearchBar.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$5$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,741:1\n68#2,6:742\n74#2:776\n78#2:781\n78#3,11:748\n91#3:780\n456#4,8:759\n464#4,3:773\n467#4,3:777\n3737#5,6:767\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$5$1$1\n*L\n488#1:742,6\n488#1:776\n488#1:781\n488#1:748,11\n488#1:780\n488#1:759,8\n488#1:773,3\n488#1:777,3\n488#1:767,6\n*E\n"})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12447b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
                super(2);
                this.f12447b = pVar;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(-1030845367, i4, -1, "androidx.compose.material3.SearchBarInputField.<anonymous>.<anonymous>.<anonymous> (SearchBar.android.kt:487)");
                }
                androidx.compose.ui.q f4 = androidx.compose.foundation.layout.f1.f(androidx.compose.ui.q.INSTANCE, l8.f12332g, 0.0f, 2, null);
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f12447b;
                tVar.P(733328855);
                androidx.compose.ui.layout.m0 a5 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, tVar, 0, -1323940314);
                int j4 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B = tVar.B();
                g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
                ld.a<androidx.compose.ui.node.g> a6 = companion.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(f4);
                if (tVar.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar.W();
                if (tVar.getInserting()) {
                    tVar.F(a6);
                } else {
                    tVar.C();
                }
                ld.p a7 = androidx.compose.animation.p.a(companion, tVar, a5, tVar, B);
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                    androidx.compose.animation.d.a(j4, tVar, j4, a7);
                }
                androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
                if (androidx.compose.foundation.x.a(0, pVar, tVar)) {
                    androidx.compose.runtime.x.q0();
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                a(tVar, num.intValue());
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: SearchBar.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$5$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,741:1\n64#2:742\n68#3,6:743\n74#3:777\n78#3:782\n78#4,11:749\n91#4:781\n456#5,8:760\n464#5,3:774\n467#5,3:778\n3737#6,6:768\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$5$2$1\n*L\n491#1:742\n491#1:743,6\n491#1:777\n491#1:782\n491#1:749,11\n491#1:781\n491#1:760,8\n491#1:774,3\n491#1:778,3\n491#1:768,6\n*E\n"})
        static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12448b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
                super(2);
                this.f12448b = pVar;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(-1558904811, i4, -1, "androidx.compose.material3.SearchBarInputField.<anonymous>.<anonymous>.<anonymous> (SearchBar.android.kt:490)");
                }
                androidx.compose.ui.q f4 = androidx.compose.foundation.layout.f1.f(androidx.compose.ui.q.INSTANCE, androidx.compose.ui.unit.h.g(-l8.f12332g), 0.0f, 2, null);
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f12448b;
                tVar.P(733328855);
                androidx.compose.ui.layout.m0 a5 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, tVar, 0, -1323940314);
                int j4 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B = tVar.B();
                g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
                ld.a<androidx.compose.ui.node.g> a6 = companion.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(f4);
                if (tVar.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar.W();
                if (tVar.getInserting()) {
                    tVar.F(a6);
                } else {
                    tVar.C();
                }
                ld.p a7 = androidx.compose.animation.p.a(companion, tVar, a5, tVar, B);
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                    androidx.compose.animation.d.a(j4, tVar, j4, a7);
                }
                androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
                if (androidx.compose.foundation.x.a(0, pVar, tVar)) {
                    androidx.compose.runtime.x.q0();
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                a(tVar, num.intValue());
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(String str, boolean z4, androidx.compose.foundation.interaction.k kVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, pa paVar) {
            super(3);
            this.f12440b = str;
            this.f12441c = z4;
            this.f12442d = kVar;
            this.f12443e = pVar;
            this.f12444f = pVar2;
            this.f12445g = pVar3;
            this.f12446h = paVar;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(ld.p<? super androidx.compose.runtime.t, ? super Integer, ? extends kotlin.k2> pVar, androidx.compose.runtime.t tVar, Integer num) {
            a(pVar, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
        @androidx.compose.runtime.i
        public final void a(@fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            int i5;
            if ((i4 & 6) == 0) {
                i5 = i4 | (tVar.S(pVar) ? 4 : 2);
            } else {
                i5 = i4;
            }
            if ((i5 & 19) == 18 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-951844929, i5, -1, "androidx.compose.material3.SearchBarInputField.<anonymous> (SearchBar.android.kt:478)");
            }
            qa qaVar = qa.f13733a;
            String str = this.f12440b;
            boolean z4 = this.f12441c;
            androidx.compose.ui.text.input.k1 c5 = androidx.compose.ui.text.input.k1.INSTANCE.c();
            androidx.compose.foundation.interaction.k kVar = this.f12442d;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar2 = this.f12443e;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar3 = this.f12444f;
            androidx.compose.runtime.internal.a b5 = pVar3 != null ? androidx.compose.runtime.internal.c.b(tVar, -1030845367, true, new a(pVar3)) : null;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar4 = this.f12445g;
            androidx.compose.runtime.internal.a b6 = pVar4 != null ? androidx.compose.runtime.internal.c.b(tVar, -1558904811, true, new b(pVar4)) : null;
            androidx.compose.ui.graphics.e6 g4 = k8.f12100a.g(tVar, 6);
            pa paVar = this.f12446h;
            androidx.compose.foundation.layout.l1 n4 = qa.n(qaVar, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
            j3.f11898a.getClass();
            qaVar.b(str, pVar, z4, true, c5, kVar, false, null, pVar2, b5, b6, null, null, null, g4, paVar, n4, j3.f11899b, tVar, ((i5 << 3) & 112) | 27648, 113246208, 14528);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: SearchBar.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class r extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12449b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<String, kotlin.k2> f12450c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<String, kotlin.k2> f12451d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f12452e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.l<Boolean, kotlin.k2> f12453f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12454g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f12455h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12456i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12457j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12458k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ pa f12459l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f12460m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f12461n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f12462o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f12463p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        r(String str, ld.l<? super String, kotlin.k2> lVar, ld.l<? super String, kotlin.k2> lVar2, boolean z4, ld.l<? super Boolean, kotlin.k2> lVar3, androidx.compose.ui.q qVar, boolean z5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, pa paVar, androidx.compose.foundation.interaction.k kVar, int i4, int i5, int i6) {
            super(2);
            this.f12449b = str;
            this.f12450c = lVar;
            this.f12451d = lVar2;
            this.f12452e = z4;
            this.f12453f = lVar3;
            this.f12454g = qVar;
            this.f12455h = z5;
            this.f12456i = pVar;
            this.f12457j = pVar2;
            this.f12458k = pVar3;
            this.f12459l = paVar;
            this.f12460m = kVar;
            this.f12461n = i4;
            this.f12462o = i5;
            this.f12463p = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            l8.c(this.f12449b, this.f12450c, this.f12451d, this.f12452e, this.f12453f, this.f12454g, this.f12455h, this.f12456i, this.f12457j, this.f12458k, this.f12459l, this.f12460m, tVar, androidx.compose.runtime.g3.b(this.f12461n | 1), androidx.compose.runtime.g3.b(this.f12462o), this.f12463p);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    static {
        androidx.compose.animation.core.x c5 = c0.h0.f37356a.c();
        f12336k = c5;
        androidx.compose.animation.core.x xVar = new androidx.compose.animation.core.x(0.0f, 1.0f, 0.0f, 1.0f);
        f12337l = xVar;
        androidx.compose.animation.core.h2 h2Var = new androidx.compose.animation.core.h2(600, 100, c5);
        f12338m = h2Var;
        androidx.compose.animation.core.h2 h2Var2 = new androidx.compose.animation.core.h2(f12334i, 100, xVar);
        f12339n = h2Var2;
        androidx.compose.animation.core.h2 h2Var3 = new androidx.compose.animation.core.h2(600, 100, c5);
        f12340o = h2Var3;
        androidx.compose.animation.core.h2 h2Var4 = new androidx.compose.animation.core.h2(f12334i, 100, xVar);
        f12341p = h2Var4;
        f12342q = androidx.compose.animation.d0.q(h2Var, 0.0f, 2, null).c(androidx.compose.animation.d0.o(h2Var3, null, false, null, 14, null));
        f12343r = androidx.compose.animation.d0.s(h2Var2, 0.0f, 2, null).d(androidx.compose.animation.d0.E(h2Var4, null, false, null, 14, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03dc  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l java.lang.String r44, @fg.l ld.l<? super java.lang.String, kotlin.k2> r45, @fg.l ld.l<? super java.lang.String, kotlin.k2> r46, boolean r47, @fg.l ld.l<? super java.lang.Boolean, kotlin.k2> r48, @fg.m androidx.compose.ui.q r49, boolean r50, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r51, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r52, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r53, @fg.m androidx.compose.ui.graphics.e6 r54, @fg.m androidx.compose.material3.j8 r55, float r56, float r57, @fg.m androidx.compose.foundation.interaction.k r58, @fg.l ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r59, @fg.m androidx.compose.runtime.t r60, int r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.l8.a(java.lang.String, ld.l, ld.l, boolean, ld.l, androidx.compose.ui.q, boolean, ld.p, ld.p, ld.p, androidx.compose.ui.graphics.e6, androidx.compose.material3.j8, float, float, androidx.compose.foundation.interaction.k, ld.q, androidx.compose.runtime.t, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x04a6, code lost:
    
        if (r10.q0(r6) == false) goto L290;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0581 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0242  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@fg.l java.lang.String r44, @fg.l ld.l<? super java.lang.String, kotlin.k2> r45, @fg.l ld.l<? super java.lang.String, kotlin.k2> r46, boolean r47, @fg.l ld.l<? super java.lang.Boolean, kotlin.k2> r48, @fg.m androidx.compose.ui.q r49, boolean r50, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r51, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r52, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r53, @fg.m androidx.compose.ui.graphics.e6 r54, @fg.m androidx.compose.material3.j8 r55, float r56, float r57, @fg.m androidx.compose.foundation.layout.n2 r58, @fg.m androidx.compose.foundation.interaction.k r59, @fg.l ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r60, @fg.m androidx.compose.runtime.t r61, int r62, int r63, int r64) {
        /*
            Method dump skipped, instructions count: 1592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.l8.b(java.lang.String, ld.l, ld.l, boolean, ld.l, androidx.compose.ui.q, boolean, ld.p, ld.p, ld.p, androidx.compose.ui.graphics.e6, androidx.compose.material3.j8, float, float, androidx.compose.foundation.layout.n2, androidx.compose.foundation.interaction.k, ld.q, androidx.compose.runtime.t, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void c(String str, ld.l<? super String, kotlin.k2> lVar, ld.l<? super String, kotlin.k2> lVar2, boolean z4, ld.l<? super Boolean, kotlin.k2> lVar3, androidx.compose.ui.q qVar, boolean z5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, pa paVar, androidx.compose.foundation.interaction.k kVar, androidx.compose.runtime.t tVar, int i4, int i5, int i6) {
        int i7;
        boolean z6;
        int i10;
        pa paVar2;
        androidx.compose.foundation.interaction.k kVar2;
        ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4;
        ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5;
        androidx.compose.ui.q qVar2;
        ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar6;
        boolean z7;
        pa paVar3;
        androidx.compose.runtime.t tVar2;
        boolean z10;
        ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar7;
        ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar8;
        ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar9;
        androidx.compose.foundation.interaction.k kVar3;
        pa paVar4;
        androidx.compose.ui.q qVar3;
        int i11;
        androidx.compose.runtime.t o4 = tVar.o(496394889);
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i7 = (o4.q0(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            i7 |= o4.S(lVar) ? 32 : 16;
        }
        if ((i6 & 4) != 0) {
            i7 |= 384;
        } else if ((i4 & 384) == 0) {
            i7 |= o4.S(lVar2) ? 256 : 128;
        }
        if ((i6 & 8) != 0) {
            i7 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i7 |= o4.b(z4) ? 2048 : 1024;
        }
        if ((i6 & 16) != 0) {
            i7 |= 24576;
        } else if ((i4 & 24576) == 0) {
            i7 |= o4.S(lVar3) ? 16384 : 8192;
        }
        int i12 = i6 & 32;
        if (i12 != 0) {
            i7 |= o.c.f32821k;
        } else if ((i4 & o.c.f32821k) == 0) {
            i7 |= o4.q0(qVar) ? 131072 : 65536;
        }
        int i13 = i6 & 64;
        if (i13 != 0) {
            i7 |= 1572864;
            z6 = z5;
        } else {
            z6 = z5;
            if ((i4 & 1572864) == 0) {
                i7 |= o4.b(z6) ? 1048576 : 524288;
            }
        }
        int i14 = i6 & 128;
        if (i14 != 0) {
            i7 |= 12582912;
        } else if ((i4 & 12582912) == 0) {
            i7 |= o4.S(pVar) ? 8388608 : 4194304;
        }
        int i15 = i6 & 256;
        if (i15 != 0) {
            i7 |= 100663296;
        } else if ((i4 & 100663296) == 0) {
            i7 |= o4.S(pVar2) ? androidx.core.view.accessibility.b.f26943s : 33554432;
        }
        int i16 = i6 & 512;
        if (i16 != 0) {
            i7 |= 805306368;
        } else if ((i4 & 805306368) == 0) {
            i7 |= o4.S(pVar3) ? 536870912 : ClientDefaults.MAX_MSG_SIZE;
        }
        if ((i5 & 6) == 0) {
            if ((i6 & 1024) == 0 && o4.q0(paVar)) {
                i11 = 4;
                i10 = i5 | i11;
            }
            i11 = 2;
            i10 = i5 | i11;
        } else {
            i10 = i5;
        }
        int i17 = i6 & 2048;
        if (i17 != 0) {
            i10 |= 48;
        } else if ((i5 & 48) == 0) {
            i10 |= o4.q0(kVar) ? 32 : 16;
        }
        int i18 = i10;
        if ((i7 & 306783379) == 306783378 && (i18 & 19) == 18 && o4.p()) {
            o4.d0();
            qVar3 = qVar;
            pVar7 = pVar;
            pVar8 = pVar2;
            pVar9 = pVar3;
            paVar4 = paVar;
            kVar3 = kVar;
            tVar2 = o4;
            z10 = z6;
        } else {
            o4.T();
            if ((i4 & 1) == 0 || o4.i0()) {
                androidx.compose.ui.q qVar4 = i12 != 0 ? androidx.compose.ui.q.INSTANCE : qVar;
                boolean z11 = i13 != 0 ? true : z6;
                ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar10 = i14 != 0 ? null : pVar;
                ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar11 = i15 != 0 ? null : pVar2;
                ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar12 = i16 != 0 ? null : pVar3;
                if ((i6 & 1024) != 0) {
                    paVar2 = k8.f12100a.l(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, o4, 0, 24576, 16383);
                    i18 &= -15;
                } else {
                    paVar2 = paVar;
                }
                if (i17 != 0) {
                    o4.P(462567468);
                    Object Q = o4.Q();
                    if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
                        Q = androidx.compose.foundation.interaction.j.a();
                        o4.E(Q);
                    }
                    o4.p0();
                    pVar4 = pVar12;
                    kVar2 = (androidx.compose.foundation.interaction.k) Q;
                } else {
                    kVar2 = kVar;
                    pVar4 = pVar12;
                }
                pVar5 = pVar10;
                qVar2 = qVar4;
                pVar6 = pVar11;
                z7 = z11;
                paVar3 = paVar2;
            } else {
                o4.d0();
                if ((i6 & 1024) != 0) {
                    i18 &= -15;
                }
                qVar2 = qVar;
                pVar5 = pVar;
                pVar6 = pVar2;
                pVar4 = pVar3;
                paVar3 = paVar;
                kVar2 = kVar;
                z7 = z6;
            }
            int i19 = i18;
            o4.I();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(496394889, i7, i19, "androidx.compose.material3.SearchBarInputField (SearchBar.android.kt:444)");
            }
            o4.P(462567538);
            Object Q2 = o4.Q();
            t.Companion companion = androidx.compose.runtime.t.INSTANCE;
            if (Q2 == companion.a()) {
                Q2 = new androidx.compose.ui.focus.a0();
                o4.E(Q2);
            }
            androidx.compose.ui.focus.a0 a0Var = (androidx.compose.ui.focus.a0) Q2;
            o4.p0();
            t9.Companion companion2 = t9.INSTANCE;
            String a5 = v9.a(x7.a.N, o4, 0);
            String a6 = v9.a(x7.a.P, o4, 0);
            o4.P(462567758);
            long t4 = ((androidx.compose.ui.text.v0) o4.x(xa.f())).t();
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            if (t4 == androidx.compose.ui.graphics.d2.f17778o) {
                t4 = paVar3.n0(z7, false, kVar2, o4, ((i19 << 3) & 896) | ((i7 >> 18) & 14) | 48 | ((i19 << 9) & 7168)).getValue().M();
            }
            long j4 = t4;
            o4.p0();
            androidx.compose.ui.q qVar5 = qVar2;
            androidx.compose.ui.q a7 = androidx.compose.ui.focus.d0.a(androidx.compose.foundation.layout.c2.h(androidx.compose.foundation.layout.c2.i(qVar2, k8.f12100a.f()), 0.0f, 1, null), a0Var);
            o4.P(462568122);
            boolean z12 = (57344 & i7) == 16384;
            Object Q3 = o4.Q();
            if (z12 || Q3 == companion.a()) {
                Q3 = new n(lVar3);
                o4.E(Q3);
            }
            o4.p0();
            androidx.compose.ui.q a8 = androidx.compose.ui.focus.d.a(a7, (ld.l) Q3);
            o4.P(462568188);
            boolean q02 = o4.q0(a5) | ((i7 & 7168) == 2048) | o4.q0(a6);
            Object Q4 = o4.Q();
            if (q02 || Q4 == companion.a()) {
                Q4 = new o(a5, z4, a6, a0Var);
                o4.E(Q4);
            }
            o4.p0();
            androidx.compose.ui.q f4 = androidx.compose.ui.semantics.o.f(a8, false, (ld.l) Q4, 1, null);
            androidx.compose.ui.text.v0 e02 = ((androidx.compose.ui.text.v0) o4.x(xa.f())).e0(new androidx.compose.ui.text.v0(j4, 0L, (androidx.compose.ui.text.font.o0) null, (androidx.compose.ui.text.font.k0) null, (androidx.compose.ui.text.font.l0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.o) null, (u0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (androidx.compose.ui.graphics.c6) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (androidx.compose.ui.text.style.q) null, (androidx.compose.ui.text.f0) null, (androidx.compose.ui.text.style.h) null, 0, 0, (androidx.compose.ui.text.style.s) null, 16777214, (kotlin.jvm.internal.w) null));
            androidx.compose.ui.graphics.g6 g6Var = new androidx.compose.ui.graphics.g6(paVar3.e(false, o4, ((i19 << 3) & 112) | 6).getValue().M(), null);
            androidx.compose.ui.text.input.y.INSTANCE.getClass();
            androidx.compose.foundation.text.f0 f0Var = new androidx.compose.foundation.text.f0(0, false, 0, androidx.compose.ui.text.input.y.f21134f, null, 23, null);
            o4.P(462568831);
            int i20 = i7 & 14;
            boolean z13 = ((i7 & 896) == 256) | (i20 == 4);
            Object Q5 = o4.Q();
            if (z13 || Q5 == companion.a()) {
                Q5 = new p(lVar2, str);
                o4.E(Q5);
            }
            o4.p0();
            pa paVar5 = paVar3;
            tVar2 = o4;
            androidx.compose.foundation.text.c.c(str, lVar, f4, z7, false, e02, f0Var, new androidx.compose.foundation.text.d0(null, null, null, null, (ld.l) Q5, null, 47, null), true, 0, 0, null, null, kVar2, g6Var, androidx.compose.runtime.internal.c.b(o4, -951844929, true, new q(str, z7, kVar2, pVar5, pVar6, pVar4, paVar3)), tVar2, 102236160 | i20 | (i7 & 112) | ((i7 >> 9) & 7168), ((i19 << 6) & 7168) | o.c.f32821k, 7696);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            z10 = z7;
            pVar7 = pVar5;
            pVar8 = pVar6;
            pVar9 = pVar4;
            kVar3 = kVar2;
            paVar4 = paVar5;
            qVar3 = qVar5;
        }
        androidx.compose.runtime.t3 t5 = tVar2.t();
        if (t5 != null) {
            t5.a(new r(str, lVar, lVar2, z4, lVar3, qVar3, z10, pVar7, pVar8, pVar9, paVar4, kVar3, i4, i5, i6));
        }
    }

    private static final boolean d(androidx.compose.runtime.b5<Boolean> b5Var) {
        return b5Var.getValue().booleanValue();
    }

    public static final float k() {
        return f12327b;
    }

    private static /* synthetic */ void l() {
    }

    public static final float m() {
        return f12329d;
    }

    public static final float n() {
        return f12331f;
    }
}

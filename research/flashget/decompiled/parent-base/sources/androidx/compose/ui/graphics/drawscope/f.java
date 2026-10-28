package androidx.compose.ui.graphics.drawscope;

import androidx.annotation.x;
import androidx.compose.runtime.x4;
import androidx.compose.ui.graphics.e2;
import androidx.compose.ui.graphics.g5;
import androidx.compose.ui.graphics.h5;
import androidx.compose.ui.graphics.i6;
import androidx.compose.ui.graphics.k1;
import androidx.compose.ui.graphics.m4;
import androidx.compose.ui.graphics.s4;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.v;
import androidx.compose.ui.unit.w;
import i0.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.x0;

/* compiled from: DrawScope.kt */
@h
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 d2\u00020\u0001:\u0001eJ\u001e\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006Jj\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018Jj\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJX\u0010!\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b!\u0010\"JX\u0010#\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b#\u0010$JN\u0010'\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b'\u0010(Jl\u0010/\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020)2\b\b\u0002\u0010.\u001a\u00020+2\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H'ø\u0001\u0000¢\u0006\u0004\b/\u00100Jv\u00103\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020)2\b\b\u0002\u0010.\u001a\u00020+2\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u00102\u001a\u000201H\u0016ø\u0001\u0000¢\u0006\u0004\b3\u00104Jb\u00107\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u00106\u001a\u0002052\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b7\u00108Jb\u00109\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u00106\u001a\u0002052\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b9\u0010:JX\u0010=\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010;\u001a\u00020\u000b2\b\b\u0002\u0010<\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b=\u0010>JX\u0010?\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010;\u001a\u00020\u000b2\b\b\u0002\u0010<\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b?\u0010@JX\u0010A\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\bA\u0010\"JX\u0010B\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\bB\u0010$Jp\u0010G\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020E2\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\bG\u0010HJp\u0010I\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010C\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020E2\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\bI\u0010JJL\u0010M\u001a\u00020\u00162\u0006\u0010L\u001a\u00020K2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\bM\u0010NJL\u0010O\u001a\u00020\u00162\u0006\u0010L\u001a\u00020K2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\bO\u0010PJp\u0010U\u001a\u00020\u00162\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00030Q2\u0006\u0010T\u001a\u00020S2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\bU\u0010VJp\u0010W\u001a\u00020\u00162\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00030Q2\u0006\u0010T\u001a\u00020S2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020Y8&X¦\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u001a\u0010<\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b]\u0010^R\u001a\u0010\u001e\u001a\u00020\u00028VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b_\u0010^R\u0014\u0010c\u001a\u00020`8&X¦\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/f;", "Landroidx/compose/ui/unit/d;", "Li0/n;", "Li0/f;", "offset", "b5", "(JJ)J", "Landroidx/compose/ui/graphics/t1;", "brush", "start", "end", "", "strokeWidth", "Landroidx/compose/ui/graphics/i6;", "cap", "Landroidx/compose/ui/graphics/h5;", "pathEffect", "alpha", "Landroidx/compose/ui/graphics/e2;", "colorFilter", "Landroidx/compose/ui/graphics/k1;", "blendMode", "Lkotlin/k2;", "I5", "(Landroidx/compose/ui/graphics/t1;JJFILandroidx/compose/ui/graphics/h5;FLandroidx/compose/ui/graphics/e2;I)V", "Landroidx/compose/ui/graphics/d2;", "color", "P3", "(JJJFILandroidx/compose/ui/graphics/h5;FLandroidx/compose/ui/graphics/e2;I)V", "topLeft", "size", "Landroidx/compose/ui/graphics/drawscope/i;", "style", "K3", "(Landroidx/compose/ui/graphics/t1;JJFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "T3", "(JJJFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "Landroidx/compose/ui/graphics/s4;", "image", "y3", "(Landroidx/compose/ui/graphics/s4;JFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "Landroidx/compose/ui/unit/q;", "srcOffset", "Landroidx/compose/ui/unit/u;", "srcSize", "dstOffset", "dstSize", "r3", "(Landroidx/compose/ui/graphics/s4;JJJJFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "Landroidx/compose/ui/graphics/m4;", "filterQuality", "c6", "(Landroidx/compose/ui/graphics/s4;JJJJFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;II)V", "Li0/a;", "cornerRadius", "f5", "(Landroidx/compose/ui/graphics/t1;JJJFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "G2", "(JJJJLandroidx/compose/ui/graphics/drawscope/i;FLandroidx/compose/ui/graphics/e2;I)V", "radius", "center", "a6", "(Landroidx/compose/ui/graphics/t1;FJFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "n4", "(JFJFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "r5", "w4", "startAngle", "sweepAngle", "", "useCenter", "Q3", "(Landroidx/compose/ui/graphics/t1;FFZJJFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "G4", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "Landroidx/compose/ui/graphics/g5;", "path", "R3", "(Landroidx/compose/ui/graphics/g5;JFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "G1", "(Landroidx/compose/ui/graphics/g5;Landroidx/compose/ui/graphics/t1;FLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "", "points", "Landroidx/compose/ui/graphics/n5;", "pointMode", "y5", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/h5;FLandroidx/compose/ui/graphics/e2;I)V", "l1", "(Ljava/util/List;ILandroidx/compose/ui/graphics/t1;FILandroidx/compose/ui/graphics/h5;FLandroidx/compose/ui/graphics/e2;I)V", "Landroidx/compose/ui/graphics/drawscope/d;", "E5", "()Landroidx/compose/ui/graphics/drawscope/d;", "drawContext", "c0", "()J", "e", "Landroidx/compose/ui/unit/w;", "getLayoutDirection", "()Landroidx/compose/ui/unit/w;", "layoutDirection", "a0", "a", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface f extends androidx.compose.ui.unit.d {

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f17794a;

    /* compiled from: DrawScope.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/f$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/k1;", "b", "I", "a", "()I", "DefaultBlendMode", "Landroidx/compose/ui/graphics/m4;", "c", "DefaultFilterQuality", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.drawscope.f$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f17794a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final int DefaultBlendMode;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final int DefaultFilterQuality;

        static {
            k1.INSTANCE.getClass();
            DefaultBlendMode = k1.f17877f;
            m4.INSTANCE.getClass();
            DefaultFilterQuality = m4.f17930d;
        }

        private Companion() {
        }

        public final int a() {
            return DefaultBlendMode;
        }

        public final int b() {
            return DefaultFilterQuality;
        }
    }

    /* compiled from: DrawScope.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        @x4
        @Deprecated
        public static float A(@fg.l f fVar, int i4) {
            return f.super.R(i4);
        }

        @x4
        @Deprecated
        public static long B(@fg.l f fVar, long j4) {
            return f.super.n(j4);
        }

        @x4
        @Deprecated
        public static float C(@fg.l f fVar, long j4) {
            return f.super.J2(j4);
        }

        @x4
        @Deprecated
        public static float D(@fg.l f fVar, float f4) {
            return f.A0(fVar, f4);
        }

        @x4
        @fg.l
        @Deprecated
        public static i0.i E(@fg.l f fVar, @fg.l androidx.compose.ui.unit.k kVar) {
            return f.super.c5(kVar);
        }

        @x4
        @Deprecated
        public static long F(@fg.l f fVar, long j4) {
            return f.super.d0(j4);
        }

        @x4
        @Deprecated
        public static long G(@fg.l f fVar, float f4) {
            return f.super.h(f4);
        }

        @x4
        @Deprecated
        public static long H(@fg.l f fVar, float f4) {
            return f.super.w(f4);
        }

        @x4
        @Deprecated
        public static long I(@fg.l f fVar, int i4) {
            return f.super.u(i4);
        }

        @Deprecated
        public static void f(@fg.l f fVar, @fg.l s4 s4Var, long j4, long j5, long j6, long j7, @x(from = 0.0d, to = 1.0d) float f4, @fg.l i iVar, @fg.m e2 e2Var, int i4, int i5) {
            f.super.c6(s4Var, j4, j5, j6, j7, f4, iVar, e2Var, i4, i5);
        }

        @Deprecated
        public static long u(@fg.l f fVar) {
            return f.super.c0();
        }

        @Deprecated
        public static long v(@fg.l f fVar) {
            return f.super.e();
        }

        @x4
        @Deprecated
        public static int w(@fg.l f fVar, long j4) {
            return f.super.J5(j4);
        }

        @x4
        @Deprecated
        public static int x(@fg.l f fVar, float f4) {
            return f.super.q2(f4);
        }

        @x4
        @Deprecated
        public static float y(@fg.l f fVar, long j4) {
            return f.super.i(j4);
        }

        @x4
        @Deprecated
        public static float z(@fg.l f fVar, float f4) {
            return f.super.S(f4);
        }
    }

    static float A0(f fVar, float f4) {
        return fVar.getDensity() * f4;
    }

    static void A6(f fVar, List list, int i4, t1 t1Var, float f4, int i5, h5 h5Var, float f5, e2 e2Var, int i6, int i7, Object obj) {
        int i10;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
        }
        float f6 = (i7 & 8) != 0 ? 0.0f : f4;
        if ((i7 & 16) != 0) {
            i6.INSTANCE.getClass();
            i10 = i6.f17861c;
        } else {
            i10 = i5;
        }
        fVar.l1(list, i4, t1Var, f6, i10, (i7 & 32) != 0 ? null : h5Var, (i7 & 64) != 0 ? 1.0f : f5, (i7 & 128) != 0 ? null : e2Var, (i7 & 256) != 0 ? INSTANCE.a() : i6);
    }

    static void D6(f fVar, t1 t1Var, long j4, long j5, long j6, float f4, i iVar, e2 e2Var, int i4, int i5, Object obj) {
        long j7;
        long j10;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        if ((i5 & 2) != 0) {
            i0.f.INSTANCE.getClass();
            j7 = i0.f.f74147c;
        } else {
            j7 = j4;
        }
        long b5 = (i5 & 4) != 0 ? fVar.b5(fVar.e(), j7) : j5;
        if ((i5 & 8) != 0) {
            i0.a.INSTANCE.getClass();
            j10 = i0.a.f74139c;
        } else {
            j10 = j6;
        }
        fVar.f5(t1Var, j7, b5, j10, (i5 & 16) != 0 ? 1.0f : f4, (i5 & 32) != 0 ? m.f17797a : iVar, (i5 & 64) != 0 ? null : e2Var, (i5 & 128) != 0 ? INSTANCE.a() : i4);
    }

    static void E3(f fVar, s4 s4Var, long j4, float f4, i iVar, e2 e2Var, int i4, int i5, Object obj) {
        long j5;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        if ((i5 & 2) != 0) {
            i0.f.INSTANCE.getClass();
            j5 = i0.f.f74147c;
        } else {
            j5 = j4;
        }
        fVar.y3(s4Var, j5, (i5 & 4) != 0 ? 1.0f : f4, (i5 & 8) != 0 ? m.f17797a : iVar, (i5 & 16) != 0 ? null : e2Var, (i5 & 32) != 0 ? INSTANCE.a() : i4);
    }

    static void F2(f fVar, long j4, float f4, float f5, boolean z4, long j5, long j6, float f6, i iVar, e2 e2Var, int i4, int i5, Object obj) {
        long j7;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        if ((i5 & 16) != 0) {
            i0.f.INSTANCE.getClass();
            j7 = i0.f.f74147c;
        } else {
            j7 = j5;
        }
        fVar.G4(j4, f4, f5, z4, j7, (i5 & 32) != 0 ? fVar.b5(fVar.e(), j7) : j6, (i5 & 64) != 0 ? 1.0f : f6, (i5 & 128) != 0 ? m.f17797a : iVar, (i5 & 256) != 0 ? null : e2Var, (i5 & 512) != 0 ? INSTANCE.a() : i4);
    }

    static void F6(f fVar, t1 t1Var, long j4, long j5, float f4, int i4, h5 h5Var, float f5, e2 e2Var, int i5, int i6, Object obj) {
        int i7;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        float f6 = (i6 & 8) != 0 ? 0.0f : f4;
        if ((i6 & 16) != 0) {
            n.INSTANCE.getClass();
            i7 = n.f17801i;
        } else {
            i7 = i4;
        }
        fVar.I5(t1Var, j4, j5, f6, i7, (i6 & 32) != 0 ? null : h5Var, (i6 & 64) != 0 ? 1.0f : f5, (i6 & 128) != 0 ? null : e2Var, (i6 & 256) != 0 ? INSTANCE.a() : i5);
    }

    static void L4(f fVar, t1 t1Var, float f4, float f5, boolean z4, long j4, long j5, float f6, i iVar, e2 e2Var, int i4, int i5, Object obj) {
        long j6;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
        }
        if ((i5 & 16) != 0) {
            i0.f.INSTANCE.getClass();
            j6 = i0.f.f74147c;
        } else {
            j6 = j4;
        }
        fVar.Q3(t1Var, f4, f5, z4, j6, (i5 & 32) != 0 ? fVar.b5(fVar.e(), j6) : j5, (i5 & 64) != 0 ? 1.0f : f6, (i5 & 128) != 0 ? m.f17797a : iVar, (i5 & 256) != 0 ? null : e2Var, (i5 & 512) != 0 ? INSTANCE.a() : i4);
    }

    static /* synthetic */ void N1(f fVar, g5 g5Var, long j4, float f4, i iVar, e2 e2Var, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
        }
        fVar.R3(g5Var, j4, (i5 & 4) != 0 ? 1.0f : f4, (i5 & 8) != 0 ? m.f17797a : iVar, (i5 & 16) != 0 ? null : e2Var, (i5 & 32) != 0 ? INSTANCE.a() : i4);
    }

    static /* synthetic */ void O4(f fVar, t1 t1Var, float f4, long j4, float f5, i iVar, e2 e2Var, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
        }
        fVar.a6(t1Var, (i5 & 2) != 0 ? i0.n.q(fVar.e()) / 2.0f : f4, (i5 & 4) != 0 ? fVar.c0() : j4, (i5 & 8) != 0 ? 1.0f : f5, (i5 & 16) != 0 ? m.f17797a : iVar, (i5 & 32) != 0 ? null : e2Var, (i5 & 64) != 0 ? INSTANCE.a() : i4);
    }

    static void R2(f fVar, long j4, long j5, long j6, float f4, int i4, h5 h5Var, float f5, e2 e2Var, int i5, int i6, Object obj) {
        int i7;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        float f6 = (i6 & 8) != 0 ? 0.0f : f4;
        if ((i6 & 16) != 0) {
            n.INSTANCE.getClass();
            i7 = n.f17801i;
        } else {
            i7 = i4;
        }
        fVar.P3(j4, j5, j6, f6, i7, (i6 & 32) != 0 ? null : h5Var, (i6 & 64) != 0 ? 1.0f : f5, (i6 & 128) != 0 ? null : e2Var, (i6 & 256) != 0 ? INSTANCE.a() : i5);
    }

    static void T0(f fVar, t1 t1Var, long j4, long j5, float f4, i iVar, e2 e2Var, int i4, int i5, Object obj) {
        long j6;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
        }
        if ((i5 & 2) != 0) {
            i0.f.INSTANCE.getClass();
            j6 = i0.f.f74147c;
        } else {
            j6 = j4;
        }
        fVar.r5(t1Var, j6, (i5 & 4) != 0 ? fVar.b5(fVar.e(), j6) : j5, (i5 & 8) != 0 ? 1.0f : f4, (i5 & 16) != 0 ? m.f17797a : iVar, (i5 & 32) != 0 ? null : e2Var, (i5 & 64) != 0 ? INSTANCE.a() : i4);
    }

    static void Z4(f fVar, List list, int i4, long j4, float f4, int i5, h5 h5Var, float f5, e2 e2Var, int i6, int i7, Object obj) {
        int i10;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
        }
        float f6 = (i7 & 8) != 0 ? 0.0f : f4;
        if ((i7 & 16) != 0) {
            i6.INSTANCE.getClass();
            i10 = i6.f17861c;
        } else {
            i10 = i5;
        }
        fVar.y5(list, i4, j4, f6, i10, (i7 & 32) != 0 ? null : h5Var, (i7 & 64) != 0 ? 1.0f : f5, (i7 & 128) != 0 ? null : e2Var, (i7 & 256) != 0 ? INSTANCE.a() : i6);
    }

    static void a4(f fVar, t1 t1Var, long j4, long j5, float f4, i iVar, e2 e2Var, int i4, int i5, Object obj) {
        long j6;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        if ((i5 & 2) != 0) {
            i0.f.INSTANCE.getClass();
            j6 = i0.f.f74147c;
        } else {
            j6 = j4;
        }
        fVar.K3(t1Var, j6, (i5 & 4) != 0 ? fVar.b5(fVar.e(), j6) : j5, (i5 & 8) != 0 ? 1.0f : f4, (i5 & 16) != 0 ? m.f17797a : iVar, (i5 & 32) != 0 ? null : e2Var, (i5 & 64) != 0 ? INSTANCE.a() : i4);
    }

    static /* synthetic */ void a5(f fVar, g5 g5Var, t1 t1Var, float f4, i iVar, e2 e2Var, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if ((i5 & 4) != 0) {
            f4 = 1.0f;
        }
        float f5 = f4;
        if ((i5 & 8) != 0) {
            iVar = m.f17797a;
        }
        i iVar2 = iVar;
        if ((i5 & 16) != 0) {
            e2Var = null;
        }
        e2 e2Var2 = e2Var;
        if ((i5 & 32) != 0) {
            i4 = INSTANCE.a();
        }
        fVar.G1(g5Var, t1Var, f5, iVar2, e2Var2, i4);
    }

    private default long b5(long j4, long j5) {
        return o.a(i0.n.t(j4) - i0.f.p(j5), i0.n.m(j4) - i0.f.r(j5));
    }

    static void t4(f fVar, s4 s4Var, long j4, long j5, long j6, long j7, float f4, i iVar, e2 e2Var, int i4, int i5, Object obj) {
        long j10;
        long j11;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
        }
        if ((i5 & 2) != 0) {
            q.INSTANCE.getClass();
            j10 = q.f21519c;
        } else {
            j10 = j4;
        }
        long a5 = (i5 & 4) != 0 ? v.a(s4Var.getWidth(), s4Var.getHeight()) : j5;
        if ((i5 & 8) != 0) {
            q.INSTANCE.getClass();
            j11 = q.f21519c;
        } else {
            j11 = j6;
        }
        fVar.r3(s4Var, j10, a5, j11, (i5 & 16) != 0 ? a5 : j7, (i5 & 32) != 0 ? 1.0f : f4, (i5 & 64) != 0 ? m.f17797a : iVar, (i5 & 128) != 0 ? null : e2Var, (i5 & 256) != 0 ? INSTANCE.a() : i4);
    }

    static void t5(f fVar, long j4, long j5, long j6, float f4, i iVar, e2 e2Var, int i4, int i5, Object obj) {
        long j7;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        if ((i5 & 2) != 0) {
            i0.f.INSTANCE.getClass();
            j7 = i0.f.f74147c;
        } else {
            j7 = j5;
        }
        fVar.T3(j4, j7, (i5 & 4) != 0 ? fVar.b5(fVar.e(), j7) : j6, (i5 & 8) != 0 ? 1.0f : f4, (i5 & 16) != 0 ? m.f17797a : iVar, (i5 & 32) != 0 ? null : e2Var, (i5 & 64) != 0 ? INSTANCE.a() : i4);
    }

    static void u0(f fVar, s4 s4Var, long j4, long j5, long j6, long j7, float f4, i iVar, e2 e2Var, int i4, int i5, int i6, Object obj) {
        long j10;
        long j11;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        if ((i6 & 2) != 0) {
            q.INSTANCE.getClass();
            j10 = q.f21519c;
        } else {
            j10 = j4;
        }
        long a5 = (i6 & 4) != 0 ? v.a(s4Var.getWidth(), s4Var.getHeight()) : j5;
        if ((i6 & 8) != 0) {
            q.INSTANCE.getClass();
            j11 = q.f21519c;
        } else {
            j11 = j6;
        }
        fVar.c6(s4Var, j10, a5, j11, (i6 & 16) != 0 ? a5 : j7, (i6 & 32) != 0 ? 1.0f : f4, (i6 & 64) != 0 ? m.f17797a : iVar, (i6 & 128) != 0 ? null : e2Var, (i6 & 256) != 0 ? INSTANCE.a() : i4, (i6 & 512) != 0 ? INSTANCE.b() : i5);
    }

    static /* synthetic */ void u6(f fVar, long j4, float f4, long j5, float f5, i iVar, e2 e2Var, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        fVar.n4(j4, (i5 & 2) != 0 ? i0.n.q(fVar.e()) / 2.0f : f4, (i5 & 4) != 0 ? fVar.c0() : j5, (i5 & 8) != 0 ? 1.0f : f5, (i5 & 16) != 0 ? m.f17797a : iVar, (i5 & 32) != 0 ? null : e2Var, (i5 & 64) != 0 ? INSTANCE.a() : i4);
    }

    static void x6(f fVar, long j4, long j5, long j6, long j7, i iVar, float f4, e2 e2Var, int i4, int i5, Object obj) {
        long j10;
        long j11;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
        }
        if ((i5 & 2) != 0) {
            i0.f.INSTANCE.getClass();
            j10 = i0.f.f74147c;
        } else {
            j10 = j5;
        }
        long b5 = (i5 & 4) != 0 ? fVar.b5(fVar.e(), j10) : j6;
        if ((i5 & 8) != 0) {
            i0.a.INSTANCE.getClass();
            j11 = i0.a.f74139c;
        } else {
            j11 = j7;
        }
        fVar.G2(j4, j10, b5, j11, (i5 & 16) != 0 ? m.f17797a : iVar, (i5 & 32) != 0 ? 1.0f : f4, (i5 & 64) != 0 ? null : e2Var, (i5 & 128) != 0 ? INSTANCE.a() : i4);
    }

    static void z2(f fVar, long j4, long j5, long j6, float f4, i iVar, e2 e2Var, int i4, int i5, Object obj) {
        long j7;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
        }
        if ((i5 & 2) != 0) {
            i0.f.INSTANCE.getClass();
            j7 = i0.f.f74147c;
        } else {
            j7 = j5;
        }
        fVar.w4(j4, j7, (i5 & 4) != 0 ? fVar.b5(fVar.e(), j7) : j6, (i5 & 8) != 0 ? 1.0f : f4, (i5 & 16) != 0 ? m.f17797a : iVar, (i5 & 32) != 0 ? null : e2Var, (i5 & 64) != 0 ? INSTANCE.a() : i4);
    }

    @fg.l
    /* renamed from: E5 */
    d getDrawContext();

    void G1(@fg.l g5 path, @fg.l t1 brush, @x(from = 0.0d, to = 1.0d) float alpha, @fg.l i style, @fg.m e2 colorFilter, int blendMode);

    void G2(long color, long topLeft, long size, long cornerRadius, @fg.l i style, @x(from = 0.0d, to = 1.0d) float alpha, @fg.m e2 colorFilter, int blendMode);

    void G4(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, @x(from = 0.0d, to = 1.0d) float alpha, @fg.l i style, @fg.m e2 colorFilter, int blendMode);

    void I5(@fg.l t1 brush, long start, long end, float strokeWidth, int cap, @fg.m h5 pathEffect, @x(from = 0.0d, to = 1.0d) float alpha, @fg.m e2 colorFilter, int blendMode);

    void K3(@fg.l t1 brush, long topLeft, long size, @x(from = 0.0d, to = 1.0d) float alpha, @fg.l i style, @fg.m e2 colorFilter, int blendMode);

    void P3(long color, long start, long end, float strokeWidth, int cap, @fg.m h5 pathEffect, @x(from = 0.0d, to = 1.0d) float alpha, @fg.m e2 colorFilter, int blendMode);

    void Q3(@fg.l t1 brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, @x(from = 0.0d, to = 1.0d) float alpha, @fg.l i style, @fg.m e2 colorFilter, int blendMode);

    void R3(@fg.l g5 path, long color, @x(from = 0.0d, to = 1.0d) float alpha, @fg.l i style, @fg.m e2 colorFilter, int blendMode);

    void T3(long color, long topLeft, long size, @x(from = 0.0d, to = 1.0d) float alpha, @fg.l i style, @fg.m e2 colorFilter, int blendMode);

    void a6(@fg.l t1 brush, float radius, long center, @x(from = 0.0d, to = 1.0d) float alpha, @fg.l i style, @fg.m e2 colorFilter, int blendMode);

    default long c0() {
        return o.b(getDrawContext().e());
    }

    default void c6(@fg.l s4 image, long srcOffset, long srcSize, long dstOffset, long dstSize, @x(from = 0.0d, to = 1.0d) float alpha, @fg.l i style, @fg.m e2 colorFilter, int blendMode, int filterQuality) {
        u0(this, image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, 0, 512, null);
    }

    default long e() {
        return getDrawContext().e();
    }

    void f5(@fg.l t1 brush, long topLeft, long size, long cornerRadius, @x(from = 0.0d, to = 1.0d) float alpha, @fg.l i style, @fg.m e2 colorFilter, int blendMode);

    @fg.l
    w getLayoutDirection();

    void l1(@fg.l List<i0.f> points, int pointMode, @fg.l t1 brush, float strokeWidth, int cap, @fg.m h5 pathEffect, @x(from = 0.0d, to = 1.0d) float alpha, @fg.m e2 colorFilter, int blendMode);

    void n4(long color, float radius, long center, @x(from = 0.0d, to = 1.0d) float alpha, @fg.l i style, @fg.m e2 colorFilter, int blendMode);

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @x0(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* synthetic */ void r3(s4 image, long srcOffset, long srcSize, long dstOffset, long dstSize, @x(from = 0.0d, to = 1.0d) float alpha, i style, e2 colorFilter, int blendMode);

    void r5(@fg.l t1 brush, long topLeft, long size, @x(from = 0.0d, to = 1.0d) float alpha, @fg.l i style, @fg.m e2 colorFilter, int blendMode);

    void w4(long color, long topLeft, long size, @x(from = 0.0d, to = 1.0d) float alpha, @fg.l i style, @fg.m e2 colorFilter, int blendMode);

    void y3(@fg.l s4 image, long topLeft, @x(from = 0.0d, to = 1.0d) float alpha, @fg.l i style, @fg.m e2 colorFilter, int blendMode);

    void y5(@fg.l List<i0.f> points, int pointMode, long color, float strokeWidth, int cap, @fg.m h5 pathEffect, @x(from = 0.0d, to = 1.0d) float alpha, @fg.m e2 colorFilter, int blendMode);
}

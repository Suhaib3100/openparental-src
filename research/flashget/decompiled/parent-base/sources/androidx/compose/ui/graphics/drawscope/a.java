package androidx.compose.ui.graphics.drawscope;

import androidx.annotation.x;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.d5;
import androidx.compose.ui.graphics.drawscope.b;
import androidx.compose.ui.graphics.e2;
import androidx.compose.ui.graphics.f5;
import androidx.compose.ui.graphics.g5;
import androidx.compose.ui.graphics.h5;
import androidx.compose.ui.graphics.i6;
import androidx.compose.ui.graphics.j6;
import androidx.compose.ui.graphics.k1;
import androidx.compose.ui.graphics.m4;
import androidx.compose.ui.graphics.s4;
import androidx.compose.ui.graphics.t0;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.graphics.v1;
import androidx.compose.ui.unit.w;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.a2;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.w0;
import kotlin.x0;

/* compiled from: CanvasDrawScope.kt */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJJ\u0010\u0017\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JH\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJj\u0010%\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&Jl\u0010'\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001e\u0010)\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*J`\u0010/\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b/\u00100J`\u00101\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b1\u00102JN\u00106\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b6\u00107JN\u00108\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b8\u00109JF\u0010<\u001a\u00020.2\u0006\u0010;\u001a\u00020:2\u0006\u00103\u001a\u00020+2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b<\u0010=J^\u0010D\u001a\u00020.2\u0006\u0010;\u001a\u00020:2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020>2\u0006\u0010C\u001a\u00020@2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0017ø\u0001\u0000¢\u0006\u0004\bD\u0010EJf\u0010F\u001a\u00020.2\u0006\u0010;\u001a\u00020:2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020>2\u0006\u0010C\u001a\u00020@2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\bF\u0010GJV\u0010J\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\u0006\u0010I\u001a\u00020H2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJV\u0010L\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\u0006\u0010I\u001a\u00020H2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bL\u0010MJN\u0010P\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010N\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020+2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bP\u0010QJN\u0010R\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010N\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020+2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bR\u0010SJN\u0010T\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bT\u00107JN\u0010U\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bU\u00109Jf\u0010Z\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010V\u001a\u00020\u000f2\u0006\u0010W\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020X2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bZ\u0010[Jf\u0010\\\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010V\u001a\u00020\u000f2\u0006\u0010W\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020X2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\\\u0010]JF\u0010`\u001a\u00020.2\u0006\u0010_\u001a\u00020^2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b`\u0010aJF\u0010b\u001a\u00020.2\u0006\u0010_\u001a\u00020^2\u0006\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bb\u0010cJf\u0010h\u001a\u00020.2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020+0d2\u0006\u0010g\u001a\u00020f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bh\u0010iJf\u0010j\u001a\u00020.2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020+0d2\u0006\u0010g\u001a\u00020f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bj\u0010kJL\u0010u\u001a\u00020.2\u0006\u0010m\u001a\u00020l2\u0006\u0010o\u001a\u00020n2\u0006\u0010q\u001a\u00020p2\u0006\u00105\u001a\u0002042\u0017\u0010t\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020.0r¢\u0006\u0002\bsH\u0086\bø\u0001\u0000¢\u0006\u0004\bu\u0010vR \u0010}\u001a\u00020w8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bx\u0010y\u0012\u0004\b|\u0010\u0003\u001a\u0004\bz\u0010{R\u001e\u0010\u0083\u0001\u001a\u00020~8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001b\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0085\u0001R\u0016\u0010o\u001a\u00020n8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0015\u0010m\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bx\u0010\u008b\u0001R\u0017\u0010\u008d\u0001\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008b\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u008e\u0001"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/a;", "Landroidx/compose/ui/graphics/drawscope/f;", "<init>", "()V", "Landroidx/compose/ui/graphics/d5;", "L", "()Landroidx/compose/ui/graphics/d5;", "N", "Landroidx/compose/ui/graphics/drawscope/i;", "drawStyle", "P", "(Landroidx/compose/ui/graphics/drawscope/i;)Landroidx/compose/ui/graphics/d5;", "Landroidx/compose/ui/graphics/t1;", "brush", "style", "", "alpha", "Landroidx/compose/ui/graphics/e2;", "colorFilter", "Landroidx/compose/ui/graphics/k1;", "blendMode", "Landroidx/compose/ui/graphics/m4;", "filterQuality", "l", "(Landroidx/compose/ui/graphics/t1;Landroidx/compose/ui/graphics/drawscope/i;FLandroidx/compose/ui/graphics/e2;II)Landroidx/compose/ui/graphics/d5;", "Landroidx/compose/ui/graphics/d2;", "color", "a", "(JLandroidx/compose/ui/graphics/drawscope/i;FLandroidx/compose/ui/graphics/e2;II)Landroidx/compose/ui/graphics/d5;", "strokeWidth", "miter", "Landroidx/compose/ui/graphics/i6;", "cap", "Landroidx/compose/ui/graphics/j6;", "join", "Landroidx/compose/ui/graphics/h5;", "pathEffect", "q", "(JFFIILandroidx/compose/ui/graphics/h5;FLandroidx/compose/ui/graphics/e2;II)Landroidx/compose/ui/graphics/d5;", "v", "(Landroidx/compose/ui/graphics/t1;FFIILandroidx/compose/ui/graphics/h5;FLandroidx/compose/ui/graphics/e2;II)Landroidx/compose/ui/graphics/d5;", "I", "(JF)J", "Li0/f;", "start", "end", "Lkotlin/k2;", "I5", "(Landroidx/compose/ui/graphics/t1;JJFILandroidx/compose/ui/graphics/h5;FLandroidx/compose/ui/graphics/e2;I)V", "P3", "(JJJFILandroidx/compose/ui/graphics/h5;FLandroidx/compose/ui/graphics/e2;I)V", "topLeft", "Li0/n;", "size", "K3", "(Landroidx/compose/ui/graphics/t1;JJFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "T3", "(JJJFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "Landroidx/compose/ui/graphics/s4;", "image", "y3", "(Landroidx/compose/ui/graphics/s4;JFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "Landroidx/compose/ui/unit/q;", "srcOffset", "Landroidx/compose/ui/unit/u;", "srcSize", "dstOffset", "dstSize", "r3", "(Landroidx/compose/ui/graphics/s4;JJJJFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "c6", "(Landroidx/compose/ui/graphics/s4;JJJJFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;II)V", "Li0/a;", "cornerRadius", "f5", "(Landroidx/compose/ui/graphics/t1;JJJFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "G2", "(JJJJLandroidx/compose/ui/graphics/drawscope/i;FLandroidx/compose/ui/graphics/e2;I)V", "radius", "center", "a6", "(Landroidx/compose/ui/graphics/t1;FJFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "n4", "(JFJFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "r5", "w4", "startAngle", "sweepAngle", "", "useCenter", "Q3", "(Landroidx/compose/ui/graphics/t1;FFZJJFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "G4", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "Landroidx/compose/ui/graphics/g5;", "path", "R3", "(Landroidx/compose/ui/graphics/g5;JFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "G1", "(Landroidx/compose/ui/graphics/g5;Landroidx/compose/ui/graphics/t1;FLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "", "points", "Landroidx/compose/ui/graphics/n5;", "pointMode", "y5", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/h5;FLandroidx/compose/ui/graphics/e2;I)V", "l1", "(Ljava/util/List;ILandroidx/compose/ui/graphics/t1;FILandroidx/compose/ui/graphics/h5;FLandroidx/compose/ui/graphics/e2;I)V", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/graphics/v1;", "canvas", "Lkotlin/Function1;", "Lkotlin/u;", "block", "A", "(Landroidx/compose/ui/unit/d;Landroidx/compose/ui/unit/w;Landroidx/compose/ui/graphics/v1;JLld/l;)V", "Landroidx/compose/ui/graphics/drawscope/a$a;", "b", "Landroidx/compose/ui/graphics/drawscope/a$a;", "E", "()Landroidx/compose/ui/graphics/drawscope/a$a;", "G", "drawParams", "Landroidx/compose/ui/graphics/drawscope/d;", "c", "Landroidx/compose/ui/graphics/drawscope/d;", "E5", "()Landroidx/compose/ui/graphics/drawscope/d;", "drawContext", "d", "Landroidx/compose/ui/graphics/d5;", "fillPaint", "e", "strokePaint", "getLayoutDirection", "()Landroidx/compose/ui/unit/w;", "()F", "U", "fontScale", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nCanvasDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,787:1\n1#2:788\n*E\n"})
/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final C0331a drawParams = new C0331a(null, null, null, 0, 15, null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d drawContext = new b();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private d5 fillPaint;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private d5 strokePaint;

    /* compiled from: CanvasDrawScope.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010'R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010+R(\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0012\u0010,\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010/\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/a$a;", "", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/graphics/v1;", "canvas", "Li0/n;", "size", "<init>", "(Landroidx/compose/ui/unit/d;Landroidx/compose/ui/unit/w;Landroidx/compose/ui/graphics/v1;JLkotlin/jvm/internal/w;)V", "a", "()Landroidx/compose/ui/unit/d;", "b", "()Landroidx/compose/ui/unit/w;", "c", "()Landroidx/compose/ui/graphics/v1;", "d", "()J", "e", "(Landroidx/compose/ui/unit/d;Landroidx/compose/ui/unit/w;Landroidx/compose/ui/graphics/v1;J)Landroidx/compose/ui/graphics/drawscope/a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/unit/d;", "h", "l", "(Landroidx/compose/ui/unit/d;)V", "Landroidx/compose/ui/unit/w;", "i", "m", "(Landroidx/compose/ui/unit/w;)V", "Landroidx/compose/ui/graphics/v1;", "g", "k", "(Landroidx/compose/ui/graphics/v1;)V", "J", "j", "n", "(J)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @w0
    /* renamed from: androidx.compose.ui.graphics.drawscope.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0331a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private androidx.compose.ui.unit.d density;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private w layoutDirection;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private v1 canvas;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private long size;

        public /* synthetic */ C0331a(androidx.compose.ui.unit.d dVar, w wVar, v1 v1Var, long j4, kotlin.jvm.internal.w wVar2) {
            this(dVar, wVar, v1Var, j4);
        }

        public static C0331a f(C0331a c0331a, androidx.compose.ui.unit.d dVar, w wVar, v1 v1Var, long j4, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                dVar = c0331a.density;
            }
            if ((i4 & 2) != 0) {
                wVar = c0331a.layoutDirection;
            }
            w wVar2 = wVar;
            if ((i4 & 4) != 0) {
                v1Var = c0331a.canvas;
            }
            v1 v1Var2 = v1Var;
            if ((i4 & 8) != 0) {
                j4 = c0331a.size;
            }
            c0331a.getClass();
            return new C0331a(dVar, wVar2, v1Var2, j4);
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final androidx.compose.ui.unit.d getDensity() {
            return this.density;
        }

        @fg.l
        /* renamed from: b, reason: from getter */
        public final w getLayoutDirection() {
            return this.layoutDirection;
        }

        @fg.l
        /* renamed from: c, reason: from getter */
        public final v1 getCanvas() {
            return this.canvas;
        }

        /* renamed from: d, reason: from getter */
        public final long getSize() {
            return this.size;
        }

        @fg.l
        public final C0331a e(@fg.l androidx.compose.ui.unit.d density, @fg.l w layoutDirection, @fg.l v1 canvas, long size) {
            return new C0331a(density, layoutDirection, canvas, size);
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C0331a)) {
                return false;
            }
            C0331a c0331a = (C0331a) other;
            return l0.g(this.density, c0331a.density) && this.layoutDirection == c0331a.layoutDirection && l0.g(this.canvas, c0331a.canvas) && i0.n.k(this.size, c0331a.size);
        }

        @fg.l
        public final v1 g() {
            return this.canvas;
        }

        @fg.l
        public final androidx.compose.ui.unit.d h() {
            return this.density;
        }

        public int hashCode() {
            return i0.n.u(this.size) + ((this.canvas.hashCode() + ((this.layoutDirection.hashCode() + (this.density.hashCode() * 31)) * 31)) * 31);
        }

        @fg.l
        public final w i() {
            return this.layoutDirection;
        }

        public final long j() {
            return this.size;
        }

        public final void k(@fg.l v1 v1Var) {
            this.canvas = v1Var;
        }

        public final void l(@fg.l androidx.compose.ui.unit.d dVar) {
            this.density = dVar;
        }

        public final void m(@fg.l w wVar) {
            this.layoutDirection = wVar;
        }

        public final void n(long j4) {
            this.size = j4;
        }

        @fg.l
        public String toString() {
            return "DrawParams(density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", canvas=" + this.canvas + ", size=" + ((Object) i0.n.x(this.size)) + ')';
        }

        private C0331a(androidx.compose.ui.unit.d dVar, w wVar, v1 v1Var, long j4) {
            this.density = dVar;
            this.layoutDirection = wVar;
            this.canvas = v1Var;
            this.size = j4;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C0331a(androidx.compose.ui.unit.d r4, androidx.compose.ui.unit.w r5, androidx.compose.ui.graphics.v1 r6, long r7, int r9, kotlin.jvm.internal.w r10) {
            /*
                r3 = this;
                r10 = r9 & 1
                if (r10 == 0) goto L8
                androidx.compose.ui.unit.d r4 = androidx.compose.ui.graphics.drawscope.e.a()
            L8:
                r10 = r9 & 2
                if (r10 == 0) goto Le
                androidx.compose.ui.unit.w r5 = androidx.compose.ui.unit.w.Ltr
            Le:
                r10 = r5
                r5 = r9 & 4
                if (r5 == 0) goto L18
                androidx.compose.ui.graphics.drawscope.l r6 = new androidx.compose.ui.graphics.drawscope.l
                r6.<init>()
            L18:
                r0 = r6
                r5 = r9 & 8
                if (r5 == 0) goto L26
                i0.n$a r5 = i0.n.INSTANCE
                r5.getClass()
                long r7 = i0.n.b()
            L26:
                r1 = r7
                r5 = r3
                r6 = r4
                r7 = r10
                r8 = r0
                r9 = r1
                r5.<init>(r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.drawscope.a.C0331a.<init>(androidx.compose.ui.unit.d, androidx.compose.ui.unit.w, androidx.compose.ui.graphics.v1, long, int, kotlin.jvm.internal.w):void");
        }
    }

    /* compiled from: CanvasDrawScope.kt */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0019\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0003\u0010\u0018R$\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\u001a8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"androidx/compose/ui/graphics/drawscope/a$b", "Landroidx/compose/ui/graphics/drawscope/d;", "Landroidx/compose/ui/graphics/drawscope/j;", "a", "Landroidx/compose/ui/graphics/drawscope/j;", "h", "()Landroidx/compose/ui/graphics/drawscope/j;", "transform", "Landroidx/compose/ui/graphics/v1;", "value", "i", "()Landroidx/compose/ui/graphics/v1;", "k", "(Landroidx/compose/ui/graphics/v1;)V", "canvas", "Li0/n;", "e", "()J", "j", "(J)V", "size", "Landroidx/compose/ui/unit/w;", "getLayoutDirection", "()Landroidx/compose/ui/unit/w;", "(Landroidx/compose/ui/unit/w;)V", "layoutDirection", "Landroidx/compose/ui/unit/d;", "b", "()Landroidx/compose/ui/unit/d;", "g", "(Landroidx/compose/ui/unit/d;)V", "density", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final j transform = new b.a(this);

        b() {
        }

        @Override // androidx.compose.ui.graphics.drawscope.d
        public void a(@fg.l w wVar) {
            a.this.getDrawParams().m(wVar);
        }

        @Override // androidx.compose.ui.graphics.drawscope.d
        @fg.l
        public androidx.compose.ui.unit.d b() {
            return a.this.getDrawParams().h();
        }

        @Override // androidx.compose.ui.graphics.drawscope.d
        public long e() {
            return a.this.getDrawParams().j();
        }

        @Override // androidx.compose.ui.graphics.drawscope.d
        public void g(@fg.l androidx.compose.ui.unit.d dVar) {
            a.this.getDrawParams().l(dVar);
        }

        @Override // androidx.compose.ui.graphics.drawscope.d
        @fg.l
        public w getLayoutDirection() {
            return a.this.getDrawParams().i();
        }

        @Override // androidx.compose.ui.graphics.drawscope.d
        @fg.l
        /* renamed from: h, reason: from getter */
        public j getTransform() {
            return this.transform;
        }

        @Override // androidx.compose.ui.graphics.drawscope.d
        @fg.l
        public v1 i() {
            return a.this.getDrawParams().g();
        }

        @Override // androidx.compose.ui.graphics.drawscope.d
        public void j(long j4) {
            a.this.getDrawParams().n(j4);
        }

        @Override // androidx.compose.ui.graphics.drawscope.d
        public void k(@fg.l v1 v1Var) {
            a.this.getDrawParams().k(v1Var);
        }
    }

    @w0
    public static /* synthetic */ void G() {
    }

    private final long I(long j4, float f4) {
        return f4 == 1.0f ? j4 : d2.w(j4, d2.A(j4) * f4, 0.0f, 0.0f, 0.0f, 14, null);
    }

    private final d5 L() {
        d5 d5Var = this.fillPaint;
        if (d5Var != null) {
            return d5Var;
        }
        t0 t0Var = new t0();
        f5.INSTANCE.getClass();
        t0Var.y(f5.f17816c);
        this.fillPaint = t0Var;
        return t0Var;
    }

    private final d5 N() {
        d5 d5Var = this.strokePaint;
        if (d5Var != null) {
            return d5Var;
        }
        t0 t0Var = new t0();
        f5.INSTANCE.getClass();
        t0Var.y(f5.f17817d);
        this.strokePaint = t0Var;
        return t0Var;
    }

    private final d5 P(i drawStyle) {
        if (l0.g(drawStyle, m.f17797a)) {
            return L();
        }
        if (!(drawStyle instanceof n)) {
            throw new NoWhenBranchMatchedException();
        }
        d5 N = N();
        n nVar = (n) drawStyle;
        if (N.A() != nVar.getWidth()) {
            N.z(nVar.getWidth());
        }
        if (!i6.g(N.i(), nVar.getCap())) {
            N.c(nVar.getCap());
        }
        if (N.q() != nVar.getMiter()) {
            N.v(nVar.getMiter());
        }
        if (!j6.g(N.p(), nVar.getJoin())) {
            N.l(nVar.getJoin());
        }
        if (!l0.g(N.getPathEffect(), nVar.getPathEffect())) {
            N.j(nVar.getPathEffect());
        }
        return N;
    }

    private final d5 a(long color, i style, @x(from = 0.0d, to = 1.0d) float alpha, e2 colorFilter, int blendMode, int filterQuality) {
        d5 P = P(style);
        long I = I(color, alpha);
        if (!d2.y(P.a(), I)) {
            P.m(I);
        }
        if (P.getInternalShader() != null) {
            P.s(null);
        }
        if (!l0.g(P.getInternalColorFilter(), colorFilter)) {
            P.u(colorFilter);
        }
        if (!k1.G(P.get_blendMode(), blendMode)) {
            P.e(blendMode);
        }
        if (!m4.h(P.w(), filterQuality)) {
            P.h(filterQuality);
        }
        return P;
    }

    static /* synthetic */ d5 f(a aVar, long j4, i iVar, float f4, e2 e2Var, int i4, int i5, int i6, Object obj) {
        return aVar.a(j4, iVar, f4, e2Var, i4, (i6 & 32) != 0 ? f.INSTANCE.b() : i5);
    }

    private final d5 l(t1 brush, i style, @x(from = 0.0d, to = 1.0d) float alpha, e2 colorFilter, int blendMode, int filterQuality) {
        d5 P = P(style);
        if (brush != null) {
            brush.a(e(), P, alpha);
        } else {
            if (P.getInternalShader() != null) {
                P.s(null);
            }
            long a5 = P.a();
            d2.Companion companion = d2.INSTANCE;
            companion.getClass();
            if (!a2.o(a5, d2.f17766c)) {
                companion.getClass();
                P.m(d2.f17766c);
            }
            if (P.g() != alpha) {
                P.k(alpha);
            }
        }
        if (!l0.g(P.getInternalColorFilter(), colorFilter)) {
            P.u(colorFilter);
        }
        if (!k1.G(P.get_blendMode(), blendMode)) {
            P.e(blendMode);
        }
        if (!m4.h(P.w(), filterQuality)) {
            P.h(filterQuality);
        }
        return P;
    }

    static /* synthetic */ d5 p(a aVar, t1 t1Var, i iVar, float f4, e2 e2Var, int i4, int i5, int i6, Object obj) {
        if ((i6 & 32) != 0) {
            i5 = f.INSTANCE.b();
        }
        return aVar.l(t1Var, iVar, f4, e2Var, i4, i5);
    }

    private final d5 q(long color, float strokeWidth, float miter, int cap, int join, h5 pathEffect, @x(from = 0.0d, to = 1.0d) float alpha, e2 colorFilter, int blendMode, int filterQuality) {
        d5 N = N();
        long I = I(color, alpha);
        if (!d2.y(N.a(), I)) {
            N.m(I);
        }
        if (N.getInternalShader() != null) {
            N.s(null);
        }
        if (!l0.g(N.getInternalColorFilter(), colorFilter)) {
            N.u(colorFilter);
        }
        if (!k1.G(N.get_blendMode(), blendMode)) {
            N.e(blendMode);
        }
        if (N.A() != strokeWidth) {
            N.z(strokeWidth);
        }
        if (N.q() != miter) {
            N.v(miter);
        }
        if (!i6.g(N.i(), cap)) {
            N.c(cap);
        }
        if (!j6.g(N.p(), join)) {
            N.l(join);
        }
        if (!l0.g(N.getPathEffect(), pathEffect)) {
            N.j(pathEffect);
        }
        if (!m4.h(N.w(), filterQuality)) {
            N.h(filterQuality);
        }
        return N;
    }

    static /* synthetic */ d5 t(a aVar, long j4, float f4, float f5, int i4, int i5, h5 h5Var, float f6, e2 e2Var, int i6, int i7, int i10, Object obj) {
        return aVar.q(j4, f4, f5, i4, i5, h5Var, f6, e2Var, i6, (i10 & 512) != 0 ? f.INSTANCE.b() : i7);
    }

    private final d5 v(t1 brush, float strokeWidth, float miter, int cap, int join, h5 pathEffect, @x(from = 0.0d, to = 1.0d) float alpha, e2 colorFilter, int blendMode, int filterQuality) {
        d5 N = N();
        if (brush != null) {
            brush.a(e(), N, alpha);
        } else if (N.g() != alpha) {
            N.k(alpha);
        }
        if (!l0.g(N.getInternalColorFilter(), colorFilter)) {
            N.u(colorFilter);
        }
        if (!k1.G(N.get_blendMode(), blendMode)) {
            N.e(blendMode);
        }
        if (N.A() != strokeWidth) {
            N.z(strokeWidth);
        }
        if (N.q() != miter) {
            N.v(miter);
        }
        if (!i6.g(N.i(), cap)) {
            N.c(cap);
        }
        if (!j6.g(N.p(), join)) {
            N.l(join);
        }
        if (!l0.g(N.getPathEffect(), pathEffect)) {
            N.j(pathEffect);
        }
        if (!m4.h(N.w(), filterQuality)) {
            N.h(filterQuality);
        }
        return N;
    }

    static /* synthetic */ d5 y(a aVar, t1 t1Var, float f4, float f5, int i4, int i5, h5 h5Var, float f6, e2 e2Var, int i6, int i7, int i10, Object obj) {
        return aVar.v(t1Var, f4, f5, i4, i5, h5Var, f6, e2Var, i6, (i10 & 512) != 0 ? f.INSTANCE.b() : i7);
    }

    public final void A(@fg.l androidx.compose.ui.unit.d density, @fg.l w layoutDirection, @fg.l v1 canvas, long size, @fg.l ld.l<? super f, k2> block) {
        C0331a c0331a = this.drawParams;
        androidx.compose.ui.unit.d density2 = c0331a.getDensity();
        w layoutDirection2 = c0331a.getLayoutDirection();
        v1 canvas2 = c0331a.getCanvas();
        long size2 = c0331a.getSize();
        C0331a c0331a2 = this.drawParams;
        c0331a2.l(density);
        c0331a2.m(layoutDirection);
        c0331a2.k(canvas);
        c0331a2.n(size);
        canvas.C();
        block.invoke(this);
        canvas.o();
        C0331a c0331a3 = this.drawParams;
        c0331a3.l(density2);
        c0331a3.m(layoutDirection2);
        c0331a3.k(canvas2);
        c0331a3.n(size2);
    }

    @fg.l
    /* renamed from: E, reason: from getter */
    public final C0331a getDrawParams() {
        return this.drawParams;
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    @fg.l
    /* renamed from: E5, reason: from getter */
    public d getDrawContext() {
        return this.drawContext;
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void G1(@fg.l g5 path, @fg.l t1 brush, @x(from = 0.0d, to = 1.0d) float alpha, @fg.l i style, @fg.m e2 colorFilter, int blendMode) {
        this.drawParams.g().J(path, p(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void G2(long color, long topLeft, long size, long cornerRadius, @fg.l i style, @x(from = 0.0d, to = 1.0d) float alpha, @fg.m e2 colorFilter, int blendMode) {
        this.drawParams.g().O(i0.f.p(topLeft), i0.f.r(topLeft), i0.n.t(size) + i0.f.p(topLeft), i0.n.m(size) + i0.f.r(topLeft), i0.a.m(cornerRadius), i0.a.o(cornerRadius), f(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void G4(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, @x(from = 0.0d, to = 1.0d) float alpha, @fg.l i style, @fg.m e2 colorFilter, int blendMode) {
        this.drawParams.g().r(i0.f.p(topLeft), i0.f.r(topLeft), i0.n.t(size) + i0.f.p(topLeft), i0.n.m(size) + i0.f.r(topLeft), startAngle, sweepAngle, useCenter, f(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void I5(@fg.l t1 brush, long start, long end, float strokeWidth, int cap, @fg.m h5 pathEffect, @x(from = 0.0d, to = 1.0d) float alpha, @fg.m e2 colorFilter, int blendMode) {
        v1 g4 = this.drawParams.g();
        j6.INSTANCE.getClass();
        g4.w(start, end, y(this, brush, strokeWidth, 4.0f, cap, j6.f17869c, pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void K3(@fg.l t1 brush, long topLeft, long size, @x(from = 0.0d, to = 1.0d) float alpha, @fg.l i style, @fg.m e2 colorFilter, int blendMode) {
        this.drawParams.g().e(i0.f.p(topLeft), i0.f.r(topLeft), i0.n.t(size) + i0.f.p(topLeft), i0.n.m(size) + i0.f.r(topLeft), p(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void P3(long color, long start, long end, float strokeWidth, int cap, @fg.m h5 pathEffect, @x(from = 0.0d, to = 1.0d) float alpha, @fg.m e2 colorFilter, int blendMode) {
        v1 g4 = this.drawParams.g();
        j6.INSTANCE.getClass();
        g4.w(start, end, t(this, color, strokeWidth, 4.0f, cap, j6.f17869c, pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void Q3(@fg.l t1 brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, @x(from = 0.0d, to = 1.0d) float alpha, @fg.l i style, @fg.m e2 colorFilter, int blendMode) {
        this.drawParams.g().r(i0.f.p(topLeft), i0.f.r(topLeft), i0.n.t(size) + i0.f.p(topLeft), i0.n.m(size) + i0.f.r(topLeft), startAngle, sweepAngle, useCenter, p(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void R3(@fg.l g5 path, long color, @x(from = 0.0d, to = 1.0d) float alpha, @fg.l i style, @fg.m e2 colorFilter, int blendMode) {
        this.drawParams.g().J(path, f(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void T3(long color, long topLeft, long size, @x(from = 0.0d, to = 1.0d) float alpha, @fg.l i style, @fg.m e2 colorFilter, int blendMode) {
        this.drawParams.g().e(i0.f.p(topLeft), i0.f.r(topLeft), i0.n.t(size) + i0.f.p(topLeft), i0.n.m(size) + i0.f.r(topLeft), f(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.unit.n
    /* renamed from: U */
    public float getFontScale() {
        return this.drawParams.h().getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void a6(@fg.l t1 brush, float radius, long center, @x(from = 0.0d, to = 1.0d) float alpha, @fg.l i style, @fg.m e2 colorFilter, int blendMode) {
        this.drawParams.g().K(center, radius, p(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.unit.d
    /* renamed from: b */
    public float getDensity() {
        return this.drawParams.h().getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void c6(@fg.l s4 image, long srcOffset, long srcSize, long dstOffset, long dstSize, @x(from = 0.0d, to = 1.0d) float alpha, @fg.l i style, @fg.m e2 colorFilter, int blendMode, int filterQuality) {
        this.drawParams.g().h(image, srcOffset, srcSize, dstOffset, dstSize, l(null, style, alpha, colorFilter, blendMode, filterQuality));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void f5(@fg.l t1 brush, long topLeft, long size, long cornerRadius, @x(from = 0.0d, to = 1.0d) float alpha, @fg.l i style, @fg.m e2 colorFilter, int blendMode) {
        this.drawParams.g().O(i0.f.p(topLeft), i0.f.r(topLeft), i0.n.t(size) + i0.f.p(topLeft), i0.n.m(size) + i0.f.r(topLeft), i0.a.m(cornerRadius), i0.a.o(cornerRadius), p(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    @fg.l
    public w getLayoutDirection() {
        return this.drawParams.i();
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void l1(@fg.l List<i0.f> points, int pointMode, @fg.l t1 brush, float strokeWidth, int cap, @fg.m h5 pathEffect, @x(from = 0.0d, to = 1.0d) float alpha, @fg.m e2 colorFilter, int blendMode) {
        v1 g4 = this.drawParams.g();
        j6.INSTANCE.getClass();
        g4.g(pointMode, points, y(this, brush, strokeWidth, 4.0f, cap, j6.f17869c, pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void n4(long color, float radius, long center, @x(from = 0.0d, to = 1.0d) float alpha, @fg.l i style, @fg.m e2 colorFilter, int blendMode) {
        this.drawParams.g().K(center, radius, f(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @x0(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    public /* synthetic */ void r3(s4 image, long srcOffset, long srcSize, long dstOffset, long dstSize, @x(from = 0.0d, to = 1.0d) float alpha, i style, e2 colorFilter, int blendMode) {
        this.drawParams.g().h(image, srcOffset, srcSize, dstOffset, dstSize, p(this, null, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void r5(@fg.l t1 brush, long topLeft, long size, @x(from = 0.0d, to = 1.0d) float alpha, @fg.l i style, @fg.m e2 colorFilter, int blendMode) {
        this.drawParams.g().f(i0.f.p(topLeft), i0.f.r(topLeft), i0.n.t(size) + i0.f.p(topLeft), i0.n.m(size) + i0.f.r(topLeft), p(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void w4(long color, long topLeft, long size, @x(from = 0.0d, to = 1.0d) float alpha, @fg.l i style, @fg.m e2 colorFilter, int blendMode) {
        this.drawParams.g().f(i0.f.p(topLeft), i0.f.r(topLeft), i0.n.t(size) + i0.f.p(topLeft), i0.n.m(size) + i0.f.r(topLeft), f(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void y3(@fg.l s4 image, long topLeft, @x(from = 0.0d, to = 1.0d) float alpha, @fg.l i style, @fg.m e2 colorFilter, int blendMode) {
        this.drawParams.g().i(image, topLeft, p(this, null, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void y5(@fg.l List<i0.f> points, int pointMode, long color, float strokeWidth, int cap, @fg.m h5 pathEffect, @x(from = 0.0d, to = 1.0d) float alpha, @fg.m e2 colorFilter, int blendMode) {
        v1 g4 = this.drawParams.g();
        j6.INSTANCE.getClass();
        g4.g(pointMode, points, t(this, color, strokeWidth, 4.0f, cap, j6.f17869c, pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }
}

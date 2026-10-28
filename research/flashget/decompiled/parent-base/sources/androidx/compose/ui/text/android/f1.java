package androidx.compose.ui.text.android;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import kotlin.Metadata;

/* compiled from: TextAndroidCanvas.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0015\n\u0002\b\r\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u0017J\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017J\u000f\u0010\u001f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010\u0017J+\u0010$\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020\u0015H\u0017¢\u0006\u0004\b$\u0010%J#\u0010$\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b$\u0010&JA\u0010$\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020\u0015H\u0017¢\u0006\u0004\b$\u0010,J9\u0010$\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b$\u0010-J)\u0010/\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010 2\u0006\u0010.\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0015H\u0017¢\u0006\u0004\b/\u00100J!\u0010/\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010 2\u0006\u0010.\u001a\u00020\u0015H\u0016¢\u0006\u0004\b/\u00101J?\u0010/\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0006\u0010.\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0015H\u0017¢\u0006\u0004\b/\u00102J7\u0010/\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0006\u0010.\u001a\u00020\u0015H\u0016¢\u0006\u0004\b/\u00103J\u000f\u00104\u001a\u00020\u0005H\u0016¢\u0006\u0004\b4\u0010\u0003J\u000f\u00105\u001a\u00020\u0015H\u0016¢\u0006\u0004\b5\u0010\u0017J\u0017\u00107\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0015H\u0016¢\u0006\u0004\b7\u0010\u001cJ\u001f\u0010:\u001a\u00020\u00052\u0006\u00108\u001a\u00020'2\u0006\u00109\u001a\u00020'H\u0016¢\u0006\u0004\b:\u0010;J\u001f\u0010>\u001a\u00020\u00052\u0006\u0010<\u001a\u00020'2\u0006\u0010=\u001a\u00020'H\u0016¢\u0006\u0004\b>\u0010;J\u0017\u0010@\u001a\u00020\u00052\u0006\u0010?\u001a\u00020'H\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010B\u001a\u00020\u00052\u0006\u0010<\u001a\u00020'2\u0006\u0010=\u001a\u00020'H\u0016¢\u0006\u0004\bB\u0010;J\u0019\u0010E\u001a\u00020\u00052\b\u0010D\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bE\u0010FJ\u0019\u0010G\u001a\u00020\u00052\b\u0010D\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bG\u0010FJ\u0017\u0010I\u001a\u00020\u00052\u0006\u0010H\u001a\u00020CH\u0017¢\u0006\u0004\bI\u0010FJ\u001f\u0010M\u001a\u00020\n2\u0006\u0010J\u001a\u00020 2\u0006\u0010L\u001a\u00020KH\u0017¢\u0006\u0004\bM\u0010NJ\u001f\u0010M\u001a\u00020\n2\u0006\u0010J\u001a\u00020\b2\u0006\u0010L\u001a\u00020KH\u0017¢\u0006\u0004\bM\u0010OJ\u0017\u0010M\u001a\u00020\n2\u0006\u0010J\u001a\u00020 H\u0016¢\u0006\u0004\bM\u0010PJ\u0017\u0010M\u001a\u00020\n2\u0006\u0010J\u001a\u00020\bH\u0016¢\u0006\u0004\bM\u0010\fJ7\u0010M\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0006\u0010L\u001a\u00020KH\u0017¢\u0006\u0004\bM\u0010QJ/\u0010M\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\bM\u0010RJ/\u0010M\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u0015H\u0016¢\u0006\u0004\bM\u0010SJ\u0017\u0010T\u001a\u00020\n2\u0006\u0010J\u001a\u00020 H\u0017¢\u0006\u0004\bT\u0010PJ\u0017\u0010T\u001a\u00020\n2\u0006\u0010J\u001a\u00020\bH\u0017¢\u0006\u0004\bT\u0010\fJ/\u0010T\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'H\u0017¢\u0006\u0004\bT\u0010RJ/\u0010T\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u0015H\u0017¢\u0006\u0004\bT\u0010SJ\u001f\u0010W\u001a\u00020\n2\u0006\u0010V\u001a\u00020U2\u0006\u0010L\u001a\u00020KH\u0017¢\u0006\u0004\bW\u0010XJ\u0017\u0010W\u001a\u00020\n2\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010YJ\u0017\u0010Z\u001a\u00020\n2\u0006\u0010V\u001a\u00020UH\u0017¢\u0006\u0004\bZ\u0010YJ\u0011\u0010\\\u001a\u0004\u0018\u00010[H\u0016¢\u0006\u0004\b\\\u0010]J\u0019\u0010_\u001a\u00020\u00052\b\u0010^\u001a\u0004\u0018\u00010[H\u0016¢\u0006\u0004\b_\u0010`J\u001f\u0010c\u001a\u00020\n2\u0006\u0010J\u001a\u00020 2\u0006\u0010b\u001a\u00020aH\u0017¢\u0006\u0004\bc\u0010dJ\u0017\u0010c\u001a\u00020\n2\u0006\u0010J\u001a\u00020 H\u0017¢\u0006\u0004\bc\u0010PJ\u001f\u0010c\u001a\u00020\n2\u0006\u0010V\u001a\u00020U2\u0006\u0010b\u001a\u00020aH\u0017¢\u0006\u0004\bc\u0010eJ\u0017\u0010c\u001a\u00020\n2\u0006\u0010V\u001a\u00020UH\u0017¢\u0006\u0004\bc\u0010YJ7\u0010c\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0006\u0010b\u001a\u00020aH\u0017¢\u0006\u0004\bc\u0010fJ/\u0010c\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'H\u0017¢\u0006\u0004\bc\u0010RJ\u0017\u0010i\u001a\u00020\u00052\u0006\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bi\u0010jJ\u001f\u0010i\u001a\u00020\u00052\u0006\u0010h\u001a\u00020g2\u0006\u0010k\u001a\u00020 H\u0016¢\u0006\u0004\bi\u0010lJ\u001f\u0010i\u001a\u00020\u00052\u0006\u0010h\u001a\u00020g2\u0006\u0010k\u001a\u00020\bH\u0016¢\u0006\u0004\bi\u0010mJ7\u0010r\u001a\u00020\u00052\u0006\u0010n\u001a\u00020 2\u0006\u0010o\u001a\u00020'2\u0006\u0010p\u001a\u00020'2\u0006\u0010q\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\br\u0010sJO\u0010r\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0006\u0010o\u001a\u00020'2\u0006\u0010p\u001a\u00020'2\u0006\u0010q\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\br\u0010tJ/\u0010x\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00152\u0006\u0010u\u001a\u00020\u00152\u0006\u0010v\u001a\u00020\u00152\u0006\u0010w\u001a\u00020\u0015H\u0016¢\u0006\u0004\bx\u0010yJ1\u0010z\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\bz\u0010{J3\u0010z\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\u0010|\u001a\u0004\u0018\u00010\b2\u0006\u0010k\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\bz\u0010}J3\u0010z\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\u0010|\u001a\u0004\u0018\u00010\b2\u0006\u0010k\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\bz\u0010~Jb\u0010z\u001a\u00020\u00052\u0007\u0010\u0080\u0001\u001a\u00020\u007f2\u0007\u0010\u0081\u0001\u001a\u00020\u00152\u0007\u0010\u0082\u0001\u001a\u00020\u00152\u0007\u0010\u0083\u0001\u001a\u00020'2\u0007\u0010\u0084\u0001\u001a\u00020'2\u0007\u0010\u0085\u0001\u001a\u00020\u00152\u0007\u0010\u0086\u0001\u001a\u00020\u00152\u0007\u0010\u0087\u0001\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0005\bz\u0010\u0088\u0001Jb\u0010z\u001a\u00020\u00052\u0007\u0010\u0080\u0001\u001a\u00020\u007f2\u0007\u0010\u0081\u0001\u001a\u00020\u00152\u0007\u0010\u0082\u0001\u001a\u00020\u00152\u0007\u0010\u0083\u0001\u001a\u00020\u00152\u0007\u0010\u0084\u0001\u001a\u00020\u00152\u0007\u0010\u0085\u0001\u001a\u00020\u00152\u0007\u0010\u0086\u0001\u001a\u00020\u00152\u0007\u0010\u0087\u0001\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0005\bz\u0010\u0089\u0001J*\u0010z\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010D\u001a\u00020C2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0005\bz\u0010\u008a\u0001J]\u0010\u0091\u0001\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0007\u0010\u008b\u0001\u001a\u00020\u00152\u0007\u0010\u008c\u0001\u001a\u00020\u00152\b\u0010\u008e\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u008f\u0001\u001a\u00020\u00152\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f2\u0007\u0010\u0090\u0001\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J5\u0010\u0096\u0001\u001a\u00020\u00052\u0007\u0010\u0093\u0001\u001a\u00020'2\u0007\u0010\u0094\u0001\u001a\u00020'2\u0007\u0010\u0095\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001a\u0010\u0099\u0001\u001a\u00020\u00052\u0007\u0010\u0098\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\b\u0099\u0001\u0010\u001cJ\u001c\u0010\u0099\u0001\u001a\u00020\u00052\b\u0010\u0098\u0001\u001a\u00030\u009a\u0001H\u0017¢\u0006\u0006\b\u0099\u0001\u0010\u009b\u0001J%\u0010\u0099\u0001\u001a\u00020\u00052\u0007\u0010\u0098\u0001\u001a\u00020\u00152\b\u0010\u009d\u0001\u001a\u00030\u009c\u0001H\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009e\u0001J%\u0010\u0099\u0001\u001a\u00020\u00052\u0007\u0010\u0098\u0001\u001a\u00020\u00152\b\u0010\u009d\u0001\u001a\u00030\u009f\u0001H\u0017¢\u0006\u0006\b\u0099\u0001\u0010 \u0001J&\u0010\u0099\u0001\u001a\u00020\u00052\b\u0010\u0098\u0001\u001a\u00030\u009a\u00012\b\u0010\u009d\u0001\u001a\u00030\u009f\u0001H\u0017¢\u0006\u0006\b\u0099\u0001\u0010¡\u0001J>\u0010¦\u0001\u001a\u00020\u00052\u0007\u0010¢\u0001\u001a\u00020'2\u0007\u0010£\u0001\u001a\u00020'2\u0007\u0010¤\u0001\u001a\u00020'2\u0007\u0010¥\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\b¦\u0001\u0010§\u0001J6\u0010ª\u0001\u001a\u00020\u00052\b\u0010¨\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u0081\u0001\u001a\u00020\u00152\u0007\u0010©\u0001\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bª\u0001\u0010«\u0001J$\u0010ª\u0001\u001a\u00020\u00052\b\u0010¨\u0001\u001a\u00030\u008d\u00012\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bª\u0001\u0010¬\u0001J\"\u0010\u00ad\u0001\u001a\u00020\u00052\u0006\u0010n\u001a\u00020 2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J:\u0010\u00ad\u0001\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\b\u00ad\u0001\u0010§\u0001J\u001a\u0010¯\u0001\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\b¯\u0001\u0010°\u0001J.\u0010³\u0001\u001a\u00020\u00052\b\u0010²\u0001\u001a\u00030±\u00012\u0006\u0010k\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0006\b³\u0001\u0010´\u0001J.\u0010³\u0001\u001a\u00020\u00052\b\u0010²\u0001\u001a\u00030±\u00012\u0006\u0010k\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0006\b³\u0001\u0010µ\u0001J\"\u0010¶\u0001\u001a\u00020\u00052\u0006\u0010V\u001a\u00020U2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\b¶\u0001\u0010·\u0001J,\u0010¸\u0001\u001a\u00020\u00052\u0007\u0010\u0083\u0001\u001a\u00020'2\u0007\u0010\u0084\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\b¸\u0001\u0010¹\u0001J8\u0010º\u0001\u001a\u00020\u00052\n\u0010¨\u0001\u001a\u0005\u0018\u00010\u008d\u00012\u0007\u0010\u0081\u0001\u001a\u00020\u00152\u0007\u0010©\u0001\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bº\u0001\u0010«\u0001J$\u0010º\u0001\u001a\u00020\u00052\b\u0010¨\u0001\u001a\u00030\u008d\u00012\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bº\u0001\u0010¬\u0001J@\u0010¿\u0001\u001a\u00020\u00052\b\u0010¼\u0001\u001a\u00030»\u00012\u0007\u0010½\u0001\u001a\u00020\u00152\u0007\u0010©\u0001\u001a\u00020\u00152\b\u0010¾\u0001\u001a\u00030\u008d\u00012\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0006\b¿\u0001\u0010À\u0001J.\u0010¿\u0001\u001a\u00020\u00052\b\u0010¼\u0001\u001a\u00030Á\u00012\b\u0010¾\u0001\u001a\u00030\u008d\u00012\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0006\b¿\u0001\u0010Â\u0001J\"\u0010Ã\u0001\u001a\u00020\u00052\u0006\u0010J\u001a\u00020 2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bÃ\u0001\u0010®\u0001J\"\u0010Ã\u0001\u001a\u00020\u00052\u0006\u0010u\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J:\u0010Ã\u0001\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bÃ\u0001\u0010§\u0001J*\u0010Å\u0001\u001a\u00020\u00052\u0006\u0010u\u001a\u00020\u00152\u0006\u0010v\u001a\u00020\u00152\u0006\u0010w\u001a\u00020\u0015H\u0016¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J4\u0010É\u0001\u001a\u00020\u00052\u0006\u0010J\u001a\u00020 2\u0007\u0010Ç\u0001\u001a\u00020'2\u0007\u0010È\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001JL\u0010É\u0001\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0007\u0010Ç\u0001\u001a\u00020'2\u0007\u0010È\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bÉ\u0001\u0010Ë\u0001JP\u0010Ò\u0001\u001a\u00020\u00052\u0007\u0010Ì\u0001\u001a\u00020 2\u0007\u0010Í\u0001\u001a\u00020'2\u0007\u0010Î\u0001\u001a\u00020'2\u0007\u0010Ï\u0001\u001a\u00020 2\u0007\u0010Ð\u0001\u001a\u00020'2\u0007\u0010Ñ\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J@\u0010Ò\u0001\u001a\u00020\u00052\u0007\u0010Ì\u0001\u001a\u00020 2\b\u0010Ô\u0001\u001a\u00030\u008d\u00012\u0007\u0010Ï\u0001\u001a\u00020 2\b\u0010Õ\u0001\u001a\u00030\u008d\u00012\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0006\bÒ\u0001\u0010Ö\u0001JR\u0010Þ\u0001\u001a\u00020\u00052\u0007\u0010×\u0001\u001a\u00020\u007f2\u0007\u0010Ø\u0001\u001a\u00020\u00152\b\u0010Ù\u0001\u001a\u00030\u008d\u00012\u0007\u0010Ú\u0001\u001a\u00020\u00152\u0007\u0010Û\u0001\u001a\u00020\u00152\b\u0010Ý\u0001\u001a\u00030Ü\u00012\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0006\bÞ\u0001\u0010ß\u0001JH\u0010à\u0001\u001a\u00020\u00052\b\u0010¼\u0001\u001a\u00030»\u00012\u0007\u0010½\u0001\u001a\u00020\u00152\u0007\u0010©\u0001\u001a\u00020\u00152\u0007\u0010\u0083\u0001\u001a\u00020'2\u0007\u0010\u0084\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bà\u0001\u0010á\u0001J6\u0010à\u0001\u001a\u00020\u00052\b\u0010¼\u0001\u001a\u00030Á\u00012\u0007\u0010\u0083\u0001\u001a\u00020'2\u0007\u0010\u0084\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bà\u0001\u0010â\u0001JH\u0010à\u0001\u001a\u00020\u00052\b\u0010¼\u0001\u001a\u00030Á\u00012\u0007\u0010ã\u0001\u001a\u00020\u00152\u0007\u0010ä\u0001\u001a\u00020\u00152\u0007\u0010\u0083\u0001\u001a\u00020'2\u0007\u0010\u0084\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bà\u0001\u0010å\u0001JH\u0010à\u0001\u001a\u00020\u00052\b\u0010¼\u0001\u001a\u00030æ\u00012\u0007\u0010ã\u0001\u001a\u00020\u00152\u0007\u0010ä\u0001\u001a\u00020\u00152\u0007\u0010\u0083\u0001\u001a\u00020'2\u0007\u0010\u0084\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bà\u0001\u0010ç\u0001JP\u0010ê\u0001\u001a\u00020\u00052\b\u0010¼\u0001\u001a\u00030»\u00012\u0007\u0010½\u0001\u001a\u00020\u00152\u0007\u0010©\u0001\u001a\u00020\u00152\u0006\u0010V\u001a\u00020U2\u0007\u0010è\u0001\u001a\u00020'2\u0007\u0010é\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bê\u0001\u0010ë\u0001J>\u0010ê\u0001\u001a\u00020\u00052\b\u0010¼\u0001\u001a\u00030Á\u00012\u0006\u0010V\u001a\u00020U2\u0007\u0010è\u0001\u001a\u00020'2\u0007\u0010é\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bê\u0001\u0010ì\u0001Jc\u0010ð\u0001\u001a\u00020\u00052\b\u0010¼\u0001\u001a\u00030»\u00012\u0007\u0010½\u0001\u001a\u00020\u00152\u0007\u0010©\u0001\u001a\u00020\u00152\u0007\u0010í\u0001\u001a\u00020\u00152\u0007\u0010î\u0001\u001a\u00020\u00152\u0007\u0010\u0083\u0001\u001a\u00020'2\u0007\u0010\u0084\u0001\u001a\u00020'2\u0007\u0010ï\u0001\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0006\bð\u0001\u0010ñ\u0001Jc\u0010ð\u0001\u001a\u00020\u00052\b\u0010¼\u0001\u001a\u00030æ\u00012\u0007\u0010ã\u0001\u001a\u00020\u00152\u0007\u0010ä\u0001\u001a\u00020\u00152\u0007\u0010ò\u0001\u001a\u00020\u00152\u0007\u0010ó\u0001\u001a\u00020\u00152\u0007\u0010\u0083\u0001\u001a\u00020'2\u0007\u0010\u0084\u0001\u001a\u00020'2\u0007\u0010ï\u0001\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0006\bð\u0001\u0010ô\u0001Jc\u0010ð\u0001\u001a\u00020\u00052\b\u0010¼\u0001\u001a\u00030õ\u00012\u0007\u0010ã\u0001\u001a\u00020\u00152\u0007\u0010ä\u0001\u001a\u00020\u00152\u0007\u0010ò\u0001\u001a\u00020\u00152\u0007\u0010ó\u0001\u001a\u00020\u00152\u0007\u0010\u0083\u0001\u001a\u00020'2\u0007\u0010\u0084\u0001\u001a\u00020'2\u0007\u0010ï\u0001\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0006\bð\u0001\u0010ö\u0001J\u0087\u0001\u0010ÿ\u0001\u001a\u00020\u00052\b\u0010\u009d\u0001\u001a\u00030÷\u00012\u0007\u0010ø\u0001\u001a\u00020\u00152\b\u0010\u008e\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u008f\u0001\u001a\u00020\u00152\n\u0010ù\u0001\u001a\u0005\u0018\u00010\u008d\u00012\u0007\u0010ú\u0001\u001a\u00020\u00152\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f2\u0007\u0010\u0090\u0001\u001a\u00020\u00152\n\u0010ü\u0001\u001a\u0005\u0018\u00010û\u00012\u0007\u0010ý\u0001\u001a\u00020\u00152\u0007\u0010þ\u0001\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bÿ\u0001\u0010\u0080\u0002J\u001c\u0010\u0083\u0002\u001a\u00020\u00052\b\u0010\u0082\u0002\u001a\u00030\u0081\u0002H\u0017¢\u0006\u0006\b\u0083\u0002\u0010\u0084\u0002R\u0018\u0010\u0086\u0002\u001a\u00020\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0006\u0010\u0085\u0002¨\u0006\u0087\u0002"}, d2 = {"Landroidx/compose/ui/text/android/f1;", "Landroid/graphics/Canvas;", "<init>", "()V", "canvas", "Lkotlin/k2;", "a", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Rect;", "bounds", "", "getClipBounds", "(Landroid/graphics/Rect;)Z", "Landroid/graphics/Bitmap;", "bitmap", "setBitmap", "(Landroid/graphics/Bitmap;)V", "enableZ", "disableZ", "isOpaque", "()Z", "", "getWidth", "()I", "getHeight", "getDensity", "density", "setDensity", "(I)V", "getMaximumBitmapWidth", "getMaximumBitmapHeight", "save", "Landroid/graphics/RectF;", "Landroid/graphics/Paint;", "paint", "saveFlags", "saveLayer", "(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I", "(Landroid/graphics/RectF;Landroid/graphics/Paint;)I", "", "left", "top", "right", "bottom", "(FFFFLandroid/graphics/Paint;I)I", "(FFFFLandroid/graphics/Paint;)I", "alpha", "saveLayerAlpha", "(Landroid/graphics/RectF;II)I", "(Landroid/graphics/RectF;I)I", "(FFFFII)I", "(FFFFI)I", "restore", "getSaveCount", "saveCount", "restoreToCount", "dx", "dy", "translate", "(FF)V", "sx", "sy", "scale", "degrees", "rotate", "(F)V", "skew", "Landroid/graphics/Matrix;", "matrix", "concat", "(Landroid/graphics/Matrix;)V", "setMatrix", "ctm", "getMatrix", "rect", "Landroid/graphics/Region$Op;", "op", "clipRect", "(Landroid/graphics/RectF;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/Rect;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/RectF;)Z", "(FFFFLandroid/graphics/Region$Op;)Z", "(FFFF)Z", "(IIII)Z", "clipOutRect", "Landroid/graphics/Path;", "path", "clipPath", "(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/Path;)Z", "clipOutPath", "Landroid/graphics/DrawFilter;", "getDrawFilter", "()Landroid/graphics/DrawFilter;", "filter", "setDrawFilter", "(Landroid/graphics/DrawFilter;)V", "Landroid/graphics/Canvas$EdgeType;", "type", "quickReject", "(Landroid/graphics/RectF;Landroid/graphics/Canvas$EdgeType;)Z", "(Landroid/graphics/Path;Landroid/graphics/Canvas$EdgeType;)Z", "(FFFFLandroid/graphics/Canvas$EdgeType;)Z", "Landroid/graphics/Picture;", "picture", "drawPicture", "(Landroid/graphics/Picture;)V", "dst", "(Landroid/graphics/Picture;Landroid/graphics/RectF;)V", "(Landroid/graphics/Picture;Landroid/graphics/Rect;)V", "oval", "startAngle", "sweepAngle", "useCenter", "drawArc", "(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V", "(FFFFFFZLandroid/graphics/Paint;)V", "r", "g", "b", "drawARGB", "(IIII)V", "drawBitmap", "(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V", "src", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "", "colors", "offset", "stride", "x", "y", "width", "height", "hasAlpha", "([IIIFFIIZLandroid/graphics/Paint;)V", "([IIIIIIIZLandroid/graphics/Paint;)V", "(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V", "meshWidth", "meshHeight", "", "verts", "vertOffset", "colorOffset", "drawBitmapMesh", "(Landroid/graphics/Bitmap;II[FI[IILandroid/graphics/Paint;)V", "cx", "cy", "radius", "drawCircle", "(FFFLandroid/graphics/Paint;)V", "color", "drawColor", "", "(J)V", "Landroid/graphics/PorterDuff$Mode;", "mode", "(ILandroid/graphics/PorterDuff$Mode;)V", "Landroid/graphics/BlendMode;", "(ILandroid/graphics/BlendMode;)V", "(JLandroid/graphics/BlendMode;)V", "startX", "startY", "stopX", "stopY", "drawLine", "(FFFFLandroid/graphics/Paint;)V", "pts", "count", "drawLines", "([FIILandroid/graphics/Paint;)V", "([FLandroid/graphics/Paint;)V", "drawOval", "(Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "drawPaint", "(Landroid/graphics/Paint;)V", "Landroid/graphics/NinePatch;", "patch", "drawPatch", "(Landroid/graphics/NinePatch;Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "(Landroid/graphics/NinePatch;Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "drawPath", "(Landroid/graphics/Path;Landroid/graphics/Paint;)V", "drawPoint", "(FFLandroid/graphics/Paint;)V", "drawPoints", "", "text", "index", "pos", "drawPosText", "([CII[FLandroid/graphics/Paint;)V", "", "(Ljava/lang/String;[FLandroid/graphics/Paint;)V", "drawRect", "(Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "drawRGB", "(III)V", "rx", "ry", "drawRoundRect", "(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V", "(FFFFFFLandroid/graphics/Paint;)V", "outer", "outerRx", "outerRy", "inner", "innerRx", "innerRy", "drawDoubleRoundRect", "(Landroid/graphics/RectF;FFLandroid/graphics/RectF;FFLandroid/graphics/Paint;)V", "outerRadii", "innerRadii", "(Landroid/graphics/RectF;[FLandroid/graphics/RectF;[FLandroid/graphics/Paint;)V", "glyphIds", "glyphIdOffset", "positions", "positionOffset", "glyphCount", "Landroid/graphics/fonts/Font;", "font", "drawGlyphs", "([II[FIILandroid/graphics/fonts/Font;Landroid/graphics/Paint;)V", "drawText", "([CIIFFLandroid/graphics/Paint;)V", "(Ljava/lang/String;FFLandroid/graphics/Paint;)V", "start", "end", "(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V", "", "(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V", "hOffset", "vOffset", "drawTextOnPath", "([CIILandroid/graphics/Path;FFLandroid/graphics/Paint;)V", "(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V", "contextIndex", "contextCount", "isRtl", "drawTextRun", "([CIIIIFFZLandroid/graphics/Paint;)V", "contextStart", "contextEnd", "(Ljava/lang/CharSequence;IIIIFFZLandroid/graphics/Paint;)V", "Landroid/graphics/text/MeasuredText;", "(Landroid/graphics/text/MeasuredText;IIIIFFZLandroid/graphics/Paint;)V", "Landroid/graphics/Canvas$VertexMode;", "vertexCount", "texs", "texOffset", "", "indices", "indexOffset", "indexCount", "drawVertices", "(Landroid/graphics/Canvas$VertexMode;I[FI[FI[II[SIILandroid/graphics/Paint;)V", "Landroid/graphics/RenderNode;", "renderNode", "drawRenderNode", "(Landroid/graphics/RenderNode;)V", "Landroid/graphics/Canvas;", "nativeCanvas", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class f1 extends Canvas {

    /* renamed from: b, reason: collision with root package name */
    public static final int f20473b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Canvas nativeCanvas;

    public final void a(@fg.l Canvas canvas) {
        this.nativeCanvas = canvas;
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.x0(26)
    public boolean clipOutPath(@fg.l Path path) {
        boolean clipOutPath;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        clipOutPath = canvas.clipOutPath(path);
        return clipOutPath;
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.x0(26)
    public boolean clipOutRect(@fg.l RectF rect) {
        boolean clipOutRect;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        clipOutRect = canvas.clipOutRect(rect);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public boolean clipPath(@fg.l Path path, @fg.l Region.Op op) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public boolean clipRect(@fg.l RectF rect, @fg.l Region.Op op) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public void concat(@fg.m Matrix matrix) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.concat(matrix);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.x0(29)
    public void disableZ() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.disableZ();
    }

    @Override // android.graphics.Canvas
    public void drawARGB(int a5, int r4, int g4, int b5) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawARGB(a5, r4, g4, b5);
    }

    @Override // android.graphics.Canvas
    public void drawArc(@fg.l RectF oval, float startAngle, float sweepAngle, boolean useCenter, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(oval, startAngle, sweepAngle, useCenter, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@fg.l Bitmap bitmap, float left, float top2, @fg.m Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, left, top2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmapMesh(@fg.l Bitmap bitmap, int meshWidth, int meshHeight, @fg.l float[] verts, int vertOffset, @fg.m int[] colors, int colorOffset, @fg.m Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmapMesh(bitmap, meshWidth, meshHeight, verts, vertOffset, colors, colorOffset, paint);
    }

    @Override // android.graphics.Canvas
    public void drawCircle(float cx, float cy, float radius, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawCircle(cx, cy, radius, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int color) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(color);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.x0(29)
    public void drawDoubleRoundRect(@fg.l RectF outer, float outerRx, float outerRy, @fg.l RectF inner, float innerRx, float innerRy, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawDoubleRoundRect(outer, outerRx, outerRy, inner, innerRx, innerRy, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.x0(31)
    public void drawGlyphs(@fg.l int[] glyphIds, int glyphIdOffset, @fg.l float[] positions, int positionOffset, int glyphCount, @fg.l Font font, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawGlyphs(glyphIds, glyphIdOffset, positions, positionOffset, glyphCount, font, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLine(float startX, float startY, float stopX, float stopY, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawLine(startX, startY, stopX, stopY, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLines(@fg.l float[] pts, int offset, int count, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(pts, offset, count, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(@fg.l RectF oval, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(oval, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPaint(@fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.x0(31)
    public void drawPatch(@fg.l NinePatch patch, @fg.l Rect dst, @fg.m Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPatch(patch, dst, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPath(@fg.l Path path, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@fg.l Picture picture) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public void drawPoint(float x4, float y4, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoint(x4, y4, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(@fg.m float[] pts, int offset, int count, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(pts, offset, count, paint);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public void drawPosText(@fg.l char[] text, int index, int count, @fg.l float[] pos, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(text, index, count, pos, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRGB(int r4, int g4, int b5) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawRGB(r4, g4, b5);
    }

    @Override // android.graphics.Canvas
    public void drawRect(@fg.l RectF rect, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.x0(29)
    public void drawRenderNode(@fg.l RenderNode renderNode) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawRenderNode(renderNode);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(@fg.l RectF rect, float rx, float ry, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(rect, rx, ry, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(@fg.l char[] text, int index, int count, float x4, float y4, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(text, index, count, x4, y4, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(@fg.l char[] text, int index, int count, @fg.l Path path, float hOffset, float vOffset, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(text, index, count, path, hOffset, vOffset, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.x0(23)
    public void drawTextRun(@fg.l char[] text, int index, int count, int contextIndex, int contextCount, float x4, float y4, boolean isRtl, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextRun(text, index, count, contextIndex, contextCount, x4, y4, isRtl, paint);
    }

    @Override // android.graphics.Canvas
    public void drawVertices(@fg.l Canvas.VertexMode mode, int vertexCount, @fg.l float[] verts, int vertOffset, @fg.m float[] texs, int texOffset, @fg.m int[] colors, int colorOffset, @fg.m short[] indices, int indexOffset, int indexCount, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawVertices(mode, vertexCount, verts, vertOffset, texs, texOffset, colors, colorOffset, indices, indexOffset, indexCount, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.x0(29)
    public void enableZ() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.enableZ();
    }

    @Override // android.graphics.Canvas
    public boolean getClipBounds(@fg.l Rect bounds) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        boolean clipBounds = canvas.getClipBounds(bounds);
        if (clipBounds) {
            bounds.set(0, 0, bounds.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public int getDensity() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getDensity();
    }

    @Override // android.graphics.Canvas
    @fg.m
    public DrawFilter getDrawFilter() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public int getHeight() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getHeight();
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public void getMatrix(@fg.l Matrix ctm) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.getMatrix(ctm);
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public int getSaveCount() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getSaveCount();
    }

    @Override // android.graphics.Canvas
    public int getWidth() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getWidth();
    }

    @Override // android.graphics.Canvas
    public boolean isOpaque() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.isOpaque();
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public boolean quickReject(@fg.l RectF rect, @fg.l Canvas.EdgeType type) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(rect, type);
    }

    @Override // android.graphics.Canvas
    public void restore() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.restore();
    }

    @Override // android.graphics.Canvas
    public void restoreToCount(int saveCount) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.restoreToCount(saveCount);
    }

    @Override // android.graphics.Canvas
    public void rotate(float degrees) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.rotate(degrees);
    }

    @Override // android.graphics.Canvas
    public int save() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.save();
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public int saveLayer(@fg.m RectF bounds, @fg.m Paint paint, int saveFlags) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(bounds, paint, saveFlags);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public int saveLayerAlpha(@fg.m RectF bounds, int alpha, int saveFlags) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(bounds, alpha, saveFlags);
    }

    @Override // android.graphics.Canvas
    public void scale(float sx, float sy) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.scale(sx, sy);
    }

    @Override // android.graphics.Canvas
    public void setBitmap(@fg.m Bitmap bitmap) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public void setDensity(int density) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.setDensity(density);
    }

    @Override // android.graphics.Canvas
    public void setDrawFilter(@fg.m DrawFilter filter) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.setDrawFilter(filter);
    }

    @Override // android.graphics.Canvas
    public void setMatrix(@fg.m Matrix matrix) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public void skew(float sx, float sy) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.skew(sx, sy);
    }

    @Override // android.graphics.Canvas
    public void translate(float dx, float dy) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.translate(dx, dy);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.x0(26)
    public boolean clipOutRect(@fg.l Rect rect) {
        boolean clipOutRect;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        clipOutRect = canvas.clipOutRect(rect);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(@fg.l Path path) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public boolean clipRect(@fg.l Rect rect, @fg.l Region.Op op) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public void drawArc(float left, float top2, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(left, top2, right, bottom, startAngle, sweepAngle, useCenter, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@fg.l Bitmap bitmap, @fg.m Rect src, @fg.l RectF dst, @fg.m Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, src, dst, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.x0(29)
    public void drawColor(long color) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(color);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.x0(29)
    public void drawDoubleRoundRect(@fg.l RectF outer, @fg.l float[] outerRadii, @fg.l RectF inner, @fg.l float[] innerRadii, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawDoubleRoundRect(outer, outerRadii, inner, innerRadii, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLines(@fg.l float[] pts, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(pts, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(float left, float top2, float right, float bottom, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(left, top2, right, bottom, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.x0(31)
    public void drawPatch(@fg.l NinePatch patch, @fg.l RectF dst, @fg.m Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPatch(patch, dst, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@fg.l Picture picture, @fg.l RectF dst) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, dst);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(@fg.l float[] pts, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(pts, paint);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public void drawPosText(@fg.l String text, @fg.l float[] pos, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(text, pos, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRect(@fg.l Rect r4, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(r4, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(float left, float top2, float right, float bottom, float rx, float ry, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(left, top2, right, bottom, rx, ry, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(@fg.l String text, float x4, float y4, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(text, x4, y4, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(@fg.l String text, @fg.l Path path, float hOffset, float vOffset, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(text, path, hOffset, vOffset, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.x0(23)
    public void drawTextRun(@fg.l CharSequence text, int start, int end, int contextStart, int contextEnd, float x4, float y4, boolean isRtl, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextRun(text, start, end, contextStart, contextEnd, x4, y4, isRtl, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.x0(30)
    public boolean quickReject(@fg.l RectF rect) {
        boolean quickReject;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        quickReject = canvas.quickReject(rect);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public int saveLayer(@fg.m RectF bounds, @fg.m Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(bounds, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(@fg.m RectF bounds, int alpha) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(bounds, alpha);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.x0(26)
    public boolean clipOutRect(float left, float top2, float right, float bottom) {
        boolean clipOutRect;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        clipOutRect = canvas.clipOutRect(left, top2, right, bottom);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(@fg.l RectF rect) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@fg.l Bitmap bitmap, @fg.m Rect src, @fg.l Rect dst, @fg.m Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, src, dst, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int color, @fg.l PorterDuff.Mode mode) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(color, mode);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@fg.l Picture picture, @fg.l Rect dst) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, dst);
    }

    @Override // android.graphics.Canvas
    public void drawRect(float left, float top2, float right, float bottom, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(left, top2, right, bottom, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(@fg.l String text, int start, int end, float x4, float y4, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(text, start, end, x4, y4, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.x0(29)
    public void drawTextRun(@fg.l MeasuredText text, int start, int end, int contextStart, int contextEnd, float x4, float y4, boolean isRtl, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextRun(text, start, end, contextStart, contextEnd, x4, y4, isRtl, paint);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public boolean quickReject(@fg.l Path path, @fg.l Canvas.EdgeType type) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(path, type);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public int saveLayer(float left, float top2, float right, float bottom, @fg.m Paint paint, int saveFlags) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(left, top2, right, bottom, paint, saveFlags);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public int saveLayerAlpha(float left, float top2, float right, float bottom, int alpha, int saveFlags) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(left, top2, right, bottom, alpha, saveFlags);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.x0(26)
    public boolean clipOutRect(int left, int top2, int right, int bottom) {
        boolean clipOutRect;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        clipOutRect = canvas.clipOutRect(left, top2, right, bottom);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(@fg.l Rect rect) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public void drawBitmap(@fg.l int[] colors, int offset, int stride, float x4, float y4, int width, int height, boolean hasAlpha, @fg.m Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(colors, offset, stride, x4, y4, width, height, hasAlpha, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.x0(29)
    public void drawColor(int color, @fg.l BlendMode mode) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(color, mode);
    }

    @Override // android.graphics.Canvas
    public void drawText(@fg.l CharSequence text, int start, int end, float x4, float y4, @fg.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(text, start, end, x4, y4, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.x0(30)
    public boolean quickReject(@fg.l Path path) {
        boolean quickReject;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        quickReject = canvas.quickReject(path);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float left, float top2, float right, float bottom, @fg.m Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(left, top2, right, bottom, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float left, float top2, float right, float bottom, int alpha) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(left, top2, right, bottom, alpha);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public boolean clipRect(float left, float top2, float right, float bottom, @fg.l Region.Op op) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(left, top2, right, bottom, op);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public void drawBitmap(@fg.l int[] colors, int offset, int stride, int x4, int y4, int width, int height, boolean hasAlpha, @fg.m Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(colors, offset, stride, x4, y4, width, height, hasAlpha, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.x0(29)
    public void drawColor(long color, @fg.l BlendMode mode) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(color, mode);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public boolean quickReject(float left, float top2, float right, float bottom, @fg.l Canvas.EdgeType type) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(left, top2, right, bottom, type);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float left, float top2, float right, float bottom) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(left, top2, right, bottom);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@fg.l Bitmap bitmap, @fg.l Matrix matrix, @fg.m Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.x0(30)
    public boolean quickReject(float left, float top2, float right, float bottom) {
        boolean quickReject;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        quickReject = canvas.quickReject(left, top2, right, bottom);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(int left, int top2, int right, int bottom) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(left, top2, right, bottom);
    }
}

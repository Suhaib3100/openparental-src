package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationCallback;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.input.key.b;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.node.h0;
import androidx.compose.ui.node.p1;
import androidx.compose.ui.platform.t5;
import androidx.compose.ui.q;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.compose.ui.text.font.x;
import androidx.compose.ui.text.font.y;
import androidx.compose.ui.u;
import androidx.view.AbstractC1450w;
import androidx.view.C1442q1;
import androidx.view.C1463g;
import androidx.view.InterfaceC1423e0;
import androidx.view.InterfaceC1436l;
import androidx.view.InterfaceC1461e;
import i0.f;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Metadata;
import l0.a;

/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u0000ú\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0002ÿ\u0003\b\u0000\u0018\u0000 ®\u00042\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004-.\u0083\u0002B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u001b\u0010%\u001a\u00020\u00122\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b%\u0010&J\u0013\u0010'\u001a\u00020\u0015*\u00020#H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u001b*\u00020)H\u0082\nø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u001b*\u00020)H\u0082\nø\u0001\u0000¢\u0006\u0004\b,\u0010+J%\u0010/\u001a\u00020)2\u0006\u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u001bH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u001d\u00102\u001a\u00020)2\u0006\u00101\u001a\u00020\u001bH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0012H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00122\u0006\u00106\u001a\u00020#H\u0002¢\u0006\u0004\b7\u0010&J\u0017\u00108\u001a\u00020\u00122\u0006\u00106\u001a\u00020#H\u0002¢\u0006\u0004\b8\u0010&J\u0017\u0010;\u001a\u00020\u00152\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J\u001d\u0010?\u001a\u00020>2\u0006\u0010=\u001a\u000209H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\u001f\u0010B\u001a\u00020\u00152\u0006\u0010:\u001a\u0002092\u0006\u0010A\u001a\u000209H\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\u00152\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\bD\u0010<J\u001d\u0010E\u001a\u00020>2\u0006\u0010=\u001a\u000209H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bE\u0010@J1\u0010J\u001a\u00020\u00122\u0006\u0010=\u001a\u0002092\u0006\u0010F\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020G2\b\b\u0002\u0010I\u001a\u00020\u0015H\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u00152\u0006\u0010=\u001a\u000209H\u0002¢\u0006\u0004\bL\u0010<J\u000f\u0010M\u001a\u00020\u0012H\u0002¢\u0006\u0004\bM\u00105J\u0017\u0010N\u001a\u00020\u00122\u0006\u0010=\u001a\u000209H\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0012H\u0002¢\u0006\u0004\bP\u00105J\u000f\u0010Q\u001a\u00020\u0015H\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u00152\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\bS\u0010<J\u0017\u0010T\u001a\u00020\u00152\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\bT\u0010<J!\u0010X\u001a\u0004\u0018\u00010V2\u0006\u0010U\u001a\u00020\u001b2\u0006\u0010W\u001a\u00020VH\u0002¢\u0006\u0004\bX\u0010YJ9\u0010`\u001a\u00020]2'\u0010_\u001a#\b\u0001\u0012\u0004\u0012\u00020[\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0\\\u0012\u0006\u0012\u0004\u0018\u00010^0Z¢\u0006\u0002\b\u0013H\u0096@¢\u0006\u0004\b`\u0010aJ\u0017\u0010d\u001a\u00020\u00122\u0006\u0010c\u001a\u00020bH\u0016¢\u0006\u0004\bd\u0010eJ\u0017\u0010h\u001a\u00020\u00122\u0006\u0010g\u001a\u00020fH\u0016¢\u0006\u0004\bh\u0010iJ)\u0010m\u001a\u00020\u00122\u0006\u0010j\u001a\u00020\u00152\u0006\u0010k\u001a\u00020\u001b2\b\u0010l\u001a\u0004\u0018\u00010bH\u0014¢\u0006\u0004\bm\u0010nJ\u0017\u0010p\u001a\u00020\u00122\u0006\u0010o\u001a\u00020\u0015H\u0016¢\u0006\u0004\bp\u0010qJ\u001a\u0010t\u001a\u00020\u00152\u0006\u0010s\u001a\u00020rH\u0016ø\u0001\u0000¢\u0006\u0004\bt\u0010uJ\u0017\u0010w\u001a\u00020\u00152\u0006\u0010:\u001a\u00020vH\u0016¢\u0006\u0004\bw\u0010uJ\u0017\u0010x\u001a\u00020\u00152\u0006\u0010:\u001a\u00020vH\u0016¢\u0006\u0004\bx\u0010uJ\u0017\u0010y\u001a\u00020\u00122\u0006\u00106\u001a\u00020#H\u0016¢\u0006\u0004\by\u0010&J\u0017\u0010z\u001a\u00020\u00122\u0006\u00106\u001a\u00020#H\u0016¢\u0006\u0004\bz\u0010&J\r\u0010{\u001a\u00020\u0012¢\u0006\u0004\b{\u00105J\u000f\u0010|\u001a\u00020\u0012H\u0016¢\u0006\u0004\b|\u00105J\u001e\u0010\u007f\u001a\u00020\u00122\f\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00120}H\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001J#\u0010\u0084\u0001\u001a\u00020\u00122\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020#¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001a\u0010\u0086\u0001\u001a\u00020\u00122\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J$\u0010\u008a\u0001\u001a\u00020\u00122\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\b\u0010\u0089\u0001\u001a\u00030\u0088\u0001¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u001a\u0010\u008d\u0001\u001a\u00020\u00122\u0007\u0010\u008c\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\b\u008d\u0001\u0010qJ(\u0010\u0090\u0001\u001a\u00020\u00122\u0007\u0010\u0083\u0001\u001a\u00020#2\b\u0010\u008f\u0001\u001a\u00030\u008e\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J$\u0010\u0093\u0001\u001a\u00020\u00122\u0007\u0010\u0083\u0001\u001a\u00020#2\u0007\u0010\u0092\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J6\u0010\u0097\u0001\u001a\u00020\u00122\u0007\u0010\u0083\u0001\u001a\u00020#2\u0007\u0010\u0092\u0001\u001a\u00020\u00152\u0007\u0010\u0095\u0001\u001a\u00020\u00152\u0007\u0010\u0096\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J-\u0010\u0099\u0001\u001a\u00020\u00122\u0007\u0010\u0083\u0001\u001a\u00020#2\u0007\u0010\u0092\u0001\u001a\u00020\u00152\u0007\u0010\u0095\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001a\u0010\u009b\u0001\u001a\u00020\u00122\u0007\u0010\u0083\u0001\u001a\u00020#H\u0016¢\u0006\u0005\b\u009b\u0001\u0010&J\u0011\u0010\u009c\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u009c\u0001\u00105J$\u0010\u009f\u0001\u001a\u00020\u00122\u0007\u0010\u009d\u0001\u001a\u00020\u001b2\u0007\u0010\u009e\u0001\u001a\u00020\u001bH\u0014¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J=\u0010£\u0001\u001a\u00020\u00122\u0007\u0010¡\u0001\u001a\u00020\u00152\u0006\u0010h\u001a\u00020\u001b2\u0007\u0010¢\u0001\u001a\u00020\u001b2\u0007\u0010\u008d\u0001\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u001bH\u0014¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u001c\u0010¥\u0001\u001a\u00020\u00122\b\u0010\u0089\u0001\u001a\u00030\u0088\u0001H\u0014¢\u0006\u0006\b¥\u0001\u0010¦\u0001J8\u0010«\u0001\u001a\u00030ª\u00012\u0014\u0010¨\u0001\u001a\u000f\u0012\u0005\u0012\u00030§\u0001\u0012\u0004\u0012\u00020\u00120\u00102\r\u0010©\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120}H\u0016¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u001c\u0010®\u0001\u001a\u00020\u00152\b\u0010\u00ad\u0001\u001a\u00030ª\u0001H\u0000¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u0011\u0010°\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b°\u0001\u00105J\u001a\u0010±\u0001\u001a\u00020\u00122\u0007\u0010\u0083\u0001\u001a\u00020#H\u0016¢\u0006\u0005\b±\u0001\u0010&J\u001b\u0010³\u0001\u001a\u00020\u00122\u0007\u0010~\u001a\u00030²\u0001H\u0016¢\u0006\u0006\b³\u0001\u0010´\u0001J \u0010¶\u0001\u001a\u0005\u0018\u00010µ\u00012\u0006\u0010s\u001a\u00020rH\u0016ø\u0001\u0000¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u001c\u0010¸\u0001\u001a\u00020\u00122\b\u0010\u0089\u0001\u001a\u00030\u0088\u0001H\u0014¢\u0006\u0006\b¸\u0001\u0010¦\u0001J%\u0010º\u0001\u001a\u00020\u00122\b\u0010\u00ad\u0001\u001a\u00030ª\u00012\u0007\u0010¹\u0001\u001a\u00020\u0015H\u0000¢\u0006\u0006\bº\u0001\u0010»\u0001J&\u0010¾\u0001\u001a\u00020\u00122\u0014\u0010½\u0001\u001a\u000f\u0012\u0005\u0012\u00030¼\u0001\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0006\b¾\u0001\u0010¿\u0001J\u0013\u0010À\u0001\u001a\u00020\u0012H\u0086@¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J\u0011\u0010Â\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\bÂ\u0001\u00105J\u0011\u0010Ã\u0001\u001a\u00020\u0012H\u0014¢\u0006\u0005\bÃ\u0001\u00105J\u0011\u0010Ä\u0001\u001a\u00020\u0012H\u0014¢\u0006\u0005\bÄ\u0001\u00105J'\u0010È\u0001\u001a\u00020\u00122\n\u0010Æ\u0001\u001a\u0005\u0018\u00010Å\u00012\u0007\u0010Ç\u0001\u001a\u00020\u001bH\u0016¢\u0006\u0006\bÈ\u0001\u0010É\u0001J#\u0010Í\u0001\u001a\u00020\u00122\u000f\u0010Ì\u0001\u001a\n\u0012\u0005\u0012\u00030Ë\u00010Ê\u0001H\u0016¢\u0006\u0006\bÍ\u0001\u0010Î\u0001J9\u0010Ö\u0001\u001a\u00020\u00122\b\u0010Ð\u0001\u001a\u00030Ï\u00012\b\u0010Ò\u0001\u001a\u00030Ñ\u00012\u0011\u0010Õ\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Ô\u00010Ó\u0001H\u0017¢\u0006\u0006\bÖ\u0001\u0010×\u0001J%\u0010Û\u0001\u001a\u00020\u00122\u0011\u0010Ú\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Ù\u00010Ø\u0001H\u0017¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001J\u0019\u0010Ý\u0001\u001a\u00020\u00152\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0005\bÝ\u0001\u0010<J\u0019\u0010Þ\u0001\u001a\u00020\u00152\u0006\u0010=\u001a\u000209H\u0016¢\u0006\u0005\bÞ\u0001\u0010<J\u001a\u0010ß\u0001\u001a\u00020\u00152\u0006\u0010k\u001a\u00020\u001bH\u0016¢\u0006\u0006\bß\u0001\u0010à\u0001J\u001a\u0010á\u0001\u001a\u00020\u00152\u0006\u0010k\u001a\u00020\u001bH\u0016¢\u0006\u0006\bá\u0001\u0010à\u0001J \u0010ä\u0001\u001a\u00030â\u00012\b\u0010ã\u0001\u001a\u00030â\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bä\u0001\u0010å\u0001J\u001f\u0010è\u0001\u001a\u00020\u00122\b\u0010ç\u0001\u001a\u00030æ\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bè\u0001\u0010é\u0001J \u0010ë\u0001\u001a\u00030â\u00012\b\u0010ê\u0001\u001a\u00030â\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bë\u0001\u0010å\u0001J\u0011\u0010ì\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\bì\u0001\u0010RJ\u001f\u0010ð\u0001\u001a\u0005\u0018\u00010ï\u00012\b\u0010î\u0001\u001a\u00030í\u0001H\u0016¢\u0006\u0006\bð\u0001\u0010ñ\u0001J \u0010ó\u0001\u001a\u00030â\u00012\b\u0010ò\u0001\u001a\u00030â\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bó\u0001\u0010å\u0001J \u0010ô\u0001\u001a\u00030â\u00012\b\u0010ã\u0001\u001a\u00030â\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bô\u0001\u0010å\u0001J\u001c\u0010÷\u0001\u001a\u00020\u00122\b\u0010ö\u0001\u001a\u00030õ\u0001H\u0014¢\u0006\u0006\b÷\u0001\u0010ø\u0001J\u001b\u0010ú\u0001\u001a\u00020\u00122\u0007\u0010ù\u0001\u001a\u00020\u001bH\u0016¢\u0006\u0006\bú\u0001\u0010û\u0001J\u0019\u0010ü\u0001\u001a\u00020\u00152\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0005\bü\u0001\u0010<J\u001a\u0010ý\u0001\u001a\u0004\u0018\u00010V2\u0006\u0010U\u001a\u00020\u001b¢\u0006\u0006\bý\u0001\u0010þ\u0001J\u0011\u0010ÿ\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\bÿ\u0001\u0010RR\u001d\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b.\u0010\u0080\u0002\u001a\u0006\b\u0081\u0002\u0010\u0082\u0002R \u0010\u0085\u0002\u001a\u00030â\u00018\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b\u0083\u0002\u0010\u0084\u0002R\u0019\u0010\u0088\u0002\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0002\u0010\u0087\u0002R \u0010\u008d\u0002\u001a\u00030\u0089\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bè\u0001\u0010\u008a\u0002\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002R+\u0010\u0093\u0002\u001a\u00030\u008e\u00022\b\u0010\u008f\u0002\u001a\u00030\u008e\u00028\u0016@RX\u0096\u000e¢\u0006\u000f\n\u0006\b\u0090\u0002\u0010\u0091\u0002\u001a\u0005\b.\u0010\u0092\u0002R\u0018\u0010\u0096\u0002\u001a\u00030\u0094\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0095\u0002R\u001f\u0010\u009a\u0002\u001a\u00030\u0097\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b`\u0010\u0098\u0002\u001a\u0006\b¢\u0001\u0010\u0099\u0002R\u0018\u0010\u009e\u0002\u001a\u00030\u009b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0002\u0010\u009d\u0002R \u0010¤\u0002\u001a\u00030\u009f\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b \u0002\u0010¡\u0002\u001a\u0006\b¢\u0002\u0010£\u0002R\u0018\u0010§\u0002\u001a\u00030¥\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bë\u0001\u0010¦\u0002R\u0017\u0010ª\u0002\u001a\u00030¨\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bh\u0010©\u0002R\u0017\u0010«\u0002\u001a\u00030¨\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bt\u0010©\u0002R\u0018\u0010¯\u0002\u001a\u00030¬\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0002\u0010®\u0002R\u001f\u0010³\u0002\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÂ\u0001\u0010°\u0002\u001a\u0006\b±\u0002\u0010²\u0002R \u0010¹\u0002\u001a\u00030´\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bµ\u0002\u0010¶\u0002\u001a\u0006\b·\u0002\u0010¸\u0002R \u0010½\u0002\u001a\u00030º\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0081\u0002\u0010»\u0002\u001a\u0006\b \u0002\u0010¼\u0002R\u0018\u0010À\u0002\u001a\u00030¾\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010¿\u0002R \u0010Æ\u0002\u001a\u00030Á\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÂ\u0002\u0010Ã\u0002\u001a\u0006\bÄ\u0002\u0010Å\u0002R\u001f\u0010É\u0002\u001a\n\u0012\u0005\u0012\u00030ª\u00010Ç\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010È\u0002R#\u0010Ë\u0002\u001a\f\u0012\u0005\u0012\u00030ª\u0001\u0018\u00010Ç\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0002\u0010È\u0002R\u0019\u0010Ì\u0002\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0087\u0002R\u0018\u0010Ð\u0002\u001a\u00030Í\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0002\u0010Ï\u0002R\u0018\u0010Ó\u0002\u001a\u00030Ñ\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bô\u0001\u0010Ò\u0002R6\u0010Ø\u0002\u001a\u000f\u0012\u0005\u0012\u00030õ\u0001\u0012\u0004\u0012\u00020\u00120\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010Ô\u0002\u001a\u0006\bÕ\u0002\u0010Ö\u0002\"\u0006\b×\u0002\u0010¿\u0001R\u001a\u0010Ü\u0002\u001a\u0005\u0018\u00010Ù\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0002\u0010Û\u0002R\u0019\u0010Ý\u0002\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010\u0087\u0002R \u0010ã\u0002\u001a\u00030Þ\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bß\u0002\u0010à\u0002\u001a\u0006\bá\u0002\u0010â\u0002R \u0010é\u0002\u001a\u00030ä\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bå\u0002\u0010æ\u0002\u001a\u0006\bç\u0002\u0010è\u0002R \u0010î\u0002\u001a\u00030ê\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bë\u0002\u0010ì\u0002\u001a\u0006\b\u0084\u0002\u0010í\u0002R.\u0010ñ\u0002\u001a\u00020\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u001d\n\u0006\b\u0093\u0001\u0010\u0087\u0002\u0012\u0005\bð\u0002\u00105\u001a\u0005\bï\u0002\u0010R\"\u0005\bß\u0002\u0010qR\u001c\u0010õ\u0002\u001a\u0005\u0018\u00010ò\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bó\u0002\u0010ô\u0002R\u001c\u0010ø\u0002\u001a\u0005\u0018\u00010ö\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010÷\u0002R\"\u0010û\u0002\u001a\u0005\u0018\u00010\u008e\u00018\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bù\u0002\u0010ú\u0002R\u0019\u0010ý\u0002\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bü\u0002\u0010\u0087\u0002R\u0018\u0010\u0080\u0003\u001a\u00030þ\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0002\u0010ÿ\u0002R \u0010\u0085\u0003\u001a\u00030\u0081\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0082\u0003\u0010\u0083\u0003\u001a\u0006\b\u0086\u0002\u0010\u0084\u0003R \u0010\u0088\u0003\u001a\u00030\u0086\u00038\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b\u0087\u0003\u0010\u0084\u0002R\u0018\u0010\u008b\u0003\u001a\u00030Ñ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0003\u0010\u008a\u0003R\u001e\u0010\u008e\u0003\u001a\u00030æ\u00018\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b\u008c\u0003\u0010\u008d\u0003R\u001e\u0010\u008f\u0003\u001a\u00030æ\u00018\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b«\u0001\u0010\u008d\u0003R\u001e\u0010\u0090\u0003\u001a\u00030æ\u00018\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b·\u0002\u0010\u008d\u0003R0\u0010\u0096\u0003\u001a\u00020G8\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b¶\u0001\u0010\u0084\u0002\u0012\u0005\b\u0095\u0003\u00105\u001a\u0006\b\u0091\u0003\u0010\u0092\u0003\"\u0006\b\u0093\u0003\u0010\u0094\u0003R\u0019\u0010\u0098\u0003\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0003\u0010\u0087\u0002R \u0010\u009a\u0003\u001a\u00030â\u00018\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b\u0099\u0003\u0010\u0084\u0002R\u0019\u0010\u009c\u0003\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0003\u0010\u0087\u0002R9\u0010£\u0003\u001a\u0005\u0018\u00010¼\u00012\n\u0010\u008f\u0002\u001a\u0005\u0018\u00010¼\u00018B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b\u009d\u0003\u0010\u009e\u0003\u001a\u0006\b\u009f\u0003\u0010 \u0003\"\u0006\b¡\u0003\u0010¢\u0003R#\u0010§\u0003\u001a\u0005\u0018\u00010¼\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b¤\u0003\u0010¥\u0003\u001a\u0006\b¦\u0003\u0010 \u0003R(\u0010©\u0003\u001a\u0011\u0012\u0005\u0012\u00030¼\u0001\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0003\u0010Ô\u0002R\u0018\u0010\u00ad\u0003\u001a\u00030ª\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0003\u0010¬\u0003R\u0018\u0010±\u0003\u001a\u00030®\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0003\u0010°\u0003R\u0018\u0010µ\u0003\u001a\u00030²\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0003\u0010´\u0003R\u0018\u0010¹\u0003\u001a\u00030¶\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0003\u0010¸\u0003R\u001f\u0010¾\u0003\u001a\u00030º\u00038\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b»\u0003\u0010¼\u0003\u001a\u0005\b-\u0010½\u0003R%\u0010Ã\u0003\u001a\n\u0012\u0005\u0012\u00030À\u00030¿\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bÁ\u0003\u0010Â\u0003R \u0010É\u0003\u001a\u00030Ä\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÅ\u0003\u0010Æ\u0003\u001a\u0006\bÇ\u0003\u0010È\u0003R'\u0010Ï\u0003\u001a\u00030Ê\u00038\u0016X\u0097\u0004¢\u0006\u0017\n\u0006\bË\u0003\u0010Ì\u0003\u0012\u0005\b\u0097\u0003\u00105\u001a\u0006\bÍ\u0003\u0010Î\u0003R5\u0010Õ\u0003\u001a\u00030Ð\u00032\b\u0010\u008f\u0002\u001a\u00030Ð\u00038V@RX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\bÑ\u0003\u0010\u009e\u0003\u001a\u0006\b\u0082\u0003\u0010Ò\u0003\"\u0006\bÓ\u0003\u0010Ô\u0003R\u0019\u0010×\u0003\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0003\u0010ü\u0002R5\u0010ù\u0001\u001a\u00030Ø\u00032\b\u0010\u008f\u0002\u001a\u00030Ø\u00038V@RX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\bÙ\u0003\u0010\u009e\u0003\u001a\u0006\bÚ\u0003\u0010Û\u0003\"\u0006\bÜ\u0003\u0010Ý\u0003R \u0010ã\u0003\u001a\u00030Þ\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bß\u0003\u0010à\u0003\u001a\u0006\bá\u0003\u0010â\u0003R\u0018\u0010ç\u0003\u001a\u00030ä\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bå\u0003\u0010æ\u0003R \u0010ì\u0003\u001a\u00030è\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bé\u0003\u0010ê\u0003\u001a\u0006\b\u0089\u0003\u0010ë\u0003R \u0010ñ\u0003\u001a\u00030í\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bî\u0003\u0010ï\u0003\u001a\u0006\b\u008c\u0003\u0010ð\u0003R\u001b\u0010ô\u0003\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bò\u0003\u0010ó\u0003R\u0019\u0010ö\u0003\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bõ\u0003\u0010\u0084\u0002R\u001f\u0010ú\u0003\u001a\n\u0012\u0005\u0012\u00030ª\u00010÷\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bø\u0003\u0010ù\u0003R&\u0010þ\u0003\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010}0û\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bü\u0003\u0010ý\u0003R\u0018\u0010\u0082\u0004\u001a\u00030ÿ\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0004\u0010\u0081\u0004R\u0018\u0010\u0086\u0004\u001a\u00030\u0083\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0004\u0010\u0085\u0004R\u0019\u0010\u0088\u0004\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0004\u0010\u0087\u0002R\u001d\u0010\u008b\u0004\u001a\b\u0012\u0004\u0012\u00020\u00120}8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0004\u0010\u008a\u0004R\u0018\u0010\u008f\u0004\u001a\u00030\u008c\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0004\u0010\u008e\u0004R\u0019\u0010\u0091\u0004\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0004\u0010\u0087\u0002R \u0010\u0096\u0004\u001a\u00030\u0092\u00048\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0093\u0004\u0010\u0094\u0004\u001a\u0006\bÚ\u0002\u0010\u0095\u0004R\u001c\u0010\u0099\u0004\u001a\u00020\u001b*\u00030õ\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0097\u0004\u0010\u0098\u0004R\u0017\u0010\u0082\u0001\u001a\u00020V8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009a\u0004\u0010\u009b\u0004R\u0018\u0010\u009f\u0004\u001a\u00030\u009c\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009d\u0004\u0010\u009e\u0004R\u001a\u0010Í\u0001\u001a\u0005\u0018\u00010 \u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\bù\u0002\u0010¡\u0004R\u0018\u0010¤\u0004\u001a\u00030ò\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b¢\u0004\u0010£\u0004R\u0017\u0010¥\u0004\u001a\u00020G8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0087\u0003\u0010\u0092\u0003R\u0016\u0010¦\u0004\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bµ\u0002\u0010RR\u0018\u0010©\u0004\u001a\u00030§\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\bå\u0002\u0010¨\u0004R\u0018\u0010¬\u0004\u001a\u00030ª\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\bü\u0002\u0010«\u0004R\u0016\u0010\u00ad\u0004\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009c\u0002\u0010R\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¯\u0004"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/p1;", "Landroidx/compose/ui/platform/b6;", "Landroidx/compose/ui/input/pointer/r0;", "Landroidx/lifecycle/l;", "Landroid/content/Context;", "context", "Lkotlin/coroutines/g;", "coroutineContext", "<init>", "(Landroid/content/Context;Lkotlin/coroutines/g;)V", "Landroidx/compose/ui/draganddrop/h;", "transferData", "Li0/n;", "decorationSize", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "Lkotlin/u;", "drawDragDecoration", "", "D1", "(Landroidx/compose/ui/draganddrop/h;JLld/l;)Z", "viewGroup", "I0", "(Landroid/view/ViewGroup;)V", "", "virtualViewId", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "", "extraDataKey", "E0", "(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V", "Landroidx/compose/ui/node/h0;", "nodeToRemeasure", "q1", "(Landroidx/compose/ui/node/h0;)V", "H0", "(Landroidx/compose/ui/node/h0;)Z", "Lkotlin/a2;", "J0", "(J)I", "K0", "a", "b", "j1", "(II)J", "measureSpec", "L0", "(I)J", "F1", "()V", "node", "d1", "c1", "Landroid/view/MotionEvent;", "event", "a1", "(Landroid/view/MotionEvent;)Z", "motionEvent", "Landroidx/compose/ui/input/pointer/s0;", "Z0", "(Landroid/view/MotionEvent;)I", "lastEvent", "b1", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z", "f1", "u1", "action", "", "eventTime", "forceHover", "v1", "(Landroid/view/MotionEvent;IJZ)V", "g1", "k1", "l1", "(Landroid/view/MotionEvent;)V", "m1", "F0", "()Z", "e1", "h1", "accessibilityId", "Landroid/view/View;", "currentView", "N0", "(ILandroid/view/View;)Landroid/view/View;", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/q2;", "Lkotlin/coroutines/d;", "", "", "session", "h", "(Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/graphics/Rect;", "rect", "getFocusedRect", "(Landroid/graphics/Rect;)V", "Landroidx/lifecycle/e0;", "owner", "l", "(Landroidx/lifecycle/e0;)V", "gainFocus", "direction", "previouslyFocusedRect", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", "hasWindowFocus", "onWindowFocusChanged", "(Z)V", "Landroidx/compose/ui/input/key/c;", "keyEvent", "m", "(Landroid/view/KeyEvent;)Z", "Landroid/view/KeyEvent;", "dispatchKeyEvent", "dispatchKeyEventPreIme", "T", "a0", "p1", "h0", "Lkotlin/Function0;", "listener", "g0", "(Lld/a;)V", "Landroidx/compose/ui/viewinterop/c;", "view", "layoutNode", "D0", "(Landroidx/compose/ui/viewinterop/c;Landroidx/compose/ui/node/h0;)V", "o1", "(Landroidx/compose/ui/viewinterop/c;)V", "Landroid/graphics/Canvas;", "canvas", "M0", "(Landroidx/compose/ui/viewinterop/c;Landroid/graphics/Canvas;)V", "sendPointerUpdate", "r", "Landroidx/compose/ui/unit/b;", "constraints", "V", "(Landroidx/compose/ui/node/h0;J)V", "affectsLookahead", "E", "(Landroidx/compose/ui/node/h0;Z)V", "forceRequest", "scheduleMeasureAndLayout", "Y", "(Landroidx/compose/ui/node/h0;ZZZ)V", "v", "(Landroidx/compose/ui/node/h0;ZZ)V", "y", "g", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "t", "onLayout", "(ZIIII)V", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroidx/compose/ui/graphics/v1;", "drawBlock", "invalidateParentLayer", "Landroidx/compose/ui/node/o1;", "O", "(Lld/l;Lld/a;)Landroidx/compose/ui/node/o1;", "layer", "n1", "(Landroidx/compose/ui/node/o1;)Z", "i0", "A", "Landroidx/compose/ui/node/p1$b;", "G", "(Landroidx/compose/ui/node/p1$b;)V", "Landroidx/compose/ui/focus/f;", "Q", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/f;", "dispatchDraw", "isDirty", "i1", "(Landroidx/compose/ui/node/o1;Z)V", "Landroidx/compose/ui/platform/AndroidComposeView$c;", "callback", "B1", "(Lld/l;)V", "G0", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "o", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/ViewStructure;", "structure", "flags", "onProvideAutofillVirtualStructure", "(Landroid/view/ViewStructure;I)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "autofill", "(Landroid/util/SparseArray;)V", "", "virtualIds", "", "supportedFormats", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "onCreateVirtualViewTranslationRequests", "([J[ILjava/util/function/Consumer;)V", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "onVirtualViewTranslationResponses", "(Landroid/util/LongSparseArray;)V", "dispatchGenericMotionEvent", "dispatchTouchEvent", "canScrollHorizontally", "(I)Z", "canScrollVertically", "Li0/f;", "localPosition", "e0", "(J)J", "Landroidx/compose/ui/graphics/y4;", "localTransform", "e", "([F)V", "positionOnScreen", "k", "onCheckIsTextEditor", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "onCreateInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "positionInWindow", "X", "x", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "layoutDirection", "onRtlPropertiesChanged", "(I)V", "dispatchHoverEvent", "findViewByAccessibilityIdTraversal", "(I)Landroid/view/View;", "shouldDelayChildPressedState", "Lkotlin/coroutines/g;", "q", "()Lkotlin/coroutines/g;", "c", "J", "lastDownPointerPosition", "d", "Z", "superclassInitComplete", "Landroidx/compose/ui/node/j0;", "Landroidx/compose/ui/node/j0;", "b0", "()Landroidx/compose/ui/node/j0;", "sharedDrawScope", "Landroidx/compose/ui/unit/d;", "<set-?>", "f", "Landroidx/compose/ui/unit/d;", "()Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/semantics/EmptySemanticsElement;", "Landroidx/compose/ui/semantics/EmptySemanticsElement;", "semanticsModifier", "Landroidx/compose/ui/focus/s;", "Landroidx/compose/ui/focus/s;", "()Landroidx/compose/ui/focus/s;", "focusOwner", "Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;", "i", "Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;", "dragAndDropModifierOnDragListener", "Landroidx/compose/ui/draganddrop/c;", "j", "Landroidx/compose/ui/draganddrop/c;", "U", "()Landroidx/compose/ui/draganddrop/c;", "dragAndDropManager", "Landroidx/compose/ui/platform/e6;", "Landroidx/compose/ui/platform/e6;", "_windowInfo", "Landroidx/compose/ui/q;", "Landroidx/compose/ui/q;", "keyInputModifier", "rotaryInputModifier", "Landroidx/compose/ui/graphics/w1;", "n", "Landroidx/compose/ui/graphics/w1;", "canvasHolder", "Landroidx/compose/ui/node/h0;", "getRoot", "()Landroidx/compose/ui/node/h0;", "root", "Landroidx/compose/ui/node/x1;", "p", "Landroidx/compose/ui/node/x1;", "P", "()Landroidx/compose/ui/node/x1;", "rootForTest", "Landroidx/compose/ui/semantics/r;", "Landroidx/compose/ui/semantics/r;", "()Landroidx/compose/ui/semantics/r;", "semanticsOwner", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "composeAccessibilityDelegate", "Lh0/a0;", "s", "Lh0/a0;", "j0", "()Lh0/a0;", "autofillTree", "", "Ljava/util/List;", "dirtyLayers", "u", "postponedDirtyLayers", "isDrawingContent", "Landroidx/compose/ui/input/pointer/i;", "w", "Landroidx/compose/ui/input/pointer/i;", "motionEventAdapter", "Landroidx/compose/ui/input/pointer/f0;", "Landroidx/compose/ui/input/pointer/f0;", "pointerInputEventProcessor", "Lld/l;", "R0", "()Lld/l;", "x1", "configurationChangeObserver", "Lh0/f;", "z", "Lh0/f;", "_autofill", "observationClearRequested", "Landroidx/compose/ui/platform/f;", "B", "Landroidx/compose/ui/platform/f;", "Q0", "()Landroidx/compose/ui/platform/f;", "clipboardManager", "Landroidx/compose/ui/platform/e;", "C", "Landroidx/compose/ui/platform/e;", "O0", "()Landroidx/compose/ui/platform/e;", "accessibilityManager", "Landroidx/compose/ui/node/r1;", "D", "Landroidx/compose/ui/node/r1;", "()Landroidx/compose/ui/node/r1;", "snapshotObserver", "l0", "V0", "showLayoutBounds", "Landroidx/compose/ui/platform/z0;", "F", "Landroidx/compose/ui/platform/z0;", "_androidViewsHandler", "Landroidx/compose/ui/platform/q1;", "Landroidx/compose/ui/platform/q1;", "viewLayersContainer", "H", "Landroidx/compose/ui/unit/b;", "onMeasureConstraints", "I", "wasMeasuredWithMultipleConstraints", "Landroidx/compose/ui/node/t0;", "Landroidx/compose/ui/node/t0;", "measureAndLayoutDelegate", "Landroidx/compose/ui/platform/s5;", "K", "Landroidx/compose/ui/platform/s5;", "()Landroidx/compose/ui/platform/s5;", "viewConfiguration", "Landroidx/compose/ui/unit/q;", "L", "globalPosition", "M", "[I", "tmpPositionArray", "N", "[F", "tmpMatrix", "viewToWindowMatrix", "windowToViewMatrix", "T0", "()J", "z1", "(J)V", "U0", "lastMatrixRecalculationAnimationTime", "R", "forceUseMatrixCache", "Q1", "windowPosition", "V1", "isRenderNodeCompatible", "L2", "Landroidx/compose/runtime/k2;", "X0", "()Landroidx/compose/ui/platform/AndroidComposeView$c;", "C1", "(Landroidx/compose/ui/platform/AndroidComposeView$c;)V", "_viewTreeOwners", "M2", "Landroidx/compose/runtime/b5;", "W0", "viewTreeOwners", "N2", "onViewTreeOwnersAvailable", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "O2", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "P2", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "scrollChangedListener", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "Q2", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "touchModeChangeListener", "Landroidx/compose/ui/text/input/d1;", "R2", "Landroidx/compose/ui/text/input/d1;", "legacyTextInputServiceAndroid", "Landroidx/compose/ui/text/input/b1;", "S2", "Landroidx/compose/ui/text/input/b1;", "()Landroidx/compose/ui/text/input/b1;", "textInputService", "Landroidx/compose/ui/u;", "Landroidx/compose/ui/platform/s0;", "T2", "Ljava/util/concurrent/atomic/AtomicReference;", "textInputSessionMutex", "Landroidx/compose/ui/platform/g5;", "U2", "Landroidx/compose/ui/platform/g5;", "W", "()Landroidx/compose/ui/platform/g5;", "softwareKeyboardController", "Landroidx/compose/ui/text/font/x$b;", "V2", "Landroidx/compose/ui/text/font/x$b;", "S", "()Landroidx/compose/ui/text/font/x$b;", "fontLoader", "Landroidx/compose/ui/text/font/y$b;", "W2", "()Landroidx/compose/ui/text/font/y$b;", "y1", "(Landroidx/compose/ui/text/font/y$b;)V", "fontFamilyResolver", "X2", "currentFontWeightAdjustment", "Landroidx/compose/ui/unit/w;", "Y2", "getLayoutDirection", "()Landroidx/compose/ui/unit/w;", "A1", "(Landroidx/compose/ui/unit/w;)V", "Lk0/a;", "Z2", "Lk0/a;", "f0", "()Lk0/a;", "hapticFeedBack", "Ll0/c;", "a3", "Ll0/c;", "_inputModeManager", "Landroidx/compose/ui/modifier/h;", "b3", "Landroidx/compose/ui/modifier/h;", "()Landroidx/compose/ui/modifier/h;", "modifierLocalManager", "Landroidx/compose/ui/platform/i5;", "c3", "Landroidx/compose/ui/platform/i5;", "()Landroidx/compose/ui/platform/i5;", "textToolbar", "d3", "Landroid/view/MotionEvent;", "previousMotionEvent", "e3", "relayoutTime", "Landroidx/compose/ui/platform/c6;", "f3", "Landroidx/compose/ui/platform/c6;", "layerCache", "Landroidx/compose/runtime/collection/g;", "g3", "Landroidx/compose/runtime/collection/g;", "endApplyChangesListeners", "androidx/compose/ui/platform/AndroidComposeView$n", "h3", "Landroidx/compose/ui/platform/AndroidComposeView$n;", "resendMotionEventRunnable", "Ljava/lang/Runnable;", "i3", "Ljava/lang/Runnable;", "sendHoverExitEvent", "j3", "hoverExitReceived", "k3", "Lld/a;", "resendMotionEventOnLayout", "Landroidx/compose/ui/platform/b1;", "l3", "Landroidx/compose/ui/platform/b1;", "matrixToWindow", "m3", "keyboardModifiersRequireUpdate", "Landroidx/compose/ui/input/pointer/y;", "n3", "Landroidx/compose/ui/input/pointer/y;", "()Landroidx/compose/ui/input/pointer/y;", "pointerIconService", "S0", "(Landroid/content/res/Configuration;)I", "fontWeightAdjustmentCompat", "getView", "()Landroid/view/View;", "Landroidx/compose/ui/platform/d6;", "d0", "()Landroidx/compose/ui/platform/d6;", "windowInfo", "Lh0/j;", "()Lh0/j;", "P0", "()Landroidx/compose/ui/platform/z0;", "androidViewsHandler", "measureIteration", "hasPendingMeasureOrLayout", "Landroidx/compose/ui/layout/i1$a;", "()Landroidx/compose/ui/layout/i1$a;", "placementScope", "Ll0/b;", "()Ll0/b;", "inputModeManager", "isLifecycleInResumedState", "o3", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 7 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 8 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 9 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 10 DebugUtils.kt\nandroidx/compose/ui/platform/DebugUtilsKt\n+ 11 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,2348:1\n1071#1,4:2388\n1071#1,4:2392\n1208#2:2349\n1187#2,2:2350\n81#3:2352\n107#3,2:2353\n81#3:2355\n81#3:2356\n107#3,2:2357\n81#3:2359\n107#3,2:2360\n62#4:2362\n63#4,6:2366\n1#5:2363\n1#5:2402\n728#6,2:2364\n523#6:2372\n728#6,2:2373\n460#6,11:2404\n460#6,11:2416\n26#7,5:2375\n26#7,5:2380\n26#7,3:2385\n30#7:2396\n26#7,5:2431\n47#8,5:2397\n197#9:2403\n197#9:2415\n20#10,2:2427\n20#10,2:2429\n217#11,6:2436\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n*L\n1045#1:2388,4\n1046#1:2392,4\n524#1:2349\n524#1:2350,2\n377#1:2352\n377#1:2353,2\n386#1:2355\n448#1:2356\n448#1:2357,2\n462#1:2359\n462#1:2360,2\n652#1:2362\n652#1:2366,6\n652#1:2363\n652#1:2364,2\n739#1:2372\n752#1:2373,2\n1305#1:2404,11\n1313#1:2416,11\n969#1:2375,5\n981#1:2380,5\n1041#1:2385,3\n1041#1:2396\n1493#1:2431,5\n1231#1:2397,5\n1305#1:2403\n1313#1:2415\n1325#1:2427,2\n1389#1:2429,2\n1572#1:2436,6\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements androidx.compose.ui.node.p1, b6, androidx.compose.ui.input.pointer.r0, InterfaceC1436l {

    /* renamed from: p3, reason: collision with root package name */
    public static final int f19556p3 = 8;

    /* renamed from: r3, reason: collision with root package name */
    private static final int f19558r3 = 10;

    /* renamed from: s3, reason: collision with root package name */
    @fg.m
    private static Class<?> f19559s3;

    /* renamed from: t3, reason: collision with root package name */
    @fg.m
    private static Method f19560t3;

    /* renamed from: A, reason: from kotlin metadata */
    private boolean observationClearRequested;

    /* renamed from: B, reason: from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.platform.f clipboardManager;

    /* renamed from: C, reason: from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.platform.e accessibilityManager;

    /* renamed from: D, reason: from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.node.r1 snapshotObserver;

    /* renamed from: E, reason: from kotlin metadata */
    private boolean showLayoutBounds;

    /* renamed from: F, reason: from kotlin metadata */
    @fg.m
    private z0 _androidViewsHandler;

    /* renamed from: G, reason: from kotlin metadata */
    @fg.m
    private q1 viewLayersContainer;

    /* renamed from: H, reason: from kotlin metadata */
    @fg.m
    private androidx.compose.ui.unit.b onMeasureConstraints;

    /* renamed from: I, reason: from kotlin metadata */
    private boolean wasMeasuredWithMultipleConstraints;

    /* renamed from: J, reason: from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.node.t0 measureAndLayoutDelegate;

    /* renamed from: K, reason: from kotlin metadata */
    @fg.l
    private final s5 viewConfiguration;

    /* renamed from: L, reason: from kotlin metadata */
    private long globalPosition;

    /* renamed from: L2, reason: from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 _viewTreeOwners;

    /* renamed from: M, reason: from kotlin metadata */
    @fg.l
    private final int[] tmpPositionArray;

    /* renamed from: M2, reason: from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.b5 viewTreeOwners;

    /* renamed from: N, reason: from kotlin metadata */
    @fg.l
    private final float[] tmpMatrix;

    /* renamed from: N2, reason: from kotlin metadata */
    @fg.m
    private ld.l<? super c, kotlin.k2> onViewTreeOwnersAvailable;

    /* renamed from: O, reason: from kotlin metadata */
    @fg.l
    private final float[] viewToWindowMatrix;

    /* renamed from: O2, reason: from kotlin metadata */
    @fg.l
    private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;

    /* renamed from: P, reason: from kotlin metadata */
    @fg.l
    private final float[] windowToViewMatrix;

    /* renamed from: P2, reason: from kotlin metadata */
    @fg.l
    private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener;

    /* renamed from: Q, reason: from kotlin metadata */
    private long lastMatrixRecalculationAnimationTime;

    /* renamed from: Q1, reason: from kotlin metadata */
    private long windowPosition;

    /* renamed from: Q2, reason: from kotlin metadata */
    @fg.l
    private final ViewTreeObserver.OnTouchModeChangeListener touchModeChangeListener;

    /* renamed from: R, reason: from kotlin metadata */
    private boolean forceUseMatrixCache;

    /* renamed from: R2, reason: from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.input.d1 legacyTextInputServiceAndroid;

    /* renamed from: S2, reason: from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.input.b1 textInputService;

    /* renamed from: T2, reason: from kotlin metadata */
    @fg.l
    private final AtomicReference<u.a<Object>> textInputSessionMutex;

    /* renamed from: U2, reason: from kotlin metadata */
    @fg.l
    private final g5 softwareKeyboardController;

    /* renamed from: V1, reason: from kotlin metadata */
    private boolean isRenderNodeCompatible;

    /* renamed from: V2, reason: from kotlin metadata */
    @fg.l
    private final x.b fontLoader;

    /* renamed from: W2, reason: from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 fontFamilyResolver;

    /* renamed from: X2, reason: from kotlin metadata */
    private int currentFontWeightAdjustment;

    /* renamed from: Y2, reason: from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 layoutDirection;

    /* renamed from: Z2, reason: from kotlin metadata */
    @fg.l
    private final k0.a hapticFeedBack;

    /* renamed from: a3, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l0.c _inputModeManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.coroutines.g coroutineContext;

    /* renamed from: b3, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.modifier.h modifierLocalManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long lastDownPointerPosition;

    /* renamed from: c3, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i5 textToolbar;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean superclassInitComplete;

    /* renamed from: d3, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private MotionEvent previousMotionEvent;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.node.j0 sharedDrawScope;

    /* renamed from: e3, reason: collision with root package name and from kotlin metadata */
    private long relayoutTime;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.unit.d density;

    /* renamed from: f3, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c6<androidx.compose.ui.node.o1> layerCache;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final EmptySemanticsElement semanticsModifier;

    /* renamed from: g3, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<ld.a<kotlin.k2>> endApplyChangesListeners;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.focus.s focusOwner;

    /* renamed from: h3, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n resendMotionEventRunnable;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener;

    /* renamed from: i3, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Runnable sendHoverExitEvent;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.draganddrop.c dragAndDropManager;

    /* renamed from: j3, reason: collision with root package name and from kotlin metadata */
    private boolean hoverExitReceived;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e6 _windowInfo;

    /* renamed from: k3, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<kotlin.k2> resendMotionEventOnLayout;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.q keyInputModifier;

    /* renamed from: l3, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b1 matrixToWindow;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.q rotaryInputModifier;

    /* renamed from: m3, reason: collision with root package name and from kotlin metadata */
    private boolean keyboardModifiersRequireUpdate;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.graphics.w1 canvasHolder;

    /* renamed from: n3, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.input.pointer.y pointerIconService;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.node.h0 root;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.node.x1 rootForTest;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.semantics.r semanticsOwner;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AndroidComposeViewAccessibilityDelegateCompat composeAccessibilityDelegate;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h0.a0 autofillTree;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<androidx.compose.ui.node.o1> dirtyLayers;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private List<androidx.compose.ui.node.o1> postponedDirtyLayers;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean isDrawingContent;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.input.pointer.i motionEventAdapter;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.input.pointer.f0 pointerInputEventProcessor;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super Configuration, kotlin.k2> configurationChangeObserver;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final h0.f _autofill;

    /* renamed from: q3, reason: collision with root package name */
    @fg.l
    private static final String f19557q3 = "Compose Focus";

    /* renamed from: o3, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$a;", "Landroid/view/translation/ViewTranslationCallback;", "<init>", "()V", "Landroid/view/View;", "view", "", "onShowTranslation", "(Landroid/view/View;)Z", "onHideTranslation", "onClearTranslation", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.annotation.x0(31)
    private static final class a implements ViewTranslationCallback {
        public boolean onClearTranslation(@fg.l View view) {
            kotlin.jvm.internal.l0.n(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
            ((AndroidComposeView) view).composeAccessibilityDelegate.R0();
            return true;
        }

        public boolean onHideTranslation(@fg.l View view) {
            kotlin.jvm.internal.l0.n(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
            ((AndroidComposeView) view).composeAccessibilityDelegate.T0();
            return true;
        }

        public boolean onShowTranslation(@fg.l View view) {
            kotlin.jvm.internal.l0.n(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
            ((AndroidComposeView) view).composeAccessibilityDelegate.W0();
            return true;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$b;", "", "<init>", "()V", "", "b", "()Z", "", "FocusTag", "Ljava/lang/String;", "", "MaximumLayerCacheSize", "I", "Ljava/lang/reflect/Method;", "getBooleanMethod", "Ljava/lang/reflect/Method;", "Ljava/lang/Class;", "systemPropertiesClass", "Ljava/lang/Class;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b() {
            try {
                if (AndroidComposeView.f19559s3 == null) {
                    AndroidComposeView.f19559s3 = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.f19559s3;
                    AndroidComposeView.f19560t3 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.f19560t3;
                Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = invoke instanceof Boolean ? (Boolean) invoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @androidx.compose.runtime.internal.u(parameters = 0)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$c;", "", "Landroidx/lifecycle/e0;", "lifecycleOwner", "Landroidx/savedstate/e;", "savedStateRegistryOwner", "<init>", "(Landroidx/lifecycle/e0;Landroidx/savedstate/e;)V", "a", "Landroidx/lifecycle/e0;", "()Landroidx/lifecycle/e0;", "b", "Landroidx/savedstate/e;", "()Landroidx/savedstate/e;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final int f19600c = 8;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final InterfaceC1423e0 lifecycleOwner;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final InterfaceC1461e savedStateRegistryOwner;

        public c(@fg.l InterfaceC1423e0 interfaceC1423e0, @fg.l InterfaceC1461e interfaceC1461e) {
            this.lifecycleOwner = interfaceC1423e0;
            this.savedStateRegistryOwner = interfaceC1461e;
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final InterfaceC1423e0 getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        @fg.l
        /* renamed from: b, reason: from getter */
        public final InterfaceC1461e getSavedStateRegistryOwner() {
            return this.savedStateRegistryOwner;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/a;", "it", "", "a", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<l0.a, Boolean> {
        d() {
            super(1);
        }

        @fg.l
        public final Boolean a(int i4) {
            boolean requestFocusFromTouch;
            a.Companion companion = l0.a.INSTANCE;
            companion.getClass();
            if (l0.a.f(i4, l0.a.f81245c)) {
                requestFocusFromTouch = AndroidComposeView.this.isInTouchMode();
            } else {
                companion.getClass();
                requestFocusFromTouch = l0.a.f(i4, l0.a.f81246d) ? AndroidComposeView.this.isInTouchMode() ? AndroidComposeView.this.requestFocusFromTouch() : true : false;
            }
            return Boolean.valueOf(requestFocusFromTouch);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Boolean invoke(l0.a aVar) {
            return a(aVar.getValue());
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/AndroidComposeView$e", "Landroidx/core/view/a;", "Landroid/view/View;", "host", "Landroidx/core/view/accessibility/h0;", "info", "Lkotlin/k2;", "i", "(Landroid/view/View;Landroidx/core/view/accessibility/h0;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e extends androidx.core.view.a {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.node.h0 f19605f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f19606g;

        /* compiled from: AndroidComposeView.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/h0;", "it", "", "a", "(Landroidx/compose/ui/node/h0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,2348:1\n76#2:2349\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1\n*L\n853#1:2349\n*E\n"})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.node.h0, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f19607b = new a(1);

            a() {
                super(1);
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@fg.l androidx.compose.ui.node.h0 h0Var) {
                return Boolean.valueOf(h0Var.getNodes().t(8));
            }
        }

        e(androidx.compose.ui.node.h0 h0Var, AndroidComposeView androidComposeView) {
            this.f19605f = h0Var;
            this.f19606g = androidComposeView;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
        
            if (r6.intValue() == r5.f19604e.getSemanticsOwner().b().getId()) goto L12;
         */
        @Override // androidx.core.view.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void i(@fg.l android.view.View r6, @fg.l androidx.core.view.accessibility.h0 r7) {
            /*
                r5 = this;
                super.i(r6, r7)
                androidx.compose.ui.platform.AndroidComposeView r6 = androidx.compose.ui.platform.AndroidComposeView.this
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r6 = androidx.compose.ui.platform.AndroidComposeView.r0(r6)
                boolean r6 = r6.K0()
                if (r6 == 0) goto L13
                r6 = 0
                r7.p2(r6)
            L13:
                androidx.compose.ui.node.h0 r6 = r5.f19605f
                androidx.compose.ui.platform.AndroidComposeView$e$a r0 = androidx.compose.ui.platform.AndroidComposeView.e.a.f19607b
                androidx.compose.ui.node.h0 r6 = androidx.compose.ui.semantics.q.h(r6, r0)
                if (r6 == 0) goto L26
                int r6 = r6.getSemanticsId()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                goto L27
            L26:
                r6 = 0
            L27:
                if (r6 == 0) goto L3d
                androidx.compose.ui.platform.AndroidComposeView r0 = androidx.compose.ui.platform.AndroidComposeView.this
                androidx.compose.ui.semantics.r r0 = r0.getSemanticsOwner()
                androidx.compose.ui.semantics.p r0 = r0.b()
                int r0 = r0.getId()
                int r1 = r6.intValue()
                if (r1 != r0) goto L42
            L3d:
                r6 = -1
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            L42:
                androidx.compose.ui.platform.AndroidComposeView r0 = r5.f19606g
                int r6 = r6.intValue()
                r7.Q1(r0, r6)
                androidx.compose.ui.node.h0 r6 = r5.f19605f
                int r6 = r6.getSemanticsId()
                androidx.compose.ui.platform.AndroidComposeView r0 = androidx.compose.ui.platform.AndroidComposeView.this
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r0 = androidx.compose.ui.platform.AndroidComposeView.r0(r0)
                java.util.HashMap r0 = r0.t0()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
                java.lang.Object r0 = r0.get(r1)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 == 0) goto L93
                androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.ui.platform.AndroidComposeView.this
                androidx.compose.ui.platform.AndroidComposeView r2 = r5.f19606g
                int r3 = r0.intValue()
                androidx.compose.ui.platform.z0 r4 = r1.P0()
                int r0 = r0.intValue()
                android.view.View r0 = androidx.compose.ui.platform.c0.K(r4, r0)
                if (r0 == 0) goto L81
                r7.l2(r0)
                goto L84
            L81:
                r7.m2(r2, r3)
            L84:
                android.view.accessibility.AccessibilityNodeInfo r0 = r7.q2()
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r2 = androidx.compose.ui.platform.AndroidComposeView.r0(r1)
                java.lang.String r2 = r2.getExtraDataTestTraversalBeforeVal()
                androidx.compose.ui.platform.AndroidComposeView.q0(r1, r6, r0, r2)
            L93:
                androidx.compose.ui.platform.AndroidComposeView r0 = androidx.compose.ui.platform.AndroidComposeView.this
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r0 = androidx.compose.ui.platform.AndroidComposeView.r0(r0)
                java.util.HashMap r0 = r0.s0()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
                java.lang.Object r0 = r0.get(r1)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 == 0) goto Ld5
                androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.ui.platform.AndroidComposeView.this
                androidx.compose.ui.platform.AndroidComposeView r2 = r5.f19606g
                int r3 = r0.intValue()
                androidx.compose.ui.platform.z0 r4 = r1.P0()
                int r0 = r0.intValue()
                android.view.View r0 = androidx.compose.ui.platform.c0.K(r4, r0)
                if (r0 == 0) goto Lc3
                r7.j2(r0)
                goto Lc6
            Lc3:
                r7.k2(r2, r3)
            Lc6:
                android.view.accessibility.AccessibilityNodeInfo r7 = r7.q2()
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r0 = androidx.compose.ui.platform.AndroidComposeView.r0(r1)
                java.lang.String r0 = r0.getExtraDataTestTraversalAfterVal()
                androidx.compose.ui.platform.AndroidComposeView.q0(r1, r6, r7, r0)
            Ld5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.e.i(android.view.View, androidx.core.view.accessibility.h0):void");
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/res/Configuration;", "it", "Lkotlin/k2;", "a", "(Landroid/content/res/Configuration;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<Configuration, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f19608b = new f(1);

        f() {
            super(1);
        }

        public final void a(@fg.l Configuration configuration) {
        }

        @Override // ld.l
        public kotlin.k2 invoke(Configuration configuration) {
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class g extends kotlin.jvm.internal.h0 implements ld.q<androidx.compose.ui.draganddrop.h, i0.n, ld.l<? super androidx.compose.ui.graphics.drawscope.f, ? extends kotlin.k2>, Boolean> {
        g(Object obj) {
            super(3, obj, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Boolean R(androidx.compose.ui.draganddrop.h hVar, i0.n nVar, ld.l<? super androidx.compose.ui.graphics.drawscope.f, ? extends kotlin.k2> lVar) {
            return Z(hVar, nVar.getPackedValue(), lVar);
        }

        @fg.l
        public final Boolean Z(@fg.l androidx.compose.ui.draganddrop.h hVar, long j4, @fg.l ld.l<? super androidx.compose.ui.graphics.drawscope.f, kotlin.k2> lVar) {
            return Boolean.valueOf(((AndroidComposeView) this.receiver).D1(hVar, j4, lVar));
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "it", "a", "(Lld/a;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.l<ld.a<? extends kotlin.k2>, kotlin.k2> {
        h() {
            super(1);
        }

        public final void a(@fg.l ld.a<kotlin.k2> aVar) {
            AndroidComposeView.this.g0(aVar);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(ld.a<? extends kotlin.k2> aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/key/c;", "it", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.input.key.c, Boolean> {
        i() {
            super(1);
        }

        @fg.l
        public final Boolean a(@fg.l KeyEvent keyEvent) {
            androidx.compose.ui.focus.f Q = AndroidComposeView.this.Q(keyEvent);
            if (Q != null) {
                int b5 = androidx.compose.ui.input.key.e.b(keyEvent);
                androidx.compose.ui.input.key.d.INSTANCE.getClass();
                if (androidx.compose.ui.input.key.d.g(b5, androidx.compose.ui.input.key.d.f18651e)) {
                    return Boolean.valueOf(AndroidComposeView.this.getFocusOwner().g(Q.getValue()));
                }
            }
            return Boolean.FALSE;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.key.c cVar) {
            return a(cVar.h());
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class j extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f19611b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f19612c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z4, AndroidComposeView androidComposeView) {
            super(0);
            this.f19611b = z4;
            this.f19612c = androidComposeView;
        }

        public final void a() {
            if (this.f19611b) {
                this.f19612c.clearFocus();
            } else {
                this.f19612c.requestFocus();
            }
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"androidx/compose/ui/platform/AndroidComposeView$k", "Landroidx/compose/ui/input/pointer/y;", "Landroidx/compose/ui/input/pointer/w;", "getIcon", "()Landroidx/compose/ui/input/pointer/w;", "value", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/input/pointer/w;)V", "Landroidx/compose/ui/input/pointer/w;", "currentIcon", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class k implements androidx.compose.ui.input.pointer.y {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private androidx.compose.ui.input.pointer.w currentIcon = androidx.compose.ui.input.pointer.w.INSTANCE.b();

        k() {
        }

        @Override // androidx.compose.ui.input.pointer.y
        public void a(@fg.m androidx.compose.ui.input.pointer.w value) {
            if (value == null) {
                value = androidx.compose.ui.input.pointer.w.INSTANCE.b();
            }
            this.currentIcon = value;
            j0.f19949a.a(AndroidComposeView.this, value);
        }

        @Override // androidx.compose.ui.input.pointer.y
        @fg.l
        /* renamed from: getIcon, reason: from getter */
        public androidx.compose.ui.input.pointer.w getCurrentIcon() {
            return this.currentIcon;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class l extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.viewinterop.c f19616c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(androidx.compose.ui.viewinterop.c cVar) {
            super(0);
            this.f19616c = cVar;
        }

        public final void a() {
            AndroidComposeView.this.P0().removeViewInLayout(this.f19616c);
            HashMap<androidx.compose.ui.node.h0, androidx.compose.ui.viewinterop.c> c5 = AndroidComposeView.this.P0().c();
            kotlin.jvm.internal.u1.k(c5).remove(AndroidComposeView.this.P0().b().remove(this.f19616c));
            androidx.core.view.x1.Z1(this.f19616c, 0);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class m extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {
        m() {
            super(0);
        }

        public final void a() {
            MotionEvent motionEvent = AndroidComposeView.this.previousMotionEvent;
            if (motionEvent != null) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 7 || actionMasked == 9) {
                    AndroidComposeView.this.relayoutTime = SystemClock.uptimeMillis();
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    androidComposeView.post(androidComposeView.resendMotionEventRunnable);
                }
            }
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/AndroidComposeView$n", "Ljava/lang/Runnable;", "Lkotlin/k2;", "run", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidComposeView.this.removeCallbacks(this);
            MotionEvent motionEvent = AndroidComposeView.this.previousMotionEvent;
            if (motionEvent != null) {
                boolean z4 = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (z4) {
                    if (actionMasked == 10 || actionMasked == 1) {
                        return;
                    }
                } else if (actionMasked == 1) {
                    return;
                }
                int i4 = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i4 = 2;
                }
                AndroidComposeView androidComposeView = AndroidComposeView.this;
                androidComposeView.v1(motionEvent, i4, androidComposeView.relayoutTime, false);
            }
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/rotary/d;", "it", "", "a", "(Landroidx/compose/ui/input/rotary/d;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class o extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.input.rotary.d, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final o f19619b = new o(1);

        o() {
            super(1);
        }

        @fg.l
        public final Boolean a(@fg.l androidx.compose.ui.input.rotary.d dVar) {
            return Boolean.FALSE;
        }

        @Override // ld.l
        public Boolean invoke(androidx.compose.ui.input.rotary.d dVar) {
            return Boolean.FALSE;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "command", "b", "(Lld/a;)V"}, k = 3, mv = {1, 8, 0})
    static final class p extends kotlin.jvm.internal.n0 implements ld.l<ld.a<? extends kotlin.k2>, kotlin.k2> {
        p() {
            super(1);
        }

        public static void a(ld.a aVar) {
            aVar.invoke();
        }

        private static final void c(ld.a aVar) {
            aVar.invoke();
        }

        public final void b(@fg.l final ld.a<kotlin.k2> aVar) {
            Handler handler = AndroidComposeView.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                aVar.invoke();
                return;
            }
            Handler handler2 = AndroidComposeView.this.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: androidx.compose.ui.platform.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        ld.a.this.invoke();
                    }
                });
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(ld.a<? extends kotlin.k2> aVar) {
            b(aVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidComposeView", f = "AndroidComposeView.android.kt", i = {}, l = {428}, m = "textInputSession", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class q extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f19621b;

        /* renamed from: d, reason: collision with root package name */
        int f19623d;

        q(kotlin.coroutines.d<? super q> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f19621b = obj;
            this.f19623d |= Integer.MIN_VALUE;
            return AndroidComposeView.this.h(null, this);
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/r0;", "it", "Landroidx/compose/ui/platform/s0;", "a", "(Lkotlinx/coroutines/r0;)Landroidx/compose/ui/platform/s0;"}, k = 3, mv = {1, 8, 0})
    static final class r extends kotlin.jvm.internal.n0 implements ld.l<kotlinx.coroutines.r0, s0> {
        r() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s0 invoke(@fg.l kotlinx.coroutines.r0 r0Var) {
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            return new s0(androidComposeView, androidComposeView.getTextInputService(), r0Var);
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$c;", "a", "()Landroidx/compose/ui/platform/AndroidComposeView$c;"}, k = 3, mv = {1, 8, 0})
    static final class s extends kotlin.jvm.internal.n0 implements ld.a<c> {
        s() {
            super(0);
        }

        @fg.m
        public final c a() {
            return AndroidComposeView.this.X0();
        }

        @Override // ld.a
        public c invoke() {
            return AndroidComposeView.this.X0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidComposeView(@fg.l Context context, @fg.l kotlin.coroutines.g gVar) {
        super(context);
        androidx.compose.runtime.k2 g4;
        androidx.compose.runtime.k2 g5;
        int i4;
        this.coroutineContext = gVar;
        f.Companion companion = i0.f.INSTANCE;
        companion.getClass();
        this.lastDownPointerPosition = i0.f.f74149e;
        this.superclassInitComplete = true;
        this.sharedDrawScope = new androidx.compose.ui.node.j0(null, 1, 0 == true ? 1 : 0);
        this.density = androidx.compose.ui.unit.a.a(context);
        EmptySemanticsElement emptySemanticsElement = EmptySemanticsElement.f20277d;
        this.semanticsModifier = emptySemanticsElement;
        FocusOwnerImpl focusOwnerImpl = new FocusOwnerImpl(new h());
        this.focusOwner = focusOwnerImpl;
        DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener = new DragAndDropModifierOnDragListener(new g(this));
        this.dragAndDropModifierOnDragListener = dragAndDropModifierOnDragListener;
        this.dragAndDropManager = dragAndDropModifierOnDragListener;
        this._windowInfo = new e6();
        q.Companion companion2 = androidx.compose.ui.q.INSTANCE;
        androidx.compose.ui.q a5 = androidx.compose.ui.input.key.f.a(companion2, new i());
        this.keyInputModifier = a5;
        androidx.compose.ui.q b5 = androidx.compose.ui.input.rotary.a.b(companion2, o.f19619b);
        this.rotaryInputModifier = b5;
        this.canvasHolder = new androidx.compose.ui.graphics.w1();
        androidx.compose.ui.node.h0 h0Var = new androidx.compose.ui.node.h0(false, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        h0Var.t(androidx.compose.ui.layout.m1.f19031c);
        h0Var.g(this.density);
        companion2.getClass();
        h0Var.u(emptySemanticsElement.w3(b5).w3(focusOwnerImpl.getModifier()).w3(a5).w3(dragAndDropModifierOnDragListener.getModifier()));
        this.root = h0Var;
        this.rootForTest = this;
        this.semanticsOwner = new androidx.compose.ui.semantics.r(h0Var);
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.composeAccessibilityDelegate = androidComposeViewAccessibilityDelegateCompat;
        h0.a0 a0Var = new h0.a0();
        this.autofillTree = a0Var;
        this.dirtyLayers = new ArrayList();
        this.motionEventAdapter = new androidx.compose.ui.input.pointer.i();
        this.pointerInputEventProcessor = new androidx.compose.ui.input.pointer.f0(h0Var);
        this.configurationChangeObserver = f.f19608b;
        this._autofill = F0() ? new h0.f(this, a0Var) : null;
        this.clipboardManager = new androidx.compose.ui.platform.f(context);
        this.accessibilityManager = new androidx.compose.ui.platform.e(context);
        this.snapshotObserver = new androidx.compose.ui.node.r1(new p());
        this.measureAndLayoutDelegate = new androidx.compose.ui.node.t0(h0Var);
        this.viewConfiguration = new y0(ViewConfiguration.get(context));
        this.globalPosition = androidx.compose.ui.unit.r.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.tmpPositionArray = new int[]{0, 0};
        float[] c5 = androidx.compose.ui.graphics.y4.c(null, 1, null);
        this.tmpMatrix = c5;
        this.viewToWindowMatrix = androidx.compose.ui.graphics.y4.c(null, 1, null);
        this.windowToViewMatrix = androidx.compose.ui.graphics.y4.c(null, 1, null);
        this.lastMatrixRecalculationAnimationTime = -1L;
        companion.getClass();
        this.windowPosition = i0.f.f74148d;
        this.isRenderNodeCompatible = true;
        g4 = androidx.compose.runtime.t4.g(null, null, 2, null);
        this._viewTreeOwners = g4;
        this.viewTreeOwners = androidx.compose.runtime.o4.e(new s());
        this.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.j
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.o0(AndroidComposeView.this);
            }
        };
        this.scrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.k
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.m0(AndroidComposeView.this);
            }
        };
        this.touchModeChangeListener = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.l
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z4) {
                AndroidComposeView.E1(AndroidComposeView.this, z4);
            }
        };
        androidx.compose.ui.text.input.d1 d1Var = new androidx.compose.ui.text.input.d1(this, this);
        this.legacyTextInputServiceAndroid = d1Var;
        androidx.compose.ui.text.input.b1 b1Var = new androidx.compose.ui.text.input.b1(n0.f().invoke(d1Var));
        this.textInputService = b1Var;
        this.textInputSessionMutex = androidx.compose.ui.u.b();
        this.softwareKeyboardController = new k1(b1Var);
        this.fontLoader = new p0(context);
        this.fontFamilyResolver = androidx.compose.runtime.b.e(androidx.compose.ui.text.font.c0.a(context), androidx.compose.runtime.o4.t());
        this.currentFontWeightAdjustment = S0(context.getResources().getConfiguration());
        g5 = androidx.compose.runtime.t4.g(n0.e(context.getResources().getConfiguration()), null, 2, null);
        this.layoutDirection = g5;
        this.hapticFeedBack = new k0.c(this);
        if (isInTouchMode()) {
            l0.a.INSTANCE.getClass();
            i4 = l0.a.f81245c;
        } else {
            l0.a.INSTANCE.getClass();
            i4 = l0.a.f81246d;
        }
        this._inputModeManager = new l0.c(i4, new d(), null);
        this.modifierLocalManager = new androidx.compose.ui.modifier.h(this);
        this.textToolbar = new t0(this);
        this.layerCache = new c6<>();
        this.endApplyChangesListeners = new androidx.compose.runtime.collection.g<>(new ld.a[16], 0);
        this.resendMotionEventRunnable = new n();
        this.sendHoverExitEvent = new Runnable() { // from class: androidx.compose.ui.platform.m
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.t1(AndroidComposeView.this);
            }
        };
        this.resendMotionEventOnLayout = new m();
        int i5 = Build.VERSION.SDK_INT;
        this.matrixToWindow = i5 >= 29 ? new e1() : new c1(c5, null);
        setWillNotDraw(false);
        setFocusable(true);
        if (i5 >= 26) {
            m0.f19983a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        androidx.core.view.x1.H1(this, androidComposeViewAccessibilityDelegateCompat);
        ld.l<b6, kotlin.k2> a6 = b6.INSTANCE.a();
        if (a6 != null) {
            a6.invoke(this);
        }
        setOnDragListener(dragAndDropModifierOnDragListener);
        h0Var.H(this);
        if (i5 >= 29) {
            e0.f19817a.a(this);
        }
        this.pointerIconService = new k();
    }

    private void A1(androidx.compose.ui.unit.w wVar) {
        this.layoutDirection.setValue(wVar);
    }

    private final void C1(c cVar) {
        this._viewTreeOwners.setValue(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean D1(androidx.compose.ui.draganddrop.h transferData, long decorationSize, ld.l<? super androidx.compose.ui.graphics.drawscope.f, kotlin.k2> drawDragDecoration) {
        Resources resources = getContext().getResources();
        return f0.f19838a.a(this, transferData, new androidx.compose.ui.draganddrop.a(androidx.compose.ui.unit.f.a(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), decorationSize, drawDragDecoration, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0(int virtualViewId, AccessibilityNodeInfo info, String extraDataKey) {
        Integer num;
        if (kotlin.jvm.internal.l0.g(extraDataKey, this.composeAccessibilityDelegate.getExtraDataTestTraversalBeforeVal())) {
            Integer num2 = this.composeAccessibilityDelegate.t0().get(Integer.valueOf(virtualViewId));
            if (num2 != null) {
                info.getExtras().putInt(extraDataKey, num2.intValue());
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.l0.g(extraDataKey, this.composeAccessibilityDelegate.getExtraDataTestTraversalAfterVal()) || (num = this.composeAccessibilityDelegate.s0().get(Integer.valueOf(virtualViewId))) == null) {
            return;
        }
        info.getExtras().putInt(extraDataKey, num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E1(AndroidComposeView androidComposeView, boolean z4) {
        int i4;
        l0.c cVar = androidComposeView._inputModeManager;
        if (z4) {
            l0.a.INSTANCE.getClass();
            i4 = l0.a.f81245c;
        } else {
            l0.a.INSTANCE.getClass();
            i4 = l0.a.f81246d;
        }
        cVar.c(i4);
    }

    private final boolean F0() {
        return Build.VERSION.SDK_INT >= 26;
    }

    private final void F1() {
        getLocationOnScreen(this.tmpPositionArray);
        long j4 = this.globalPosition;
        int c5 = androidx.compose.ui.unit.q.c(j4);
        int i4 = (int) (j4 & 4294967295L);
        int[] iArr = this.tmpPositionArray;
        boolean z4 = false;
        int i5 = iArr[0];
        if (c5 != i5 || i4 != iArr[1]) {
            this.globalPosition = androidx.compose.ui.unit.r.a(i5, iArr[1]);
            if (c5 != Integer.MAX_VALUE && i4 != Integer.MAX_VALUE) {
                this.root.getLayoutDelegate().getMeasurePassDelegate().L1();
                z4 = true;
            }
        }
        this.measureAndLayoutDelegate.c(z4);
    }

    private final boolean H0(androidx.compose.ui.node.h0 h0Var) {
        androidx.compose.ui.node.h0 B0;
        return this.wasMeasuredWithMultipleConstraints || !((B0 = h0Var.B0()) == null || B0.c0());
    }

    private final void I0(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).h0();
            } else if (childAt instanceof ViewGroup) {
                I0((ViewGroup) childAt);
            }
        }
    }

    private final int J0(long j4) {
        return (int) kotlin.a2.h(j4 >>> 32);
    }

    private final int K0(long j4) {
        return (int) kotlin.a2.h(j4 & 4294967295L);
    }

    private final long L0(int measureSpec) {
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        if (mode == Integer.MIN_VALUE) {
            return j1(0, size);
        }
        if (mode == 0) {
            return j1(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return j1(size, size);
        }
        throw new IllegalStateException();
    }

    private final View N0(int accessibilityId, View currentView) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (kotlin.jvm.internal.l0.g(declaredMethod.invoke(currentView, null), Integer.valueOf(accessibilityId))) {
                return currentView;
            }
            if (currentView instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) currentView;
                int childCount = viewGroup.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View N0 = N0(accessibilityId, viewGroup.getChildAt(i4));
                    if (N0 != null) {
                        return N0;
                    }
                }
            }
        }
        return null;
    }

    @kotlin.k(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @kotlin.x0(expression = "fontFamilyResolver", imports = {}))
    public static /* synthetic */ void R() {
    }

    private final int S0(Configuration configuration) {
        int i4;
        if (Build.VERSION.SDK_INT < 31) {
            return 0;
        }
        i4 = configuration.fontWeightAdjustment;
        return i4;
    }

    @androidx.annotation.m1
    public static /* synthetic */ void U0() {
    }

    public static /* synthetic */ void V0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final c X0() {
        return (c) this._viewTreeOwners.getValue();
    }

    private static final void Y0(AndroidComposeView androidComposeView) {
        androidComposeView.F1();
    }

    private final int Z0(MotionEvent motionEvent) {
        removeCallbacks(this.resendMotionEventRunnable);
        try {
            l1(motionEvent);
            boolean z4 = true;
            this.forceUseMatrixCache = true;
            r(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.previousMotionEvent;
                boolean z5 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 != null && b1(motionEvent, motionEvent2)) {
                    if (f1(motionEvent2)) {
                        this.pointerInputEventProcessor.d();
                    } else if (motionEvent2.getActionMasked() != 10 && z5) {
                        w1(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                    }
                }
                if (motionEvent.getToolType(0) != 3) {
                    z4 = false;
                }
                if (!z5 && z4 && actionMasked != 3 && actionMasked != 9 && g1(motionEvent)) {
                    w1(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                int u12 = u1(motionEvent);
                Trace.endSection();
                return u12;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } finally {
            this.forceUseMatrixCache = false;
        }
    }

    private final boolean a1(MotionEvent event) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f4 = -event.getAxisValue(26);
        return this.focusOwner.k(new androidx.compose.ui.input.rotary.d(androidx.core.view.b2.k(viewConfiguration, getContext()) * f4, androidx.core.view.b2.f(viewConfiguration, getContext()) * f4, event.getEventTime(), event.getDeviceId()));
    }

    private final boolean b1(MotionEvent event, MotionEvent lastEvent) {
        return (lastEvent.getSource() == event.getSource() && lastEvent.getToolType(0) == event.getToolType(0)) ? false : true;
    }

    private final void c1(androidx.compose.ui.node.h0 node) {
        node.R0();
        androidx.compose.runtime.collection.g<androidx.compose.ui.node.h0> H0 = node.H0();
        int size = H0.getSize();
        if (size > 0) {
            androidx.compose.ui.node.h0[] L = H0.L();
            int i4 = 0;
            do {
                c1(L[i4]);
                i4++;
            } while (i4 < size);
        }
    }

    private final void d1(androidx.compose.ui.node.h0 node) {
        int i4 = 0;
        androidx.compose.ui.node.t0.K(this.measureAndLayoutDelegate, node, false, 2, null);
        androidx.compose.runtime.collection.g<androidx.compose.ui.node.h0> H0 = node.H0();
        int size = H0.getSize();
        if (size > 0) {
            androidx.compose.ui.node.h0[] L = H0.L();
            do {
                d1(L[i4]);
                i4++;
            } while (i4 < size);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082 A[LOOP:0: B:20:0x004c->B:35:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[EDGE_INSN: B:36:0x0085->B:39:0x0085 BREAK  A[LOOP:0: B:20:0x004c->B:35:0x0082], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean e1(android.view.MotionEvent r7) {
        /*
            r6 = this;
            float r0 = r7.getX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r7.getY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r7.getRawX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r7.getRawY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            r0 = r2
            goto L45
        L44:
            r0 = r3
        L45:
            if (r0 != 0) goto L85
            int r1 = r7.getPointerCount()
            r4 = r3
        L4c:
            if (r4 >= r1) goto L85
            float r0 = r7.getX(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            float r0 = r7.getY(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r0 < r5) goto L7d
            androidx.compose.ui.platform.g2 r0 = androidx.compose.ui.platform.g2.f19876a
            boolean r0 = r0.a(r7, r4)
            if (r0 != 0) goto L7d
            goto L7f
        L7d:
            r0 = r2
            goto L80
        L7f:
            r0 = r3
        L80:
            if (r0 != 0) goto L85
            int r4 = r4 + 1
            goto L4c
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.e1(android.view.MotionEvent):boolean");
    }

    private final boolean f1(MotionEvent event) {
        int actionMasked;
        return event.getButtonState() != 0 || (actionMasked = event.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    private final boolean g1(MotionEvent motionEvent) {
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        return 0.0f <= x4 && x4 <= ((float) getWidth()) && 0.0f <= y4 && y4 <= ((float) getHeight());
    }

    private final boolean h1(MotionEvent event) {
        MotionEvent motionEvent;
        return (event.getPointerCount() == 1 && (motionEvent = this.previousMotionEvent) != null && motionEvent.getPointerCount() == event.getPointerCount() && event.getRawX() == motionEvent.getRawX() && event.getRawY() == motionEvent.getRawY()) ? false : true;
    }

    private final long j1(int a5, int b5) {
        return b5 | (kotlin.a2.h(a5) << 32);
    }

    private final void k1() {
        if (this.forceUseMatrixCache) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = currentAnimationTimeMillis;
            m1();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.tmpPositionArray);
            int[] iArr = this.tmpPositionArray;
            float f4 = iArr[0];
            float f5 = iArr[1];
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.tmpPositionArray;
            this.windowPosition = i0.g.a(f4 - iArr2[0], f5 - iArr2[1]);
        }
    }

    private final void l1(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        m1();
        long j4 = androidx.compose.ui.graphics.y4.j(this.viewToWindowMatrix, i0.g.a(motionEvent.getX(), motionEvent.getY()));
        this.windowPosition = i0.g.a(motionEvent.getRawX() - i0.f.p(j4), motionEvent.getRawY() - i0.f.r(j4));
    }

    public static void m0(AndroidComposeView androidComposeView) {
        androidComposeView.F1();
    }

    private final void m1() {
        this.matrixToWindow.a(this, this.viewToWindowMatrix);
        c2.a(this.viewToWindowMatrix, this.windowToViewMatrix);
    }

    public static void o0(AndroidComposeView androidComposeView) {
        androidComposeView.F1();
    }

    private final void q1(androidx.compose.ui.node.h0 nodeToRemeasure) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (nodeToRemeasure != null) {
            while (nodeToRemeasure != null && nodeToRemeasure.t0() == h0.g.InMeasureBlock && H0(nodeToRemeasure)) {
                nodeToRemeasure = nodeToRemeasure.B0();
            }
            if (nodeToRemeasure == this.root) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    static /* synthetic */ void r1(AndroidComposeView androidComposeView, androidx.compose.ui.node.h0 h0Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            h0Var = null;
        }
        androidComposeView.q1(h0Var);
    }

    private static final void s1(AndroidComposeView androidComposeView) {
        androidComposeView.F1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t1(AndroidComposeView androidComposeView) {
        androidComposeView.hoverExitReceived = false;
        MotionEvent motionEvent = androidComposeView.previousMotionEvent;
        kotlin.jvm.internal.l0.m(motionEvent);
        if (motionEvent.getActionMasked() != 10) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
        }
        androidComposeView.u1(motionEvent);
    }

    private final int u1(MotionEvent motionEvent) {
        androidx.compose.ui.input.pointer.e0 e0Var;
        if (this.keyboardModifiersRequireUpdate) {
            this.keyboardModifiersRequireUpdate = false;
            this._windowInfo.e(motionEvent.getMetaState());
        }
        androidx.compose.ui.input.pointer.d0 c5 = this.motionEventAdapter.c(motionEvent, this);
        if (c5 == null) {
            this.pointerInputEventProcessor.d();
            return androidx.compose.ui.input.pointer.g0.a(false, false);
        }
        List<androidx.compose.ui.input.pointer.e0> b5 = c5.b();
        int size = b5.size() - 1;
        if (size >= 0) {
            while (true) {
                int i4 = size - 1;
                e0Var = b5.get(size);
                if (e0Var.n()) {
                    break;
                }
                if (i4 < 0) {
                    break;
                }
                size = i4;
            }
        }
        e0Var = null;
        androidx.compose.ui.input.pointer.e0 e0Var2 = e0Var;
        if (e0Var2 != null) {
            this.lastDownPointerPosition = e0Var2.s();
        }
        int b6 = this.pointerInputEventProcessor.b(c5, this, g1(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || androidx.compose.ui.input.pointer.s0.f(b6)) {
            return b6;
        }
        this.motionEventAdapter.e(motionEvent.getPointerId(motionEvent.getActionIndex()));
        return b6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v1(MotionEvent motionEvent, int action, long eventTime, boolean forceHover) {
        int actionMasked = motionEvent.getActionMasked();
        int i4 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i4 = motionEvent.getActionIndex();
            }
        } else if (action != 9 && action != 10) {
            i4 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i4 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i5 = 0; i5 < pointerCount; i5++) {
            pointerPropertiesArr[i5] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i6 = 0; i6 < pointerCount; i6++) {
            pointerCoordsArr[i6] = new MotionEvent.PointerCoords();
        }
        int i7 = 0;
        while (i7 < pointerCount) {
            int i10 = ((i4 < 0 || i7 < i4) ? 0 : 1) + i7;
            motionEvent.getPointerProperties(i10, pointerPropertiesArr[i7]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i7];
            motionEvent.getPointerCoords(i10, pointerCoords);
            long e02 = e0(i0.g.a(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = i0.f.p(e02);
            pointerCoords.y = i0.f.r(e02);
            i7++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? eventTime : motionEvent.getDownTime(), eventTime, action, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), forceHover ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        androidx.compose.ui.input.pointer.d0 c5 = this.motionEventAdapter.c(obtain, this);
        kotlin.jvm.internal.l0.m(c5);
        this.pointerInputEventProcessor.b(c5, this, true);
        obtain.recycle();
    }

    static /* synthetic */ void w1(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i4, long j4, boolean z4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            z4 = true;
        }
        androidComposeView.v1(motionEvent, i4, j4, z4);
    }

    private void y1(y.b bVar) {
        this.fontFamilyResolver.setValue(bVar);
    }

    @Override // androidx.compose.ui.node.p1
    public void A(@fg.l androidx.compose.ui.node.h0 layoutNode) {
        this.composeAccessibilityDelegate.U0(layoutNode);
    }

    @Override // androidx.compose.ui.node.p1
    public void B(boolean z4) {
        this.showLayoutBounds = z4;
    }

    public final void B1(@fg.l ld.l<? super c, kotlin.k2> callback) {
        c W0 = W0();
        if (W0 != null) {
            callback.invoke(W0);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.onViewTreeOwnersAvailable = callback;
    }

    @Override // androidx.compose.ui.node.p1
    @fg.l
    public i1.a C() {
        return androidx.compose.ui.layout.j1.b(this);
    }

    @Override // androidx.compose.ui.node.p1
    public b D() {
        return this.accessibilityManager;
    }

    public final void D0(@fg.l androidx.compose.ui.viewinterop.c view, @fg.l androidx.compose.ui.node.h0 layoutNode) {
        P0().b().put(view, layoutNode);
        P0().addView(view);
        P0().c().put(layoutNode, view);
        androidx.core.view.x1.Z1(view, 1);
        androidx.core.view.x1.H1(view, new e(layoutNode, this));
    }

    @Override // androidx.compose.ui.node.p1
    public void E(@fg.l androidx.compose.ui.node.h0 layoutNode, boolean affectsLookahead) {
        this.measureAndLayoutDelegate.g(layoutNode, affectsLookahead);
    }

    @Override // androidx.compose.ui.node.p1
    public void G(@fg.l p1.b listener) {
        this.measureAndLayoutDelegate.x(listener);
        r1(this, null, 1, null);
    }

    @fg.m
    public final Object G0(@fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object R = this.composeAccessibilityDelegate.R(dVar);
        return R == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? R : kotlin.k2.f75408a;
    }

    @Override // androidx.compose.ui.node.p1
    @fg.m
    public h0.j H() {
        return this._autofill;
    }

    @Override // androidx.compose.ui.node.p1
    @fg.l
    public l0.b I() {
        return this._inputModeManager;
    }

    @Override // androidx.compose.ui.node.p1
    @fg.l
    /* renamed from: J, reason: from getter */
    public androidx.compose.ui.node.r1 getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.ui.node.p1
    @fg.l
    public y.b K() {
        return (y.b) this.fontFamilyResolver.getValue();
    }

    @Override // androidx.compose.ui.node.p1
    public long L() {
        return this.measureAndLayoutDelegate.o();
    }

    @Override // androidx.compose.ui.node.p1
    @fg.l
    /* renamed from: M, reason: from getter */
    public androidx.compose.ui.modifier.h getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    public final void M0(@fg.l androidx.compose.ui.viewinterop.c view, @fg.l Canvas canvas) {
        P0().getClass();
        view.draw(canvas);
    }

    @Override // androidx.compose.ui.node.p1
    @fg.l
    /* renamed from: N, reason: from getter */
    public i5 getTextToolbar() {
        return this.textToolbar;
    }

    @Override // androidx.compose.ui.node.p1
    @fg.l
    public androidx.compose.ui.node.o1 O(@fg.l ld.l<? super androidx.compose.ui.graphics.v1, kotlin.k2> drawBlock, @fg.l ld.a<kotlin.k2> invalidateParentLayer) {
        androidx.compose.ui.node.o1 c5 = this.layerCache.c();
        if (c5 != null) {
            c5.b(drawBlock, invalidateParentLayer);
            return c5;
        }
        if (isHardwareAccelerated() && this.isRenderNodeCompatible) {
            try {
                return new y4(this, drawBlock, invalidateParentLayer);
            } catch (Throwable unused) {
                this.isRenderNodeCompatible = false;
            }
        }
        if (this.viewLayersContainer == null) {
            t5.Companion companion = t5.INSTANCE;
            companion.getClass();
            if (!t5.f20147w) {
                companion.e(new View(getContext()));
            }
            companion.getClass();
            q1 q1Var = t5.f20148x ? new q1(getContext()) : new u5(getContext());
            this.viewLayersContainer = q1Var;
            addView(q1Var);
        }
        q1 q1Var2 = this.viewLayersContainer;
        kotlin.jvm.internal.l0.m(q1Var2);
        return new t5(this, q1Var2, drawBlock, invalidateParentLayer);
    }

    @fg.l
    /* renamed from: O0, reason: from getter */
    public androidx.compose.ui.platform.e getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // androidx.compose.ui.node.p1
    @fg.l
    /* renamed from: P, reason: from getter */
    public androidx.compose.ui.node.x1 getRootForTest() {
        return this.rootForTest;
    }

    @fg.l
    public final z0 P0() {
        if (this._androidViewsHandler == null) {
            z0 z0Var = new z0(getContext());
            this._androidViewsHandler = z0Var;
            addView(z0Var);
        }
        z0 z0Var2 = this._androidViewsHandler;
        kotlin.jvm.internal.l0.m(z0Var2);
        return z0Var2;
    }

    @Override // androidx.compose.ui.node.p1
    @fg.m
    public androidx.compose.ui.focus.f Q(@fg.l KeyEvent keyEvent) {
        boolean E4;
        boolean E42;
        boolean E43;
        boolean E44;
        int i4;
        long a5 = androidx.compose.ui.input.key.e.a(keyEvent);
        b.Companion companion = androidx.compose.ui.input.key.b.INSTANCE;
        companion.getClass();
        if (androidx.compose.ui.input.key.b.E4(a5, androidx.compose.ui.input.key.b.B0)) {
            if (keyEvent.isShiftPressed()) {
                androidx.compose.ui.focus.f.INSTANCE.getClass();
                i4 = androidx.compose.ui.focus.f.f17527d;
            } else {
                androidx.compose.ui.focus.f.INSTANCE.getClass();
                i4 = androidx.compose.ui.focus.f.f17526c;
            }
            return androidx.compose.ui.focus.f.i(i4);
        }
        companion.getClass();
        if (androidx.compose.ui.input.key.b.E4(a5, androidx.compose.ui.input.key.b.f18621v)) {
            androidx.compose.ui.focus.f.INSTANCE.getClass();
            return androidx.compose.ui.focus.f.i(androidx.compose.ui.focus.f.f17529f);
        }
        companion.getClass();
        if (androidx.compose.ui.input.key.b.E4(a5, androidx.compose.ui.input.key.b.f18616u)) {
            androidx.compose.ui.focus.f.INSTANCE.getClass();
            return androidx.compose.ui.focus.f.i(androidx.compose.ui.focus.f.f17528e);
        }
        companion.getClass();
        boolean z4 = true;
        if (androidx.compose.ui.input.key.b.E4(a5, androidx.compose.ui.input.key.b.f18606s)) {
            E4 = true;
        } else {
            companion.getClass();
            E4 = androidx.compose.ui.input.key.b.E4(a5, androidx.compose.ui.input.key.b.f18583n1);
        }
        if (E4) {
            androidx.compose.ui.focus.f.INSTANCE.getClass();
            return androidx.compose.ui.focus.f.i(androidx.compose.ui.focus.f.f17530g);
        }
        companion.getClass();
        if (androidx.compose.ui.input.key.b.E4(a5, androidx.compose.ui.input.key.b.f18611t)) {
            E42 = true;
        } else {
            companion.getClass();
            E42 = androidx.compose.ui.input.key.b.E4(a5, androidx.compose.ui.input.key.b.f18588o1);
        }
        if (E42) {
            androidx.compose.ui.focus.f.INSTANCE.getClass();
            return androidx.compose.ui.focus.f.i(androidx.compose.ui.focus.f.f17531h);
        }
        companion.getClass();
        if (androidx.compose.ui.input.key.b.E4(a5, androidx.compose.ui.input.key.b.f18626w)) {
            E43 = true;
        } else {
            companion.getClass();
            E43 = androidx.compose.ui.input.key.b.E4(a5, androidx.compose.ui.input.key.b.G0);
        }
        if (E43) {
            E44 = true;
        } else {
            companion.getClass();
            E44 = androidx.compose.ui.input.key.b.E4(a5, androidx.compose.ui.input.key.b.A2);
        }
        if (E44) {
            androidx.compose.ui.focus.f.INSTANCE.getClass();
            return androidx.compose.ui.focus.f.i(androidx.compose.ui.focus.f.f17532i);
        }
        companion.getClass();
        if (!androidx.compose.ui.input.key.b.E4(a5, androidx.compose.ui.input.key.b.f18546g)) {
            companion.getClass();
            z4 = androidx.compose.ui.input.key.b.E4(a5, androidx.compose.ui.input.key.b.J0);
        }
        if (!z4) {
            return null;
        }
        androidx.compose.ui.focus.f.INSTANCE.getClass();
        return androidx.compose.ui.focus.f.i(androidx.compose.ui.focus.f.f17533j);
    }

    @fg.l
    /* renamed from: Q0, reason: from getter */
    public androidx.compose.ui.platform.f getClipboardManager() {
        return this.clipboardManager;
    }

    @fg.l
    public final ld.l<Configuration, kotlin.k2> R0() {
        return this.configurationChangeObserver;
    }

    @Override // androidx.compose.ui.node.p1
    @fg.l
    /* renamed from: S, reason: from getter */
    public x.b getFontLoader() {
        return this.fontLoader;
    }

    @Override // androidx.compose.ui.node.p1
    public void T(@fg.l androidx.compose.ui.node.h0 node) {
    }

    /* renamed from: T0, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    @Override // androidx.compose.ui.node.p1
    @fg.l
    /* renamed from: U, reason: from getter */
    public androidx.compose.ui.draganddrop.c getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    @Override // androidx.compose.ui.node.p1
    public void V(@fg.l androidx.compose.ui.node.h0 layoutNode, long constraints) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.measureAndLayoutDelegate.r(layoutNode, constraints);
            if (!this.measureAndLayoutDelegate.k()) {
                androidx.compose.ui.node.t0.d(this.measureAndLayoutDelegate, false, 1, null);
            }
            kotlin.k2 k2Var = kotlin.k2.f75408a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.compose.ui.node.p1
    @fg.l
    /* renamed from: W, reason: from getter */
    public g5 getSoftwareKeyboardController() {
        return this.softwareKeyboardController;
    }

    @fg.m
    public final c W0() {
        return (c) this.viewTreeOwners.getValue();
    }

    @Override // androidx.compose.ui.node.p1
    public long X(long positionInWindow) {
        k1();
        return androidx.compose.ui.graphics.y4.j(this.windowToViewMatrix, positionInWindow);
    }

    @Override // androidx.compose.ui.node.p1
    public void Y(@fg.l androidx.compose.ui.node.h0 layoutNode, boolean affectsLookahead, boolean forceRequest, boolean scheduleMeasureAndLayout) {
        if (affectsLookahead) {
            if (this.measureAndLayoutDelegate.E(layoutNode, forceRequest) && scheduleMeasureAndLayout) {
                q1(layoutNode);
                return;
            }
            return;
        }
        if (this.measureAndLayoutDelegate.J(layoutNode, forceRequest) && scheduleMeasureAndLayout) {
            q1(layoutNode);
        }
    }

    @Override // androidx.compose.ui.node.p1, androidx.compose.ui.node.x1
    @fg.l
    /* renamed from: a, reason: from getter */
    public androidx.compose.ui.text.input.b1 getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.ui.node.p1
    public void a0(@fg.l androidx.compose.ui.node.h0 node) {
        this.measureAndLayoutDelegate.u(node);
        this.observationClearRequested = true;
    }

    @Override // android.view.View
    public void autofill(@fg.l SparseArray<AutofillValue> values) {
        h0.f fVar;
        if (!F0() || (fVar = this._autofill) == null) {
            return;
        }
        h0.i.a(fVar, values);
    }

    @Override // androidx.compose.ui.node.p1, androidx.compose.ui.node.x1
    @fg.l
    /* renamed from: b, reason: from getter */
    public androidx.compose.ui.unit.d getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.node.p1
    @fg.l
    /* renamed from: b0, reason: from getter */
    public androidx.compose.ui.node.j0 getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // androidx.compose.ui.node.p1
    public f1 c0() {
        return this.clipboardManager;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int direction) {
        return this.composeAccessibilityDelegate.U(false, direction, this.lastDownPointerPosition);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int direction) {
        return this.composeAccessibilityDelegate.U(true, direction, this.lastDownPointerPosition);
    }

    @Override // androidx.compose.ui.node.p1
    @fg.l
    /* renamed from: d, reason: from getter */
    public s5 getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Override // androidx.compose.ui.node.p1
    @fg.l
    public d6 d0() {
        return this._windowInfo;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@fg.l Canvas canvas) {
        if (!isAttachedToWindow()) {
            c1(this.root);
        }
        androidx.compose.ui.node.p1.s(this, false, 1, null);
        androidx.compose.runtime.snapshots.m.INSTANCE.q();
        this.isDrawingContent = true;
        androidx.compose.ui.graphics.w1 w1Var = this.canvasHolder;
        Canvas internalCanvas = w1Var.getAndroidCanvas().getInternalCanvas();
        w1Var.getAndroidCanvas().U(canvas);
        this.root.O(w1Var.getAndroidCanvas());
        w1Var.getAndroidCanvas().U(internalCanvas);
        if (!this.dirtyLayers.isEmpty()) {
            int size = this.dirtyLayers.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.dirtyLayers.get(i4).n();
            }
        }
        t5.INSTANCE.getClass();
        if (t5.f20148x) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.dirtyLayers.clear();
        this.isDrawingContent = false;
        List<androidx.compose.ui.node.o1> list = this.postponedDirtyLayers;
        if (list != null) {
            kotlin.jvm.internal.l0.m(list);
            this.dirtyLayers.addAll(list);
            list.clear();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(@fg.l MotionEvent event) {
        return event.getActionMasked() == 8 ? event.isFromSource(4194304) ? a1(event) : (e1(event) || !isAttachedToWindow()) ? super.dispatchGenericMotionEvent(event) : androidx.compose.ui.input.pointer.s0.f(Z0(event)) : super.dispatchGenericMotionEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(@fg.l MotionEvent event) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            this.sendHoverExitEvent.run();
        }
        if (e1(event) || !isAttachedToWindow()) {
            return false;
        }
        this.composeAccessibilityDelegate.c0(event);
        int actionMasked = event.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && g1(event)) {
                if (event.getToolType(0) == 3 && event.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent = this.previousMotionEvent;
                if (motionEvent != null) {
                    motionEvent.recycle();
                }
                this.previousMotionEvent = MotionEvent.obtainNoHistory(event);
                this.hoverExitReceived = true;
                post(this.sendHoverExitEvent);
                return false;
            }
        } else if (!h1(event)) {
            return false;
        }
        return androidx.compose.ui.input.pointer.s0.f(Z0(event));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@fg.l KeyEvent event) {
        if (!isFocused()) {
            return super.dispatchKeyEvent(event);
        }
        this._windowInfo.e(event.getMetaState());
        return this.focusOwner.p(event) || super.dispatchKeyEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(@fg.l KeyEvent event) {
        return (isFocused() && this.focusOwner.h(event)) || super.dispatchKeyEventPreIme(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@fg.l MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            MotionEvent motionEvent2 = this.previousMotionEvent;
            kotlin.jvm.internal.l0.m(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || b1(motionEvent, motionEvent2)) {
                this.sendHoverExitEvent.run();
            } else {
                this.hoverExitReceived = false;
            }
        }
        if (e1(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !h1(motionEvent)) {
            return false;
        }
        int Z0 = Z0(motionEvent);
        if (androidx.compose.ui.input.pointer.s0.e(Z0)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return androidx.compose.ui.input.pointer.s0.f(Z0);
    }

    @Override // androidx.compose.ui.input.pointer.r0
    public void e(@fg.l float[] localTransform) {
        k1();
        androidx.compose.ui.graphics.y4.u(localTransform, this.viewToWindowMatrix);
        n0.i(localTransform, i0.f.p(this.windowPosition), i0.f.r(this.windowPosition), this.tmpMatrix);
    }

    @Override // androidx.compose.ui.input.pointer.r0
    public long e0(long localPosition) {
        k1();
        long j4 = androidx.compose.ui.graphics.y4.j(this.viewToWindowMatrix, localPosition);
        return i0.g.a(i0.f.p(this.windowPosition) + i0.f.p(j4), i0.f.r(this.windowPosition) + i0.f.r(j4));
    }

    @Override // androidx.compose.ui.node.p1
    @fg.l
    /* renamed from: f0, reason: from getter */
    public k0.a getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    @fg.m
    public final View findViewByAccessibilityIdTraversal(int accessibilityId) {
        View view = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(accessibilityId));
                if (invoke instanceof View) {
                    view = (View) invoke;
                }
            } else {
                view = N0(accessibilityId, this);
            }
        } catch (NoSuchMethodException unused) {
        }
        return view;
    }

    @Override // androidx.compose.ui.node.x1
    public void g() {
        androidx.compose.ui.node.p1.s(this, false, 1, null);
    }

    @Override // androidx.compose.ui.node.p1
    public void g0(@fg.l ld.a<kotlin.k2> listener) {
        if (this.endApplyChangesListeners.n(listener)) {
            return;
        }
        this.endApplyChangesListeners.b(listener);
    }

    @Override // android.view.View
    public void getFocusedRect(@fg.l Rect rect) {
        kotlin.k2 k2Var;
        i0.i m4 = this.focusOwner.m();
        if (m4 != null) {
            rect.left = kotlin.math.b.L0(m4.t());
            rect.top = kotlin.math.b.L0(m4.getTop());
            rect.right = kotlin.math.b.L0(m4.x());
            rect.bottom = kotlin.math.b.L0(m4.j());
            k2Var = kotlin.k2.f75408a;
        } else {
            k2Var = null;
        }
        if (k2Var == null) {
            super.getFocusedRect(rect);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.p1
    @fg.l
    public androidx.compose.ui.unit.w getLayoutDirection() {
        return (androidx.compose.ui.unit.w) this.layoutDirection.getValue();
    }

    @Override // androidx.compose.ui.node.p1
    @fg.l
    public androidx.compose.ui.node.h0 getRoot() {
        return this.root;
    }

    @Override // androidx.compose.ui.platform.b6
    @fg.l
    public View getView() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.compose.ui.platform.p2
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(@fg.l ld.p<? super androidx.compose.ui.platform.q2, ? super kotlin.coroutines.d<?>, ? extends java.lang.Object> r5, @fg.l kotlin.coroutines.d<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.platform.AndroidComposeView.q
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.AndroidComposeView$q r0 = (androidx.compose.ui.platform.AndroidComposeView.q) r0
            int r1 = r0.f19623d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19623d = r1
            goto L18
        L13:
            androidx.compose.ui.platform.AndroidComposeView$q r0 = new androidx.compose.ui.platform.AndroidComposeView$q
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19621b
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f19623d
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            kotlin.a1.n(r6)
            goto L42
        L2f:
            kotlin.a1.n(r6)
            java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.u$a<java.lang.Object>> r6 = r4.textInputSessionMutex
            androidx.compose.ui.platform.AndroidComposeView$r r2 = new androidx.compose.ui.platform.AndroidComposeView$r
            r2.<init>()
            r0.f19623d = r3
            java.lang.Object r5 = androidx.compose.ui.u.j(r6, r2, r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.h(ld.p, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.node.p1
    public void h0() {
        if (this.observationClearRequested) {
            this.snapshotObserver.b();
            this.observationClearRequested = false;
        }
        z0 z0Var = this._androidViewsHandler;
        if (z0Var != null) {
            I0(z0Var);
        }
        while (this.endApplyChangesListeners.V()) {
            int size = this.endApplyChangesListeners.getSize();
            for (int i4 = 0; i4 < size; i4++) {
                ld.a<kotlin.k2> aVar = this.endApplyChangesListeners.L()[i4];
                this.endApplyChangesListeners.s0(i4, null);
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.endApplyChangesListeners.p0(0, size);
        }
    }

    @Override // androidx.compose.ui.platform.b6
    public boolean i() {
        InterfaceC1423e0 lifecycleOwner;
        AbstractC1450w lifecycle;
        c W0 = W0();
        return ((W0 == null || (lifecycleOwner = W0.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getState()) == AbstractC1450w.b.RESUMED;
    }

    @Override // androidx.compose.ui.node.p1
    public void i0() {
        this.composeAccessibilityDelegate.V0();
    }

    public final void i1(@fg.l androidx.compose.ui.node.o1 layer, boolean isDirty) {
        if (!isDirty) {
            if (this.isDrawingContent) {
                return;
            }
            this.dirtyLayers.remove(layer);
            List<androidx.compose.ui.node.o1> list = this.postponedDirtyLayers;
            if (list != null) {
                list.remove(layer);
                return;
            }
            return;
        }
        if (!this.isDrawingContent) {
            this.dirtyLayers.add(layer);
            return;
        }
        List list2 = this.postponedDirtyLayers;
        if (list2 == null) {
            list2 = new ArrayList();
            this.postponedDirtyLayers = list2;
        }
        list2.add(layer);
    }

    @Override // androidx.compose.ui.node.x1
    @fg.l
    /* renamed from: j, reason: from getter */
    public androidx.compose.ui.semantics.r getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // androidx.compose.ui.node.p1
    @fg.l
    /* renamed from: j0, reason: from getter */
    public h0.a0 getAutofillTree() {
        return this.autofillTree;
    }

    @Override // androidx.compose.ui.input.pointer.r0
    public long k(long positionOnScreen) {
        k1();
        return androidx.compose.ui.graphics.y4.j(this.windowToViewMatrix, i0.g.a(i0.f.p(positionOnScreen) - i0.f.p(this.windowPosition), i0.f.r(positionOnScreen) - i0.f.r(this.windowPosition)));
    }

    @Override // androidx.view.InterfaceC1436l
    public void l(@fg.l InterfaceC1423e0 owner) {
        this.showLayoutBounds = INSTANCE.b();
    }

    @Override // androidx.compose.ui.node.p1
    /* renamed from: l0, reason: from getter */
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // androidx.compose.ui.node.x1
    public boolean m(@fg.l KeyEvent keyEvent) {
        return this.focusOwner.h(keyEvent) || this.focusOwner.p(keyEvent);
    }

    public final boolean n1(@fg.l androidx.compose.ui.node.o1 layer) {
        if (this.viewLayersContainer != null) {
            t5.INSTANCE.getClass();
            boolean unused = t5.f20148x;
        }
        this.layerCache.d(layer);
        return true;
    }

    @Override // androidx.compose.ui.platform.b6
    public void o() {
        c1(this.root);
    }

    public final void o1(@fg.l androidx.compose.ui.viewinterop.c view) {
        g0(new l(view));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        InterfaceC1423e0 lifecycleOwner;
        AbstractC1450w lifecycle;
        int i4;
        h0.f fVar;
        super.onAttachedToWindow();
        d1(this.root);
        c1(this.root);
        this.snapshotObserver.k();
        if (F0() && (fVar = this._autofill) != null) {
            h0.y.f73926a.a(fVar);
        }
        InterfaceC1423e0 a5 = C1442q1.a(this);
        InterfaceC1461e a6 = C1463g.a(this);
        c W0 = W0();
        if (W0 == null || (a5 != null && a6 != null && (a5 != W0.getLifecycleOwner() || a6 != W0.getLifecycleOwner()))) {
            if (a5 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (a6 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (W0 != null && (lifecycleOwner = W0.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.d(this);
            }
            a5.getLifecycle().a(this);
            c cVar = new c(a5, a6);
            C1(cVar);
            ld.l<? super c, kotlin.k2> lVar = this.onViewTreeOwnersAvailable;
            if (lVar != null) {
                lVar.invoke(cVar);
            }
            this.onViewTreeOwnersAvailable = null;
        }
        l0.c cVar2 = this._inputModeManager;
        if (isInTouchMode()) {
            l0.a.INSTANCE.getClass();
            i4 = l0.a.f81245c;
        } else {
            l0.a.INSTANCE.getClass();
            i4 = l0.a.f81246d;
        }
        cVar2.c(i4);
        c W02 = W0();
        kotlin.jvm.internal.l0.m(W02);
        W02.getLifecycleOwner().getLifecycle().a(this);
        c W03 = W0();
        kotlin.jvm.internal.l0.m(W03);
        W03.getLifecycleOwner().getLifecycle().a(this.composeAccessibilityDelegate);
        getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().addOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().addOnTouchModeChangeListener(this.touchModeChangeListener);
        if (Build.VERSION.SDK_INT >= 31) {
            i0.f19935a.b(this, androidx.compose.ui.platform.i.a(new a()));
        }
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        s0 s0Var = (s0) androidx.compose.ui.u.f(this.textInputSessionMutex);
        return s0Var == null ? this.legacyTextInputServiceAndroid.getEditorHasFocus() : s0Var.e();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(@fg.l Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.density = androidx.compose.ui.unit.a.a(getContext());
        if (S0(newConfig) != this.currentFontWeightAdjustment) {
            this.currentFontWeightAdjustment = S0(newConfig);
            y1(androidx.compose.ui.text.font.c0.a(getContext()));
        }
        this.configurationChangeObserver.invoke(newConfig);
    }

    @Override // android.view.View
    @fg.m
    public InputConnection onCreateInputConnection(@fg.l EditorInfo outAttrs) {
        s0 s0Var = (s0) androidx.compose.ui.u.f(this.textInputSessionMutex);
        return s0Var == null ? this.legacyTextInputServiceAndroid.o(outAttrs) : s0Var.d(outAttrs);
    }

    @Override // android.view.View
    @androidx.annotation.x0(31)
    public void onCreateVirtualViewTranslationRequests(@fg.l long[] virtualIds, @fg.l int[] supportedFormats, @fg.l Consumer<ViewTranslationRequest> requestsCollector) {
        this.composeAccessibilityDelegate.S0(virtualIds, supportedFormats, requestsCollector);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        h0.f fVar;
        InterfaceC1423e0 lifecycleOwner;
        AbstractC1450w lifecycle;
        InterfaceC1423e0 lifecycleOwner2;
        AbstractC1450w lifecycle2;
        super.onDetachedFromWindow();
        this.snapshotObserver.l();
        c W0 = W0();
        if (W0 != null && (lifecycleOwner2 = W0.getLifecycleOwner()) != null && (lifecycle2 = lifecycleOwner2.getLifecycle()) != null) {
            lifecycle2.d(this);
        }
        c W02 = W0();
        if (W02 != null && (lifecycleOwner = W02.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.d(this.composeAccessibilityDelegate);
        }
        if (F0() && (fVar = this._autofill) != null) {
            h0.y.f73926a.b(fVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.touchModeChangeListener);
        if (Build.VERSION.SDK_INT >= 31) {
            i0.f19935a.a(this);
        }
    }

    @Override // android.view.View
    protected void onDraw(@fg.l Canvas canvas) {
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean gainFocus, int direction, @fg.m Rect previouslyFocusedRect) {
        androidx.compose.runtime.collection.g gVar;
        boolean z4;
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        androidx.compose.ui.focus.o0 focusTransactionManager = this.focusOwner.getFocusTransactionManager();
        j jVar = new j(gainFocus, this);
        gVar = focusTransactionManager.cancellationListener;
        gVar.b(jVar);
        z4 = focusTransactionManager.ongoingTransaction;
        if (z4) {
            if (gainFocus) {
                this.focusOwner.d();
                return;
            } else {
                this.focusOwner.n();
                return;
            }
        }
        try {
            androidx.compose.ui.focus.o0.a(focusTransactionManager);
            if (gainFocus) {
                this.focusOwner.d();
            } else {
                this.focusOwner.n();
            }
            kotlin.k2 k2Var = kotlin.k2.f75408a;
            focusTransactionManager.h();
        } catch (Throwable th) {
            focusTransactionManager.h();
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l4, int t4, int r4, int b5) {
        this.measureAndLayoutDelegate.p(this.resendMotionEventOnLayout);
        this.onMeasureConstraints = null;
        F1();
        if (this._androidViewsHandler != null) {
            P0().layout(0, 0, r4 - l4, b5 - t4);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                d1(this.root);
            }
            long L0 = L0(widthMeasureSpec);
            long L02 = L0(heightMeasureSpec);
            long a5 = androidx.compose.ui.unit.c.a((int) kotlin.a2.h(L0 >>> 32), (int) (L0 & 4294967295L), (int) (L02 >>> 32), (int) (4294967295L & L02));
            androidx.compose.ui.unit.b bVar = this.onMeasureConstraints;
            boolean z4 = false;
            if (bVar == null) {
                this.onMeasureConstraints = androidx.compose.ui.unit.b.b(a5);
                this.wasMeasuredWithMultipleConstraints = false;
            } else {
                if (bVar != null) {
                    z4 = androidx.compose.ui.unit.b.g(bVar.getValue(), a5);
                }
                if (!z4) {
                    this.wasMeasuredWithMultipleConstraints = true;
                }
            }
            this.measureAndLayoutDelegate.L(a5);
            this.measureAndLayoutDelegate.s();
            setMeasuredDimension(this.root.getWidth(), this.root.getHeight());
            if (this._androidViewsHandler != null) {
                P0().measure(View.MeasureSpec.makeMeasureSpec(this.root.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.root.getHeight(), 1073741824));
            }
            kotlin.k2 k2Var = kotlin.k2.f75408a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(@fg.m ViewStructure structure, int flags) {
        h0.f fVar;
        if (!F0() || structure == null || (fVar = this._autofill) == null) {
            return;
        }
        h0.i.b(fVar, structure);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        androidx.compose.ui.unit.w g4;
        if (this.superclassInitComplete) {
            g4 = n0.g(layoutDirection);
            A1(g4);
            this.focusOwner.a(g4);
        }
    }

    @Override // android.view.View
    @androidx.annotation.x0(31)
    public void onVirtualViewTranslationResponses(@fg.l LongSparseArray<ViewTranslationResponse> response) {
        this.composeAccessibilityDelegate.X0(response);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        boolean b5;
        this._windowInfo.f(hasWindowFocus);
        this.keyboardModifiersRequireUpdate = true;
        super.onWindowFocusChanged(hasWindowFocus);
        if (!hasWindowFocus || this.showLayoutBounds == (b5 = INSTANCE.b())) {
            return;
        }
        this.showLayoutBounds = b5;
        o();
    }

    @Override // androidx.compose.ui.platform.b6
    public boolean p() {
        return this.measureAndLayoutDelegate.k();
    }

    public final void p1() {
        this.observationClearRequested = true;
    }

    @Override // androidx.compose.ui.node.p1
    @fg.l
    /* renamed from: q, reason: from getter */
    public kotlin.coroutines.g getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.ui.node.p1
    public void r(boolean sendPointerUpdate) {
        ld.a<kotlin.k2> aVar;
        if (this.measureAndLayoutDelegate.k() || this.measureAndLayoutDelegate.l()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (sendPointerUpdate) {
                try {
                    aVar = this.resendMotionEventOnLayout;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                aVar = null;
            }
            if (this.measureAndLayoutDelegate.p(aVar)) {
                requestLayout();
            }
            androidx.compose.ui.node.t0.d(this.measureAndLayoutDelegate, false, 1, null);
            kotlin.k2 k2Var = kotlin.k2.f75408a;
            Trace.endSection();
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.compose.ui.node.p1
    @fg.l
    /* renamed from: t, reason: from getter */
    public androidx.compose.ui.focus.s getFocusOwner() {
        return this.focusOwner;
    }

    @Override // androidx.compose.ui.node.p1
    public void v(@fg.l androidx.compose.ui.node.h0 layoutNode, boolean affectsLookahead, boolean forceRequest) {
        if (affectsLookahead) {
            if (this.measureAndLayoutDelegate.C(layoutNode, forceRequest)) {
                r1(this, null, 1, null);
            }
        } else if (this.measureAndLayoutDelegate.H(layoutNode, forceRequest)) {
            r1(this, null, 1, null);
        }
    }

    @Override // androidx.compose.ui.node.p1
    public long x(long localPosition) {
        k1();
        return androidx.compose.ui.graphics.y4.j(this.viewToWindowMatrix, localPosition);
    }

    public final void x1(@fg.l ld.l<? super Configuration, kotlin.k2> lVar) {
        this.configurationChangeObserver = lVar;
    }

    @Override // androidx.compose.ui.node.p1
    public void y(@fg.l androidx.compose.ui.node.h0 layoutNode) {
        this.measureAndLayoutDelegate.G(layoutNode);
        r1(this, null, 1, null);
    }

    @Override // androidx.compose.ui.node.p1
    @fg.l
    /* renamed from: z, reason: from getter */
    public androidx.compose.ui.input.pointer.y getPointerIconService() {
        return this.pointerIconService;
    }

    public final void z1(long j4) {
        this.lastMatrixRecalculationAnimationTime = j4;
    }
}

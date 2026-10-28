package com.cby.shareboard.draw.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewConfiguration;
import androidx.annotation.x0;
import androidx.collection.n1;
import androidx.collection.q2;
import androidx.compose.material3.f4;
import androidx.compose.runtime.snapshots.f0;
import androidx.compose.ui.input.pointer.s;
import androidx.core.view.x1;
import com.cby.shareboard.DoodleChannel;
import com.cby.shareboard.TransactionManager;
import com.cby.shareboard.action.Action;
import com.cby.shareboard.action.ActionType;
import com.cby.shareboard.action.MyImage;
import com.cby.shareboard.draw.listener.DrawBoardListener;
import com.cby.shareboard.draw.model.JoinConfig;
import com.cby.shareboard.model.ScaleType;
import com.cby.shareboard.model.Transaction;
import com.cby.shareboard.utils.FileUtil;
import com.cby.shareboard.utils.LogUtils;
import com.cby.shareboard.widget.IDoodleCallback;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import fg.l;
import fg.m;
import java.io.File;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kd.j;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.c0;
import kotlin.collections.w;
import kotlin.g0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.text.r;
import kotlin.text.v;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;

/* compiled from: DrawBoardView.kt */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\bH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020#2\u0006\u0010'\u001a\u00020#H\u0002¢\u0006\u0004\b(\u0010&J\u0017\u0010)\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b)\u0010&J\u0017\u0010*\u001a\u00020#2\u0006\u0010'\u001a\u00020#H\u0002¢\u0006\u0004\b*\u0010&J#\u0010.\u001a\b\u0012\u0004\u0012\u00020,0+2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00102\u0006\u00100\u001a\u00020,H\u0002¢\u0006\u0004\b1\u00102J'\u00104\u001a\u00020\u00102\u0006\u00100\u001a\u00020,2\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00102\u0006\u00100\u001a\u00020,H\u0002¢\u0006\u0004\b6\u00102Jn\u0010E\u001a\u00020\u00102\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;2\u0006\u0010$\u001a\u00020#2\u0006\u0010'\u001a\u00020#2\u0006\u0010=\u001a\u00020#2\b\b\u0002\u0010>\u001a\u00020\u000e2#\b\u0002\u0010D\u001a\u001d\u0012\u0013\u0012\u00110@¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020\u00100?H\u0002¢\u0006\u0004\bE\u0010FJ\u0019\u0010I\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u0002072\u0006\u0010K\u001a\u00020GH\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u000207H\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u000eH\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u000eH\u0002¢\u0006\u0004\bR\u0010QJ\u000f\u0010S\u001a\u00020\u0010H\u0002¢\u0006\u0004\bS\u0010\u0014J\u0017\u0010U\u001a\u00020\u00102\u0006\u0010T\u001a\u00020\u0002H\u0002¢\u0006\u0004\bU\u0010VJ\u001f\u0010Y\u001a\u00020\u00102\u0006\u0010W\u001a\u00020G2\u0006\u0010X\u001a\u00020GH\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020G2\u0006\u0010X\u001a\u00020GH\u0002¢\u0006\u0004\b[\u0010JJ\u0017\u0010]\u001a\u00020\u000e2\u0006\u0010\\\u001a\u00020GH\u0002¢\u0006\u0004\b]\u0010^J\r\u0010_\u001a\u00020\u0010¢\u0006\u0004\b_\u0010\u0014J\r\u0010`\u001a\u00020\u0010¢\u0006\u0004\b`\u0010\u0014J\r\u0010a\u001a\u00020\u0010¢\u0006\u0004\ba\u0010\u0014J\u000f\u0010b\u001a\u00020\u0010H\u0007¢\u0006\u0004\bb\u0010\u0014J\u0015\u0010e\u001a\u00020\u00102\u0006\u0010d\u001a\u00020c¢\u0006\u0004\be\u0010fJ/\u0010k\u001a\u00020\u00102\u0006\u0010g\u001a\u00020\b2\u0006\u0010h\u001a\u00020\b2\u0006\u0010i\u001a\u00020\b2\u0006\u0010j\u001a\u00020\bH\u0014¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020\u0010H\u0016¢\u0006\u0004\bm\u0010\u0014J\u0017\u0010p\u001a\u00020\u000e2\u0006\u0010o\u001a\u00020nH\u0016¢\u0006\u0004\bp\u0010qJ\u001b\u0010s\u001a\u00020\u00102\f\u0010r\u001a\b\u0012\u0004\u0012\u00020,0+¢\u0006\u0004\bs\u0010tJ\u001d\u0010w\u001a\u00020\u00102\u0006\u0010u\u001a\u00020\b2\u0006\u0010v\u001a\u00020\b¢\u0006\u0004\bw\u0010\"J\r\u0010x\u001a\u00020\b¢\u0006\u0004\bx\u0010\u001eJ\r\u0010y\u001a\u00020\b¢\u0006\u0004\by\u0010\u001eJ\u001d\u0010z\u001a\u00020\u00102\u000e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0+¢\u0006\u0004\bz\u0010tJ\u000f\u0010|\u001a\u0004\u0018\u00010{¢\u0006\u0004\b|\u0010}J\u0016\u0010\u007f\u001a\u00020\u00102\u0006\u0010~\u001a\u00020\b¢\u0006\u0005\b\u007f\u0010\u0080\u0001J#\u0010\u0082\u0001\u001a\u00020\u00102\u0006\u0010<\u001a\u00020;2\t\b\u0003\u0010\u0081\u0001\u001a\u00020\b¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001c\u0010\u0086\u0001\u001a\u00020\u00102\n\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0019\u0010\u0089\u0001\u001a\u00020\u00102\u0007\u0010\u0088\u0001\u001a\u00020G¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J+\u0010\u0089\u0001\u001a\u00020\u00102\u0007\u0010\u0088\u0001\u001a\u00020G2\u0007\u0010\u008b\u0001\u001a\u00020#2\u0007\u0010\u008c\u0001\u001a\u00020#¢\u0006\u0006\b\u0089\u0001\u0010\u008d\u0001J\u0011\u0010\u008e\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u008e\u0001\u0010\u0014J\u0011\u0010\u008f\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u008f\u0001\u0010QJ\u0011\u0010\u0090\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u0090\u0001\u0010\u0014J\u0011\u0010\u0091\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0091\u0001\u0010QJ\u0011\u0010\u0092\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u0092\u0001\u0010\u0014J\u0011\u0010\u0093\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u0093\u0001\u0010\u0014J\u0011\u0010\u0094\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u0094\u0001\u0010\u0014J\u0011\u0010\u0095\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0095\u0001\u0010QJ\u001b\u0010\u0097\u0001\u001a\u00020\u00102\u0007\u0010\u0096\u0001\u001a\u00020\bH\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u0080\u0001J\u0012\u0010\u0098\u0001\u001a\u00020\u0010H\u0096\u0002¢\u0006\u0005\b\u0098\u0001\u0010\u0014J\u0011\u0010\u0099\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0099\u0001\u0010QJ$\u0010\u009c\u0001\u001a\u00020\u00102\u0007\u0010\u009a\u0001\u001a\u00020#2\u0007\u0010\u009b\u0001\u001a\u00020#H\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J4\u0010=\u001a\u00020\u00102\u0007\u0010\u009e\u0001\u001a\u00020#2\u0007\u0010\u009f\u0001\u001a\u00020#2\u0007\u0010 \u0001\u001a\u00020#2\u0007\u0010¡\u0001\u001a\u00020#H\u0016¢\u0006\u0005\b=\u0010¢\u0001J\u001c\u0010¥\u0001\u001a\u00020\u00102\b\u0010¤\u0001\u001a\u00030£\u0001H\u0016¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u001a\u0010§\u0001\u001a\u00020\u00102\u0006\u0010~\u001a\u00020\bH\u0016¢\u0006\u0006\b§\u0001\u0010\u0080\u0001J\u001b\u0010©\u0001\u001a\u00020\u00102\u0007\u0010¨\u0001\u001a\u00020\bH\u0016¢\u0006\u0006\b©\u0001\u0010\u0080\u0001J\u0011\u0010ª\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\bª\u0001\u0010\u0014R!\u0010°\u0001\u001a\u00030«\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001R\u0019\u0010±\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0019\u0010³\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010²\u0001R\u001c\u0010´\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u001a\u0010·\u0001\u001a\u00030¶\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u0019\u0010¹\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u0018\u0010¼\u0001\u001a\u00030»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0019\u0010¾\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u001b\u0010À\u0001\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u001b\u0010Â\u0001\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010Á\u0001R\u001c\u0010Ä\u0001\u001a\u0005\u0018\u00010Ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u001c\u0010Ç\u0001\u001a\u0005\u0018\u00010Æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R \u0010É\u0001\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u000f\n\u0006\bÉ\u0001\u0010¿\u0001\u0012\u0005\bÊ\u0001\u0010\u0014R\u001b\u0010Ë\u0001\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010Á\u0001R\u001b\u0010Ì\u0001\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R$\u0010Ï\u0001\u001a\u000f\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u0002070Î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R\u001b\u0010Ñ\u0001\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0001\u0010Ò\u0001R\u001b\u0010Ó\u0001\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010Ô\u0001R\u0019\u0010Õ\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010²\u0001R\u0019\u0010Ö\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010¿\u0001R\u0019\u0010×\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b×\u0001\u0010²\u0001R\u001a\u0010Ø\u0001\u001a\u00030£\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u0019\u0010Ú\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010¿\u0001R\u0019\u0010Û\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010¿\u0001R\u0019\u0010Ü\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R\u0019\u0010Þ\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÞ\u0001\u0010Ý\u0001R\u0019\u0010ß\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010Ý\u0001R\u0019\u0010à\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010¿\u0001R\u0019\u0010á\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0001\u0010¿\u0001R\u0019\u0010â\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010¿\u0001R\u0017\u0010ã\u0001\u001a\u00020\b8\u0002X\u0082D¢\u0006\b\n\u0006\bã\u0001\u0010¿\u0001R\u0017\u0010ä\u0001\u001a\u00020\b8\u0002X\u0082D¢\u0006\b\n\u0006\bä\u0001\u0010¿\u0001R\u0019\u0010å\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0001\u0010¿\u0001R\u0019\u0010æ\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0001\u0010¿\u0001R\u0019\u0010ç\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bç\u0001\u0010Ý\u0001R\u0019\u0010è\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0001\u0010Ý\u0001R\u0019\u0010é\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bé\u0001\u0010Ý\u0001¨\u0006ê\u0001"}, d2 = {"Lcom/cby/shareboard/draw/widget/DrawBoardView;", "Landroid/view/SurfaceView;", "Ljava/lang/Runnable;", "Lcom/cby/shareboard/widget/IDoodleCallback;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/Integer;)V", "oldWidth", "oldHeight", "", "needScale", "Lkotlin/k2;", "prepareDrawingBitmap", "(IIZ)V", "notifyBoardListener", "()V", "resetChannelsChangedStatus", "delayDrawing", "reDraw", "Landroid/graphics/Canvas;", "canvas", "drawBackground", "(Landroid/graphics/Canvas;)V", "drawActions", "getDeviceNaturalWidth", "()I", "screenWidth", "screenHeight", "updateUniformScaleParams", "(II)V", "", "x", "toStandardX", "(F)F", "y", "toStandardY", "fromStandardX", "fromStandardY", "", "Lcom/cby/shareboard/model/Transaction;", "transactions", "scaleTransactionsIfNeeded", "(Ljava/util/List;)Ljava/util/List;", "transaction", "processTransaction", "(Lcom/cby/shareboard/model/Transaction;)V", "totalCacheList", "handleNonContinuousTransaction", "(Lcom/cby/shareboard/model/Transaction;Ljava/util/List;)V", "onTransactionDraw", "Lcom/cby/shareboard/DoodleChannel;", "doodleChannel", "", "id", "Landroid/graphics/Bitmap;", "bitmap", "scale", "sendToRemote", "Lkotlin/Function1;", "Lcom/cby/shareboard/action/Action;", "Lkotlin/r0;", "name", "action", "onSendToRemote", "handleImage", "(Lcom/cby/shareboard/DoodleChannel;JLandroid/graphics/Bitmap;FFFZLld/l;)V", "", "base64String", "base64ToBitmap", "(Ljava/lang/String;)Ljava/lang/String;", "key", "getDrawChannel", "(Ljava/lang/String;)Lcom/cby/shareboard/DoodleChannel;", "getSelfDrawChannel", "()Lcom/cby/shareboard/DoodleChannel;", "isInitialized", "()Z", "checkChanged", "notifyChanged", "runnable", "runOnUiThread", "(Ljava/lang/Runnable;)V", "source", "input", "printDataSize", "(Ljava/lang/String;Ljava/lang/String;)V", "imageBase64UrlDecode", "s", "isValidBase64", "(Ljava/lang/String;)Z", "onResume", "onPause", "onDestroy", "release", "Lcom/cby/shareboard/draw/model/JoinConfig;", "config", "init", "(Lcom/cby/shareboard/draw/model/JoinConfig;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "run", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "list", "initData", "(Ljava/util/List;)V", "width", "height", "setStandardCanvasSize", "getStandardCanvasWidth", "getStandardCanvasHeight", "handleTransaction", "Lcom/cby/shareboard/TransactionManager;", "getTransactionManager", "()Lcom/cby/shareboard/TransactionManager;", "color", "setBgColor", "(I)V", "scaleType", "setBgBitmap", "(Landroid/graphics/Bitmap;I)V", "Lcom/cby/shareboard/draw/listener/DrawBoardListener;", "listener", "setOnDrawBoardListener", "(Lcom/cby/shareboard/draw/listener/DrawBoardListener;)V", "filePath", "setImage", "(Ljava/lang/String;)V", "maxWidth", "maxHeight", "(Ljava/lang/String;FF)V", "undo", "canUndo", "redo", "canRedo", "clear", "clean", "previous", "canPrevious", "index", "go", "next", "canNext", "dx", "dy", "translate", "(FF)V", "sx", "sy", "focusX", "focusY", "(FFFF)V", "Lcom/cby/shareboard/action/ActionType;", "type", "setActionType", "(Lcom/cby/shareboard/action/ActionType;)V", "setPaintColor", "size", "setPaintSize", "end", "Lcom/cby/shareboard/utils/LogUtils;", "logger$delegate", "Lkotlin/b0;", "getLogger", "()Lcom/cby/shareboard/utils/LogUtils;", "logger", "mDrawDelayTime", "J", "mCurrentDrawDelayTime", "mBoardListener", "Lcom/cby/shareboard/draw/listener/DrawBoardListener;", "Landroid/view/SurfaceHolder;", "mSurfaceHolder", "Landroid/view/SurfaceHolder;", "isDrawing", "Z", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "mBgColor", "I", "mCurBgBitmap", "Landroid/graphics/Bitmap;", "mBgBitmap", "Landroid/graphics/Rect;", "mBgSrc", "Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "mBgDst", "Landroid/graphics/RectF;", "mBgScaleType", "getMBgScaleType$annotations", "mDrawingBitmap", "mDrawingCanvas", "Landroid/graphics/Canvas;", "", "mChannelMap", "Ljava/util/Map;", "mJoinConfig", "Lcom/cby/shareboard/draw/model/JoinConfig;", "mTransactionManager", "Lcom/cby/shareboard/TransactionManager;", "mLastPageId", "mLastNo", "mLastID", "mActionType", "Lcom/cby/shareboard/action/ActionType;", "mPaintSize", "mPaintColor", "mScale", "F", "mLastX", "mLastY", "mTouchSlop", "mLastWidth", "mLastHeight", "FALLBACK_CANVAS_WIDTH", "FALLBACK_CANVAS_HEIGHT", "mStandardWidth", "mStandardHeight", "mUniformScale", "mOffsetX", "mOffsetY", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@x0(8)
@r1({"SMAP\nDrawBoardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawBoardView.kt\ncom/cby/shareboard/draw/widget/DrawBoardView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1401:1\n1855#2,2:1402\n1855#2,2:1405\n1549#2:1407\n1620#2,3:1408\n1045#2:1411\n1855#2,2:1412\n1045#2:1414\n1855#2,2:1415\n1549#2:1417\n1620#2,3:1418\n766#2:1421\n857#2,2:1422\n1855#2,2:1424\n1549#2:1426\n1620#2,3:1427\n766#2:1430\n857#2,2:1431\n1855#2,2:1433\n1#3:1404\n*S KotlinDebug\n*F\n+ 1 DrawBoardView.kt\ncom/cby/shareboard/draw/widget/DrawBoardView\n*L\n239#1:1402,2\n754#1:1405,2\n791#1:1407\n791#1:1408,3\n817#1:1411\n817#1:1412,2\n925#1:1414\n929#1:1415,2\n1011#1:1417\n1011#1:1418,3\n1013#1:1421\n1013#1:1422,2\n1013#1:1424,2\n1022#1:1426\n1022#1:1427,3\n1023#1:1430\n1023#1:1431,2\n1023#1:1433,2\n*E\n"})
/* loaded from: classes3.dex */
public final class DrawBoardView extends SurfaceView implements Runnable, IDoodleCallback {
    private final int FALLBACK_CANVAS_HEIGHT;
    private final int FALLBACK_CANVAS_WIDTH;
    private boolean isDrawing;

    @l
    private final ReentrantLock lock;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @l
    private final b0 logger;

    @l
    private ActionType mActionType;

    @m
    private Bitmap mBgBitmap;
    private int mBgColor;

    @m
    private RectF mBgDst;
    private int mBgScaleType;

    @m
    private Rect mBgSrc;

    @m
    private DrawBoardListener mBoardListener;

    @l
    private final Map<String, DoodleChannel> mChannelMap;

    @m
    private Bitmap mCurBgBitmap;
    private long mCurrentDrawDelayTime;
    private long mDrawDelayTime;

    @m
    private Bitmap mDrawingBitmap;

    @m
    private Canvas mDrawingCanvas;

    @m
    private JoinConfig mJoinConfig;
    private int mLastHeight;
    private long mLastID;
    private int mLastNo;
    private long mLastPageId;
    private int mLastWidth;
    private float mLastX;
    private float mLastY;
    private float mOffsetX;
    private float mOffsetY;
    private int mPaintColor;
    private int mPaintSize;
    private float mScale;
    private int mStandardHeight;
    private int mStandardWidth;

    @l
    private SurfaceHolder mSurfaceHolder;
    private int mTouchSlop;

    @m
    private TransactionManager mTransactionManager;
    private float mUniformScale;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public DrawBoardView(@l Context context) {
        this(context, null, null, 6, null);
        l0.p(context, ProtectedSandApp.s("ஒ"));
    }

    private final String base64ToBitmap(String base64String) {
        String a5 = s.a(ProtectedSandApp.s("ஔ"), System.currentTimeMillis(), ProtectedSandApp.s("க"));
        FileUtil fileUtil = FileUtil.INSTANCE;
        Context context = getContext();
        l0.o(context, ProtectedSandApp.s("\u0b96"));
        String createFile = fileUtil.createFile(new File(fileUtil.getCachePath(context), a5));
        if (fileUtil.base64ToFile(base64String, createFile)) {
            return createFile;
        }
        return null;
    }

    private final boolean checkChanged() {
        Iterator<DoodleChannel> it = this.mChannelMap.values().iterator();
        while (it.hasNext()) {
            if (it.next().isChanged()) {
                return true;
            }
        }
        return false;
    }

    private final void delayDrawing() {
        long j4 = this.mCurrentDrawDelayTime;
        if (j4 != 0) {
            try {
                Thread.sleep(j4);
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                e4.printStackTrace();
            }
        }
    }

    private final void drawActions(Canvas canvas) {
        for (DoodleChannel doodleChannel : this.mChannelMap.values()) {
            int index = doodleChannel.index();
            if (index >= 0) {
                int i4 = 0;
                while (true) {
                    Action action = (Action) w.W2(doodleChannel.getActions(), i4);
                    if (action != null) {
                        action.onDraw(canvas);
                    }
                    if (i4 == index) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            Action action2 = doodleChannel.getAction();
            if (action2 != null) {
                action2.onDraw(canvas);
            }
        }
    }

    private final void drawBackground(Canvas canvas) {
        Bitmap createBitmap;
        int i4;
        int i5;
        int i6;
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        Bitmap bitmap = this.mBgBitmap;
        if (bitmap != null) {
            l0.m(bitmap);
            createBitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        } else {
            createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(this.mBgColor);
        }
        this.mCurBgBitmap = createBitmap;
        if (createBitmap != null) {
            int width2 = createBitmap.getWidth();
            int height2 = createBitmap.getHeight();
            float f4 = width;
            float f5 = width2;
            float f6 = f4 / f5;
            float f7 = height;
            float f10 = height2;
            float f11 = f7 / f10;
            float f12 = f4 / f7;
            double d5 = width2 * 1.0d;
            Integer valueOf = Integer.valueOf(height2);
            if (valueOf.intValue() == 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                i5 = valueOf.intValue();
                i4 = width2;
            } else {
                i4 = width2;
                i5 = 1;
            }
            int i7 = 0;
            boolean z4 = ((double) f12) > d5 / ((double) i5);
            int i10 = this.mBgScaleType;
            if (i10 == 1) {
                Rect rect = this.mBgSrc;
                RectF rectF = this.mBgDst;
                l0.m(rectF);
                canvas.drawBitmap(createBitmap, rect, rectF, (Paint) null);
                return;
            }
            if (i10 == 2) {
                if (z4) {
                    height2 = (int) (f5 / f12);
                    i6 = (int) f4.a(height2, f11, f7, 2.0f);
                } else {
                    int i11 = (int) (f10 / f12);
                    i4 = i11;
                    i7 = (int) f4.a(i11, f6, f4, 2.0f);
                    i6 = 0;
                }
                Rect rect2 = new Rect(i7, i6, i7 + i4, height2 + i6);
                this.mBgSrc = rect2;
                RectF rectF2 = this.mBgDst;
                l0.m(rectF2);
                canvas.drawBitmap(createBitmap, rect2, rectF2, (Paint) null);
                return;
            }
            if (i10 != 3) {
                Rect rect3 = this.mBgSrc;
                RectF rectF3 = this.mBgDst;
                l0.m(rectF3);
                canvas.drawBitmap(createBitmap, rect3, rectF3, (Paint) null);
                return;
            }
            if (f6 >= f11) {
                f6 = f11;
            }
            float a5 = f4.a(f5, f6, f4, 2.0f);
            float a6 = f4.a(f10, f6, f7, 2.0f);
            Matrix matrix = new Matrix();
            matrix.postScale(f6, f6);
            matrix.postTranslate(a5, a6);
            canvas.drawBitmap(createBitmap, matrix, null);
        }
    }

    private final float fromStandardX(float x4) {
        return (x4 * this.mUniformScale) + this.mOffsetX;
    }

    private final float fromStandardY(float y4) {
        return (y4 * this.mUniformScale) + this.mOffsetY;
    }

    private final int getDeviceNaturalWidth() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        return measuredWidth >= measuredHeight ? measuredWidth : measuredHeight;
    }

    private final DoodleChannel getDrawChannel(String key) {
        DoodleChannel doodleChannel = this.mChannelMap.get(key);
        if (doodleChannel == null) {
            doodleChannel = new DoodleChannel();
            this.mChannelMap.put(key, doodleChannel);
        }
        doodleChannel.setScale(this.mScale);
        return doodleChannel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LogUtils getLogger() {
        return (LogUtils) this.logger.getValue();
    }

    @ScaleType
    private static /* synthetic */ void getMBgScaleType$annotations() {
    }

    private final DoodleChannel getSelfDrawChannel() {
        if (!isInitialized()) {
            throw new IllegalStateException(ProtectedSandApp.s("\u0b97"));
        }
        JoinConfig joinConfig = this.mJoinConfig;
        l0.m(joinConfig);
        return getDrawChannel(joinConfig.getUserId());
    }

    private final synchronized void handleImage(DoodleChannel doodleChannel, long id2, Bitmap bitmap, float x4, float y4, float scale, boolean sendToRemote, ld.l<? super Action, k2> onSendToRemote) {
        String s4 = ProtectedSandApp.s("\u0b98");
        String s5 = ProtectedSandApp.s("ங");
        synchronized (this) {
            try {
                try {
                    ActionType mPaintType = doodleChannel.getMPaintType();
                    doodleChannel.setImage(bitmap);
                    doodleChannel.setPaintType(ActionType.Image);
                    Action action = doodleChannel.getAction(id2, x4, y4);
                    if (action != null) {
                        if (action instanceof MyImage) {
                            ((MyImage) action).setSize(bitmap.getWidth(), bitmap.getHeight());
                        }
                        if (sendToRemote) {
                            onSendToRemote.invoke(action);
                        }
                    }
                    doodleChannel.addCurrentAction();
                    doodleChannel.setAction(null);
                    if (sendToRemote) {
                        DrawBoardListener drawBoardListener = this.mBoardListener;
                        if (drawBoardListener != null) {
                            drawBoardListener.onActionChanged();
                        }
                        TransactionManager transactionManager = this.mTransactionManager;
                        if (transactionManager != null) {
                            transactionManager.setActionType(mPaintType);
                        }
                    }
                    getLogger().debug(s5 + mPaintType);
                    doodleChannel.setPaintType(mPaintType);
                } catch (Exception e4) {
                    e4.printStackTrace();
                    getLogger().debug(s4 + e4.getLocalizedMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static /* synthetic */ void handleImage$default(DrawBoardView drawBoardView, DoodleChannel doodleChannel, long j4, Bitmap bitmap, float f4, float f5, float f6, boolean z4, ld.l lVar, int i4, Object obj) {
        drawBoardView.handleImage(doodleChannel, j4, bitmap, f4, f5, f6, (i4 & 64) != 0 ? false : z4, (i4 & 128) != 0 ? DrawBoardView$handleImage$1.INSTANCE : lVar);
    }

    private final void handleNonContinuousTransaction(Transaction transaction, List<Transaction> totalCacheList) {
        k2 k2Var;
        List u5;
        getLogger().debug(ProtectedSandApp.s("ச") + transaction.getId() + ProtectedSandApp.s("\u0b9b") + transaction.getNo() + ProtectedSandApp.s("ஜ") + ((int) transaction.getStep()));
        if (totalCacheList == null || (u5 = w.u5(totalCacheList, new Comparator() { // from class: com.cby.shareboard.draw.widget.DrawBoardView$handleNonContinuousTransaction$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t4, T t5) {
                return kotlin.comparisons.a.l(Long.valueOf(((Transaction) t4).getTimestamp()), Long.valueOf(((Transaction) t5).getTimestamp()));
            }
        })) == null) {
            k2Var = null;
        } else {
            Bitmap bitmap = this.mDrawingBitmap;
            if (bitmap != null) {
                bitmap.eraseColor(0);
            }
            getDrawChannel(transaction.getUserId()).clear();
            getLogger().debug(ProtectedSandApp.s("\u0b9d") + u5.size());
            Iterator it = u5.iterator();
            while (it.hasNext()) {
                onTransactionDraw((Transaction) it.next());
            }
            k2Var = k2.f75408a;
        }
        if (k2Var == null) {
            onTransactionDraw(transaction);
        }
    }

    private final String imageBase64UrlDecode(String input) {
        try {
            String decode = URLDecoder.decode(input, ProtectedSandApp.s("ஞ"));
            l0.o(decode, ProtectedSandApp.s("ட"));
            getLogger().debug(ProtectedSandApp.s("\u0ba0"));
            return decode;
        } catch (Exception unused) {
            getLogger().debug(ProtectedSandApp.s("\u0ba1"));
            return input;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$16(DrawBoardView drawBoardView, List list) {
        l0.p(drawBoardView, ProtectedSandApp.s("\u0ba2"));
        l0.p(list, ProtectedSandApp.s("ண"));
        drawBoardView.handleTransaction(list);
        drawBoardView.onResume();
        drawBoardView.notifyChanged();
    }

    private final boolean isInitialized() {
        JoinConfig joinConfig = this.mJoinConfig;
        if (joinConfig == null) {
            getLogger().debug(ProtectedSandApp.s("த"));
            return false;
        }
        l0.m(joinConfig);
        if (v.S1(joinConfig.getRoomId())) {
            getLogger().debug(ProtectedSandApp.s("\u0ba5"));
            return false;
        }
        JoinConfig joinConfig2 = this.mJoinConfig;
        l0.m(joinConfig2);
        if (!v.S1(joinConfig2.getUserId())) {
            return this.mJoinConfig != null;
        }
        getLogger().debug(ProtectedSandApp.s("\u0ba6"));
        return false;
    }

    private final boolean isValidBase64(String s4) {
        return new r(ProtectedSandApp.s("\u0ba7")).k(s4);
    }

    private final void notifyBoardListener() {
        TransactionManager transactionManager = this.mTransactionManager;
        boolean z4 = (transactionManager != null ? transactionManager.getTotalCacheSize() : 0) > 0;
        DrawBoardListener drawBoardListener = this.mBoardListener;
        if (drawBoardListener != null) {
            drawBoardListener.onDrawChanged(this.mDrawingBitmap, z4);
        }
    }

    private final void notifyChanged() {
        DrawBoardListener drawBoardListener = this.mBoardListener;
        if (drawBoardListener != null) {
            drawBoardListener.onActionChanged();
        }
    }

    private final synchronized void onTransactionDraw(Transaction transaction) {
        Bitmap bitmap;
        Float J0;
        String s4 = ProtectedSandApp.s("ந");
        String s5 = ProtectedSandApp.s("ன");
        String s6 = ProtectedSandApp.s("ப");
        String s7 = ProtectedSandApp.s("\u0bab");
        String s10 = ProtectedSandApp.s("\u0bac");
        synchronized (this) {
            try {
                getLogger().debug(s10 + transaction.getPageId() + ProtectedSandApp.s("\u0bad") + transaction.getId() + ProtectedSandApp.s("\u0b9b") + transaction.getNo() + ProtectedSandApp.s("ஜ") + ((int) transaction.getStep()));
                if (((int) this.mLastPageId) == -1) {
                    this.mLastPageId = transaction.getPageId();
                }
                this.mLastNo = transaction.getNo();
                this.mLastID = transaction.getId();
                DoodleChannel drawChannel = getDrawChannel(transaction.getUserId());
                ActionType typeOfValue = ActionType.typeOfValue(transaction.getActionType());
                byte step = transaction.getStep();
                if (step == 1) {
                    int paintSize = (int) (transaction.getPaintSize() * this.mUniformScale);
                    if (paintSize < 1) {
                        paintSize = 1;
                    }
                    drawChannel.setPaintSize(paintSize);
                    drawChannel.setPaintColor(transaction.getPaintColor());
                    float fromStandardX = fromStandardX(transaction.getX());
                    float fromStandardY = fromStandardY(transaction.getY());
                    getLogger().debug(s7 + transaction.getX() + ProtectedSandApp.s("ம") + transaction.getY() + ProtectedSandApp.s("ய") + transaction.getPaintSize() + ProtectedSandApp.s("ர") + fromStandardX + ProtectedSandApp.s("ம") + fromStandardY + ProtectedSandApp.s("ய") + paintSize + ProtectedSandApp.s("ற") + this.mUniformScale + ProtectedSandApp.s("ல") + this.mOffsetX + ProtectedSandApp.s("ம") + this.mOffsetY + ProtectedSandApp.s("ள"));
                    long id2 = transaction.getId();
                    l0.m(typeOfValue);
                    Action action = drawChannel.getAction(id2, typeOfValue, fromStandardX, fromStandardY);
                    if (action != null) {
                        action.onStart(fromStandardX, fromStandardY);
                        drawChannel.setChanged(true);
                    }
                } else if (step == 2) {
                    float fromStandardX2 = fromStandardX(transaction.getX());
                    float fromStandardY2 = fromStandardY(transaction.getY());
                    Action action2 = drawChannel.getAction();
                    if (action2 != null) {
                        action2.onMove(fromStandardX2, fromStandardY2);
                    }
                    drawChannel.setChanged(true);
                } else if (step == 3) {
                    drawChannel.addCurrentAction();
                    drawChannel.setAction(null);
                    drawChannel.setChanged(true);
                } else if (step == 12) {
                    if (transaction.getImageBase64() == null) {
                        getLogger().debug(ProtectedSandApp.s("ழ"));
                        return;
                    }
                    String imageBase64 = transaction.getImageBase64();
                    l0.m(imageBase64);
                    List R4 = v.R4(imageBase64, new String[]{ProtectedSandApp.s("ம")}, false, 0, 6, null);
                    if (R4.isEmpty()) {
                        getLogger().debug(ProtectedSandApp.s("வ"));
                        return;
                    }
                    int size = R4.size();
                    int i4 = size - 3;
                    String str = (String) w.W2(R4, i4);
                    String str2 = (String) w.W2(R4, size - 2);
                    String str3 = (String) w.W2(R4, size - 1);
                    float floatValue = (str3 == null || (J0 = v.J0(str3)) == null) ? 1.0f : J0.floatValue();
                    String m32 = w.m3(R4.subList(0, i4), ProtectedSandApp.s("ம"), null, null, 0, null, null, 62, null);
                    getLogger().debug(s6 + str + ProtectedSandApp.s("ஶ") + str2 + ProtectedSandApp.s("ஷ") + floatValue);
                    printDataSize(ProtectedSandApp.s("ஸ"), m32);
                    String imageBase64UrlDecode = imageBase64UrlDecode(m32);
                    printDataSize(ProtectedSandApp.s("ஹ"), m32);
                    String base64ToBitmap = base64ToBitmap(v.i2(imageBase64UrlDecode, ProtectedSandApp.s("\u0bba"), ProtectedSandApp.s("\u0bbb"), false, 4, null));
                    getLogger().debug(s5 + base64ToBitmap);
                    if (base64ToBitmap != null) {
                        Bitmap filePathToBitmap = FileUtil.INSTANCE.filePathToBitmap(base64ToBitmap);
                        if (filePathToBitmap == null) {
                            return;
                        }
                        float fromStandardX3 = fromStandardX(transaction.getX());
                        float fromStandardY3 = fromStandardY(transaction.getY());
                        float f4 = floatValue * this.mUniformScale;
                        getLogger().debug(s4 + floatValue + ProtectedSandApp.s("\u0bbc") + f4 + ProtectedSandApp.s("\u0bbd") + this.mUniformScale);
                        handleImage$default(this, drawChannel, transaction.getId(), filePathToBitmap, fromStandardX3, fromStandardY3, f4, false, null, 192, null);
                    }
                } else if (step == 4) {
                    List R42 = v.R4(transaction.getTargetIds(), new String[]{ProtectedSandApp.s("ம")}, false, 0, 6, null);
                    ArrayList arrayList = new ArrayList(w.b0(R42, 10));
                    Iterator it = R42.iterator();
                    while (it.hasNext()) {
                        Long Z0 = v.Z0((String) it.next());
                        arrayList.add(Long.valueOf(Z0 != null ? Z0.longValue() : 0L));
                    }
                    k1.a aVar = new k1.a();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (((Number) obj).longValue() != 0) {
                            arrayList2.add(obj);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        boolean undo = drawChannel.undo(((Number) it2.next()).longValue());
                        Boolean valueOf = Boolean.valueOf(undo);
                        if (!undo) {
                            valueOf = null;
                        }
                        aVar.f75322b = valueOf != null ? valueOf.booleanValue() : aVar.f75322b;
                    }
                    if (aVar.f75322b && (bitmap = this.mDrawingBitmap) != null) {
                        bitmap.eraseColor(0);
                    }
                } else if (step == 5) {
                    List R43 = v.R4(transaction.getTargetIds(), new String[]{ProtectedSandApp.s("ம")}, false, 0, 6, null);
                    ArrayList arrayList3 = new ArrayList(w.b0(R43, 10));
                    Iterator it3 = R43.iterator();
                    while (it3.hasNext()) {
                        Long Z02 = v.Z0((String) it3.next());
                        arrayList3.add(Long.valueOf(Z02 != null ? Z02.longValue() : 0L));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : arrayList3) {
                        if (((Number) obj2).longValue() != 0) {
                            arrayList4.add(obj2);
                        }
                    }
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        drawChannel.redo(((Number) it4.next()).longValue());
                    }
                } else if (step == 6) {
                    Bitmap bitmap2 = this.mCurBgBitmap;
                    if (bitmap2 != null) {
                        bitmap2.eraseColor(0);
                    }
                    Bitmap bitmap3 = this.mDrawingBitmap;
                    if (bitmap3 != null) {
                        bitmap3.eraseColor(0);
                    }
                    drawChannel.clear();
                    TransactionManager transactionManager = this.mTransactionManager;
                    if (transactionManager != null) {
                        transactionManager.clearTotalCacheBeforePage(transaction.getPageId() + 1, transaction.getUserId());
                    }
                    this.mLastPageId = -1L;
                    this.mLastNo = -1;
                    this.mLastID = -1L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void prepareDrawingBitmap(int oldWidth, int oldHeight, boolean needScale) {
        Bitmap bitmap;
        Bitmap bitmap2;
        String s4 = ProtectedSandApp.s("ா");
        String s5 = ProtectedSandApp.s("ி");
        String s6 = ProtectedSandApp.s("ீ");
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        String s7 = ProtectedSandApp.s("ள");
        String s10 = ProtectedSandApp.s("ு");
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            getLogger().debug(q2.a(ProtectedSandApp.s("\u0bc9"), measuredWidth, s10, measuredHeight, s7));
            return;
        }
        Bitmap bitmap3 = this.mDrawingBitmap;
        if (bitmap3 == null || bitmap3 == null || bitmap3.getWidth() != measuredWidth || (bitmap = this.mDrawingBitmap) == null || bitmap.getHeight() != measuredHeight || ((bitmap2 = this.mDrawingBitmap) != null && bitmap2.isRecycled())) {
            LogUtils logger = getLogger();
            StringBuilder a5 = n1.a(ProtectedSandApp.s("ூ"), measuredWidth, ProtectedSandApp.s("\u0bc3"), measuredHeight, ProtectedSandApp.s("\u0bc4"));
            a5.append(needScale);
            logger.debug(a5.toString());
            Bitmap bitmap4 = this.mDrawingBitmap;
            this.lock.lock();
            try {
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                    l0.o(createBitmap, ProtectedSandApp.s("\u0bc5"));
                    createBitmap.eraseColor(0);
                    if (needScale && bitmap4 != null && !bitmap4.isRecycled() && oldWidth > 0 && oldHeight > 0) {
                        try {
                            Canvas canvas = new Canvas(createBitmap);
                            float f4 = measuredWidth;
                            float f5 = oldWidth;
                            float f6 = f4 / f5;
                            float f7 = measuredHeight;
                            float f10 = oldHeight;
                            float f11 = f7 / f10;
                            float min = Math.min(f6, f11);
                            float f12 = (f4 - (f5 * min)) / 2.0f;
                            float f13 = (f7 - (f10 * min)) / 2.0f;
                            getLogger().debug(s6 + f6 + s10 + f11 + ProtectedSandApp.s("ெ") + min + ProtectedSandApp.s("ல") + f12 + s10 + f13 + s7);
                            Matrix matrix = new Matrix();
                            matrix.postScale(min, min);
                            matrix.postTranslate(f12, f13);
                            canvas.drawBitmap(bitmap4, matrix, null);
                            getLogger().debug(ProtectedSandApp.s("ே"));
                        } catch (Exception e4) {
                            getLogger().error(s5 + e4.getMessage());
                        }
                    }
                    this.mDrawingBitmap = createBitmap;
                    this.mDrawingCanvas = new Canvas(createBitmap);
                    if (bitmap4 != null && !bitmap4.isRecycled()) {
                        bitmap4.recycle();
                        getLogger().debug(ProtectedSandApp.s("ை"));
                    }
                } catch (Exception e5) {
                    getLogger().error(s4 + e5.getMessage());
                    if (bitmap4 != null && !bitmap4.isRecycled()) {
                        this.mDrawingBitmap = bitmap4;
                        this.mDrawingCanvas = new Canvas(bitmap4);
                    }
                }
            } finally {
                this.lock.unlock();
            }
        }
    }

    static /* synthetic */ void prepareDrawingBitmap$default(DrawBoardView drawBoardView, int i4, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        drawBoardView.prepareDrawingBitmap(i4, i5, z4);
    }

    private final void printDataSize(String source, String input) {
        k.f(s0.a(j1.c()), null, null, new DrawBoardView$printDataSize$1(input, this, source, null), 3, null);
    }

    private final void processTransaction(Transaction transaction) {
        long pageId = transaction.getPageId();
        String userId = transaction.getUserId();
        LogUtils logger = getLogger();
        long j4 = this.mLastPageId;
        StringBuilder a5 = f0.a(ProtectedSandApp.s("ொ"), pageId, ProtectedSandApp.s("ோ"));
        a5.append(j4);
        logger.debug(a5.toString());
        long j5 = this.mLastPageId;
        if (pageId > j5) {
            getLogger().debug(ProtectedSandApp.s("ௌ") + pageId);
            TransactionManager transactionManager = this.mTransactionManager;
            if (transactionManager != null) {
                transactionManager.clearTotalCacheBeforePage(pageId, userId);
            }
            Bitmap bitmap = this.mDrawingBitmap;
            if (bitmap != null) {
                bitmap.eraseColor(0);
            }
            TransactionManager transactionManager2 = this.mTransactionManager;
            handleNonContinuousTransaction(transaction, transactionManager2 != null ? transactionManager2.getTotalCacheList() : null);
            return;
        }
        if (pageId != j5) {
            getLogger().debug(ProtectedSandApp.s("\u0bcf"));
            TransactionManager transactionManager3 = this.mTransactionManager;
            if (transactionManager3 != null) {
                transactionManager3.clearTotalCacheByPage(pageId, userId);
            }
            Bitmap bitmap2 = this.mDrawingBitmap;
            if (bitmap2 != null) {
                bitmap2.eraseColor(0);
                return;
            }
            return;
        }
        getLogger().debug(ProtectedSandApp.s("்") + this.mLastNo + ProtectedSandApp.s("\u0bce") + transaction.getNo());
        int i4 = this.mLastNo + 1;
        TransactionManager transactionManager4 = this.mTransactionManager;
        boolean isInTotalCache = transactionManager4 != null ? transactionManager4.isInTotalCache(pageId, transaction.getUserId(), i4) : false;
        if (this.mLastNo == -1 || transaction.getNo() == i4 || !isInTotalCache) {
            onTransactionDraw(transaction);
        } else {
            TransactionManager transactionManager5 = this.mTransactionManager;
            handleNonContinuousTransaction(transaction, transactionManager5 != null ? transactionManager5.getTotalCacheList() : null);
        }
    }

    private final void reDraw() {
        Canvas canvas;
        String s4 = ProtectedSandApp.s("ௐ");
        if (this.mSurfaceHolder.getSurface() == null || !this.isDrawing) {
            return;
        }
        try {
            canvas = this.mSurfaceHolder.lockCanvas();
        } catch (Exception e4) {
            getLogger().error(ProtectedSandApp.s("\u0bd1") + e4.getLocalizedMessage());
            canvas = null;
        }
        try {
            if (canvas != null) {
                try {
                    canvas.save();
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawBackground(canvas);
                    Bitmap bitmap = this.mDrawingBitmap;
                    l0.m(bitmap);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    Canvas canvas2 = this.mDrawingCanvas;
                    l0.m(canvas2);
                    drawActions(canvas2);
                    canvas.restore();
                } catch (Exception e5) {
                    getLogger().error(s4 + e5.getMessage());
                }
            }
        } finally {
            this.mSurfaceHolder.unlockCanvasAndPost(canvas);
        }
    }

    private final void resetChannelsChangedStatus() {
        synchronized (this.mChannelMap) {
            try {
                for (DoodleChannel doodleChannel : this.mChannelMap.values()) {
                    if (doodleChannel.isChanged() && System.currentTimeMillis() - doodleChannel.getLastChangeTime() > 1000) {
                        doodleChannel.setChanged(false);
                    }
                }
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                e4.printStackTrace();
            }
            k2 k2Var = k2.f75408a;
        }
    }

    private final void runOnUiThread(Runnable runnable) {
        Handler handler = getHandler();
        if (handler == null || l0.g(handler.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    private final List<Transaction> scaleTransactionsIfNeeded(List<Transaction> transactions) {
        String s4 = ProtectedSandApp.s("\u0bc3");
        if (!transactions.isEmpty() && getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            try {
                float f4 = 0.0f;
                float f5 = 0.0f;
                for (Transaction transaction : transactions) {
                    if (transaction.getStep() != 1 && transaction.getStep() != 2 && transaction.getStep() != 3) {
                    }
                    if (transaction.getX() > f4) {
                        f4 = transaction.getX();
                    }
                    if (transaction.getY() > f5) {
                        f5 = transaction.getY();
                    }
                }
                if (f4 > 0.0f && f5 > 0.0f) {
                    float f6 = f4 * 1.1f;
                    float f7 = f5 * 1.1f;
                    float measuredWidth = getMeasuredWidth();
                    float measuredHeight = getMeasuredHeight();
                    float f10 = measuredWidth / f6;
                    float f11 = measuredHeight / f7;
                    float abs = Math.abs(f10 - 1.0f);
                    String s5 = ProtectedSandApp.s("ு");
                    if (abs < 0.15f && Math.abs(f11 - 1.0f) < 0.15f) {
                        getLogger().debug(ProtectedSandApp.s("\u0bd2") + f10 + s5 + f11 + ProtectedSandApp.s("ள"));
                        return transactions;
                    }
                    getLogger().debug(ProtectedSandApp.s("\u0bd3"));
                    getLogger().debug(ProtectedSandApp.s("\u0bd4") + ((int) f6) + s4 + ((int) f7));
                    getLogger().debug(ProtectedSandApp.s("\u0bd5") + ((int) measuredWidth) + s4 + ((int) measuredHeight));
                    getLogger().debug(ProtectedSandApp.s("\u0bd6") + f10 + s5 + f11);
                    List<Transaction> list = transactions;
                    ArrayList arrayList = new ArrayList(w.b0(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        Transaction m7clone = ((Transaction) it.next()).m7clone();
                        if (m7clone.getStep() == 1 || m7clone.getStep() == 2 || m7clone.getStep() == 3 || m7clone.getStep() == 12) {
                            m7clone.setX(m7clone.getX() * f10);
                            m7clone.setY(m7clone.getY() * f11);
                        }
                        arrayList.add(m7clone);
                    }
                    return arrayList;
                }
                return transactions;
            } catch (Exception e4) {
                getLogger().error(ProtectedSandApp.s("ௗ") + e4.getMessage());
            }
        }
        return transactions;
    }

    public static /* synthetic */ void setBgBitmap$default(DrawBoardView drawBoardView, Bitmap bitmap, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 2;
        }
        drawBoardView.setBgBitmap(bitmap, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float toStandardX(float x4) {
        float f4 = this.mUniformScale;
        return f4 == 0.0f ? x4 : (x4 - this.mOffsetX) / f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float toStandardY(float y4) {
        float f4 = this.mUniformScale;
        return f4 == 0.0f ? y4 : (y4 - this.mOffsetY) / f4;
    }

    private final void updateUniformScaleParams(int screenWidth, int screenHeight) {
        if (screenWidth == 0 || screenHeight == 0) {
            return;
        }
        int standardCanvasWidth = getStandardCanvasWidth();
        int standardCanvasHeight = getStandardCanvasHeight();
        float f4 = screenWidth;
        float f5 = standardCanvasWidth;
        float f6 = screenHeight;
        float f7 = standardCanvasHeight;
        float min = Math.min(f4 / f5, f6 / f7);
        this.mUniformScale = min;
        float f10 = f5 * min;
        float f11 = f7 * min;
        this.mOffsetX = (f4 - f10) / 2.0f;
        this.mOffsetY = (f6 - f11) / 2.0f;
        LogUtils logger = getLogger();
        String s4 = ProtectedSandApp.s("\u0bd8");
        String s5 = ProtectedSandApp.s("\u0bc3");
        StringBuilder a5 = n1.a(s4, screenWidth, s5, screenHeight, ProtectedSandApp.s("\u0bd9"));
        a5.append(standardCanvasWidth);
        a5.append(s5);
        a5.append(standardCanvasHeight);
        String s6 = ProtectedSandApp.s("ள");
        a5.append(s6);
        logger.debug(a5.toString());
        getLogger().debug(ProtectedSandApp.s("\u0bda") + this.mUniformScale + ProtectedSandApp.s("\u0bdb") + ((int) f10) + s5 + ((int) f11) + ProtectedSandApp.s("\u0bdc") + this.mOffsetX + ProtectedSandApp.s("ு") + this.mOffsetY + s6);
    }

    @Override // com.cby.shareboard.widget.IDoodleCallback
    public boolean canNext() {
        throw new g0(ProtectedSandApp.s("\u0bdd"));
    }

    @Override // com.cby.shareboard.widget.IDoodleCallback
    public boolean canPrevious() {
        throw new g0(ProtectedSandApp.s("\u0bdd"));
    }

    @Override // com.cby.shareboard.widget.IDoodleCallback
    public boolean canRedo() {
        return getSelfDrawChannel().canRedo();
    }

    @Override // com.cby.shareboard.widget.IDoodleCallback
    public boolean canUndo() {
        return getSelfDrawChannel().canUndo();
    }

    @Override // com.cby.shareboard.widget.IDoodleCallback
    public void clean() {
        getSelfDrawChannel().clear();
        TransactionManager transactionManager = this.mTransactionManager;
        if (transactionManager != null) {
            transactionManager.sendClearTransaction();
        }
        Bitmap bitmap = this.mCurBgBitmap;
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        Bitmap bitmap2 = this.mDrawingBitmap;
        if (bitmap2 != null) {
            bitmap2.eraseColor(0);
        }
        notifyChanged();
    }

    @Override // com.cby.shareboard.widget.IDoodleCallback
    public void clear() {
    }

    @Override // com.cby.shareboard.widget.IDoodleCallback
    public void end() {
    }

    public final int getStandardCanvasHeight() {
        int i4 = this.mStandardHeight;
        return i4 > 0 ? i4 : this.FALLBACK_CANVAS_HEIGHT;
    }

    public final int getStandardCanvasWidth() {
        int i4 = this.mStandardWidth;
        return i4 > 0 ? i4 : this.FALLBACK_CANVAS_WIDTH;
    }

    @m
    /* renamed from: getTransactionManager, reason: from getter */
    public final TransactionManager getMTransactionManager() {
        return this.mTransactionManager;
    }

    @Override // com.cby.shareboard.widget.IDoodleCallback
    public void go(int index) {
        throw new g0(ProtectedSandApp.s("\u0bdd"));
    }

    public final void handleTransaction(@l List<Transaction> transactions) {
        TransactionManager transactionManager;
        l0.p(transactions, ProtectedSandApp.s("\u0bde"));
        getLogger().debug(ProtectedSandApp.s("\u0bdf") + transactions);
        if (transactions.isEmpty()) {
            return;
        }
        synchronized (this) {
            try {
                for (Transaction transaction : w.u5(transactions, new Comparator() { // from class: com.cby.shareboard.draw.widget.DrawBoardView$handleTransaction$lambda$22$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t4, T t5) {
                        Transaction transaction2 = (Transaction) t4;
                        Transaction transaction3 = (Transaction) t5;
                        return kotlin.comparisons.a.l(transaction2 != null ? Long.valueOf(transaction2.getTimestamp()) : null, transaction3 != null ? Long.valueOf(transaction3.getTimestamp()) : null);
                    }
                })) {
                    if (transaction != null && ((transactionManager = this.mTransactionManager) == null || !transactionManager.isInTotalCache(transaction))) {
                        TransactionManager transactionManager2 = this.mTransactionManager;
                        if (transactionManager2 != null) {
                            transactionManager2.saveToTotalCache(transaction);
                        }
                        processTransaction(transaction);
                    }
                }
                k2 k2Var = k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void init(@l JoinConfig config) {
        l0.p(config, ProtectedSandApp.s("\u0be0"));
        this.mJoinConfig = config;
        if (!isInitialized()) {
            throw new IllegalStateException(ProtectedSandApp.s("\u0be1"));
        }
        Context context = getContext();
        l0.o(context, ProtectedSandApp.s("\u0b96"));
        TransactionManager transactionManager = new TransactionManager(context, config.getRoomId(), config.getNeedPushData(), config.getNeedPullData(), 0L, 16, null);
        transactionManager.setUserId(config.getUserId());
        this.mTransactionManager = transactionManager;
    }

    public final void initData(@l final List<Transaction> list) {
        l0.p(list, ProtectedSandApp.s("\u0be2"));
        onPause();
        this.mLastNo = -1;
        this.mLastID = -1L;
        this.mLastPageId = -1L;
        this.mChannelMap.clear();
        Bitmap bitmap = this.mCurBgBitmap;
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        Bitmap bitmap2 = this.mDrawingBitmap;
        if (bitmap2 != null) {
            bitmap2.eraseColor(0);
        }
        notifyBoardListener();
        postDelayed(new Runnable() { // from class: com.cby.shareboard.draw.widget.a
            @Override // java.lang.Runnable
            public final void run() {
                DrawBoardView.initData$lambda$16(DrawBoardView.this, list);
            }
        }, 100L);
    }

    @Override // com.cby.shareboard.widget.IDoodleCallback
    public void next() {
        throw new g0(ProtectedSandApp.s("\u0bdd"));
    }

    public final void onDestroy() {
        this.isDrawing = false;
        TransactionManager transactionManager = this.mTransactionManager;
        if (transactionManager != null) {
            transactionManager.end();
        }
        release();
    }

    public final void onPause() {
        this.mCurrentDrawDelayTime = Long.MAX_VALUE;
    }

    public final void onResume() {
        this.mCurrentDrawDelayTime = this.mDrawDelayTime;
        if (l0.g(Looper.myLooper(), Looper.getMainLooper())) {
            this.isDrawing = true;
            if (new Thread(this).isAlive()) {
                return;
            }
            new Thread(this).start();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int w4, int h4, int oldw, int oldh) {
        super.onSizeChanged(w4, h4, oldw, oldh);
        LogUtils logger = getLogger();
        StringBuilder a5 = n1.a(ProtectedSandApp.s("\u0be3"), oldw, ProtectedSandApp.s("ு"), oldh, ProtectedSandApp.s("\u0be4"));
        a5.append(w4);
        a5.append(ProtectedSandApp.s("ு"));
        a5.append(h4);
        a5.append(ProtectedSandApp.s("ள"));
        logger.debug(a5.toString());
        if (this.mStandardWidth == 0 || this.mStandardHeight == 0) {
            this.mStandardWidth = this.FALLBACK_CANVAS_WIDTH;
            this.mStandardHeight = this.FALLBACK_CANVAS_HEIGHT;
            getLogger().debug(q2.a(ProtectedSandApp.s("௦"), this.mStandardWidth, ProtectedSandApp.s("\u0bc3"), this.mStandardHeight, ProtectedSandApp.s("ள")));
        } else {
            getLogger().debug(q2.a(ProtectedSandApp.s("\u0be5"), this.mStandardWidth, ProtectedSandApp.s("\u0bc3"), this.mStandardHeight, ProtectedSandApp.s("ள")));
        }
        updateUniformScaleParams(w4, h4);
        this.mBgDst = new RectF(0.0f, 0.0f, w4, h4);
        boolean z4 = oldw > 0 && oldh > 0 && !(oldw == w4 && oldh == h4);
        prepareDrawingBitmap(oldw, oldh, z4);
        if (z4) {
            synchronized (this.mChannelMap) {
                try {
                    Iterator<T> it = this.mChannelMap.values().iterator();
                    while (it.hasNext()) {
                        ((DoodleChannel) it.next()).getActions().clear();
                    }
                    k2 k2Var = k2.f75408a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            getLogger().debug(ProtectedSandApp.s("௧"));
        }
        this.mLastWidth = w4;
        this.mLastHeight = h4;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@l MotionEvent event) {
        TransactionManager transactionManager;
        l0.p(event, ProtectedSandApp.s("௨"));
        if (!isEnabled() || !isInitialized()) {
            return false;
        }
        float x4 = event.getX();
        float y4 = event.getY();
        int action = event.getAction() & 255;
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.mLastX = x4;
            this.mLastY = y4;
            long currentTimeMillis = System.currentTimeMillis();
            DoodleChannel selfDrawChannel = getSelfDrawChannel();
            int i4 = (int) (this.mPaintSize * this.mUniformScale);
            if (i4 < 1) {
                i4 = 1;
            }
            selfDrawChannel.setPaintSize(i4);
            selfDrawChannel.setPaintColor(this.mPaintColor);
            Action action2 = selfDrawChannel.getAction(currentTimeMillis, this.mActionType, x4, y4);
            if (action2 != null) {
                action2.onStart(x4, y4);
                selfDrawChannel.setChanged(true);
            }
            notifyChanged();
            TransactionManager transactionManager2 = this.mTransactionManager;
            if (transactionManager2 != null) {
                transactionManager2.setActionType(this.mActionType);
            }
            TransactionManager transactionManager3 = this.mTransactionManager;
            if (transactionManager3 != null) {
                transactionManager3.sendStartTransaction(currentTimeMillis, toStandardX(x4), toStandardY(y4), this.mPaintSize, this.mPaintColor);
            }
        } else if (action == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
            DoodleChannel selfDrawChannel2 = getSelfDrawChannel();
            Action action3 = selfDrawChannel2.getAction();
            if (action3 != null && (transactionManager = this.mTransactionManager) != null) {
                transactionManager.sendEndTransaction(toStandardX(x4), toStandardY(y4), (int) action3.getSize(), action3.getPaintColor());
            }
            selfDrawChannel2.addCurrentAction();
            selfDrawChannel2.setAction(null);
            selfDrawChannel2.setChanged(true);
            notifyChanged();
        } else if (action == 2) {
            DoodleChannel selfDrawChannel3 = getSelfDrawChannel();
            Action action4 = selfDrawChannel3.getAction();
            if (action4 != null) {
                action4.onMove(x4, y4);
                selfDrawChannel3.setChanged(true);
                notifyChanged();
                TransactionManager transactionManager4 = this.mTransactionManager;
                if (transactionManager4 != null) {
                    transactionManager4.sendMoveTransaction(toStandardX(x4), toStandardY(y4), (int) action4.getSize(), action4.getPaintColor());
                }
            }
            this.mLastX = x4;
            this.mLastY = y4;
        } else if (action == 3) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return true;
    }

    @Override // com.cby.shareboard.widget.IDoodleCallback
    public void previous() {
        throw new g0(ProtectedSandApp.s("\u0bdd"));
    }

    @Override // com.cby.shareboard.widget.IDoodleCallback
    public void redo() {
        if (canRedo()) {
            List<Long> redo = getSelfDrawChannel().redo();
            TransactionManager transactionManager = this.mTransactionManager;
            if (transactionManager != null) {
                transactionManager.sendRedoTransaction(redo);
            }
            notifyChanged();
        }
    }

    @SuppressLint({"NewApi"})
    public final void release() {
        try {
            this.mSurfaceHolder.getSurface().release();
            TransactionManager transactionManager = this.mTransactionManager;
            if (transactionManager != null) {
                transactionManager.end();
            }
            this.mTransactionManager = null;
            Bitmap bitmap = this.mDrawingBitmap;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.mDrawingBitmap = null;
            this.mDrawingCanvas = null;
            Bitmap bitmap2 = this.mBgBitmap;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.mBgBitmap = null;
            this.mBgSrc = null;
            this.mBgDst = null;
            Bitmap bitmap3 = this.mCurBgBitmap;
            if (bitmap3 != null) {
                bitmap3.recycle();
            }
            this.mCurBgBitmap = null;
            this.mChannelMap.clear();
        } catch (Exception e4) {
            getLogger().error(ProtectedSandApp.s("௩") + e4.getMessage());
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.isDrawing) {
            this.lock.lock();
            try {
                if (!isEnabled() && !checkChanged()) {
                    this.lock.unlock();
                    resetChannelsChangedStatus();
                    delayDrawing();
                }
                reDraw();
                notifyBoardListener();
                this.lock.unlock();
                resetChannelsChangedStatus();
                delayDrawing();
            } catch (Throwable th) {
                this.lock.unlock();
                throw th;
            }
        }
    }

    @Override // com.cby.shareboard.widget.IDoodleCallback
    public void scale(float sx, float sy, float focusX, float focusY) {
        throw new g0(ProtectedSandApp.s("\u0bdd"));
    }

    @Override // com.cby.shareboard.widget.IDoodleCallback
    public void setActionType(@l ActionType type) {
        l0.p(type, ProtectedSandApp.s("௪"));
        this.mActionType = type;
    }

    public final void setBgBitmap(@l Bitmap bitmap, @ScaleType int scaleType) {
        l0.p(bitmap, ProtectedSandApp.s("௫"));
        this.mBgBitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        this.mBgScaleType = scaleType;
    }

    public final void setBgColor(int color) {
        this.mBgColor = color;
    }

    public final void setImage(@l String filePath) {
        l0.p(filePath, ProtectedSandApp.s("௬"));
        setImage(filePath, 0.0f, 0.0f);
    }

    public final void setOnDrawBoardListener(@m DrawBoardListener listener) {
        this.mBoardListener = listener;
    }

    @Override // com.cby.shareboard.widget.IDoodleCallback
    public void setPaintColor(int color) {
        this.mPaintColor = color;
    }

    @Override // com.cby.shareboard.widget.IDoodleCallback
    public void setPaintSize(int size) {
        this.mPaintSize = size;
    }

    public final void setStandardCanvasSize(int width, int height) {
        String s4 = ProtectedSandApp.s("\u0bc3");
        if (width <= 0 || height <= 0) {
            getLogger().warn(q2.a(ProtectedSandApp.s("௶"), width, s4, height, ProtectedSandApp.s("௷")));
            return;
        }
        this.mStandardWidth = width;
        this.mStandardHeight = height;
        getLogger().debug(q2.a(ProtectedSandApp.s("௵"), this.mStandardWidth, s4, this.mStandardHeight, ProtectedSandApp.s("ள")));
    }

    @Override // com.cby.shareboard.widget.IDoodleCallback
    public void translate(float dx, float dy) {
        throw new g0(ProtectedSandApp.s("\u0bdd"));
    }

    @Override // com.cby.shareboard.widget.IDoodleCallback
    public void undo() {
        boolean canUndo = canUndo();
        String s4 = ProtectedSandApp.s("௸");
        if (!canUndo) {
            getLogger().debug(s4);
            return;
        }
        List<Long> undo = getSelfDrawChannel().undo();
        if (undo.isEmpty()) {
            getLogger().debug(s4);
            return;
        }
        TransactionManager transactionManager = this.mTransactionManager;
        if (transactionManager != null) {
            transactionManager.sendRevokeTransaction(undo);
        }
        Bitmap bitmap = this.mDrawingBitmap;
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        notifyChanged();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public DrawBoardView(@l Context context, @m AttributeSet attributeSet) {
        this(context, attributeSet, null, 4, null);
        l0.p(context, ProtectedSandApp.s("ஒ"));
    }

    public final void setImage(@l String filePath, float maxWidth, float maxHeight) {
        l0.p(filePath, ProtectedSandApp.s("௬"));
        if (!isInitialized()) {
            throw new IllegalStateException(ProtectedSandApp.s("\u0b97"));
        }
        FileUtil fileUtil = FileUtil.INSTANCE;
        Bitmap filePathToBitmap = fileUtil.filePathToBitmap(filePath);
        if (filePathToBitmap == null) {
            return;
        }
        int width = filePathToBitmap.getWidth();
        int height = filePathToBitmap.getHeight();
        Float valueOf = Float.valueOf(maxWidth > 0.0f ? Math.min(maxWidth, getMeasuredWidth()) : getMeasuredWidth());
        if (valueOf.floatValue() <= 0.0f) {
            valueOf = null;
        }
        float floatValue = valueOf != null ? valueOf.floatValue() : 1.0f;
        Float valueOf2 = Float.valueOf(maxHeight > 0.0f ? Math.min(maxHeight, getMeasuredHeight()) : getMeasuredHeight());
        if (valueOf2.floatValue() <= 0.0f) {
            valueOf2 = null;
        }
        float floatValue2 = valueOf2 != null ? valueOf2.floatValue() : 1.0f;
        float f4 = width;
        Float valueOf3 = Float.valueOf((f4 * 1.0f) / floatValue);
        double floatValue3 = valueOf3.floatValue();
        if (p.f60679p > floatValue3 || floatValue3 > 1.0d) {
            valueOf3 = null;
        }
        float floatValue4 = valueOf3 != null ? valueOf3.floatValue() : 1.0f;
        float f5 = height;
        Float valueOf4 = Float.valueOf((f5 * 1.0f) / floatValue2);
        double floatValue5 = valueOf4.floatValue();
        Float f6 = (p.f60679p > floatValue5 || floatValue5 > 1.0d) ? null : valueOf4;
        float floatValue6 = f6 != null ? f6.floatValue() : 1.0f;
        if (floatValue4 < floatValue6) {
            floatValue6 = floatValue4;
        }
        k1.e eVar = new k1.e();
        k1.e eVar2 = new k1.e();
        if (floatValue6 > 0.0f && floatValue6 < 1.0f) {
            eVar.f75326b = f4.a(f4, floatValue6, floatValue, 2.0f);
            eVar2.f75326b = f4.a(f5, floatValue6, floatValue2, 2.0f);
        }
        float f7 = eVar.f75326b;
        float f10 = eVar2.f75326b;
        String s4 = ProtectedSandApp.s("௭");
        String s5 = ProtectedSandApp.s("௮");
        StringBuilder a5 = n1.a(s4, width, s5, height, ProtectedSandApp.s("௯"));
        a5.append(floatValue);
        a5.append(s5);
        a5.append(floatValue2);
        a5.append(ProtectedSandApp.s("௰"));
        a5.append(floatValue6);
        a5.append(ProtectedSandApp.s("௱"));
        a5.append(f7);
        a5.append(ProtectedSandApp.s("௲"));
        a5.append(f10);
        a5.append(ProtectedSandApp.s("௳"));
        getLogger().debug(v.p(a5.toString()));
        String fileToBase64 = fileUtil.fileToBase64(filePath);
        if (fileToBase64 == null) {
            fileToBase64 = "";
        }
        printDataSize(ProtectedSandApp.s("௴"), fileToBase64);
        handleImage(getSelfDrawChannel(), System.currentTimeMillis(), filePathToBitmap, eVar.f75326b, eVar2.f75326b, floatValue6 * this.mUniformScale, true, new DrawBoardView$setImage$2(this, eVar, eVar2, width, height, floatValue6, filePath));
    }

    public /* synthetic */ DrawBoardView(Context context, AttributeSet attributeSet, Integer num, int i4, kotlin.jvm.internal.w wVar) {
        this(context, (i4 & 2) != 0 ? null : attributeSet, (i4 & 4) != 0 ? 0 : num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public DrawBoardView(@l Context context, @m AttributeSet attributeSet, @m Integer num) {
        super(context, attributeSet, num != null ? num.intValue() : 0);
        l0.p(context, ProtectedSandApp.s("ஒ"));
        this.logger = c0.c(new DrawBoardView$logger$2(this));
        this.mDrawDelayTime = 32L;
        this.mCurrentDrawDelayTime = 32L;
        SurfaceHolder holder = getHolder();
        l0.o(holder, ProtectedSandApp.s("ஓ"));
        this.mSurfaceHolder = holder;
        this.lock = new ReentrantLock();
        this.mBgScaleType = 1;
        this.mChannelMap = new LinkedHashMap();
        this.mLastPageId = -1L;
        this.mLastNo = -1;
        this.mLastID = -1L;
        this.mActionType = ActionType.Path;
        this.mPaintSize = 10;
        this.mPaintColor = x1.f27484y;
        this.mScale = 1.0f;
        this.FALLBACK_CANVAS_WIDTH = 1920;
        this.FALLBACK_CANVAS_HEIGHT = 960;
        this.mUniformScale = 1.0f;
        this.mSurfaceHolder.addCallback(new SurfaceHolder.Callback() { // from class: com.cby.shareboard.draw.widget.DrawBoardView.1
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(@l SurfaceHolder holder2, int format, int width, int height) {
                l0.p(holder2, ProtectedSandApp.s("அ"));
                DrawBoardView.this.getLogger().debug(ProtectedSandApp.s("ஆ"));
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(@l SurfaceHolder holder2) {
                l0.p(holder2, ProtectedSandApp.s("அ"));
                DrawBoardView.this.getLogger().debug(ProtectedSandApp.s("இ"));
                if (new Thread(DrawBoardView.this).isAlive()) {
                    return;
                }
                DrawBoardView.this.isDrawing = true;
                new Thread(DrawBoardView.this).start();
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(@l SurfaceHolder holder2) {
                l0.p(holder2, ProtectedSandApp.s("அ"));
                DrawBoardView.this.getLogger().debug(ProtectedSandApp.s("ஈ"));
                DrawBoardView drawBoardView = DrawBoardView.this;
                synchronized (this) {
                    drawBoardView.isDrawing = false;
                    k2 k2Var = k2.f75408a;
                }
            }
        });
        setZOrderOnTop(true);
        setZOrderMediaOverlay(true);
        this.mSurfaceHolder.setFormat(-3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}

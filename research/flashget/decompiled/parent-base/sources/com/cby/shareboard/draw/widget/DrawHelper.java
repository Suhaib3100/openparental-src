package com.cby.shareboard.draw.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.WindowManager;
import androidx.annotation.x0;
import androidx.collection.n1;
import androidx.compose.material3.f4;
import androidx.compose.runtime.snapshots.f0;
import androidx.compose.ui.input.pointer.s;
import androidx.core.content.d;
import androidx.core.view.x1;
import com.cby.shareboard.DoodleChannel;
import com.cby.shareboard.TransactionManager;
import com.cby.shareboard.action.Action;
import com.cby.shareboard.action.ActionType;
import com.cby.shareboard.action.MyImage;
import com.cby.shareboard.draw.listener.DrawBoardListener;
import com.cby.shareboard.draw.model.DrawBoardSize;
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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.b0;
import kotlin.c0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.text.r;
import kotlin.text.v;
import kotlin.z0;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.s0;

/* compiled from: DrawHelper.kt */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0004\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 Ö\u00012\u00020\u00012\u00020\u0002:\u0002Ö\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\tJ\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\u001cJn\u00103\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00102\b\b\u0002\u0010,\u001a\u00020+2#\b\u0002\u00102\u001a\u001d\u0012\u0013\u0012\u00110.¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u00070-H\u0002¢\u0006\u0004\b3\u00104J\u0019\u00107\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\"2\u0006\u00109\u001a\u000205H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\"H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020+H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020+H\u0002¢\u0006\u0004\b@\u0010?J\u000f\u0010A\u001a\u00020\u0007H\u0002¢\u0006\u0004\bA\u0010\tJ\u001f\u0010D\u001a\u00020\u00072\u0006\u0010B\u001a\u0002052\u0006\u0010C\u001a\u000205H\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u0002052\u0006\u0010C\u001a\u000205H\u0002¢\u0006\u0004\bF\u00108J\u0017\u0010H\u001a\u00020+2\u0006\u0010G\u001a\u000205H\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0007H\u0016¢\u0006\u0004\bJ\u0010\tJ\r\u0010K\u001a\u00020\u0007¢\u0006\u0004\bK\u0010\tJ\r\u0010L\u001a\u00020\u0007¢\u0006\u0004\bL\u0010\tJ\r\u0010M\u001a\u00020\u0007¢\u0006\u0004\bM\u0010\tJ\r\u0010N\u001a\u00020\u0007¢\u0006\u0004\bN\u0010\tJ\u000f\u0010O\u001a\u00020\u0007H\u0007¢\u0006\u0004\bO\u0010\tJ%\u0010R\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020P2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\bR\u0010SJ\u001d\u0010U\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010T\u001a\u00020\u000e¢\u0006\u0004\bU\u0010VJ\u001b\u0010X\u001a\u00020\u00072\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d¢\u0006\u0004\bX\u0010YJ\u001d\u0010[\u001a\u00020\u00072\u000e\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001d¢\u0006\u0004\b[\u0010YJ\u000f\u0010]\u001a\u0004\u0018\u00010\\¢\u0006\u0004\b]\u0010^J\u0015\u0010`\u001a\u00020\u00072\u0006\u0010_\u001a\u00020\u000e¢\u0006\u0004\b`\u0010aJ\u001f\u0010c\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&2\b\b\u0003\u0010b\u001a\u00020\u000e¢\u0006\u0004\bc\u0010dJ\u0017\u0010g\u001a\u00020\u00072\b\u0010f\u001a\u0004\u0018\u00010e¢\u0006\u0004\bg\u0010hJ\u0015\u0010j\u001a\u00020\u00072\u0006\u0010i\u001a\u000205¢\u0006\u0004\bj\u0010kJ%\u0010j\u001a\u00020\u00072\u0006\u0010i\u001a\u0002052\u0006\u0010l\u001a\u00020\u00102\u0006\u0010m\u001a\u00020\u0010¢\u0006\u0004\bj\u0010nJ\u000f\u0010o\u001a\u00020\u0007H\u0016¢\u0006\u0004\bo\u0010\tJ\u000f\u0010p\u001a\u00020+H\u0016¢\u0006\u0004\bp\u0010?J\u000f\u0010q\u001a\u00020\u0007H\u0016¢\u0006\u0004\bq\u0010\tJ\u000f\u0010r\u001a\u00020+H\u0016¢\u0006\u0004\br\u0010?J\u000f\u0010s\u001a\u00020\u0007H\u0016¢\u0006\u0004\bs\u0010\tJ\u000f\u0010t\u001a\u00020\u0007H\u0016¢\u0006\u0004\bt\u0010\tJ\u000f\u0010u\u001a\u00020\u0007H\u0016¢\u0006\u0004\bu\u0010\tJ\u000f\u0010v\u001a\u00020+H\u0016¢\u0006\u0004\bv\u0010?J\u0017\u0010x\u001a\u00020\u00072\u0006\u0010w\u001a\u00020\u000eH\u0016¢\u0006\u0004\bx\u0010aJ\u0010\u0010y\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\by\u0010\tJ\u000f\u0010z\u001a\u00020+H\u0016¢\u0006\u0004\bz\u0010?J\u001f\u0010}\u001a\u00020\u00072\u0006\u0010{\u001a\u00020\u00102\u0006\u0010|\u001a\u00020\u0010H\u0016¢\u0006\u0004\b}\u0010~J3\u0010*\u001a\u00020\u00072\u0006\u0010\u007f\u001a\u00020\u00102\u0007\u0010\u0080\u0001\u001a\u00020\u00102\u0007\u0010\u0081\u0001\u001a\u00020\u00102\u0007\u0010\u0082\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b*\u0010\u0083\u0001J\u001c\u0010\u0086\u0001\u001a\u00020\u00072\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0019\u0010\u0088\u0001\u001a\u00020\u00072\u0006\u0010_\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0088\u0001\u0010aJ\u001a\u0010\u008a\u0001\u001a\u00020\u00072\u0007\u0010\u0089\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u008a\u0001\u0010aJ\u0011\u0010\u008b\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\b\u008b\u0001\u0010\tJ\u0018\u0010\u008c\u0001\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0018\u0010\u008e\u0001\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0006\b\u008e\u0001\u0010\u008d\u0001J\u0018\u0010\u008f\u0001\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0006\b\u008f\u0001\u0010\u008d\u0001J\u0018\u0010\u0090\u0001\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0006\b\u0090\u0001\u0010\u008d\u0001J\"\u0010\u0093\u0001\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0092\u0001\u001a\u00030\u0091\u0001¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001a\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\u000f\n\u0005\b\u0004\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R!\u0010\u009d\u0001\u001a\u00030\u0098\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0019\u0010\u009e\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0019\u0010 \u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010\u009f\u0001R\u001b\u0010¡\u0001\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001b\u0010£\u0001\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0019\u0010¥\u0001\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010¨\u0001\u001a\u00030§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0019\u0010ª\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u001b\u0010¬\u0001\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u001b\u0010®\u0001\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010\u00ad\u0001R\u001c\u0010°\u0001\u001a\u0005\u0018\u00010¯\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u001c\u0010³\u0001\u001a\u0005\u0018\u00010²\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R \u0010µ\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u000f\n\u0006\bµ\u0001\u0010«\u0001\u0012\u0005\b¶\u0001\u0010\tR\u001b\u0010·\u0001\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010\u00ad\u0001R\u001b\u0010¸\u0001\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010¤\u0001R\u0019\u0010¹\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010«\u0001R\u0019\u0010º\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010«\u0001R$\u0010¼\u0001\u001a\u000f\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\"0»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u001b\u0010¾\u0001\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u001b\u0010À\u0001\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0019\u0010Â\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010\u009f\u0001R\u0019\u0010Ã\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010«\u0001R\u0019\u0010Ä\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010\u009f\u0001R\u001a\u0010Å\u0001\u001a\u00030\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u0019\u0010Ç\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010«\u0001R\u0019\u0010È\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010«\u0001R\u0019\u0010É\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\"\u0010Í\u0001\u001a\r Ì\u0001*\u0005\u0018\u00010Ë\u00010Ë\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÍ\u0001\u0010Î\u0001R\u001c\u0010Ð\u0001\u001a\u0005\u0018\u00010Ï\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u0019\u0010Ò\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010«\u0001R\u0019\u0010Ó\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010«\u0001R\u0019\u0010Ô\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010«\u0001R\u0019\u0010Õ\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010«\u0001¨\u0006×\u0001"}, d2 = {"Lcom/cby/shareboard/draw/widget/DrawHelper;", "Lcom/cby/shareboard/widget/IDoodleCallback;", "Ljava/lang/Runnable;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lkotlin/k2;", "delayPauseDrawing", "()V", "draw", "notifyBoardListener", "resetChannelsChangedStatus", "delayDrawing", "", "w", "", "calculateScale", "(I)F", "prepareDrawingBitmap", "Landroid/graphics/Canvas;", "canvas", "drawBackground", "(Landroid/graphics/Canvas;)V", "drawActions", "Lcom/cby/shareboard/model/Transaction;", "transaction", "processTransaction", "(Lcom/cby/shareboard/model/Transaction;)V", "", "totalCacheList", "handleNonContinuousTransaction", "(Lcom/cby/shareboard/model/Transaction;Ljava/util/List;)V", "onTransactionDraw", "Lcom/cby/shareboard/DoodleChannel;", "doodleChannel", "", "id", "Landroid/graphics/Bitmap;", "bitmap", "x", "y", "scale", "", "sendToRemote", "Lkotlin/Function1;", "Lcom/cby/shareboard/action/Action;", "Lkotlin/r0;", "name", "action", "onSendToRemote", "handleImage", "(Lcom/cby/shareboard/DoodleChannel;JLandroid/graphics/Bitmap;FFFZLld/l;)V", "", "base64String", "base64ToBitmap", "(Ljava/lang/String;)Ljava/lang/String;", "key", "getDrawChannel", "(Ljava/lang/String;)Lcom/cby/shareboard/DoodleChannel;", "getSelfDrawChannel", "()Lcom/cby/shareboard/DoodleChannel;", "isInitialized", "()Z", "checkChanged", "notifyChanged", "source", "input", "printDataSize", "(Ljava/lang/String;Ljava/lang/String;)V", "imageBase64UrlDecode", "s", "isValidBase64", "(Ljava/lang/String;)Z", "run", "start", "onResume", "onPause", "onDestroy", "release", "Lcom/cby/shareboard/draw/model/JoinConfig;", "config", "init", "(Landroid/content/Context;Lcom/cby/shareboard/draw/model/JoinConfig;Landroid/graphics/Canvas;)V", "h", "onSizeChanged", "(II)V", "list", "initData", "(Ljava/util/List;)V", "transactions", "handleTransaction", "Lcom/cby/shareboard/TransactionManager;", "getTransactionManager", "()Lcom/cby/shareboard/TransactionManager;", "color", "setBgColor", "(I)V", "scaleType", "setBgBitmap", "(Landroid/graphics/Bitmap;I)V", "Lcom/cby/shareboard/draw/listener/DrawBoardListener;", "listener", "setOnDrawBoardListener", "(Lcom/cby/shareboard/draw/listener/DrawBoardListener;)V", "filePath", "setImage", "(Ljava/lang/String;)V", "maxWidth", "maxHeight", "(Ljava/lang/String;FF)V", "undo", "canUndo", "redo", "canRedo", "clear", "clean", "previous", "canPrevious", "index", "go", "next", "canNext", "dx", "dy", "translate", "(FF)V", "sx", "sy", "focusX", "focusY", "(FFFF)V", "Lcom/cby/shareboard/action/ActionType;", "type", "setActionType", "(Lcom/cby/shareboard/action/ActionType;)V", "setPaintColor", "size", "setPaintSize", "end", "getDisplayWidth", "(Landroid/content/Context;)I", "getDisplayHeight", "getScreenWidth", "getScreenHeight", "", "value", "px2dp", "(Landroid/content/Context;Ljava/lang/Number;)F", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/cby/shareboard/utils/LogUtils;", "logger$delegate", "Lkotlin/b0;", "getLogger", "()Lcom/cby/shareboard/utils/LogUtils;", "logger", "mDrawDelayTime", "J", "mCurrentDrawDelayTime", "mBoardListener", "Lcom/cby/shareboard/draw/listener/DrawBoardListener;", "mCanvas", "Landroid/graphics/Canvas;", "isDrawing", "Z", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "mBgColor", "I", "mCurBgBitmap", "Landroid/graphics/Bitmap;", "mBgBitmap", "Landroid/graphics/Rect;", "mBgSrc", "Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "mBgDst", "Landroid/graphics/RectF;", "mBgScaleType", "getMBgScaleType$annotations", "mDrawingBitmap", "mDrawingCanvas", "mDisplayWidth", "mDisplayHeight", "", "mChannelMap", "Ljava/util/Map;", "mJoinConfig", "Lcom/cby/shareboard/draw/model/JoinConfig;", "mTransactionManager", "Lcom/cby/shareboard/TransactionManager;", "mLastPageId", "mLastNo", "mLastID", "mActionType", "Lcom/cby/shareboard/action/ActionType;", "mPaintSize", "mPaintColor", "mScale", "F", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "executor", "Ljava/util/concurrent/ExecutorService;", "Lkotlinx/coroutines/k2;", "mDelayPauseDrawing", "Lkotlinx/coroutines/k2;", "mCanvasWidth", "mCanvasHeight", "mBitmapWith", "mBitmapHeight", "Companion", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@x0(13)
@r1({"SMAP\nDrawHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawHelper.kt\ncom/cby/shareboard/draw/widget/DrawHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,1095:1\n1#2:1096\n1855#3,2:1097\n1855#3,2:1099\n1549#3:1101\n1620#3,3:1102\n766#3:1105\n857#3,2:1106\n1855#3,2:1108\n1549#3:1110\n1620#3,3:1111\n766#3:1114\n857#3,2:1115\n1855#3,2:1117\n31#4:1119\n31#4:1120\n*S KotlinDebug\n*F\n+ 1 DrawHelper.kt\ncom/cby/shareboard/draw/widget/DrawHelper\n*L\n470#1:1097,2\n586#1:1099,2\n653#1:1101\n653#1:1102,3\n655#1:1105\n655#1:1106,2\n655#1:1108,2\n664#1:1110\n664#1:1111,3\n665#1:1114\n665#1:1115,2\n665#1:1117,2\n1022#1:1119\n1037#1:1120\n*E\n"})
/* loaded from: classes3.dex */
public final class DrawHelper implements IDoodleCallback, Runnable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion(null);

    @m
    @SuppressLint({"StaticFieldLeak"})
    private static DrawHelper instance;

    @l
    private final Context context;
    private final ExecutorService executor;
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
    private int mBitmapHeight;
    private int mBitmapWith;

    @m
    private DrawBoardListener mBoardListener;

    @m
    private Canvas mCanvas;
    private int mCanvasHeight;
    private int mCanvasWidth;

    @l
    private final Map<String, DoodleChannel> mChannelMap;

    @m
    private Bitmap mCurBgBitmap;
    private long mCurrentDrawDelayTime;

    @m
    private k2 mDelayPauseDrawing;
    private int mDisplayHeight;
    private int mDisplayWidth;
    private long mDrawDelayTime;

    @m
    private Bitmap mDrawingBitmap;

    @m
    private Canvas mDrawingCanvas;

    @m
    private JoinConfig mJoinConfig;
    private long mLastID;
    private int mLastNo;
    private long mLastPageId;
    private int mPaintColor;
    private int mPaintSize;
    private float mScale;

    @m
    private TransactionManager mTransactionManager;

    /* compiled from: DrawHelper.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/cby/shareboard/draw/widget/DrawHelper$Companion;", "", "()V", "instance", "Lcom/cby/shareboard/draw/widget/DrawHelper;", "getInstance", "context", "Landroid/content/Context;", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final DrawHelper getInstance(@l Context context) {
            DrawHelper drawHelper;
            l0.p(context, ProtectedSandApp.s("௹"));
            synchronized (DrawHelper.class) {
                try {
                    if (DrawHelper.instance == null) {
                        Companion companion = DrawHelper.INSTANCE;
                        DrawHelper.instance = new DrawHelper(context, null);
                        drawHelper = DrawHelper.instance;
                        l0.m(drawHelper);
                    } else {
                        drawHelper = DrawHelper.instance;
                        l0.m(drawHelper);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return drawHelper;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DrawHelper(Context context, w wVar) {
        this(context);
    }

    private final String base64ToBitmap(String base64String) {
        String a5 = s.a(ProtectedSandApp.s("ఋ"), System.currentTimeMillis(), ProtectedSandApp.s("ఌ"));
        FileUtil fileUtil = FileUtil.INSTANCE;
        String createFile = fileUtil.createFile(new File(fileUtil.getCachePath(this.context), a5));
        if (fileUtil.base64ToFile(base64String, createFile)) {
            return createFile;
        }
        return null;
    }

    private final float calculateScale(int w4) {
        int displayWidth = getDisplayWidth(this.context);
        float f4 = (w4 == 0 || displayWidth == 0) ? 1.0f : displayWidth / w4;
        LogUtils logger = getLogger();
        StringBuilder a5 = n1.a(ProtectedSandApp.s("\u0c0d"), w4, ProtectedSandApp.s("ఎ"), displayWidth, ProtectedSandApp.s("ఏ"));
        a5.append(f4);
        logger.debug(a5.toString());
        return f4;
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
        getLogger().debug(ProtectedSandApp.s("ఐ") + this.mCurrentDrawDelayTime);
        long j4 = this.mCurrentDrawDelayTime;
        if (j4 != 0) {
            try {
                Thread.sleep(j4);
            } catch (InterruptedException unused) {
                Thread.interrupted();
                getLogger().debug(ProtectedSandApp.s("\u0c11"));
            }
        }
    }

    private final void delayPauseDrawing() {
        k2 f4;
        k2 k2Var = this.mDelayPauseDrawing;
        if (k2Var != null) {
            l0.m(k2Var);
            if (k2Var.isActive()) {
                return;
            }
        }
        getLogger().debug(ProtectedSandApp.s("ఒ"));
        f4 = k.f(s0.a(j1.c()), null, null, new DrawHelper$delayPauseDrawing$1(this, null), 3, null);
        f4.F(new DrawHelper$delayPauseDrawing$2$1(this));
        this.mDelayPauseDrawing = f4;
    }

    private final void draw() {
        String s4 = ProtectedSandApp.s("ఓ");
        getLogger().debug(ProtectedSandApp.s("ఔ"));
        Canvas canvas = this.mCanvas;
        if (canvas != null) {
            try {
                canvas.setBitmap(this.mDrawingBitmap);
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
            } catch (Exception e4) {
                getLogger().error(s4 + e4.getMessage());
            }
        }
    }

    private final void drawActions(Canvas canvas) {
        for (DoodleChannel doodleChannel : this.mChannelMap.values()) {
            int index = doodleChannel.index();
            if (index >= 0) {
                int i4 = 0;
                while (true) {
                    Action action = (Action) kotlin.collections.w.W2(doodleChannel.getActions(), i4);
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
        this.mCanvasWidth = canvas.getWidth();
        int height = canvas.getHeight();
        this.mCanvasHeight = height;
        Bitmap bitmap = this.mBgBitmap;
        if (bitmap != null) {
            l0.m(bitmap);
            createBitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        } else {
            createBitmap = Bitmap.createBitmap(this.mCanvasWidth, height, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(this.mBgColor);
        }
        this.mCurBgBitmap = createBitmap;
        if (createBitmap != null) {
            this.mBitmapWith = createBitmap.getWidth();
            int height2 = createBitmap.getHeight();
            this.mBitmapHeight = height2;
            int i5 = this.mCanvasWidth;
            int i6 = this.mBitmapWith;
            float f4 = i5 / i6;
            int i7 = this.mCanvasHeight;
            float f5 = i7 / height2;
            float f6 = i5 / i7;
            double d5 = i6 * 1.0d;
            Integer valueOf = Integer.valueOf(height2);
            if (valueOf.intValue() == 0) {
                valueOf = null;
            }
            double intValue = d5 / (valueOf != null ? valueOf.intValue() : 1);
            int i10 = 0;
            boolean z4 = ((double) f6) > intValue;
            int i11 = this.mBgScaleType;
            if (i11 == 1) {
                Rect rect = this.mBgSrc;
                RectF rectF = this.mBgDst;
                l0.m(rectF);
                canvas.drawBitmap(createBitmap, rect, rectF, (Paint) null);
                return;
            }
            if (i11 == 2) {
                if (z4) {
                    int i12 = (int) (this.mBitmapWith / f6);
                    this.mBitmapHeight = i12;
                    i4 = (int) f4.a(i12, f5, this.mCanvasHeight, 2.0f);
                } else {
                    int i13 = (int) (this.mBitmapHeight / f6);
                    this.mBitmapWith = i13;
                    i10 = (int) f4.a(i13, f4, this.mCanvasWidth, 2.0f);
                    i4 = 0;
                }
                Rect rect2 = new Rect(i10, i4, this.mBitmapWith + i10, this.mBitmapHeight + i4);
                this.mBgSrc = rect2;
                RectF rectF2 = this.mBgDst;
                l0.m(rectF2);
                canvas.drawBitmap(createBitmap, rect2, rectF2, (Paint) null);
                return;
            }
            if (i11 != 3) {
                Rect rect3 = this.mBgSrc;
                RectF rectF3 = this.mBgDst;
                l0.m(rectF3);
                canvas.drawBitmap(createBitmap, rect3, rectF3, (Paint) null);
                return;
            }
            if (f4 >= f5) {
                f4 = f5;
            }
            float a5 = f4.a(this.mBitmapWith, f4, this.mCanvasWidth, 2.0f);
            float a6 = f4.a(this.mBitmapHeight, f4, this.mCanvasHeight, 2.0f);
            Matrix matrix = new Matrix();
            matrix.postScale(f4, f4);
            matrix.postTranslate(a5, a6);
            canvas.drawBitmap(createBitmap, matrix, null);
        }
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
            throw new IllegalStateException(ProtectedSandApp.s("క"));
        }
        JoinConfig joinConfig = this.mJoinConfig;
        l0.m(joinConfig);
        return getDrawChannel(joinConfig.getUserId());
    }

    private final synchronized void handleImage(DoodleChannel doodleChannel, long id2, Bitmap bitmap, float x4, float y4, float scale, boolean sendToRemote, ld.l<? super Action, kotlin.k2> onSendToRemote) {
        String s4 = ProtectedSandApp.s("ఖ");
        String s5 = ProtectedSandApp.s("గ");
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

    static /* synthetic */ void handleImage$default(DrawHelper drawHelper, DoodleChannel doodleChannel, long j4, Bitmap bitmap, float f4, float f5, float f6, boolean z4, ld.l lVar, int i4, Object obj) {
        drawHelper.handleImage(doodleChannel, j4, bitmap, f4, f5, f6, (i4 & 64) != 0 ? false : z4, (i4 & 128) != 0 ? DrawHelper$handleImage$1.INSTANCE : lVar);
    }

    private final void handleNonContinuousTransaction(Transaction transaction, List<Transaction> totalCacheList) {
        kotlin.k2 k2Var;
        List u5;
        getLogger().debug(ProtectedSandApp.s("ఘ") + transaction.getId() + ProtectedSandApp.s("ఙ") + transaction.getNo() + ProtectedSandApp.s("చ") + ((int) transaction.getStep()));
        if (totalCacheList == null || (u5 = kotlin.collections.w.u5(totalCacheList, kotlin.comparisons.a.h(DrawHelper$handleNonContinuousTransaction$1.INSTANCE, DrawHelper$handleNonContinuousTransaction$2.INSTANCE))) == null) {
            k2Var = null;
        } else {
            Bitmap bitmap = this.mDrawingBitmap;
            if (bitmap != null) {
                bitmap.eraseColor(0);
            }
            getDrawChannel(transaction.getUserId()).clear();
            getLogger().debug(ProtectedSandApp.s("ఛ") + u5.size());
            Iterator it = u5.iterator();
            while (it.hasNext()) {
                onTransactionDraw((Transaction) it.next());
            }
            k2Var = kotlin.k2.f75408a;
        }
        if (k2Var == null) {
            onTransactionDraw(transaction);
        }
    }

    private final String imageBase64UrlDecode(String input) {
        try {
            String decode = URLDecoder.decode(input, ProtectedSandApp.s("జ"));
            l0.o(decode, ProtectedSandApp.s("ఝ"));
            getLogger().debug(ProtectedSandApp.s("ఞ"));
            return decode;
        } catch (Exception unused) {
            getLogger().debug(ProtectedSandApp.s("ట"));
            return input;
        }
    }

    private final boolean isInitialized() {
        JoinConfig joinConfig = this.mJoinConfig;
        if (joinConfig == null) {
            getLogger().debug(ProtectedSandApp.s("ఠ"));
            return false;
        }
        l0.m(joinConfig);
        if (v.S1(joinConfig.getRoomId())) {
            getLogger().debug(ProtectedSandApp.s("డ"));
            return false;
        }
        JoinConfig joinConfig2 = this.mJoinConfig;
        l0.m(joinConfig2);
        if (v.S1(joinConfig2.getUserId())) {
            getLogger().debug(ProtectedSandApp.s("ఢ"));
            return false;
        }
        JoinConfig joinConfig3 = this.mJoinConfig;
        l0.m(joinConfig3);
        DrawBoardSize drawBoardSize = joinConfig3.getDrawBoardSize();
        if (drawBoardSize == null || !drawBoardSize.hasZero()) {
            return this.mJoinConfig != null;
        }
        getLogger().debug(ProtectedSandApp.s("ణ"));
        return false;
    }

    private final boolean isValidBase64(String s4) {
        return new r(ProtectedSandApp.s("త")).k(s4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyBoardListener() {
        TransactionManager transactionManager = this.mTransactionManager;
        boolean z4 = (transactionManager != null ? transactionManager.getTotalCacheSize() : 0) > 0;
        DrawBoardListener drawBoardListener = this.mBoardListener;
        if (drawBoardListener != null) {
            drawBoardListener.onDrawChanged(this.mDrawingBitmap, z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyChanged() {
        DrawBoardListener drawBoardListener = this.mBoardListener;
        if (drawBoardListener != null) {
            drawBoardListener.onActionChanged();
        }
    }

    private final synchronized void onTransactionDraw(Transaction transaction) {
        Bitmap bitmap;
        Float J0;
        String s4 = ProtectedSandApp.s("థ");
        String s5 = ProtectedSandApp.s("ద");
        String s6 = ProtectedSandApp.s("ధ");
        synchronized (this) {
            try {
                getLogger().debug(s6 + transaction.getPageId() + ProtectedSandApp.s("న") + transaction.getId() + ProtectedSandApp.s("ఙ") + transaction.getNo() + ProtectedSandApp.s("చ") + ((int) transaction.getStep()));
                if (((int) this.mLastPageId) == -1) {
                    this.mLastPageId = transaction.getPageId();
                }
                this.mLastNo = transaction.getNo();
                this.mLastID = transaction.getId();
                DoodleChannel drawChannel = getDrawChannel(transaction.getUserId());
                ActionType typeOfValue = ActionType.typeOfValue(transaction.getActionType());
                byte step = transaction.getStep();
                if (step == 1) {
                    drawChannel.setPaintSize(transaction.getPaintSize());
                    drawChannel.setPaintColor(transaction.getPaintColor());
                    long id2 = transaction.getId();
                    l0.m(typeOfValue);
                    Action action = drawChannel.getAction(id2, typeOfValue, transaction.getX(), transaction.getY());
                    if (action != null) {
                        action.onStart(transaction.getX(), transaction.getY());
                        drawChannel.setChanged(true);
                    }
                } else if (step == 2) {
                    Action action2 = drawChannel.getAction();
                    if (action2 != null) {
                        action2.onMove(transaction.getX(), transaction.getY());
                    }
                    drawChannel.setChanged(true);
                } else if (step == 3) {
                    drawChannel.addCurrentAction();
                    drawChannel.setAction(null);
                    drawChannel.setChanged(true);
                } else if (step == 12) {
                    if (transaction.getImageBase64() == null) {
                        getLogger().debug(ProtectedSandApp.s("\u0c29"));
                        return;
                    }
                    String imageBase64 = transaction.getImageBase64();
                    l0.m(imageBase64);
                    List R4 = v.R4(imageBase64, new String[]{ProtectedSandApp.s("ప")}, false, 0, 6, null);
                    if (R4.isEmpty()) {
                        getLogger().debug(ProtectedSandApp.s("ఫ"));
                        return;
                    }
                    int size = R4.size();
                    int i4 = size - 3;
                    String str = (String) kotlin.collections.w.W2(R4, i4);
                    String str2 = (String) kotlin.collections.w.W2(R4, size - 2);
                    String str3 = (String) kotlin.collections.w.W2(R4, size - 1);
                    float floatValue = (str3 == null || (J0 = v.J0(str3)) == null) ? 1.0f : J0.floatValue();
                    String m32 = kotlin.collections.w.m3(R4.subList(0, i4), ProtectedSandApp.s("ప"), null, null, 0, null, null, 62, null);
                    getLogger().debug(s5 + str + ProtectedSandApp.s("బ") + str2 + ProtectedSandApp.s("భ") + floatValue);
                    printDataSize(ProtectedSandApp.s("మ"), m32);
                    String imageBase64UrlDecode = imageBase64UrlDecode(m32);
                    printDataSize(ProtectedSandApp.s("య"), m32);
                    String base64ToBitmap = base64ToBitmap(v.i2(imageBase64UrlDecode, ProtectedSandApp.s("ర"), ProtectedSandApp.s("ఱ"), false, 4, null));
                    getLogger().debug(s4 + base64ToBitmap);
                    if (base64ToBitmap != null) {
                        Bitmap filePathToBitmap = FileUtil.INSTANCE.filePathToBitmap(base64ToBitmap);
                        if (filePathToBitmap != null) {
                            handleImage$default(this, drawChannel, transaction.getId(), filePathToBitmap, transaction.getX(), transaction.getY(), floatValue, false, null, 192, null);
                        }
                    }
                } else if (step == 4) {
                    List R42 = v.R4(transaction.getTargetIds(), new String[]{ProtectedSandApp.s("ప")}, false, 0, 6, null);
                    ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(R42, 10));
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
                    List R43 = v.R4(transaction.getTargetIds(), new String[]{ProtectedSandApp.s("ప")}, false, 0, 6, null);
                    ArrayList arrayList3 = new ArrayList(kotlin.collections.w.b0(R43, 10));
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

    private final void prepareDrawingBitmap() {
        Canvas canvas;
        Bitmap bitmap;
        int displayWidth = getDisplayWidth(this.context);
        int displayHeight = getDisplayHeight(this.context);
        LogUtils logger = getLogger();
        StringBuilder a5 = n1.a(ProtectedSandApp.s("ల"), displayWidth, ProtectedSandApp.s("ళ"), displayHeight, ProtectedSandApp.s("ఴ"));
        a5.append((displayWidth * 1.0d) / displayHeight);
        logger.debug(a5.toString());
        Bitmap bitmap2 = this.mDrawingBitmap;
        if (bitmap2 == null || bitmap2 == null || bitmap2.getWidth() != displayWidth || (bitmap = this.mDrawingBitmap) == null || bitmap.getHeight() != displayHeight) {
            Bitmap createBitmap = Bitmap.createBitmap(displayWidth, displayHeight, Bitmap.Config.ARGB_8888);
            this.mDrawingBitmap = createBitmap;
            if (createBitmap != null) {
                createBitmap.eraseColor(0);
            }
            if (this.mDrawingBitmap != null) {
                Bitmap bitmap3 = this.mDrawingBitmap;
                l0.m(bitmap3);
                canvas = new Canvas(bitmap3);
            } else {
                canvas = null;
            }
            this.mDrawingCanvas = canvas;
        }
    }

    private final void printDataSize(String source, String input) {
        k.f(s0.a(j1.c()), null, null, new DrawHelper$printDataSize$1(input, this, source, null), 3, null);
    }

    private final void processTransaction(Transaction transaction) {
        long pageId = transaction.getPageId();
        String userId = transaction.getUserId();
        LogUtils logger = getLogger();
        long j4 = this.mLastPageId;
        StringBuilder a5 = f0.a(ProtectedSandApp.s("వ"), pageId, ProtectedSandApp.s("శ"));
        a5.append(j4);
        logger.debug(a5.toString());
        long j5 = this.mLastPageId;
        if (pageId > j5) {
            getLogger().debug(ProtectedSandApp.s("ష") + pageId);
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
            getLogger().debug(ProtectedSandApp.s("\u0c3a"));
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
        getLogger().debug(ProtectedSandApp.s("స") + this.mLastNo + ProtectedSandApp.s("హ") + transaction.getNo());
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

    private final void resetChannelsChangedStatus() {
        synchronized (this.mChannelMap) {
            try {
                for (DoodleChannel doodleChannel : this.mChannelMap.values()) {
                    if (doodleChannel.isChanged()) {
                        doodleChannel.setChanged(false);
                    }
                }
            } catch (InterruptedException e4) {
                e4.printStackTrace();
            }
            kotlin.k2 k2Var = kotlin.k2.f75408a;
        }
    }

    public static /* synthetic */ void setBgBitmap$default(DrawHelper drawHelper, Bitmap bitmap, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 2;
        }
        drawHelper.setBgBitmap(bitmap, i4);
    }

    @Override // com.cby.shareboard.widget.IDoodleCallback
    public boolean canNext() {
        return false;
    }

    @Override // com.cby.shareboard.widget.IDoodleCallback
    public boolean canPrevious() {
        return false;
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

    @l
    public final Context getContext() {
        return this.context;
    }

    public final int getDisplayHeight(@l Context context) {
        l0.p(context, ProtectedSandApp.s("\u0c3b"));
        if (this.mDisplayHeight == 0) {
            this.mDisplayHeight = getDisplayWidth(context) / 2;
        }
        return this.mDisplayHeight;
    }

    public final int getDisplayWidth(@l Context context) {
        l0.p(context, ProtectedSandApp.s("\u0c3b"));
        if (this.mDisplayWidth == 0) {
            this.mDisplayWidth = getScreenWidth(context);
        }
        return this.mDisplayWidth;
    }

    public final int getScreenHeight(@l Context context) {
        l0.p(context, ProtectedSandApp.s("\u0c3b"));
        WindowManager windowManager = (WindowManager) d.getSystemService(context, WindowManager.class);
        if (windowManager == null) {
            return 0;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.y;
    }

    public final int getScreenWidth(@l Context context) {
        l0.p(context, ProtectedSandApp.s("\u0c3b"));
        WindowManager windowManager = (WindowManager) d.getSystemService(context, WindowManager.class);
        if (windowManager == null) {
            return 0;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.x;
    }

    @m
    /* renamed from: getTransactionManager, reason: from getter */
    public final TransactionManager getMTransactionManager() {
        return this.mTransactionManager;
    }

    @Override // com.cby.shareboard.widget.IDoodleCallback
    public void go(int index) {
    }

    public final void handleTransaction(@l List<Transaction> transactions) {
        Object a5;
        TransactionManager transactionManager;
        l0.p(transactions, ProtectedSandApp.s("఼"));
        getLogger().debug(ProtectedSandApp.s("ఽ") + transactions);
        if (transactions.isEmpty()) {
            return;
        }
        synchronized (this) {
            try {
                onPause();
                for (Transaction transaction : kotlin.collections.w.u5(kotlin.collections.w.s2(transactions), kotlin.comparisons.a.h(DrawHelper$handleTransaction$1$1.INSTANCE, DrawHelper$handleTransaction$1$2.INSTANCE))) {
                    try {
                        z0.Companion companion = z0.INSTANCE;
                        transactionManager = this.mTransactionManager;
                    } catch (Throwable th) {
                        z0.Companion companion2 = z0.INSTANCE;
                        a5 = a1.a(th);
                    }
                    if (transactionManager == null || !transactionManager.isInTotalCache(transaction)) {
                        TransactionManager transactionManager2 = this.mTransactionManager;
                        if (transactionManager2 != null) {
                            transactionManager2.saveToTotalCache(transaction);
                        }
                        processTransaction(transaction);
                        a5 = z0.b(kotlin.k2.f75408a);
                        Throwable e4 = z0.e(a5);
                        if (e4 != null) {
                            getLogger().error(ProtectedSandApp.s("ా") + e4.getMessage());
                        }
                    }
                }
                onResume();
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void init(@l Context context, @l JoinConfig config, @l Canvas canvas) {
        l0.p(context, ProtectedSandApp.s("\u0c3b"));
        l0.p(config, ProtectedSandApp.s("ి"));
        l0.p(canvas, ProtectedSandApp.s("ీ"));
        this.mCanvas = canvas;
        this.mJoinConfig = config;
        if (!isInitialized()) {
            throw new IllegalStateException(ProtectedSandApp.s("ు"));
        }
        TransactionManager transactionManager = new TransactionManager(context, config.getRoomId(), config.getNeedPushData(), config.getNeedPullData(), 0L, 16, null);
        transactionManager.setUserId(config.getUserId());
        this.mTransactionManager = transactionManager;
    }

    public final void initData(@l List<Transaction> list) {
        l0.p(list, ProtectedSandApp.s("ూ"));
        k.f(s0.a(j1.c()), null, null, new DrawHelper$initData$1(this, list, null), 3, null);
    }

    @Override // com.cby.shareboard.widget.IDoodleCallback
    public void next() {
    }

    public final void onDestroy() {
        getLogger().debug(ProtectedSandApp.s("ృ"));
        this.isDrawing = false;
        TransactionManager transactionManager = this.mTransactionManager;
        if (transactionManager != null) {
            transactionManager.end();
        }
        release();
    }

    public final void onPause() {
        getLogger().debug(ProtectedSandApp.s("ౄ"));
        this.mCurrentDrawDelayTime = Long.MAX_VALUE;
    }

    public final void onResume() {
        getLogger().debug(ProtectedSandApp.s("\u0c45"));
        this.isDrawing = true;
        long j4 = this.mCurrentDrawDelayTime;
        long j5 = this.mDrawDelayTime;
        if (j4 > j5) {
            this.mCurrentDrawDelayTime = j5;
            this.executor.shutdownNow();
            Thread.interrupted();
            k2 k2Var = this.mDelayPauseDrawing;
            if (k2Var != null) {
                k2.a.b(k2Var, null, 1, null);
            }
            this.mDelayPauseDrawing = null;
        }
    }

    public final void onSizeChanged(int w4, int h4) {
        JoinConfig joinConfig;
        JoinConfig joinConfig2 = this.mJoinConfig;
        if (joinConfig2 == null) {
            return;
        }
        if ((joinConfig2 != null ? joinConfig2.getDrawBoardSize() : null) == null && (joinConfig = this.mJoinConfig) != null) {
            joinConfig.setDrawBoardSize(new DrawBoardSize(w4, h4, w4, h4));
        }
        this.mScale = calculateScale(w4);
        this.mBgDst = new RectF(0.0f, 0.0f, getDisplayWidth(this.context), getDisplayHeight(this.context));
        prepareDrawingBitmap();
    }

    @Override // com.cby.shareboard.widget.IDoodleCallback
    public void previous() {
    }

    public final float px2dp(@l Context context, @l Number value) {
        l0.p(context, ProtectedSandApp.s("\u0c3b"));
        l0.p(value, ProtectedSandApp.s("ె"));
        return value.floatValue() / context.getResources().getDisplayMetrics().density;
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
            k2 k2Var = this.mDelayPauseDrawing;
            if (k2Var != null) {
                k2.a.b(k2Var, null, 1, null);
            }
            this.mDelayPauseDrawing = null;
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
            getLogger().error(ProtectedSandApp.s("ే") + e4.getMessage());
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        getLogger().debug(ProtectedSandApp.s("ై"));
        while (this.isDrawing) {
            this.lock.lock();
            try {
                draw();
                notifyBoardListener();
                if (!checkChanged()) {
                    delayPauseDrawing();
                }
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
    }

    @Override // com.cby.shareboard.widget.IDoodleCallback
    public void setActionType(@l ActionType type) {
        l0.p(type, ProtectedSandApp.s("\u0c49"));
        this.mActionType = type;
    }

    public final void setBgBitmap(@l Bitmap bitmap, @ScaleType int scaleType) {
        l0.p(bitmap, ProtectedSandApp.s("ొ"));
        this.mBgBitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        this.mBgScaleType = scaleType;
    }

    public final void setBgColor(int color) {
        this.mBgColor = color;
    }

    public final void setImage(@l String filePath) {
        l0.p(filePath, ProtectedSandApp.s("ో"));
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

    public final void start() {
        getLogger().debug(ProtectedSandApp.s("\u0c54"));
        this.isDrawing = true;
        this.executor.submit(this);
    }

    @Override // com.cby.shareboard.widget.IDoodleCallback
    public void translate(float dx, float dy) {
    }

    @Override // com.cby.shareboard.widget.IDoodleCallback
    public void undo() {
        boolean canUndo = canUndo();
        String s4 = ProtectedSandApp.s("ౕ");
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

    private DrawHelper(Context context) {
        this.context = context;
        this.logger = c0.c(new DrawHelper$logger$2(this));
        this.mDrawDelayTime = 128L;
        this.mCurrentDrawDelayTime = 128L;
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
        this.executor = Executors.newSingleThreadExecutor();
    }

    public final void setImage(@l String filePath, float maxWidth, float maxHeight) {
        l0.p(filePath, ProtectedSandApp.s("ో"));
        if (!isInitialized()) {
            throw new IllegalStateException(ProtectedSandApp.s("క"));
        }
        FileUtil fileUtil = FileUtil.INSTANCE;
        Bitmap filePathToBitmap = fileUtil.filePathToBitmap(filePath);
        if (filePathToBitmap == null) {
            return;
        }
        int width = filePathToBitmap.getWidth();
        int height = filePathToBitmap.getHeight();
        float displayWidth = getDisplayWidth(this.context);
        float displayHeight = getDisplayHeight(this.context);
        if (maxWidth > 0.0f) {
            displayWidth = Math.min(maxWidth, displayWidth);
        }
        Float valueOf = Float.valueOf(displayWidth);
        if (valueOf.floatValue() <= 0.0f) {
            valueOf = null;
        }
        float floatValue = valueOf != null ? valueOf.floatValue() : 1.0f;
        if (maxHeight > 0.0f) {
            displayHeight = Math.min(maxHeight, displayHeight);
        }
        Float valueOf2 = Float.valueOf(displayHeight);
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
        if (floatValue4 >= floatValue6) {
            floatValue4 = floatValue6;
        }
        k1.e eVar = new k1.e();
        k1.e eVar2 = new k1.e();
        if (floatValue4 > 0.0f && floatValue4 < 1.0f) {
            eVar.f75326b = f4.a(f4, floatValue4, floatValue, 2.0f);
            eVar2.f75326b = f4.a(f5, floatValue4, floatValue2, 2.0f);
        }
        float f7 = eVar.f75326b;
        float f10 = eVar2.f75326b;
        String s4 = ProtectedSandApp.s("ౌ");
        String s5 = ProtectedSandApp.s("్");
        StringBuilder a5 = n1.a(s4, width, s5, height, ProtectedSandApp.s("\u0c4e"));
        a5.append(floatValue);
        a5.append(s5);
        a5.append(floatValue2);
        a5.append(ProtectedSandApp.s("\u0c4f"));
        a5.append(floatValue4);
        a5.append(ProtectedSandApp.s("\u0c50"));
        a5.append(f7);
        a5.append(ProtectedSandApp.s("\u0c51"));
        a5.append(f10);
        a5.append(ProtectedSandApp.s("\u0c52"));
        getLogger().debug(v.p(a5.toString()));
        String fileToBase64 = fileUtil.fileToBase64(filePath);
        if (fileToBase64 == null) {
            fileToBase64 = "";
        }
        String str = fileToBase64;
        printDataSize(ProtectedSandApp.s("\u0c53"), str);
        handleImage(getSelfDrawChannel(), System.currentTimeMillis(), filePathToBitmap, eVar.f75326b, eVar2.f75326b, floatValue4, true, new DrawHelper$setImage$2(this, eVar, eVar2, width, height, floatValue4, str));
    }
}

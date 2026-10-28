package androidx.content;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.c1;
import androidx.collection.r2;
import androidx.content.c1;
import androidx.content.d0;
import androidx.content.f0;
import androidx.content.s;
import androidx.content.t0;
import androidx.content.w;
import androidx.core.app.x0;
import androidx.view.AbstractC1450w;
import androidx.view.InterfaceC1416b0;
import androidx.view.InterfaceC1421d0;
import androidx.view.InterfaceC1423e0;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.c0;
import androidx.view.n1;
import androidx.view.o1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.collections.j0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.k2;
import kotlin.q0;
import kotlinx.coroutines.flow.d0;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.t0;
import kotlinx.coroutines.flow.v0;
import ld.a;

/* compiled from: NavController.kt */
@Metadata(d1 = {"\u0000ð\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0016\u0018\u0000 ¯\u00022\u00020\u0001:\u0006¹\u0001¾\u0001Â\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJb\u0010\u0019\u001a\u00020\t*\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122#\b\u0002\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJP\u0010\u001e\u001a\u00020\t*\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2#\b\u0002\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\t0\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010#\u001a\u00020\u001c2\b\b\u0001\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0003¢\u0006\u0004\b#\u0010$J1\u0010(\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\u001c2\b\b\u0001\u0010!\u001a\u00020 H\u0003¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u001cH\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u001cH\u0002¢\u0006\u0004\b.\u0010-J\u000f\u0010/\u001a\u00020\u001cH\u0002¢\u0006\u0004\b/\u0010-J\u0019\u00102\u001a\u00020\t2\b\u00101\u001a\u0004\u0018\u000100H\u0003¢\u0006\u0004\b2\u00103J\u0019\u00107\u001a\u0004\u0018\u0001062\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u0004\u0018\u00010\r*\u00020\r2\b\b\u0001\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b9\u0010:J5\u0010=\u001a\u00020\t2\u0006\u0010;\u001a\u00020\r2\b\u0010<\u001a\u0004\u0018\u0001002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0003¢\u0006\u0004\b=\u0010>J5\u0010@\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020 2\b\u0010<\u001a\u0004\u0018\u0001002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b@\u0010AJ%\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%H\u0002¢\u0006\u0004\bC\u0010DJ9\u0010G\u001a\u00020\t2\u0006\u0010;\u001a\u00020\r2\b\u0010E\u001a\u0004\u0018\u0001002\u0006\u0010\u0017\u001a\u00020\u00062\u000e\b\u0002\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0002¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\tH\u0002¢\u0006\u0004\bI\u0010JJ\u0019\u0010K\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020\t2\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020\t2\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bQ\u0010PJ\u000f\u0010R\u001a\u00020\u001cH\u0017¢\u0006\u0004\bR\u0010-J!\u0010S\u001a\u00020\u001c2\b\b\u0001\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001cH\u0017¢\u0006\u0004\bS\u0010TJ)\u0010U\u001a\u00020\u001c2\b\b\u0001\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\bU\u0010$J)\u0010W\u001a\u00020\u001c2\u0006\u0010V\u001a\u0002062\u0006\u0010\"\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\bW\u0010XJ%\u0010[\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00062\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\t0YH\u0000¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020\u001c2\u0006\u0010V\u001a\u000206H\u0007¢\u0006\u0004\b]\u0010^J\u0019\u0010_\u001a\u00020\u001c2\b\b\u0001\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b_\u0010+J\u000f\u0010`\u001a\u00020\u001cH\u0017¢\u0006\u0004\b`\u0010-J\u000f\u0010a\u001a\u00020\tH\u0000¢\u0006\u0004\ba\u0010JJ\u0015\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0000¢\u0006\u0004\bb\u0010cJ\u0019\u0010e\u001a\u00020\t2\b\b\u0001\u0010d\u001a\u00020 H\u0017¢\u0006\u0004\be\u0010fJ#\u0010g\u001a\u00020\t2\b\b\u0001\u0010d\u001a\u00020 2\b\u00101\u001a\u0004\u0018\u000100H\u0017¢\u0006\u0004\bg\u0010hJ!\u0010k\u001a\u00020\t2\u0006\u0010j\u001a\u00020i2\b\u00101\u001a\u0004\u0018\u000100H\u0017¢\u0006\u0004\bk\u0010lJ\u0019\u0010o\u001a\u00020\u001c2\b\u0010n\u001a\u0004\u0018\u00010mH\u0017¢\u0006\u0004\bo\u0010pJ\u001b\u0010q\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\bq\u0010rJ\u0019\u0010t\u001a\u0004\u0018\u00010\r2\u0006\u0010s\u001a\u000206H\u0007¢\u0006\u0004\bt\u0010uJ\u0019\u0010w\u001a\u00020\t2\b\b\u0001\u0010v\u001a\u00020 H\u0017¢\u0006\u0004\bw\u0010fJ#\u0010x\u001a\u00020\t2\b\b\u0001\u0010v\u001a\u00020 2\b\u0010<\u001a\u0004\u0018\u000100H\u0017¢\u0006\u0004\bx\u0010hJ-\u0010y\u001a\u00020\t2\b\b\u0001\u0010v\u001a\u00020 2\b\u0010<\u001a\u0004\u0018\u0001002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\by\u0010zJ7\u0010{\u001a\u00020\t2\b\b\u0001\u0010v\u001a\u00020 2\b\u0010<\u001a\u0004\u0018\u0001002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b{\u0010|J\u0017\u0010~\u001a\u00020\t2\u0006\u00105\u001a\u00020}H\u0017¢\u0006\u0004\b~\u0010\u007fJ$\u0010\u0080\u0001\u001a\u00020\t2\u0006\u00105\u001a\u00020}2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J.\u0010\u0082\u0001\u001a\u00020\t2\u0006\u00105\u001a\u00020}2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001c\u0010\u0086\u0001\u001a\u00020\t2\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0017¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J&\u0010\u0088\u0001\u001a\u00020\t2\b\u0010\u0085\u0001\u001a\u00030\u0084\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J0\u0010\u008a\u0001\u001a\u00020\t2\b\u0010\u0085\u0001\u001a\u00030\u0084\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u001c\u0010\u008e\u0001\u001a\u00020\t2\b\u0010\u008d\u0001\u001a\u00030\u008c\u0001H\u0017¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J&\u0010\u0090\u0001\u001a\u00020\t2\b\u0010\u008d\u0001\u001a\u00030\u008c\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J$\u0010\u0092\u0001\u001a\u00020\t2\b\u0010\u008d\u0001\u001a\u00030\u008c\u00012\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J4\u0010\u0097\u0001\u001a\u00020\t2\u0006\u0010V\u001a\u0002062\u001a\u0010\u0096\u0001\u001a\u0015\u0012\u0005\u0012\u00030\u0094\u0001\u0012\u0004\u0012\u00020\t0\u0014¢\u0006\u0003\b\u0095\u0001¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J2\u0010\u0099\u0001\u001a\u00020\t2\u0006\u0010V\u001a\u0002062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0013\u0010\u009c\u0001\u001a\u00030\u009b\u0001H\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u0014\u0010\u009e\u0001\u001a\u0004\u0018\u000100H\u0017¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001c\u0010¡\u0001\u001a\u00020\t2\t\u0010 \u0001\u001a\u0004\u0018\u000100H\u0017¢\u0006\u0005\b¡\u0001\u00103J\u001c\u0010¤\u0001\u001a\u00020\t2\b\u0010£\u0001\u001a\u00030¢\u0001H\u0017¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u001c\u0010¨\u0001\u001a\u00020\t2\b\u0010§\u0001\u001a\u00030¦\u0001H\u0017¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u001b\u0010«\u0001\u001a\u00020\t2\u0007\u0010ª\u0001\u001a\u00020\u001cH\u0017¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u001c\u0010¯\u0001\u001a\u00020\t2\b\u0010®\u0001\u001a\u00030\u00ad\u0001H\u0017¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u001e\u0010³\u0001\u001a\u00030²\u00012\t\b\u0001\u0010±\u0001\u001a\u00020 H\u0016¢\u0006\u0006\b³\u0001\u0010´\u0001J\u001c\u0010µ\u0001\u001a\u00020\u00062\b\b\u0001\u0010!\u001a\u00020 H\u0016¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\u0018\u0010·\u0001\u001a\u00020\u00062\u0006\u0010V\u001a\u000206¢\u0006\u0006\b·\u0001\u0010¸\u0001R\u001b\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0010\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001R\u001c\u0010À\u0001\u001a\u0005\u0018\u00010½\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u001c\u0010Ä\u0001\u001a\u0005\u0018\u00010Á\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u001b\u0010Ç\u0001\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u001b\u0010Ê\u0001\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R#\u0010Ï\u0001\u001a\f\u0012\u0005\u0012\u00030Ì\u0001\u0018\u00010Ë\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010Î\u0001R\u0018\u0010Ñ\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÐ\u0001\u0010{R%\u0010Ö\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060%8WX\u0096\u0004¢\u0006\u0010\n\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001R$\u0010Ú\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0×\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R3\u0010á\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0Û\u00018\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\bÜ\u0001\u0010Ý\u0001\u0012\u0005\bà\u0001\u0010J\u001a\u0006\bÞ\u0001\u0010ß\u0001R$\u0010å\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bã\u0001\u0010ä\u0001R%\u0010è\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030æ\u00010â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bç\u0001\u0010ä\u0001R&\u0010ê\u0001\u001a\u0011\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u0001060â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bé\u0001\u0010ä\u0001R*\u0010ì\u0001\u001a\u0015\u0012\u0004\u0012\u000206\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bë\u0001\u0010ä\u0001R\u001b\u0010î\u0001\u001a\u0005\u0018\u00010¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bG\u0010í\u0001R\u001c\u0010ñ\u0001\u001a\u0005\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bï\u0001\u0010ð\u0001R\u001b\u0010ô\u0001\u001a\u0005\u0018\u00010ò\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bO\u0010ó\u0001R\u001d\u0010÷\u0001\u001a\t\u0012\u0004\u0012\u00020M0õ\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b_\u0010ö\u0001R)\u0010þ\u0001\u001a\u00030ø\u00018@@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b]\u0010ù\u0001\u001a\u0006\bú\u0001\u0010û\u0001\"\u0006\bü\u0001\u0010ý\u0001R\u0017\u0010\u0081\u0002\u001a\u00030ÿ\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b*\u0010\u0080\u0002R\u0018\u0010\u0084\u0002\u001a\u00030\u0082\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0083\u0002R\u0017\u0010\u0085\u0002\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010{R\u001a\u0010\u0089\u0002\u001a\u00030\u0086\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0002\u0010\u0088\u0002R1\u0010\u008b\u0002\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\u0012\t\u0012\u00070\u008a\u0002R\u00020\u00000â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010ä\u0001R5\u0010\u008d\u0002\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bq\u0010\u008c\u0002R5\u0010\u008e\u0002\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b9\u0010\u008c\u0002R#\u0010\u008f\u0002\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001c0â\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bt\u0010ä\u0001R\u0018\u0010\u0091\u0002\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b7\u0010\u0090\u0002R\u001e\u0010\u0094\u0002\u001a\t\u0012\u0004\u0012\u00020\u00060\u0092\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010\u0093\u0002R!\u0010\u0098\u0002\u001a\u00030Á\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bµ\u0001\u0010\u0095\u0002\u001a\u0006\b\u0096\u0002\u0010\u0097\u0002R\u001e\u0010\u009b\u0002\u001a\t\u0012\u0004\u0012\u00020\u00060\u0099\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010\u009a\u0002R#\u0010 \u0002\u001a\t\u0012\u0004\u0012\u00020\u00060\u009c\u00028\u0006¢\u0006\u0010\n\u0006\b»\u0001\u0010\u009d\u0002\u001a\u0006\b\u009e\u0002\u0010\u009f\u0002R\u0017\u0010£\u0002\u001a\u00020 8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¡\u0002\u0010¢\u0002R(\u0010j\u001a\u00020i2\u0006\u0010j\u001a\u00020i8W@WX\u0096\u000e¢\u0006\u0010\u001a\u0006\b¤\u0002\u0010¥\u0002\"\u0006\b¦\u0002\u0010§\u0002R,\u0010¨\u0002\u001a\u00030\u0086\u00022\b\u0010¨\u0002\u001a\u00030\u0086\u00028V@WX\u0096\u000e¢\u0006\u0010\u001a\u0006\b©\u0002\u0010ª\u0002\"\u0006\b«\u0002\u0010¬\u0002R\u0019\u0010®\u0002\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0090\u0002\u0010\u00ad\u0002R\u0019\u0010±\u0002\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\b\u001a\u0006\b¯\u0002\u0010°\u0002R\u0019\u0010³\u0002\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\b\u001a\u0006\b²\u0002\u0010°\u0002¨\u0006´\u0002"}, d2 = {"Landroidx/navigation/u;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/navigation/s;", "child", "parent", "Lkotlin/k2;", "V", "(Landroidx/navigation/s;Landroidx/navigation/s;)V", "Landroidx/navigation/c1;", "Landroidx/navigation/f0;", "", "entries", "Landroidx/navigation/t0;", "navOptions", "Landroidx/navigation/c1$a;", "navigatorExtras", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "backStackEntry", "handler", "p0", "(Landroidx/navigation/c1;Ljava/util/List;Landroidx/navigation/t0;Landroidx/navigation/c1$a;Lld/l;)V", "popUpTo", "", "saveState", "A0", "(Landroidx/navigation/c1;Landroidx/navigation/s;ZLld/l;)V", "", "destinationId", "inclusive", "B0", "(IZZ)Z", "Lkotlin/collections/k;", "Landroidx/navigation/NavBackStackEntryState;", "savedState", "E0", "(Landroidx/navigation/s;ZLkotlin/collections/k;)V", "t", "(I)Z", "U0", "()Z", "V0", "v", "Landroid/os/Bundle;", "startDestinationArgs", "s0", "(Landroid/os/Bundle;)V", "", "deepLink", "", "B", "([I)Ljava/lang/String;", "z", "(Landroidx/navigation/f0;I)Landroidx/navigation/f0;", "node", "args", "g0", "(Landroidx/navigation/f0;Landroid/os/Bundle;Landroidx/navigation/t0;Landroidx/navigation/c1$a;)V", "id", "J0", "(ILandroid/os/Bundle;Landroidx/navigation/t0;Landroidx/navigation/c1$a;)Z", "backStackState", "T", "(Lkotlin/collections/k;)Ljava/util/List;", "finalArgs", "restoredEntries", "o", "(Landroidx/navigation/f0;Landroid/os/Bundle;Landroidx/navigation/s;Ljava/util/List;)V", "Y0", "()V", "W0", "(Landroidx/navigation/s;)Landroidx/navigation/s;", "Landroidx/navigation/u$c;", "listener", "q", "(Landroidx/navigation/u$c;)V", "H0", "t0", "u0", "(IZ)Z", "v0", "route", "x0", "(Ljava/lang/String;ZZ)Z", "Lkotlin/Function0;", "onComplete", "z0", "(Landroidx/navigation/s;Lld/a;)V", "s", "(Ljava/lang/String;)Z", "r", "r0", "X0", "G0", "()Ljava/util/List;", "graphResId", "L0", "(I)V", "M0", "(ILandroid/os/Bundle;)V", "Landroidx/navigation/j0;", "graph", "O0", "(Landroidx/navigation/j0;Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "S", "(Landroid/content/Intent;)Z", "y", "(I)Landroidx/navigation/f0;", "destinationRoute", "A", "(Ljava/lang/String;)Landroidx/navigation/f0;", "resId", "W", "X", "Y", "(ILandroid/os/Bundle;Landroidx/navigation/t0;)V", "Z", "(ILandroid/os/Bundle;Landroidx/navigation/t0;Landroidx/navigation/c1$a;)V", "Landroid/net/Uri;", "a0", "(Landroid/net/Uri;)V", "b0", "(Landroid/net/Uri;Landroidx/navigation/t0;)V", "c0", "(Landroid/net/Uri;Landroidx/navigation/t0;Landroidx/navigation/c1$a;)V", "Landroidx/navigation/d0;", "request", "d0", "(Landroidx/navigation/d0;)V", "e0", "(Landroidx/navigation/d0;Landroidx/navigation/t0;)V", "f0", "(Landroidx/navigation/d0;Landroidx/navigation/t0;Landroidx/navigation/c1$a;)V", "Landroidx/navigation/i0;", "directions", "h0", "(Landroidx/navigation/i0;)V", "i0", "(Landroidx/navigation/i0;Landroidx/navigation/t0;)V", "j0", "(Landroidx/navigation/i0;Landroidx/navigation/c1$a;)V", "Landroidx/navigation/u0;", "Lkotlin/u;", "builder", "n0", "(Ljava/lang/String;Lld/l;)V", "m0", "(Ljava/lang/String;Landroidx/navigation/t0;Landroidx/navigation/c1$a;)V", "Landroidx/navigation/z;", "u", "()Landroidx/navigation/z;", "K0", "()Landroid/os/Bundle;", "navState", "I0", "Landroidx/lifecycle/e0;", "owner", "Q0", "(Landroidx/lifecycle/e0;)V", "Landroidx/activity/OnBackPressedDispatcher;", "dispatcher", "S0", "(Landroidx/activity/OnBackPressedDispatcher;)V", "enabled", "x", "(Z)V", "Landroidx/lifecycle/n1;", "viewModelStore", "T0", "(Landroidx/lifecycle/n1;)V", "navGraphId", "Landroidx/lifecycle/o1;", "P", "(I)Landroidx/lifecycle/o1;", "D", "(I)Landroidx/navigation/s;", "E", "(Ljava/lang/String;)Landroidx/navigation/s;", "a", "Landroid/content/Context;", "F", "()Landroid/content/Context;", "Landroid/app/Activity;", "b", "Landroid/app/Activity;", "activity", "Landroidx/navigation/s0;", "c", "Landroidx/navigation/s0;", "inflater", "d", "Landroidx/navigation/j0;", "_graph", "e", "Landroid/os/Bundle;", "navigatorStateToRestore", "", "Landroid/os/Parcelable;", "f", "[Landroid/os/Parcelable;", "backStackToRestore", "g", "deepLinkHandled", "h", "Lkotlin/collections/k;", "C", "()Lkotlin/collections/k;", "backQueue", "Lkotlinx/coroutines/flow/e0;", "i", "Lkotlinx/coroutines/flow/e0;", "_visibleEntries", "Lkotlinx/coroutines/flow/t0;", "j", "Lkotlinx/coroutines/flow/t0;", "Q", "()Lkotlinx/coroutines/flow/t0;", "R", "visibleEntries", "", "k", "Ljava/util/Map;", "childToParentEntries", "Ljava/util/concurrent/atomic/AtomicInteger;", "l", "parentToChildCount", "m", "backStackMap", "n", "backStackStates", "Landroidx/lifecycle/e0;", "lifecycleOwner", "p", "Landroidx/activity/OnBackPressedDispatcher;", "onBackPressedDispatcher", "Landroidx/navigation/w;", "Landroidx/navigation/w;", "viewModel", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onDestinationChangedListeners", "Landroidx/lifecycle/w$b;", "Landroidx/lifecycle/w$b;", "L", "()Landroidx/lifecycle/w$b;", "P0", "(Landroidx/lifecycle/w$b;)V", "hostLifecycleState", "Landroidx/lifecycle/d0;", "Landroidx/lifecycle/d0;", "lifecycleObserver", "Landroidx/activity/c0;", "Landroidx/activity/c0;", "onBackPressedCallback", "enableOnBackPressedCallback", "Landroidx/navigation/d1;", "w", "Landroidx/navigation/d1;", "_navigatorProvider", "Landroidx/navigation/u$b;", "navigatorState", "Lld/l;", "addToBackStackHandler", "popFromBackStackHandler", "entrySavedState", "I", "dispatchReentrantCount", "", "Ljava/util/List;", "backStackEntriesToDispatch", "Lkotlin/b0;", "M", "()Landroidx/navigation/s0;", "navInflater", "Lkotlinx/coroutines/flow/d0;", "Lkotlinx/coroutines/flow/d0;", "_currentBackStackEntryFlow", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/i;", "H", "()Lkotlinx/coroutines/flow/i;", "currentBackStackEntryFlow", "J", "()I", "destinationCountOnBackStack", "K", "()Landroidx/navigation/j0;", "N0", "(Landroidx/navigation/j0;)V", "navigatorProvider", "N", "()Landroidx/navigation/d1;", "R0", "(Landroidx/navigation/d1;)V", "()Landroidx/navigation/f0;", "currentDestination", "G", "()Landroidx/navigation/s;", "currentBackStackEntry", "O", "previousBackStackEntry", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class u {
    private static boolean U = true;

    /* renamed from: A, reason: from kotlin metadata */
    @fg.l
    private final Map<s, Boolean> entrySavedState;

    /* renamed from: B, reason: from kotlin metadata */
    private int dispatchReentrantCount;

    /* renamed from: C, reason: from kotlin metadata */
    @fg.l
    private final List<s> backStackEntriesToDispatch;

    /* renamed from: D, reason: from kotlin metadata */
    @fg.l
    private final b0 navInflater;

    /* renamed from: E, reason: from kotlin metadata */
    @fg.l
    private final d0<s> _currentBackStackEntryFlow;

    /* renamed from: F, reason: from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.flow.i<s> currentBackStackEntryFlow;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final android.content.Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Activity activity;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private s0 inflater;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private j0 _graph;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Bundle navigatorStateToRestore;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Parcelable[] backStackToRestore;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean deepLinkHandled;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.collections.k<s> backQueue;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e0<List<s>> _visibleEntries;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final t0<List<s>> visibleEntries;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<s, s> childToParentEntries;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<s, AtomicInteger> parentToChildCount;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<Integer, String> backStackMap;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<String, kotlin.collections.k<NavBackStackEntryState>> backStackStates;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private InterfaceC1423e0 lifecycleOwner;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private OnBackPressedDispatcher onBackPressedDispatcher;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private w viewModel;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final CopyOnWriteArrayList<c> onDestinationChangedListeners;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private AbstractC1450w.b hostLifecycleState;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final InterfaceC1421d0 lifecycleObserver;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c0 onBackPressedCallback;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean enableOnBackPressedCallback;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private d1 _navigatorProvider;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<c1<? extends f0>, b> navigatorState;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.l<? super s, k2> addToBackStackHandler;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.l<? super s, k2> popFromBackStackHandler;

    @fg.l
    private static final String H = "NavController";

    @fg.l
    private static final String I = "android-support-nav:controller:navigatorState";

    @fg.l
    private static final String J = "android-support-nav:controller:navigatorState:names";

    @fg.l
    private static final String K = "android-support-nav:controller:backStack";

    @fg.l
    private static final String L = "android-support-nav:controller:backStackDestIds";

    @fg.l
    private static final String M = "android-support-nav:controller:backStackIds";

    @fg.l
    private static final String N = "android-support-nav:controller:backStackStates";

    @fg.l
    private static final String O = "android-support-nav:controller:backStackStates:";

    @fg.l
    @c1({c1.a.LIBRARY_GROUP})
    public static final String P = "android-support-nav:controller:deepLinkIds";

    @fg.l
    @c1({c1.a.LIBRARY_GROUP})
    public static final String Q = "android-support-nav:controller:deepLinkArgs";

    @fg.l
    @c1({c1.a.LIBRARY_GROUP})
    public static final String R = "android-support-nav:controller:deepLinkExtras";

    @fg.l
    @c1({c1.a.LIBRARY_GROUP})
    public static final String S = "android-support-nav:controller:deepLinkHandled";

    @fg.l
    public static final String T = "android-support-nav:controller:deepLinkIntent";

    /* renamed from: G, reason: from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087T¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\u0003R\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0015\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/navigation/u$a;", "", "<init>", "()V", "", "saveState", "Lkotlin/k2;", "a", "(Z)V", "", "KEY_DEEP_LINK_EXTRAS", "Ljava/lang/String;", "b", "KEY_BACK_STACK", "KEY_BACK_STACK_DEST_IDS", "KEY_BACK_STACK_IDS", "KEY_BACK_STACK_STATES_IDS", "KEY_BACK_STACK_STATES_PREFIX", "KEY_DEEP_LINK_ARGS", "KEY_DEEP_LINK_HANDLED", "KEY_DEEP_LINK_IDS", "KEY_DEEP_LINK_INTENT", "KEY_NAVIGATOR_STATE", "KEY_NAVIGATOR_STATE_NAMES", "TAG", "deepLinkSaveState", "Z", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.navigation.u$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void b() {
        }

        @kd.n
        @e0
        public final void a(boolean saveState) {
            u.U = saveState;
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u000bR\u001f\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/navigation/u$b;", "Landroidx/navigation/f1;", "Landroidx/navigation/c1;", "Landroidx/navigation/f0;", "navigator", "<init>", "(Landroidx/navigation/u;Landroidx/navigation/c1;)V", "Landroidx/navigation/s;", "backStackEntry", "Lkotlin/k2;", "i", "(Landroidx/navigation/s;)V", "m", "destination", "Landroid/os/Bundle;", "arguments", "a", "(Landroidx/navigation/f0;Landroid/os/Bundle;)Landroidx/navigation/s;", "popUpTo", "", "saveState", "g", "(Landroidx/navigation/s;Z)V", "h", "entry", "e", "Landroidx/navigation/c1;", "n", "()Landroidx/navigation/c1;", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private final class b extends f1 {

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final c1<? extends f0> navigator;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ u f31278h;

        /* compiled from: NavController.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 6, 0})
        static final class a extends n0 implements ld.a<k2> {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ s f31280c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f31281d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s sVar, boolean z4) {
                super(0);
                this.f31280c = sVar;
                this.f31281d = z4;
            }

            public final void a() {
                b.super.g(this.f31280c, this.f31281d);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        public b(@fg.l u this$0, c1<? extends f0> navigator) {
            l0.p(this$0, "this$0");
            l0.p(navigator, "navigator");
            this.f31278h = this$0;
            this.navigator = navigator;
        }

        @Override // androidx.content.f1
        @fg.l
        public s a(@fg.l f0 destination, @fg.m Bundle arguments) {
            l0.p(destination, "destination");
            return s.Companion.b(s.INSTANCE, this.f31278h.getContext(), destination, arguments, this.f31278h.L(), this.f31278h.viewModel, null, null, 96, null);
        }

        @Override // androidx.content.f1
        public void e(@fg.l s entry) {
            w wVar;
            l0.p(entry, "entry");
            boolean g4 = l0.g(this.f31278h.entrySavedState.get(entry), Boolean.TRUE);
            super.e(entry);
            this.f31278h.entrySavedState.remove(entry);
            if (this.f31278h.C().contains(entry)) {
                if (getIsNavigating()) {
                    return;
                }
                this.f31278h.X0();
                this.f31278h._visibleEntries.b(this.f31278h.G0());
                return;
            }
            this.f31278h.W0(entry);
            if (entry.getLifecycle().getState().isAtLeast(AbstractC1450w.b.CREATED)) {
                entry.m(AbstractC1450w.b.DESTROYED);
            }
            kotlin.collections.k<s> C = this.f31278h.C();
            if (C == null || !C.isEmpty()) {
                Iterator<s> it = C.iterator();
                while (it.hasNext()) {
                    if (l0.g(it.next().getId(), entry.getId())) {
                        break;
                    }
                }
            }
            if (!g4 && (wVar = this.f31278h.viewModel) != null) {
                wVar.c(entry.getId());
            }
            this.f31278h.X0();
            this.f31278h._visibleEntries.b(this.f31278h.G0());
        }

        @Override // androidx.content.f1
        public void g(@fg.l s popUpTo, boolean saveState) {
            l0.p(popUpTo, "popUpTo");
            c1 f4 = this.f31278h._navigatorProvider.f(popUpTo.getDestination().getNavigatorName());
            if (!l0.g(f4, this.navigator)) {
                Object obj = this.f31278h.navigatorState.get(f4);
                l0.m(obj);
                ((b) obj).g(popUpTo, saveState);
            } else {
                ld.l lVar = this.f31278h.popFromBackStackHandler;
                if (lVar == null) {
                    this.f31278h.z0(popUpTo, new a(popUpTo, saveState));
                } else {
                    lVar.invoke(popUpTo);
                    super.g(popUpTo, saveState);
                }
            }
        }

        @Override // androidx.content.f1
        public void h(@fg.l s popUpTo, boolean saveState) {
            l0.p(popUpTo, "popUpTo");
            super.h(popUpTo, saveState);
            this.f31278h.entrySavedState.put(popUpTo, Boolean.valueOf(saveState));
        }

        @Override // androidx.content.f1
        public void i(@fg.l s backStackEntry) {
            l0.p(backStackEntry, "backStackEntry");
            c1 f4 = this.f31278h._navigatorProvider.f(backStackEntry.getDestination().getNavigatorName());
            if (l0.g(f4, this.navigator)) {
                ld.l lVar = this.f31278h.addToBackStackHandler;
                if (lVar == null) {
                    Objects.toString(backStackEntry.getDestination());
                    return;
                } else {
                    lVar.invoke(backStackEntry);
                    m(backStackEntry);
                    return;
                }
            }
            Object obj = this.f31278h.navigatorState.get(f4);
            if (obj != null) {
                ((b) obj).i(backStackEntry);
                return;
            }
            throw new IllegalStateException(("NavigatorBackStack for " + backStackEntry.getDestination().getNavigatorName() + " should already be created").toString());
        }

        public final void m(@fg.l s backStackEntry) {
            l0.p(backStackEntry, "backStackEntry");
            super.i(backStackEntry);
        }

        @fg.l
        public final c1<? extends f0> n() {
            return this.navigator;
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/navigation/u$c;", "", "Landroidx/navigation/u;", "controller", "Landroidx/navigation/f0;", "destination", "Landroid/os/Bundle;", "arguments", "Lkotlin/k2;", "a", "(Landroidx/navigation/u;Landroidx/navigation/f0;Landroid/os/Bundle;)V", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface c {
        void a(@fg.l u controller, @fg.l f0 destination, @fg.m Bundle arguments);
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/Context;", "it", "a", "(Landroid/content/Context;)Landroid/content/Context;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: androidx.navigation.u$d, reason: from Kotlin metadata */
    static final class Context extends n0 implements ld.l<android.content.Context, android.content.Context> {

        /* renamed from: b, reason: collision with root package name */
        public static final Context f31282b = new Context(1);

        Context() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final android.content.Context invoke(@fg.l android.content.Context it) {
            l0.p(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/navigation/u0;", "Lkotlin/k2;", "a", "(Landroidx/navigation/u0;)V"}, k = 3, mv = {1, 6, 0})
    static final class e extends n0 implements ld.l<u0, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0 f31283b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ u f31284c;

        /* compiled from: NavController.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/navigation/h;", "Lkotlin/k2;", "a", "(Landroidx/navigation/h;)V"}, k = 3, mv = {1, 6, 0})
        static final class a extends n0 implements ld.l<androidx.content.h, k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f31285b = new a(1);

            a() {
                super(1);
            }

            public final void a(@fg.l androidx.content.h anim) {
                l0.p(anim, "$this$anim");
                anim.e(0);
                anim.f(0);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(androidx.content.h hVar) {
                a(hVar);
                return k2.f75408a;
            }
        }

        /* compiled from: NavController.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/navigation/h1;", "Lkotlin/k2;", "a", "(Landroidx/navigation/h1;)V"}, k = 3, mv = {1, 6, 0})
        static final class b extends n0 implements ld.l<h1, k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final b f31286b = new b(1);

            b() {
                super(1);
            }

            public final void a(@fg.l h1 popUpTo) {
                l0.p(popUpTo, "$this$popUpTo");
                popUpTo.d(true);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(h1 h1Var) {
                a(h1Var);
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(f0 f0Var, u uVar) {
            super(1);
            this.f31283b = f0Var;
            this.f31284c = uVar;
        }

        public final void a(@fg.l u0 navOptions) {
            l0.p(navOptions, "$this$navOptions");
            navOptions.a(a.f31285b);
            f0 f0Var = this.f31283b;
            if (f0Var instanceof j0) {
                kotlin.sequences.m<f0> c5 = f0.INSTANCE.c(f0Var);
                u uVar = this.f31284c;
                for (f0 f0Var2 : c5) {
                    f0 I = uVar.I();
                    if (l0.g(f0Var2, I == null ? null : I.getParent())) {
                        return;
                    }
                }
                if (u.U) {
                    navOptions.i(j0.INSTANCE.a(this.f31284c.K()).getId(), b.f31286b);
                }
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(u0 u0Var) {
            a(u0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/navigation/s0;", "a", "()Landroidx/navigation/s0;"}, k = 3, mv = {1, 6, 0})
    static final class f extends n0 implements a<s0> {
        f() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s0 invoke() {
            s0 s0Var = u.this.inflater;
            return s0Var == null ? new s0(u.this.getContext(), u.this._navigatorProvider) : s0Var;
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/navigation/s;", "it", "Lkotlin/k2;", "a", "(Landroidx/navigation/s;)V"}, k = 3, mv = {1, 6, 0})
    static final class g extends n0 implements ld.l<s, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.a f31288b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ u f31289c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f0 f31290d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Bundle f31291e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(k1.a aVar, u uVar, f0 f0Var, Bundle bundle) {
            super(1);
            this.f31288b = aVar;
            this.f31289c = uVar;
            this.f31290d = f0Var;
            this.f31291e = bundle;
        }

        public final void a(@fg.l s it) {
            l0.p(it, "it");
            this.f31288b.f75322b = true;
            u.p(this.f31289c, this.f31290d, this.f31291e, it, null, 8, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(s sVar) {
            a(sVar);
            return k2.f75408a;
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/navigation/s;", "it", "Lkotlin/k2;", "a", "(Landroidx/navigation/s;)V"}, k = 3, mv = {1, 6, 0})
    static final class h extends n0 implements ld.l<s, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f31292b = new h(1);

        h() {
            super(1);
        }

        public final void a(@fg.l s it) {
            l0.p(it, "it");
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(s sVar) {
            a(sVar);
            return k2.f75408a;
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/navigation/u$i", "Landroidx/activity/c0;", "Lkotlin/k2;", "handleOnBackPressed", "()V", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class i extends c0 {
        i() {
            super(false);
        }

        @Override // androidx.view.c0
        public void handleOnBackPressed() {
            u.this.t0();
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/navigation/s;", "it", "Lkotlin/k2;", "a", "(Landroidx/navigation/s;)V"}, k = 3, mv = {1, 6, 0})
    static final class j extends n0 implements ld.l<s, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final j f31294b = new j(1);

        j() {
            super(1);
        }

        public final void a(@fg.l s it) {
            l0.p(it, "it");
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(s sVar) {
            a(sVar);
            return k2.f75408a;
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/navigation/s;", "entry", "Lkotlin/k2;", "a", "(Landroidx/navigation/s;)V"}, k = 3, mv = {1, 6, 0})
    static final class k extends n0 implements ld.l<s, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.a f31295b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k1.a f31296c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ u f31297d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f31298e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.collections.k<NavBackStackEntryState> f31299f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(k1.a aVar, k1.a aVar2, u uVar, boolean z4, kotlin.collections.k<NavBackStackEntryState> kVar) {
            super(1);
            this.f31295b = aVar;
            this.f31296c = aVar2;
            this.f31297d = uVar;
            this.f31298e = z4;
            this.f31299f = kVar;
        }

        public final void a(@fg.l s entry) {
            l0.p(entry, "entry");
            this.f31295b.f75322b = true;
            this.f31296c.f75322b = true;
            this.f31297d.E0(entry, this.f31298e, this.f31299f);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(s sVar) {
            a(sVar);
            return k2.f75408a;
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/navigation/f0;", "destination", "a", "(Landroidx/navigation/f0;)Landroidx/navigation/f0;"}, k = 3, mv = {1, 6, 0})
    static final class l extends n0 implements ld.l<f0, f0> {

        /* renamed from: b, reason: collision with root package name */
        public static final l f31300b = new l(1);

        l() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f0 invoke(@fg.l f0 destination) {
            l0.p(destination, "destination");
            j0 parent = destination.getParent();
            if (parent != null && parent.n0() == destination.getId()) {
                return destination.getParent();
            }
            return null;
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/navigation/f0;", "destination", "", "a", "(Landroidx/navigation/f0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    static final class m extends n0 implements ld.l<f0, Boolean> {
        m() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l f0 destination) {
            l0.p(destination, "destination");
            return Boolean.valueOf(!u.this.backStackMap.containsKey(Integer.valueOf(destination.getId())));
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/navigation/f0;", "destination", "a", "(Landroidx/navigation/f0;)Landroidx/navigation/f0;"}, k = 3, mv = {1, 6, 0})
    static final class n extends n0 implements ld.l<f0, f0> {

        /* renamed from: b, reason: collision with root package name */
        public static final n f31302b = new n(1);

        n() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f0 invoke(@fg.l f0 destination) {
            l0.p(destination, "destination");
            j0 parent = destination.getParent();
            if (parent != null && parent.n0() == destination.getId()) {
                return destination.getParent();
            }
            return null;
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/navigation/f0;", "destination", "", "a", "(Landroidx/navigation/f0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    static final class o extends n0 implements ld.l<f0, Boolean> {
        o() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l f0 destination) {
            l0.p(destination, "destination");
            return Boolean.valueOf(!u.this.backStackMap.containsKey(Integer.valueOf(destination.getId())));
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    static final class p extends n0 implements ld.l<String, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f31304b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str) {
            super(1);
            this.f31304b = str;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.m String str) {
            return Boolean.valueOf(l0.g(str, this.f31304b));
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/navigation/s;", "entry", "Lkotlin/k2;", "a", "(Landroidx/navigation/s;)V"}, k = 3, mv = {1, 6, 0})
    static final class q extends n0 implements ld.l<s, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.a f31305b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<s> f31306c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k1.f f31307d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ u f31308e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Bundle f31309f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(k1.a aVar, List<s> list, k1.f fVar, u uVar, Bundle bundle) {
            super(1);
            this.f31305b = aVar;
            this.f31306c = list;
            this.f31307d = fVar;
            this.f31308e = uVar;
            this.f31309f = bundle;
        }

        public final void a(@fg.l s entry) {
            List<s> list;
            l0.p(entry, "entry");
            this.f31305b.f75322b = true;
            int indexOf = this.f31306c.indexOf(entry);
            if (indexOf != -1) {
                int i4 = indexOf + 1;
                list = this.f31306c.subList(this.f31307d.f75327b, i4);
                this.f31307d.f75327b = i4;
            } else {
                list = j0.f74919b;
            }
            this.f31308e.o(entry.getDestination(), this.f31309f, entry, list);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(s sVar) {
            a(sVar);
            return k2.f75408a;
        }
    }

    public u(@fg.l android.content.Context context) {
        Object obj;
        l0.p(context, "context");
        this.context = context;
        Iterator it = kotlin.sequences.p.l(context, Context.f31282b).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((android.content.Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.activity = (Activity) obj;
        this.backQueue = new kotlin.collections.k<>();
        e0<List<s>> a5 = v0.a(j0.f74919b);
        this._visibleEntries = a5;
        this.visibleEntries = kotlinx.coroutines.flow.k.m(a5);
        this.childToParentEntries = new LinkedHashMap();
        this.parentToChildCount = new LinkedHashMap();
        this.backStackMap = new LinkedHashMap();
        this.backStackStates = new LinkedHashMap();
        this.onDestinationChangedListeners = new CopyOnWriteArrayList<>();
        this.hostLifecycleState = AbstractC1450w.b.INITIALIZED;
        this.lifecycleObserver = new InterfaceC1416b0() { // from class: androidx.navigation.t
            @Override // androidx.view.InterfaceC1416b0
            public final void f(InterfaceC1423e0 interfaceC1423e0, AbstractC1450w.a aVar) {
                u.U(u.this, interfaceC1423e0, aVar);
            }
        };
        this.onBackPressedCallback = new i();
        this.enableOnBackPressedCallback = true;
        this._navigatorProvider = new d1();
        this.navigatorState = new LinkedHashMap();
        this.entrySavedState = new LinkedHashMap();
        d1 d1Var = this._navigatorProvider;
        d1Var.b(new n0(d1Var));
        this._navigatorProvider.b(new d(this.context));
        this.backStackEntriesToDispatch = new ArrayList();
        this.navInflater = kotlin.c0.c(new f());
        d0<s> b5 = k0.b(1, 0, kotlinx.coroutines.channels.i.DROP_OLDEST, 2, null);
        this._currentBackStackEntryFlow = b5;
        this.currentBackStackEntryFlow = kotlinx.coroutines.flow.k.l(b5);
    }

    private final void A0(c1<? extends f0> c1Var, s sVar, boolean z4, ld.l<? super s, k2> lVar) {
        this.popFromBackStackHandler = lVar;
        c1Var.j(sVar, z4);
        this.popFromBackStackHandler = null;
    }

    private final String B(int[] deepLink) {
        j0 j0Var = this._graph;
        int length = deepLink.length;
        int i4 = 0;
        while (true) {
            f0 f0Var = null;
            if (i4 >= length) {
                return null;
            }
            int i5 = i4 + 1;
            int i6 = deepLink[i4];
            if (i4 == 0) {
                j0 j0Var2 = this._graph;
                l0.m(j0Var2);
                if (j0Var2.getId() == i6) {
                    f0Var = this._graph;
                }
            } else {
                l0.m(j0Var);
                f0Var = j0Var.g0(i6, true);
            }
            if (f0Var == null) {
                return f0.INSTANCE.b(this.context, i6);
            }
            if (i4 != deepLink.length - 1 && (f0Var instanceof j0)) {
                j0Var = (j0) f0Var;
                while (true) {
                    l0.m(j0Var);
                    if (j0Var.g0(j0Var.n0(), true) instanceof j0) {
                        j0Var = (j0) j0Var.g0(j0Var.n0(), true);
                    }
                }
            }
            i4 = i5;
        }
    }

    @androidx.annotation.l0
    private final boolean B0(@androidx.annotation.d0 int destinationId, boolean inclusive, boolean saveState) {
        f0 f0Var;
        if (C().isEmpty()) {
            return false;
        }
        ArrayList<c1<? extends f0>> arrayList = new ArrayList();
        Iterator it = kotlin.collections.w.X4(C()).iterator();
        while (true) {
            if (!it.hasNext()) {
                f0Var = null;
                break;
            }
            f0 destination = ((s) it.next()).getDestination();
            c1 f4 = this._navigatorProvider.f(destination.getNavigatorName());
            if (inclusive || destination.getId() != destinationId) {
                arrayList.add(f4);
            }
            if (destination.getId() == destinationId) {
                f0Var = destination;
                break;
            }
        }
        if (f0Var == null) {
            f0.INSTANCE.b(this.context, destinationId);
            return false;
        }
        k1.a aVar = new k1.a();
        kotlin.collections.k<NavBackStackEntryState> kVar = new kotlin.collections.k<>();
        for (c1<? extends f0> c1Var : arrayList) {
            k1.a aVar2 = new k1.a();
            A0(c1Var, C().last(), saveState, new k(aVar2, aVar, this, saveState, kVar));
            if (!aVar2.f75322b) {
                break;
            }
        }
        if (saveState) {
            if (!inclusive) {
                for (f0 f0Var2 : kotlin.sequences.p.Z2(kotlin.sequences.p.l(f0Var, l.f31300b), new m())) {
                    Map<Integer, String> map = this.backStackMap;
                    Integer valueOf = Integer.valueOf(f0Var2.getId());
                    NavBackStackEntryState m4 = kVar.m();
                    map.put(valueOf, m4 == null ? null : m4.getId());
                }
            }
            if (!kVar.isEmpty()) {
                NavBackStackEntryState first = kVar.first();
                Iterator it2 = kotlin.sequences.p.Z2(kotlin.sequences.p.l(y(first.getDestinationId()), n.f31302b), new o()).iterator();
                while (it2.hasNext()) {
                    this.backStackMap.put(Integer.valueOf(((f0) it2.next()).getId()), first.getId());
                }
                this.backStackStates.put(first.getId(), kVar);
            }
        }
        Y0();
        return aVar.f75322b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void C0(u uVar, c1 c1Var, s sVar, boolean z4, ld.l lVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i4 & 4) != 0) {
            lVar = j.f31294b;
        }
        uVar.A0(c1Var, sVar, z4, lVar);
    }

    static /* synthetic */ boolean D0(u uVar, int i4, boolean z4, boolean z5, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i5 & 4) != 0) {
            z5 = false;
        }
        return uVar.B0(i4, z4, z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0(s popUpTo, boolean saveState, kotlin.collections.k<NavBackStackEntryState> savedState) {
        w wVar;
        t0<Set<s>> c5;
        Set<s> value;
        s last = C().last();
        if (!l0.g(last, popUpTo)) {
            throw new IllegalStateException(("Attempted to pop " + popUpTo.getDestination() + ", which is not the top of the back stack (" + last.getDestination() + ')').toString());
        }
        C().removeLast();
        b bVar = this.navigatorState.get(get_navigatorProvider().f(last.getDestination().getNavigatorName()));
        boolean z4 = true;
        if ((bVar == null || (c5 = bVar.c()) == null || (value = c5.getValue()) == null || !value.contains(last)) && !this.parentToChildCount.containsKey(last)) {
            z4 = false;
        }
        AbstractC1450w.b state = last.getLifecycle().getState();
        AbstractC1450w.b bVar2 = AbstractC1450w.b.CREATED;
        if (state.isAtLeast(bVar2)) {
            if (saveState) {
                last.m(bVar2);
                savedState.addFirst(new NavBackStackEntryState(last));
            }
            if (z4) {
                last.m(bVar2);
            } else {
                last.m(AbstractC1450w.b.DESTROYED);
                W0(last);
            }
        }
        if (saveState || z4 || (wVar = this.viewModel) == null) {
            return;
        }
        wVar.c(last.getId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void F0(u uVar, s sVar, boolean z4, kotlin.collections.k kVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
        }
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        if ((i4 & 4) != 0) {
            kVar = new kotlin.collections.k();
        }
        uVar.E0(sVar, z4, kVar);
    }

    private final int J() {
        kotlin.collections.k<s> C = C();
        int i4 = 0;
        if (C == null || !C.isEmpty()) {
            Iterator<s> it = C.iterator();
            while (it.hasNext()) {
                if (!(it.next().getDestination() instanceof j0) && (i4 = i4 + 1) < 0) {
                    kotlin.collections.w.Y();
                }
            }
        }
        return i4;
    }

    private final boolean J0(int id2, Bundle args, t0 navOptions, c1.a navigatorExtras) {
        s sVar;
        f0 destination;
        if (!this.backStackMap.containsKey(Integer.valueOf(id2))) {
            return false;
        }
        String str = this.backStackMap.get(Integer.valueOf(id2));
        kotlin.collections.w.G0(this.backStackMap.values(), new p(str));
        List<s> T2 = T(this.backStackStates.remove(str));
        ArrayList<List<s>> arrayList = new ArrayList();
        ArrayList<s> arrayList2 = new ArrayList();
        for (Object obj : T2) {
            if (!(((s) obj).getDestination() instanceof j0)) {
                arrayList2.add(obj);
            }
        }
        for (s sVar2 : arrayList2) {
            List list = (List) kotlin.collections.w.v3(arrayList);
            String str2 = null;
            if (list != null && (sVar = (s) kotlin.collections.w.p3(list)) != null && (destination = sVar.getDestination()) != null) {
                str2 = destination.getNavigatorName();
            }
            if (l0.g(str2, sVar2.getDestination().getNavigatorName())) {
                list.add(sVar2);
            } else {
                arrayList.add(kotlin.collections.w.S(sVar2));
            }
        }
        k1.a aVar = new k1.a();
        for (List<s> list2 : arrayList) {
            p0(this._navigatorProvider.f(((s) kotlin.collections.w.B2(list2)).getDestination().getNavigatorName()), list2, navOptions, navigatorExtras, new q(aVar, T2, new k1.f(), this, args));
        }
        return aVar.f75322b;
    }

    @x
    public static /* synthetic */ void R() {
    }

    private final List<s> T(kotlin.collections.k<NavBackStackEntryState> backStackState) {
        ArrayList arrayList = new ArrayList();
        s v4 = C().v();
        f0 destination = v4 == null ? null : v4.getDestination();
        if (destination == null) {
            destination = K();
        }
        if (backStackState != null) {
            for (NavBackStackEntryState navBackStackEntryState : backStackState) {
                f0 z4 = z(destination, navBackStackEntryState.getDestinationId());
                if (z4 == null) {
                    throw new IllegalStateException(("Restore State failed: destination " + f0.INSTANCE.b(this.context, navBackStackEntryState.getDestinationId()) + " cannot be found from the current destination " + destination).toString());
                }
                arrayList.add(navBackStackEntryState.e(this.context, z4, L(), this.viewModel));
                destination = z4;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(u this$0, InterfaceC1423e0 noName_0, AbstractC1450w.a event) {
        l0.p(this$0, "this$0");
        l0.p(noName_0, "$noName_0");
        l0.p(event, "event");
        AbstractC1450w.b targetState = event.getTargetState();
        l0.o(targetState, "event.targetState");
        this$0.hostLifecycleState = targetState;
        if (this$0._graph != null) {
            Iterator<s> it = this$0.C().iterator();
            while (it.hasNext()) {
                it.next().j(event);
            }
        }
    }

    private final boolean U0() {
        int i4 = 0;
        if (!this.deepLinkHandled) {
            return false;
        }
        Activity activity = this.activity;
        l0.m(activity);
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        l0.m(extras);
        int[] intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
        l0.m(intArray);
        l0.o(intArray, "extras!!.getIntArray(KEY_DEEP_LINK_IDS)!!");
        List<Integer> Sy = kotlin.collections.l.Sy(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
        int intValue = ((Number) kotlin.collections.w.O0(Sy)).intValue();
        if (parcelableArrayList != null) {
        }
        if (Sy.isEmpty()) {
            return false;
        }
        f0 z4 = z(K(), intValue);
        if (z4 instanceof j0) {
            intValue = j0.INSTANCE.a((j0) z4).getId();
        }
        f0 I2 = I();
        if (I2 == null || intValue != I2.getId()) {
            return false;
        }
        z u4 = u();
        Bundle b5 = androidx.core.os.e.b(new q0("android-support-nav:controller:deepLinkIntent", intent));
        Bundle bundle = extras.getBundle("android-support-nav:controller:deepLinkExtras");
        if (bundle != null) {
            b5.putAll(bundle);
        }
        u4.k(b5);
        Iterator<T> it = Sy.iterator();
        while (true) {
            Bundle bundle2 = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                kotlin.collections.w.Z();
            }
            int intValue2 = ((Number) next).intValue();
            if (parcelableArrayList != null) {
                bundle2 = (Bundle) parcelableArrayList.get(i4);
            }
            u4.b(intValue2, bundle2);
            i4 = i5;
        }
        u4.h().x(null);
        Activity activity2 = this.activity;
        if (activity2 == null) {
            return true;
        }
        activity2.finish();
        return true;
    }

    private final void V(s child, s parent) {
        this.childToParentEntries.put(child, parent);
        if (this.parentToChildCount.get(parent) == null) {
            this.parentToChildCount.put(parent, new AtomicInteger(0));
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(parent);
        l0.m(atomicInteger);
        atomicInteger.incrementAndGet();
    }

    private final boolean V0() {
        f0 I2 = I();
        l0.m(I2);
        int id2 = I2.getId();
        for (j0 parent = I2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.n0() != id2) {
                Bundle bundle = new Bundle();
                Activity activity = this.activity;
                if (activity != null) {
                    l0.m(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.activity;
                        l0.m(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.activity;
                            l0.m(activity3);
                            bundle.putParcelable("android-support-nav:controller:deepLinkIntent", activity3.getIntent());
                            j0 j0Var = this._graph;
                            l0.m(j0Var);
                            Activity activity4 = this.activity;
                            l0.m(activity4);
                            Intent intent = activity4.getIntent();
                            l0.o(intent, "activity!!.intent");
                            f0.c I3 = j0Var.I(new d0(intent));
                            if (I3 != null) {
                                bundle.putAll(I3.getDestination().i(I3.getMatchingArgs()));
                            }
                        }
                    }
                }
                z.r(new z(this), parent.getId(), null, 2, null).k(bundle).h().x(null);
                Activity activity5 = this.activity;
                if (activity5 == null) {
                    return true;
                }
                activity5.finish();
                return true;
            }
            id2 = parent.getId();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (J() > 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Y0() {
        /*
            r3 = this;
            androidx.activity.c0 r0 = r3.onBackPressedCallback
            boolean r1 = r3.enableOnBackPressedCallback
            if (r1 == 0) goto Le
            int r1 = r3.J()
            r2 = 1
            if (r1 <= r2) goto Le
            goto Lf
        Le:
            r2 = 0
        Lf:
            r0.setEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.u.Y0():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0112 A[LOOP:1: B:20:0x010c->B:22:0x0112, LOOP_END] */
    @androidx.annotation.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g0(androidx.content.f0 r21, android.os.Bundle r22, androidx.content.t0 r23, androidx.navigation.c1.a r24) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.u.g0(androidx.navigation.f0, android.os.Bundle, androidx.navigation.t0, androidx.navigation.c1$a):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(f0 node, Bundle finalArgs, s backStackEntry, List<s> restoredEntries) {
        kotlin.collections.k<s> kVar;
        f0 f0Var;
        List<s> list;
        s sVar;
        Bundle bundle;
        s sVar2;
        j0 j0Var;
        s sVar3;
        List<s> list2;
        Bundle bundle2;
        Bundle bundle3 = finalArgs;
        s sVar4 = backStackEntry;
        List<s> list3 = restoredEntries;
        f0 destination = backStackEntry.getDestination();
        if (!(destination instanceof androidx.content.i)) {
            while (!C().isEmpty() && (C().last().getDestination() instanceof androidx.content.i) && D0(this, C().last().getDestination().getId(), true, false, 4, null)) {
            }
        }
        kotlin.collections.k kVar2 = new kotlin.collections.k();
        s sVar5 = null;
        if (node instanceof j0) {
            f0 f0Var2 = destination;
            while (true) {
                l0.m(f0Var2);
                j0 parent = f0Var2.getParent();
                if (parent != null) {
                    ListIterator<s> listIterator = list3.listIterator(restoredEntries.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            sVar3 = listIterator.previous();
                            if (l0.g(sVar3.getDestination(), parent)) {
                                break;
                            }
                        } else {
                            sVar3 = null;
                            break;
                        }
                    }
                    s sVar6 = sVar3;
                    if (sVar6 == null) {
                        f0Var = destination;
                        list2 = list3;
                        bundle2 = bundle3;
                        sVar = sVar4;
                        sVar6 = s.Companion.b(s.INSTANCE, this.context, parent, finalArgs, L(), this.viewModel, null, null, 96, null);
                    } else {
                        f0Var = destination;
                        list2 = list3;
                        sVar = sVar4;
                        bundle2 = bundle3;
                    }
                    kVar2.addFirst(sVar6);
                    if (C().isEmpty() || C().last().getDestination() != parent) {
                        list = list2;
                        bundle = bundle2;
                        j0Var = parent;
                        kVar = kVar2;
                    } else {
                        list = list2;
                        bundle = bundle2;
                        j0Var = parent;
                        kVar = kVar2;
                        F0(this, C().last(), false, null, 6, null);
                    }
                } else {
                    j0Var = parent;
                    kVar = kVar2;
                    f0Var = destination;
                    list = list3;
                    sVar = sVar4;
                    bundle = bundle3;
                }
                if (j0Var == null || j0Var == node) {
                    break;
                }
                sVar4 = sVar;
                kVar2 = kVar;
                f0Var2 = j0Var;
                bundle3 = bundle;
                list3 = list;
                destination = f0Var;
            }
        } else {
            kVar = kVar2;
            f0Var = destination;
            list = list3;
            sVar = sVar4;
            bundle = bundle3;
        }
        f0 destination2 = kVar.isEmpty() ? f0Var : ((s) kVar.first()).getDestination();
        while (destination2 != null && y(destination2.getId()) == null) {
            destination2 = destination2.getParent();
            if (destination2 != null) {
                ListIterator<s> listIterator2 = list.listIterator(restoredEntries.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        sVar2 = listIterator2.previous();
                        if (l0.g(sVar2.getDestination(), destination2)) {
                            break;
                        }
                    } else {
                        sVar2 = null;
                        break;
                    }
                }
                s sVar7 = sVar2;
                if (sVar7 == null) {
                    sVar7 = s.Companion.b(s.INSTANCE, this.context, destination2, destination2.i(bundle), L(), this.viewModel, null, null, 96, null);
                }
                kVar.addFirst(sVar7);
            }
        }
        if (!kVar.isEmpty()) {
            f0Var = ((s) kVar.last()).getDestination();
        }
        while (!C().isEmpty() && (C().last().getDestination() instanceof j0) && ((j0) C().last().getDestination()).g0(f0Var.getId(), false) == null) {
            F0(this, C().last(), false, null, 6, null);
        }
        s m4 = C().m();
        if (m4 == null) {
            m4 = (s) kVar.m();
        }
        if (!l0.g(m4 == null ? null : m4.getDestination(), this._graph)) {
            ListIterator<s> listIterator3 = list.listIterator(restoredEntries.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                s previous = listIterator3.previous();
                f0 destination3 = previous.getDestination();
                j0 j0Var2 = this._graph;
                l0.m(j0Var2);
                if (l0.g(destination3, j0Var2)) {
                    sVar5 = previous;
                    break;
                }
            }
            s sVar8 = sVar5;
            if (sVar8 == null) {
                s.Companion companion = s.INSTANCE;
                android.content.Context context = this.context;
                j0 j0Var3 = this._graph;
                l0.m(j0Var3);
                j0 j0Var4 = this._graph;
                l0.m(j0Var4);
                sVar8 = s.Companion.b(companion, context, j0Var3, j0Var4.i(bundle), L(), this.viewModel, null, null, 96, null);
            }
            kVar.addFirst(sVar8);
        }
        for (s sVar9 : kVar) {
            b bVar = this.navigatorState.get(this._navigatorProvider.f(sVar9.getDestination().getNavigatorName()));
            if (bVar == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + node.getNavigatorName() + " should already be created").toString());
            }
            bVar.m(sVar9);
        }
        C().addAll(kVar);
        C().addLast(sVar);
        for (s sVar10 : kotlin.collections.w.E4(kVar, sVar)) {
            j0 parent2 = sVar10.getDestination().getParent();
            if (parent2 != null) {
                V(sVar10, D(parent2.getId()));
            }
        }
    }

    public static /* synthetic */ void o0(u uVar, String str, t0 t0Var, c1.a aVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i4 & 2) != 0) {
            t0Var = null;
        }
        if ((i4 & 4) != 0) {
            aVar = null;
        }
        uVar.m0(str, t0Var, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void p(u uVar, f0 f0Var, Bundle bundle, s sVar, List list, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
        }
        if ((i4 & 8) != 0) {
            list = j0.f74919b;
        }
        uVar.o(f0Var, bundle, sVar, list);
    }

    private final void p0(c1<? extends f0> c1Var, List<s> list, t0 t0Var, c1.a aVar, ld.l<? super s, k2> lVar) {
        this.addToBackStackHandler = lVar;
        c1Var.e(list, t0Var, aVar);
        this.addToBackStackHandler = null;
    }

    static /* synthetic */ void q0(u uVar, c1 c1Var, List list, t0 t0Var, c1.a aVar, ld.l lVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateInternal");
        }
        if ((i4 & 8) != 0) {
            lVar = h.f31292b;
        }
        uVar.p0(c1Var, list, t0Var, aVar, lVar);
    }

    @androidx.annotation.l0
    private final void s0(Bundle startDestinationArgs) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle = this.navigatorStateToRestore;
        if (bundle != null && (stringArrayList = bundle.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String name = it.next();
                d1 d1Var = this._navigatorProvider;
                l0.o(name, "name");
                c1 f4 = d1Var.f(name);
                Bundle bundle2 = bundle.getBundle(name);
                if (bundle2 != null) {
                    f4.h(bundle2);
                }
            }
        }
        Parcelable[] parcelableArr = this.backStackToRestore;
        if (parcelableArr != null) {
            int length = parcelableArr.length;
            int i4 = 0;
            while (i4 < length) {
                Parcelable parcelable = parcelableArr[i4];
                i4++;
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelable;
                f0 y4 = y(navBackStackEntryState.getDestinationId());
                if (y4 == null) {
                    StringBuilder a5 = androidx.appcompat.view.g.a("Restoring the Navigation back stack failed: destination ", f0.INSTANCE.b(this.context, navBackStackEntryState.getDestinationId()), " cannot be found from the current destination ");
                    a5.append(I());
                    throw new IllegalStateException(a5.toString());
                }
                s e4 = navBackStackEntryState.e(this.context, y4, L(), this.viewModel);
                c1<? extends f0> f5 = this._navigatorProvider.f(y4.getNavigatorName());
                Map<c1<? extends f0>, b> map = this.navigatorState;
                b bVar = map.get(f5);
                if (bVar == null) {
                    bVar = new b(this, f5);
                    map.put(f5, bVar);
                }
                C().addLast(e4);
                bVar.m(e4);
                j0 parent = e4.getDestination().getParent();
                if (parent != null) {
                    V(e4, D(parent.getId()));
                }
            }
            Y0();
            this.backStackToRestore = null;
        }
        Collection<c1<? extends f0>> values = this._navigatorProvider.g().values();
        ArrayList<c1<? extends f0>> arrayList = new ArrayList();
        for (Object obj : values) {
            if (!((c1) obj).getIsAttached()) {
                arrayList.add(obj);
            }
        }
        for (c1<? extends f0> c1Var : arrayList) {
            Map<c1<? extends f0>, b> map2 = this.navigatorState;
            b bVar2 = map2.get(c1Var);
            if (bVar2 == null) {
                bVar2 = new b(this, c1Var);
                map2.put(c1Var, bVar2);
            }
            c1Var.f(bVar2);
        }
        if (this._graph == null || !C().isEmpty()) {
            v();
            return;
        }
        if (!this.deepLinkHandled && (activity = this.activity) != null) {
            l0.m(activity);
            if (S(activity.getIntent())) {
                return;
            }
        }
        j0 j0Var = this._graph;
        l0.m(j0Var);
        g0(j0Var, startDestinationArgs, null, null);
    }

    @androidx.annotation.l0
    private final boolean t(@androidx.annotation.d0 int destinationId) {
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).k(true);
        }
        boolean J0 = J0(destinationId, null, null, null);
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).k(false);
        }
        return J0 && B0(destinationId, true, false);
    }

    private final boolean v() {
        while (!C().isEmpty() && (C().last().getDestination() instanceof j0)) {
            F0(this, C().last(), false, null, 6, null);
        }
        s v4 = C().v();
        if (v4 != null) {
            this.backStackEntriesToDispatch.add(v4);
        }
        this.dispatchReentrantCount++;
        X0();
        int i4 = this.dispatchReentrantCount - 1;
        this.dispatchReentrantCount = i4;
        if (i4 == 0) {
            List<s> Y5 = kotlin.collections.w.Y5(this.backStackEntriesToDispatch);
            this.backStackEntriesToDispatch.clear();
            for (s sVar : Y5) {
                Iterator<c> it = this.onDestinationChangedListeners.iterator();
                while (it.hasNext()) {
                    it.next().a(this, sVar.getDestination(), sVar.getArguments());
                }
                this._currentBackStackEntryFlow.b(sVar);
            }
            this._visibleEntries.b(G0());
        }
        return v4 != null;
    }

    @kd.n
    @e0
    public static final void w(boolean z4) {
        INSTANCE.getClass();
        U = z4;
    }

    public static /* synthetic */ boolean y0(u uVar, String str, boolean z4, boolean z5, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i4 & 4) != 0) {
            z5 = false;
        }
        return uVar.x0(str, z4, z5);
    }

    private final f0 z(f0 f0Var, @androidx.annotation.d0 int i4) {
        j0 parent;
        if (f0Var.getId() == i4) {
            return f0Var;
        }
        if (f0Var instanceof j0) {
            parent = (j0) f0Var;
        } else {
            parent = f0Var.getParent();
            l0.m(parent);
        }
        return parent.g0(i4, true);
    }

    @fg.m
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public final f0 A(@fg.l String destinationRoute) {
        j0 parent;
        l0.p(destinationRoute, "destinationRoute");
        j0 j0Var = this._graph;
        if (j0Var == null) {
            return null;
        }
        l0.m(j0Var);
        if (l0.g(j0Var.getRoute(), destinationRoute)) {
            return this._graph;
        }
        s v4 = C().v();
        j0 destination = v4 != null ? v4.getDestination() : null;
        if (destination == null) {
            destination = this._graph;
            l0.m(destination);
        }
        if (destination instanceof j0) {
            parent = destination;
        } else {
            parent = destination.getParent();
            l0.m(parent);
        }
        return parent.h0(destinationRoute);
    }

    @fg.l
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public kotlin.collections.k<s> C() {
        return this.backQueue;
    }

    @fg.l
    public s D(@androidx.annotation.d0 int destinationId) {
        s sVar;
        kotlin.collections.k<s> C = C();
        ListIterator<s> listIterator = C.listIterator(C.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                sVar = null;
                break;
            }
            sVar = listIterator.previous();
            if (sVar.getDestination().getId() == destinationId) {
                break;
            }
        }
        s sVar2 = sVar;
        if (sVar2 != null) {
            return sVar2;
        }
        StringBuilder a5 = androidx.collection.s.a("No destination with ID ", destinationId, " is on the NavController's back stack. The current destination is ");
        a5.append(I());
        throw new IllegalArgumentException(a5.toString().toString());
    }

    @fg.l
    public final s E(@fg.l String route) {
        s sVar;
        l0.p(route, "route");
        kotlin.collections.k<s> C = C();
        ListIterator<s> listIterator = C.listIterator(C.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                sVar = null;
                break;
            }
            sVar = listIterator.previous();
            if (l0.g(sVar.getDestination().getRoute(), route)) {
                break;
            }
        }
        s sVar2 = sVar;
        if (sVar2 != null) {
            return sVar2;
        }
        StringBuilder a5 = androidx.appcompat.view.g.a("No destination with route ", route, " is on the NavController's back stack. The current destination is ");
        a5.append(I());
        throw new IllegalArgumentException(a5.toString().toString());
    }

    @fg.l
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    /* renamed from: F, reason: from getter */
    public final android.content.Context getContext() {
        return this.context;
    }

    @fg.m
    public s G() {
        return C().v();
    }

    @fg.l
    public final List<s> G0() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            Set<s> value = ((b) it.next()).c().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : value) {
                s sVar = (s) obj;
                if (!arrayList.contains(sVar) && !sVar.getLifecycle().getState().isAtLeast(AbstractC1450w.b.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            kotlin.collections.w.q0(arrayList, arrayList2);
        }
        kotlin.collections.k<s> C = C();
        ArrayList arrayList3 = new ArrayList();
        for (s sVar2 : C) {
            s sVar3 = sVar2;
            if (!arrayList.contains(sVar3) && sVar3.getLifecycle().getState().isAtLeast(AbstractC1450w.b.STARTED)) {
                arrayList3.add(sVar2);
            }
        }
        kotlin.collections.w.q0(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((s) obj2).getDestination() instanceof j0)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    @fg.l
    public final kotlinx.coroutines.flow.i<s> H() {
        return this.currentBackStackEntryFlow;
    }

    public void H0(@fg.l c listener) {
        l0.p(listener, "listener");
        this.onDestinationChangedListeners.remove(listener);
    }

    @fg.m
    public f0 I() {
        s G = G();
        if (G == null) {
            return null;
        }
        return G.getDestination();
    }

    @androidx.annotation.i
    public void I0(@fg.m Bundle navState) {
        if (navState == null) {
            return;
        }
        navState.setClassLoader(this.context.getClassLoader());
        this.navigatorStateToRestore = navState.getBundle("android-support-nav:controller:navigatorState");
        this.backStackToRestore = navState.getParcelableArray("android-support-nav:controller:backStack");
        this.backStackStates.clear();
        int[] intArray = navState.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList<String> stringArrayList = navState.getStringArrayList("android-support-nav:controller:backStackIds");
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                int i6 = intArray[i4];
                i4++;
                this.backStackMap.put(Integer.valueOf(i6), stringArrayList.get(i5));
                i5++;
            }
        }
        ArrayList<String> stringArrayList2 = navState.getStringArrayList("android-support-nav:controller:backStackStates");
        if (stringArrayList2 != null) {
            for (String id2 : stringArrayList2) {
                Parcelable[] parcelableArray = navState.getParcelableArray(l0.C("android-support-nav:controller:backStackStates:", id2));
                if (parcelableArray != null) {
                    Map<String, kotlin.collections.k<NavBackStackEntryState>> map = this.backStackStates;
                    l0.o(id2, "id");
                    kotlin.collections.k<NavBackStackEntryState> kVar = new kotlin.collections.k<>(parcelableArray.length);
                    Iterator a5 = kotlin.jvm.internal.i.a(parcelableArray);
                    while (a5.hasNext()) {
                        Parcelable parcelable = (Parcelable) a5.next();
                        if (parcelable == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        }
                        kVar.addLast((NavBackStackEntryState) parcelable);
                    }
                    k2 k2Var = k2.f75408a;
                    map.put(id2, kVar);
                }
            }
        }
        this.deepLinkHandled = navState.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    @fg.l
    @androidx.annotation.l0
    public j0 K() {
        j0 j0Var = this._graph;
        if (j0Var == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        if (j0Var != null) {
            return j0Var;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavGraph");
    }

    @androidx.annotation.i
    @fg.m
    public Bundle K0() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, c1<? extends f0>> entry : this._navigatorProvider.g().entrySet()) {
            String key = entry.getKey();
            Bundle i4 = entry.getValue().i();
            if (i4 != null) {
                arrayList.add(key);
                bundle2.putBundle(key, i4);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        if (!C().isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[C().getSize()];
            Iterator<s> it = C().iterator();
            int i5 = 0;
            while (it.hasNext()) {
                parcelableArr[i5] = new NavBackStackEntryState(it.next());
                i5++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (!this.backStackMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.backStackMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i6 = 0;
            for (Map.Entry<Integer, String> entry2 : this.backStackMap.entrySet()) {
                int intValue = entry2.getKey().intValue();
                String value = entry2.getValue();
                iArr[i6] = intValue;
                arrayList2.add(value);
                i6++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        if (!this.backStackStates.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry<String, kotlin.collections.k<NavBackStackEntryState>> entry3 : this.backStackStates.entrySet()) {
                String key2 = entry3.getKey();
                kotlin.collections.k<NavBackStackEntryState> value2 = entry3.getValue();
                arrayList3.add(key2);
                Parcelable[] parcelableArr2 = new Parcelable[value2.getSize()];
                int i7 = 0;
                for (NavBackStackEntryState navBackStackEntryState : value2) {
                    int i10 = i7 + 1;
                    if (i7 < 0) {
                        kotlin.collections.w.Z();
                    }
                    parcelableArr2[i7] = navBackStackEntryState;
                    i7 = i10;
                }
                bundle.putParcelableArray(l0.C("android-support-nav:controller:backStackStates:", key2), parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.deepLinkHandled) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.deepLinkHandled);
        }
        return bundle;
    }

    @fg.l
    public final AbstractC1450w.b L() {
        return this.lifecycleOwner == null ? AbstractC1450w.b.CREATED : this.hostLifecycleState;
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void L0(@androidx.annotation.n0 int graphResId) {
        O0(M().b(graphResId), null);
    }

    @fg.l
    public s0 M() {
        return (s0) this.navInflater.getValue();
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void M0(@androidx.annotation.n0 int graphResId, @fg.m Bundle startDestinationArgs) {
        O0(M().b(graphResId), startDestinationArgs);
    }

    @fg.l
    /* renamed from: N, reason: from getter */
    public d1 get_navigatorProvider() {
        return this._navigatorProvider;
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void N0(@fg.l j0 graph) {
        l0.p(graph, "graph");
        O0(graph, null);
    }

    @fg.m
    public s O() {
        Object obj;
        Iterator it = kotlin.collections.w.X4(C()).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = kotlin.sequences.p.e(it).iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (!(((s) obj).getDestination() instanceof j0)) {
                break;
            }
        }
        return (s) obj;
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void O0(@fg.l j0 graph, @fg.m Bundle startDestinationArgs) {
        l0.p(graph, "graph");
        if (!l0.g(this._graph, graph)) {
            j0 j0Var = this._graph;
            if (j0Var != null) {
                for (Integer id2 : new ArrayList(this.backStackMap.keySet())) {
                    l0.o(id2, "id");
                    t(id2.intValue());
                }
                D0(this, j0Var.getId(), true, false, 4, null);
            }
            this._graph = graph;
            s0(startDestinationArgs);
            return;
        }
        int B = graph.k0().B();
        int i4 = 0;
        while (i4 < B) {
            int i5 = i4 + 1;
            f0 newDestination = graph.k0().C(i4);
            j0 j0Var2 = this._graph;
            l0.m(j0Var2);
            j0Var2.k0().y(i4, newDestination);
            kotlin.collections.k<s> C = C();
            ArrayList<s> arrayList = new ArrayList();
            for (s sVar : C) {
                int id3 = sVar.getDestination().getId();
                if (newDestination != null && id3 == newDestination.getId()) {
                    arrayList.add(sVar);
                }
            }
            for (s sVar2 : arrayList) {
                l0.o(newDestination, "newDestination");
                sVar2.l(newDestination);
            }
            i4 = i5;
        }
    }

    @fg.l
    public o1 P(@androidx.annotation.d0 int navGraphId) {
        if (this.viewModel == null) {
            throw new IllegalStateException("You must call setViewModelStore() before calling getViewModelStoreOwner().");
        }
        s D = D(navGraphId);
        if (D.getDestination() instanceof j0) {
            return D;
        }
        throw new IllegalArgumentException(r2.a("No NavGraph with ID ", navGraphId, " is on the NavController's back stack").toString());
    }

    public final void P0(@fg.l AbstractC1450w.b bVar) {
        l0.p(bVar, "<set-?>");
        this.hostLifecycleState = bVar;
    }

    @fg.l
    public final t0<List<s>> Q() {
        return this.visibleEntries;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public void Q0(@fg.l InterfaceC1423e0 owner) {
        AbstractC1450w lifecycle;
        l0.p(owner, "owner");
        if (l0.g(owner, this.lifecycleOwner)) {
            return;
        }
        InterfaceC1423e0 interfaceC1423e0 = this.lifecycleOwner;
        if (interfaceC1423e0 != null && (lifecycle = interfaceC1423e0.getLifecycle()) != null) {
            lifecycle.d(this.lifecycleObserver);
        }
        this.lifecycleOwner = owner;
        owner.getLifecycle().a(this.lifecycleObserver);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public void R0(@fg.l d1 navigatorProvider) {
        l0.p(navigatorProvider, "navigatorProvider");
        if (!C().isEmpty()) {
            throw new IllegalStateException("NavigatorProvider must be set before setGraph call");
        }
        this._navigatorProvider = navigatorProvider;
    }

    @androidx.annotation.l0
    public boolean S(@fg.m Intent intent) {
        int[] iArr;
        f0 g02;
        Bundle bundle;
        int i4 = 0;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        int[] intArray = extras == null ? null : extras.getIntArray("android-support-nav:controller:deepLinkIds");
        ArrayList parcelableArrayList = extras == null ? null : extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = extras == null ? null : extras.getBundle("android-support-nav:controller:deepLinkExtras");
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        if (intArray == null || intArray.length == 0) {
            j0 j0Var = this._graph;
            l0.m(j0Var);
            f0.c I2 = j0Var.I(new d0(intent));
            if (I2 != null) {
                f0 destination = I2.getDestination();
                int[] m4 = f0.m(destination, null, 1, null);
                Bundle i5 = destination.i(I2.getMatchingArgs());
                if (i5 != null) {
                    bundle2.putAll(i5);
                }
                iArr = m4;
                parcelableArrayList = null;
                if (iArr != null || iArr.length == 0) {
                    return false;
                }
                if (B(iArr) != null) {
                    intent.toString();
                    return false;
                }
                bundle2.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                int length = iArr.length;
                Bundle[] bundleArr = new Bundle[length];
                int i6 = 0;
                while (i6 < length) {
                    int i7 = i6 + 1;
                    Bundle bundle4 = new Bundle();
                    bundle4.putAll(bundle2);
                    if (parcelableArrayList != null && (bundle = (Bundle) parcelableArrayList.get(i6)) != null) {
                        bundle4.putAll(bundle);
                    }
                    bundleArr[i6] = bundle4;
                    i6 = i7;
                }
                int flags = intent.getFlags();
                int i10 = 268435456 & flags;
                if (i10 != 0 && (flags & 32768) == 0) {
                    intent.addFlags(32768);
                    x0 c5 = x0.j(this.context).c(intent);
                    l0.o(c5, "create(context)\n        …ntWithParentStack(intent)");
                    c5.x(null);
                    Activity activity = this.activity;
                    if (activity != null) {
                        activity.finish();
                        activity.overridePendingTransition(0, 0);
                    }
                    return true;
                }
                if (i10 != 0) {
                    if (!C().isEmpty()) {
                        j0 j0Var2 = this._graph;
                        l0.m(j0Var2);
                        D0(this, j0Var2.getId(), true, false, 4, null);
                    }
                    while (i4 < iArr.length) {
                        int i11 = iArr[i4];
                        int i12 = i4 + 1;
                        Bundle bundle5 = bundleArr[i4];
                        f0 y4 = y(i11);
                        if (y4 == null) {
                            StringBuilder a5 = androidx.appcompat.view.g.a("Deep Linking failed: destination ", f0.INSTANCE.b(this.context, i11), " cannot be found from the current destination ");
                            a5.append(I());
                            throw new IllegalStateException(a5.toString());
                        }
                        g0(y4, bundle5, v0.a(new e(y4, this)), null);
                        i4 = i12;
                    }
                    return true;
                }
                j0 j0Var3 = this._graph;
                int length2 = iArr.length;
                int i13 = 0;
                while (i13 < length2) {
                    int i14 = i13 + 1;
                    int i15 = iArr[i13];
                    Bundle bundle6 = bundleArr[i13];
                    if (i13 == 0) {
                        g02 = this._graph;
                    } else {
                        l0.m(j0Var3);
                        g02 = j0Var3.g0(i15, true);
                    }
                    if (g02 == null) {
                        throw new IllegalStateException("Deep Linking failed: destination " + f0.INSTANCE.b(this.context, i15) + " cannot be found in graph " + j0Var3);
                    }
                    if (i13 == iArr.length - 1) {
                        t0.a aVar = new t0.a();
                        j0 j0Var4 = this._graph;
                        l0.m(j0Var4);
                        g0(g02, bundle6, t0.a.k(aVar, j0Var4.getId(), true, false, 4, null).b(0).c(0).a(), null);
                    } else if (g02 instanceof j0) {
                        j0Var3 = (j0) g02;
                        while (true) {
                            l0.m(j0Var3);
                            if (j0Var3.g0(j0Var3.n0(), true) instanceof j0) {
                                j0Var3 = (j0) j0Var3.g0(j0Var3.n0(), true);
                            }
                        }
                    }
                    i13 = i14;
                }
                this.deepLinkHandled = true;
                return true;
            }
        }
        iArr = intArray;
        if (iArr != null) {
        }
        return false;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public void S0(@fg.l OnBackPressedDispatcher dispatcher) {
        l0.p(dispatcher, "dispatcher");
        if (l0.g(dispatcher, this.onBackPressedDispatcher)) {
            return;
        }
        InterfaceC1423e0 interfaceC1423e0 = this.lifecycleOwner;
        if (interfaceC1423e0 == null) {
            throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
        }
        this.onBackPressedCallback.remove();
        this.onBackPressedDispatcher = dispatcher;
        dispatcher.i(interfaceC1423e0, this.onBackPressedCallback);
        AbstractC1450w lifecycle = interfaceC1423e0.getLifecycle();
        lifecycle.d(this.lifecycleObserver);
        lifecycle.a(this.lifecycleObserver);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public void T0(@fg.l n1 viewModelStore) {
        l0.p(viewModelStore, "viewModelStore");
        w wVar = this.viewModel;
        w.Companion companion = w.INSTANCE;
        if (l0.g(wVar, companion.a(viewModelStore))) {
            return;
        }
        if (!C().isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        this.viewModel = companion.a(viewModelStore);
    }

    @androidx.annotation.l0
    public void W(@androidx.annotation.d0 int resId) {
        X(resId, null);
    }

    @fg.m
    public final s W0(@fg.l s child) {
        l0.p(child, "child");
        s remove = this.childToParentEntries.remove(child);
        if (remove == null) {
            return null;
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(remove);
        Integer valueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            b bVar = this.navigatorState.get(this._navigatorProvider.f(remove.getDestination().getNavigatorName()));
            if (bVar != null) {
                bVar.e(remove);
            }
            this.parentToChildCount.remove(remove);
        }
        return remove;
    }

    @androidx.annotation.l0
    public void X(@androidx.annotation.d0 int resId, @fg.m Bundle args) {
        Y(resId, args, null);
    }

    public final void X0() {
        f0 f0Var;
        kotlinx.coroutines.flow.t0<Set<s>> c5;
        Set<s> value;
        AtomicInteger atomicInteger;
        List<s> Y5 = kotlin.collections.w.Y5(C());
        if (Y5.isEmpty()) {
            return;
        }
        f0 destination = ((s) kotlin.collections.w.p3(Y5)).getDestination();
        if (destination instanceof androidx.content.i) {
            Iterator it = kotlin.collections.w.X4(Y5).iterator();
            while (it.hasNext()) {
                f0Var = ((s) it.next()).getDestination();
                if (!(f0Var instanceof j0) && !(f0Var instanceof androidx.content.i)) {
                    break;
                }
            }
        }
        f0Var = null;
        HashMap hashMap = new HashMap();
        for (s sVar : kotlin.collections.w.X4(Y5)) {
            AbstractC1450w.b maxLifecycle = sVar.getMaxLifecycle();
            f0 destination2 = sVar.getDestination();
            if (destination != null && destination2.getId() == destination.getId()) {
                AbstractC1450w.b bVar = AbstractC1450w.b.RESUMED;
                if (maxLifecycle != bVar) {
                    b bVar2 = this.navigatorState.get(get_navigatorProvider().f(sVar.getDestination().getNavigatorName()));
                    if (l0.g((bVar2 == null || (c5 = bVar2.c()) == null || (value = c5.getValue()) == null) ? null : Boolean.valueOf(value.contains(sVar)), Boolean.TRUE) || ((atomicInteger = this.parentToChildCount.get(sVar)) != null && atomicInteger.get() == 0)) {
                        hashMap.put(sVar, AbstractC1450w.b.STARTED);
                    } else {
                        hashMap.put(sVar, bVar);
                    }
                }
                destination = destination.getParent();
            } else if (f0Var == null || destination2.getId() != f0Var.getId()) {
                sVar.m(AbstractC1450w.b.CREATED);
            } else {
                if (maxLifecycle == AbstractC1450w.b.RESUMED) {
                    sVar.m(AbstractC1450w.b.STARTED);
                } else {
                    AbstractC1450w.b bVar3 = AbstractC1450w.b.STARTED;
                    if (maxLifecycle != bVar3) {
                        hashMap.put(sVar, bVar3);
                    }
                }
                f0Var = f0Var.getParent();
            }
        }
        for (s sVar2 : Y5) {
            AbstractC1450w.b bVar4 = (AbstractC1450w.b) hashMap.get(sVar2);
            if (bVar4 != null) {
                sVar2.m(bVar4);
            } else {
                sVar2.n();
            }
        }
    }

    @androidx.annotation.l0
    public void Y(@androidx.annotation.d0 int resId, @fg.m Bundle args, @fg.m t0 navOptions) {
        Z(resId, args, navOptions, null);
    }

    @androidx.annotation.l0
    public void Z(@androidx.annotation.d0 int resId, @fg.m Bundle args, @fg.m t0 navOptions, @fg.m c1.a navigatorExtras) {
        int i4;
        f0 destination = C().isEmpty() ? this._graph : C().last().getDestination();
        if (destination == null) {
            throw new IllegalStateException("no current navigation node");
        }
        androidx.content.l p4 = destination.p(resId);
        Bundle bundle = null;
        if (p4 != null) {
            if (navOptions == null) {
                navOptions = p4.getNavOptions();
            }
            i4 = p4.getDestinationId();
            Bundle defaultArguments = p4.getDefaultArguments();
            if (defaultArguments != null) {
                bundle = new Bundle();
                bundle.putAll(defaultArguments);
            }
        } else {
            i4 = resId;
        }
        if (args != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putAll(args);
        }
        if (i4 == 0 && navOptions != null && navOptions.f() != -1) {
            u0(navOptions.f(), navOptions.getPopUpToInclusive());
            return;
        }
        if (i4 == 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        }
        f0 y4 = y(i4);
        if (y4 != null) {
            g0(y4, bundle, navOptions, navigatorExtras);
            return;
        }
        f0.Companion companion = f0.INSTANCE;
        String b5 = companion.b(this.context, i4);
        if (p4 == null) {
            throw new IllegalArgumentException("Navigation action/destination " + b5 + " cannot be found from the current destination " + destination);
        }
        StringBuilder a5 = androidx.appcompat.view.g.a("Navigation destination ", b5, " referenced from action ");
        a5.append(companion.b(this.context, resId));
        a5.append(" cannot be found from the current destination ");
        a5.append(destination);
        throw new IllegalArgumentException(a5.toString().toString());
    }

    @androidx.annotation.l0
    public void a0(@fg.l Uri deepLink) {
        l0.p(deepLink, "deepLink");
        d0(new d0(deepLink, null, null));
    }

    @androidx.annotation.l0
    public void b0(@fg.l Uri deepLink, @fg.m t0 navOptions) {
        l0.p(deepLink, "deepLink");
        f0(new d0(deepLink, null, null), navOptions, null);
    }

    @androidx.annotation.l0
    public void c0(@fg.l Uri deepLink, @fg.m t0 navOptions, @fg.m c1.a navigatorExtras) {
        l0.p(deepLink, "deepLink");
        f0(new d0(deepLink, null, null), navOptions, navigatorExtras);
    }

    @androidx.annotation.l0
    public void d0(@fg.l d0 request) {
        l0.p(request, "request");
        e0(request, null);
    }

    @androidx.annotation.l0
    public void e0(@fg.l d0 request, @fg.m t0 navOptions) {
        l0.p(request, "request");
        f0(request, navOptions, null);
    }

    @androidx.annotation.l0
    public void f0(@fg.l d0 request, @fg.m t0 navOptions, @fg.m c1.a navigatorExtras) {
        l0.p(request, "request");
        j0 j0Var = this._graph;
        l0.m(j0Var);
        f0.c I2 = j0Var.I(request);
        if (I2 == null) {
            throw new IllegalArgumentException("Navigation destination that matches request " + request + " cannot be found in the navigation graph " + this._graph);
        }
        Bundle i4 = I2.getDestination().i(I2.getMatchingArgs());
        if (i4 == null) {
            i4 = new Bundle();
        }
        f0 destination = I2.getDestination();
        Intent intent = new Intent();
        intent.setDataAndType(request.getUri(), request.getMimeType());
        intent.setAction(request.getAction());
        i4.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        g0(destination, i4, navOptions, navigatorExtras);
    }

    @androidx.annotation.l0
    public void h0(@fg.l i0 directions) {
        l0.p(directions, "directions");
        Y(directions.d(), directions.getArguments(), null);
    }

    @androidx.annotation.l0
    public void i0(@fg.l i0 directions, @fg.m t0 navOptions) {
        l0.p(directions, "directions");
        Y(directions.d(), directions.getArguments(), navOptions);
    }

    @androidx.annotation.l0
    public void j0(@fg.l i0 directions, @fg.l c1.a navigatorExtras) {
        l0.p(directions, "directions");
        l0.p(navigatorExtras, "navigatorExtras");
        Z(directions.d(), directions.getArguments(), null, navigatorExtras);
    }

    @kd.j
    public final void k0(@fg.l String route) {
        l0.p(route, "route");
        o0(this, route, null, null, 6, null);
    }

    @kd.j
    public final void l0(@fg.l String route, @fg.m t0 t0Var) {
        l0.p(route, "route");
        o0(this, route, t0Var, null, 4, null);
    }

    @kd.j
    public final void m0(@fg.l String route, @fg.m t0 navOptions, @fg.m c1.a navigatorExtras) {
        l0.p(route, "route");
        d0.a.Companion companion = d0.a.INSTANCE;
        Uri parse = Uri.parse(f0.INSTANCE.a(route));
        l0.h(parse, "Uri.parse(this)");
        f0(companion.c(parse).a(), navOptions, navigatorExtras);
    }

    public final void n0(@fg.l String route, @fg.l ld.l<? super u0, k2> builder) {
        l0.p(route, "route");
        l0.p(builder, "builder");
        o0(this, route, v0.a(builder), null, 4, null);
    }

    public void q(@fg.l c listener) {
        l0.p(listener, "listener");
        this.onDestinationChangedListeners.add(listener);
        if (C().isEmpty()) {
            return;
        }
        s last = C().last();
        listener.a(this, last.getDestination(), last.getArguments());
    }

    @androidx.annotation.l0
    public final boolean r(@androidx.annotation.d0 int destinationId) {
        return t(destinationId) && v();
    }

    @androidx.annotation.l0
    public boolean r0() {
        Intent intent;
        if (J() != 1) {
            return t0();
        }
        Activity activity = this.activity;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        return (extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null) != null ? U0() : V0();
    }

    @androidx.annotation.l0
    public final boolean s(@fg.l String route) {
        l0.p(route, "route");
        return r(f0.INSTANCE.a(route).hashCode());
    }

    @androidx.annotation.l0
    public boolean t0() {
        if (C().isEmpty()) {
            return false;
        }
        f0 I2 = I();
        l0.m(I2);
        return u0(I2.getId(), true);
    }

    @fg.l
    public z u() {
        return new z(this);
    }

    @androidx.annotation.l0
    public boolean u0(@androidx.annotation.d0 int destinationId, boolean inclusive) {
        return v0(destinationId, inclusive, false);
    }

    @androidx.annotation.l0
    public boolean v0(@androidx.annotation.d0 int destinationId, boolean inclusive, boolean saveState) {
        return B0(destinationId, inclusive, saveState) && v();
    }

    @kd.j
    @androidx.annotation.l0
    public final boolean w0(@fg.l String route, boolean z4) {
        l0.p(route, "route");
        return y0(this, route, z4, false, 4, null);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public void x(boolean enabled) {
        this.enableOnBackPressedCallback = enabled;
        Y0();
    }

    @kd.j
    @androidx.annotation.l0
    public final boolean x0(@fg.l String route, boolean inclusive, boolean saveState) {
        l0.p(route, "route");
        return v0(f0.INSTANCE.a(route).hashCode(), inclusive, saveState);
    }

    @fg.m
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public final f0 y(@androidx.annotation.d0 int destinationId) {
        j0 j0Var = this._graph;
        if (j0Var == null) {
            return null;
        }
        l0.m(j0Var);
        if (j0Var.getId() == destinationId) {
            return this._graph;
        }
        s v4 = C().v();
        f0 destination = v4 != null ? v4.getDestination() : null;
        if (destination == null) {
            destination = this._graph;
            l0.m(destination);
        }
        return z(destination, destinationId);
    }

    public final void z0(@fg.l s popUpTo, @fg.l a<k2> onComplete) {
        l0.p(popUpTo, "popUpTo");
        l0.p(onComplete, "onComplete");
        int indexOf = C().indexOf(popUpTo);
        if (indexOf < 0) {
            Objects.toString(popUpTo);
            return;
        }
        int i4 = indexOf + 1;
        if (i4 != C().getSize()) {
            B0(C().get(i4).getDestination().getId(), true, false);
        }
        F0(this, popUpTo, false, null, 6, null);
        onComplete.invoke();
        Y0();
        v();
    }
}

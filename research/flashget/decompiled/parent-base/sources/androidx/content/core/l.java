package androidx.content.core;

import androidx.annotation.b0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.c0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.k2;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.flow.v0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.y;
import ld.a;
import org.apache.http.HttpStatus;

/* compiled from: SingleProcessDataStore.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 V*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003-35B\u0081\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012?\b\u0002\u0010\u0011\u001a9\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\t0\b\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\"\u0010!J\u0013\u0010#\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b#\u0010!J\u0013\u0010$\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b$\u0010!J\u0013\u0010%\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b%\u0010!JN\u0010)\u001a\u00028\u000021\u0010&\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\t2\u0006\u0010(\u001a\u00020'H\u0082@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0013\u0010+\u001a\u00020\u000f*\u00020\u0004H\u0002¢\u0006\u0004\b+\u0010,JF\u0010-\u001a\u00028\u000021\u0010&\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u001b\u00100\u001a\u00020\u000f2\u0006\u0010/\u001a\u00028\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\b0\u00101R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00102R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u0010=\u001a\b\u0012\u0004\u0012\u00028\u0000098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b3\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082D¢\u0006\u0006\n\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER&\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000H0G8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bI\u0010J\u0012\u0004\bK\u0010LRR\u0010P\u001a;\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\bN\u0010OR \u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000R0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010T\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006W"}, d2 = {"Landroidx/datastore/core/l;", "T", "Landroidx/datastore/core/e;", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Landroidx/datastore/core/j;", "serializer", "", "Lkotlin/Function2;", "Landroidx/datastore/core/h;", "Lkotlin/r0;", "name", "api", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "initTasksList", "Landroidx/datastore/core/a;", "corruptionHandler", "Lkotlinx/coroutines/r0;", "scope", "<init>", "(Lld/a;Landroidx/datastore/core/j;Ljava/util/List;Landroidx/datastore/core/a;Lkotlinx/coroutines/r0;)V", "Landroidx/datastore/core/l$b$a;", "read", "t", "(Landroidx/datastore/core/l$b$a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/datastore/core/l$b$b;", "update", "u", "(Landroidx/datastore/core/l$b$b;Lkotlin/coroutines/d;)Ljava/lang/Object;", "w", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "x", "v", "z", "y", "transform", "Lkotlin/coroutines/g;", "callerContext", "A", "(Lld/p;Lkotlin/coroutines/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "q", "(Ljava/io/File;)V", "a", "(Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "newData", "B", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lld/a;", "b", "Landroidx/datastore/core/j;", "c", "Landroidx/datastore/core/a;", "d", "Lkotlinx/coroutines/r0;", "Lkotlinx/coroutines/flow/i;", "e", "Lkotlinx/coroutines/flow/i;", "()Lkotlinx/coroutines/flow/i;", "data", "", "f", "Ljava/lang/String;", "SCRATCH_SUFFIX", "g", "Lkotlin/b0;", "s", "()Ljava/io/File;", "file", "Lkotlinx/coroutines/flow/e0;", "Landroidx/datastore/core/m;", "h", "Lkotlinx/coroutines/flow/e0;", "r", "()V", "downstreamFlow", "i", "Ljava/util/List;", "initTasks", "Landroidx/datastore/core/k;", "Landroidx/datastore/core/l$b;", "j", "Landroidx/datastore/core/k;", "actor", "k", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class l<T> implements androidx.content.core.e<T> {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    @b0("activeFilesLock")
    private static final Set<String> f28425l = new LinkedHashSet();

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    private static final Object f28426m = new Object();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a<File> produceFile;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.content.core.j<T> serializer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a<T> corruptionHandler;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final r0 scope;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.flow.i<T> data;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String SCRATCH_SUFFIX;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.b0 file;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e0<androidx.content.core.m<T>> downstreamFlow;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private List<? extends ld.p<? super androidx.content.core.h<T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object>> initTasks;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.content.core.k<b<T>> actor;

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/datastore/core/l$a;", "", "<init>", "()V", "", "", "activeFiles", "Ljava/util/Set;", "a", "()Ljava/util/Set;", "activeFilesLock", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: androidx.datastore.core.l$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final Set<String> a() {
            return l.f28425l;
        }

        @fg.l
        public final Object b() {
            return l.f28426m;
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\u0006\tB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Landroidx/datastore/core/l$b;", "T", "", "<init>", "()V", "Landroidx/datastore/core/m;", "a", "()Landroidx/datastore/core/m;", "lastState", "b", "Landroidx/datastore/core/l$b$a;", "Landroidx/datastore/core/l$b$b;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static abstract class b<T> {

        /* compiled from: SingleProcessDataStore.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Landroidx/datastore/core/l$b$a;", "T", "Landroidx/datastore/core/l$b;", "Landroidx/datastore/core/m;", "lastState", "<init>", "(Landroidx/datastore/core/m;)V", "a", "Landroidx/datastore/core/m;", "()Landroidx/datastore/core/m;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class a<T> extends b<T> {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @fg.m
            private final androidx.content.core.m<T> lastState;

            public a(@fg.m androidx.content.core.m<T> mVar) {
                super(null);
                this.lastState = mVar;
            }

            @Override // androidx.datastore.core.l.b
            @fg.m
            public androidx.content.core.m<T> a() {
                return this.lastState;
            }
        }

        /* compiled from: SingleProcessDataStore.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002Bc\u00121\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011RE\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00038\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0012\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroidx/datastore/core/l$b$b;", "T", "Landroidx/datastore/core/l$b;", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "t", "Lkotlin/coroutines/d;", "", "transform", "Lkotlinx/coroutines/y;", "ack", "Landroidx/datastore/core/m;", "lastState", "Lkotlin/coroutines/g;", "callerContext", "<init>", "(Lld/p;Lkotlinx/coroutines/y;Landroidx/datastore/core/m;Lkotlin/coroutines/g;)V", "a", "Lld/p;", "d", "()Lld/p;", "b", "Lkotlinx/coroutines/y;", "()Lkotlinx/coroutines/y;", "c", "Landroidx/datastore/core/m;", "()Landroidx/datastore/core/m;", "Lkotlin/coroutines/g;", "()Lkotlin/coroutines/g;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: androidx.datastore.core.l$b$b, reason: collision with other inner class name */
        public static final class C0463b<T> extends b<T> {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @fg.l
            private final ld.p<T, kotlin.coroutines.d<? super T>, Object> transform;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @fg.l
            private final y<T> ack;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @fg.m
            private final androidx.content.core.m<T> lastState;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @fg.l
            private final kotlin.coroutines.g callerContext;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0463b(@fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> transform, @fg.l y<T> ack, @fg.m androidx.content.core.m<T> mVar, @fg.l kotlin.coroutines.g callerContext) {
                super(null);
                l0.p(transform, "transform");
                l0.p(ack, "ack");
                l0.p(callerContext, "callerContext");
                this.transform = transform;
                this.ack = ack;
                this.lastState = mVar;
                this.callerContext = callerContext;
            }

            @Override // androidx.datastore.core.l.b
            @fg.m
            public androidx.content.core.m<T> a() {
                return this.lastState;
            }

            @fg.l
            public final y<T> b() {
                return this.ack;
            }

            @fg.l
            /* renamed from: c, reason: from getter */
            public final kotlin.coroutines.g getCallerContext() {
                return this.callerContext;
            }

            @fg.l
            public final ld.p<T, kotlin.coroutines.d<? super T>, Object> d() {
                return this.transform;
            }
        }

        public /* synthetic */ b(w wVar) {
            this();
        }

        @fg.m
        public abstract androidx.content.core.m<T> a();

        private b() {
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\fJ'\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/datastore/core/l$c;", "Ljava/io/OutputStream;", "Ljava/io/FileOutputStream;", "fileOutputStream", "<init>", "(Ljava/io/FileOutputStream;)V", "", "b", "Lkotlin/k2;", "write", "(I)V", "", "([B)V", "bytes", "off", "len", "([BII)V", "close", "()V", "flush", "Ljava/io/FileOutputStream;", "a", "()Ljava/io/FileOutputStream;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class c extends OutputStream {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final FileOutputStream fileOutputStream;

        public c(@fg.l FileOutputStream fileOutputStream) {
            l0.p(fileOutputStream, "fileOutputStream");
            this.fileOutputStream = fileOutputStream;
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final FileOutputStream getFileOutputStream() {
            return this.fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.fileOutputStream.flush();
        }

        @Override // java.io.OutputStream
        public void write(int b5) {
            this.fileOutputStream.write(b5);
        }

        @Override // java.io.OutputStream
        public void write(@fg.l byte[] b5) {
            l0.p(b5, "b");
            this.fileOutputStream.write(b5);
        }

        @Override // java.io.OutputStream
        public void write(@fg.l byte[] bytes, int off, int len) {
            l0.p(bytes, "bytes");
            this.fileOutputStream.write(bytes, off, len);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/k2;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    static final class d extends n0 implements ld.l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<T> f28443b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(l<T> lVar) {
            super(1);
            this.f28443b = lVar;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.m Throwable th) {
            if (th != null) {
                ((l) this.f28443b).downstreamFlow.setValue(new androidx.content.core.g(th));
            }
            Companion companion = l.INSTANCE;
            companion.getClass();
            Object obj = l.f28426m;
            l<T> lVar = this.f28443b;
            synchronized (obj) {
                companion.getClass();
                l.f28425l.remove(lVar.s().getAbsolutePath());
                k2 k2Var = k2.f75408a;
            }
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Landroidx/datastore/core/l$b;", "msg", "", "ex", "Lkotlin/k2;", "<anonymous>", "(Landroidx/datastore/core/l$b;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    static final class e extends n0 implements ld.p<b<T>, Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f28444b = new e(2);

        e() {
            super(2);
        }

        public final void a(@fg.l b<T> msg, @fg.m Throwable th) {
            l0.p(msg, "msg");
            if (msg instanceof b.C0463b) {
                y<T> b5 = ((b.C0463b) msg).b();
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                b5.e(th);
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(Object obj, Throwable th) {
            a((b) obj, th);
            return k2.f75408a;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", i = {}, l = {239, 242}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/datastore/core/l$b;", "msg", "Lkotlin/k2;", "<anonymous>", "(Landroidx/datastore/core/l$b;)V"}, k = 3, mv = {1, 5, 1})
    static final class f extends kotlin.coroutines.jvm.internal.o implements ld.p<b<T>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f28445b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f28446c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<T> f28447d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(l<T> lVar, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f28447d = lVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l b<T> bVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((f) create(bVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            f fVar = new f(this.f28447d, dVar);
            fVar.f28446c = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f28445b;
            if (i4 == 0) {
                a1.n(obj);
                b bVar = (b) this.f28446c;
                if (bVar instanceof b.a) {
                    this.f28445b = 1;
                    if (this.f28447d.t((b.a) bVar, this) == aVar) {
                        return aVar;
                    }
                } else if (bVar instanceof b.C0463b) {
                    this.f28445b = 2;
                    if (this.f28447d.u((b.C0463b) bVar, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i4 != 1 && i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 5, 1})
    static final class g extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f28448b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f28449c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<T> f28450d;

        /* compiled from: SingleProcessDataStore.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/datastore/core/m;", "it", "", "<anonymous>", "(Landroidx/datastore/core/m;)Z"}, k = 3, mv = {1, 5, 1})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.content.core.m<T>, kotlin.coroutines.d<? super Boolean>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f28451b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f28452c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.content.core.m<T> f28453d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.content.core.m<T> mVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f28453d = mVar;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l androidx.content.core.m<T> mVar, @fg.m kotlin.coroutines.d<? super Boolean> dVar) {
                return ((a) create(mVar, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f28453d, dVar);
                aVar.f28452c = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                if (this.f28451b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
                androidx.content.core.m<T> mVar = (androidx.content.core.m) this.f28452c;
                androidx.content.core.m<T> mVar2 = this.f28453d;
                boolean z4 = false;
                if (!(mVar2 instanceof androidx.content.core.b) && !(mVar2 instanceof androidx.content.core.g) && mVar == mVar2) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$f", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b implements kotlinx.coroutines.flow.i<T> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i f28454b;

            /* compiled from: Collect.kt */
            @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$f$b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
            public static final class a implements kotlinx.coroutines.flow.j<androidx.content.core.m<T>> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.j f28455b;

                @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f = "SingleProcessDataStore.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
                /* renamed from: androidx.datastore.core.l$g$b$a$a, reason: collision with other inner class name */
                public static final class C0464a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f28456b;

                    /* renamed from: c, reason: collision with root package name */
                    int f28457c;

                    /* renamed from: d, reason: collision with root package name */
                    Object f28458d;

                    public C0464a(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    public final Object invokeSuspend(@fg.l Object obj) {
                        this.f28456b = obj;
                        this.f28457c |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(kotlinx.coroutines.flow.j jVar) {
                    this.f28455b = jVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // kotlinx.coroutines.flow.j
                @fg.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object emit(java.lang.Object r5, @fg.l kotlin.coroutines.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.datastore.core.l.g.b.a.C0464a
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.datastore.core.l$g$b$a$a r0 = (androidx.datastore.core.l.g.b.a.C0464a) r0
                        int r1 = r0.f28457c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f28457c = r1
                        goto L18
                    L13:
                        androidx.datastore.core.l$g$b$a$a r0 = new androidx.datastore.core.l$g$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f28456b
                        kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                        int r2 = r0.f28457c
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.a1.n(r6)
                        goto L51
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        kotlin.a1.n(r6)
                        kotlinx.coroutines.flow.j r6 = r4.f28455b
                        androidx.datastore.core.m r5 = (androidx.content.core.m) r5
                        boolean r2 = r5 instanceof androidx.content.core.i
                        if (r2 != 0) goto L6d
                        boolean r2 = r5 instanceof androidx.content.core.g
                        if (r2 != 0) goto L66
                        boolean r2 = r5 instanceof androidx.content.core.b
                        if (r2 == 0) goto L54
                        androidx.datastore.core.b r5 = (androidx.content.core.b) r5
                        java.lang.Object r5 = r5.c()
                        r0.f28457c = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L51
                        return r1
                    L51:
                        kotlin.k2 r5 = kotlin.k2.f75408a
                        return r5
                    L54:
                        boolean r5 = r5 instanceof androidx.content.core.n
                        if (r5 == 0) goto L60
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        r5.<init>(r6)
                        throw r5
                    L60:
                        kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                        r5.<init>()
                        throw r5
                    L66:
                        androidx.datastore.core.g r5 = (androidx.content.core.g) r5
                        java.lang.Throwable r5 = r5.getFinalException()
                        throw r5
                    L6d:
                        androidx.datastore.core.i r5 = (androidx.content.core.i) r5
                        java.lang.Throwable r5 = r5.getReadException()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.l.g.b.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            public b(kotlinx.coroutines.flow.i iVar) {
                this.f28454b = iVar;
            }

            @Override // kotlinx.coroutines.flow.i
            @fg.m
            public Object a(@fg.l kotlinx.coroutines.flow.j jVar, @fg.l kotlin.coroutines.d dVar) {
                Object a5 = this.f28454b.a(new a(jVar), dVar);
                return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(l<T> lVar, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f28450d = lVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.flow.j<? super T> jVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((g) create(jVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            g gVar = new g(this.f28450d, dVar);
            gVar.f28449c = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f28448b;
            if (i4 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f28449c;
                androidx.content.core.m mVar = (androidx.content.core.m) ((l) this.f28450d).downstreamFlow.getValue();
                if (!(mVar instanceof androidx.content.core.b)) {
                    ((l) this.f28450d).actor.e(new b.a(mVar));
                }
                b bVar = new b(new v.e(((l) this.f28450d).downstreamFlow, new a(mVar, null)));
                this.f28448b = 1;
                if (kotlinx.coroutines.flow.k.m0(jVar, bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n"}, d2 = {"<anonymous>", "Ljava/io/File;", "T"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class h extends n0 implements a<File> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<T> f28460b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(l<T> lVar) {
            super(0);
            this.f28460b = lVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File file = (File) ((l) this.f28460b).produceFile.invoke();
            String it = file.getAbsolutePath();
            Companion companion = l.INSTANCE;
            companion.getClass();
            synchronized (l.f28426m) {
                companion.getClass();
                if (l.f28425l.contains(it)) {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
                companion.getClass();
                Set set = l.f28425l;
                l0.o(it, "it");
                set.add(it);
            }
            return file;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {1, 1}, l = {276, 281, 284}, m = "handleUpdate", n = {"update", "$this$handleUpdate_u24lambda_u2d0"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f28461b;

        /* renamed from: c, reason: collision with root package name */
        Object f28462c;

        /* renamed from: d, reason: collision with root package name */
        Object f28463d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f28464e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ l<T> f28465f;

        /* renamed from: g, reason: collision with root package name */
        int f28466g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(l<T> lVar, kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
            this.f28465f = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f28464e = obj;
            this.f28466g |= Integer.MIN_VALUE;
            return this.f28465f.u(null, this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 0, 1, 1, 1, 2}, l = {322, 348, 505}, m = "readAndInit", n = {"updateLock", "initData", "updateLock", "initData", "initializationComplete", "$this$withLock_u24default$iv"}, s = {"L$1", "L$2", "L$1", "L$2", "L$3", "L$3"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f28467b;

        /* renamed from: c, reason: collision with root package name */
        Object f28468c;

        /* renamed from: d, reason: collision with root package name */
        Object f28469d;

        /* renamed from: e, reason: collision with root package name */
        Object f28470e;

        /* renamed from: f, reason: collision with root package name */
        Object f28471f;

        /* renamed from: g, reason: collision with root package name */
        Object f28472g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f28473h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ l<T> f28474i;

        /* renamed from: j, reason: collision with root package name */
        int f28475j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(l<T> lVar, kotlin.coroutines.d<? super j> dVar) {
            super(dVar);
            this.f28474i = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f28473h = obj;
            this.f28475j |= Integer.MIN_VALUE;
            return this.f28474i.v(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001JF\u0010\t\u001a\u00028\u000021\u0010\b\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"androidx/datastore/core/l$k", "Landroidx/datastore/core/h;", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "t", "Lkotlin/coroutines/d;", "", "transform", "a", "(Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class k implements androidx.content.core.h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.sync.a f28476a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.a f28477b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k1.h<T> f28478c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<T> f28479d;

        /* compiled from: SingleProcessDataStore.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", f = "SingleProcessDataStore.kt", i = {0, 0, 1, 2, 2}, l = {503, 337, 339}, m = "updateData", n = {"transform", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "newData"}, s = {"L$0", "L$1", "L$0", "L$0", "L$2"})
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            Object f28480b;

            /* renamed from: c, reason: collision with root package name */
            Object f28481c;

            /* renamed from: d, reason: collision with root package name */
            Object f28482d;

            /* renamed from: e, reason: collision with root package name */
            Object f28483e;

            /* renamed from: f, reason: collision with root package name */
            Object f28484f;

            /* renamed from: g, reason: collision with root package name */
            /* synthetic */ Object f28485g;

            /* renamed from: i, reason: collision with root package name */
            int f28487i;

            a(kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f28485g = obj;
                this.f28487i |= Integer.MIN_VALUE;
                return k.this.a(null, this);
            }
        }

        k(kotlinx.coroutines.sync.a aVar, k1.a aVar2, k1.h<T> hVar, l<T> lVar) {
            this.f28476a = aVar;
            this.f28477b = aVar2;
            this.f28478c = hVar;
            this.f28479d = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00b8 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00b0, B:30:0x00b8), top: B:26:0x0050 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0098 A[Catch: all -> 0x00d5, TRY_LEAVE, TryCatch #1 {all -> 0x00d5, blocks: (B:40:0x0094, B:42:0x0098, B:46:0x00d8, B:47:0x00df), top: B:39:0x0094 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00d8 A[Catch: all -> 0x00d5, TRY_ENTER, TryCatch #1 {all -> 0x00d5, blocks: (B:40:0x0094, B:42:0x0098, B:46:0x00d8, B:47:0x00df), top: B:39:0x0094 }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // androidx.content.core.h
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super T>, ? extends java.lang.Object> r11, @fg.l kotlin.coroutines.d<? super T> r12) {
            /*
                Method dump skipped, instructions count: 228
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.l.k.a(ld.p, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0}, l = {302}, m = "readAndInitOrPropagateAndThrowFailure", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: androidx.datastore.core.l$l, reason: collision with other inner class name */
    static final class C0465l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f28488b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f28489c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<T> f28490d;

        /* renamed from: e, reason: collision with root package name */
        int f28491e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0465l(l<T> lVar, kotlin.coroutines.d<? super C0465l> dVar) {
            super(dVar);
            this.f28490d = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f28489c = obj;
            this.f28491e |= Integer.MIN_VALUE;
            return this.f28490d.w(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0}, l = {311}, m = "readAndInitOrPropagateFailure", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f28492b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f28493c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<T> f28494d;

        /* renamed from: e, reason: collision with root package name */
        int f28495e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(l<T> lVar, kotlin.coroutines.d<? super m> dVar) {
            super(dVar);
            this.f28494d = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f28493c = obj;
            this.f28495e |= Integer.MIN_VALUE;
            return this.f28494d.x(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0}, l = {381}, m = "readData", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f28496b;

        /* renamed from: c, reason: collision with root package name */
        Object f28497c;

        /* renamed from: d, reason: collision with root package name */
        Object f28498d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f28499e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ l<T> f28500f;

        /* renamed from: g, reason: collision with root package name */
        int f28501g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(l<T> lVar, kotlin.coroutines.d<? super n> dVar) {
            super(dVar);
            this.f28500f = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f28499e = obj;
            this.f28501g |= Integer.MIN_VALUE;
            return this.f28500f.y(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 1, 2, 2}, l = {359, 362, 365}, m = "readDataOrHandleCorruption", n = {"this", "ex", "ex", "newData"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f28502b;

        /* renamed from: c, reason: collision with root package name */
        Object f28503c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f28504d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ l<T> f28505e;

        /* renamed from: f, reason: collision with root package name */
        int f28506f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(l<T> lVar, kotlin.coroutines.d<? super o> dVar) {
            super(dVar);
            this.f28505e = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f28504d = obj;
            this.f28506f |= Integer.MIN_VALUE;
            return this.f28505e.z(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 0, 0}, l = {402, HttpStatus.SC_GONE}, m = "transformAndWrite", n = {"this", "curDataAndHash", "curData"}, s = {"L$0", "L$1", "L$2"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class p extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f28507b;

        /* renamed from: c, reason: collision with root package name */
        Object f28508c;

        /* renamed from: d, reason: collision with root package name */
        Object f28509d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f28510e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ l<T> f28511f;

        /* renamed from: g, reason: collision with root package name */
        int f28512g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(l<T> lVar, kotlin.coroutines.d<? super p> dVar) {
            super(dVar);
            this.f28511f = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f28510e = obj;
            this.f28512g |= Integer.MIN_VALUE;
            return this.f28511f.A(null, null, this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f = "SingleProcessDataStore.kt", i = {}, l = {402}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    static final class q extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super T>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f28513b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<T, kotlin.coroutines.d<? super T>, Object> f28514c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f28515d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(ld.p<? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, T t4, kotlin.coroutines.d<? super q> dVar) {
            super(2, dVar);
            this.f28514c = pVar;
            this.f28515d = t4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new q(this.f28514c, this.f28515d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f28513b;
            if (i4 == 0) {
                a1.n(obj);
                ld.p<T, kotlin.coroutines.d<? super T>, Object> pVar = this.f28514c;
                T t4 = this.f28515d;
                this.f28513b = 1;
                obj = pVar.invoke(t4, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return obj;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super T> dVar) {
            return ((q) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 0, 0}, l = {426}, m = "writeData$datastore_core", n = {"this", "scratchFile", "stream"}, s = {"L$0", "L$1", "L$4"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class r extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f28516b;

        /* renamed from: c, reason: collision with root package name */
        Object f28517c;

        /* renamed from: d, reason: collision with root package name */
        Object f28518d;

        /* renamed from: e, reason: collision with root package name */
        Object f28519e;

        /* renamed from: f, reason: collision with root package name */
        Object f28520f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f28521g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ l<T> f28522h;

        /* renamed from: i, reason: collision with root package name */
        int f28523i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(l<T> lVar, kotlin.coroutines.d<? super r> dVar) {
            super(dVar);
            this.f28522h = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f28521g = obj;
            this.f28523i |= Integer.MIN_VALUE;
            return this.f28522h.B(null, this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l(ld.a r7, androidx.content.core.j r8, java.util.List r9, androidx.content.core.a r10, kotlinx.coroutines.r0 r11, int r12, kotlin.jvm.internal.w r13) {
        /*
            r6 = this;
            r13 = r12 & 4
            if (r13 == 0) goto L6
            kotlin.collections.j0 r9 = kotlin.collections.j0.f74919b
        L6:
            r3 = r9
            r9 = r12 & 8
            if (r9 == 0) goto L10
            o1.a r10 = new o1.a
            r10.<init>()
        L10:
            r4 = r10
            r9 = r12 & 16
            if (r9 == 0) goto L29
            kotlinx.coroutines.j1 r9 = kotlinx.coroutines.j1.f80845a
            kotlinx.coroutines.m0 r9 = kotlinx.coroutines.j1.c()
            r10 = 1
            r11 = 0
            kotlinx.coroutines.b0 r10 = kotlinx.coroutines.k3.c(r11, r10, r11)
            kotlin.coroutines.g r9 = r9.O(r10)
            kotlinx.coroutines.r0 r11 = kotlinx.coroutines.s0.a(r9)
        L29:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.core.l.<init>(ld.a, androidx.datastore.core.j, java.util.List, androidx.datastore.core.a, kotlinx.coroutines.r0, int, kotlin.jvm.internal.w):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(ld.p<? super T, ? super kotlin.coroutines.d<? super T>, ? extends java.lang.Object> r8, kotlin.coroutines.g r9, kotlin.coroutines.d<? super T> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.datastore.core.l.p
            if (r0 == 0) goto L13
            r0 = r10
            androidx.datastore.core.l$p r0 = (androidx.datastore.core.l.p) r0
            int r1 = r0.f28512g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28512g = r1
            goto L18
        L13:
            androidx.datastore.core.l$p r0 = new androidx.datastore.core.l$p
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f28510e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f28512g
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r8 = r0.f28508c
            java.lang.Object r9 = r0.f28507b
            androidx.datastore.core.l r9 = (androidx.content.core.l) r9
            kotlin.a1.n(r10)
            goto L8c
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.Object r8 = r0.f28509d
            java.lang.Object r9 = r0.f28508c
            androidx.datastore.core.b r9 = (androidx.content.core.b) r9
            java.lang.Object r2 = r0.f28507b
            androidx.datastore.core.l r2 = (androidx.content.core.l) r2
            kotlin.a1.n(r10)
            goto L71
        L47:
            kotlin.a1.n(r10)
            kotlinx.coroutines.flow.e0<androidx.datastore.core.m<T>> r10 = r7.downstreamFlow
            java.lang.Object r10 = r10.getValue()
            androidx.datastore.core.b r10 = (androidx.content.core.b) r10
            r10.a()
            java.lang.Object r2 = r10.c()
            androidx.datastore.core.l$q r6 = new androidx.datastore.core.l$q
            r6.<init>(r8, r2, r3)
            r0.f28507b = r7
            r0.f28508c = r10
            r0.f28509d = r2
            r0.f28512g = r5
            java.lang.Object r8 = kotlinx.coroutines.i.h(r9, r6, r0)
            if (r8 != r1) goto L6d
            return r1
        L6d:
            r9 = r10
            r10 = r8
            r8 = r2
            r2 = r7
        L71:
            r9.a()
            boolean r9 = kotlin.jvm.internal.l0.g(r8, r10)
            if (r9 == 0) goto L7b
            goto L9e
        L7b:
            r0.f28507b = r2
            r0.f28508c = r10
            r0.f28509d = r3
            r0.f28512g = r4
            java.lang.Object r8 = r2.B(r10, r0)
            if (r8 != r1) goto L8a
            return r1
        L8a:
            r8 = r10
            r9 = r2
        L8c:
            kotlinx.coroutines.flow.e0<androidx.datastore.core.m<T>> r9 = r9.downstreamFlow
            androidx.datastore.core.b r10 = new androidx.datastore.core.b
            if (r8 == 0) goto L97
            int r0 = r8.hashCode()
            goto L98
        L97:
            r0 = 0
        L98:
            r10.<init>(r8, r0)
            r9.setValue(r10)
        L9e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.core.l.A(ld.p, kotlin.coroutines.g, kotlin.coroutines.d):java.lang.Object");
    }

    private final void q(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(l0.C("Unable to create parent directories of ", file));
        }
    }

    private static /* synthetic */ void r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File s() {
        return (File) this.file.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(b.a<T> aVar, kotlin.coroutines.d<? super k2> dVar) {
        androidx.content.core.m<T> value = this.downstreamFlow.getValue();
        if (!(value instanceof androidx.content.core.b)) {
            if (value instanceof androidx.content.core.i) {
                if (value == aVar.a()) {
                    Object x4 = x(dVar);
                    return x4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? x4 : k2.f75408a;
                }
            } else {
                if (l0.g(value, androidx.content.core.n.f28524a)) {
                    Object x5 = x(dVar);
                    return x5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? x5 : k2.f75408a;
                }
                if (value instanceof androidx.content.core.g) {
                    throw new IllegalStateException("Can't read in final state.");
                }
            }
        }
        return k2.f75408a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(5:(1:(1:(1:12)(2:19|20))(3:21|22|23))(1:28)|13|14|15|16)(4:29|30|31|(6:33|(1:35)|26|14|15|16)(3:36|(1:38)(1:54)|(2:40|(2:42|(1:44)(1:45))(2:46|47))(2:48|(2:50|51)(2:52|53))))|24|(1:27)|26|14|15|16))|59|6|7|(0)(0)|24|(0)|26|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0032, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.datastore.core.l, androidx.datastore.core.l<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20, types: [kotlinx.coroutines.y] */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlinx.coroutines.y] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(androidx.datastore.core.l.b.C0463b<T> r9, kotlin.coroutines.d<? super kotlin.k2> r10) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.core.l.u(androidx.datastore.core.l$b$b, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(kotlin.coroutines.d<? super kotlin.k2> r14) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.core.l.v(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(kotlin.coroutines.d<? super kotlin.k2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.content.core.l.C0465l
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.l$l r0 = (androidx.content.core.l.C0465l) r0
            int r1 = r0.f28491e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28491e = r1
            goto L18
        L13:
            androidx.datastore.core.l$l r0 = new androidx.datastore.core.l$l
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f28489c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f28491e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f28488b
            androidx.datastore.core.l r0 = (androidx.content.core.l) r0
            kotlin.a1.n(r5)     // Catch: java.lang.Throwable -> L2b
            goto L43
        L2b:
            r5 = move-exception
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.a1.n(r5)
            r0.f28488b = r4     // Catch: java.lang.Throwable -> L46
            r0.f28491e = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = r4.v(r0)     // Catch: java.lang.Throwable -> L46
            if (r5 != r1) goto L43
            return r1
        L43:
            kotlin.k2 r5 = kotlin.k2.f75408a
            return r5
        L46:
            r5 = move-exception
            r0 = r4
        L48:
            kotlinx.coroutines.flow.e0<androidx.datastore.core.m<T>> r0 = r0.downstreamFlow
            androidx.datastore.core.i r1 = new androidx.datastore.core.i
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.core.l.w(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(kotlin.coroutines.d<? super kotlin.k2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.l.m
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.l$m r0 = (androidx.datastore.core.l.m) r0
            int r1 = r0.f28495e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28495e = r1
            goto L18
        L13:
            androidx.datastore.core.l$m r0 = new androidx.datastore.core.l$m
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f28493c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f28495e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f28492b
            androidx.datastore.core.l r0 = (androidx.content.core.l) r0
            kotlin.a1.n(r5)     // Catch: java.lang.Throwable -> L2b
            goto L4f
        L2b:
            r5 = move-exception
            goto L45
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.a1.n(r5)
            r0.f28492b = r4     // Catch: java.lang.Throwable -> L43
            r0.f28495e = r3     // Catch: java.lang.Throwable -> L43
            java.lang.Object r5 = r4.v(r0)     // Catch: java.lang.Throwable -> L43
            if (r5 != r1) goto L4f
            return r1
        L43:
            r5 = move-exception
            r0 = r4
        L45:
            kotlinx.coroutines.flow.e0<androidx.datastore.core.m<T>> r0 = r0.downstreamFlow
            androidx.datastore.core.i r1 = new androidx.datastore.core.i
            r1.<init>(r5)
            r0.setValue(r1)
        L4f:
            kotlin.k2 r5 = kotlin.k2.f75408a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.core.l.x(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.datastore.core.l] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.l$n, kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.l] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream, java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.datastore.core.j, androidx.datastore.core.j<T>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(kotlin.coroutines.d<? super T> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.l.n
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.l$n r0 = (androidx.datastore.core.l.n) r0
            int r1 = r0.f28501g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28501g = r1
            goto L18
        L13:
            androidx.datastore.core.l$n r0 = new androidx.datastore.core.l$n
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f28499e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f28501g
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r1 = r0.f28498d
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f28497c
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.f28496b
            androidx.datastore.core.l r0 = (androidx.content.core.l) r0
            kotlin.a1.n(r6)     // Catch: java.lang.Throwable -> L33
            goto L5d
        L33:
            r6 = move-exception
            goto L65
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3d:
            kotlin.a1.n(r6)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L6b
            java.io.File r6 = r5.s()     // Catch: java.io.FileNotFoundException -> L6b
            r2.<init>(r6)     // Catch: java.io.FileNotFoundException -> L6b
            androidx.datastore.core.j<T> r6 = r5.serializer     // Catch: java.lang.Throwable -> L63
            r0.f28496b = r5     // Catch: java.lang.Throwable -> L63
            r0.f28497c = r2     // Catch: java.lang.Throwable -> L63
            r4 = 0
            r0.f28498d = r4     // Catch: java.lang.Throwable -> L63
            r0.f28501g = r3     // Catch: java.lang.Throwable -> L63
            java.lang.Object r6 = r6.C(r2, r0)     // Catch: java.lang.Throwable -> L63
            if (r6 != r1) goto L5b
            return r1
        L5b:
            r0 = r5
            r1 = r4
        L5d:
            kotlin.io.b.a(r2, r1)     // Catch: java.io.FileNotFoundException -> L61
            return r6
        L61:
            r6 = move-exception
            goto L6d
        L63:
            r6 = move-exception
            r0 = r5
        L65:
            throw r6     // Catch: java.lang.Throwable -> L66
        L66:
            r1 = move-exception
            kotlin.io.b.a(r2, r6)     // Catch: java.io.FileNotFoundException -> L61
            throw r1     // Catch: java.io.FileNotFoundException -> L61
        L6b:
            r6 = move-exception
            r0 = r5
        L6d:
            java.io.File r1 = r0.s()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L7e
            androidx.datastore.core.j<T> r6 = r0.serializer
            java.lang.Object r6 = r6.A()
            return r6
        L7e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.core.l.y(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(kotlin.coroutines.d<? super T> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.datastore.core.l.o
            if (r0 == 0) goto L13
            r0 = r8
            androidx.datastore.core.l$o r0 = (androidx.datastore.core.l.o) r0
            int r1 = r0.f28506f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28506f = r1
            goto L18
        L13:
            androidx.datastore.core.l$o r0 = new androidx.datastore.core.l$o
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f28504d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f28506f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r1 = r0.f28503c
            java.lang.Object r0 = r0.f28502b
            androidx.datastore.core.CorruptionException r0 = (androidx.content.core.CorruptionException) r0
            kotlin.a1.n(r8)     // Catch: java.io.IOException -> L33
            goto L85
        L33:
            r8 = move-exception
            goto L88
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3d:
            java.lang.Object r2 = r0.f28503c
            androidx.datastore.core.CorruptionException r2 = (androidx.content.core.CorruptionException) r2
            java.lang.Object r4 = r0.f28502b
            androidx.datastore.core.l r4 = (androidx.content.core.l) r4
            kotlin.a1.n(r8)
            goto L77
        L49:
            java.lang.Object r2 = r0.f28502b
            androidx.datastore.core.l r2 = (androidx.content.core.l) r2
            kotlin.a1.n(r8)     // Catch: androidx.content.core.CorruptionException -> L51
            goto L61
        L51:
            r8 = move-exception
            goto L64
        L53:
            kotlin.a1.n(r8)
            r0.f28502b = r7     // Catch: androidx.content.core.CorruptionException -> L62
            r0.f28506f = r5     // Catch: androidx.content.core.CorruptionException -> L62
            java.lang.Object r8 = r7.y(r0)     // Catch: androidx.content.core.CorruptionException -> L62
            if (r8 != r1) goto L61
            return r1
        L61:
            return r8
        L62:
            r8 = move-exception
            r2 = r7
        L64:
            androidx.datastore.core.a<T> r5 = r2.corruptionHandler
            r0.f28502b = r2
            r0.f28503c = r8
            r0.f28506f = r4
            java.lang.Object r4 = r5.a(r8, r0)
            if (r4 != r1) goto L73
            return r1
        L73:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L77:
            r0.f28502b = r2     // Catch: java.io.IOException -> L86
            r0.f28503c = r8     // Catch: java.io.IOException -> L86
            r0.f28506f = r3     // Catch: java.io.IOException -> L86
            java.lang.Object r0 = r4.B(r8, r0)     // Catch: java.io.IOException -> L86
            if (r0 != r1) goto L84
            return r1
        L84:
            r1 = r8
        L85:
            return r1
        L86:
            r8 = move-exception
            r0 = r2
        L88:
            kotlin.o.a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.core.l.z(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0 A[Catch: IOException -> 0x00b7, TryCatch #0 {IOException -> 0x00b7, blocks: (B:14:0x0092, B:18:0x00a0, B:19:0x00b6, B:26:0x00be, B:27:0x00c1, B:23:0x00bc), top: B:7:0x0021, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.File] */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(T r9, @fg.l kotlin.coroutines.d<? super kotlin.k2> r10) {
        /*
            r8 = this;
            java.lang.String r0 = "Unable to rename "
            boolean r1 = r10 instanceof androidx.datastore.core.l.r
            if (r1 == 0) goto L15
            r1 = r10
            androidx.datastore.core.l$r r1 = (androidx.datastore.core.l.r) r1
            int r2 = r1.f28523i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f28523i = r2
            goto L1a
        L15:
            androidx.datastore.core.l$r r1 = new androidx.datastore.core.l$r
            r1.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r1.f28521g
            kotlin.coroutines.intrinsics.a r2 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r3 = r1.f28523i
            r4 = 1
            if (r3 == 0) goto L48
            if (r3 != r4) goto L40
            java.lang.Object r9 = r1.f28520f
            java.io.FileOutputStream r9 = (java.io.FileOutputStream) r9
            java.lang.Object r2 = r1.f28519e
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r1.f28518d
            java.io.Closeable r3 = (java.io.Closeable) r3
            java.lang.Object r4 = r1.f28517c
            java.io.File r4 = (java.io.File) r4
            java.lang.Object r1 = r1.f28516b
            androidx.datastore.core.l r1 = (androidx.content.core.l) r1
            kotlin.a1.n(r10)     // Catch: java.lang.Throwable -> L3d
            goto L89
        L3d:
            r9 = move-exception
            goto Lbc
        L40:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L48:
            kotlin.a1.n(r10)
            java.io.File r10 = r8.s()
            r8.q(r10)
            java.io.File r10 = new java.io.File
            java.io.File r3 = r8.s()
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.String r5 = r8.SCRATCH_SUFFIX
            java.lang.String r3 = kotlin.jvm.internal.l0.C(r3, r5)
            r10.<init>(r3)
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lc2
            r3.<init>(r10)     // Catch: java.io.IOException -> Lc2
            androidx.datastore.core.j<T> r5 = r8.serializer     // Catch: java.lang.Throwable -> Lba
            androidx.datastore.core.l$c r6 = new androidx.datastore.core.l$c     // Catch: java.lang.Throwable -> Lba
            r6.<init>(r3)     // Catch: java.lang.Throwable -> Lba
            r1.f28516b = r8     // Catch: java.lang.Throwable -> Lba
            r1.f28517c = r10     // Catch: java.lang.Throwable -> Lba
            r1.f28518d = r3     // Catch: java.lang.Throwable -> Lba
            r7 = 0
            r1.f28519e = r7     // Catch: java.lang.Throwable -> Lba
            r1.f28520f = r3     // Catch: java.lang.Throwable -> Lba
            r1.f28523i = r4     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r9 = r5.B(r9, r6, r1)     // Catch: java.lang.Throwable -> Lba
            if (r9 != r2) goto L85
            return r2
        L85:
            r1 = r8
            r4 = r10
            r9 = r3
            r2 = r7
        L89:
            java.io.FileDescriptor r9 = r9.getFD()     // Catch: java.lang.Throwable -> L3d
            r9.sync()     // Catch: java.lang.Throwable -> L3d
            kotlin.k2 r9 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> L3d
            kotlin.io.b.a(r3, r2)     // Catch: java.io.IOException -> Lb7
            java.io.File r10 = r1.s()     // Catch: java.io.IOException -> Lb7
            boolean r10 = r4.renameTo(r10)     // Catch: java.io.IOException -> Lb7
            if (r10 == 0) goto La0
            return r9
        La0:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.io.IOException -> Lb7
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lb7
            r10.<init>(r0)     // Catch: java.io.IOException -> Lb7
            r10.append(r4)     // Catch: java.io.IOException -> Lb7
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r10.append(r0)     // Catch: java.io.IOException -> Lb7
            java.lang.String r10 = r10.toString()     // Catch: java.io.IOException -> Lb7
            r9.<init>(r10)     // Catch: java.io.IOException -> Lb7
            throw r9     // Catch: java.io.IOException -> Lb7
        Lb7:
            r9 = move-exception
            r10 = r4
            goto Lc3
        Lba:
            r9 = move-exception
            r4 = r10
        Lbc:
            throw r9     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            r10 = move-exception
            kotlin.io.b.a(r3, r9)     // Catch: java.io.IOException -> Lb7
            throw r10     // Catch: java.io.IOException -> Lb7
        Lc2:
            r9 = move-exception
        Lc3:
            boolean r0 = r10.exists()
            if (r0 == 0) goto Lcc
            r10.delete()
        Lcc:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.core.l.B(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.content.core.e
    @fg.m
    public Object a(@fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super T> dVar) {
        y c5 = a0.c(null, 1, null);
        this.actor.e(new b.C0463b(pVar, c5, this.downstreamFlow.getValue(), dVar.getF75269b()));
        return c5.z(dVar);
    }

    @Override // androidx.content.core.e
    @fg.l
    public kotlinx.coroutines.flow.i<T> b() {
        return this.data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@fg.l a<? extends File> produceFile, @fg.l androidx.content.core.j<T> serializer, @fg.l List<? extends ld.p<? super androidx.content.core.h<T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object>> initTasksList, @fg.l a<T> corruptionHandler, @fg.l r0 scope) {
        l0.p(produceFile, "produceFile");
        l0.p(serializer, "serializer");
        l0.p(initTasksList, "initTasksList");
        l0.p(corruptionHandler, "corruptionHandler");
        l0.p(scope, "scope");
        this.produceFile = produceFile;
        this.serializer = serializer;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = kotlinx.coroutines.flow.k.J0(new g(this, null));
        this.SCRATCH_SUFFIX = ".tmp";
        this.file = c0.c(new h(this));
        this.downstreamFlow = v0.a(androidx.content.core.n.f28524a);
        this.initTasks = kotlin.collections.w.V5(initTasksList);
        this.actor = new androidx.content.core.k<>(scope, new d(this), e.f28444b, new f(this, null));
    }
}

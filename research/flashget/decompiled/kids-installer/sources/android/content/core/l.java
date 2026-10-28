package android.content.core;

import androidx.annotation.b0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.collections.j0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.m2;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.c0;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.flow.v0;
import kotlinx.coroutines.u0;
import q3.a;

/* compiled from: SingleProcessDataStore.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 V*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003\u001e'+B\u0081\u0001\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001c0#\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000&\u0012?\b\u0002\u0010S\u001a9\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000I¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(J\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00120H\u0012\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000*\u0012\b\b\u0002\u00101\u001a\u00020.ø\u0001\u0000¢\u0006\u0004\bT\u0010UJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u0013\u0010\u0010\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\rJ\u0013\u0010\u0011\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\rJN\u0010\u001a\u001a\u00028\u000021\u0010\u0017\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\f\u0010\u001d\u001a\u00020\u0005*\u00020\u001cH\u0002JF\u0010\u001e\u001a\u00028\u000021\u0010\u0017\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\u00052\u0006\u0010 \u001a\u00028\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001c0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u00107\u001a\b\u0012\u0004\u0012\u00028\u0000028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082D¢\u0006\u0006\n\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R&\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000B0A8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bC\u0010D\u0012\u0004\bE\u0010FRR\u0010M\u001a;\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000I¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(J\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0012\u0018\u00010H8\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\bK\u0010LR \u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000O0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010Q\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006W"}, d2 = {"Landroidx/datastore/core/l;", "T", "Landroidx/datastore/core/e;", "Landroidx/datastore/core/l$b$a;", "read", "Lkotlin/m2;", "s", "(Landroidx/datastore/core/l$b$a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/datastore/core/l$b$b;", "update", "t", "(Landroidx/datastore/core/l$b$b;Lkotlin/coroutines/d;)Ljava/lang/Object;", "v", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "w", "u", "y", "x", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "Lkotlin/coroutines/d;", "", "transform", "Lkotlin/coroutines/g;", "callerContext", "z", "(Lq3/p;Lkotlin/coroutines/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/io/File;", "p", "a", "(Lq3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "newData", "A", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function0;", "Lq3/a;", "produceFile", "Landroidx/datastore/core/j;", "b", "Landroidx/datastore/core/j;", "serializer", "Landroidx/datastore/core/a;", "c", "Landroidx/datastore/core/a;", "corruptionHandler", "Lkotlinx/coroutines/u0;", "d", "Lkotlinx/coroutines/u0;", "scope", "Lkotlinx/coroutines/flow/i;", "e", "Lkotlinx/coroutines/flow/i;", "getData", "()Lkotlinx/coroutines/flow/i;", "data", "", "f", "Ljava/lang/String;", "SCRATCH_SUFFIX", "g", "Lkotlin/b0;", "r", "()Ljava/io/File;", "file", "Lkotlinx/coroutines/flow/e0;", "Landroidx/datastore/core/m;", "h", "Lkotlinx/coroutines/flow/e0;", "getDownstreamFlow$annotations", "()V", "downstreamFlow", "", "Landroidx/datastore/core/h;", "api", "i", "Ljava/util/List;", "initTasks", "Landroidx/datastore/core/k;", "Landroidx/datastore/core/l$b;", "j", "Landroidx/datastore/core/k;", "actor", "initTasksList", "<init>", "(Lq3/a;Landroidx/datastore/core/j;Ljava/util/List;Landroidx/datastore/core/a;Lkotlinx/coroutines/u0;)V", "k", "datastore-core"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class l<T> implements android.content.core.e<T> {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @d5.d
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: l, reason: collision with root package name */
    @b0("activeFilesLock")
    @d5.d
    private static final Set<String> f6971l = new LinkedHashSet();

    /* renamed from: m, reason: collision with root package name */
    @d5.d
    private static final Object f6972m = new Object();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final a<File> produceFile;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final android.content.core.j<T> serializer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final a<T> corruptionHandler;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final u0 scope;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final kotlinx.coroutines.flow.i<T> data;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String SCRATCH_SUFFIX;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Lazy file;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final e0<android.content.core.m<T>> downstreamFlow;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private List<? extends q3.p<? super android.content.core.h<T>, ? super Continuation<? super m2>, ? extends Object>> initTasks;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final android.content.core.k<b<T>> actor;

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/datastore/core/l$a;", "", "", "", "activeFiles", "Ljava/util/Set;", "a", "()Ljava/util/Set;", "activeFilesLock", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "<init>", "()V", "datastore-core"}, k = 1, mv = {1, 5, 1})
    /* renamed from: androidx.datastore.core.l$a, reason: from kotlin metadata */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @d5.d
        public final Set<String> a() {
            return l.f6971l;
        }

        @d5.d
        public final Object b() {
            return l.f6972m;
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\u0004\tB\t\b\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Landroidx/datastore/core/l$b;", "T", "", "Landroidx/datastore/core/m;", "a", "()Landroidx/datastore/core/m;", "lastState", "<init>", "()V", "b", "Landroidx/datastore/core/l$b$a;", "Landroidx/datastore/core/l$b$b;", "datastore-core"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes.dex */
    private static abstract class b<T> {

        /* compiled from: SingleProcessDataStore.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u0017\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/datastore/core/l$b$a;", "T", "Landroidx/datastore/core/l$b;", "Landroidx/datastore/core/m;", "a", "Landroidx/datastore/core/m;", "()Landroidx/datastore/core/m;", "lastState", "<init>", "(Landroidx/datastore/core/m;)V", "datastore-core"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes3.dex */
        public static final class a<T> extends b<T> {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @d5.e
            private final android.content.core.m<T> lastState;

            public a(@d5.e android.content.core.m<T> mVar) {
                super(null);
                this.lastState = mVar;
            }

            @Override // androidx.datastore.core.l.b
            @d5.e
            public android.content.core.m<T> a() {
                return this.lastState;
            }
        }

        /* compiled from: SingleProcessDataStore.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002Bc\u00121\u0010\r\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00020\u000e\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0013\u0012\u0006\u0010\u001b\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dRE\u0010\r\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00038\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\t\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroidx/datastore/core/l$b$b;", "T", "Landroidx/datastore/core/l$b;", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "t", "Lkotlin/coroutines/d;", "", "a", "Lq3/p;", "d", "()Lq3/p;", "transform", "Lkotlinx/coroutines/a0;", "b", "Lkotlinx/coroutines/a0;", "()Lkotlinx/coroutines/a0;", "ack", "Landroidx/datastore/core/m;", "c", "Landroidx/datastore/core/m;", "()Landroidx/datastore/core/m;", "lastState", "Lkotlin/coroutines/g;", "Lkotlin/coroutines/g;", "()Lkotlin/coroutines/g;", "callerContext", "<init>", "(Lq3/p;Lkotlinx/coroutines/a0;Landroidx/datastore/core/m;Lkotlin/coroutines/g;)V", "datastore-core"}, k = 1, mv = {1, 5, 1})
        /* renamed from: androidx.datastore.core.l$b$b, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0074b<T> extends b<T> {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @d5.d
            private final q3.p<T, Continuation<? super T>, Object> transform;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @d5.d
            private final a0<T> ack;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @d5.e
            private final android.content.core.m<T> lastState;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @d5.d
            private final CoroutineContext callerContext;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0074b(@d5.d q3.p<? super T, ? super Continuation<? super T>, ? extends Object> transform, @d5.d a0<T> ack, @d5.e android.content.core.m<T> mVar, @d5.d CoroutineContext callerContext) {
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
            @d5.e
            public android.content.core.m<T> a() {
                return this.lastState;
            }

            @d5.d
            public final a0<T> b() {
                return this.ack;
            }

            @d5.d
            /* renamed from: c, reason: from getter */
            public final CoroutineContext getCallerContext() {
                return this.callerContext;
            }

            @d5.d
            public final q3.p<T, Continuation<? super T>, Object> d() {
                return this.transform;
            }
        }

        public /* synthetic */ b(w wVar) {
            this();
        }

        @d5.e
        public abstract android.content.core.m<T> a();

        private b() {
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0016J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/datastore/core/l$c;", "Ljava/io/OutputStream;", "", "b", "Lkotlin/m2;", "write", "", "bytes", "off", "len", "close", "flush", "Ljava/io/FileOutputStream;", "o", "Ljava/io/FileOutputStream;", "a", "()Ljava/io/FileOutputStream;", "fileOutputStream", "<init>", "(Ljava/io/FileOutputStream;)V", "datastore-core"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes.dex */
    private static final class c extends OutputStream {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final FileOutputStream fileOutputStream;

        public c(@d5.d FileOutputStream fileOutputStream) {
            l0.p(fileOutputStream, "fileOutputStream");
            this.fileOutputStream = fileOutputStream;
        }

        @d5.d
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
        public void write(int i5) {
            this.fileOutputStream.write(i5);
        }

        @Override // java.io.OutputStream
        public void write(@d5.d byte[] b6) {
            l0.p(b6, "b");
            this.fileOutputStream.write(b6);
        }

        @Override // java.io.OutputStream
        public void write(@d5.d byte[] bytes, int i5, int i6) {
            l0.p(bytes, "bytes");
            this.fileOutputStream.write(bytes, i5, i6);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"T", "", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    static final class d extends Lambda implements q3.l<Throwable, m2> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ l<T> f6989p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(l<T> lVar) {
            super(1);
            this.f6989p = lVar;
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Throwable th) {
            a(th);
            return m2.f23662a;
        }

        public final void a(@d5.e Throwable th) {
            if (th != null) {
                ((l) this.f6989p).downstreamFlow.setValue(new android.content.core.g(th));
            }
            Companion companion = l.INSTANCE;
            companion.getClass();
            Object obj = l.f6972m;
            l<T> lVar = this.f6989p;
            synchronized (obj) {
                companion.getClass();
                l.f6971l.remove(lVar.r().getAbsolutePath());
                m2 m2Var = m2.f23662a;
            }
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"T", "Landroidx/datastore/core/l$b;", "msg", "", "ex", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    static final class e extends Lambda implements q3.p<b<T>, Throwable, m2> {

        /* renamed from: p, reason: collision with root package name */
        public static final e f6990p = new e();

        e() {
            super(2);
        }

        public final void a(@d5.d b<T> msg, @d5.e Throwable th) {
            l0.p(msg, "msg");
            if (msg instanceof b.C0074b) {
                a0<T> b6 = ((b.C0074b) msg).b();
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                b6.k(th);
            }
        }

        @Override // q3.p
        public /* bridge */ /* synthetic */ m2 g0(Object obj, Throwable th) {
            a((b) obj, th);
            return m2.f23662a;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", i = {}, l = {239, 242}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Landroidx/datastore/core/l$b;", "msg", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes4.dex */
    static final class f extends SuspendLambda implements q3.p<b<T>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f6991s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f6992t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ l<T> f6993u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(l<T> lVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f6993u = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f6991s;
            if (i5 == 0) {
                a1.n(obj);
                b bVar = (b) this.f6992t;
                if (bVar instanceof b.a) {
                    this.f6991s = 1;
                    if (this.f6993u.s((b.a) bVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (bVar instanceof b.C0074b) {
                    this.f6991s = 2;
                    if (this.f6993u.t((b.C0074b) bVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i5 != 1 && i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d b<T> bVar, @d5.e Continuation<? super m2> continuation) {
            return ((f) c(bVar, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            f fVar = new f(this.f6993u, continuation);
            fVar.f6992t = obj;
            return fVar;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes4.dex */
    static final class g extends SuspendLambda implements q3.p<kotlinx.coroutines.flow.j<? super T>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f6994s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f6995t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ l<T> f6996u;

        /* compiled from: SingleProcessDataStore.kt */
        @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Landroidx/datastore/core/m;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        static final class a extends SuspendLambda implements q3.p<android.content.core.m<T>, Continuation<? super Boolean>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f6997s;

            /* renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f6998t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ android.content.core.m<T> f6999u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(android.content.core.m<T> mVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f6999u = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.f6997s != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
                android.content.core.m<T> mVar = (android.content.core.m) this.f6998t;
                android.content.core.m<T> mVar2 = this.f6999u;
                boolean z5 = false;
                if (!(mVar2 instanceof android.content.core.b) && !(mVar2 instanceof android.content.core.g) && mVar == mVar2) {
                    z5 = true;
                }
                return Boolean.valueOf(z5);
            }

            @Override // q3.p
            @d5.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object g0(@d5.d android.content.core.m<T> mVar, @d5.e Continuation<? super Boolean> continuation) {
                return ((a) c(mVar, continuation)).A(m2.f23662a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.d
            public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
                a aVar = new a(this.f6999u, continuation);
                aVar.f6998t = obj;
                return aVar;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/a0$e"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes3.dex */
        public static final class b implements kotlinx.coroutines.flow.i<T> {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i f7000o;

            /* compiled from: Collect.kt */
            @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/a0$e$b"}, k = 1, mv = {1, 5, 1})
            public static final class a implements kotlinx.coroutines.flow.j<android.content.core.m<T>> {

                /* renamed from: o, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.j f7001o;

                @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f = "SingleProcessDataStore.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
                /* renamed from: androidx.datastore.core.l$g$b$a$a, reason: collision with other inner class name */
                public static final class C0075a extends ContinuationImpl {

                    /* renamed from: r, reason: collision with root package name */
                    /* synthetic */ Object f7002r;

                    /* renamed from: s, reason: collision with root package name */
                    int f7003s;

                    /* renamed from: t, reason: collision with root package name */
                    Object f7004t;

                    public C0075a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @d5.e
                    public final Object A(@d5.d Object obj) {
                        this.f7002r = obj;
                        this.f7003s |= Integer.MIN_VALUE;
                        return a.this.b(null, this);
                    }
                }

                public a(kotlinx.coroutines.flow.j jVar) {
                    this.f7001o = jVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // kotlinx.coroutines.flow.j
                @d5.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object b(java.lang.Object r5, @d5.d kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.datastore.core.l.g.b.a.C0075a
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.datastore.core.l$g$b$a$a r0 = (androidx.datastore.core.l.g.b.a.C0075a) r0
                        int r1 = r0.f7003s
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f7003s = r1
                        goto L18
                    L13:
                        androidx.datastore.core.l$g$b$a$a r0 = new androidx.datastore.core.l$g$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f7002r
                        kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r2 = r0.f7003s
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
                        kotlinx.coroutines.flow.j r6 = r4.f7001o
                        androidx.datastore.core.m r5 = (android.content.core.m) r5
                        boolean r2 = r5 instanceof android.content.core.i
                        if (r2 != 0) goto L71
                        boolean r2 = r5 instanceof android.content.core.g
                        if (r2 != 0) goto L6a
                        boolean r2 = r5 instanceof android.content.core.b
                        if (r2 == 0) goto L54
                        androidx.datastore.core.b r5 = (android.content.core.b) r5
                        java.lang.Object r5 = r5.c()
                        r0.f7003s = r3
                        java.lang.Object r5 = r6.b(r5, r0)
                        if (r5 != r1) goto L51
                        return r1
                    L51:
                        kotlin.m2 r5 = kotlin.m2.f23662a
                        return r5
                    L54:
                        boolean r5 = r5 instanceof android.content.core.n
                        if (r5 == 0) goto L64
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        java.lang.String r6 = r6.toString()
                        r5.<init>(r6)
                        throw r5
                    L64:
                        kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                        r5.<init>()
                        throw r5
                    L6a:
                        androidx.datastore.core.g r5 = (android.content.core.g) r5
                        java.lang.Throwable r5 = r5.getFinalException()
                        throw r5
                    L71:
                        androidx.datastore.core.i r5 = (android.content.core.i) r5
                        java.lang.Throwable r5 = r5.getReadException()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.l.g.b.a.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            public b(kotlinx.coroutines.flow.i iVar) {
                this.f7000o = iVar;
            }

            @Override // kotlinx.coroutines.flow.i
            @d5.e
            public Object a(@d5.d kotlinx.coroutines.flow.j jVar, @d5.d Continuation continuation) {
                Object a6 = this.f7000o.a(new a(jVar), continuation);
                return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(l<T> lVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f6996u = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f6994s;
            if (i5 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f6995t;
                android.content.core.m mVar = (android.content.core.m) ((l) this.f6996u).downstreamFlow.getValue();
                if (!(mVar instanceof android.content.core.b)) {
                    ((l) this.f6996u).actor.e(new b.a(mVar));
                }
                b bVar = new b(new v.e(((l) this.f6996u).downstreamFlow, new a(mVar, null)));
                this.f6994s = 1;
                if (kotlinx.coroutines.flow.k.m0(jVar, bVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d kotlinx.coroutines.flow.j<? super T> jVar, @d5.e Continuation<? super m2> continuation) {
            return ((g) c(jVar, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            g gVar = new g(this.f6996u, continuation);
            gVar.f6995t = obj;
            return gVar;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {"T", "Ljava/io/File;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    static final class h extends Lambda implements a<File> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ l<T> f7006p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(l<T> lVar) {
            super(0);
            this.f7006p = lVar;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File n() {
            File file = (File) ((l) this.f7006p).produceFile.n();
            String it = file.getAbsolutePath();
            Companion companion = l.INSTANCE;
            companion.getClass();
            synchronized (l.f6972m) {
                companion.getClass();
                if (!(!l.f6971l.contains(it))) {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
                companion.getClass();
                Set set = l.f6971l;
                l0.o(it, "it");
                set.add(it);
            }
            return file;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {1, 1}, l = {276, 281, 284}, m = "handleUpdate", n = {"update", "$this$handleUpdate_u24lambda_u2d0"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class i extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f7007r;

        /* renamed from: s, reason: collision with root package name */
        Object f7008s;

        /* renamed from: t, reason: collision with root package name */
        Object f7009t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f7010u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ l<T> f7011v;

        /* renamed from: w, reason: collision with root package name */
        int f7012w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(l<T> lVar, Continuation<? super i> continuation) {
            super(continuation);
            this.f7011v = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f7010u = obj;
            this.f7012w |= Integer.MIN_VALUE;
            return this.f7011v.t(null, this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 0, 1, 1, 1, 2}, l = {322, 348, 505}, m = "readAndInit", n = {"updateLock", "initData", "updateLock", "initData", "initializationComplete", "$this$withLock_u24default$iv"}, s = {"L$1", "L$2", "L$1", "L$2", "L$3", "L$3"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class j extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f7013r;

        /* renamed from: s, reason: collision with root package name */
        Object f7014s;

        /* renamed from: t, reason: collision with root package name */
        Object f7015t;

        /* renamed from: u, reason: collision with root package name */
        Object f7016u;

        /* renamed from: v, reason: collision with root package name */
        Object f7017v;

        /* renamed from: w, reason: collision with root package name */
        Object f7018w;

        /* renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f7019x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ l<T> f7020y;

        /* renamed from: z, reason: collision with root package name */
        int f7021z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(l<T> lVar, Continuation<? super j> continuation) {
            super(continuation);
            this.f7020y = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f7019x = obj;
            this.f7021z |= Integer.MIN_VALUE;
            return this.f7020y.u(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001JF\u0010\t\u001a\u00028\u000021\u0010\b\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"androidx/datastore/core/l$k", "Landroidx/datastore/core/h;", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "t", "Lkotlin/coroutines/d;", "", "transform", "a", "(Lq3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "datastore-core"}, k = 1, mv = {1, 5, 1})
    public static final class k implements android.content.core.h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.sync.c f7022a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.a f7023b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k1.h<T> f7024c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<T> f7025d;

        /* compiled from: SingleProcessDataStore.kt */
        @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", f = "SingleProcessDataStore.kt", i = {0, 0, 1, 2, 2}, l = {503, 337, 339}, m = "updateData", n = {"transform", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "newData"}, s = {"L$0", "L$1", "L$0", "L$0", "L$2"})
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            Object f7026r;

            /* renamed from: s, reason: collision with root package name */
            Object f7027s;

            /* renamed from: t, reason: collision with root package name */
            Object f7028t;

            /* renamed from: u, reason: collision with root package name */
            Object f7029u;

            /* renamed from: v, reason: collision with root package name */
            Object f7030v;

            /* renamed from: w, reason: collision with root package name */
            /* synthetic */ Object f7031w;

            /* renamed from: y, reason: collision with root package name */
            int f7033y;

            a(Continuation<? super a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f7031w = obj;
                this.f7033y |= Integer.MIN_VALUE;
                return k.this.a(null, this);
            }
        }

        k(kotlinx.coroutines.sync.c cVar, k1.a aVar, k1.h<T> hVar, l<T> lVar) {
            this.f7022a = cVar;
            this.f7023b = aVar;
            this.f7024c = hVar;
            this.f7025d = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00b8 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00b0, B:30:0x00b8), top: B:26:0x0050 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0098 A[Catch: all -> 0x00dd, TRY_LEAVE, TryCatch #2 {all -> 0x00dd, blocks: (B:40:0x0094, B:42:0x0098, B:46:0x00d5, B:47:0x00dc), top: B:39:0x0094 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00d5 A[Catch: all -> 0x00dd, TRY_ENTER, TryCatch #2 {all -> 0x00dd, blocks: (B:40:0x0094, B:42:0x0098, B:46:0x00d5, B:47:0x00dc), top: B:39:0x0094 }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // android.content.core.h
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@d5.d q3.p<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r11, @d5.d kotlin.coroutines.Continuation<? super T> r12) {
            /*
                Method dump skipped, instructions count: 227
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.l.k.a(q3.p, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0}, l = {302}, m = "readAndInitOrPropagateAndThrowFailure", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: androidx.datastore.core.l$l, reason: collision with other inner class name */
    static final class C0076l extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f7034r;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f7035s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ l<T> f7036t;

        /* renamed from: u, reason: collision with root package name */
        int f7037u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0076l(l<T> lVar, Continuation<? super C0076l> continuation) {
            super(continuation);
            this.f7036t = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f7035s = obj;
            this.f7037u |= Integer.MIN_VALUE;
            return this.f7036t.v(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0}, l = {311}, m = "readAndInitOrPropagateFailure", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class m extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f7038r;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f7039s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ l<T> f7040t;

        /* renamed from: u, reason: collision with root package name */
        int f7041u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(l<T> lVar, Continuation<? super m> continuation) {
            super(continuation);
            this.f7040t = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f7039s = obj;
            this.f7041u |= Integer.MIN_VALUE;
            return this.f7040t.w(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0}, l = {381}, m = "readData", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class n extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f7042r;

        /* renamed from: s, reason: collision with root package name */
        Object f7043s;

        /* renamed from: t, reason: collision with root package name */
        Object f7044t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f7045u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ l<T> f7046v;

        /* renamed from: w, reason: collision with root package name */
        int f7047w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(l<T> lVar, Continuation<? super n> continuation) {
            super(continuation);
            this.f7046v = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f7045u = obj;
            this.f7047w |= Integer.MIN_VALUE;
            return this.f7046v.x(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 1, 2, 2}, l = {359, 362, 365}, m = "readDataOrHandleCorruption", n = {"this", "ex", "ex", "newData"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class o extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f7048r;

        /* renamed from: s, reason: collision with root package name */
        Object f7049s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f7050t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ l<T> f7051u;

        /* renamed from: v, reason: collision with root package name */
        int f7052v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(l<T> lVar, Continuation<? super o> continuation) {
            super(continuation);
            this.f7051u = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f7050t = obj;
            this.f7052v |= Integer.MIN_VALUE;
            return this.f7051u.y(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 0, 0}, l = {402, 410}, m = "transformAndWrite", n = {"this", "curDataAndHash", "curData"}, s = {"L$0", "L$1", "L$2"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class p extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f7053r;

        /* renamed from: s, reason: collision with root package name */
        Object f7054s;

        /* renamed from: t, reason: collision with root package name */
        Object f7055t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f7056u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ l<T> f7057v;

        /* renamed from: w, reason: collision with root package name */
        int f7058w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(l<T> lVar, Continuation<? super p> continuation) {
            super(continuation);
            this.f7057v = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f7056u = obj;
            this.f7058w |= Integer.MIN_VALUE;
            return this.f7057v.z(null, null, this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f = "SingleProcessDataStore.kt", i = {}, l = {402}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/u0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes4.dex */
    static final class q extends SuspendLambda implements q3.p<u0, Continuation<? super T>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f7059s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ q3.p<T, Continuation<? super T>, Object> f7060t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ T f7061u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(q3.p<? super T, ? super Continuation<? super T>, ? extends Object> pVar, T t5, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f7060t = pVar;
            this.f7061u = t5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f7059s;
            if (i5 == 0) {
                a1.n(obj);
                q3.p<T, Continuation<? super T>, Object> pVar = this.f7060t;
                T t5 = this.f7061u;
                this.f7059s = 1;
                obj = pVar.g0(t5, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return obj;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d u0 u0Var, @d5.e Continuation<? super T> continuation) {
            return ((q) c(u0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            return new q(this.f7060t, this.f7061u, continuation);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 0, 0}, l = {426}, m = "writeData$datastore_core", n = {"this", "scratchFile", "stream"}, s = {"L$0", "L$1", "L$4"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class r extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f7062r;

        /* renamed from: s, reason: collision with root package name */
        Object f7063s;

        /* renamed from: t, reason: collision with root package name */
        Object f7064t;

        /* renamed from: u, reason: collision with root package name */
        Object f7065u;

        /* renamed from: v, reason: collision with root package name */
        Object f7066v;

        /* renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f7067w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ l<T> f7068x;

        /* renamed from: y, reason: collision with root package name */
        int f7069y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(l<T> lVar, Continuation<? super r> continuation) {
            super(continuation);
            this.f7068x = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f7067w = obj;
            this.f7069y |= Integer.MIN_VALUE;
            return this.f7068x.A(null, this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l(q3.a r7, android.content.core.j r8, java.util.List r9, android.content.core.a r10, kotlinx.coroutines.u0 r11, int r12, kotlin.jvm.internal.w r13) {
        /*
            r6 = this;
            r13 = r12 & 4
            if (r13 == 0) goto L6
            kotlin.collections.m0 r9 = kotlin.collections.EmptyList.f23167o
        L6:
            r3 = r9
            r9 = r12 & 8
            if (r9 == 0) goto L10
            t.a r10 = new t.a
            r10.<init>()
        L10:
            r4 = r10
            r9 = r12 & 16
            if (r9 == 0) goto L29
            kotlinx.coroutines.m1 r9 = kotlinx.coroutines.m1.f28809a
            kotlinx.coroutines.o0 r9 = kotlinx.coroutines.m1.c()
            r10 = 1
            r11 = 0
            kotlinx.coroutines.d0 r10 = kotlinx.coroutines.q3.c(r11, r10, r11)
            kotlin.coroutines.g r9 = r9.B(r10)
            kotlinx.coroutines.u0 r11 = kotlinx.coroutines.v0.a(r9)
        L29:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.content.core.l.<init>(q3.a, androidx.datastore.core.j, java.util.List, androidx.datastore.core.a, kotlinx.coroutines.u0, int, kotlin.jvm.internal.w):void");
    }

    private final void p(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(l0.C("Unable to create parent directories of ", file));
        }
    }

    private static /* synthetic */ void q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File r() {
        return (File) this.file.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(b.a<T> aVar, Continuation<? super m2> continuation) {
        android.content.core.m<T> value = this.downstreamFlow.getValue();
        if (!(value instanceof android.content.core.b)) {
            if (value instanceof android.content.core.i) {
                if (value == aVar.a()) {
                    Object w5 = w(continuation);
                    return w5 == CoroutineSingletons.COROUTINE_SUSPENDED ? w5 : m2.f23662a;
                }
            } else {
                if (l0.g(value, android.content.core.n.f7070a)) {
                    Object w6 = w(continuation);
                    return w6 == CoroutineSingletons.COROUTINE_SUSPENDED ? w6 : m2.f23662a;
                }
                if (value instanceof android.content.core.g) {
                    throw new IllegalStateException("Can't read in final state.".toString());
                }
            }
        }
        return m2.f23662a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(5:(1:(1:(1:12)(2:19|20))(3:21|22|23))(1:28)|13|14|15|16)(4:29|30|31|(6:33|(1:35)|26|14|15|16)(3:36|(1:38)(1:54)|(2:40|(2:42|(1:44)(1:45))(2:46|47))(2:48|(2:50|51)(2:52|53))))|24|(1:27)|26|14|15|16))|59|6|7|(0)(0)|24|(0)|26|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0050, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.datastore.core.l, androidx.datastore.core.l<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20, types: [kotlinx.coroutines.a0] */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlinx.coroutines.a0] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(androidx.datastore.core.l.b.C0074b<T> r9, kotlin.coroutines.Continuation<? super kotlin.m2> r10) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.content.core.l.t(androidx.datastore.core.l$b$b, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(kotlin.coroutines.Continuation<? super kotlin.m2> r14) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.content.core.l.u(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(kotlin.coroutines.Continuation<? super kotlin.m2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.content.core.l.C0076l
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.l$l r0 = (android.content.core.l.C0076l) r0
            int r1 = r0.f7037u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7037u = r1
            goto L18
        L13:
            androidx.datastore.core.l$l r0 = new androidx.datastore.core.l$l
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f7035s
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f7037u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f7034r
            androidx.datastore.core.l r0 = (android.content.core.l) r0
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
            r0.f7034r = r4     // Catch: java.lang.Throwable -> L46
            r0.f7037u = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = r4.u(r0)     // Catch: java.lang.Throwable -> L46
            if (r5 != r1) goto L43
            return r1
        L43:
            kotlin.m2 r5 = kotlin.m2.f23662a
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
        throw new UnsupportedOperationException("Method not decompiled: android.content.core.l.v(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(kotlin.coroutines.Continuation<? super kotlin.m2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.l.m
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.l$m r0 = (androidx.datastore.core.l.m) r0
            int r1 = r0.f7041u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7041u = r1
            goto L18
        L13:
            androidx.datastore.core.l$m r0 = new androidx.datastore.core.l$m
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f7039s
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f7041u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f7038r
            androidx.datastore.core.l r0 = (android.content.core.l) r0
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
            r0.f7038r = r4     // Catch: java.lang.Throwable -> L43
            r0.f7041u = r3     // Catch: java.lang.Throwable -> L43
            java.lang.Object r5 = r4.u(r0)     // Catch: java.lang.Throwable -> L43
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
            kotlin.m2 r5 = kotlin.m2.f23662a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.content.core.l.w(kotlin.coroutines.d):java.lang.Object");
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
    public final java.lang.Object x(kotlin.coroutines.Continuation<? super T> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.l.n
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.l$n r0 = (androidx.datastore.core.l.n) r0
            int r1 = r0.f7047w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7047w = r1
            goto L18
        L13:
            androidx.datastore.core.l$n r0 = new androidx.datastore.core.l$n
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f7045u
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f7047w
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r1 = r0.f7044t
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f7043s
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.f7042r
            androidx.datastore.core.l r0 = (android.content.core.l) r0
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
            java.io.File r6 = r5.r()     // Catch: java.io.FileNotFoundException -> L6b
            r2.<init>(r6)     // Catch: java.io.FileNotFoundException -> L6b
            androidx.datastore.core.j<T> r6 = r5.serializer     // Catch: java.lang.Throwable -> L63
            r0.f7042r = r5     // Catch: java.lang.Throwable -> L63
            r0.f7043s = r2     // Catch: java.lang.Throwable -> L63
            r4 = 0
            r0.f7044t = r4     // Catch: java.lang.Throwable -> L63
            r0.f7047w = r3     // Catch: java.lang.Throwable -> L63
            java.lang.Object r6 = r6.q(r2, r0)     // Catch: java.lang.Throwable -> L63
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
            java.io.File r1 = r0.r()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L7e
            androidx.datastore.core.j<T> r6 = r0.serializer
            java.lang.Object r6 = r6.o()
            return r6
        L7e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.content.core.l.x(kotlin.coroutines.d):java.lang.Object");
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
    public final java.lang.Object y(kotlin.coroutines.Continuation<? super T> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.datastore.core.l.o
            if (r0 == 0) goto L13
            r0 = r8
            androidx.datastore.core.l$o r0 = (androidx.datastore.core.l.o) r0
            int r1 = r0.f7052v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7052v = r1
            goto L18
        L13:
            androidx.datastore.core.l$o r0 = new androidx.datastore.core.l$o
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f7050t
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f7052v
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r1 = r0.f7049s
            java.lang.Object r0 = r0.f7048r
            androidx.datastore.core.CorruptionException r0 = (android.content.core.CorruptionException) r0
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
            java.lang.Object r2 = r0.f7049s
            androidx.datastore.core.CorruptionException r2 = (android.content.core.CorruptionException) r2
            java.lang.Object r4 = r0.f7048r
            androidx.datastore.core.l r4 = (android.content.core.l) r4
            kotlin.a1.n(r8)
            goto L77
        L49:
            java.lang.Object r2 = r0.f7048r
            androidx.datastore.core.l r2 = (android.content.core.l) r2
            kotlin.a1.n(r8)     // Catch: android.content.core.CorruptionException -> L51
            goto L61
        L51:
            r8 = move-exception
            goto L64
        L53:
            kotlin.a1.n(r8)
            r0.f7048r = r7     // Catch: android.content.core.CorruptionException -> L62
            r0.f7052v = r5     // Catch: android.content.core.CorruptionException -> L62
            java.lang.Object r8 = r7.x(r0)     // Catch: android.content.core.CorruptionException -> L62
            if (r8 != r1) goto L61
            return r1
        L61:
            return r8
        L62:
            r8 = move-exception
            r2 = r7
        L64:
            androidx.datastore.core.a<T> r5 = r2.corruptionHandler
            r0.f7048r = r2
            r0.f7049s = r8
            r0.f7052v = r4
            java.lang.Object r4 = r5.a(r8, r0)
            if (r4 != r1) goto L73
            return r1
        L73:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L77:
            r0.f7048r = r2     // Catch: java.io.IOException -> L86
            r0.f7049s = r8     // Catch: java.io.IOException -> L86
            r0.f7052v = r3     // Catch: java.io.IOException -> L86
            java.lang.Object r0 = r4.A(r8, r0)     // Catch: java.io.IOException -> L86
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
        throw new UnsupportedOperationException("Method not decompiled: android.content.core.l.y(kotlin.coroutines.d):java.lang.Object");
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
    public final java.lang.Object z(q3.p<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r8, kotlin.coroutines.CoroutineContext r9, kotlin.coroutines.Continuation<? super T> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.datastore.core.l.p
            if (r0 == 0) goto L13
            r0 = r10
            androidx.datastore.core.l$p r0 = (androidx.datastore.core.l.p) r0
            int r1 = r0.f7058w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7058w = r1
            goto L18
        L13:
            androidx.datastore.core.l$p r0 = new androidx.datastore.core.l$p
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f7056u
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f7058w
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r8 = r0.f7054s
            java.lang.Object r9 = r0.f7053r
            androidx.datastore.core.l r9 = (android.content.core.l) r9
            kotlin.a1.n(r10)
            goto L8c
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.Object r8 = r0.f7055t
            java.lang.Object r9 = r0.f7054s
            androidx.datastore.core.b r9 = (android.content.core.b) r9
            java.lang.Object r2 = r0.f7053r
            androidx.datastore.core.l r2 = (android.content.core.l) r2
            kotlin.a1.n(r10)
            goto L71
        L47:
            kotlin.a1.n(r10)
            kotlinx.coroutines.flow.e0<androidx.datastore.core.m<T>> r10 = r7.downstreamFlow
            java.lang.Object r10 = r10.getValue()
            androidx.datastore.core.b r10 = (android.content.core.b) r10
            r10.a()
            java.lang.Object r2 = r10.c()
            androidx.datastore.core.l$q r6 = new androidx.datastore.core.l$q
            r6.<init>(r8, r2, r3)
            r0.f7053r = r7
            r0.f7054s = r10
            r0.f7055t = r2
            r0.f7058w = r5
            java.lang.Object r8 = kotlinx.coroutines.j.h(r9, r6, r0)
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
            r0.f7053r = r2
            r0.f7054s = r10
            r0.f7055t = r3
            r0.f7058w = r4
            java.lang.Object r8 = r2.A(r10, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: android.content.core.l.z(q3.p, kotlin.coroutines.g, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0 A[Catch: IOException -> 0x00bf, TryCatch #3 {IOException -> 0x00bf, blocks: (B:14:0x0092, B:18:0x00a0, B:19:0x00b6, B:26:0x00bb, B:27:0x00be, B:23:0x00b9), top: B:7:0x0021, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9  */
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
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(T r9, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r10) {
        /*
            r8 = this;
            java.lang.String r0 = "Unable to rename "
            boolean r1 = r10 instanceof androidx.datastore.core.l.r
            if (r1 == 0) goto L15
            r1 = r10
            androidx.datastore.core.l$r r1 = (androidx.datastore.core.l.r) r1
            int r2 = r1.f7069y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f7069y = r2
            goto L1a
        L15:
            androidx.datastore.core.l$r r1 = new androidx.datastore.core.l$r
            r1.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r1.f7067w
            kotlin.coroutines.intrinsics.a r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.f7069y
            r4 = 1
            if (r3 == 0) goto L48
            if (r3 != r4) goto L40
            java.lang.Object r9 = r1.f7066v
            java.io.FileOutputStream r9 = (java.io.FileOutputStream) r9
            java.lang.Object r2 = r1.f7065u
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r1.f7064t
            java.io.Closeable r3 = (java.io.Closeable) r3
            java.lang.Object r4 = r1.f7063s
            java.io.File r4 = (java.io.File) r4
            java.lang.Object r1 = r1.f7062r
            androidx.datastore.core.l r1 = (android.content.core.l) r1
            kotlin.a1.n(r10)     // Catch: java.lang.Throwable -> L3d
            goto L89
        L3d:
            r9 = move-exception
            goto Lb9
        L40:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L48:
            kotlin.a1.n(r10)
            java.io.File r10 = r8.r()
            r8.p(r10)
            java.io.File r10 = new java.io.File
            java.io.File r3 = r8.r()
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.String r5 = r8.SCRATCH_SUFFIX
            java.lang.String r3 = kotlin.jvm.internal.l0.C(r3, r5)
            r10.<init>(r3)
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lc2
            r3.<init>(r10)     // Catch: java.io.IOException -> Lc2
            androidx.datastore.core.j<T> r5 = r8.serializer     // Catch: java.lang.Throwable -> Lb7
            androidx.datastore.core.l$c r6 = new androidx.datastore.core.l$c     // Catch: java.lang.Throwable -> Lb7
            r6.<init>(r3)     // Catch: java.lang.Throwable -> Lb7
            r1.f7062r = r8     // Catch: java.lang.Throwable -> Lb7
            r1.f7063s = r10     // Catch: java.lang.Throwable -> Lb7
            r1.f7064t = r3     // Catch: java.lang.Throwable -> Lb7
            r7 = 0
            r1.f7065u = r7     // Catch: java.lang.Throwable -> Lb7
            r1.f7066v = r3     // Catch: java.lang.Throwable -> Lb7
            r1.f7069y = r4     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r9 = r5.p(r9, r6, r1)     // Catch: java.lang.Throwable -> Lb7
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
            kotlin.m2 r9 = kotlin.m2.f23662a     // Catch: java.lang.Throwable -> L3d
            kotlin.io.b.a(r3, r2)     // Catch: java.io.IOException -> Lbf
            java.io.File r10 = r1.r()     // Catch: java.io.IOException -> Lbf
            boolean r10 = r4.renameTo(r10)     // Catch: java.io.IOException -> Lbf
            if (r10 == 0) goto La0
            return r9
        La0:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.io.IOException -> Lbf
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lbf
            r10.<init>(r0)     // Catch: java.io.IOException -> Lbf
            r10.append(r4)     // Catch: java.io.IOException -> Lbf
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r10.append(r0)     // Catch: java.io.IOException -> Lbf
            java.lang.String r10 = r10.toString()     // Catch: java.io.IOException -> Lbf
            r9.<init>(r10)     // Catch: java.io.IOException -> Lbf
            throw r9     // Catch: java.io.IOException -> Lbf
        Lb7:
            r9 = move-exception
            r4 = r10
        Lb9:
            throw r9     // Catch: java.lang.Throwable -> Lba
        Lba:
            r10 = move-exception
            kotlin.io.b.a(r3, r9)     // Catch: java.io.IOException -> Lbf
            throw r10     // Catch: java.io.IOException -> Lbf
        Lbf:
            r9 = move-exception
            r10 = r4
            goto Lc3
        Lc2:
            r9 = move-exception
        Lc3:
            boolean r0 = r10.exists()
            if (r0 == 0) goto Lcc
            r10.delete()
        Lcc:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: android.content.core.l.A(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // android.content.core.e
    @d5.e
    public Object a(@d5.d q3.p<? super T, ? super Continuation<? super T>, ? extends Object> pVar, @d5.d Continuation<? super T> continuation) {
        a0 c6 = c0.c(null, 1, null);
        this.actor.e(new b.C0074b(pVar, c6, this.downstreamFlow.getValue(), continuation.getContext()));
        return c6.R(continuation);
    }

    @Override // android.content.core.e
    @d5.d
    public kotlinx.coroutines.flow.i<T> getData() {
        return this.data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@d5.d a<? extends File> produceFile, @d5.d android.content.core.j<T> serializer, @d5.d List<? extends q3.p<? super android.content.core.h<T>, ? super Continuation<? super m2>, ? extends Object>> initTasksList, @d5.d a<T> corruptionHandler, @d5.d u0 scope) {
        Lazy c6;
        List<? extends q3.p<? super android.content.core.h<T>, ? super Continuation<? super m2>, ? extends Object>> V5;
        l0.p(produceFile, "produceFile");
        l0.p(serializer, "serializer");
        l0.p(initTasksList, "initTasksList");
        l0.p(corruptionHandler, "corruptionHandler");
        l0.p(scope, "scope");
        this.produceFile = produceFile;
        this.serializer = serializer;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = kotlinx.coroutines.flow.k.I0(new g(this, null));
        this.SCRATCH_SUFFIX = ".tmp";
        c6 = d0.c(new h(this));
        this.file = c6;
        this.downstreamFlow = v0.a(android.content.core.n.f7070a);
        V5 = j0.V5(initTasksList);
        this.initTasks = V5;
        this.actor = new android.content.core.k<>(scope, new d(this), e.f6990p, new f(this, null));
    }
}

package kotlin.io.path;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.event.open.EventResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.apache.http.HttpStatus;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: PathTreeWalk.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJD\u0010\u0012\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0082H¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR\u0014\u0010(\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001f¨\u0006)"}, d2 = {"Lkotlin/io/path/o0;", "Lkotlin/sequences/m;", "Ljava/nio/file/Path;", "start", "", "Lkotlin/io/path/t0;", "options", "<init>", "(Ljava/nio/file/Path;[Lkotlin/io/path/t0;)V", "Lkotlin/sequences/o;", "Lkotlin/io/path/b0;", "node", "Lkotlin/io/path/k;", "entriesReader", "Lkotlin/Function1;", "", "Lkotlin/k2;", "entriesAction", "m", "(Lkotlin/sequences/o;Lkotlin/io/path/b0;Lkotlin/io/path/k;Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "h", "()Ljava/util/Iterator;", "g", "iterator", "a", "Ljava/nio/file/Path;", "b", "[Lkotlin/io/path/t0;", "", "i", "()Z", "followLinks", "Ljava/nio/file/LinkOption;", "k", "()[Ljava/nio/file/LinkOption;", "linkOptions", "j", "includeDirectories", "l", "isBFS", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
@t
/* loaded from: classes7.dex */
public final class o0 implements kotlin.sequences.m<Path> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Path start;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final t0[] options;

    /* compiled from: PathTreeWalk.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {SyslogAppender.LOG_LOCAL7, 190}, m = "invokeSuspend", n = {"$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "queue", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/o;", "Ljava/nio/file/Path;", "Lkotlin/k2;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 9, 0})
    @kotlin.jvm.internal.r1({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,177:1\n45#2,15:178\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n*L\n98#1:178,15\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.k implements ld.p<kotlin.sequences.o<? super Path>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: c, reason: collision with root package name */
        Object f75230c;

        /* renamed from: d, reason: collision with root package name */
        Object f75231d;

        /* renamed from: e, reason: collision with root package name */
        Object f75232e;

        /* renamed from: f, reason: collision with root package name */
        Object f75233f;

        /* renamed from: g, reason: collision with root package name */
        Object f75234g;

        /* renamed from: h, reason: collision with root package name */
        int f75235h;

        /* renamed from: i, reason: collision with root package name */
        private /* synthetic */ Object f75236i;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlin.sequences.o<? super Path> oVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((a) create(oVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = o0.this.new a(dVar);
            aVar.f75236i = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0085  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00ee -> B:6:0x007f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00f0 -> B:6:0x007f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 305
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.o0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: PathTreeWalk.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}, l = {SyslogAppender.LOG_LOCAL7, 190, EventResult.ERROR_CODE_OTHER, HttpStatus.SC_RESET_CONTENT}, m = "invokeSuspend", n = {"$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader", "$this$iterator", "stack", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/o;", "Ljava/nio/file/Path;", "Lkotlin/k2;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 9, 0})
    @kotlin.jvm.internal.r1({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,177:1\n45#2,15:178\n45#2,15:193\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n*L\n67#1:178,15\n78#1:193,15\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.k implements ld.p<kotlin.sequences.o<? super Path>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: c, reason: collision with root package name */
        Object f75238c;

        /* renamed from: d, reason: collision with root package name */
        Object f75239d;

        /* renamed from: e, reason: collision with root package name */
        Object f75240e;

        /* renamed from: f, reason: collision with root package name */
        Object f75241f;

        /* renamed from: g, reason: collision with root package name */
        Object f75242g;

        /* renamed from: h, reason: collision with root package name */
        int f75243h;

        /* renamed from: i, reason: collision with root package name */
        private /* synthetic */ Object f75244i;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlin.sequences.o<? super Path> oVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((b) create(oVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = o0.this.new b(dVar);
            bVar.f75244i = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x01ce  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0102  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x01cc -> B:14:0x0140). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x01ce -> B:14:0x0140). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 537
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.o0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public o0(@fg.l Path path, @fg.l t0[] t0VarArr) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摽\u0001"));
        kotlin.jvm.internal.l0.p(t0VarArr, ProtectedSandApp.s("摾\u0001"));
        this.start = path;
        this.options = t0VarArr;
    }

    private final Iterator<Path> g() {
        return kotlin.sequences.p.a(new a(null));
    }

    private final Iterator<Path> h() {
        return kotlin.sequences.p.a(new b(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i() {
        return kotlin.collections.l.s8(this.options, t0.FOLLOW_LINKS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j() {
        return kotlin.collections.l.s8(this.options, t0.INCLUDE_DIRECTORIES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinkOption[] k() {
        return z.f75259a.a(i());
    }

    private final boolean l() {
        return kotlin.collections.l.s8(this.options, t0.BREADTH_FIRST);
    }

    private final Object m(kotlin.sequences.o<? super Path> oVar, b0 b0Var, k kVar, ld.l<? super List<b0>, kotlin.k2> lVar, kotlin.coroutines.d<? super kotlin.k2> dVar) {
        boolean c5;
        Path path = b0Var.getPath();
        LinkOption[] k4 = k();
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(k4, k4.length);
        if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            c5 = s0.c(b0Var);
            if (c5) {
                n0.a();
                throw m0.a(path.toString());
            }
            if (j()) {
                oVar.b(path, dVar);
            }
            LinkOption[] k5 = k();
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(k5, k5.length);
            if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length))) {
                lVar.invoke(kVar.c(b0Var));
            }
        } else if (Files.exists(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            oVar.b(path, dVar);
            return kotlin.k2.f75408a;
        }
        return kotlin.k2.f75408a;
    }

    @Override // kotlin.sequences.m
    @fg.l
    public Iterator<Path> iterator() {
        return l() ? g() : h();
    }
}

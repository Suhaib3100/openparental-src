package kotlin.io.path;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.nio.file.FileSystemLoopException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: PathTreeWalk.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0002J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0096\u0002JB\u0010\u0018\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0018\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0!\u0012\u0004\u0012\u00020\u00190 H\u0082H¢\u0006\u0002\u0010\"R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lkotlin/io/path/PathTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/nio/file/Path;", "start", "options", "", "Lkotlin/io/path/PathWalkOption;", "(Ljava/nio/file/Path;[Lkotlin/io/path/PathWalkOption;)V", "followLinks", "", "getFollowLinks", "()Z", "includeDirectories", "getIncludeDirectories", "isBFS", "linkOptions", "Ljava/nio/file/LinkOption;", "getLinkOptions", "()[Ljava/nio/file/LinkOption;", "[Lkotlin/io/path/PathWalkOption;", "bfsIterator", "", "dfsIterator", "iterator", "yieldIfNeeded", "", "Lkotlin/sequences/SequenceScope;", "node", "Lkotlin/io/path/PathNode;", "entriesReader", "Lkotlin/io/path/DirectoryEntriesReader;", "entriesAction", "Lkotlin/Function1;", "", "(Lkotlin/sequences/SequenceScope;Lkotlin/io/path/PathNode;Lkotlin/io/path/DirectoryEntriesReader;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalPathApi
/* renamed from: kotlin.io.path.g0, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class PathTreeWalk implements Sequence<Path> {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final Path f23438a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final PathWalkOption[] f23439b;

    /* compiled from: PathTreeWalk.kt */
    @DebugMetadata(c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {SyslogAppender.LOG_LOCAL7, 190}, m = "invokeSuspend", n = {"$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "queue", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Ljava/nio/file/Path;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,177:1\n45#2,15:178\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n*L\n98#1:178,15\n*E\n"})
    /* renamed from: kotlin.io.path.g0$a */
    /* loaded from: classes6.dex */
    static final class a extends RestrictedSuspendLambda implements q3.p<SequenceScope<? super Path>, Continuation<? super kotlin.m2>, Object> {

        /* renamed from: q, reason: collision with root package name */
        Object f23440q;

        /* renamed from: r, reason: collision with root package name */
        Object f23441r;

        /* renamed from: s, reason: collision with root package name */
        Object f23442s;

        /* renamed from: t, reason: collision with root package name */
        Object f23443t;

        /* renamed from: u, reason: collision with root package name */
        Object f23444u;

        /* renamed from: v, reason: collision with root package name */
        int f23445v;

        /* renamed from: w, reason: collision with root package name */
        private /* synthetic */ Object f23446w;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0089  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00f4 -> B:6:0x0082). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00f6 -> B:6:0x0082). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 307
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.PathTreeWalk.a.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @d5.e
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d SequenceScope<? super Path> sequenceScope, @d5.e Continuation<? super kotlin.m2> continuation) {
            return ((a) c(sequenceScope, continuation)).A(kotlin.m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<kotlin.m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            a aVar = PathTreeWalk.this.new a(continuation);
            aVar.f23446w = obj;
            return aVar;
        }
    }

    /* compiled from: PathTreeWalk.kt */
    @DebugMetadata(c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}, l = {SyslogAppender.LOG_LOCAL7, 190, 199, 205}, m = "invokeSuspend", n = {"$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader", "$this$iterator", "stack", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Ljava/nio/file/Path;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,177:1\n45#2,15:178\n45#2,15:193\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n*L\n67#1:178,15\n78#1:193,15\n*E\n"})
    /* renamed from: kotlin.io.path.g0$b */
    /* loaded from: classes6.dex */
    static final class b extends RestrictedSuspendLambda implements q3.p<SequenceScope<? super Path>, Continuation<? super kotlin.m2>, Object> {

        /* renamed from: q, reason: collision with root package name */
        Object f23448q;

        /* renamed from: r, reason: collision with root package name */
        Object f23449r;

        /* renamed from: s, reason: collision with root package name */
        Object f23450s;

        /* renamed from: t, reason: collision with root package name */
        Object f23451t;

        /* renamed from: u, reason: collision with root package name */
        Object f23452u;

        /* renamed from: v, reason: collision with root package name */
        int f23453v;

        /* renamed from: w, reason: collision with root package name */
        private /* synthetic */ Object f23454w;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x01d1  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x01cf -> B:14:0x0142). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x01d1 -> B:14:0x0142). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 538
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.PathTreeWalk.b.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @d5.e
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d SequenceScope<? super Path> sequenceScope, @d5.e Continuation<? super kotlin.m2> continuation) {
            return ((b) c(sequenceScope, continuation)).A(kotlin.m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<kotlin.m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            b bVar = PathTreeWalk.this.new b(continuation);
            bVar.f23454w = obj;
            return bVar;
        }
    }

    public PathTreeWalk(@d5.d Path path, @d5.d PathWalkOption[] pathWalkOptionArr) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䁖"));
        kotlin.jvm.internal.l0.p(pathWalkOptionArr, ProtectedSandApp.s("䁗"));
        this.f23438a = path;
        this.f23439b = pathWalkOptionArr;
    }

    private final Iterator<Path> g() {
        Iterator<Path> a6;
        a6 = kotlin.sequences.q.a(new a(null));
        return a6;
    }

    private final Iterator<Path> h() {
        Iterator<Path> a6;
        a6 = kotlin.sequences.q.a(new b(null));
        return a6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i() {
        return kotlin.collections.t.s8(this.f23439b, PathWalkOption.FOLLOW_LINKS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j() {
        return kotlin.collections.t.s8(this.f23439b, PathWalkOption.INCLUDE_DIRECTORIES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinkOption[] k() {
        return LinkFollowing.f23494a.a(i());
    }

    private final boolean l() {
        return kotlin.collections.t.s8(this.f23439b, PathWalkOption.BREADTH_FIRST);
    }

    private final Object m(SequenceScope<? super Path> sequenceScope, PathNode pathNode, DirectoryEntriesReader directoryEntriesReader, q3.l<? super List<PathNode>, kotlin.m2> lVar, Continuation<? super kotlin.m2> continuation) {
        boolean c6;
        Path f23499a = pathNode.getF23499a();
        LinkOption[] k5 = k();
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(k5, k5.length);
        if (Files.isDirectory(f23499a, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            c6 = j0.c(pathNode);
            if (c6) {
                throw new FileSystemLoopException(f23499a.toString());
            }
            if (j()) {
                sequenceScope.f(f23499a, continuation);
            }
            LinkOption[] k6 = k();
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(k6, k6.length);
            if (Files.isDirectory(f23499a, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length))) {
                lVar.N(directoryEntriesReader.c(pathNode));
            }
        } else if (Files.exists(f23499a, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            sequenceScope.f(f23499a, continuation);
            return kotlin.m2.f23662a;
        }
        return kotlin.m2.f23662a;
    }

    @Override // kotlin.sequences.Sequence
    @d5.d
    public Iterator<Path> iterator() {
        return l() ? g() : h();
    }
}

package kotlin.io;

import androidx.compose.animation.core.a2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k2;

/* compiled from: FileTreeWalk.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0015\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003#%'B\u008b\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u00128\u0010\u0011\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u001b\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u001d\u0010\u001cJ'\u0010\u001e\u001a\u00020\u00002\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0012¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(RF\u0010\u0011\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010*R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010+¨\u0006,"}, d2 = {"Lkotlin/io/h;", "Lkotlin/sequences/m;", "Ljava/io/File;", "start", "Lkotlin/io/i;", "direction", "Lkotlin/Function1;", "", "onEnter", "Lkotlin/k2;", "onLeave", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "f", "Ljava/io/IOException;", "e", "onFail", "", "maxDepth", "<init>", "(Ljava/io/File;Lkotlin/io/i;Lld/l;Lld/l;Lld/p;I)V", "(Ljava/io/File;Lkotlin/io/i;)V", "", "iterator", "()Ljava/util/Iterator;", "function", "j", "(Lld/l;)Lkotlin/io/h;", "l", "k", "(Lld/p;)Lkotlin/io/h;", "depth", "i", "(I)Lkotlin/io/h;", "a", "Ljava/io/File;", "b", "Lkotlin/io/i;", "c", "Lld/l;", "d", "Lld/p;", "I", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class h implements kotlin.sequences.m<File> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final File start;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i direction;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<File, Boolean> onEnter;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<File, k2> onLeave;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.p<File, IOException, k2> onFail;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int maxDepth;

    /* compiled from: FileTreeWalk.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/h$a;", "Lkotlin/io/h$c;", "Ljava/io/File;", "rootDir", "<init>", "(Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$DirectoryState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
    private static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@fg.l File file) {
            super(file);
            l0.p(file, ProtectedSandApp.s("揯\u0001"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileTreeWalk.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0013\f\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0082\u0010¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lkotlin/io/h$b;", "Lkotlin/collections/b;", "Ljava/io/File;", "<init>", "(Lkotlin/io/h;)V", "root", "Lkotlin/io/h$a;", "f", "(Ljava/io/File;)Lkotlin/io/h$a;", "h", "()Ljava/io/File;", "Lkotlin/k2;", "b", "()V", "Ljava/util/ArrayDeque;", "Lkotlin/io/h$c;", "d", "Ljava/util/ArrayDeque;", "state", "a", "c", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    final class b extends kotlin.collections.b<File> {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final ArrayDeque<c> state;

        /* compiled from: FileTreeWalk.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\t¨\u0006\u0015"}, d2 = {"Lkotlin/io/h$b$a;", "Lkotlin/io/h$a;", "Ljava/io/File;", "rootDir", "<init>", "(Lkotlin/io/h$b;Ljava/io/File;)V", "b", "()Ljava/io/File;", "", "Z", "rootVisited", "", "c", "[Ljava/io/File;", "fileList", "", "d", "I", "fileIndex", "e", "failed", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private final class a extends a {

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private boolean rootVisited;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @fg.m
            private File[] fileList;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private int fileIndex;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            private boolean failed;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f75168f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@fg.l b bVar, File file) {
                super(file);
                l0.p(file, ProtectedSandApp.s("揰\u0001"));
                this.f75168f = bVar;
            }

            @Override // kotlin.io.h.c
            @fg.m
            public File b() {
                if (!this.failed && this.fileList == null) {
                    ld.l lVar = h.this.onEnter;
                    if (lVar != null && !((Boolean) lVar.invoke(getRoot())).booleanValue()) {
                        return null;
                    }
                    File[] listFiles = getRoot().listFiles();
                    this.fileList = listFiles;
                    if (listFiles == null) {
                        ld.p pVar = h.this.onFail;
                        if (pVar != null) {
                            pVar.invoke(getRoot(), new AccessDeniedException(getRoot(), null, ProtectedSandApp.s("揱\u0001"), 2, null));
                        }
                        this.failed = true;
                    }
                }
                File[] fileArr = this.fileList;
                if (fileArr != null) {
                    int i4 = this.fileIndex;
                    l0.m(fileArr);
                    if (i4 < fileArr.length) {
                        File[] fileArr2 = this.fileList;
                        l0.m(fileArr2);
                        int i5 = this.fileIndex;
                        this.fileIndex = i5 + 1;
                        return fileArr2[i5];
                    }
                }
                if (!this.rootVisited) {
                    this.rootVisited = true;
                    return getRoot();
                }
                ld.l lVar2 = h.this.onLeave;
                if (lVar2 != null) {
                    lVar2.invoke(getRoot());
                }
                return null;
            }
        }

        /* compiled from: FileTreeWalk.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlin/io/h$b$b;", "Lkotlin/io/h$c;", "Ljava/io/File;", "rootFile", "<init>", "(Lkotlin/io/h$b;Ljava/io/File;)V", "b", "()Ljava/io/File;", "", "Z", "visited", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
        /* renamed from: kotlin.io.h$b$b, reason: collision with other inner class name */
        private final class C1060b extends c {

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private boolean visited;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f75170c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1060b(@fg.l b bVar, File file) {
                super(file);
                l0.p(file, ProtectedSandApp.s("揲\u0001"));
                this.f75170c = bVar;
            }

            @Override // kotlin.io.h.c
            @fg.m
            public File b() {
                if (this.visited) {
                    return null;
                }
                this.visited = true;
                return getRoot();
            }
        }

        /* compiled from: FileTreeWalk.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkotlin/io/h$b$c;", "Lkotlin/io/h$a;", "Ljava/io/File;", "rootDir", "<init>", "(Lkotlin/io/h$b;Ljava/io/File;)V", "b", "()Ljava/io/File;", "", "Z", "rootVisited", "", "c", "[Ljava/io/File;", "fileList", "", "d", "I", "fileIndex", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private final class c extends a {

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private boolean rootVisited;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @fg.m
            private File[] fileList;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private int fileIndex;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f75174e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@fg.l b bVar, File file) {
                super(file);
                l0.p(file, ProtectedSandApp.s("揳\u0001"));
                this.f75174e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // kotlin.io.h.c
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File b() {
                /*
                    r10 = this;
                    boolean r0 = r10.rootVisited
                    r1 = 0
                    if (r0 != 0) goto L28
                    kotlin.io.h$b r0 = r10.f75174e
                    kotlin.io.h r0 = kotlin.io.h.this
                    ld.l r0 = kotlin.io.h.e(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r10.getRoot()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r10.rootVisited = r0
                    java.io.File r0 = r10.getRoot()
                    return r0
                L28:
                    java.io.File[] r0 = r10.fileList
                    if (r0 == 0) goto L47
                    int r2 = r10.fileIndex
                    kotlin.jvm.internal.l0.m(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L35
                    goto L47
                L35:
                    kotlin.io.h$b r0 = r10.f75174e
                    kotlin.io.h r0 = kotlin.io.h.this
                    ld.l r0 = kotlin.io.h.g(r0)
                    if (r0 == 0) goto L46
                    java.io.File r2 = r10.getRoot()
                    r0.invoke(r2)
                L46:
                    return r1
                L47:
                    java.io.File[] r0 = r10.fileList
                    if (r0 != 0) goto L97
                    java.io.File r0 = r10.getRoot()
                    java.io.File[] r0 = r0.listFiles()
                    r10.fileList = r0
                    if (r0 != 0) goto L7b
                    kotlin.io.h$b r0 = r10.f75174e
                    kotlin.io.h r0 = kotlin.io.h.this
                    ld.p r0 = kotlin.io.h.f(r0)
                    if (r0 == 0) goto L7b
                    java.io.File r2 = r10.getRoot()
                    kotlin.io.AccessDeniedException r9 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r10.getRoot()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "援\u0001"
                    java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L7b:
                    java.io.File[] r0 = r10.fileList
                    if (r0 == 0) goto L85
                    kotlin.jvm.internal.l0.m(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L97
                L85:
                    kotlin.io.h$b r0 = r10.f75174e
                    kotlin.io.h r0 = kotlin.io.h.this
                    ld.l r0 = kotlin.io.h.g(r0)
                    if (r0 == 0) goto L96
                    java.io.File r2 = r10.getRoot()
                    r0.invoke(r2)
                L96:
                    return r1
                L97:
                    java.io.File[] r0 = r10.fileList
                    kotlin.jvm.internal.l0.m(r0)
                    int r1 = r10.fileIndex
                    int r2 = r1 + 1
                    r10.fileIndex = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.io.h.b.c.b():java.io.File");
            }
        }

        /* compiled from: FileTreeWalk.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class d {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f75175a;

            static {
                int[] iArr = new int[i.values().length];
                try {
                    iArr[i.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[i.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f75175a = iArr;
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.state = arrayDeque;
            if (h.this.start.isDirectory()) {
                arrayDeque.push(f(h.this.start));
            } else if (h.this.start.isFile()) {
                arrayDeque.push(new C1060b(this, h.this.start));
            } else {
                c();
            }
        }

        private final a f(File root) {
            int i4 = d.f75175a[h.this.direction.ordinal()];
            if (i4 == 1) {
                return new c(this, root);
            }
            if (i4 == 2) {
                return new a(this, root);
            }
            throw new NoWhenBranchMatchedException();
        }

        private final File h() {
            File b5;
            while (true) {
                c peek = this.state.peek();
                if (peek == null) {
                    return null;
                }
                b5 = peek.b();
                if (b5 == null) {
                    this.state.pop();
                } else {
                    if (l0.g(b5, peek.getRoot()) || !b5.isDirectory() || this.state.size() >= h.this.maxDepth) {
                        break;
                    }
                    this.state.push(f(b5));
                }
            }
            return b5;
        }

        @Override // kotlin.collections.b
        protected void b() {
            File h4 = h();
            if (h4 != null) {
                d(h4);
            } else {
                c();
            }
        }
    }

    /* compiled from: FileTreeWalk.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, d2 = {"Lkotlin/io/h$c;", "", "Ljava/io/File;", "root", "<init>", "(Ljava/io/File;)V", "b", "()Ljava/io/File;", "a", "Ljava/io/File;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static abstract class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final File root;

        public c(@fg.l File file) {
            l0.p(file, ProtectedSandApp.s("揮\u0001"));
            this.root = file;
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final File getRoot() {
            return this.root;
        }

        @fg.m
        public abstract File b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h(File file, i iVar, ld.l<? super File, Boolean> lVar, ld.l<? super File, k2> lVar2, ld.p<? super File, ? super IOException, k2> pVar, int i4) {
        this.start = file;
        this.direction = iVar;
        this.onEnter = lVar;
        this.onLeave = lVar2;
        this.onFail = pVar;
        this.maxDepth = i4;
    }

    @fg.l
    public final h i(int depth) {
        if (depth > 0) {
            return new h(this.start, this.direction, this.onEnter, this.onLeave, this.onFail, depth);
        }
        throw new IllegalArgumentException(a2.a(ProtectedSandApp.s("揷\u0001"), depth, '.'));
    }

    @Override // kotlin.sequences.m
    @fg.l
    public Iterator<File> iterator() {
        return new b();
    }

    @fg.l
    public final h j(@fg.l ld.l<? super File, Boolean> function) {
        l0.p(function, ProtectedSandApp.s("揸\u0001"));
        return new h(this.start, this.direction, function, this.onLeave, this.onFail, this.maxDepth);
    }

    @fg.l
    public final h k(@fg.l ld.p<? super File, ? super IOException, k2> function) {
        l0.p(function, ProtectedSandApp.s("揸\u0001"));
        return new h(this.start, this.direction, this.onEnter, this.onLeave, function, this.maxDepth);
    }

    @fg.l
    public final h l(@fg.l ld.l<? super File, k2> function) {
        l0.p(function, ProtectedSandApp.s("揸\u0001"));
        return new h(this.start, this.direction, this.onEnter, function, this.onFail, this.maxDepth);
    }

    /* synthetic */ h(File file, i iVar, ld.l lVar, ld.l lVar2, ld.p pVar, int i4, int i5, w wVar) {
        this(file, (i5 & 2) != 0 ? i.TOP_DOWN : iVar, lVar, lVar2, pVar, (i5 & 32) != 0 ? Integer.MAX_VALUE : i4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@fg.l File file, @fg.l i iVar) {
        this(file, iVar, null, null, null, 0, 32, null);
        l0.p(file, ProtectedSandApp.s("揵\u0001"));
        l0.p(iVar, ProtectedSandApp.s("揶\u0001"));
    }

    public /* synthetic */ h(File file, i iVar, int i4, w wVar) {
        this(file, (i4 & 2) != 0 ? i.TOP_DOWN : iVar);
    }
}

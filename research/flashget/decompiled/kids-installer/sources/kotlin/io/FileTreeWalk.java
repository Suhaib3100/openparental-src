package kotlin.io;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.m2;
import kotlin.sequences.Sequence;

/* compiled from: FileTreeWalk.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u001b\u001cB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0089\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u00128\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0096\u0002J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0014J\u001a\u0010\u0007\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bJ \u0010\f\u001a\u00020\u00002\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\rJ\u001a\u0010\n\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R@\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lkotlin/io/FileTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "start", "direction", "Lkotlin/io/FileWalkDirection;", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)V", "onEnter", "Lkotlin/Function1;", "", "onLeave", "", "onFail", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "f", "Ljava/io/IOException;", "e", "maxDepth", "", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V", "iterator", "", "depth", "function", "DirectoryState", "FileTreeWalkIterator", "WalkState", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.io.h, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class FileTreeWalk implements Sequence<File> {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final File f23397a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final FileWalkDirection f23398b;

    /* renamed from: c, reason: collision with root package name */
    @d5.e
    private final q3.l<File, Boolean> f23399c;

    /* renamed from: d, reason: collision with root package name */
    @d5.e
    private final q3.l<File, m2> f23400d;

    /* renamed from: e, reason: collision with root package name */
    @d5.e
    private final q3.p<File, IOException, m2> f23401e;

    /* renamed from: f, reason: collision with root package name */
    private final int f23402f;

    /* compiled from: FileTreeWalk.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\"\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/io/FileTreeWalk$DirectoryState;", "Lkotlin/io/FileTreeWalk$WalkState;", "rootDir", "Ljava/io/File;", "(Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$DirectoryState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
    /* renamed from: kotlin.io.h$a */
    private static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@d5.d File file) {
            super(file);
            l0.p(file, ProtectedSandApp.s("㿲"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileTreeWalk.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\u000e\u000fB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0014J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0082\u0010R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;", "Lkotlin/collections/AbstractIterator;", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk;)V", "state", "Ljava/util/ArrayDeque;", "Lkotlin/io/FileTreeWalk$WalkState;", "computeNext", "", "directoryState", "Lkotlin/io/FileTreeWalk$DirectoryState;", "root", "gotoNext", "BottomUpDirectoryState", "SingleFileState", "TopDownDirectoryState", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.io.h$b */
    /* loaded from: classes6.dex */
    final class b extends AbstractIterator<File> {

        /* renamed from: q, reason: collision with root package name */
        @d5.d
        private final ArrayDeque<c> f23403q;

        /* compiled from: FileTreeWalk.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "rootDir", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "failed", "", "fileIndex", "", "fileList", "", "[Ljava/io/File;", "rootVisited", "step", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.io.h$b$a */
        private final class a extends a {

            /* renamed from: b, reason: collision with root package name */
            private boolean f23405b;

            /* renamed from: c, reason: collision with root package name */
            @d5.e
            private File[] f23406c;

            /* renamed from: d, reason: collision with root package name */
            private int f23407d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f23408e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f23409f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@d5.d b bVar, File file) {
                super(file);
                l0.p(file, ProtectedSandApp.s("緎"));
                this.f23409f = bVar;
            }

            @Override // kotlin.io.FileTreeWalk.c
            @d5.e
            public File b() {
                if (!this.f23408e && this.f23406c == null) {
                    q3.l lVar = FileTreeWalk.this.f23399c;
                    boolean z5 = false;
                    if (lVar != null && !((Boolean) lVar.N(getF23417a())).booleanValue()) {
                        z5 = true;
                    }
                    if (z5) {
                        return null;
                    }
                    File[] listFiles = getF23417a().listFiles();
                    this.f23406c = listFiles;
                    if (listFiles == null) {
                        q3.p pVar = FileTreeWalk.this.f23401e;
                        if (pVar != null) {
                            pVar.g0(getF23417a(), new AccessDeniedException(getF23417a(), null, ProtectedSandApp.s("総"), 2, null));
                        }
                        this.f23408e = true;
                    }
                }
                File[] fileArr = this.f23406c;
                if (fileArr != null) {
                    int i5 = this.f23407d;
                    l0.m(fileArr);
                    if (i5 < fileArr.length) {
                        File[] fileArr2 = this.f23406c;
                        l0.m(fileArr2);
                        int i6 = this.f23407d;
                        this.f23407d = i6 + 1;
                        return fileArr2[i6];
                    }
                }
                if (!this.f23405b) {
                    this.f23405b = true;
                    return getF23417a();
                }
                q3.l lVar2 = FileTreeWalk.this.f23400d;
                if (lVar2 != null) {
                    lVar2.N(getF23417a());
                }
                return null;
            }
        }

        /* compiled from: FileTreeWalk.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState;", "Lkotlin/io/FileTreeWalk$WalkState;", "rootFile", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "visited", "", "step", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
        /* renamed from: kotlin.io.h$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        private final class C0258b extends c {

            /* renamed from: b, reason: collision with root package name */
            private boolean f23410b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f23411c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0258b(@d5.d b bVar, File file) {
                super(file);
                l0.p(file, ProtectedSandApp.s("㿳"));
                this.f23411c = bVar;
            }

            @Override // kotlin.io.FileTreeWalk.c
            @d5.e
            public File b() {
                if (this.f23410b) {
                    return null;
                }
                this.f23410b = true;
                return getF23417a();
            }
        }

        /* compiled from: FileTreeWalk.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "rootDir", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "fileIndex", "", "fileList", "", "[Ljava/io/File;", "rootVisited", "", "step", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.io.h$b$c */
        private final class c extends a {

            /* renamed from: b, reason: collision with root package name */
            private boolean f23412b;

            /* renamed from: c, reason: collision with root package name */
            @d5.e
            private File[] f23413c;

            /* renamed from: d, reason: collision with root package name */
            private int f23414d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f23415e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@d5.d b bVar, File file) {
                super(file);
                l0.p(file, ProtectedSandApp.s("緐"));
                this.f23415e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
            
                if (r0.length == 0) goto L33;
             */
            @Override // kotlin.io.FileTreeWalk.c
            @d5.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f23412b
                    r1 = 0
                    if (r0 != 0) goto L2c
                    kotlin.io.h$b r0 = r10.f23415e
                    kotlin.io.h r0 = kotlin.io.FileTreeWalk.this
                    q3.l r0 = kotlin.io.FileTreeWalk.e(r0)
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L22
                    java.io.File r4 = r10.getF23417a()
                    java.lang.Object r0 = r0.N(r4)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L22
                    r2 = r3
                L22:
                    if (r2 == 0) goto L25
                    return r1
                L25:
                    r10.f23412b = r3
                    java.io.File r0 = r10.getF23417a()
                    return r0
                L2c:
                    java.io.File[] r0 = r10.f23413c
                    if (r0 == 0) goto L4b
                    int r2 = r10.f23414d
                    kotlin.jvm.internal.l0.m(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L39
                    goto L4b
                L39:
                    kotlin.io.h$b r0 = r10.f23415e
                    kotlin.io.h r0 = kotlin.io.FileTreeWalk.this
                    q3.l r0 = kotlin.io.FileTreeWalk.g(r0)
                    if (r0 == 0) goto L4a
                    java.io.File r2 = r10.getF23417a()
                    r0.N(r2)
                L4a:
                    return r1
                L4b:
                    java.io.File[] r0 = r10.f23413c
                    if (r0 != 0) goto L9b
                    java.io.File r0 = r10.getF23417a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f23413c = r0
                    if (r0 != 0) goto L7f
                    kotlin.io.h$b r0 = r10.f23415e
                    kotlin.io.h r0 = kotlin.io.FileTreeWalk.this
                    q3.p r0 = kotlin.io.FileTreeWalk.f(r0)
                    if (r0 == 0) goto L7f
                    java.io.File r2 = r10.getF23417a()
                    kotlin.io.AccessDeniedException r9 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r10.getF23417a()
                    r5 = 0
                    java.lang.String r6 = "緑"
                    java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                    r7 = 2
                    r8 = 0
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.g0(r2, r9)
                L7f:
                    java.io.File[] r0 = r10.f23413c
                    if (r0 == 0) goto L89
                    kotlin.jvm.internal.l0.m(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L9b
                L89:
                    kotlin.io.h$b r0 = r10.f23415e
                    kotlin.io.h r0 = kotlin.io.FileTreeWalk.this
                    q3.l r0 = kotlin.io.FileTreeWalk.g(r0)
                    if (r0 == 0) goto L9a
                    java.io.File r2 = r10.getF23417a()
                    r0.N(r2)
                L9a:
                    return r1
                L9b:
                    java.io.File[] r0 = r10.f23413c
                    kotlin.jvm.internal.l0.m(r0)
                    int r1 = r10.f23414d
                    int r2 = r1 + 1
                    r10.f23414d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FileTreeWalk.b.c.b():java.io.File");
            }
        }

        /* compiled from: FileTreeWalk.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.io.h$b$d */
        /* loaded from: classes5.dex */
        public /* synthetic */ class d {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f23416a;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f23416a = iArr;
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f23403q = arrayDeque;
            if (FileTreeWalk.this.f23397a.isDirectory()) {
                arrayDeque.push(h(FileTreeWalk.this.f23397a));
            } else if (FileTreeWalk.this.f23397a.isFile()) {
                arrayDeque.push(new C0258b(this, FileTreeWalk.this.f23397a));
            } else {
                d();
            }
        }

        private final a h(File file) {
            int i5 = d.f23416a[FileTreeWalk.this.f23398b.ordinal()];
            if (i5 == 1) {
                return new c(this, file);
            }
            if (i5 == 2) {
                return new a(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }

        private final File j() {
            File b6;
            while (true) {
                c peek = this.f23403q.peek();
                if (peek == null) {
                    return null;
                }
                b6 = peek.b();
                if (b6 == null) {
                    this.f23403q.pop();
                } else {
                    if (l0.g(b6, peek.getF23417a()) || !b6.isDirectory() || this.f23403q.size() >= FileTreeWalk.this.f23402f) {
                        break;
                    }
                    this.f23403q.push(h(b6));
                }
            }
            return b6;
        }

        @Override // kotlin.collections.AbstractIterator
        protected void a() {
            File j5 = j();
            if (j5 != null) {
                f(j5);
            } else {
                d();
            }
        }
    }

    /* compiled from: FileTreeWalk.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\"\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/io/FileTreeWalk$WalkState;", "", "root", "Ljava/io/File;", "(Ljava/io/File;)V", "getRoot", "()Ljava/io/File;", "step", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.io.h$c */
    private static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        private final File f23417a;

        public c(@d5.d File file) {
            l0.p(file, ProtectedSandApp.s("㿱"));
            this.f23417a = file;
        }

        @d5.d
        /* renamed from: a, reason: from getter */
        public final File getF23417a() {
            return this.f23417a;
        }

        @d5.e
        public abstract File b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FileTreeWalk(File file, FileWalkDirection fileWalkDirection, q3.l<? super File, Boolean> lVar, q3.l<? super File, m2> lVar2, q3.p<? super File, ? super IOException, m2> pVar, int i5) {
        this.f23397a = file;
        this.f23398b = fileWalkDirection;
        this.f23399c = lVar;
        this.f23400d = lVar2;
        this.f23401e = pVar;
        this.f23402f = i5;
    }

    @d5.d
    public final FileTreeWalk i(int i5) {
        if (i5 > 0) {
            return new FileTreeWalk(this.f23397a, this.f23398b, this.f23399c, this.f23400d, this.f23401e, i5);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("㿶") + i5 + org.apache.commons.io.k.f32026a);
    }

    @Override // kotlin.sequences.Sequence
    @d5.d
    public Iterator<File> iterator() {
        return new b();
    }

    @d5.d
    public final FileTreeWalk j(@d5.d q3.l<? super File, Boolean> lVar) {
        l0.p(lVar, ProtectedSandApp.s("㿷"));
        return new FileTreeWalk(this.f23397a, this.f23398b, lVar, this.f23400d, this.f23401e, this.f23402f);
    }

    @d5.d
    public final FileTreeWalk k(@d5.d q3.p<? super File, ? super IOException, m2> pVar) {
        l0.p(pVar, ProtectedSandApp.s("㿸"));
        return new FileTreeWalk(this.f23397a, this.f23398b, this.f23399c, this.f23400d, pVar, this.f23402f);
    }

    @d5.d
    public final FileTreeWalk l(@d5.d q3.l<? super File, m2> lVar) {
        l0.p(lVar, ProtectedSandApp.s("㿹"));
        return new FileTreeWalk(this.f23397a, this.f23398b, this.f23399c, lVar, this.f23401e, this.f23402f);
    }

    /* synthetic */ FileTreeWalk(File file, FileWalkDirection fileWalkDirection, q3.l lVar, q3.l lVar2, q3.p pVar, int i5, int i6, w wVar) {
        this(file, (i6 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, lVar, lVar2, pVar, (i6 & 32) != 0 ? Integer.MAX_VALUE : i5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FileTreeWalk(@d5.d File file, @d5.d FileWalkDirection fileWalkDirection) {
        this(file, fileWalkDirection, null, null, null, 0, 32, null);
        l0.p(file, ProtectedSandApp.s("㿴"));
        l0.p(fileWalkDirection, ProtectedSandApp.s("㿵"));
    }

    public /* synthetic */ FileTreeWalk(File file, FileWalkDirection fileWalkDirection, int i5, w wVar) {
        this(file, (i5 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection);
    }
}

package kotlin.io.path;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;

/* compiled from: PathRecursiveFunctions.kt */
@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0082\b¢\u0006\u0002\b\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b\n\u001a\u001d\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b\r\u001a&\u0010\u000e\u001a\u0004\u0018\u0001H\u000f\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0005H\u0082\b¢\u0006\u0004\b\u0010\u0010\u0011\u001aw\u0010\u0012\u001a\u00020\t*\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2Q\b\u0002\u0010\u0014\u001aK\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0013\u0012\u0017\u0012\u00150\u0019j\u0002`\u001a¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007\u001a´\u0001\u0010\u0012\u001a\u00020\t*\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2Q\b\u0002\u0010\u0014\u001aK\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0013\u0012\u0017\u0012\u00150\u0019j\u0002`\u001a¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u00152\u0006\u0010\u001d\u001a\u00020\u001e2C\b\u0002\u0010 \u001a=\u0012\u0004\u0012\u00020!\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\"0\u0015¢\u0006\u0002\b#H\u0007\u001a\f\u0010$\u001a\u00020\u0001*\u00020\tH\u0007\u001a\u001b\u0010%\u001a\f\u0012\b\u0012\u00060\u0019j\u0002`\u001a0&*\u00020\tH\u0002¢\u0006\u0002\b'\u001a'\u0010(\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\t0)2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b*\u001a'\u0010+\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\t0)2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b,\u001a5\u0010-\u001a\u00020\u001e*\b\u0012\u0004\u0012\u00020\t0)2\u0006\u0010.\u001a\u00020\t2\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020100\"\u000201H\u0002¢\u0006\u0004\b2\u00103\u001a\u0011\u00104\u001a\u000205*\u00020\"H\u0003¢\u0006\u0002\b6\u001a\u0011\u00104\u001a\u000205*\u00020\u001cH\u0003¢\u0006\u0002\b6¨\u00067"}, d2 = {"collectIfThrows", "", "collector", "Lkotlin/io/path/ExceptionsCollector;", "function", "Lkotlin/Function0;", "collectIfThrows$PathsKt__PathRecursiveFunctionsKt", "insecureEnterDirectory", "path", "Ljava/nio/file/Path;", "insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt", "insecureHandleEntry", "entry", "insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt", "tryIgnoreNoSuchFileException", "R", "tryIgnoreNoSuchFileException$PathsKt__PathRecursiveFunctionsKt", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "copyToRecursively", "target", "onError", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "source", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "Lkotlin/io/path/OnErrorResult;", "followLinks", "", "overwrite", "copyAction", "Lkotlin/io/path/CopyActionContext;", "Lkotlin/io/path/CopyActionResult;", "Lkotlin/ExtensionFunctionType;", "deleteRecursively", "deleteRecursivelyImpl", "", "deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt", "enterDirectory", "Ljava/nio/file/SecureDirectoryStream;", "enterDirectory$PathsKt__PathRecursiveFunctionsKt", "handleEntry", "handleEntry$PathsKt__PathRecursiveFunctionsKt", "isDirectory", "entryName", "options", "", "Ljava/nio/file/LinkOption;", "isDirectory$PathsKt__PathRecursiveFunctionsKt", "(Ljava/nio/file/SecureDirectoryStream;Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z", "toFileVisitResult", "Ljava/nio/file/FileVisitResult;", "toFileVisitResult$PathsKt__PathRecursiveFunctionsKt", "kotlin-stdlib-jdk7"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
@SourceDebugExtension({"SMAP\nPathRecursiveFunctions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,430:1\n346#1,2:434\n354#1:436\n354#1:437\n348#1,4:438\n346#1,2:442\n354#1:444\n348#1,4:445\n354#1:449\n346#1,6:450\n346#1,2:456\n354#1:458\n348#1,4:459\n1#2:431\n1855#3,2:432\n*S KotlinDebug\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n*L\n362#1:434,2\n371#1:436\n374#1:437\n362#1:438,4\n382#1:442,2\n383#1:444\n382#1:445,4\n394#1:449\n402#1:450,6\n420#1:456,2\n421#1:458\n420#1:459,4\n284#1:432,2\n*E\n"})
/* loaded from: classes5.dex */
class m1 extends u0 {

    /* compiled from: PathRecursiveFunctions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23459a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f23460b;

        static {
            int[] iArr = new int[CopyActionResult.values().length];
            try {
                iArr[CopyActionResult.CONTINUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CopyActionResult.TERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CopyActionResult.SKIP_SUBTREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23459a = iArr;
            int[] iArr2 = new int[OnErrorResult.values().length];
            try {
                iArr2[OnErrorResult.TERMINATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OnErrorResult.SKIP_SUBTREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f23460b = iArr2;
        }
    }

    /* compiled from: PathRecursiveFunctions.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/nio/file/Path;", "<anonymous parameter 1>", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.q {

        /* renamed from: p, reason: collision with root package name */
        public static final b f23461p = new b();

        b() {
            super(3);
        }

        @Override // q3.q
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void G(@d5.d Path path, @d5.d Path path2, @d5.d Exception exc) {
            kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("练"));
            kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("组"));
            kotlin.jvm.internal.l0.p(exc, ProtectedSandApp.s("绅"));
            throw exc;
        }
    }

    /* compiled from: PathRecursiveFunctions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/io/path/CopyActionResult;", "Lkotlin/io/path/CopyActionContext;", "src", "Ljava/nio/file/Path;", "dst", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.q<CopyActionContext, Path, Path, CopyActionResult> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f23462p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z5) {
            super(3);
            this.f23462p = z5;
        }

        @Override // q3.q
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CopyActionResult G(@d5.d CopyActionContext copyActionContext, @d5.d Path path, @d5.d Path path2) {
            LinkOption linkOption;
            boolean isDirectory;
            boolean isDirectory2;
            StandardCopyOption standardCopyOption;
            Path copy;
            kotlin.jvm.internal.l0.p(copyActionContext, ProtectedSandApp.s("细"));
            kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("织"));
            kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("终"));
            LinkOption[] a6 = LinkFollowing.f23494a.a(this.f23462p);
            linkOption = LinkOption.NOFOLLOW_LINKS;
            isDirectory = Files.isDirectory(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[]{linkOption}, 1));
            LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(a6, a6.length);
            isDirectory2 = Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
            if (!isDirectory2 || !isDirectory) {
                if (isDirectory) {
                    m1.R(path2);
                }
                kotlin.jvm.internal.s1 s1Var = new kotlin.jvm.internal.s1(2);
                s1Var.b(a6);
                standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
                s1Var.a(standardCopyOption);
                CopyOption[] copyOptionArr = (CopyOption[]) s1Var.d(new CopyOption[s1Var.c()]);
                copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
                kotlin.jvm.internal.l0.o(copy, ProtectedSandApp.s("绉"));
            }
            return CopyActionResult.CONTINUE;
        }
    }

    /* compiled from: PathRecursiveFunctions.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/nio/file/Path;", "<anonymous parameter 1>", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class d extends Lambda implements q3.q {

        /* renamed from: p, reason: collision with root package name */
        public static final d f23463p = new d();

        d() {
            super(3);
        }

        @Override // q3.q
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void G(@d5.d Path path, @d5.d Path path2, @d5.d Exception exc) {
            kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("绊"));
            kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("绋"));
            kotlin.jvm.internal.l0.p(exc, ProtectedSandApp.s("绌"));
            throw exc;
        }
    }

    /* compiled from: PathRecursiveFunctions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/io/path/CopyActionResult;", "Lkotlin/io/path/CopyActionContext;", "src", "Ljava/nio/file/Path;", "dst", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class e extends Lambda implements q3.q<CopyActionContext, Path, Path, CopyActionResult> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f23464p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z5) {
            super(3);
            this.f23464p = z5;
        }

        @Override // q3.q
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CopyActionResult G(@d5.d CopyActionContext copyActionContext, @d5.d Path path, @d5.d Path path2) {
            kotlin.jvm.internal.l0.p(copyActionContext, ProtectedSandApp.s("绍"));
            kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("绎"));
            kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("经"));
            return copyActionContext.a(path, path2, this.f23464p);
        }
    }

    /* compiled from: PathRecursiveFunctions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lkotlin/io/path/FileVisitorBuilder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class f extends Lambda implements q3.l<FileVisitorBuilder, kotlin.m2> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.q<CopyActionContext, Path, Path, CopyActionResult> f23465p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Path f23466q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Path f23467r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ q3.q<Path, Path, Exception, OnErrorResult> f23468s;

        /* compiled from: PathRecursiveFunctions.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class a extends kotlin.jvm.internal.h0 implements q3.p<Path, BasicFileAttributes, FileVisitResult> {
            final /* synthetic */ q3.q<Path, Path, Exception, OnErrorResult> A;

            /* renamed from: x, reason: collision with root package name */
            final /* synthetic */ q3.q<CopyActionContext, Path, Path, CopyActionResult> f23469x;

            /* renamed from: y, reason: collision with root package name */
            final /* synthetic */ Path f23470y;

            /* renamed from: z, reason: collision with root package name */
            final /* synthetic */ Path f23471z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(q3.q<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> qVar, Path path, Path path2, q3.q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar2) {
                super(2, l0.a.class, ProtectedSandApp.s("绔"), ProtectedSandApp.s("绕"), 0);
                this.f23469x = qVar;
                this.f23470y = path;
                this.f23471z = path2;
                this.A = qVar2;
            }

            @Override // q3.p
            @d5.d
            /* renamed from: A0, reason: merged with bridge method [inline-methods] */
            public final FileVisitResult g0(@d5.d Path path, @d5.d BasicFileAttributes basicFileAttributes) {
                kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("绖"));
                kotlin.jvm.internal.l0.p(basicFileAttributes, ProtectedSandApp.s("绗"));
                return m1.M(this.f23469x, this.f23470y, this.f23471z, this.A, path, basicFileAttributes);
            }
        }

        /* compiled from: PathRecursiveFunctions.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class b extends kotlin.jvm.internal.h0 implements q3.p<Path, BasicFileAttributes, FileVisitResult> {
            final /* synthetic */ q3.q<Path, Path, Exception, OnErrorResult> A;

            /* renamed from: x, reason: collision with root package name */
            final /* synthetic */ q3.q<CopyActionContext, Path, Path, CopyActionResult> f23472x;

            /* renamed from: y, reason: collision with root package name */
            final /* synthetic */ Path f23473y;

            /* renamed from: z, reason: collision with root package name */
            final /* synthetic */ Path f23474z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(q3.q<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> qVar, Path path, Path path2, q3.q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar2) {
                super(2, l0.a.class, ProtectedSandApp.s("绘"), ProtectedSandApp.s("给"), 0);
                this.f23472x = qVar;
                this.f23473y = path;
                this.f23474z = path2;
                this.A = qVar2;
            }

            @Override // q3.p
            @d5.d
            /* renamed from: A0, reason: merged with bridge method [inline-methods] */
            public final FileVisitResult g0(@d5.d Path path, @d5.d BasicFileAttributes basicFileAttributes) {
                kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("绚"));
                kotlin.jvm.internal.l0.p(basicFileAttributes, ProtectedSandApp.s("绛"));
                return m1.M(this.f23472x, this.f23473y, this.f23474z, this.A, path, basicFileAttributes);
            }
        }

        /* compiled from: PathRecursiveFunctions.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class c extends kotlin.jvm.internal.h0 implements q3.p<Path, Exception, FileVisitResult> {

            /* renamed from: x, reason: collision with root package name */
            final /* synthetic */ q3.q<Path, Path, Exception, OnErrorResult> f23475x;

            /* renamed from: y, reason: collision with root package name */
            final /* synthetic */ Path f23476y;

            /* renamed from: z, reason: collision with root package name */
            final /* synthetic */ Path f23477z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(q3.q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar, Path path, Path path2) {
                super(2, l0.a.class, ProtectedSandApp.s("络"), ProtectedSandApp.s("绝"), 0);
                this.f23475x = qVar;
                this.f23476y = path;
                this.f23477z = path2;
            }

            @Override // q3.p
            @d5.d
            /* renamed from: A0, reason: merged with bridge method [inline-methods] */
            public final FileVisitResult g0(@d5.d Path path, @d5.d Exception exc) {
                kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("绞"));
                kotlin.jvm.internal.l0.p(exc, ProtectedSandApp.s("统"));
                return m1.Q(this.f23475x, this.f23476y, this.f23477z, path, exc);
            }
        }

        /* compiled from: PathRecursiveFunctions.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Ljava/nio/file/FileVisitResult;", "directory", "Ljava/nio/file/Path;", "exception", "Ljava/io/IOException;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        static final class d extends Lambda implements q3.p<Path, IOException, FileVisitResult> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ q3.q<Path, Path, Exception, OnErrorResult> f23478p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ Path f23479q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ Path f23480r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            d(q3.q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar, Path path, Path path2) {
                super(2);
                this.f23478p = qVar;
                this.f23479q = path;
                this.f23480r = path2;
            }

            @Override // q3.p
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FileVisitResult g0(@d5.d Path path, @d5.e IOException iOException) {
                FileVisitResult fileVisitResult;
                kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("绠"));
                if (iOException != null) {
                    return m1.Q(this.f23478p, this.f23479q, this.f23480r, path, iOException);
                }
                fileVisitResult = FileVisitResult.CONTINUE;
                return fileVisitResult;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(q3.q<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> qVar, Path path, Path path2, q3.q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar2) {
            super(1);
            this.f23465p = qVar;
            this.f23466q = path;
            this.f23467r = path2;
            this.f23468s = qVar2;
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ kotlin.m2 N(FileVisitorBuilder fileVisitorBuilder) {
            a(fileVisitorBuilder);
            return kotlin.m2.f23662a;
        }

        public final void a(@d5.d FileVisitorBuilder fileVisitorBuilder) {
            kotlin.jvm.internal.l0.p(fileVisitorBuilder, ProtectedSandApp.s("绡"));
            fileVisitorBuilder.d(new a(this.f23465p, this.f23466q, this.f23467r, this.f23468s));
            fileVisitorBuilder.b(new b(this.f23465p, this.f23466q, this.f23467r, this.f23468s));
            fileVisitorBuilder.a(new c(this.f23468s, this.f23466q, this.f23467r));
            fileVisitorBuilder.c(new d(this.f23468s, this.f23466q, this.f23467r));
        }
    }

    private static final void J(ExceptionsCollector exceptionsCollector, q3.a<kotlin.m2> aVar) {
        try {
            aVar.n();
        } catch (Exception e6) {
            exceptionsCollector.a(e6);
        }
    }

    @SinceKotlin(version = "1.8")
    @d5.d
    @ExperimentalPathApi
    public static final Path K(@d5.d Path path, @d5.d Path path2, @d5.d q3.q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar, boolean z5, @d5.d q3.q<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> qVar2) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䃋"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("䃌"));
        kotlin.jvm.internal.l0.p(qVar, ProtectedSandApp.s("䃍"));
        kotlin.jvm.internal.l0.p(qVar2, ProtectedSandApp.s("䃎"));
        LinkOption[] a6 = LinkFollowing.f23494a.a(z5);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(a6, a6.length);
        if (!Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            throw new NoSuchFileException(path.toString(), path2.toString(), ProtectedSandApp.s("䃐"));
        }
        boolean z6 = false;
        if (Files.exists(path, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && (z5 || !Files.isSymbolicLink(path))) {
            boolean z7 = Files.exists(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && !Files.isSymbolicLink(path2);
            if (!z7 || !Files.isSameFile(path, path2)) {
                if (kotlin.jvm.internal.l0.g(path.getFileSystem(), path2.getFileSystem())) {
                    if (z7) {
                        z6 = path2.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]));
                    } else {
                        Path parent = path2.getParent();
                        if (parent != null && Files.exists(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && parent.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]))) {
                            z6 = true;
                        }
                    }
                }
                if (z6) {
                    throw new FileSystemException(path.toString(), path2.toString(), ProtectedSandApp.s("䃏"));
                }
            }
        }
        v2.C1(path, 0, z5, new f(qVar2, path, path2, qVar), 1, null);
        return path2;
    }

    @SinceKotlin(version = "1.8")
    @d5.d
    @ExperimentalPathApi
    public static final Path L(@d5.d Path path, @d5.d Path path2, @d5.d q3.q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar, boolean z5, boolean z6) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䃑"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("䃒"));
        kotlin.jvm.internal.l0.p(qVar, ProtectedSandApp.s("䃓"));
        return z6 ? K(path, path2, qVar, z5, new c(z5)) : N(path, path2, qVar, z5, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult M(q3.q<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> qVar, Path path, Path path2, q3.q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar2, Path path3, BasicFileAttributes basicFileAttributes) {
        try {
            return Y(qVar.G(DefaultCopyActionContext.f23437a, path3, P(path, path2, path3)));
        } catch (Exception e6) {
            return Q(qVar2, path, path2, path3, e6);
        }
    }

    public static /* synthetic */ Path N(Path path, Path path2, q3.q qVar, boolean z5, q3.q qVar2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            qVar = d.f23463p;
        }
        if ((i5 & 8) != 0) {
            qVar2 = new e(z5);
        }
        return K(path, path2, qVar, z5, qVar2);
    }

    public static /* synthetic */ Path O(Path path, Path path2, q3.q qVar, boolean z5, boolean z6, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            qVar = b.f23461p;
        }
        return L(path, path2, qVar, z5, z6);
    }

    private static final Path P(Path path, Path path2, Path path3) {
        Path resolve;
        resolve = path2.resolve(v2.q1(path3, path).toString());
        kotlin.jvm.internal.l0.o(resolve, ProtectedSandApp.s("䃔"));
        return resolve;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult Q(q3.q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar, Path path, Path path2, Path path3, Exception exc) {
        return Z(qVar.G(path3, P(path, path2, path3), exc));
    }

    @SinceKotlin(version = "1.8")
    @ExperimentalPathApi
    public static final void R(@d5.d Path path) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䃕"));
        List<Exception> S = S(path);
        if (!S.isEmpty()) {
            FileSystemException fileSystemException = new FileSystemException(ProtectedSandApp.s("䃖"));
            Iterator<T> it = S.iterator();
            while (it.hasNext()) {
                kotlin.p.a(fileSystemException, (Exception) it.next());
            }
            throw fileSystemException;
        }
    }

    private static final List<Exception> S(Path path) {
        Path parent;
        DirectoryStream directoryStream;
        Path fileName;
        boolean z5 = false;
        boolean z6 = true;
        ExceptionsCollector exceptionsCollector = new ExceptionsCollector(0, 1, null);
        parent = path.getParent();
        if (parent != null) {
            try {
                directoryStream = Files.newDirectoryStream(parent);
            } catch (Throwable unused) {
                directoryStream = null;
            }
            if (directoryStream != null) {
                try {
                    if (directoryStream instanceof SecureDirectoryStream) {
                        exceptionsCollector.g(parent);
                        fileName = path.getFileName();
                        kotlin.jvm.internal.l0.o(fileName, ProtectedSandApp.s("䃗"));
                        U((SecureDirectoryStream) directoryStream, fileName, exceptionsCollector);
                    } else {
                        z5 = true;
                    }
                    kotlin.m2 m2Var = kotlin.m2.f23662a;
                    kotlin.io.b.a(directoryStream, null);
                    z6 = z5;
                } finally {
                }
            }
        }
        if (z6) {
            W(path, exceptionsCollector);
        }
        return exceptionsCollector.d();
    }

    private static final void T(SecureDirectoryStream<Path> secureDirectoryStream, Path path, ExceptionsCollector exceptionsCollector) {
        SecureDirectoryStream<Path> secureDirectoryStream2;
        try {
            try {
                secureDirectoryStream2 = secureDirectoryStream.newDirectoryStream(path, LinkOption.NOFOLLOW_LINKS);
            } catch (Exception e6) {
                exceptionsCollector.a(e6);
                return;
            }
        } catch (NoSuchFileException unused) {
            secureDirectoryStream2 = null;
        }
        if (secureDirectoryStream2 == null) {
            return;
        }
        try {
            Iterator<Path> it = secureDirectoryStream2.iterator();
            while (it.hasNext()) {
                Path fileName = it.next().getFileName();
                kotlin.jvm.internal.l0.o(fileName, ProtectedSandApp.s("䃘"));
                U(secureDirectoryStream2, fileName, exceptionsCollector);
            }
            kotlin.m2 m2Var = kotlin.m2.f23662a;
            kotlin.io.b.a(secureDirectoryStream2, null);
        } finally {
        }
    }

    private static final void U(SecureDirectoryStream<Path> secureDirectoryStream, Path path, ExceptionsCollector exceptionsCollector) {
        exceptionsCollector.b(path);
        try {
        } catch (Exception e6) {
            exceptionsCollector.a(e6);
        }
        if (X(secureDirectoryStream, path, LinkOption.NOFOLLOW_LINKS)) {
            int f23482b = exceptionsCollector.getF23482b();
            T(secureDirectoryStream, path, exceptionsCollector);
            if (f23482b == exceptionsCollector.getF23482b()) {
                secureDirectoryStream.deleteDirectory(path);
                kotlin.m2 m2Var = kotlin.m2.f23662a;
            }
            exceptionsCollector.c(path);
        }
        secureDirectoryStream.deleteFile(path);
        kotlin.m2 m2Var2 = kotlin.m2.f23662a;
        exceptionsCollector.c(path);
    }

    private static final void V(Path path, ExceptionsCollector exceptionsCollector) {
        DirectoryStream<Path> directoryStream;
        try {
            try {
                directoryStream = Files.newDirectoryStream(path);
            } catch (Exception e6) {
                exceptionsCollector.a(e6);
                return;
            }
        } catch (NoSuchFileException unused) {
            directoryStream = null;
        }
        if (directoryStream == null) {
            return;
        }
        try {
            for (Path path2 : directoryStream) {
                kotlin.jvm.internal.l0.m(path2);
                W(path2, exceptionsCollector);
            }
            kotlin.m2 m2Var = kotlin.m2.f23662a;
            kotlin.io.b.a(directoryStream, null);
        } finally {
        }
    }

    private static final void W(Path path, ExceptionsCollector exceptionsCollector) {
        LinkOption linkOption;
        boolean isDirectory;
        try {
            linkOption = LinkOption.NOFOLLOW_LINKS;
            isDirectory = Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{linkOption}, 1));
            if (isDirectory) {
                int f23482b = exceptionsCollector.getF23482b();
                V(path, exceptionsCollector);
                if (f23482b == exceptionsCollector.getF23482b()) {
                    Files.deleteIfExists(path);
                }
            } else {
                Files.deleteIfExists(path);
            }
        } catch (Exception e6) {
            exceptionsCollector.a(e6);
        }
    }

    private static final boolean X(SecureDirectoryStream<Path> secureDirectoryStream, Path path, LinkOption... linkOptionArr) {
        Boolean bool;
        try {
            bool = Boolean.valueOf(((BasicFileAttributeView) secureDirectoryStream.getFileAttributeView(path, BasicFileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))).readAttributes().isDirectory());
        } catch (NoSuchFileException unused) {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @ExperimentalPathApi
    private static final FileVisitResult Y(CopyActionResult copyActionResult) {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        FileVisitResult fileVisitResult3;
        int i5 = a.f23459a[copyActionResult.ordinal()];
        if (i5 == 1) {
            fileVisitResult = FileVisitResult.CONTINUE;
            return fileVisitResult;
        }
        if (i5 == 2) {
            fileVisitResult2 = FileVisitResult.TERMINATE;
            return fileVisitResult2;
        }
        if (i5 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        fileVisitResult3 = FileVisitResult.SKIP_SUBTREE;
        return fileVisitResult3;
    }

    @ExperimentalPathApi
    private static final FileVisitResult Z(OnErrorResult onErrorResult) {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        int i5 = a.f23460b[onErrorResult.ordinal()];
        if (i5 == 1) {
            fileVisitResult = FileVisitResult.TERMINATE;
            return fileVisitResult;
        }
        if (i5 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        fileVisitResult2 = FileVisitResult.SKIP_SUBTREE;
        return fileVisitResult2;
    }

    private static final <R> R a0(q3.a<? extends R> aVar) {
        try {
            return aVar.n();
        } catch (NoSuchFileException unused) {
            return null;
        }
    }
}

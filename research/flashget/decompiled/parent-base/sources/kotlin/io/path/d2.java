package kotlin.io.path;

import com.flashget.parentalcontrol.ProtectedSandApp;
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
import kotlin.jvm.internal.l0;

/* compiled from: PathRecursiveFunctions.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\u001a~\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002Q\b\u0002\u0010\n\u001aK\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0001\u0012\u0017\u0012\u00150\u0006j\u0002`\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a»\u0001\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002Q\b\u0002\u0010\n\u001aK\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0001\u0012\u0017\u0012\u00150\u0006j\u0002`\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\f\u001a\u00020\u000b2C\b\u0002\u0010\u0013\u001a=\u0012\u0004\u0012\u00020\u0010\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\u00110\u0002¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0011H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u0019\u001a\u00020\u0016*\u00020\tH\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u0000H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001d\u0010\u001f\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u001e*\u00020\u0000H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a&\u0010%\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001b0#H\u0082\b¢\u0006\u0004\b%\u0010&\u001a&\u0010'\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0082\b¢\u0006\u0004\b'\u0010(\u001a)\u0010*\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00000)2\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b*\u0010+\u001a)\u0010,\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00000)2\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b,\u0010+\u001a5\u00101\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00000)2\u0006\u0010-\u001a\u00020\u00002\u0012\u00100\u001a\n\u0012\u0006\b\u0001\u0012\u00020/0.\"\u00020/H\u0002¢\u0006\u0004\b1\u00102\u001a\u001f\u00104\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b4\u00105\u001a\u001f\u00107\u001a\u00020\u001b2\u0006\u00106\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b7\u00105¨\u00068"}, d2 = {"Ljava/nio/file/Path;", "target", "Lkotlin/Function3;", "Lkotlin/r0;", "name", "source", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "Lkotlin/io/path/a0;", "onError", "", "followLinks", "overwrite", "L", "(Ljava/nio/file/Path;Ljava/nio/file/Path;Lld/q;ZZ)Ljava/nio/file/Path;", "Lkotlin/io/path/a;", "Lkotlin/io/path/b;", "Lkotlin/u;", "copyAction", "K", "(Ljava/nio/file/Path;Ljava/nio/file/Path;Lld/q;ZLld/q;)Ljava/nio/file/Path;", "Ljava/nio/file/FileVisitResult;", "Y", "(Lkotlin/io/path/b;)Ljava/nio/file/FileVisitResult;", "Z", "(Lkotlin/io/path/a0;)Ljava/nio/file/FileVisitResult;", "Lkotlin/k2;", "R", "(Ljava/nio/file/Path;)V", "", "S", "(Ljava/nio/file/Path;)Ljava/util/List;", "Lkotlin/io/path/s;", "collector", "Lkotlin/Function0;", "function", "J", "(Lkotlin/io/path/s;Lld/a;)V", "a0", "(Lld/a;)Ljava/lang/Object;", "Ljava/nio/file/SecureDirectoryStream;", "U", "(Ljava/nio/file/SecureDirectoryStream;Ljava/nio/file/Path;Lkotlin/io/path/s;)V", "T", "entryName", "", "Ljava/nio/file/LinkOption;", "options", "X", "(Ljava/nio/file/SecureDirectoryStream;Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z", "entry", "W", "(Ljava/nio/file/Path;Lkotlin/io/path/s;)V", "path", "V", "kotlin-stdlib-jdk7"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
@kotlin.jvm.internal.r1({"SMAP\nPathRecursiveFunctions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,430:1\n346#1,2:434\n354#1:436\n354#1:437\n348#1,4:438\n346#1,2:442\n354#1:444\n348#1,4:445\n354#1:449\n346#1,6:450\n346#1,2:456\n354#1:458\n348#1,4:459\n1#2:431\n1855#3,2:432\n*S KotlinDebug\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n*L\n362#1:434,2\n371#1:436\n374#1:437\n362#1:438,4\n382#1:442,2\n383#1:444\n382#1:445,4\n394#1:449\n402#1:450,6\n420#1:456,2\n421#1:458\n420#1:459,4\n284#1:432,2\n*E\n"})
/* loaded from: classes7.dex */
class d2 extends d1 {

    /* compiled from: PathRecursiveFunctions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75197a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f75198b;

        static {
            int[] iArr = new int[kotlin.io.path.b.values().length];
            try {
                iArr[kotlin.io.path.b.CONTINUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.io.path.b.TERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.io.path.b.SKIP_SUBTREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f75197a = iArr;
            int[] iArr2 = new int[a0.values().length];
            try {
                iArr2[a0.TERMINATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[a0.SKIP_SUBTREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f75198b = iArr2;
        }
    }

    /* compiled from: PathRecursiveFunctions.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljava/nio/file/Path;", "<anonymous parameter 0>", "<anonymous parameter 1>", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "a", "(Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.q {

        /* renamed from: b, reason: collision with root package name */
        public static final b f75199b = new b(3);

        b() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Object R(Object obj, Object obj2, Object obj3) {
            return a(h.a(obj), h.a(obj2), (Exception) obj3);
        }

        @fg.l
        public final Void a(@fg.l Path path, @fg.l Path path2, @fg.l Exception exc) {
            kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摅\u0001"));
            kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("摆\u0001"));
            kotlin.jvm.internal.l0.p(exc, ProtectedSandApp.s("摇\u0001"));
            throw exc;
        }
    }

    /* compiled from: PathRecursiveFunctions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/io/path/a;", "Ljava/nio/file/Path;", "src", "dst", "Lkotlin/io/path/b;", "a", "(Lkotlin/io/path/a;Ljava/nio/file/Path;Ljava/nio/file/Path;)Lkotlin/io/path/b;"}, k = 3, mv = {1, 9, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.q<kotlin.io.path.a, Path, Path, kotlin.io.path.b> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f75200b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z4) {
            super(3);
            this.f75200b = z4;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.io.path.b R(kotlin.io.path.a aVar, Path path, Path path2) {
            return a(aVar, h.a(path), h.a(path2));
        }

        @fg.l
        public final kotlin.io.path.b a(@fg.l kotlin.io.path.a aVar, @fg.l Path path, @fg.l Path path2) {
            kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("摈\u0001"));
            kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摉\u0001"));
            kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("摊\u0001"));
            LinkOption[] a5 = z.f75259a.a(this.f75200b);
            boolean isDirectory = Files.isDirectory(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1));
            LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(a5, a5.length);
            if (!Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length)) || !isDirectory) {
                if (isDirectory) {
                    d2.R(path2);
                }
                kotlin.jvm.internal.s1 s1Var = new kotlin.jvm.internal.s1(2);
                s1Var.b(a5);
                s1Var.a(StandardCopyOption.REPLACE_EXISTING);
                CopyOption[] copyOptionArr = (CopyOption[]) s1Var.d(new CopyOption[s1Var.c()]);
                kotlin.jvm.internal.l0.o(Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), ProtectedSandApp.s("摋\u0001"));
            }
            return kotlin.io.path.b.CONTINUE;
        }
    }

    /* compiled from: PathRecursiveFunctions.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljava/nio/file/Path;", "<anonymous parameter 0>", "<anonymous parameter 1>", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "a", "(Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.q {

        /* renamed from: b, reason: collision with root package name */
        public static final d f75201b = new d(3);

        d() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Object R(Object obj, Object obj2, Object obj3) {
            return a(h.a(obj), h.a(obj2), (Exception) obj3);
        }

        @fg.l
        public final Void a(@fg.l Path path, @fg.l Path path2, @fg.l Exception exc) {
            kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摌\u0001"));
            kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("摍\u0001"));
            kotlin.jvm.internal.l0.p(exc, ProtectedSandApp.s("摎\u0001"));
            throw exc;
        }
    }

    /* compiled from: PathRecursiveFunctions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/io/path/a;", "Ljava/nio/file/Path;", "src", "dst", "Lkotlin/io/path/b;", "a", "(Lkotlin/io/path/a;Ljava/nio/file/Path;Ljava/nio/file/Path;)Lkotlin/io/path/b;"}, k = 3, mv = {1, 9, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.q<kotlin.io.path.a, Path, Path, kotlin.io.path.b> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f75202b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z4) {
            super(3);
            this.f75202b = z4;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.io.path.b R(kotlin.io.path.a aVar, Path path, Path path2) {
            return a(aVar, h.a(path), h.a(path2));
        }

        @fg.l
        public final kotlin.io.path.b a(@fg.l kotlin.io.path.a aVar, @fg.l Path path, @fg.l Path path2) {
            kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("摏\u0001"));
            kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摐\u0001"));
            kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("摑\u0001"));
            return aVar.a(path, path2, this.f75202b);
        }
    }

    /* compiled from: PathRecursiveFunctions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/io/path/u;", "Lkotlin/k2;", "a", "(Lkotlin/io/path/u;)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<u, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.q<kotlin.io.path.a, Path, Path, kotlin.io.path.b> f75203b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Path f75204c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Path f75205d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<Path, Path, Exception, a0> f75206e;

        /* compiled from: PathRecursiveFunctions.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class a extends kotlin.jvm.internal.h0 implements ld.p<Path, BasicFileAttributes, FileVisitResult> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.q<kotlin.io.path.a, Path, Path, kotlin.io.path.b> f75207d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Path f75208e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Path f75209f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ ld.q<Path, Path, Exception, a0> f75210g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ld.q<? super kotlin.io.path.a, ? super Path, ? super Path, ? extends kotlin.io.path.b> qVar, Path path, Path path2, ld.q<? super Path, ? super Path, ? super Exception, ? extends a0> qVar2) {
                super(2, l0.a.class, ProtectedSandApp.s("摗\u0001"), ProtectedSandApp.s("摖\u0001"), 0);
                this.f75207d = qVar;
                this.f75208e = path;
                this.f75209f = path2;
                this.f75210g = qVar2;
            }

            @fg.l
            public final FileVisitResult Z(@fg.l Path path, @fg.l BasicFileAttributes basicFileAttributes) {
                kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摘\u0001"));
                kotlin.jvm.internal.l0.p(basicFileAttributes, ProtectedSandApp.s("摙\u0001"));
                return d2.M(this.f75207d, this.f75208e, this.f75209f, this.f75210g, path, basicFileAttributes);
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ FileVisitResult invoke(Path path, BasicFileAttributes basicFileAttributes) {
                return Z(h.a(path), f2.a(basicFileAttributes));
            }
        }

        /* compiled from: PathRecursiveFunctions.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class b extends kotlin.jvm.internal.h0 implements ld.p<Path, BasicFileAttributes, FileVisitResult> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.q<kotlin.io.path.a, Path, Path, kotlin.io.path.b> f75211d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Path f75212e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Path f75213f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ ld.q<Path, Path, Exception, a0> f75214g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(ld.q<? super kotlin.io.path.a, ? super Path, ? super Path, ? extends kotlin.io.path.b> qVar, Path path, Path path2, ld.q<? super Path, ? super Path, ? super Exception, ? extends a0> qVar2) {
                super(2, l0.a.class, ProtectedSandApp.s("摛\u0001"), ProtectedSandApp.s("摚\u0001"), 0);
                this.f75211d = qVar;
                this.f75212e = path;
                this.f75213f = path2;
                this.f75214g = qVar2;
            }

            @fg.l
            public final FileVisitResult Z(@fg.l Path path, @fg.l BasicFileAttributes basicFileAttributes) {
                kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摜\u0001"));
                kotlin.jvm.internal.l0.p(basicFileAttributes, ProtectedSandApp.s("摝\u0001"));
                return d2.M(this.f75211d, this.f75212e, this.f75213f, this.f75214g, path, basicFileAttributes);
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ FileVisitResult invoke(Path path, BasicFileAttributes basicFileAttributes) {
                return Z(h.a(path), f2.a(basicFileAttributes));
            }
        }

        /* compiled from: PathRecursiveFunctions.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class c extends kotlin.jvm.internal.h0 implements ld.p<Path, Exception, FileVisitResult> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.q<Path, Path, Exception, a0> f75215d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Path f75216e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Path f75217f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(ld.q<? super Path, ? super Path, ? super Exception, ? extends a0> qVar, Path path, Path path2) {
                super(2, l0.a.class, ProtectedSandApp.s("摟\u0001"), ProtectedSandApp.s("摞\u0001"), 0);
                this.f75215d = qVar;
                this.f75216e = path;
                this.f75217f = path2;
            }

            @fg.l
            public final FileVisitResult Z(@fg.l Path path, @fg.l Exception exc) {
                kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摠\u0001"));
                kotlin.jvm.internal.l0.p(exc, ProtectedSandApp.s("摡\u0001"));
                return d2.Q(this.f75215d, this.f75216e, this.f75217f, path, exc);
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ FileVisitResult invoke(Path path, Exception exc) {
                return Z(h.a(path), exc);
            }
        }

        /* compiled from: PathRecursiveFunctions.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljava/nio/file/Path;", "directory", "Ljava/io/IOException;", "exception", "Ljava/nio/file/FileVisitResult;", "a", "(Ljava/nio/file/Path;Ljava/io/IOException;)Ljava/nio/file/FileVisitResult;"}, k = 3, mv = {1, 9, 0})
        static final class d extends kotlin.jvm.internal.n0 implements ld.p<Path, IOException, FileVisitResult> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.q<Path, Path, Exception, a0> f75218b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Path f75219c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Path f75220d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            d(ld.q<? super Path, ? super Path, ? super Exception, ? extends a0> qVar, Path path, Path path2) {
                super(2);
                this.f75218b = qVar;
                this.f75219c = path;
                this.f75220d = path2;
            }

            @fg.l
            public final FileVisitResult a(@fg.l Path path, @fg.m IOException iOException) {
                FileVisitResult fileVisitResult;
                kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摢\u0001"));
                if (iOException != null) {
                    return d2.Q(this.f75218b, this.f75219c, this.f75220d, path, iOException);
                }
                fileVisitResult = FileVisitResult.CONTINUE;
                return fileVisitResult;
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ FileVisitResult invoke(Path path, IOException iOException) {
                return a(h.a(path), iOException);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(ld.q<? super kotlin.io.path.a, ? super Path, ? super Path, ? extends kotlin.io.path.b> qVar, Path path, Path path2, ld.q<? super Path, ? super Path, ? super Exception, ? extends a0> qVar2) {
            super(1);
            this.f75203b = qVar;
            this.f75204c = path;
            this.f75205d = path2;
            this.f75206e = qVar2;
        }

        public final void a(@fg.l u uVar) {
            kotlin.jvm.internal.l0.p(uVar, ProtectedSandApp.s("摣\u0001"));
            uVar.b(new a(this.f75203b, this.f75204c, this.f75205d, this.f75206e));
            uVar.a(new b(this.f75203b, this.f75204c, this.f75205d, this.f75206e));
            uVar.d(new c(this.f75206e, this.f75204c, this.f75205d));
            uVar.c(new d(this.f75206e, this.f75204c, this.f75205d));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(u uVar) {
            a(uVar);
            return kotlin.k2.f75408a;
        }
    }

    private static final void J(s sVar, ld.a<kotlin.k2> aVar) {
        try {
            aVar.invoke();
        } catch (Exception e4) {
            sVar.a(e4);
        }
    }

    @fg.l
    @kotlin.c1(version = "1.8")
    @t
    public static final Path K(@fg.l Path path, @fg.l Path path2, @fg.l ld.q<? super Path, ? super Path, ? super Exception, ? extends a0> qVar, boolean z4, @fg.l ld.q<? super kotlin.io.path.a, ? super Path, ? super Path, ? extends kotlin.io.path.b> qVar2) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摤\u0001"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("摥\u0001"));
        kotlin.jvm.internal.l0.p(qVar, ProtectedSandApp.s("摦\u0001"));
        kotlin.jvm.internal.l0.p(qVar2, ProtectedSandApp.s("摧\u0001"));
        LinkOption[] a5 = z.f75259a.a(z4);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(a5, a5.length);
        if (!Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            u1.a();
            throw s1.a(path.toString(), path2.toString(), ProtectedSandApp.s("摩\u0001"));
        }
        boolean z5 = false;
        if (Files.exists(path, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && (z4 || !Files.isSymbolicLink(path))) {
            boolean z6 = Files.exists(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && !Files.isSymbolicLink(path2);
            if (!z6 || !Files.isSameFile(path, path2)) {
                if (kotlin.jvm.internal.l0.g(path.getFileSystem(), path2.getFileSystem())) {
                    if (z6) {
                        z5 = path2.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]));
                    } else {
                        Path parent = path2.getParent();
                        if (parent != null && Files.exists(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && parent.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]))) {
                            z5 = true;
                        }
                    }
                }
                if (z5) {
                    r.a();
                    throw t1.a(path.toString(), path2.toString(), ProtectedSandApp.s("摨\u0001"));
                }
            }
        }
        p3.C1(path, 0, z4, new f(qVar2, path, path2, qVar), 1, null);
        return path2;
    }

    @fg.l
    @kotlin.c1(version = "1.8")
    @t
    public static final Path L(@fg.l Path path, @fg.l Path path2, @fg.l ld.q<? super Path, ? super Path, ? super Exception, ? extends a0> qVar, boolean z4, boolean z5) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摤\u0001"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("摥\u0001"));
        kotlin.jvm.internal.l0.p(qVar, ProtectedSandApp.s("摦\u0001"));
        return z5 ? K(path, path2, qVar, z4, new c(z4)) : N(path, path2, qVar, z4, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult M(ld.q<? super kotlin.io.path.a, ? super Path, ? super Path, ? extends kotlin.io.path.b> qVar, Path path, Path path2, ld.q<? super Path, ? super Path, ? super Exception, ? extends a0> qVar2, Path path3, BasicFileAttributes basicFileAttributes) {
        try {
            return Y(qVar.R(kotlin.io.path.f.f75221a, path3, P(path, path2, path3)));
        } catch (Exception e4) {
            return Q(qVar2, path, path2, path3, e4);
        }
    }

    public static /* synthetic */ Path N(Path path, Path path2, ld.q qVar, boolean z4, ld.q qVar2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            qVar = d.f75201b;
        }
        if ((i4 & 8) != 0) {
            qVar2 = new e(z4);
        }
        return K(path, path2, qVar, z4, qVar2);
    }

    public static /* synthetic */ Path O(Path path, Path path2, ld.q qVar, boolean z4, boolean z5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            qVar = b.f75199b;
        }
        return L(path, path2, qVar, z4, z5);
    }

    private static final Path P(Path path, Path path2, Path path3) {
        Path resolve;
        resolve = path2.resolve(p3.q1(path3, path).toString());
        kotlin.jvm.internal.l0.o(resolve, ProtectedSandApp.s("摪\u0001"));
        return resolve;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult Q(ld.q<? super Path, ? super Path, ? super Exception, ? extends a0> qVar, Path path, Path path2, Path path3, Exception exc) {
        return Z(qVar.R(path3, P(path, path2, path3), exc));
    }

    @kotlin.c1(version = "1.8")
    @t
    public static final void R(@fg.l Path path) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摤\u0001"));
        List<Exception> S = S(path);
        if (S.isEmpty()) {
            return;
        }
        FileSystemException a5 = q.a(ProtectedSandApp.s("摫\u0001"));
        Iterator<T> it = S.iterator();
        while (it.hasNext()) {
            kotlin.o.a(a5, (Exception) it.next());
        }
        throw a5;
    }

    private static final List<Exception> S(Path path) {
        Path parent;
        DirectoryStream directoryStream;
        Path fileName;
        boolean z4 = false;
        boolean z5 = true;
        s sVar = new s(0, 1, null);
        parent = path.getParent();
        if (parent != null) {
            try {
                directoryStream = Files.newDirectoryStream(parent);
            } catch (Throwable unused) {
                directoryStream = null;
            }
            if (directoryStream != null) {
                try {
                    DirectoryStream a5 = v1.a(directoryStream);
                    if (w1.a(a5)) {
                        sVar.g(parent);
                        SecureDirectoryStream a6 = x1.a(a5);
                        fileName = path.getFileName();
                        kotlin.jvm.internal.l0.o(fileName, ProtectedSandApp.s("摬\u0001"));
                        U(a6, fileName, sVar);
                    } else {
                        z4 = true;
                    }
                    kotlin.k2 k2Var = kotlin.k2.f75408a;
                    kotlin.io.b.a(directoryStream, null);
                    z5 = z4;
                } finally {
                }
            }
        }
        if (z5) {
            W(path, sVar);
        }
        return sVar.d();
    }

    private static final void T(SecureDirectoryStream<Path> secureDirectoryStream, Path path, s sVar) {
        SecureDirectoryStream<Path> secureDirectoryStream2;
        try {
            try {
                secureDirectoryStream2 = secureDirectoryStream.newDirectoryStream(path, LinkOption.NOFOLLOW_LINKS);
            } catch (Exception e4) {
                sVar.a(e4);
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
                kotlin.jvm.internal.l0.o(fileName, ProtectedSandApp.s("摬\u0001"));
                U(secureDirectoryStream2, fileName, sVar);
            }
            kotlin.k2 k2Var = kotlin.k2.f75408a;
            kotlin.io.b.a(secureDirectoryStream2, null);
        } finally {
        }
    }

    private static final void U(SecureDirectoryStream<Path> secureDirectoryStream, Path path, s sVar) {
        sVar.b(path);
        try {
        } catch (Exception e4) {
            sVar.a(e4);
        }
        if (X(secureDirectoryStream, path, LinkOption.NOFOLLOW_LINKS)) {
            int totalExceptions = sVar.getTotalExceptions();
            T(secureDirectoryStream, path, sVar);
            if (totalExceptions == sVar.getTotalExceptions()) {
                secureDirectoryStream.deleteDirectory(path);
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            }
            sVar.c(path);
        }
        secureDirectoryStream.deleteFile(path);
        kotlin.k2 k2Var2 = kotlin.k2.f75408a;
        sVar.c(path);
    }

    private static final void V(Path path, s sVar) {
        DirectoryStream<Path> directoryStream;
        try {
            try {
                directoryStream = Files.newDirectoryStream(path);
            } catch (Exception e4) {
                sVar.a(e4);
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
                W(path2, sVar);
            }
            kotlin.k2 k2Var = kotlin.k2.f75408a;
            kotlin.io.b.a(directoryStream, null);
        } finally {
        }
    }

    private static final void W(Path path, s sVar) {
        try {
            if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
                int totalExceptions = sVar.getTotalExceptions();
                V(path, sVar);
                if (totalExceptions == sVar.getTotalExceptions()) {
                    Files.deleteIfExists(path);
                }
            } else {
                Files.deleteIfExists(path);
            }
        } catch (Exception e4) {
            sVar.a(e4);
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

    @t
    private static final FileVisitResult Y(kotlin.io.path.b bVar) {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        FileVisitResult fileVisitResult3;
        int i4 = a.f75197a[bVar.ordinal()];
        if (i4 == 1) {
            fileVisitResult = FileVisitResult.CONTINUE;
            return fileVisitResult;
        }
        if (i4 == 2) {
            fileVisitResult2 = FileVisitResult.TERMINATE;
            return fileVisitResult2;
        }
        if (i4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        fileVisitResult3 = FileVisitResult.SKIP_SUBTREE;
        return fileVisitResult3;
    }

    @t
    private static final FileVisitResult Z(a0 a0Var) {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        int i4 = a.f75198b[a0Var.ordinal()];
        if (i4 == 1) {
            fileVisitResult = FileVisitResult.TERMINATE;
            return fileVisitResult;
        }
        if (i4 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        fileVisitResult2 = FileVisitResult.SKIP_SUBTREE;
        return fileVisitResult2;
    }

    private static final <R> R a0(ld.a<? extends R> aVar) {
        try {
            return aVar.invoke();
        } catch (NoSuchFileException unused) {
            return null;
        }
    }
}

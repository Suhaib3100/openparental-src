package kotlin.io.path;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PathTreeWalk.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlin/io/path/LinkFollowing;", "", "()V", "followLinkOption", "", "Ljava/nio/file/LinkOption;", "[Ljava/nio/file/LinkOption;", "followVisitOption", "", "Ljava/nio/file/FileVisitOption;", "nofollowLinkOption", "nofollowVisitOption", "toLinkOptions", "followLinks", "", "(Z)[Ljava/nio/file/LinkOption;", "toVisitOptions", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,177:1\n26#2:178\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n*L\n142#1:178\n*E\n"})
/* renamed from: kotlin.io.path.t, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class LinkFollowing {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final LinkFollowing f23494a = new LinkFollowing();

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final LinkOption[] f23495b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final LinkOption[] f23496c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final Set<FileVisitOption> f23497d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private static final Set<FileVisitOption> f23498e;

    static {
        LinkOption linkOption;
        FileVisitOption fileVisitOption;
        Set<FileVisitOption> f6;
        linkOption = LinkOption.NOFOLLOW_LINKS;
        f23495b = new LinkOption[]{linkOption};
        f23496c = new LinkOption[0];
        f23497d = EmptySet.f23181o;
        fileVisitOption = FileVisitOption.FOLLOW_LINKS;
        f6 = kotlin.collections.p1.f(fileVisitOption);
        f23498e = f6;
    }

    private LinkFollowing() {
    }

    @d5.d
    public final LinkOption[] a(boolean z5) {
        return z5 ? f23496c : f23495b;
    }

    @d5.d
    public final Set<FileVisitOption> b(boolean z5) {
        return z5 ? f23498e : f23497d;
    }
}

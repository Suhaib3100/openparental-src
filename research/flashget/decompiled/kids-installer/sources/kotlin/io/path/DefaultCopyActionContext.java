package kotlin.io.path;

import kotlin.Metadata;

/* compiled from: PathRecursiveFunctions.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lkotlin/io/path/DefaultCopyActionContext;", "Lkotlin/io/path/CopyActionContext;", "()V", "copyToIgnoringExistingDirectory", "Lkotlin/io/path/CopyActionResult;", "Ljava/nio/file/Path;", "target", "followLinks", "", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalPathApi
/* renamed from: kotlin.io.path.f, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class DefaultCopyActionContext implements CopyActionContext {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final DefaultCopyActionContext f23437a = new DefaultCopyActionContext();

    private DefaultCopyActionContext() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0040, code lost:
    
        if (r0 == false) goto L6;
     */
    @Override // kotlin.io.path.CopyActionContext
    @d5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kotlin.io.path.CopyActionResult a(@d5.d java.nio.file.Path r5, @d5.d java.nio.file.Path r6, boolean r7) {
        /*
            r4 = this;
            java.lang.String r0 = "䁓"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r5, r0)
            java.lang.String r0 = "䁔"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r6, r0)
            kotlin.io.path.t r0 = kotlin.io.path.LinkFollowing.f23494a
            java.nio.file.LinkOption[] r7 = r0.a(r7)
            int r0 = r7.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r7, r0)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            boolean r0 = kotlin.io.path.c.a(r5, r0)
            if (r0 == 0) goto L42
            r0 = 1
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            r2 = 0
            java.nio.file.LinkOption r3 = kotlin.io.path.d.a()
            r1[r2] = r3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            boolean r0 = kotlin.io.path.c.a(r6, r0)
            if (r0 != 0) goto L5d
        L42:
            int r0 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)
            java.nio.file.CopyOption[] r7 = (java.nio.file.CopyOption[]) r7
            int r0 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)
            java.nio.file.CopyOption[] r7 = (java.nio.file.CopyOption[]) r7
            java.nio.file.Path r5 = kotlin.io.path.e.a(r5, r6, r7)
            java.lang.String r6 = "䁕"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
            kotlin.jvm.internal.l0.o(r5, r6)
        L5d:
            kotlin.io.path.b r5 = kotlin.io.path.CopyActionResult.CONTINUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.DefaultCopyActionContext.a(java.nio.file.Path, java.nio.file.Path, boolean):kotlin.io.path.b");
    }
}

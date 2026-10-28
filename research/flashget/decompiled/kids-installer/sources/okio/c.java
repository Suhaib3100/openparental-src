package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* compiled from: -DeprecatedOkio.kt */
@Deprecated(message = "changed in Okio 2.x")
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J+\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0007J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007J+\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0007¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007J\b\u0010\"\u001a\u00020\u0004H\u0007¨\u0006%"}, d2 = {"Lokio/c;", "", "Ljava/io/File;", "file", "Lokio/m0;", "a", "sink", "Lokio/n;", "c", "Lokio/o0;", "source", "Lokio/o;", "d", "e", "Ljava/io/OutputStream;", "outputStream", "f", "Ljava/nio/file/Path;", "path", "", "Ljava/nio/file/OpenOption;", "options", "h", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/m0;", "Ljava/net/Socket;", "socket", "g", "i", "Ljava/io/InputStream;", "inputStream", "j", "l", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/o0;", "k", "b", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f31603a = new c();

    private c() {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "file.appendingSink()", imports = {"okio.appendingSink"}))
    @d5.d
    public final m0 a(@d5.d File file) {
        kotlin.jvm.internal.l0.p(file, ProtectedSandApp.s("栌"));
        return b0.b(file);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "blackholeSink()", imports = {"okio.blackholeSink"}))
    @d5.d
    public final m0 b() {
        return new l();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "sink.buffer()", imports = {"okio.buffer"}))
    @d5.d
    public final n c(@d5.d m0 sink) {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("栍"));
        return c0.b(sink);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "source.buffer()", imports = {"okio.buffer"}))
    @d5.d
    public final o d(@d5.d o0 source) {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("栎"));
        return c0.c(source);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "file.sink()", imports = {"okio.sink"}))
    @d5.d
    public final m0 e(@d5.d File file) {
        kotlin.jvm.internal.l0.p(file, ProtectedSandApp.s("栏"));
        return b0.j(file, false, 1, null);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "outputStream.sink()", imports = {"okio.sink"}))
    @d5.d
    public final m0 f(@d5.d OutputStream outputStream) {
        kotlin.jvm.internal.l0.p(outputStream, ProtectedSandApp.s("栐"));
        return b0.g(outputStream);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "socket.sink()", imports = {"okio.sink"}))
    @d5.d
    public final m0 g(@d5.d Socket socket) {
        kotlin.jvm.internal.l0.p(socket, ProtectedSandApp.s("树"));
        return b0.h(socket);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "path.sink(*options)", imports = {"okio.sink"}))
    @d5.d
    public final m0 h(@d5.d Path path, @d5.d OpenOption... options) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("栒"));
        kotlin.jvm.internal.l0.p(options, ProtectedSandApp.s("栓"));
        return b0.i(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "file.source()", imports = {"okio.source"}))
    @d5.d
    public final o0 i(@d5.d File file) {
        kotlin.jvm.internal.l0.p(file, ProtectedSandApp.s("栔"));
        return b0.k(file);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "inputStream.source()", imports = {"okio.source"}))
    @d5.d
    public final o0 j(@d5.d InputStream inputStream) {
        kotlin.jvm.internal.l0.p(inputStream, ProtectedSandApp.s("栕"));
        return b0.l(inputStream);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "socket.source()", imports = {"okio.source"}))
    @d5.d
    public final o0 k(@d5.d Socket socket) {
        kotlin.jvm.internal.l0.p(socket, ProtectedSandApp.s("栖"));
        return b0.m(socket);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "path.source(*options)", imports = {"okio.source"}))
    @d5.d
    public final o0 l(@d5.d Path path, @d5.d OpenOption... options) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("栗"));
        kotlin.jvm.internal.l0.p(options, ProtectedSandApp.s("栘"));
        return b0.n(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }
}

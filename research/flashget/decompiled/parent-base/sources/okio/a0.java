package okio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import kotlin.Metadata;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@Metadata(d1 = {"okio/b0", "okio/c0"}, d2 = {}, k = 4, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class a0 {
    @fg.l
    public static final m0 a(@fg.l File file) throws FileNotFoundException {
        return b0.b(file);
    }

    @fg.l
    @kd.i(name = "blackhole")
    public static final m0 b() {
        return new l();
    }

    @fg.l
    public static final n c(@fg.l m0 m0Var) {
        return c0.b(m0Var);
    }

    @fg.l
    public static final o d(@fg.l o0 o0Var) {
        return c0.c(o0Var);
    }

    public static final boolean e(@fg.l AssertionError assertionError) {
        return b0.d(assertionError);
    }

    @fg.l
    @kd.j
    public static final m0 f(@fg.l File file) throws FileNotFoundException {
        return b0.j(file, false, 1, null);
    }

    @fg.l
    @kd.j
    public static final m0 g(@fg.l File file, boolean z4) throws FileNotFoundException {
        return b0.f(file, z4);
    }

    @fg.l
    public static final m0 h(@fg.l OutputStream outputStream) {
        return b0.g(outputStream);
    }

    @fg.l
    public static final m0 i(@fg.l Socket socket) throws IOException {
        return b0.h(socket);
    }

    @fg.l
    @IgnoreJRERequirement
    public static final m0 j(@fg.l Path path, @fg.l OpenOption... openOptionArr) throws IOException {
        return b0.i(path, openOptionArr);
    }

    @fg.l
    public static final o0 l(@fg.l File file) throws FileNotFoundException {
        return b0.k(file);
    }

    @fg.l
    public static final o0 m(@fg.l InputStream inputStream) {
        return b0.l(inputStream);
    }

    @fg.l
    public static final o0 n(@fg.l Socket socket) throws IOException {
        return b0.m(socket);
    }

    @fg.l
    @IgnoreJRERequirement
    public static final o0 o(@fg.l Path path, @fg.l OpenOption... openOptionArr) throws IOException {
        return b0.n(path, openOptionArr);
    }
}

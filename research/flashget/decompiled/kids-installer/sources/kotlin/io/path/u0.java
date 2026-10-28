package kotlin.io.path;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;

/* compiled from: PathReadWrite.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a%\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a%\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u001e\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a:\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010\u0015\u001a:\u0010\u0016\u001a\u00020\u0017*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010\u0018\u001a=\u0010\u0019\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00010\u001bH\u0087\bø\u0001\u0000\u001a&\u0010 \u001a\u00020!*\u00020\u00022\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010\"\u001a&\u0010#\u001a\u00020$*\u00020\u00022\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010%\u001a\r\u0010&\u001a\u00020\u0004*\u00020\u0002H\u0087\b\u001a\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001c0(*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u0016\u0010)\u001a\u00020\u001c*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a0\u0010*\u001a\u00020+*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010,\u001a?\u0010-\u001a\u0002H.\"\u0004\b\u0000\u0010.*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\u0018\u0010/\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u000b\u0012\u0004\u0012\u0002H.0\u001bH\u0087\bø\u0001\u0000¢\u0006\u0002\u00100\u001a.\u00101\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u00102\u001a>\u00103\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u00104\u001a>\u00103\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u00105\u001a7\u00106\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0007¢\u0006\u0002\u00107\u001a0\u00108\u001a\u000209*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010:\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006;"}, d2 = {"appendBytes", "", "Ljava/nio/file/Path;", "array", "", "appendLines", "lines", "", "", "charset", "Ljava/nio/charset/Charset;", "Lkotlin/sequences/Sequence;", "appendText", "text", "bufferedReader", "Ljava/io/BufferedReader;", "bufferSize", "", "options", "", "Ljava/nio/file/OpenOption;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;I[Ljava/nio/file/OpenOption;)Ljava/io/BufferedReader;", "bufferedWriter", "Ljava/io/BufferedWriter;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;I[Ljava/nio/file/OpenOption;)Ljava/io/BufferedWriter;", "forEachLine", "action", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "line", "inputStream", "Ljava/io/InputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;", "outputStream", "Ljava/io/OutputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStream;", "readBytes", "readLines", "", "readText", "reader", "Ljava/io/InputStreamReader;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/InputStreamReader;", "useLines", "T", "block", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writeBytes", "(Ljava/nio/file/Path;[B[Ljava/nio/file/OpenOption;)V", "writeLines", "(Ljava/nio/file/Path;Ljava/lang/Iterable;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;", "(Ljava/nio/file/Path;Lkotlin/sequences/Sequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;", "writeText", "(Ljava/nio/file/Path;Ljava/lang/CharSequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)V", "writer", "Ljava/io/OutputStreamWriter;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStreamWriter;", "kotlin-stdlib-jdk7"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
@SourceDebugExtension({"SMAP\nPathReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,326:1\n1#2:327\n1#2:329\n52#3:328\n1313#4,2:330\n*S KotlinDebug\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n*L\n202#1:329\n202#1:328\n202#1:330,2\n*E\n"})
/* loaded from: classes5.dex */
class u0 {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path A(Path path, Sequence<? extends CharSequence> sequence, Charset charset, OpenOption... openOptionArr) throws IOException {
        Iterable N;
        Path write;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䁣"));
        kotlin.jvm.internal.l0.p(sequence, ProtectedSandApp.s("䁤"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("䁥"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("䁦"));
        N = kotlin.sequences.v.N(sequence);
        write = Files.write(path, N, charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        kotlin.jvm.internal.l0.o(write, ProtectedSandApp.s("䁧"));
        return write;
    }

    static /* synthetic */ Path B(Path path, Iterable iterable, Charset charset, OpenOption[] openOptionArr, int i5, Object obj) throws IOException {
        Path write;
        if ((i5 & 2) != 0) {
            charset = Charsets.f27049b;
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䁨"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("䁩"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("䁪"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("䁫"));
        write = Files.write(path, iterable, charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        kotlin.jvm.internal.l0.o(write, ProtectedSandApp.s("䁬"));
        return write;
    }

    static /* synthetic */ Path C(Path path, Sequence sequence, Charset charset, OpenOption[] openOptionArr, int i5, Object obj) throws IOException {
        Iterable N;
        Path write;
        if ((i5 & 2) != 0) {
            charset = Charsets.f27049b;
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䁭"));
        kotlin.jvm.internal.l0.p(sequence, ProtectedSandApp.s("䁮"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("䁯"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("䁰"));
        N = kotlin.sequences.v.N(sequence);
        write = Files.write(path, N, charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        kotlin.jvm.internal.l0.o(write, ProtectedSandApp.s("䁱"));
        return write;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static final void D(@d5.d Path path, @d5.d CharSequence charSequence, @d5.d Charset charset, @d5.d OpenOption... openOptionArr) throws IOException {
        OutputStream newOutputStream;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䁲"));
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("䁳"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("䁴"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("䁵"));
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        kotlin.jvm.internal.l0.o(newOutputStream, ProtectedSandApp.s("䁶"));
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(newOutputStream, charset);
        try {
            outputStreamWriter.append(charSequence);
            kotlin.io.b.a(outputStreamWriter, null);
        } finally {
        }
    }

    public static /* synthetic */ void E(Path path, CharSequence charSequence, Charset charset, OpenOption[] openOptionArr, int i5, Object obj) throws IOException {
        if ((i5 & 2) != 0) {
            charset = Charsets.f27049b;
        }
        D(path, charSequence, charset, openOptionArr);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final OutputStreamWriter F(Path path, Charset charset, OpenOption... openOptionArr) throws IOException {
        OutputStream newOutputStream;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䁷"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("䁸"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("䁹"));
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        return new OutputStreamWriter(newOutputStream, charset);
    }

    static /* synthetic */ OutputStreamWriter G(Path path, Charset charset, OpenOption[] openOptionArr, int i5, Object obj) throws IOException {
        OutputStream newOutputStream;
        if ((i5 & 1) != 0) {
            charset = Charsets.f27049b;
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䁺"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("䁻"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("䁼"));
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        return new OutputStreamWriter(newOutputStream, charset);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final void a(Path path, byte[] bArr) throws IOException {
        StandardOpenOption standardOpenOption;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䁽"));
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("䁾"));
        standardOpenOption = StandardOpenOption.APPEND;
        Files.write(path, bArr, standardOpenOption);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path b(Path path, Iterable<? extends CharSequence> iterable, Charset charset) throws IOException {
        StandardOpenOption standardOpenOption;
        Path write;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䁿"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("䂀"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("䂁"));
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, iterable, charset, standardOpenOption);
        kotlin.jvm.internal.l0.o(write, ProtectedSandApp.s("䂂"));
        return write;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path c(Path path, Sequence<? extends CharSequence> sequence, Charset charset) throws IOException {
        Iterable N;
        StandardOpenOption standardOpenOption;
        Path write;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䂃"));
        kotlin.jvm.internal.l0.p(sequence, ProtectedSandApp.s("䂄"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("䂅"));
        N = kotlin.sequences.v.N(sequence);
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, N, charset, standardOpenOption);
        kotlin.jvm.internal.l0.o(write, ProtectedSandApp.s("䂆"));
        return write;
    }

    static /* synthetic */ Path d(Path path, Iterable iterable, Charset charset, int i5, Object obj) throws IOException {
        StandardOpenOption standardOpenOption;
        Path write;
        if ((i5 & 2) != 0) {
            charset = Charsets.f27049b;
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䂇"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("䂈"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("䂉"));
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, iterable, charset, standardOpenOption);
        kotlin.jvm.internal.l0.o(write, ProtectedSandApp.s("䂊"));
        return write;
    }

    static /* synthetic */ Path e(Path path, Sequence sequence, Charset charset, int i5, Object obj) throws IOException {
        Iterable N;
        StandardOpenOption standardOpenOption;
        Path write;
        if ((i5 & 2) != 0) {
            charset = Charsets.f27049b;
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䂋"));
        kotlin.jvm.internal.l0.p(sequence, ProtectedSandApp.s("䂌"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("䂍"));
        N = kotlin.sequences.v.N(sequence);
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, N, charset, standardOpenOption);
        kotlin.jvm.internal.l0.o(write, ProtectedSandApp.s("䂎"));
        return write;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static final void f(@d5.d Path path, @d5.d CharSequence charSequence, @d5.d Charset charset) throws IOException {
        StandardOpenOption standardOpenOption;
        OutputStream newOutputStream;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䂏"));
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("䂐"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("䂑"));
        standardOpenOption = StandardOpenOption.APPEND;
        newOutputStream = Files.newOutputStream(path, standardOpenOption);
        kotlin.jvm.internal.l0.o(newOutputStream, ProtectedSandApp.s("䂒"));
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(newOutputStream, charset);
        try {
            outputStreamWriter.append(charSequence);
            kotlin.io.b.a(outputStreamWriter, null);
        } finally {
        }
    }

    public static /* synthetic */ void g(Path path, CharSequence charSequence, Charset charset, int i5, Object obj) throws IOException {
        if ((i5 & 2) != 0) {
            charset = Charsets.f27049b;
        }
        f(path, charSequence, charset);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final BufferedReader h(Path path, Charset charset, int i5, OpenOption... openOptionArr) throws IOException {
        InputStream newInputStream;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䂓"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("䂔"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("䂕"));
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        return new BufferedReader(new InputStreamReader(newInputStream, charset), i5);
    }

    static /* synthetic */ BufferedReader i(Path path, Charset charset, int i5, OpenOption[] openOptionArr, int i6, Object obj) throws IOException {
        InputStream newInputStream;
        if ((i6 & 1) != 0) {
            charset = Charsets.f27049b;
        }
        if ((i6 & 2) != 0) {
            i5 = 8192;
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䂖"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("䂗"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("䂘"));
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        return new BufferedReader(new InputStreamReader(newInputStream, charset), i5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final BufferedWriter j(Path path, Charset charset, int i5, OpenOption... openOptionArr) throws IOException {
        OutputStream newOutputStream;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䂙"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("䂚"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("䂛"));
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        return new BufferedWriter(new OutputStreamWriter(newOutputStream, charset), i5);
    }

    static /* synthetic */ BufferedWriter k(Path path, Charset charset, int i5, OpenOption[] openOptionArr, int i6, Object obj) throws IOException {
        OutputStream newOutputStream;
        if ((i6 & 1) != 0) {
            charset = Charsets.f27049b;
        }
        if ((i6 & 2) != 0) {
            i5 = 8192;
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䂜"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("䂝"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("䂞"));
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        return new BufferedWriter(new OutputStreamWriter(newOutputStream, charset), i5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final void l(Path path, Charset charset, q3.l<? super String, kotlin.m2> lVar) throws IOException {
        BufferedReader newBufferedReader;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䂟"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("䂠"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("䂡"));
        newBufferedReader = Files.newBufferedReader(path, charset);
        kotlin.jvm.internal.l0.o(newBufferedReader, ProtectedSandApp.s("䂢"));
        try {
            Iterator<String> it = kotlin.io.t.h(newBufferedReader).iterator();
            while (it.hasNext()) {
                lVar.N(it.next());
            }
            kotlin.m2 m2Var = kotlin.m2.f23662a;
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.b.a(newBufferedReader, null);
            } else {
                newBufferedReader.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (kotlin.internal.m.a(1, 1, 0)) {
                    kotlin.io.b.a(newBufferedReader, th);
                } else {
                    try {
                        newBufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
    }

    static void m(Path path, Charset charset, q3.l lVar, int i5, Object obj) throws IOException {
        BufferedReader newBufferedReader;
        if ((i5 & 1) != 0) {
            charset = Charsets.f27049b;
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䂣"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("䂤"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("䂥"));
        newBufferedReader = Files.newBufferedReader(path, charset);
        kotlin.jvm.internal.l0.o(newBufferedReader, ProtectedSandApp.s("䂦"));
        try {
            Iterator<String> it = kotlin.io.t.h(newBufferedReader).iterator();
            while (it.hasNext()) {
                lVar.N(it.next());
            }
            kotlin.m2 m2Var = kotlin.m2.f23662a;
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.b.a(newBufferedReader, null);
            } else {
                newBufferedReader.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (kotlin.internal.m.a(1, 1, 0)) {
                    kotlin.io.b.a(newBufferedReader, th);
                } else {
                    try {
                        newBufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final InputStream n(Path path, OpenOption... openOptionArr) throws IOException {
        InputStream newInputStream;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䂧"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("䂨"));
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        kotlin.jvm.internal.l0.o(newInputStream, ProtectedSandApp.s("䂩"));
        return newInputStream;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final OutputStream o(Path path, OpenOption... openOptionArr) throws IOException {
        OutputStream newOutputStream;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䂪"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("䂫"));
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        kotlin.jvm.internal.l0.o(newOutputStream, ProtectedSandApp.s("䂬"));
        return newOutputStream;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final byte[] p(Path path) throws IOException {
        byte[] readAllBytes;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䂭"));
        readAllBytes = Files.readAllBytes(path);
        kotlin.jvm.internal.l0.o(readAllBytes, ProtectedSandApp.s("䂮"));
        return readAllBytes;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final List<String> q(Path path, Charset charset) throws IOException {
        List<String> readAllLines;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䂯"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("䂰"));
        readAllLines = Files.readAllLines(path, charset);
        kotlin.jvm.internal.l0.o(readAllLines, ProtectedSandApp.s("䂱"));
        return readAllLines;
    }

    static /* synthetic */ List r(Path path, Charset charset, int i5, Object obj) throws IOException {
        List readAllLines;
        if ((i5 & 1) != 0) {
            charset = Charsets.f27049b;
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䂲"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("䂳"));
        readAllLines = Files.readAllLines(path, charset);
        kotlin.jvm.internal.l0.o(readAllLines, ProtectedSandApp.s("䂴"));
        return readAllLines;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @d5.d
    public static final String s(@d5.d Path path, @d5.d Charset charset) throws IOException {
        InputStream newInputStream;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䂵"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("䂶"));
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
        InputStreamReader inputStreamReader = new InputStreamReader(newInputStream, charset);
        try {
            String k5 = kotlin.io.t.k(inputStreamReader);
            kotlin.io.b.a(inputStreamReader, null);
            return k5;
        } finally {
        }
    }

    public static /* synthetic */ String t(Path path, Charset charset, int i5, Object obj) throws IOException {
        if ((i5 & 1) != 0) {
            charset = Charsets.f27049b;
        }
        return s(path, charset);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final InputStreamReader u(Path path, Charset charset, OpenOption... openOptionArr) throws IOException {
        InputStream newInputStream;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䂷"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("䂸"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("䂹"));
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        return new InputStreamReader(newInputStream, charset);
    }

    static /* synthetic */ InputStreamReader v(Path path, Charset charset, OpenOption[] openOptionArr, int i5, Object obj) throws IOException {
        InputStream newInputStream;
        if ((i5 & 1) != 0) {
            charset = Charsets.f27049b;
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䂺"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("䂻"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("䂼"));
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        return new InputStreamReader(newInputStream, charset);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final <T> T w(Path path, Charset charset, q3.l<? super Sequence<String>, ? extends T> lVar) throws IOException {
        BufferedReader newBufferedReader;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䂽"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("䂾"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("䂿"));
        newBufferedReader = Files.newBufferedReader(path, charset);
        try {
            kotlin.jvm.internal.l0.m(newBufferedReader);
            T N = lVar.N(kotlin.io.t.h(newBufferedReader));
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.b.a(newBufferedReader, null);
            } else if (newBufferedReader != null) {
                newBufferedReader.close();
            }
            return N;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (kotlin.internal.m.a(1, 1, 0)) {
                    kotlin.io.b.a(newBufferedReader, th);
                } else if (newBufferedReader != null) {
                    try {
                        newBufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
    }

    static Object x(Path path, Charset charset, q3.l lVar, int i5, Object obj) throws IOException {
        BufferedReader newBufferedReader;
        if ((i5 & 1) != 0) {
            charset = Charsets.f27049b;
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䃀"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("䃁"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("䃂"));
        newBufferedReader = Files.newBufferedReader(path, charset);
        try {
            kotlin.jvm.internal.l0.m(newBufferedReader);
            Object N = lVar.N(kotlin.io.t.h(newBufferedReader));
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.b.a(newBufferedReader, null);
            } else if (newBufferedReader != null) {
                newBufferedReader.close();
            }
            return N;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (kotlin.internal.m.a(1, 1, 0)) {
                    kotlin.io.b.a(newBufferedReader, th);
                } else if (newBufferedReader != null) {
                    try {
                        newBufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final void y(Path path, byte[] bArr, OpenOption... openOptionArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䃃"));
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("䃄"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("䃅"));
        Files.write(path, bArr, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path z(Path path, Iterable<? extends CharSequence> iterable, Charset charset, OpenOption... openOptionArr) throws IOException {
        Path write;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䃆"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("䃇"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("䃈"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("䃉"));
        write = Files.write(path, iterable, charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        kotlin.jvm.internal.l0.o(write, ProtectedSandApp.s("䃊"));
        return write;
    }
}

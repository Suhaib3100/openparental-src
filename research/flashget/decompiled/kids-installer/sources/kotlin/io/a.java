package kotlin.io;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.collections.ByteIterator;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.l0;
import kotlin.text.Charsets;

/* compiled from: IOStreams.kt */
@p3.i(name = "ByteStreamsKt")
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u0007\u001a\u00020\b*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u0017\u0010\u000b\u001a\u00020\f*\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u0017\u0010\r\u001a\u00020\u000e*\u00020\u000f2\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u001c\u0010\u0010\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\r\u0010\u0013\u001a\u00020\u000e*\u00020\u0014H\u0087\b\u001a\u001d\u0010\u0013\u001a\u00020\u000e*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u0018*\u00020\u0001H\u0086\u0002\u001a\f\u0010\u0019\u001a\u00020\u0014*\u00020\u0002H\u0007\u001a\u0016\u0010\u0019\u001a\u00020\u0014*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0004H\u0007\u001a\u0017\u0010\u001b\u001a\u00020\u001c*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u0017\u0010\u001d\u001a\u00020\u001e*\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b¨\u0006\u001f"}, d2 = {"buffered", "Ljava/io/BufferedInputStream;", "Ljava/io/InputStream;", "bufferSize", "", "Ljava/io/BufferedOutputStream;", "Ljava/io/OutputStream;", "bufferedReader", "Ljava/io/BufferedReader;", "charset", "Ljava/nio/charset/Charset;", "bufferedWriter", "Ljava/io/BufferedWriter;", "byteInputStream", "Ljava/io/ByteArrayInputStream;", "", "copyTo", "", "out", "inputStream", "", "offset", "length", "iterator", "Lkotlin/collections/ByteIterator;", "readBytes", "estimatedSize", "reader", "Ljava/io/InputStreamReader;", "writer", "Ljava/io/OutputStreamWriter;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: IOStreams.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007¨\u0006\u0015"}, d2 = {"kotlin/io/ByteStreamsKt$iterator$1", "Lkotlin/collections/ByteIterator;", "finished", "", "getFinished", "()Z", "setFinished", "(Z)V", "nextByte", "", "getNextByte", "()I", "setNextByte", "(I)V", "nextPrepared", "getNextPrepared", "setNextPrepared", "hasNext", "", "prepareNext", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.io.a$a, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0257a extends ByteIterator {

        /* renamed from: o, reason: collision with root package name */
        private int f23355o = -1;

        /* renamed from: p, reason: collision with root package name */
        private boolean f23356p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f23357q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ BufferedInputStream f23358r;

        C0257a(BufferedInputStream bufferedInputStream) {
            this.f23358r = bufferedInputStream;
        }

        private final void h() {
            if (this.f23356p || this.f23357q) {
                return;
            }
            int read = this.f23358r.read();
            this.f23355o = read;
            this.f23356p = true;
            this.f23357q = read == -1;
        }

        @Override // kotlin.collections.ByteIterator
        public byte b() {
            h();
            if (this.f23357q) {
                throw new NoSuchElementException(ProtectedSandApp.s("緍"));
            }
            byte b6 = (byte) this.f23355o;
            this.f23356p = false;
            return b6;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getF23357q() {
            return this.f23357q;
        }

        /* renamed from: f, reason: from getter */
        public final int getF23355o() {
            return this.f23355o;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getF23356p() {
            return this.f23356p;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            h();
            return !this.f23357q;
        }

        public final void j(boolean z5) {
            this.f23357q = z5;
        }

        public final void k(int i5) {
            this.f23355o = i5;
        }

        public final void l(boolean z5) {
            this.f23356p = z5;
        }
    }

    @InlineOnly
    private static final BufferedInputStream a(InputStream inputStream, int i5) {
        l0.p(inputStream, ProtectedSandApp.s("㽤"));
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i5);
    }

    @InlineOnly
    private static final BufferedOutputStream b(OutputStream outputStream, int i5) {
        l0.p(outputStream, ProtectedSandApp.s("㽥"));
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i5);
    }

    static /* synthetic */ BufferedInputStream c(InputStream inputStream, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 8192;
        }
        l0.p(inputStream, ProtectedSandApp.s("㽦"));
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i5);
    }

    static /* synthetic */ BufferedOutputStream d(OutputStream outputStream, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 8192;
        }
        l0.p(outputStream, ProtectedSandApp.s("㽧"));
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i5);
    }

    @InlineOnly
    private static final BufferedReader e(InputStream inputStream, Charset charset) {
        l0.p(inputStream, ProtectedSandApp.s("㽨"));
        l0.p(charset, ProtectedSandApp.s("㽩"));
        Reader inputStreamReader = new InputStreamReader(inputStream, charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
    }

    static /* synthetic */ BufferedReader f(InputStream inputStream, Charset charset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = Charsets.f27049b;
        }
        l0.p(inputStream, ProtectedSandApp.s("㽪"));
        l0.p(charset, ProtectedSandApp.s("㽫"));
        Reader inputStreamReader = new InputStreamReader(inputStream, charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
    }

    @InlineOnly
    private static final BufferedWriter g(OutputStream outputStream, Charset charset) {
        l0.p(outputStream, ProtectedSandApp.s("㽬"));
        l0.p(charset, ProtectedSandApp.s("㽭"));
        Writer outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
    }

    static /* synthetic */ BufferedWriter h(OutputStream outputStream, Charset charset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = Charsets.f27049b;
        }
        l0.p(outputStream, ProtectedSandApp.s("㽮"));
        l0.p(charset, ProtectedSandApp.s("㽯"));
        Writer outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
    }

    @InlineOnly
    private static final ByteArrayInputStream i(String str, Charset charset) {
        l0.p(str, ProtectedSandApp.s("㽰"));
        l0.p(charset, ProtectedSandApp.s("㽱"));
        byte[] bytes = str.getBytes(charset);
        l0.o(bytes, ProtectedSandApp.s("㽲"));
        return new ByteArrayInputStream(bytes);
    }

    static /* synthetic */ ByteArrayInputStream j(String str, Charset charset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = Charsets.f27049b;
        }
        l0.p(str, ProtectedSandApp.s("㽳"));
        l0.p(charset, ProtectedSandApp.s("㽴"));
        byte[] bytes = str.getBytes(charset);
        l0.o(bytes, ProtectedSandApp.s("㽵"));
        return new ByteArrayInputStream(bytes);
    }

    public static final long k(@d5.d InputStream inputStream, @d5.d OutputStream outputStream, int i5) {
        l0.p(inputStream, ProtectedSandApp.s("㽶"));
        l0.p(outputStream, ProtectedSandApp.s("㽷"));
        byte[] bArr = new byte[i5];
        int read = inputStream.read(bArr);
        long j5 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j5 += read;
            read = inputStream.read(bArr);
        }
        return j5;
    }

    public static /* synthetic */ long l(InputStream inputStream, OutputStream outputStream, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 8192;
        }
        return k(inputStream, outputStream, i5);
    }

    @InlineOnly
    private static final ByteArrayInputStream m(byte[] bArr) {
        l0.p(bArr, ProtectedSandApp.s("㽸"));
        return new ByteArrayInputStream(bArr);
    }

    @InlineOnly
    private static final ByteArrayInputStream n(byte[] bArr, int i5, int i6) {
        l0.p(bArr, ProtectedSandApp.s("㽹"));
        return new ByteArrayInputStream(bArr, i5, i6);
    }

    @d5.d
    public static final ByteIterator o(@d5.d BufferedInputStream bufferedInputStream) {
        l0.p(bufferedInputStream, ProtectedSandApp.s("㽺"));
        return new C0257a(bufferedInputStream);
    }

    @SinceKotlin(version = "1.3")
    @d5.d
    public static final byte[] p(@d5.d InputStream inputStream) {
        l0.p(inputStream, ProtectedSandApp.s("㽻"));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        l(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        l0.o(byteArray, ProtectedSandApp.s("㽼"));
        return byteArray;
    }

    @Deprecated(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @ReplaceWith(expression = "readBytes()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", warningSince = "1.3")
    @d5.d
    public static final byte[] q(@d5.d InputStream inputStream, int i5) {
        l0.p(inputStream, ProtectedSandApp.s("㽽"));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i5, inputStream.available()));
        l(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        l0.o(byteArray, ProtectedSandApp.s("㽾"));
        return byteArray;
    }

    public static /* synthetic */ byte[] r(InputStream inputStream, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 8192;
        }
        return q(inputStream, i5);
    }

    @InlineOnly
    private static final InputStreamReader s(InputStream inputStream, Charset charset) {
        l0.p(inputStream, ProtectedSandApp.s("㽿"));
        l0.p(charset, ProtectedSandApp.s("㾀"));
        return new InputStreamReader(inputStream, charset);
    }

    static /* synthetic */ InputStreamReader t(InputStream inputStream, Charset charset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = Charsets.f27049b;
        }
        l0.p(inputStream, ProtectedSandApp.s("㾁"));
        l0.p(charset, ProtectedSandApp.s("㾂"));
        return new InputStreamReader(inputStream, charset);
    }

    @InlineOnly
    private static final OutputStreamWriter u(OutputStream outputStream, Charset charset) {
        l0.p(outputStream, ProtectedSandApp.s("㾃"));
        l0.p(charset, ProtectedSandApp.s("㾄"));
        return new OutputStreamWriter(outputStream, charset);
    }

    static /* synthetic */ OutputStreamWriter v(OutputStream outputStream, Charset charset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = Charsets.f27049b;
        }
        l0.p(outputStream, ProtectedSandApp.s("㾅"));
        l0.p(charset, ProtectedSandApp.s("㾆"));
        return new OutputStreamWriter(outputStream, charset);
    }
}

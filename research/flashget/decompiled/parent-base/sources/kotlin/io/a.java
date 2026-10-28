package kotlin.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
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
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.collections.u;
import kotlin.jvm.internal.l0;
import kotlin.x0;

/* compiled from: IOStreams.kt */
@kd.i(name = "ByteStreamsKt")
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001e\u0010\b\u001a\u00020\u0007*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0087\b¢\u0006\u0004\b\b\u0010\t\u001a\u0014\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0087\b¢\u0006\u0004\b\u000b\u0010\f\u001a$\u0010\u0010\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001e\u0010\u0014\u001a\u00020\u0000*\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\rH\u0087\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001e\u0010\u0017\u001a\u00020\u0016*\u00020\u00122\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0087\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001e\u0010\u001a\u001a\u00020\u0019*\u00020\u00122\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0087\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001e\u0010\u001e\u001a\u00020\u001d*\u00020\u001c2\b\b\u0002\u0010\u0013\u001a\u00020\rH\u0087\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001e\u0010!\u001a\u00020 *\u00020\u001c2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0087\b¢\u0006\u0004\b!\u0010\"\u001a\u001e\u0010$\u001a\u00020#*\u00020\u001c2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0087\b¢\u0006\u0004\b$\u0010%\u001a#\u0010(\u001a\u00020'*\u00020\u00122\u0006\u0010&\u001a\u00020\u001c2\b\b\u0002\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b(\u0010)\u001a\u001d\u0010+\u001a\u00020\n*\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\rH\u0007¢\u0006\u0004\b+\u0010,\u001a\u0013\u0010-\u001a\u00020\n*\u00020\u0012H\u0007¢\u0006\u0004\b-\u0010.¨\u0006/"}, d2 = {"Ljava/io/BufferedInputStream;", "Lkotlin/collections/u;", "o", "(Ljava/io/BufferedInputStream;)Lkotlin/collections/u;", "", "Ljava/nio/charset/Charset;", "charset", "Ljava/io/ByteArrayInputStream;", "i", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/io/ByteArrayInputStream;", "", "m", "([B)Ljava/io/ByteArrayInputStream;", "", "offset", "length", "n", "([BII)Ljava/io/ByteArrayInputStream;", "Ljava/io/InputStream;", "bufferSize", "a", "(Ljava/io/InputStream;I)Ljava/io/BufferedInputStream;", "Ljava/io/InputStreamReader;", "s", "(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/io/InputStreamReader;", "Ljava/io/BufferedReader;", "e", "(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/io/BufferedReader;", "Ljava/io/OutputStream;", "Ljava/io/BufferedOutputStream;", "b", "(Ljava/io/OutputStream;I)Ljava/io/BufferedOutputStream;", "Ljava/io/OutputStreamWriter;", "u", "(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)Ljava/io/OutputStreamWriter;", "Ljava/io/BufferedWriter;", "g", "(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)Ljava/io/BufferedWriter;", "out", "", "k", "(Ljava/io/InputStream;Ljava/io/OutputStream;I)J", "estimatedSize", "q", "(Ljava/io/InputStream;I)[B", "p", "(Ljava/io/InputStream;)[B", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class a {

    /* compiled from: IOStreams.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0018\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001a\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, d2 = {"kotlin/io/a$a", "Lkotlin/collections/u;", "Lkotlin/k2;", "f", "()V", "", "hasNext", "()Z", "", "q", "()B", "", "b", "I", "d", "()I", "i", "(I)V", "nextByte", "c", "Z", "e", "j", "(Z)V", "nextPrepared", "h", "finished", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.io.a$a, reason: collision with other inner class name */
    public static final class C1058a extends u {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int nextByte = -1;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean nextPrepared;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean finished;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ BufferedInputStream f75117e;

        C1058a(BufferedInputStream bufferedInputStream) {
            this.f75117e = bufferedInputStream;
        }

        private final void f() {
            if (this.nextPrepared || this.finished) {
                return;
            }
            int read = this.f75117e.read();
            this.nextByte = read;
            this.nextPrepared = true;
            this.finished = read == -1;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }

        /* renamed from: d, reason: from getter */
        public final int getNextByte() {
            return this.nextByte;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getNextPrepared() {
            return this.nextPrepared;
        }

        public final void h(boolean z4) {
            this.finished = z4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            f();
            return !this.finished;
        }

        public final void i(int i4) {
            this.nextByte = i4;
        }

        public final void j(boolean z4) {
            this.nextPrepared = z4;
        }

        @Override // kotlin.collections.u
        public byte q() {
            f();
            if (this.finished) {
                throw new NoSuchElementException(ProtectedSandApp.s("探\u0001"));
            }
            byte b5 = (byte) this.nextByte;
            this.nextPrepared = false;
            return b5;
        }
    }

    @kotlin.internal.f
    private static final BufferedInputStream a(InputStream inputStream, int i4) {
        l0.p(inputStream, ProtectedSandApp.s("掣\u0001"));
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i4);
    }

    @kotlin.internal.f
    private static final BufferedOutputStream b(OutputStream outputStream, int i4) {
        l0.p(outputStream, ProtectedSandApp.s("掣\u0001"));
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i4);
    }

    static /* synthetic */ BufferedInputStream c(InputStream inputStream, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 8192;
        }
        l0.p(inputStream, ProtectedSandApp.s("掣\u0001"));
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i4);
    }

    static /* synthetic */ BufferedOutputStream d(OutputStream outputStream, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 8192;
        }
        l0.p(outputStream, ProtectedSandApp.s("掣\u0001"));
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i4);
    }

    @kotlin.internal.f
    private static final BufferedReader e(InputStream inputStream, Charset charset) {
        l0.p(inputStream, ProtectedSandApp.s("掣\u0001"));
        l0.p(charset, ProtectedSandApp.s("掤\u0001"));
        return new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
    }

    static /* synthetic */ BufferedReader f(InputStream inputStream, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        l0.p(inputStream, ProtectedSandApp.s("掣\u0001"));
        l0.p(charset, ProtectedSandApp.s("掤\u0001"));
        return new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
    }

    @kotlin.internal.f
    private static final BufferedWriter g(OutputStream outputStream, Charset charset) {
        l0.p(outputStream, ProtectedSandApp.s("掣\u0001"));
        l0.p(charset, ProtectedSandApp.s("掤\u0001"));
        return new BufferedWriter(new OutputStreamWriter(outputStream, charset), 8192);
    }

    static /* synthetic */ BufferedWriter h(OutputStream outputStream, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        l0.p(outputStream, ProtectedSandApp.s("掣\u0001"));
        l0.p(charset, ProtectedSandApp.s("掤\u0001"));
        return new BufferedWriter(new OutputStreamWriter(outputStream, charset), 8192);
    }

    @kotlin.internal.f
    private static final ByteArrayInputStream i(String str, Charset charset) {
        l0.p(str, ProtectedSandApp.s("掣\u0001"));
        l0.p(charset, ProtectedSandApp.s("掤\u0001"));
        byte[] bytes = str.getBytes(charset);
        l0.o(bytes, ProtectedSandApp.s("接\u0001"));
        return new ByteArrayInputStream(bytes);
    }

    static /* synthetic */ ByteArrayInputStream j(String str, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        l0.p(str, ProtectedSandApp.s("掣\u0001"));
        l0.p(charset, ProtectedSandApp.s("掤\u0001"));
        byte[] bytes = str.getBytes(charset);
        l0.o(bytes, ProtectedSandApp.s("接\u0001"));
        return new ByteArrayInputStream(bytes);
    }

    public static final long k(@fg.l InputStream inputStream, @fg.l OutputStream outputStream, int i4) {
        l0.p(inputStream, ProtectedSandApp.s("掣\u0001"));
        l0.p(outputStream, ProtectedSandApp.s("掦\u0001"));
        byte[] bArr = new byte[i4];
        int read = inputStream.read(bArr);
        long j4 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j4 += read;
            read = inputStream.read(bArr);
        }
        return j4;
    }

    public static /* synthetic */ long l(InputStream inputStream, OutputStream outputStream, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 8192;
        }
        return k(inputStream, outputStream, i4);
    }

    @kotlin.internal.f
    private static final ByteArrayInputStream m(byte[] bArr) {
        l0.p(bArr, ProtectedSandApp.s("掣\u0001"));
        return new ByteArrayInputStream(bArr);
    }

    @kotlin.internal.f
    private static final ByteArrayInputStream n(byte[] bArr, int i4, int i5) {
        l0.p(bArr, ProtectedSandApp.s("掣\u0001"));
        return new ByteArrayInputStream(bArr, i4, i5);
    }

    @fg.l
    public static final u o(@fg.l BufferedInputStream bufferedInputStream) {
        l0.p(bufferedInputStream, ProtectedSandApp.s("掣\u0001"));
        return new C1058a(bufferedInputStream);
    }

    @fg.l
    @c1(version = "1.3")
    public static final byte[] p(@fg.l InputStream inputStream) {
        l0.p(inputStream, ProtectedSandApp.s("掣\u0001"));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        l(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        l0.o(byteArray, ProtectedSandApp.s("控\u0001"));
        return byteArray;
    }

    @fg.l
    @kotlin.k(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @x0(expression = "readBytes()", imports = {}))
    @kotlin.l(errorSince = "1.5", warningSince = "1.3")
    public static final byte[] q(@fg.l InputStream inputStream, int i4) {
        l0.p(inputStream, ProtectedSandApp.s("掣\u0001"));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i4, inputStream.available()));
        l(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        l0.o(byteArray, ProtectedSandApp.s("控\u0001"));
        return byteArray;
    }

    public static /* synthetic */ byte[] r(InputStream inputStream, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 8192;
        }
        return q(inputStream, i4);
    }

    @kotlin.internal.f
    private static final InputStreamReader s(InputStream inputStream, Charset charset) {
        l0.p(inputStream, ProtectedSandApp.s("掣\u0001"));
        l0.p(charset, ProtectedSandApp.s("掤\u0001"));
        return new InputStreamReader(inputStream, charset);
    }

    static /* synthetic */ InputStreamReader t(InputStream inputStream, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        l0.p(inputStream, ProtectedSandApp.s("掣\u0001"));
        l0.p(charset, ProtectedSandApp.s("掤\u0001"));
        return new InputStreamReader(inputStream, charset);
    }

    @kotlin.internal.f
    private static final OutputStreamWriter u(OutputStream outputStream, Charset charset) {
        l0.p(outputStream, ProtectedSandApp.s("掣\u0001"));
        l0.p(charset, ProtectedSandApp.s("掤\u0001"));
        return new OutputStreamWriter(outputStream, charset);
    }

    static /* synthetic */ OutputStreamWriter v(OutputStream outputStream, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        l0.p(outputStream, ProtectedSandApp.s("掣\u0001"));
        l0.p(charset, ProtectedSandApp.s("掤\u0001"));
        return new OutputStreamWriter(outputStream, charset);
    }
}

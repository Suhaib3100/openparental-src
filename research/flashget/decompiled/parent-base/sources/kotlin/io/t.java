package kotlin.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: ReadWrite.kt */
@kd.i(name = "TextStreamsKt")
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a\u001e\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001e\u0010\b\u001a\u00020\u0007*\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000e\u001a\u00020\f*\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010*\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a7\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0013*\u00020\u00002\u0018\u0010\u0015\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0014\u0012\u0004\u0012\u00028\u00000\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0014\u0010\u0019\u001a\u00020\u0018*\u00020\u000bH\u0087\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014*\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001d\u001a\u00020\u000b*\u00020\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010!\u001a\u00020 *\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b!\u0010\"\u001a\u001e\u0010&\u001a\u00020\u000b*\u00020#2\b\b\u0002\u0010%\u001a\u00020$H\u0087\b¢\u0006\u0004\b&\u0010'\u001a\u0011\u0010)\u001a\u00020(*\u00020#¢\u0006\u0004\b)\u0010*\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006+"}, d2 = {"Ljava/io/Reader;", "", "bufferSize", "Ljava/io/BufferedReader;", "a", "(Ljava/io/Reader;I)Ljava/io/BufferedReader;", "Ljava/io/Writer;", "Ljava/io/BufferedWriter;", "b", "(Ljava/io/Writer;I)Ljava/io/BufferedWriter;", "Lkotlin/Function1;", "", "Lkotlin/k2;", "action", "g", "(Ljava/io/Reader;Lld/l;)V", "", "j", "(Ljava/io/Reader;)Ljava/util/List;", "T", "Lkotlin/sequences/m;", "block", "o", "(Ljava/io/Reader;Lld/l;)Ljava/lang/Object;", "Ljava/io/StringReader;", "n", "(Ljava/lang/String;)Ljava/io/StringReader;", "h", "(Ljava/io/BufferedReader;)Lkotlin/sequences/m;", "k", "(Ljava/io/Reader;)Ljava/lang/String;", "out", "", "e", "(Ljava/io/Reader;Ljava/io/Writer;I)J", "Ljava/net/URL;", "Ljava/nio/charset/Charset;", "charset", "l", "(Ljava/net/URL;Ljava/nio/charset/Charset;)Ljava/lang/String;", "", "i", "(Ljava/net/URL;)[B", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,151:1\n52#1:152\n1#2:153\n1#2:156\n1313#3,2:154\n*S KotlinDebug\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n*L\n33#1:152\n33#1:153\n33#1:154,2\n*E\n"})
/* loaded from: classes7.dex */
public final class t {

    /* compiled from: ReadWrite.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends n0 implements ld.l<String, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList<String> f75264b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ArrayList<String> arrayList) {
            super(1);
            this.f75264b = arrayList;
        }

        public final void a(@fg.l String str) {
            l0.p(str, ProtectedSandApp.s("擅\u0001"));
            this.f75264b.add(str);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(String str) {
            a(str);
            return k2.f75408a;
        }
    }

    @kotlin.internal.f
    private static final BufferedReader a(Reader reader, int i4) {
        l0.p(reader, ProtectedSandApp.s("擆\u0001"));
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i4);
    }

    @kotlin.internal.f
    private static final BufferedWriter b(Writer writer, int i4) {
        l0.p(writer, ProtectedSandApp.s("擆\u0001"));
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i4);
    }

    static /* synthetic */ BufferedReader c(Reader reader, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 8192;
        }
        l0.p(reader, ProtectedSandApp.s("擆\u0001"));
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i4);
    }

    static /* synthetic */ BufferedWriter d(Writer writer, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 8192;
        }
        l0.p(writer, ProtectedSandApp.s("擆\u0001"));
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i4);
    }

    public static final long e(@fg.l Reader reader, @fg.l Writer writer, int i4) {
        l0.p(reader, ProtectedSandApp.s("擆\u0001"));
        l0.p(writer, ProtectedSandApp.s("擇\u0001"));
        char[] cArr = new char[i4];
        int read = reader.read(cArr);
        long j4 = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j4 += read;
            read = reader.read(cArr);
        }
        return j4;
    }

    public static /* synthetic */ long f(Reader reader, Writer writer, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 8192;
        }
        return e(reader, writer, i4);
    }

    public static final void g(@fg.l Reader reader, @fg.l ld.l<? super String, k2> lVar) {
        l0.p(reader, ProtectedSandApp.s("擆\u0001"));
        l0.p(lVar, ProtectedSandApp.s("擈\u0001"));
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator<String> it = h(bufferedReader).iterator();
            while (it.hasNext()) {
                lVar.invoke(it.next());
            }
            k2 k2Var = k2.f75408a;
            b.a(bufferedReader, null);
        } finally {
        }
    }

    @fg.l
    public static final kotlin.sequences.m<String> h(@fg.l BufferedReader bufferedReader) {
        l0.p(bufferedReader, ProtectedSandApp.s("擆\u0001"));
        return kotlin.sequences.p.f(new p(bufferedReader));
    }

    @fg.l
    public static final byte[] i(@fg.l URL url) {
        l0.p(url, ProtectedSandApp.s("擆\u0001"));
        InputStream openStream = url.openStream();
        try {
            l0.m(openStream);
            byte[] p4 = kotlin.io.a.p(openStream);
            b.a(openStream, null);
            return p4;
        } finally {
        }
    }

    @fg.l
    public static final List<String> j(@fg.l Reader reader) {
        l0.p(reader, ProtectedSandApp.s("擆\u0001"));
        ArrayList arrayList = new ArrayList();
        g(reader, new a(arrayList));
        return arrayList;
    }

    @fg.l
    public static final String k(@fg.l Reader reader) {
        l0.p(reader, ProtectedSandApp.s("擆\u0001"));
        StringWriter stringWriter = new StringWriter();
        f(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        l0.o(stringWriter2, ProtectedSandApp.s("擉\u0001"));
        return stringWriter2;
    }

    @kotlin.internal.f
    private static final String l(URL url, Charset charset) {
        l0.p(url, ProtectedSandApp.s("擆\u0001"));
        l0.p(charset, ProtectedSandApp.s("擊\u0001"));
        return new String(i(url), charset);
    }

    static /* synthetic */ String m(URL url, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        l0.p(url, ProtectedSandApp.s("擆\u0001"));
        l0.p(charset, ProtectedSandApp.s("擊\u0001"));
        return new String(i(url), charset);
    }

    @kotlin.internal.f
    private static final StringReader n(String str) {
        l0.p(str, ProtectedSandApp.s("擆\u0001"));
        return new StringReader(str);
    }

    public static final <T> T o(@fg.l Reader reader, @fg.l ld.l<? super kotlin.sequences.m<String>, ? extends T> lVar) {
        l0.p(reader, ProtectedSandApp.s("擆\u0001"));
        l0.p(lVar, ProtectedSandApp.s("擋\u0001"));
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            T invoke = lVar.invoke(h(bufferedReader));
            if (kotlin.internal.m.a(1, 1, 0)) {
                b.a(bufferedReader, null);
            } else {
                bufferedReader.close();
            }
            return invoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (kotlin.internal.m.a(1, 1, 0)) {
                    b.a(bufferedReader, th);
                } else {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
    }
}

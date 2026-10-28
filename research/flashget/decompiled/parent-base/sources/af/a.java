package af;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Objects;
import org.apache.commons.text.matcher.b;
import org.apache.commons.text.matcher.c;
import org.apache.commons.text.q;
import org.apache.commons.text.t;

/* compiled from: StringSubstitutorReader.java */
/* loaded from: classes3.dex */
public class a extends FilterReader {

    /* renamed from: h, reason: collision with root package name */
    private static final int f364h = -1;

    /* renamed from: b, reason: collision with root package name */
    private final t f365b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f366c;

    /* renamed from: d, reason: collision with root package name */
    private final b f367d;

    /* renamed from: e, reason: collision with root package name */
    private final char[] f368e;

    /* renamed from: f, reason: collision with root package name */
    private final q f369f;

    /* renamed from: g, reason: collision with root package name */
    private int f370g;

    public a(Reader reader, q qVar) {
        super(reader);
        this.f365b = new t();
        this.f368e = new char[]{0};
        Objects.requireNonNull(qVar);
        this.f369f = qVar;
        this.f367d = c.f86564c.b(qVar.c()).e(qVar.f());
    }

    private int a(int i4) throws IOException {
        int s12 = this.f365b.s1(((FilterReader) this).in, i4);
        this.f366c = s12 == -1;
        return s12;
    }

    private int b(int i4, char[] cArr, int i5, int i6) throws IOException {
        return d(a(i4), cArr, i5, i6);
    }

    private int c(char[] cArr, int i4, int i5) {
        int H0 = this.f365b.H0(0, Math.min(this.f365b.length(), i5), cArr, i4);
        this.f370g -= H0;
        if (this.f365b.isEmpty() || this.f370g == 0) {
            this.f370g = 0;
        }
        return H0;
    }

    private int d(int i4, char[] cArr, int i5, int i6) {
        if (i4 != -1) {
            return i4;
        }
        if (!this.f365b.g1()) {
            return -1;
        }
        this.f370g = this.f365b.N1();
        return c(cArr, i5, i6);
    }

    private boolean e(b bVar, int i4) {
        return bVar.a(this.f365b, i4) == bVar.size();
    }

    private boolean f() {
        return this.f370g > 0;
    }

    private int g(int i4, int i5) {
        int N1 = this.f365b.N1() - i5;
        if (N1 >= i4) {
            return 0;
        }
        return i4 - N1;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        int read;
        do {
            read = read(this.f368e, 0, 1);
            if (read == -1) {
                return -1;
            }
        } while (read < 1);
        return this.f368e[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b3, code lost:
    
        if (r6 == (-1)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b5, code lost:
    
        r3 = r3 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b6, code lost:
    
        r3 = r3 - r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b7, code lost:
    
        if (r3 <= 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ba, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return -1;
     */
    @Override // java.io.FilterReader, java.io.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(char[] r10, int r11, int r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: af.a.read(char[], int, int):int");
    }
}

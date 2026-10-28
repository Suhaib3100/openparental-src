package okio;

import androidx.collection.r2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;

/* compiled from: SegmentedByteString.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\nJ\u000f\u0010\u0017\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\nJ\u0017\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u0014J\u001f\u0010\"\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u001fH\u0010¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH\u0010¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0003H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b2\u00103J'\u00108\u001a\u0002012\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\u001f2\u0006\u00107\u001a\u00020\u001fH\u0010¢\u0006\u0004\b8\u00109J/\u0010=\u001a\u00020<2\u0006\u00106\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u001f2\u0006\u00107\u001a\u00020\u001fH\u0016¢\u0006\u0004\b=\u0010>J/\u0010?\u001a\u00020<2\u0006\u00106\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020\u00032\u0006\u0010;\u001a\u00020\u001f2\u0006\u00107\u001a\u00020\u001fH\u0016¢\u0006\u0004\b?\u0010@J\u001f\u0010B\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u001fH\u0016¢\u0006\u0004\bB\u0010CJ\u001f\u0010D\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u001fH\u0016¢\u0006\u0004\bD\u0010CJ\u000f\u0010E\u001a\u00020\u0003H\u0010¢\u0006\u0004\bE\u0010+J\u001a\u0010G\u001a\u00020<2\b\u0010:\u001a\u0004\u0018\u00010FH\u0096\u0002¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u001fH\u0016¢\u0006\u0004\bI\u0010)J\u000f\u0010J\u001a\u00020\u0010H\u0016¢\u0006\u0004\bJ\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010O\u001a\u0004\bP\u0010Q¨\u0006R"}, d2 = {"Lokio/l0;", "Lokio/p;", "", "", "segments", "", "directory", "<init>", "([[B[I)V", "v0", "()Lokio/p;", "Ljava/lang/Object;", "w0", "()Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "", "g0", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "d", "()Ljava/lang/String;", "s", "l0", "m0", "algorithm", "i", "(Ljava/lang/String;)Lokio/p;", "key", "t", "(Ljava/lang/String;Lokio/p;)Lokio/p;", "e", "", "beginIndex", "endIndex", "j0", "(II)Lokio/p;", "pos", "", "G", "(I)B", "q", "()I", "n0", "()[B", "Ljava/nio/ByteBuffer;", "c", "()Ljava/nio/ByteBuffer;", "Ljava/io/OutputStream;", "out", "Lkotlin/k2;", "p0", "(Ljava/io/OutputStream;)V", "Lokio/m;", "buffer", "offset", "byteCount", "r0", "(Lokio/m;II)V", "other", "otherOffset", "", "U", "(ILokio/p;II)Z", "V", "(I[BII)Z", "fromIndex", "A", "([BI)I", "M", "E", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "h", "[[B", "u0", "()[[B", "[I", "t0", "()[I", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class l0 extends p {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final transient byte[][] segments;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final transient int[] directory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(@fg.l byte[][] bArr, @fg.l int[] iArr) {
        super(p.f85244f.o());
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("ᾮ"));
        kotlin.jvm.internal.l0.p(iArr, ProtectedSandApp.s("ᾯ"));
        this.segments = bArr;
        this.directory = iArr;
    }

    private final p v0() {
        return new p(n0());
    }

    private final Object w0() {
        p v02 = v0();
        if (v02 != null) {
            return v02;
        }
        throw new NullPointerException(ProtectedSandApp.s("ᾰ"));
    }

    @Override // okio.p
    public int A(@fg.l byte[] other, int fromIndex) {
        kotlin.jvm.internal.l0.p(other, ProtectedSandApp.s("ᾱ"));
        return v0().A(other, fromIndex);
    }

    @Override // okio.p
    @fg.l
    /* renamed from: E */
    public byte[] getData() {
        return n0();
    }

    @Override // okio.p
    public byte G(int pos) {
        j.e(this.directory[this.segments.length - 1], pos, 1L);
        int n4 = ve.e.n(this, pos);
        int i4 = n4 == 0 ? 0 : this.directory[n4 - 1];
        int[] iArr = this.directory;
        byte[][] bArr = this.segments;
        return bArr[n4][(pos - i4) + iArr[bArr.length + n4]];
    }

    @Override // okio.p
    public int M(@fg.l byte[] other, int fromIndex) {
        kotlin.jvm.internal.l0.p(other, ProtectedSandApp.s("ᾱ"));
        return v0().M(other, fromIndex);
    }

    @Override // okio.p
    public boolean U(int offset, @fg.l p other, int otherOffset, int byteCount) {
        kotlin.jvm.internal.l0.p(other, ProtectedSandApp.s("ᾱ"));
        if (offset < 0 || offset > q() - byteCount) {
            return false;
        }
        int i4 = byteCount + offset;
        int n4 = ve.e.n(this, offset);
        while (offset < i4) {
            int i5 = n4 == 0 ? 0 : this.directory[n4 - 1];
            int[] iArr = this.directory;
            int i6 = iArr[n4] - i5;
            int i7 = iArr[this.segments.length + n4];
            int min = Math.min(i4, i6 + i5) - offset;
            if (!other.V(otherOffset, this.segments[n4], (offset - i5) + i7, min)) {
                return false;
            }
            otherOffset += min;
            offset += min;
            n4++;
        }
        return true;
    }

    @Override // okio.p
    public boolean V(int offset, @fg.l byte[] other, int otherOffset, int byteCount) {
        kotlin.jvm.internal.l0.p(other, ProtectedSandApp.s("ᾱ"));
        if (offset < 0 || offset > q() - byteCount || otherOffset < 0 || otherOffset > other.length - byteCount) {
            return false;
        }
        int i4 = byteCount + offset;
        int n4 = ve.e.n(this, offset);
        while (offset < i4) {
            int i5 = n4 == 0 ? 0 : this.directory[n4 - 1];
            int[] iArr = this.directory;
            int i6 = iArr[n4] - i5;
            int i7 = iArr[this.segments.length + n4];
            int min = Math.min(i4, i6 + i5) - offset;
            if (!j.d(this.segments[n4], (offset - i5) + i7, other, otherOffset, min)) {
                return false;
            }
            otherOffset += min;
            offset += min;
            n4++;
        }
        return true;
    }

    @Override // okio.p
    @fg.l
    public ByteBuffer c() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(n0()).asReadOnlyBuffer();
        kotlin.jvm.internal.l0.o(asReadOnlyBuffer, ProtectedSandApp.s("ᾲ"));
        return asReadOnlyBuffer;
    }

    @Override // okio.p
    @fg.l
    public String d() {
        return v0().d();
    }

    @Override // okio.p
    @fg.l
    public String e() {
        return v0().e();
    }

    @Override // okio.p
    public boolean equals(@fg.m Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof p) {
            p pVar = (p) other;
            if (pVar.q() == q() && U(0, pVar, 0, q())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.p
    @fg.l
    public String g0(@fg.l Charset charset) {
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("ᾳ"));
        return v0().g0(charset);
    }

    @Override // okio.p
    public int hashCode() {
        int hashCode = getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = this.segments.length;
        int i4 = 0;
        int i5 = 1;
        int i6 = 0;
        while (i4 < length) {
            int[] iArr = this.directory;
            int i7 = iArr[length + i4];
            int i10 = iArr[i4];
            byte[] bArr = this.segments[i4];
            int i11 = (i10 - i6) + i7;
            while (i7 < i11) {
                i5 = (i5 * 31) + bArr[i7];
                i7++;
            }
            i4++;
            i6 = i10;
        }
        Y(i5);
        return i5;
    }

    @Override // okio.p
    @fg.l
    public p i(@fg.l String algorithm) {
        kotlin.jvm.internal.l0.p(algorithm, ProtectedSandApp.s("ᾴ"));
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = this.segments.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int[] iArr = this.directory;
            int i6 = iArr[length + i4];
            int i7 = iArr[i4];
            messageDigest.update(this.segments[i4], i6, i7 - i5);
            i4++;
            i5 = i7;
        }
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.l0.o(digest, ProtectedSandApp.s("\u1fb5"));
        return new p(digest);
    }

    @Override // okio.p
    @fg.l
    public p j0(int beginIndex, int endIndex) {
        if (!(beginIndex >= 0)) {
            throw new IllegalArgumentException(r2.a(ProtectedSandApp.s("Ᾱ"), beginIndex, ProtectedSandApp.s("Ὰ")).toString());
        }
        boolean z4 = endIndex <= q();
        String s4 = ProtectedSandApp.s("ᾶ");
        if (!z4) {
            StringBuilder a5 = androidx.collection.s.a(s4, endIndex, ProtectedSandApp.s("Ᾰ"));
            a5.append(q());
            a5.append(')');
            throw new IllegalArgumentException(a5.toString().toString());
        }
        int i4 = endIndex - beginIndex;
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(androidx.compose.foundation.text.q.a(s4, endIndex, ProtectedSandApp.s("ᾷ"), beginIndex).toString());
        }
        if (beginIndex == 0 && endIndex == q()) {
            return this;
        }
        if (beginIndex == endIndex) {
            return p.f85244f;
        }
        int n4 = ve.e.n(this, beginIndex);
        int n5 = ve.e.n(this, endIndex - 1);
        byte[][] bArr = (byte[][]) kotlin.collections.l.l1(this.segments, n4, n5 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (n4 <= n5) {
            int i5 = 0;
            int i6 = n4;
            while (true) {
                iArr[i5] = Math.min(this.directory[i6] - beginIndex, i4);
                int i7 = i5 + 1;
                iArr[i5 + bArr.length] = this.directory[this.segments.length + i6];
                if (i6 == n5) {
                    break;
                }
                i6++;
                i5 = i7;
            }
        }
        int i10 = n4 != 0 ? this.directory[n4 - 1] : 0;
        int length = bArr.length;
        iArr[length] = (beginIndex - i10) + iArr[length];
        return new l0(bArr, iArr);
    }

    @Override // okio.p
    @fg.l
    public p l0() {
        return v0().l0();
    }

    @Override // okio.p
    @fg.l
    public p m0() {
        return v0().m0();
    }

    @Override // okio.p
    @fg.l
    public byte[] n0() {
        byte[] bArr = new byte[q()];
        int length = this.segments.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            int[] iArr = this.directory;
            int i7 = iArr[length + i4];
            int i10 = iArr[i4];
            int i11 = i10 - i5;
            kotlin.collections.l.v0(this.segments[i4], bArr, i6, i7, i7 + i11);
            i6 += i11;
            i4++;
            i5 = i10;
        }
        return bArr;
    }

    @Override // okio.p
    public void p0(@fg.l OutputStream out) throws IOException {
        kotlin.jvm.internal.l0.p(out, ProtectedSandApp.s("Ά"));
        int length = this.segments.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int[] iArr = this.directory;
            int i6 = iArr[length + i4];
            int i7 = iArr[i4];
            out.write(this.segments[i4], i6, i7 - i5);
            i4++;
            i5 = i7;
        }
    }

    @Override // okio.p
    public int q() {
        return this.directory[this.segments.length - 1];
    }

    @Override // okio.p
    public void r0(@fg.l m buffer, int offset, int byteCount) {
        kotlin.jvm.internal.l0.p(buffer, ProtectedSandApp.s("ᾼ"));
        int i4 = byteCount + offset;
        int n4 = ve.e.n(this, offset);
        while (offset < i4) {
            int i5 = n4 == 0 ? 0 : this.directory[n4 - 1];
            int[] iArr = this.directory;
            int i6 = iArr[n4] - i5;
            int i7 = iArr[this.segments.length + n4];
            int min = Math.min(i4, i6 + i5) - offset;
            int i10 = (offset - i5) + i7;
            j0 j0Var = new j0(this.segments[n4], i10, i10 + min, true, false);
            j0 j0Var2 = buffer.head;
            if (j0Var2 == null) {
                j0Var.prev = j0Var;
                j0Var.next = j0Var;
                buffer.head = j0Var;
            } else {
                kotlin.jvm.internal.l0.m(j0Var2);
                j0 j0Var3 = j0Var2.prev;
                kotlin.jvm.internal.l0.m(j0Var3);
                j0Var3.c(j0Var);
            }
            offset += min;
            n4++;
        }
        buffer.Y(buffer.size() + q());
    }

    @Override // okio.p
    @fg.l
    public String s() {
        return v0().s();
    }

    @Override // okio.p
    @fg.l
    public p t(@fg.l String algorithm, @fg.l p key) {
        kotlin.jvm.internal.l0.p(algorithm, ProtectedSandApp.s("ᾴ"));
        kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("᾽"));
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.n0(), algorithm));
            int length = this.segments.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                int[] iArr = this.directory;
                int i6 = iArr[length + i4];
                int i7 = iArr[i4];
                mac.update(this.segments[i4], i6, i7 - i5);
                i4++;
                i5 = i7;
            }
            byte[] doFinal = mac.doFinal();
            kotlin.jvm.internal.l0.o(doFinal, ProtectedSandApp.s("ι"));
            return new p(doFinal);
        } catch (InvalidKeyException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    @fg.l
    /* renamed from: t0, reason: from getter */
    public final int[] getDirectory() {
        return this.directory;
    }

    @Override // okio.p
    @fg.l
    public String toString() {
        return v0().toString();
    }

    @fg.l
    /* renamed from: u0, reason: from getter */
    public final byte[][] getSegments() {
        return this.segments;
    }
}

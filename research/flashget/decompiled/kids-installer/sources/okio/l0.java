package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001e0:\u0012\u0006\u0010E\u001a\u00020@¢\u0006\u0004\bF\u0010GJ\b\u0010\u0002\u001a\u00020\u0001H\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0001H\u0016J\b\u0010\f\u001a\u00020\u0001H\u0016J\u0017\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\u0018\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020 H\u0016J\u0010\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0016J'\u0010*\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0014H\u0010¢\u0006\u0004\b*\u0010+J(\u0010/\u001a\u00020.2\u0006\u0010(\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00012\u0006\u0010-\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0014H\u0016J(\u00100\u001a\u00020.2\u0006\u0010(\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0014H\u0016J\u0018\u00102\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u0014H\u0016J\u0018\u00103\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u0014H\u0016J\u000f\u00104\u001a\u00020\u001eH\u0010¢\u0006\u0004\b4\u00105J\u0013\u00107\u001a\u00020.2\b\u0010,\u001a\u0004\u0018\u000106H\u0096\u0002J\b\u00108\u001a\u00020\u0014H\u0016J\b\u00109\u001a\u00020\u0007H\u0016R \u0010?\u001a\b\u0012\u0004\u0012\u00020\u001e0:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010E\u001a\u00020@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D¨\u0006H"}, d2 = {"Lokio/l0;", "Lokio/p;", "z0", "Ljava/lang/Object;", "A0", "Ljava/nio/charset/Charset;", "charset", "", "l0", "l", "C", "q0", "r0", "algorithm", "s", "(Ljava/lang/String;)Lokio/p;", "key", "D", "(Ljava/lang/String;Lokio/p;)Lokio/p;", "o", "", "beginIndex", "endIndex", "o0", "pos", "", "O", "(I)B", "A", "()I", "", "s0", "Ljava/nio/ByteBuffer;", "j", "Ljava/io/OutputStream;", "out", "Lkotlin/m2;", "u0", "Lokio/m;", "buffer", "offset", "byteCount", "v0", "(Lokio/m;II)V", "other", "otherOffset", "", "Z", "a0", "fromIndex", "K", "S", "N", "()[B", "", "equals", "hashCode", "toString", "", "u", "[[B", "y0", "()[[B", "segments", "", "v", "[I", "x0", "()[I", "directory", "<init>", "([[B[I)V", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class l0 extends p {

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final transient byte[][] segments;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final transient int[] directory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(@d5.d byte[][] bArr, @d5.d int[] iArr) {
        super(p.f31688s.getData());
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("錃"));
        kotlin.jvm.internal.l0.p(iArr, ProtectedSandApp.s("錄"));
        this.segments = bArr;
        this.directory = iArr;
    }

    private final Object A0() {
        p z02 = z0();
        if (z02 != null) {
            return z02;
        }
        throw new NullPointerException(ProtectedSandApp.s("錅"));
    }

    private final p z0() {
        return new p(s0());
    }

    @Override // okio.p
    public int A() {
        return this.directory[this.segments.length - 1];
    }

    @Override // okio.p
    @d5.d
    public String C() {
        return z0().C();
    }

    @Override // okio.p
    @d5.d
    public p D(@d5.d String algorithm, @d5.d p key) {
        kotlin.jvm.internal.l0.p(algorithm, ProtectedSandApp.s("錆"));
        kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("錇"));
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.s0(), algorithm));
            int length = this.segments.length;
            int i5 = 0;
            int i6 = 0;
            while (i5 < length) {
                int[] iArr = this.directory;
                int i7 = iArr[length + i5];
                int i8 = iArr[i5];
                mac.update(this.segments[i5], i7, i8 - i6);
                i5++;
                i6 = i8;
            }
            byte[] doFinal = mac.doFinal();
            kotlin.jvm.internal.l0.o(doFinal, ProtectedSandApp.s("錈"));
            return new p(doFinal);
        } catch (InvalidKeyException e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    @Override // okio.p
    public int K(@d5.d byte[] other, int fromIndex) {
        kotlin.jvm.internal.l0.p(other, ProtectedSandApp.s("錉"));
        return z0().K(other, fromIndex);
    }

    @Override // okio.p
    @d5.d
    public byte[] N() {
        return s0();
    }

    @Override // okio.p
    public byte O(int pos) {
        j.e(this.directory[this.segments.length - 1], pos, 1L);
        int n5 = v4.e.n(this, pos);
        int i5 = n5 == 0 ? 0 : this.directory[n5 - 1];
        int[] iArr = this.directory;
        byte[][] bArr = this.segments;
        return bArr[n5][(pos - i5) + iArr[bArr.length + n5]];
    }

    @Override // okio.p
    public int S(@d5.d byte[] other, int fromIndex) {
        kotlin.jvm.internal.l0.p(other, ProtectedSandApp.s("錊"));
        return z0().S(other, fromIndex);
    }

    @Override // okio.p
    public boolean Z(int offset, @d5.d p other, int otherOffset, int byteCount) {
        kotlin.jvm.internal.l0.p(other, ProtectedSandApp.s("錋"));
        if (offset < 0 || offset > A() - byteCount) {
            return false;
        }
        int i5 = byteCount + offset;
        int n5 = v4.e.n(this, offset);
        while (offset < i5) {
            int i6 = n5 == 0 ? 0 : this.directory[n5 - 1];
            int[] iArr = this.directory;
            int i7 = iArr[n5] - i6;
            int i8 = iArr[this.segments.length + n5];
            int min = Math.min(i5, i7 + i6) - offset;
            if (!other.a0(otherOffset, this.segments[n5], (offset - i6) + i8, min)) {
                return false;
            }
            otherOffset += min;
            offset += min;
            n5++;
        }
        return true;
    }

    @Override // okio.p
    public boolean a0(int offset, @d5.d byte[] other, int otherOffset, int byteCount) {
        kotlin.jvm.internal.l0.p(other, ProtectedSandApp.s("錌"));
        if (offset < 0 || offset > A() - byteCount || otherOffset < 0 || otherOffset > other.length - byteCount) {
            return false;
        }
        int i5 = byteCount + offset;
        int n5 = v4.e.n(this, offset);
        while (offset < i5) {
            int i6 = n5 == 0 ? 0 : this.directory[n5 - 1];
            int[] iArr = this.directory;
            int i7 = iArr[n5] - i6;
            int i8 = iArr[this.segments.length + n5];
            int min = Math.min(i5, i7 + i6) - offset;
            if (!j.d(this.segments[n5], (offset - i6) + i8, other, otherOffset, min)) {
                return false;
            }
            otherOffset += min;
            offset += min;
            n5++;
        }
        return true;
    }

    @Override // okio.p
    public boolean equals(@d5.e Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof p) {
            p pVar = (p) other;
            if (pVar.i0() == A() && Z(0, pVar, 0, A())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.p
    public int hashCode() {
        int hashCode = getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = this.segments.length;
        int i5 = 0;
        int i6 = 1;
        int i7 = 0;
        while (i5 < length) {
            int[] iArr = this.directory;
            int i8 = iArr[length + i5];
            int i9 = iArr[i5];
            byte[] bArr = this.segments[i5];
            int i10 = (i9 - i7) + i8;
            while (i8 < i10) {
                i6 = (i6 * 31) + bArr[i8];
                i8++;
            }
            i5++;
            i7 = i9;
        }
        d0(i6);
        return i6;
    }

    @Override // okio.p
    @d5.d
    public ByteBuffer j() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(s0()).asReadOnlyBuffer();
        kotlin.jvm.internal.l0.o(asReadOnlyBuffer, ProtectedSandApp.s("錍"));
        return asReadOnlyBuffer;
    }

    @Override // okio.p
    @d5.d
    public String l() {
        return z0().l();
    }

    @Override // okio.p
    @d5.d
    public String l0(@d5.d Charset charset) {
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("錎"));
        return z0().l0(charset);
    }

    @Override // okio.p
    @d5.d
    public String o() {
        return z0().o();
    }

    @Override // okio.p
    @d5.d
    public p o0(int beginIndex, int endIndex) {
        Object[] l12;
        if (!(beginIndex >= 0)) {
            throw new IllegalArgumentException(androidx.constraintlayout.solver.f.a(ProtectedSandApp.s("錒"), beginIndex, ProtectedSandApp.s("錓")).toString());
        }
        boolean z5 = endIndex <= A();
        String s5 = ProtectedSandApp.s("錏");
        if (!z5) {
            StringBuilder a6 = androidx.core.app.x.a(s5, endIndex, ProtectedSandApp.s("錑"));
            a6.append(A());
            a6.append(')');
            throw new IllegalArgumentException(a6.toString().toString());
        }
        int i5 = endIndex - beginIndex;
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(android.content.preferences.protobuf.v.a(s5, endIndex, ProtectedSandApp.s("錐"), beginIndex).toString());
        }
        if (beginIndex == 0 && endIndex == A()) {
            return this;
        }
        if (beginIndex == endIndex) {
            return p.f31688s;
        }
        int n5 = v4.e.n(this, beginIndex);
        int n6 = v4.e.n(this, endIndex - 1);
        l12 = kotlin.collections.p.l1(this.segments, n5, n6 + 1);
        byte[][] bArr = (byte[][]) l12;
        int[] iArr = new int[bArr.length * 2];
        if (n5 <= n6) {
            int i6 = 0;
            int i7 = n5;
            while (true) {
                iArr[i6] = Math.min(this.directory[i7] - beginIndex, i5);
                int i8 = i6 + 1;
                iArr[i6 + bArr.length] = this.directory[this.segments.length + i7];
                if (i7 == n6) {
                    break;
                }
                i7++;
                i6 = i8;
            }
        }
        int i9 = n5 != 0 ? this.directory[n5 - 1] : 0;
        int length = bArr.length;
        iArr[length] = (beginIndex - i9) + iArr[length];
        return new l0(bArr, iArr);
    }

    @Override // okio.p
    @d5.d
    public p q0() {
        return z0().q0();
    }

    @Override // okio.p
    @d5.d
    public p r0() {
        return z0().r0();
    }

    @Override // okio.p
    @d5.d
    public p s(@d5.d String algorithm) {
        kotlin.jvm.internal.l0.p(algorithm, ProtectedSandApp.s("錔"));
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = this.segments.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int[] iArr = this.directory;
            int i7 = iArr[length + i5];
            int i8 = iArr[i5];
            messageDigest.update(this.segments[i5], i7, i8 - i6);
            i5++;
            i6 = i8;
        }
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.l0.o(digest, ProtectedSandApp.s("錕"));
        return new p(digest);
    }

    @Override // okio.p
    @d5.d
    public byte[] s0() {
        byte[] bArr = new byte[A()];
        int length = this.segments.length;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < length) {
            int[] iArr = this.directory;
            int i8 = iArr[length + i5];
            int i9 = iArr[i5];
            int i10 = i9 - i6;
            kotlin.collections.p.v0(this.segments[i5], bArr, i7, i8, i8 + i10);
            i7 += i10;
            i5++;
            i6 = i9;
        }
        return bArr;
    }

    @Override // okio.p
    @d5.d
    public String toString() {
        return z0().toString();
    }

    @Override // okio.p
    public void u0(@d5.d OutputStream outputStream) throws IOException {
        kotlin.jvm.internal.l0.p(outputStream, ProtectedSandApp.s("錖"));
        int length = this.segments.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int[] iArr = this.directory;
            int i7 = iArr[length + i5];
            int i8 = iArr[i5];
            outputStream.write(this.segments[i5], i7, i8 - i6);
            i5++;
            i6 = i8;
        }
    }

    @Override // okio.p
    public void v0(@d5.d m buffer, int offset, int byteCount) {
        kotlin.jvm.internal.l0.p(buffer, ProtectedSandApp.s("錗"));
        int i5 = byteCount + offset;
        int n5 = v4.e.n(this, offset);
        while (offset < i5) {
            int i6 = n5 == 0 ? 0 : this.directory[n5 - 1];
            int[] iArr = this.directory;
            int i7 = iArr[n5] - i6;
            int i8 = iArr[this.segments.length + n5];
            int min = Math.min(i5, i7 + i6) - offset;
            int i9 = (offset - i6) + i8;
            j0 j0Var = new j0(this.segments[n5], i9, i9 + min, true, false);
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
            n5++;
        }
        buffer.M0(buffer.size() + A());
    }

    @d5.d
    /* renamed from: x0, reason: from getter */
    public final int[] getDirectory() {
        return this.directory;
    }

    @d5.d
    /* renamed from: y0, reason: from getter */
    public final byte[][] getSegments() {
        return this.segments;
    }
}

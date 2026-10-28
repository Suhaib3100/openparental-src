package org.apache.http.util;

import androidx.collection.n1;
import androidx.collection.s;
import java.io.Serializable;
import org.apache.http.annotation.NotThreadSafe;

@NotThreadSafe
/* loaded from: classes3.dex */
public final class ByteArrayBuffer implements Serializable {
    private static final long serialVersionUID = 4359112959524048036L;
    private byte[] buffer;
    private int len;

    public ByteArrayBuffer(int i4) {
        Args.notNegative(i4, "Buffer capacity");
        this.buffer = new byte[i4];
    }

    private void expand(int i4) {
        byte[] bArr = new byte[Math.max(this.buffer.length << 1, i4)];
        System.arraycopy(this.buffer, 0, bArr, 0, this.len);
        this.buffer = bArr;
    }

    public void append(byte[] bArr, int i4, int i5) {
        int i6;
        if (bArr == null) {
            return;
        }
        if (i4 < 0 || i4 > bArr.length || i5 < 0 || (i6 = i4 + i5) < 0 || i6 > bArr.length) {
            StringBuilder a5 = n1.a("off: ", i4, " len: ", i5, " b.length: ");
            a5.append(bArr.length);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        if (i5 == 0) {
            return;
        }
        int i7 = this.len + i5;
        if (i7 > this.buffer.length) {
            expand(i7);
        }
        System.arraycopy(bArr, i4, this.buffer, this.len, i5);
        this.len = i7;
    }

    public byte[] buffer() {
        return this.buffer;
    }

    public int byteAt(int i4) {
        return this.buffer[i4];
    }

    public int capacity() {
        return this.buffer.length;
    }

    public void clear() {
        this.len = 0;
    }

    public void ensureCapacity(int i4) {
        if (i4 <= 0) {
            return;
        }
        int length = this.buffer.length;
        int i5 = this.len;
        if (i4 > length - i5) {
            expand(i5 + i4);
        }
    }

    public int indexOf(byte b5, int i4, int i5) {
        if (i4 < 0) {
            i4 = 0;
        }
        int i6 = this.len;
        if (i5 > i6) {
            i5 = i6;
        }
        if (i4 > i5) {
            return -1;
        }
        while (i4 < i5) {
            if (this.buffer[i4] == b5) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.len == 0;
    }

    public boolean isFull() {
        return this.len == this.buffer.length;
    }

    public int length() {
        return this.len;
    }

    public void setLength(int i4) {
        if (i4 >= 0 && i4 <= this.buffer.length) {
            this.len = i4;
        } else {
            StringBuilder a5 = s.a("len: ", i4, " < 0 or > buffer len: ");
            a5.append(this.buffer.length);
            throw new IndexOutOfBoundsException(a5.toString());
        }
    }

    public byte[] toByteArray() {
        int i4 = this.len;
        byte[] bArr = new byte[i4];
        if (i4 > 0) {
            System.arraycopy(this.buffer, 0, bArr, 0, i4);
        }
        return bArr;
    }

    public int indexOf(byte b5) {
        return indexOf(b5, 0, this.len);
    }

    public void append(int i4) {
        int i5 = this.len + 1;
        if (i5 > this.buffer.length) {
            expand(i5);
        }
        this.buffer[this.len] = (byte) i4;
        this.len = i5;
    }

    public void append(char[] cArr, int i4, int i5) {
        int i6;
        if (cArr == null) {
            return;
        }
        if (i4 < 0 || i4 > cArr.length || i5 < 0 || (i6 = i4 + i5) < 0 || i6 > cArr.length) {
            StringBuilder a5 = n1.a("off: ", i4, " len: ", i5, " b.length: ");
            a5.append(cArr.length);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        if (i5 == 0) {
            return;
        }
        int i7 = this.len;
        int i10 = i5 + i7;
        if (i10 > this.buffer.length) {
            expand(i10);
        }
        while (i7 < i10) {
            this.buffer[i7] = (byte) cArr[i4];
            i4++;
            i7++;
        }
        this.len = i10;
    }

    public void append(CharArrayBuffer charArrayBuffer, int i4, int i5) {
        if (charArrayBuffer == null) {
            return;
        }
        append(charArrayBuffer.buffer(), i4, i5);
    }
}

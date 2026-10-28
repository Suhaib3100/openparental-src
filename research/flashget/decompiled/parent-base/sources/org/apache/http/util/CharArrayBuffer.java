package org.apache.http.util;

import android.support.v4.media.a;
import androidx.collection.n1;
import androidx.collection.s;
import androidx.compose.foundation.text.q;
import java.io.Serializable;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.protocol.HTTP;

@NotThreadSafe
/* loaded from: classes3.dex */
public final class CharArrayBuffer implements Serializable {
    private static final long serialVersionUID = -6208952725094867135L;
    private char[] buffer;
    private int len;

    public CharArrayBuffer(int i4) {
        Args.notNegative(i4, "Buffer capacity");
        this.buffer = new char[i4];
    }

    private void expand(int i4) {
        char[] cArr = new char[Math.max(this.buffer.length << 1, i4)];
        System.arraycopy(this.buffer, 0, cArr, 0, this.len);
        this.buffer = cArr;
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
        int i7 = this.len + i5;
        if (i7 > this.buffer.length) {
            expand(i7);
        }
        System.arraycopy(cArr, i4, this.buffer, this.len, i5);
        this.len = i7;
    }

    public char[] buffer() {
        return this.buffer;
    }

    public int capacity() {
        return this.buffer.length;
    }

    public char charAt(int i4) {
        return this.buffer[i4];
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

    public int indexOf(int i4, int i5, int i6) {
        if (i5 < 0) {
            i5 = 0;
        }
        int i7 = this.len;
        if (i6 > i7) {
            i6 = i7;
        }
        if (i5 > i6) {
            return -1;
        }
        while (i5 < i6) {
            if (this.buffer[i5] == i4) {
                return i5;
            }
            i5++;
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

    public String substring(int i4, int i5) {
        return new String(this.buffer, i4, i5 - i4);
    }

    public String substringTrimmed(int i4, int i5) {
        if (i4 < 0) {
            throw new IndexOutOfBoundsException(a.a("Negative beginIndex: ", i4));
        }
        if (i5 > this.len) {
            StringBuilder a5 = s.a("endIndex: ", i5, " > length: ");
            a5.append(this.len);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        if (i4 > i5) {
            throw new IndexOutOfBoundsException(q.a("beginIndex: ", i4, " > endIndex: ", i5));
        }
        while (i4 < i5 && HTTP.isWhitespace(this.buffer[i4])) {
            i4++;
        }
        while (i5 > i4 && HTTP.isWhitespace(this.buffer[i5 - 1])) {
            i5--;
        }
        return new String(this.buffer, i4, i5 - i4);
    }

    public char[] toCharArray() {
        int i4 = this.len;
        char[] cArr = new char[i4];
        if (i4 > 0) {
            System.arraycopy(this.buffer, 0, cArr, 0, i4);
        }
        return cArr;
    }

    public String toString() {
        return new String(this.buffer, 0, this.len);
    }

    public int indexOf(int i4) {
        return indexOf(i4, 0, this.len);
    }

    public void append(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i4 = this.len + length;
        if (i4 > this.buffer.length) {
            expand(i4);
        }
        str.getChars(0, length, this.buffer, this.len);
        this.len = i4;
    }

    public void append(CharArrayBuffer charArrayBuffer, int i4, int i5) {
        if (charArrayBuffer == null) {
            return;
        }
        append(charArrayBuffer.buffer, i4, i5);
    }

    public void append(CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer == null) {
            return;
        }
        append(charArrayBuffer.buffer, 0, charArrayBuffer.len);
    }

    public void append(char c5) {
        int i4 = this.len + 1;
        if (i4 > this.buffer.length) {
            expand(i4);
        }
        this.buffer[this.len] = c5;
        this.len = i4;
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
        int i7 = this.len;
        int i10 = i5 + i7;
        if (i10 > this.buffer.length) {
            expand(i10);
        }
        while (i7 < i10) {
            this.buffer[i7] = (char) (bArr[i4] & 255);
            i4++;
            i7++;
        }
        this.len = i10;
    }

    public void append(ByteArrayBuffer byteArrayBuffer, int i4, int i5) {
        if (byteArrayBuffer == null) {
            return;
        }
        append(byteArrayBuffer.buffer(), i4, i5);
    }

    public void append(Object obj) {
        append(String.valueOf(obj));
    }
}

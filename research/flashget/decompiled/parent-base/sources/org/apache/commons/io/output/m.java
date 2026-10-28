package org.apache.commons.io.output;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/* compiled from: ProxyWriter.java */
/* loaded from: classes4.dex */
public class m extends FilterWriter {
    public m(Writer writer) {
        super(writer);
    }

    protected void a(int i4) throws IOException {
    }

    protected void b(int i4) throws IOException {
    }

    protected void c(IOException iOException) throws IOException {
        throw iOException;
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            ((FilterWriter) this).out.close();
        } catch (IOException e4) {
            c(e4);
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        try {
            ((FilterWriter) this).out.flush();
        } catch (IOException e4) {
            c(e4);
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(int i4) throws IOException {
        try {
            b(1);
            ((FilterWriter) this).out.write(i4);
            a(1);
        } catch (IOException e4) {
            c(e4);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c5) throws IOException {
        try {
            b(1);
            ((FilterWriter) this).out.append(c5);
            a(1);
        } catch (IOException e4) {
            c(e4);
        }
        return this;
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        int length;
        if (cArr != null) {
            try {
                length = cArr.length;
            } catch (IOException e4) {
                c(e4);
                return;
            }
        } else {
            length = 0;
        }
        b(length);
        ((FilterWriter) this).out.write(cArr);
        a(length);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i4, int i5) throws IOException {
        int i6 = i5 - i4;
        try {
            b(i6);
            ((FilterWriter) this).out.append(charSequence, i4, i5);
            a(i6);
        } catch (IOException e4) {
            c(e4);
        }
        return this;
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i4, int i5) throws IOException {
        try {
            b(i5);
            ((FilterWriter) this).out.write(cArr, i4, i5);
            a(i5);
        } catch (IOException e4) {
            c(e4);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws IOException {
        int length;
        if (charSequence != null) {
            try {
                length = charSequence.length();
            } catch (IOException e4) {
                c(e4);
            }
        } else {
            length = 0;
        }
        b(length);
        ((FilterWriter) this).out.append(charSequence);
        a(length);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        int length;
        if (str != null) {
            try {
                length = str.length();
            } catch (IOException e4) {
                c(e4);
                return;
            }
        } else {
            length = 0;
        }
        b(length);
        ((FilterWriter) this).out.write(str);
        a(length);
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(String str, int i4, int i5) throws IOException {
        try {
            b(i5);
            ((FilterWriter) this).out.write(str, i4, i5);
            a(i5);
        } catch (IOException e4) {
            c(e4);
        }
    }
}

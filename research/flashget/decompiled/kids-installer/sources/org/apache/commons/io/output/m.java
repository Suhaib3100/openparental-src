package org.apache.commons.io.output;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/* compiled from: ProxyWriter.java */
/* loaded from: classes5.dex */
public class m extends FilterWriter {
    public m(Writer writer) {
        super(writer);
    }

    protected void a(int i5) throws IOException {
    }

    protected void b(int i5) throws IOException {
    }

    protected void c(IOException iOException) throws IOException {
        throw iOException;
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            ((FilterWriter) this).out.close();
        } catch (IOException e6) {
            c(e6);
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        try {
            ((FilterWriter) this).out.flush();
        } catch (IOException e6) {
            c(e6);
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(int i5) throws IOException {
        try {
            b(1);
            ((FilterWriter) this).out.write(i5);
            a(1);
        } catch (IOException e6) {
            c(e6);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c6) throws IOException {
        try {
            b(1);
            ((FilterWriter) this).out.append(c6);
            a(1);
        } catch (IOException e6) {
            c(e6);
        }
        return this;
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        int length;
        if (cArr != null) {
            try {
                length = cArr.length;
            } catch (IOException e6) {
                c(e6);
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
    public Writer append(CharSequence charSequence, int i5, int i6) throws IOException {
        int i7 = i6 - i5;
        try {
            b(i7);
            ((FilterWriter) this).out.append(charSequence, i5, i6);
            a(i7);
        } catch (IOException e6) {
            c(e6);
        }
        return this;
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i5, int i6) throws IOException {
        try {
            b(i6);
            ((FilterWriter) this).out.write(cArr, i5, i6);
            a(i6);
        } catch (IOException e6) {
            c(e6);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws IOException {
        int length;
        if (charSequence != null) {
            try {
                length = charSequence.length();
            } catch (IOException e6) {
                c(e6);
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
            } catch (IOException e6) {
                c(e6);
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
    public void write(String str, int i5, int i6) throws IOException {
        try {
            b(i6);
            ((FilterWriter) this).out.write(str, i5, i6);
            a(i6);
        } catch (IOException e6) {
            c(e6);
        }
    }
}
